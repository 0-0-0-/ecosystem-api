# AuthApi

All URIs are relative to *https://api.kinmarketplace.com/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateAcount**](AuthApi.md#activateAcount) | **POST** /users/me/activate | Activate account
[**getUserProfile**](AuthApi.md#getUserProfile) | **GET** /users/{user_id} | Get user profile
[**signIn**](AuthApi.md#signIn) | **POST** /users | Sign in/ Log in
[**updateUser**](AuthApi.md#updateUser) | **PATCH** /users | Update user




<a name="activateAcount"></a>
# **activateAcount**
> AuthToken activateAcount()

Activate account

Activate account by accepting TOS

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;



AuthApi apiInstance = new AuthApi();

try {
    AuthToken result = apiInstance.activateAcount();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#activateAcount");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.


### Return type

[**AuthToken**](AuthToken.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/json


<a name="getUserProfile"></a>
# **getUserProfile**
> UserProfile getUserProfile(userId)

Get user profile

Get user profile

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;



AuthApi apiInstance = new AuthApi();

String userId = Arrays.asList("userId_example"); // String | The user id or the string \"me\"

try {
    UserProfile result = apiInstance.getUserProfile(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getUserProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The user id or the string \&quot;me\&quot; |


### Return type

[**UserProfile**](UserProfile.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/jsonapplication/json


<a name="signIn"></a>
# **signIn**
> AuthToken signIn(signindata)

Sign in/ Log in

Sign a user into kin marketplace

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;



AuthApi apiInstance = new AuthApi();

SignInData signindata = ; // SignInData | 

try {
    AuthToken result = apiInstance.signIn(signindata);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#signIn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **signindata** | [**SignInData**](.md)|  |


### Return type

[**AuthToken**](AuthToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/jsonapplication/json


<a name="updateUser"></a>
# **updateUser**
> updateUser(userproperties)

Update user

Update user - wallet address

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;



AuthApi apiInstance = new AuthApi();

UserProperties userproperties = ; // UserProperties | 

try {
    apiInstance.updateUser(userproperties);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#updateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userproperties** | [**UserProperties**](.md)|  |


### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/merge-patch+json
 - **Accept**: application/json



