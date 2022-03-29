public class User {
    String login;
    String password;
    String fullname;
    
    User(String login, String password , String fullname)
    {
      this.login = login;
      this.password = password;
      this.fullname = fullname;
    }
    
    String getLogin()
    {
      return login;    
    }
    
    String getPassword()
    {
      return password;  
    }
    
    String getFullname()
    {
      return fullname;    
    }    
}
