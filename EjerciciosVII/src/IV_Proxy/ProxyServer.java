package IV_Proxy;
//Can make it like a singleton with the constructor and instance at the request and no constructor, request receives the parameter
public class ProxyServer implements ISubject{
	private RealServer server;
	private BackupServer buServer;
	
	public ProxyServer () {
		server = new RealServer();
		buServer = new BackupServer();
	}
	
	@Override
	public void carga(File type) {
		System.out.println("Upload Requested: ");
		switch(type) {
		case Zip:
			server.carga(File.Zip);
			buServer.carga(File.Zip);
			
			break;
		case Rar:
			server.carga(File.Rar);
			buServer.carga(File.Rar);
			break;
		default:
			System.out.println("Invalid file type");
			break;
		}
		
	}
	
	@Override
	public void descarga() {
		System.out.println("Download requested: ");
		server.descarga();	
	}
	
}
