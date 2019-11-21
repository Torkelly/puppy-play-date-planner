package ppdapp.repository;
import org.springframework.data.repository.CrudRepository;

import ppdapp.beans.ConfirmationToken;

public interface ConfirmationTokenRepository extends CrudRepository<ConfirmationToken, String> {
	ConfirmationToken findByConfirmationToken(String confirmationToken);

}
