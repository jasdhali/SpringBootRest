//package appsuite.service;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest
//@AutoConfigureMockMvc
//public class ItemControllerTest {
//	
//	@Autowired
//    private MockMvc mvc;
//
//    @Test
//    public void getHello() throws Exception {
//        mvc.perform(MockMvcRequestBuilders.get("/items").accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                //.andExpect( (ResultMatcher)content().string(equalTo("Greetings from Spring Boot!")))
//                ;
//        
//        /*mockMvc.perform(get("/users"))
//        .andExpect(status().isOk())
//        .andExpect((ResultMatcher) content().contentType( "application/json" ))
//        .andExpect(jsonPath("$", hasSize(2)))
//        .andExpect(jsonPath("$[0].id", is(1)))
//        .andExpect(jsonPath("$[0].username", is("Daenerys Targaryen")))
//        .andExpect(jsonPath("$[1].id", is(2)))
//        .andExpect(jsonPath("$[1].username", is("John Snow")));
//	verify(userService, times(1)).findAllUsers();
//	verifyNoMoreInteractions(userService);*/   
//    }
//    /*    
//    private MockMvc mockMvc;
//
//	@Mock
//    private ItemService userService;
//
//    @InjectMocks
//    private ItemController itemController;
//    @Test
//	public final void testListAllUsers() throws Exception {
//		//fail("Not yet implemented"); // TODO
//		List<Item> items = Arrays.asList(
//	            new Item("1", "Daenerys Targaryen",20),
//	            new Item("2", "John Snow",30));
//	    when( userService.getItems()).thenReturn(items);
//    }
//    */
//}
