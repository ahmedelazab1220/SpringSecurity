# Spring Security 🚀.

Welcome, everyone! In this repository, I aim to cover all essential aspects of Spring Security comprehensively. But before diving into that, let's lay down some foundational concepts.

Let's start by understanding the differences between encoding, encryption, hash functions and other basics that you should know before starting, which are essential to understanding the basics. It is not necessary to explore these concepts in detail. Let's start.

# Cryptography.
##### Cryptography is a science of cryptography that was used in the past in wars to send messages to each other , so that if they fell into the hands the enemy. he would not be able to interpret or read them. This is the method currently used. There are three important types in the world `encoding` , `encryption` , `hashing`.

- 1. encoding 
  Converting information into a different format or representation, often in a compressed or symbolic manner, typically to facilitate storage, transmission, or processing.
  From the output you can get the input.

- 2. encryption
  Securing data through transformation into an unreadable format, often using algorithms and keys, to prevent unauthorized access or comprehension.
  From the output you can get the input but using key only the two parties know it. Also , it does not have a fixed size and length and has two types (`symmetric` , `asymmetric`).

- 3. hashing
  Hashing transforms input data into a fixed-size output, typically irreversible, used for data integrity verification and password storage.
  From the output you can't get the input , if someone modify or add anything to it , it changes completely.

# Http Request and Response.

Http stands for Hyper Text Transfer Protocol
Communication between client computers and web servers is done by sending HTTP Requests and receiving HTTP Responses

- 1. Http request 
     is a fundamental part of web communications, forming the basis of data exchange on the internet. It’s a protocol used for fetching resources, such as HTML documents, images, and other files, from web servers. Here’s a breakdown of how it works:

     ![Http Request](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/8080dcb7-2491-451d-8780-8e5fe90e75d6)
     
      - Request Line: An HTTP request starts with a request line, which includes the following:
     
           - Method: This indicates the action to be performed on the resource. Common methods include GET (retrieve a        resource),    POST (submit data to the server), PUT (update a resource), DELETE (remove a resource), and         others.
           - Request URL (Path): The URL of the resource being requested.
           - HTTP Version: The version of the HTTP protocol being used.
     
      - Request Headers : 
    
          - Following the request line are headers, which provide additional information about the request. This can include   details about the client’s browser, the types of responses that the client will accept, cookies, and more.
    
      - Blank Line : 
    
          - A blank line indicates the end of the headers section.
    
      - Request Body : 
    
          - Request Body (Optional): Not all requests have a body. Bodies are typically included in POST or PUT requests,     where you’re sending data to the server (like form inputs or file uploads). The body contains the data being      sent.
       ![behind the scene http request](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/94ff6178-7275-469e-b974-97f55374b260)
- 2. Http response
     is what a server sends back to the client after receiving and processing an HTTP request. It is a key part of the data exchange in web communications, essentially being the server’s answer to the client’s request. Here’s a breakdown of
     the components of an HTTP response:

     ![Http Response](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/f0dba1f7-60ac-4d6c-8596-e61449a6194b)

     - Status Line: This is the first line of the response and includes:
     
        - HTTP Version: Indicates the HTTP protocol version used (e.g., HTTP/1.1).
        - Status Code: A three-digit number that indicates the outcome of the request. Common status codes include 200 (OK, - request succeeded), 404 (Not Found, the resource can’t be found), 500 (Internal Server Error), etc.
        - Status Text: A brief, human-readable explanation of the status code (e.g., OK, Not Found, Internal Server Error).
    
     - Response Headers: 
     
        - These are key-value pairs providing additional information about the response. They can include details such as      the server type, content type, content length, caching policies, set cookies, and other metadata. 
       
     - Blank Line : 

       - A blank line indicates the end of the headers section.   
     
     - Response Body: 
     
       - This part of the response contains the actual data or resource that the client requested. For example, it could be   an HTML file, JSON data, an image, etc. In some cases, particularly when the response indicates an error (like a     404), the body might contain a message explaining the error.
       
         ![behind the scene http response](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/5c480d4b-a65d-4780-9bc9-92df63239629)

# Authentication and Authorization.

   1. Authentication
        Authentication is the process of verifying the identity of a user accessing a system or application.

   2. How Spring Security handles authentication
       Spring Security handles authentication by employing various authentication providers, such as in-memory authentication, JDBC-based authentication, and LDAP authentication. Each provider validates user credentials and establishes the user’s identity within the application.

   3. Authorization
       Authorization determines what actions a user is allowed to perform within an application. It establishes rules and permissions for accessing protected resources based on the user’s identity and assigned roles.

#

# Spring Security.

# Agenda 
  - **Intro to Spring Security**
  - **Default Security**

   ![Spring Security](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/a749b647-ac8b-47d5-9fa4-9fb26bb145e4) 
   ###### Spring Security is a powerful and widely used framework that provides a wide range of features for securing Java applications. When combined with Spring Boot, it becomes even easier to implement secure applications quickly and efficiently. In this article, we will explore how to get started with Spring Security. you can clone this repository `https://github.com/ahmedelazab1220/SpringSecurity.git` or download zip file to understand me better.
   


## default `Spring Security` application -> (name project : DefaultSecurity).

 
 ##### By default, the Authentication gets enabled for the Application , you can use any web browser or Postman to test. Spring Security by default generate security password , you can see this in console log when run application and default username is `user`
 
 ![generate password](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/d796241f-53a2-4cc4-a74d-c6fb5a5a2235)
  
  if you don't like default generate you can write in `application.properties` next two lines : 
    - `spring.security.user.name = [your_username]`
    - `spring.security.user.password = [your_password]`
  
  ok let's go on any web browser you used it, and write `http://localhost:8080` will appear this page. this login page spring security create for you as default , then you can set username `user` and password 'this appear in your terminal' to can access 
  
 ![login page](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/827f5070-893f-41a4-873f-20cc9906ff3a)
 
 if you want to log out you can write this `http://localhost:8080/logout`
 
 ![logout page](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/4cb84413-c7ee-4ad5-be5e-018463f5c824)
 
 You can create a Controller and create html page or RestController like in my application , which will direct API requests to the authentication process (login page) first before accessing any other endpoints.
 

# 

## in-memory authentication `Spring Security` application -> (name project : InMemorySecurity).

# Agenda 
   - **UserDetailsService**
   - **UserDetails**
   - **PasswordEncoder**

#### when you do configuration by this way , you don't need to write anything in `application.properties` because you create users and save in memory and when you run application password security that appear in previous default security not appear now because make all this in application, make sure clone this repository to understand me better and let's talk about this class.

![Security Configuration1](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/2e2baeca-1d03-4e27-94ac-4c17760860a6)


 - 1. UserDetailsService
      - Interface used to load user-specific data during the authentication process.
        Implementations of UserDetailsService retrieve user details (such as username, password, and authorities(roles)) from a data source (e.g., a database , memory) and create a UserDetails object
      - The loadUserByUsername method is an implementation of the loadUserByUsername method defined in the UserDetailsService interface. This method is called by Spring Security when it needs to retrieve user   details for authentication.
      - When a user attempts to log in, they provide a username (or other unique identifier). The loadUserByUsername method is responsible for looking up the user in the user repository based on this provided      username.
      - If the user is not found in the database, the method logs an error and throws a UsernameNotFoundException. This exception is a standard exception in Spring Security and indicates that the requested  user was not found.
     
        ![UserDetailsService](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/b09d9e17-4047-486c-9c9c-9ac05efb4d6f)

 - 2. UserDetails
      - Interface Represents the principal (user) details, including username, password, and authorities. `Spring Security`   uses UserDetails to store information about the authenticated user.
      - GrantedAuthority Represents an authority granted to a user.
      - Authorities are typically roles or permissions that define what actions a user can perform.
      - Implementations include SimpleGrantedAuthority.
      ![UserDetails](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/ea3b7ecb-d6c3-4d10-81b9-6784e71dad93)


 
- 3. PasswordEncoder
      Spring Security offers a range of password encoders to secure user passwords effectively. Let’s explore these encoders to understand their strengths and limitations.
     
     - NoOpPasswordEncoder : 
         The `NoOpPasswordEncoder` is the simplest option, but it lacks any form of hashing, encoding, or encryption. It stores passwords in plain text, making it highly insecure for production applications. Avoid using this encoder due to its lack of security.

     - StandardPasswordEncoder:
        Deprecated and unsuitable for production, the `StandardPasswordEncoder` utilizes SHA-256 hashing with 1024 iterations and an 8-byte random salt. However, its susceptibility to modern attacks makes it an inadequate choice for safeguarding passwords.
     
     - Pbkdf2PasswordEncoder:
        The `Pbkdf2PasswordEncoder` employs the PBKDF2 algorithm, which stands for Password-Based Key Derivation Function 2. This algorithm enhances security through multiple iterations and a configurable salt. It's a better choice than the previous options, but there are more advanced alternatives available.
      
      - BcryptPasswordEncoder:
        The `BcryptPasswordEncoder` employs the bcrypt hashing algorithm, which has been in use since 1999. This algorithm is frequently updated to match modern computational advancements. Hashing with BcryptPasswordEncoder demands considerable CPU computations, making it resistant to rapid brute-force attacks. The time taken for hashing increases with the number of configured rounds, enhancing security.
      
      - ScryptPasswordEncoder:
        An evolution of the `BcryptPasswordEncoder`, the `ScryptPasswordEncoder` introduces additional security parameters: computational power and memory. This algorithm requires memory allocation, providing an added layer of security. Hackers attempting to crack passwords must also invest substantial computational power and memory resources.
        
      - Argon2PasswordEncoder: 
        The `Argon2PasswordEncoder` represents the latest advancement in hashing algorithms. It encompasses three dimensions: computational power, memory, and multiple threads (CPU cores). These dimensions collectively thwart brute-force attacks by significantly increasing the resources needed for each attempt.    
      
        In conclusion, when choosing a password encoder in Spring Security, it’s crucial to consider the level of security required for your application. While some encoders, like `NoOpPasswordEncoder` and `StandardPasswordEncoder`, are inadequate due to their vulnerabilities, options such as `BcryptPasswordEncoder`, `ScryptPasswordEncoder`, and `Argon2PasswordEncoder` offer strong protection against modern hacking techniques. Carefully assess your application's security needs to select the most appropriate password encoder.
      
#### ok now you can use postman or any web browser to test , i use postman.

![authetication1](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/29365c55-b0a1-4736-90e1-e40cf5e59522)

##### ok go first to authorization and select basic authentication because default for spring security then set username and password and set endpoint then send , get `status : 200 OK` and return of endpoint appear in body.

#

#### let's try to change username or password then try.

![authentication2](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/2fb80b50-bec3-44ab-935e-a810e605998c)

##### oops , get `status : 401 unauthorized` because not vaild (Bad credentials) and not found in memory authentication.
##### If you use web browser get this page.

![Bad credentials](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/59f6b6a3-bd3f-4844-842e-e59fc88ab345)

#

#### also , you can see headers in postman , it looks as `name:value` as we said before.
![headers in postman](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/8e1568e2-aefd-49b9-84a1-3bcd4496e7fd)

# 
 
## in-memory authentication & make configuration for securityFilterChain `Spring Security` -> (name project : InMemorySecurityAndFilters).


# Agenda 
  - **SecurityFilterChain**
  - **access EndPoint by Role**
  - **FormLogin**
  - **httpBasic**
  - **Customizer.withDefaults()**
  - **CSRF Attack**
  
#

   - 1. SecurityFilterChain
          ##### The `SecurityFilterChain` is a fundamental concept in Spring Security. It represents a chain of filters that are responsible for processing incoming requests and enforcing security measures within a Spring Security-enabled application. it plays a pivotal role in implementing robust security measures for web applications by enabling modular, customizable, and fine-grained security configuration.
   
          #
   
          ![Filter Chain](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/5ba20676-d68b-4608-9802-1688326e7320)
    
         - Filter Chain: Spring Security is based on a chain of filters, each responsible for a specific aspect of security,   such as authentication, authorization, CSRF protection, etc. The SecurityFilterChain manages the order and         execution of these filters.
    
         - Multiple Chains: In a Spring Security-enabled application, there can be multiple SecurityFilterChain instances.    Each chain can have its own set of filters tailored to specific URL patterns or security requirements.

         - Ordering: The order of filter chains is significant. Spring Security evaluates the chains in the order they are    defined and applies the first chain that matches the request. This allows for fine-grained control over the        security   configuration   based on URL patterns or other criteria.

         - Customization: Developers can customize the SecurityFilterChain by defining their own set of filters or by         configuring existing filters with specific parameters.

           ![Filter Chain And Memory Authentication](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/6824eb69-b5c5-4e72-b6a0-8463538d83c1)
     
   - 2. EndPoints:
          - `/api/v1/auth` : anybody(`user1`,`user2`, user3) can access to this endpoint don't needs authentication becuase i make to permitAll to access it. 
          - `/api/v1/auth/admin` : every one has role `ADMIN` can access to this endpoint like `user2 , user3`.
          - `/api/v1/auth/user` : every one has role `USER` can access to this endpoint like `user1 , user3`.
          - `/api/v1/auth/root` : anybody(`user1`,`user2`, user3) can access to this endpoint but needs to authentication becuase i don't permitAll like this endpoint `/api/v1/auth`.
          - if you login with `user1` that have roles `USER` then try to access this endpoint `/api/v1/auth/admin` you get next body in postman and by another way in web browser. 
           
            ![403 Forbidden](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/171352fb-4bd7-462f-8657-3bac8cf735ab)

   - 3. FormLogin
          - `formLogin(form -> form.permitAll())` this line permitAll user to access to login page if you don't set you get next page.
        
             ![Access denied](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/ad6521e9-4521-479e-8628-bf2bd97dad30) 
          -  If you don't like default security page was created by spring you can make one by html and css instead of and  in this line `formLogin(form -> form.permitAll())` replace by `formLogin(form -> form.loginPage("/login").permitAll())`
   - 4. HttpBasic(Customizer.withDefaults()) : 
           - this line i used to do basic Authentication because i use postman to test and i need basic authentication to can access. you can delete it if use any web browser.
           - `Customizer.withDefaults()` : is a factory method provided by Spring Security to create a default customizer for configuring `HTTP Basic Authentication`. It's a convenient way to apply commonly used settings without  needing to specify them explicitly.
           - if you use `httpbasic` and try to delete  `formLogin(form -> form.permitAll())` when go in any web browser and try to access `protected endpoint` next photo appear.

             ![js login page](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/b3711498-c3ae-400b-8157-1a7113dae62f) 

             but you can't return to login or logout page. you must restart application and web browser to go again , so i do `httpbasic` and `formLogin(form -> form.permitAll())` to allow this all.



#

#### if you noticed in all above project i use `GET` not any other action like `post , delete , put` why?.

###### ok to answer this question i talk about `CSRF Attacks` , Cross site request forgery (CSRF) is an attack vector that tricks a web browser into executing an unwanted action in an application to which a user is logged in. CSRF are typically conducted using malicious social engineering, such as an email or link that tricks the victim into sending a forged request to a server. As the unsuspecting user is authenticated by their application at the time of the attack, it’s impossible to distinguish a legitimate request from a forged one, but in my application i will set csrf disbale by `csrf(csrf -> csrf.disable())` if you need to make any actions like `post , put` but this is not always true becuase there other system needs it. so , this decision depends on the system if you need it or not . also you can see this video in youtube `https://www.youtube.com/watch?v=6PHddMkl-yw` to understand it better , it shows how to hack using CSRF and what methods can solve it. 

  ![CSRF Attack](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/06f88106-26e4-4890-97c3-17ea093c7bb6)

#

## database authentication `Spring Security` -> (name project : DatabaseSecurity).


# Agenda 
  - **Security Configuration**
    - **Authentication Manager** 
       - ***AuthenticationConfiguration***
    - **Authentication Provider**
       - ***DoaAuthenticationProvider***
       - ***JwtAuthenticationProvider***
    - **AuthenticationEntryPoint**
  - **RestAdviceController** 
  - **Authority & Roles**
  - **MySQL Database**
  - **Custom Implementation UserDetails**
  - **Custom Implementation UserDetailService**
  - **EndPoints**

#

   - 1. Authentication Manager (Interface):
         - Responsible for authenticating a user based on their credentials.
         - Spring Security uses AuthenticationManager to authenticate the user during the login process.
         - The default implementation is ProviderManager, which delegates to a list of AuthenticationProvider instances.
            - 1. AuthenticationConfiguration:
                This is provided as an argument to the method. It is presumably an instance of Spring's `AuthenticationConfiguration` class, which is used to configure the `AuthenticationManager`.
                `config.getAuthenticationManager()`: 
                This line retrieves the `AuthenticationManager` from the `AuthenticationConfiguration`. The getAuthenticationManager() method is presumably a method provided by the `AuthenticationConfiguration` class to obtain the configured `AuthenticationManager`.   
   
           ![AuthenticationManager](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/9af14e7b-e774-4dc5-b9a7-6d5a2bc20306)

   - 2.  AuthenticationProvider:
          - Implementation of Authentication manager and can override the authenticate().
          - Custom authentication logic can be implemented by creating a class that implements the AuthenticationProvider interface.
          - Common implementations include DaoAuthenticationProvider (use in this Example) for database-backed authentication and JwtAuthenticationProvider for JWT-based authentication.
          - Need to provide UserDetaliService(Load the user from DB and set the UserDetails) and PasswordEncoder(Since password will be saved in DB after Encoding)for DaoAuthenticationProvider.
  
             - 1. DaoAuthenticationProvider:
                `DaoAuthenticationProvider` is typically used when you have a traditional username-password authentication system where user details are stored in a database.
             - 2. JwtAuthenticationProvider:
                `JwtAuthenticationProvider` , on the other hand, is used when you're implementing authentication via JSON Web Tokens (JWT).
         
            ![AuthenticationProvider](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/de4c5c13-8729-4644-b17b-5be648bb8de2)

   - 3. AuthenticationEntryPoint:
         - When throw an exception like `UsernameNotFoundException` not throw because Spring Security work before anything    then can't handle exception by this way , so `AuthenticationEntryPoint` come to fix it and help you to handle      exception or i can say that exceptionHandling in security configuration that help me.
         - The `AuthenticationEntryPoint` interface in Spring Security is used to commence the authentication process when a   user requests a secured HTTP resource without providing any credentials.
         - `HandlerExceptionResolver` is an interface in Spring MVC that allows you to define a strategy for handling          exceptions thrown during the execution of handler methods (controllers) in your application.
         
           ![AuthenticationEntryPoint](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/6efb7eff-5673-4cc2-8c93-400dec3e6593)
   - 4. RestAdviceController:
        - A `@RestControllerAdvice` class in Spring is used to handle exceptions globally across multiple controllers. It     allows you to centralize exception handling logic and apply it to all controllers in your application.
        - `@ExceptionHandler` annotation is used to declare methods that handle specific exceptions.
          The handleException method handles exceptions of type Exception. You can have multiple handler methods for different types of exceptions.

          ![RestAdviceController](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/668ea928-9705-4c8b-9909-c977ebf41982)
   - 5. Authority & Role:
         - Authority
             is an action that the user can do in your application `Read` , `Write` , `Delete` , `excute something`. it's usually represent by a verb.
         - Role
             is a badge that's usually represent by a subject like `ADMIN` , `MANAGER` , `CLIENT`.

           but technically speaking it's only one contract behind the scenes and it's GrantedAuthority in next picture.
           
           ![GrantedAuthority](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/6892b63e-f669-4f6b-9b5d-5f8ab600a193)
           
           so it doesn't matter if we dicuss about Authority or Roles it's still only one contract behind the scenes.
           Okay! To apply the Authority or Roles you can use `hasRole` , `hasAuthority` , `hasAnyRole` and `hasAnyAuthority`
           in **security configuration**. but there difference between them.
           
           - `hasRole`:
                This expression checks if the current authenticated principal has the specified role. Roles in Spring Security are typically represented as strings prefixed with "ROLE_" by default (although this prefix can be customized).
           - `hasAuthority`: 
                This expression checks if the current authenticated principal (user) has the specified authority. Authorities in Spring Security are typically represented as strings, and they can represent fine-grained permissions or privileges.
           - `hasAnyRole`:
              is like `hasRole` but can accept more than one role.
           - `hasAnyAuthority`:
              is like `hasAuthority` but can accept more than one Authority.
        
        Also , you can use `@PreAuthorize` or `@PostAuthorize` on **controllers** to apply roles and authorities but you must put `@EnableMethodSecurity` in to apply this. there difference between them.
           - `@PreAuthorize`:
              is used to specify access control rules that are evaluated before the method is invoked, and If the pre-authorization check fails `(i.e., the expression evaluates to false)`, the method is not executed, and an `AccessDeniedException` is thrown.
           - `@PostAuthorize`:
              is used to specify access control rules that are evaluated after the method has been invoked and before the result is returned to the caller , and If the post-authorization check fails `(i.e., the expression evaluates to false)`, an `AccessDeniedException` is thrown after the method has been executed, and the result is discarded.
           
        **now , you may be asking yourself the question should i use Role or Authority ?**
        ***it depends on the system , it's not mandatory***  
           
           **You will see that clearly when we apply it practically.**
   - 6. MySQL Database:

         - entites : `users`  , `roles` , `authorities`.
         - relations : `users_roels` , `roles_authorities` -> -*ManyToMany*-.
        
         ![MySQL Database](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/f4a68c24-e5aa-443a-b54c-2d263a1a1a8a)
         
         - to connect to database open `application.properties` and this 
         ![application.properties](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/d8ac3346-1d77-41e0-9208-4ca89c3d9c04)
         
         - if you need to create database automitc replace first line by `spring.datasource.url=jdbc:mysql://localhost:3306/[your_database_name]?createDatabaseIfNotExist=true`
         - `logging.level.org.springframework.security=DEBUG` : used it to enable logging for `Spring Security`
         - `spring.jackson.default-property-inclusion=NON_NULL` : This is a Spring Boot property that configures the default inclusion criteria for Jackson when serializing Java objects to JSON. Jackson will exclude all properties that have null values from the JSON output.

   - 7. Custom Implementation UserDetails:

         - there are many repository implement this in entity but this is not good because broke the first principle of the `SOLID   Principle`. so i separate this in `SecurityUser` class.
         - `isAccountNonExpired` , `isAccountNonLocked` , `isCredentialsNonExpired` and `isEnabled` make all true now. 

         ![Custom ImplementationUserDetails](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/5f95c0be-ef14-4c61-b8a2-6a1445c40d77)
    
   - 8. Custom Implementation UserDetailService:
         
         - overrid function `loadUserByUsername` i talk about this before.

           ![Custom UserDetialService](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/1ba604d4-b664-4ee5-ad2d-7169b249c364)
         
           ![Custom Implementation UserDetialService](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/f9f52278-514b-4ddb-92bf-23b4c3988dd1)
    
   - 9.  EndPoints:
          - `/api/v2/auth` , `/api/v1/auth/**`: permitAll to access don't need authentication.
          - `/api/v2/auth/admin`: need to `ADMIN` Role to access.
          - `/api/v2/auth/admin/write`: need to `ADMIN_WRITE` Authority to access but don't need to `ADMIN` Role ok there are difference between them.
          - `httpBasic`: is still basic Authentication but i add authenticationEntryPoint to handle authentication exception ,but there is a difference that you may not notice, which is that use any web browser and try to access `protected endpoint` you get login page to make authentication becuase i make this line `formLogin(form -> form.permitAll())` but if remove get always white page not contain anything , so i permit this to show login page in web browser.   
          - `exceptionHandling(ex -> ex.accessDeniedHandler(this.accessEntry))`: this line to handle access denied exception i make `CustomAccessDeniedHandler` to handle this you can see in repository.

             ![Security Configuration2](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/83b1e0fc-7398-43ae-bf49-f9f6138b0dc0)
             
          - `/api/v2/auth/user`: need to `USER` Role or `ADMIN` Role to access.
          - `/api/v2/auth/root`: need to `ADMIN` Role and `ADMIN_READ` Authority and `ADMIN_WRITE` Authority to access.  
          - `/api/v2/auth/subroot`: need to `ADMIN` Role and `ADMIN_READ` Authority or `ADMIN_WRITE` Authority to access.

             ![PreAuthorize PostAuthorize](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/713ae689-abd4-48c2-aa20-925e75b30d9f)

          - i use postman to test , i add this users to system.

             ![register1](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/4799f12b-b7a4-42eb-b981-f436b167f92b)
             ![register2](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/73dc407c-d395-4bc5-862c-51103653f5b1)
             ![register3](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/d65e2732-42fa-412d-bf6d-cc94a4d6b34c)
             
          - now go to test endpoints.

             ![test1](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/c3751638-58f5-4972-9cff-5c0f7ea35cb4)
             ![test2](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/e6314746-645a-4a14-aede-4654b4ba49b3)
             ![test3](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/c72c3f52-a18c-418b-9dd9-212893949570)
             ![test4](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/9b8101cf-ef48-40e7-9cdf-2b8d741de574)
             ![test5](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/80fc53ce-a988-490c-aef8-fdb96a0c7e91)
             ![test6](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/6d959018-54aa-45fc-98cb-b179112a0509)
   
   - 10. Flow of application. 
 
            ![Flow of application](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/b278ea4c-189b-4572-a57c-7c2974e61803)
             
             

#


   
  








