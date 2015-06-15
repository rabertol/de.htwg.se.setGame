package de.htwg.se.setgame.util.persistence.couchdb;

import de.htwg.se.setgame.model.IGame;
import de.htwg.se.setgame.util.persistence.IGameDao;
import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.DocumentNotFoundException;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbConnector;
import org.ektorp.impl.StdCouchDbInstance;

public class GameDao implements IGameDao {

	private CouchDbConnector db;
	private Mapper mapper;

    public GameDao() {


        this.mapper = new Mapper();
        HttpClient httpClient = new StdHttpClient.Builder()
				.host("lenny2.in.htwg-konstanz.de").port(5984).build();

		CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);
		db = new StdCouchDbConnector("setgame", dbInstance);
		db.createDatabaseIfNotExists();


    }

	@Override
	public void createOrUpdateGame(IGame game) {
		PersistentGame persistentGame = mapper.getPersistentGame(game);
		db.create(persistentGame);
	}

	@Override
	public IGame findGame(String id) {
		try {
			PersistentGame persistentGame = db.get(PersistentGame.class, id);
			IGame game = mapper.getGame(persistentGame);
			return game;
        } catch (DocumentNotFoundException e) {
        	return null;
        }
	}

	@Override
	public void closeDb() {
		// nothing to do here
		return;
	}

}
