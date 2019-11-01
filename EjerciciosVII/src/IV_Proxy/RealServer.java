package IV_Proxy;

public class RealServer implements ISubject{
	
	@Override
	public void carga(File type) {
		System.out.println("Uploading...\n");
		
	}
	@Override
	public void descarga() {
		System.out.println("Downloading...\n");
		
	}
}
