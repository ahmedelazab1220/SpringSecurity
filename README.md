# Spring Security 🚀.

Welcome, everyone! In this repository, I aim to cover all essential aspects of Spring Security comprehensively. But before diving into that, let's lay down some foundational concepts.

Let's start by understanding the differences between encoding, encryption, hash functions , and other basics you must know before start , which are crucial for grasping the fundamentals. Shall we explore these concepts in detail? Let's dive in!

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
     
    Request Line: An HTTP request starts with a request line, which includes the following:
     
     - Method: This indicates the action to be performed on the resource. Common methods include GET (retrieve a resource),    POST (submit data to the server), PUT (update a resource), DELETE (remove a resource), and others.
     - Request URL (Path): The URL of the resource being requested.
     - HTTP Version: The version of the HTTP protocol being used.
     
    Request Headers : 
    
     - Following the request line are headers, which provide additional information about the request. This can include        details about the client’s browser, the types of responses that the client will accept, cookies, and more.
    
    Blank Line : 
    
     - A blank line indicates the end of the headers section.
    
    Request Body : 
    
     - Request Body (Optional): Not all requests have a body. Bodies are typically included in POST or PUT requests, where     you’re sending data to the server (like form inputs or file uploads). The body contains the data being sent.
    ![behind the scene http request](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/94ff6178-7275-469e-b974-97f55374b260)
- 2. Http response
   is what a server sends back to the client after receiving and processing an HTTP request. It is a key part of the data   exchange in web communications, essentially being the server’s answer to the client’s request. Here’s a breakdown of      the components of an HTTP response:

     ![Http Response](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/f0dba1f7-60ac-4d6c-8596-e61449a6194b)

     Status Line: This is the first line of the response and includes:
       
       - HTTP Version: Indicates the HTTP protocol version used (e.g., HTTP/1.1).
       - Status Code: A three-digit number that indicates the outcome of the request. Common status codes include 200 (OK, -   request succeeded), 404 (Not Found, the resource can’t be found), 500 (Internal Server Error), etc.
       - Status Text: A brief, human-readable explanation of the status code (e.g., OK, Not Found, Internal Server Error).
    
     Response Headers: 
       - These are key-value pairs providing additional information about the response. They can include details such as       the server type, content type, content length, caching policies, set cookies, and other metadata. 
       
     Blank Line : 
    
       - A blank line indicates the end of the headers section.   
     
     Response Body: 
       - This part of the response contains the actual data or resource that the client requested. For example, it could be    an HTML file, JSON data, an image, etc. In some cases, particularly when the response indicates an error (like a      404), the body might contain a message explaining the error.
       
     ![behind the scene http response](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/5c480d4b-a65d-4780-9bc9-92df63239629)

# Authentication and Authorization.

   1. Authentication
        Authentication is the process of verifying the identity of a user accessing a system or application.

   2. How Spring Security handles authentication
       Spring Security handles authentication by employing various authentication providers, such as in-memory authentication, JDBC-based authentication, and LDAP authentication. Each provider validates user credentials and establishes the user’s identity within the application.

   3. Authorization
       Authorization determines what actions a user is allowed to perform within an application. It establishes rules and permissions for accessing protected resources based on the user’s identity and assigned roles.


# Spring Security.
  
   ![Spring Security](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/a749b647-ac8b-47d5-9fa4-9fb26bb145e4) 
   ###### Spring Security is a powerful and widely used framework that provides a wide range of features for securing Java applications. When combined with Spring Boot, it becomes even easier to implement secure applications quickly and efficiently. In this article, we will explore how to get started with Spring Security. you can clone this repository `https://github.com/ahmedelazab1220/SpringSecurity.git` or download zip file to understand me better.
   


## Let's go start with default `Spring Security` application -> (name project : DefaultSecurity).
 
 ##### By default, the Authentication gets enabled for the Application , you can use any web browser or Postman to test. Spring Security by default generate security password , you can see this in terminal when run application and default username is `user`
 
 ![generate password](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/d796241f-53a2-4cc4-a74d-c6fb5a5a2235)
  
  if you don't like default generate you can write in `application.properties` next two lines : 
    - `spring.security.user.name = [your_username]`
    - `spring.security.user.password = [your_password]`
  
  ok let's go on any web browser you used it, and write `http://localhost:8080` will appear this page. this login page spring security create for you as default , then you can set username `user` and password 'this appear in your terminal' to can access 
  
 ![login page](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/827f5070-893f-41a4-873f-20cc9906ff3a)
 
 if you want to log out you can write this `http://localhost:8080/logout`
 
 ![logout page](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/4cb84413-c7ee-4ad5-be5e-018463f5c824)
 
 You can create a Controller and create html page or RestController like in my application , which will direct API requests to the authentication process (login page) first before accessing any other endpoints.

## Let's go start with in-memory authentication `Spring Security` application -> (name project : InMemorySecurity).

#

#### when you do configuration by this way , you don't need to write anything in `application.properties` because you create users and save in memory and when you run application password security that appear in previous default security not appear now because make all this in application, make sure clone this repository to understand me better and let's talk about this class.

![Security Configuration](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/2e2baeca-1d03-4e27-94ac-4c17760860a6)


 - 1. UserDetailsService
      Interface used to load user-specific data during the authentication process.
      Implementations of UserDetailsService retrieve user details (such as username, password, and authorities(roles)) from a data source (e.g., a database , memory) and create a UserDetails object

 - 2. UserDetails
      Represents the principal (user) details, including username, password, and authorities. `Spring Security` uses UserDetails to store information about the authenticated user.
 
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
        
      - Argon2PasswordEncoder 
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
 
## let's go start with in-memory authentication & make configuration for securityFilterChain `Spring Security` -> (name project : InMemorySecurityAndFilters).

#

###### i will talk first about SecurityFilterChain before go in deep dive.

#

# SecurityFilterChain

   ##### The `SecurityFilterChain` is a fundamental concept in Spring Security. It represents a chain of filters that are responsible for processing incoming requests and enforcing security measures within a Spring Security-enabled application. it plays a pivotal role in implementing robust security measures for web applications by enabling modular, customizable, and fine-grained security configuration.
   
   #
   
   ![Filter Chain](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/5ba20676-d68b-4608-9802-1688326e7320)
    
- Filter Chain: Spring Security is based on a chain of filters, each responsible for a specific aspect of security,     such   as authentication, authorization, CSRF protection, etc. The SecurityFilterChain manages the order and execution   of these   filters.
    
- Multiple Chains: In a Spring Security-enabled application, there can be multiple SecurityFilterChain instances. Each        chain can have its own set of filters tailored to specific URL patterns or security requirements.

- Ordering: The order of filter chains is significant. Spring Security evaluates the chains in the order they are defined     and applies the first chain that matches the request. This allows for fine-grained control over the security configuration   based on URL patterns or other criteria.

- Customization: Developers can customize the SecurityFilterChain by defining their own set of filters or by configuring      existing filters with specific parameters.

  ![Filter Chain And Memory Authentication](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/6824eb69-b5c5-4e72-b6a0-8463538d83c1)

- 1. `/api/v1/auth` : anybody(`user1`,`user2`, user3) can access to this endpoint don't needs authentication becuase i make      to permitAll to access it. 
- 2. `/api/v1/auth/admin` : every one has role `ADMIN` can access to this endpoint like `user2 , user3`.
- 3. `/api/v1/auth/user` : every one has role `USER` can access to this endpoint like `user1 , user3`.
- 4. `/api/v1/auth/root` : anybody(`user1`,`user2`, user3) can access to this endpoint but needs to authentication becuase i
     don't permitAll like this endpoint `/api/v1/auth`.
- 5. `formLogin(form -> form.permitAll())` this line permitAll user to access to login page if you don't set you get next         page.
      
      ![Access denied](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/ad6521e9-4521-479e-8628-bf2bd97dad30) 

- 6. `httpBasic(Customizer.withDefaults())` this line i use it because i use postman to test and i need basic authentication      to can access. you can delete it if use any web browser. 
- 7. `Customizer.withDefaults()` : is a factory method provided by Spring Security to create a default customizer for             configuring `HTTP Basic Authentication`. It's a convenient way to apply commonly used settings without needing to           specify them explicitly.
- 8. if you login with `user1` that have roles `USER` then try to access this endpoint `/api/v1/auth/admin` you get next         body in postman and by another way in web browser. 

    ![403 Forbidden](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/171352fb-4bd7-462f-8657-3bac8cf735ab)


##### If you don't like default security page was created by spring you can make one by html and css instead of and in this line `formLogin(form -> form.permitAll())` replace by `formLogin(form -> form.loginPage("/login").permitAll())`

#

#### if you noticed in all above project i use `GET` not any other action like `post , delete , put` why?.

###### ok to answer this question i talk about `CSRF Attacks` , Cross site request forgery (CSRF) is an attack vector that tricks a web browser into executing an unwanted action in an application to which a user is logged in. CSRF are typically conducted using malicious social engineering, such as an email or link that tricks the victim into sending a forged request to a server. As the unsuspecting user is authenticated by their application at the time of the attack, it’s impossible to distinguish a legitimate request from a forged one, but in my application i will set csrf disbale by `csrf(csrf -> csrf.disable())` if you need to make any actions like `post , put` but this is not always true becuase there other system needs it. so , this decision depends on the system if you need it or not . also you can see this video in youtube `https://www.youtube.com/watch?v=6PHddMkl-yw` to understand it better , it shows how to hack using CSRF and what methods can solve it. 

  ![CSRF Attack](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/06f88106-26e4-4890-97c3-17ea093c7bb6)




