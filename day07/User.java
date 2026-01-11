class User {
  private String username;
  private String password;

  public User(String username,String password ){
    this.username = username;
    setPassword(password);
  }

  public String getUsername(){
    return username;
  }

  public void setPassword(String password){
    if(password != null && password.length() > 6 ){
      this.password = password;
    } else {
      System.out.println("password length must be greater than 6");
    }
  }
}