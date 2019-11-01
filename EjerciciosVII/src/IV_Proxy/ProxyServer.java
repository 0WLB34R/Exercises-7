package IV_Proxy;
//Can make it like a singleton with the constructor and instance at the request and no constructor, request receives the parameter
public class ProxyServer implements ISubject{
	private RealServer server;
	
	public ProxyServer () {
		server = new RealServer();
	}
	
	@Override
	public void carga(File type) {
		System.out.println("Upload Requested: ");
		switch(type) {
		case Zip:
			System.out.println("Valid type...creating backup");
			server.carga(File.Zip);
			break;
		case Rar:
			System.out.println("Valid type...creating backup");
			server.carga(File.Rar);
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
