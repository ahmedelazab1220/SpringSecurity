# Spring Security 🚀

Welcome, everyone! In this repository, I aim to cover all essential aspects of Spring Security comprehensively. But before diving into that, let's lay down some foundational concepts.

Let's start by understanding the differences between encoding, encryption, hash functions , and other basics you must know before start , which are crucial for grasping the fundamentals. Shall we explore these concepts in detail? Let's dive in!

# Cryptography
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

# Http Request and Response
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

# Spring Security
  
   ![Spring Secyriyt](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/a749b647-ac8b-47d5-9fa4-9fb26bb145e4)
   ###### Spring Security is a powerful and widely used framework that provides a wide range of features for securing Java applications. When combined with Spring Boot, it becomes even easier to implement secure applications quickly and efficiently. In this article, we will explore how to get started with Spring Security. you can clone this repository `https://github.com/ahmedelazab1220/SpringSecurity.git` or download zip file to understand me better.
   


# Let's go start with default `Spring Security` application     

 Spring Security default generated security password , you can see this in terminal when run application and default username is `user`
 
  ![generate password](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/d796241f-53a2-4cc4-a74d-c6fb5a5a2235)
  
  ok let's go on any web browser you used it , and write `http://localhost:8080` will appear this page. this login page spring security create for you as default , then you can set username `user` and password 'this appear in your terminal' to can access 
  
 ![login page](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/827f5070-893f-41a4-873f-20cc9906ff3a)
 
 if you want to log out you can write this `http://localhost:8080/logout`
 
 ![logout page](https://github.com/ahmedelazab1220/SpringSecurity/assets/105994948/4cb84413-c7ee-4ad5-be5e-018463f5c824)
 
 You can create a Controller and create html page or RestController like in my application for the application, which will direct API requests to the authentication process (login page) first before accessing any other endpoints.