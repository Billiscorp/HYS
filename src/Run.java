import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Run {
	
	public static void LogIn (String userName, String password)  // Header ? Button?
	{
	  
	  Page.toLoginPage();
	  Page_Login.setUser(userName);
	  Page_Login.setPassword(password);
	  Page_Login.pushLoginButton();
	  Page_Login.VerLogin();
	}
	
	
	public static void Registr ()  // Header ? Button?
	{
	  
		 Page.toSignUpPage();
		  Page_SignUp.setUser("Name1"+" "+"LastName1");
		  
		  String email = Generate_Data.Gen_Email();
		  System.out.println("email = "+email);
		  
		  try {
			StringReadWrite.main("log.txt",email);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  Page_SignUp.setEmail(email);
		  Page_SignUp.setPassword(email);
		  Page_SignUp.pushSignUpButton();
		  Page_Login.VerLogin();
	}
	
	
	
	public static String AddItem (String item_url)  
	{
	  
		Page_Home.toAddItemPage();
//		Add Verification if item is in base
		
		Page_AddItem.setProdictUrl(item_url);
		
		String productTitle = Page_AddItem.getProdictTitle();
System.out.println("productTitle = "+productTitle);

		String CurrentPrice = Page_AddItem.getCurrentPrice();
System.out.println("CurrentPrice = "+CurrentPrice);


		
		Page_AddItem.setTags("Test Item Tags"); // may be random ???
		Page_AddItem.setCategory(); // Random category and subCategory, may be from file
		Page_AddItem.pushCorrect();
//		Page_AddItem.setReviewProduct("Test Review this product"); // may be random ???
//		Page_AddItem.setRateProduct(); // may be random ???  VERIFY !!! may be not working
//		Page_AddItem.pushAddtoReview();
		
		String addItemLink = Page_AddItem.getItemLink(); // ????
		
//		Page_MyProducts.CheckAddItem(productTitle);
	
		return addItemLink;
	}
	
	
	
	public static void EditItem (String shortLink) throws FileNotFoundException, IOException  
	{
	  Page_Home.toMyProductsPage();
	  Page_MyProducts.selectItem(shortLink);
	  
	  Page_ProductDetails.toEditItem();
	  
	  String fileName = "editField"; 
	  
	  Page_EditProduct.setFieldToFile(fileName);
	  
	  Page_EditProduct.setNewTitle(StringReadWrite.getProp(fileName, "newTitle")); 
	  Page_EditProduct.setNewDescription(StringReadWrite.getProp(fileName, "newDescription"));
	  Page_EditProduct.setNewPrice(StringReadWrite.getProp(fileName, "newPrice"));
	  Page_EditProduct.setNewCategory(StringReadWrite.getProp(fileName, "newCategory"), StringReadWrite.getProp(fileName, "newSubCategory"));  
	  Page_EditProduct.setNewTags(StringReadWrite.getProp(fileName, "newTags"));
	  Page_EditProduct.pushApply();
	  
	  Page_EditProduct.checkEdit(fileName);
	  
	 
	
	}
	
	
	
//	public static String AddItemToExistCollection_ProductPage () //throws FileNotFoundException, IOException  
//	{
//	  HomePage.toMyProductsPage();
//	  HomePage.toAllProductsPage();
//
//	  WebElement ranProduct = AllProductsPage.SelectRanProductNotInCol_Wish("+ Collection");
//	  
//	  String ranProductUrl = AllProductsPage.getURlRanProduct(ranProduct);
//	  String ranProductTitle = AllProductsPage.getTitleRanProduct(ranProduct);
//	  String ranProductDealWishLIst = AllProductsPage.getProductDealWishLIst(ranProductUrl);
//	  
//	  System.out.println("ranProductUrl = "+ranProductUrl);
//	  System.out.println("ranProductTitle = "+ranProductTitle);
//	  System.out.println("ranProductDealWishLIst = "+ranProductDealWishLIst);
//	  
//	  AllProductsPage.toAddToCollection(ranProductUrl);
//	
//	  AddToCollectionPage.selectExistCollection("Test collection");
//	  AddToCollectionPage.pushAdd();
//	 
//	return ranProductDealWishLIst;
	 
	// Choose a collection or Create???
	// Public or Private ????
	// Use existing collection for test !!!!!
	  



	  
	  
	  
//	  MyProductsPage.selectItem(shortLink);
//	  
//	  ProductDetailsPage.toEditItem();
//	  
//	  String fileName = "editField"; 
//	  
//	  EditProductPage.setFieldToFile(fileName);
//	  
//	  EditProductPage.setNewTitle(StringReadWrite.getProp(fileName, "newTitle")); 
//	  EditProductPage.setNewDescription(StringReadWrite.getProp(fileName, "newDescription"));
//	  EditProductPage.setNewPrice(StringReadWrite.getProp(fileName, "newPrice"));
//	  EditProductPage.setNewCategory(StringReadWrite.getProp(fileName, "newCategory"), StringReadWrite.getProp(fileName, "newSubCategory"));  
//	  EditProductPage.setNewTags(StringReadWrite.getProp(fileName, "newTags"));
//	  EditProductPage.pushApply();
//	  
//	  EditProductPage.checkEdit(fileName);
	  
	 
	
//	}

}
