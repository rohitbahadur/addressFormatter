package addressFormatterTest;

import org.testng.annotations.Test;

import addressFormatterCore.FormattedAddress;

public class ProcessingAddressesFromAnExternalSourceTest {

	@Test
	public void it_should_work_for_simple_DE_addresses() {
		assert (FormattedAddress.getFormattedAddressof("Winterallee 3")).equals("{\"street\": \"Winterallee\", \"housenumber\": \"3\"}");
	}

	@Test
	public void it_should_work_for_simple_DE_addresses_with_longer_street_numbers() {
		assert (FormattedAddress.getFormattedAddressof("Musterstrasse 45"))
				.equals("{\"street\": \"Musterstrasse\", \"housenumber\": \"45\"}");
	}

	@Test
	public void it_should_work_for_simple_DE_addresses_with_alphanumberical_street_numbers() {
		assert (FormattedAddress.getFormattedAddressof("Blaufeldweg 123B"))
				.equals("{\"street\": \"Blaufeldweg\", \"housenumber\": \"123B\"}");
	}

	@Test
	public void it_should_work_for_simple_addresses_with_german_characters() {
		assert (FormattedAddress.getFormattedAddressof("Am B�chle 23")).equals("{\"street\": \"Am B�chle\", \"housenumber\": \"23\"}");
	}

	@Test
	public void it_should_work_for_simple_DE_addresses_with_alphanumberical_street_numbers2() {
		assert (FormattedAddress.getFormattedAddressof("Auf der Vogelwiese 23 b"))
				.equals("{\"street\": \"Auf der Vogelwiese\", \"housenumber\": \"23 b\"}");
	}

	@Test
	public void it_should_work_for_simple_FR_addresses() {
		assert (FormattedAddress.getFormattedAddressof("4444, rue de la revolution"))
				.equals("{\"street\": \"rue de la revolution\", \"housenumber\": \"4444\"}");
	}

	@Test
	public void it_should_work_for_simple_US_addresses() {
		assert (FormattedAddress.getFormattedAddressof("200 Broadway Av"))
				.equals("{\"street\": \"Broadway Av\", \"housenumber\": \"200\"}");
	}

	@Test
	public void it_should_work_for_simple_ES_addresses() {
		assert (FormattedAddress.getFormattedAddressof("Calle Aduana, 29"))
				.equals("{\"street\": \"Calle Aduana\", \"housenumber\": \"29\"}");
	}

	@Test
	public void it_should_work_for_ES_addresses_with_NO() {
		assert (FormattedAddress.getFormattedAddressof("Calle 39 No 1540"))
				.equals("{\"street\": \"Calle 39\", \"housenumber\": \"No 1540\"}");
	}

}
