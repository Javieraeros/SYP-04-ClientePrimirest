package principal;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import okhttp3.Headers;


public class BoletoCallback implements Callback<Boleto>{

	@Override
	public void onFailure(Call<Boleto> arg0, Throwable arg1) {
		int i;
		
		i=0;
		
		
		
	}

	@Override
	public void onResponse(Call<Boleto> arg0, Response<Boleto> resp) {
		
	Boleto boleto;
	String contentType;
	int code;
	String message;
	boolean isSuccesful;
	
	boleto = resp.body();
	
	Headers cabeceras = resp.headers();
	contentType = cabeceras.get("Content-Type");
	code = resp.code();
	message = resp.message();
	isSuccesful = resp.isSuccessful();
	
	System.out.println(boleto.getIdBoleto()+" "+boleto.getIdSorteo()+" "+boleto.getReintegro()+" "+
	boleto.getTipoApuesta()+" "+boleto.getPremio());

    

		
	}
	

}
