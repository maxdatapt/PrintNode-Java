public class AppTest {

	//    public APIClient makeClient() throws IOException,InterruptedException{
	//        Thread.sleep(1000);
	//        Auth anAuth = new Auth();
	//        anAuth.setApiKey("MyAuth");
	//        APIClient aClient = new APIClient(anAuth);
	//        aClient.setApiUrl("https://api.printnode.com");
	//        return aClient;
	//    }
	//
	//    @Test
	//    public void testAuth() throws IOException,InterruptedException{
	//        Auth testAuth = new Auth();
	//        testAuth.setApiKey("MyAuth");
	//
	//        APIClient testClient = new APIClient(testAuth);
	//        testClient.setApiUrl("https://api.printnode.com");
	//
	//        Whoami aRequest = testClient.getWhoami();
	//
	//        boolean test = (aRequest.getCanCreateSubAccounts() == true);
	//
	//        assertTrue("Failed: Should be int.",test);
	//    }
	//
	//    @Test
	//    public void testComputers() throws IOException,InterruptedException{
	//        APIClient aClient = makeClient();
	//
	//        Computer[] computers = aClient.getComputers("");
	//
	//        assertTrue("Failed: Should be 'created'",computers[0] instanceof Computer);
	//    }
	//
	//    @Test
	//    public void testPrinters() throws IOException,InterruptedException{
	//        APIClient aClient = makeClient();
	//
	//        Printer[] printers = aClient.getPrinters("");
	//
	//        assertTrue("Failed: Should be instance of Computer",printers[0].getComputer() instanceof Computer);
	//    }
	//
	//    @Test
	//    public void testPrintJobs() throws IOException,InterruptedException{
	//        APIClient aClient = makeClient();
	//
	//        PrintJob[] printjobs = aClient.getPrintJobs("");
	//
	//        assertTrue("Failed: should be instance of Computer",printjobs[0].getPrinter().getComputer() instanceof Computer);
	//    }
	//
	//    @Test
	//    public void testScales() throws IOException,InterruptedException {
	//        APIClient aClient = makeClient();
	//
	//        Scale aScale = aClient.getScales(0)[0];
	//
	//        assertTrue("Failed: should exist", aScale.getProduct() != null);
	//    }
	//
	//    @Test
	//    public void testSubmitPrintJob() throws IOException,InterruptedException{
	//        APIClient aClient = makeClient();
	//
	//        Printer aPrinter = aClient.getPrinters("")[0];
	//
	//        PrintJobJson myPrintJobCreation = new PrintJobJson(aPrinter.getId(),"PrintNode-Java","pdf_uri", "http://something","From PrintNode-Java Client");
	//        int response = aClient.createPrintJob(myPrintJobCreation);
	//    }
	//
	//    @Test
	//    public void testAccounts() throws IOException,InterruptedException{
	//        APIClient aClient = makeClient();
	//
	//        CreateAccountJson accountInfo = new CreateAccountJson("A","Person","AnEmail@SomeEmailProvider.Email","AStrongPassword");
	//
	//        accountInfo.setApiKeys(new String[]{"abc","def"});
	//
	//        CreateAccountObject accountResponse = aClient.createAccount(accountInfo);
	//
	//        String firstname = accountResponse.getAccount().getFirstname();
	//
	//        APIClient childClient = makeClient();
	//
	//        childClient.setChildAccountById(accountResponse.getAccount().getId());
	//
	//        Account newAccountInfo = accountResponse.getAccount();
	//
	//        newAccountInfo.setFirstname("The");
	//
	//        newAccountInfo.setId(-1);
	//
	//        Whoami ModifiedAccount = childClient.modifyAccount(newAccountInfo);
	//
	//        assertTrue("Failed: account was not modified",!(ModifiedAccount.getFirstname().equals(firstname)));
	//
	//        boolean deleteAccount = childClient.deleteAccount();
	//
	//        assertTrue("Failed: account was not deleted, so account did not exist",deleteAccount);
	//    }
	//
	//
	//    @Test
	//    public void testTagsFunctionality() throws IOException,InterruptedException{
	//        APIClient aClient = makeClient();
	//
	//        String tag = aClient.createTag("AnAmazingTag","AGreatValue");
	//
	//        assertTrue("Failed: should equal created.",tag.equals("created") || tag.equals("update"));
	//
	//        String tagGotten = aClient.getTags("AnAmazingTag");
	//
	//        assertTrue("Failed: Was not 'AGreatValue'",tagGotten.equals("AGreatValue"));
	//
	//        boolean tagDelete = aClient.deleteTag("AnAmazingTag");
	//
	//        assertTrue("Failed: was false or something else", tagDelete);
	//    }
	//
	//    @Test
	//    public void testAPIKeyFunctionality() throws IOException,InterruptedException{
	//        APIClient aClient = makeClient();
	//
	//        CreateAccountJson accountInfo = new CreateAccountJson("A","Person","AnEmail@SomeEmailProvider.Email","AStrongPassword");
	//
	//        CreateAccountObject accountResponse = aClient.createAccount(accountInfo);
	//
	//        APIClient childClient = makeClient();
	//
	//        childClient.setChildAccountById(accountResponse.getAccount().getId());
	//
	//        String apiKey = childClient.createApiKey("Development");
	//
	//        String apiKeyGotten = childClient.getApiKeys("Development");
	//
	//        assertTrue("Failed: gotten apikey did not equal apikey created",apiKeyGotten.equals(apiKey));
	//
	//        boolean apiKeyDelete = childClient.deleteApiKey("Development");
	//
	//        assertTrue("Failed: was false or something else", apiKeyDelete);
	//
	//        childClient.deleteAccount();
	//    }
	//
	//    @Test
	//    public void testGetLatestClient() throws IOException,InterruptedException{
	//        APIClient aClient = makeClient();
	//
	//        Download latestClient = aClient.getLatestClient("windows");
	//
	//        assertTrue("Failed: was not windows",latestClient.getOs().equals("windows"));
	//    }
	//
	//    @Test
	//    public void testClients() throws IOException,InterruptedException{
	//        APIClient aClient = makeClient();
	//
	//        Client[] clients = aClient.getClients("");
	//
	//        int[] clientsDisabled = aClient.modifyClientDownloads(Integer.toString(clients[0].getId()), false);
	//
	//        assertTrue("Failed: client was not modified",clientsDisabled[0] == clients[0].getId());
	//    }

}
