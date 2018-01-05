package appsuite.client;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

//import org.apache.commons.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

//import com.cc.app.registration.model.User;

public class ItemsRestClient {

	// public static final String REST_SERVICE_URI =
	// "http://localhost:8080/SecureRESTApiWithBasicAuthentication";
	public static final String REST_SERVICE_URI = "http://localhost:8080/items";

	/*
	 * �* Add HTTP Authorization header, using Basic-Authentication to send
	 * user-credentials. �
	 */
	private static HttpHeaders getHeaders() {
		String plainCredentials = "bill:abc123";
		// String base64Credentials = new
		// String(Base64.encodeBase64(plainCredentials.getBytes()));
		String base64Credentials = null;
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Basic " + base64Credentials);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		return headers;
	}

	/*
	 * �* Send a GET request to get list of all users. �
	 */
	@SuppressWarnings("unchecked")
	private static void listAllUsers() {
		System.out.println("\nTesting listAllUsers API-----------");
		RestTemplate restTemplate = new RestTemplate();

		HttpEntity<String> request = new HttpEntity<String>(getHeaders());
		ResponseEntity<List> response = restTemplate.exchange(REST_SERVICE_URI + "/", HttpMethod.GET, request,
				List.class);
		List<LinkedHashMap<String, Object>> usersMap = (List<LinkedHashMap<String, Object>>) response.getBody();

		if (usersMap != null) {
			for (LinkedHashMap<String, Object> map : usersMap) {
				System.out.println("User : id=" + map.get("item_id") + ", Name=" + map.get("item_sku") + ", Age="
						+ map.get("reorderQuantity") + ", Salary=" + map.get("reorderQuantity"));
				;
			}
		} else {
			System.out.println("No user exist----------");
		}
	}

	/*
	 * �* Send a GET request to get a specific user. �
	 */
	/*
	 * private static void getUser() {
	 * System.out.println("\nTesting getUser API----------"); RestTemplate
	 * restTemplate = new RestTemplate(); HttpEntity<String> request = new
	 * HttpEntity<String>(getHeaders()); ResponseEntity<User> response =
	 * restTemplate.exchange(REST_SERVICE_URI + "/user/1", HttpMethod.GET,
	 * request, User.class); User user = response.getBody();
	 * System.out.println(user); }
	 */

	/*
	 * �* Send a POST request to create a new user. �
	 */
	/*
	 * private static void createUser() {
	 * System.out.println("\nTesting create User API----------"); RestTemplate
	 * restTemplate = new RestTemplate(); User user = new User(0, "Sarah", 51,
	 * 134); HttpEntity<Object> request = new HttpEntity<Object>(user,
	 * getHeaders()); URI uri = restTemplate.postForLocation(REST_SERVICE_URI +
	 * "/user/", request, User.class); System.out.println("Location : " +
	 * uri.toASCIIString()); }
	 */

	/*
	 * �* Send a PUT request to update an existing user. �
	 */
	/*
	 * private static void updateUser() {
	 * System.out.println("\nTesting update User API----------"); RestTemplate
	 * restTemplate = new RestTemplate(); User user = new User(1, "Tomy", 33,
	 * 70000); HttpEntity<Object> request = new HttpEntity<Object>(user,
	 * getHeaders()); ResponseEntity<User> response =
	 * restTemplate.exchange(REST_SERVICE_URI + "/user/1", HttpMethod.POST,
	 * request, User.class); System.out.println(response.getBody()); }
	 */

	/*
	 * �* Send a DELETE request to delete a specific user. �
	 */
	/*
	 * private static void deleteUser() {
	 * System.out.println("\nTesting delete User API----------"); RestTemplate
	 * restTemplate = new RestTemplate(); HttpEntity<String> request = new
	 * HttpEntity<String>(getHeaders()); restTemplate.exchange(REST_SERVICE_URI
	 * + "/user/3", HttpMethod.DELETE, request, User.class); }
	 */

	/*
	 * �* Send a DELETE request to delete all users. �
	 */
	/*
	 * private static void deleteAllUsers() {
	 * System.out.println("\nTesting all delete Users API----------");
	 * RestTemplate restTemplate = new RestTemplate(); HttpEntity<String>
	 * request = new HttpEntity<String>(getHeaders());
	 * restTemplate.exchange(REST_SERVICE_URI + "/user/", HttpMethod.DELETE,
	 * request, User.class); }
	 */

	public static void some(String args[]) {

		listAllUsers();

		// getUser();

		// createUser();
		listAllUsers();

		// updateUser();
		listAllUsers();

		// deleteUser();
		listAllUsers();

		// deleteAllUsers();
		listAllUsers();
	}
}