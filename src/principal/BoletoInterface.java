package principal;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;



public interface BoletoInterface {
	@GET("Boleto/{id}")
	Call<Boleto> getBoleto (@Path("id") int id);

}
