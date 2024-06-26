Rent App Design Project - README Template
===

# Rent App

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)
2. [Schema](#Schema)

## Overview
### Description
-  A social network where users can rent things and put things for rent.
   

### App Evaluation
- **Category:** Shopping/Social 
- **Mobile:** The mobile is the most comfortable tool for users to purchase and rent. The camera is used to take images of the rented items, and the map is used to know where each thing is.
- **Story:** This application will be a service of great value for people since most people have things they do not need. They can obtain an extra income by renting them through the application without having to sell them. Vice versa, people who need to rent something can do it through the app.
- **Market:** Anyone who needs to acquire anything for a certain time or wants to rent their things.
- **Habit:** Users can access the application several times a day, either to rent a thing or to put something for rent.
- **Scope:** The first version will allow users to see items, rent things, and put things for rent, as well as view their profiles. The second version would allow the user to see their rented items (both their own and foreign), filter the items by distance, see other users' profiles, and search for items. 

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**

- [X] The user will be able to create an account within the application, entering the following information:
username, password, username, email, description, profile picture and location.
- [X] The user will be able to log into the application with their username and password.
- [X] The user will be able to see in the FeedFragment a list of items (the list will show the name, picture, cost, brief description, owner's name, owner's location, owner's picture of every item, and distance between them and the item's owner). 
- [X] The user will be able to enter their location implementing the Google Places API.
- [X] The user will be able to filter items by distance. 
- [X] The user will be able to search items by name, inside and outside categories.
- [X] The user will be able to see the list of item's categories.
- [X] The user will be able to filter items by categories. 
- [X] The user will be able to see the information of an item in the Details View: Item Name, Item Picture(s), Item Description, Cost of the rent per day, Item Location, Owner's Name, Owner's Profile Picture 
- [X] The user will be able to publish an object for rent, registering the following information: Item Name, Item Category, Item Pictures, Item Description, Cost of the rent per day.
- [X] The user will be able to edit/delete their item posts. 
- [X] The user will be able to add multiples photos for the object in rent.
- [X] The user will be able to rent an item within a date range. 
- [X] The user will be able to see their distance towards each item. 
- [X] The user will be able to see their profile an other's users profiles (The profile will show the user's general information, and their items in rent).
- [X] The user will be able to edit their profile
- [X] The user can see their own items rents
- [X] The user can see their item rentals from other users
- [X] The user can click on an image and it will expand, taking all the space of the cell phone.
- [X] The user can zoom images (pinch to scale)
- [X] The user can logout from their account. 

**Optional Nice-to-have Stories**
- [X] The user can delete images previously selected when creating an item. #32
- [X] The user will be able to see the location of the renter or the owner on a map.
- [X] The user can see all the users on a Map and go to their profiles clicking on their marker.
- [ ] The user can create an account through a Google or Facebook account.
- [X] The user can see the exact address of the owner/tenant of a rent.
- [ ] The user can change the type of currency or the distance unit.
- [ ] The user can enter their location using the GPS. 
- [ ] The user will be able to chat.
- [ ] Top up money within the app.
- [X] The user can change the theme of the app (Ex. Light Mode/Dark Mode).
- [X] The user can delete images when publishing and item. 
- [ ] Notifications about new rents.
- [ ] Filters option.
- [X] The user can save items.
- [ ] The users will have reviews from others. 
- [X] Implement SMS functionality inside the app (for contacting the renter or owner of an item).
- [X] The user will be able to see animations when creating or renting items
- [X] There will be restrictions and verifications to all the forms. 



### 2. Screen Archetypes

* Login Screen
   - [ ] User can log in.
* Registration Screen
   - [ ] User can create a new account.
* Profile
   - [ ] User can view their profile.
   - [ ] User can view the profile of other users.
* Stream
   - [ ] User can view the feed of items.
   - [ ] User can view the item's categories list.
   - [ ] User can view a user's items. 
   - [ ] User can view their list of own rents.
   - [ ] User can view their list of foreign rents.
* Details 
   - [ ] User can view the details of an item. 
   - [ ] User can view the details of a rent. 
   - [ ] User can view the list of categories.
   - [ ] User can view the list of items for rent. 
* Search
   - [ ] User can search for items in rent.
* Creation
   - [ ] User can modify their profile.
   - [ ] User can publish a new item for rent. 
   - [ ] User can capture a photo or select from photo gallery.
   - [ ] Option to capture the current location when publishing an item.
   - [ ] Sending network requests to create new valid content item
   
### 3. Navigation

**Tab Navigation** (Tab to Screen)
* Sign Up
* Login
* Item's Feed
* Item's Details
* Publish an item
* Rents
* Own rents
* Foreign rents
* Search
* Profile

**Flow Navigation** (Screen to Screen)

* Login Screen
   * Home
* Registration Screen
   * Home
* Home Screen
   * Item's Feed
   * Publish item
   * Item details
   * Rents
   * Help
* Item's Feed
   * Item Details
   * User Profile  
* Rents
   * Own rents
   * Foreign rents
* Search Screen
   * Item Details 
* Item List
   * User Profile
* User Profile
   * Edit profile (if own profile)
   * Items Details


## Wireframes
[Add picture of your hand sketched wireframes in this section]
<img src="YOUR_WIREFRAME_IMAGE_URL" width=600>

### [BONUS] Digital Wireframes & Mockups

https://www.figma.com/file/WDIL4t8GAm2JvDdrOWdo4e/RENT-APP?node-id=3%3A709

### [BONUS] Interactive Prototype

Here's a walkthrough of the app in the end of week one:

<img src='/Captures/week1.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

GIF created with [Kap](https://getkap.co/).

Here's a walkthrough of the app in the end of week two:

<img src='/Captures/week2-nohd.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

### Mid-Demo 

Here's a walkthrough of the app for the Mid-Demo: 

https://imgur.com/0uX3cwV

## Schema 
### Models
#### User
   | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   | objectId      | String   | unique id for the user |
   | username      | String   | username |
   | password      | String   | user's password |
   | name          | String   | user's name |
   | description   | String   | user's description |
   | email         | String   | user's email |
   | profilePicture| File     | user's profile picture |
   | location      | Pointer to Location  | user's location |
   | likesCount    | Number   | number of likes that the user has |
   | createdAt     | DateTime | date when user is created (default field) |
   | updatedAt     | DateTime | date when user is last updated (default field) |
   
#### Item
   | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   | objectId      | String   | unique id for the item (default field) |
   | owner         | Pointer to User| item's owner   |
   | images        | Array<File>    | item's images  |
   | isRented      | Boolean        | is the item currently rented? |
   | price         | int | item rental price per day
   | likesCount    | Number   | number of likes for the item |
   | createdAt     | DateTime | date when post is created (default field) |
   | updatedAt     | DateTime | date when post is last updated (default field) |

#### Location
   | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   | objectId      | String   | unique id for the location|
   | placeId       | String   | Google Place's unique id for the location|
   | placeAddress  | String   | Exact address|
   | generalLocation  | String   | Relative address|
   | lat           | Number   | location's latitude|
   | lng           | Number   | location's longitude|
   | createdAt     | DateTime | date when location is created (default field) |
   | updatedAt     | DateTime | date when location is last updated (default field) |
   
#### Rents
   | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   | rentId        | String   | unique id for the rent |
   | item          | Pointer to item   | item being rented|
   | owner         | Pointer to user   | item's owner|
   | tenant        | Pointer to user   | item's tenant |
   | startDate     | Date     | startDate of the rent |
   | endDate       | Date     | endDate of the rent |
   | daysCount     | Number   | number of days of the rent |
   | totalPrice   | Number   | total rental price 
   | createdAt     | DateTime | date when location is created (default field) |
   | updatedAt     | DateTime | date when location is last updated (default field) |  ### Networking
   
### Networking

#### List of network requests by screen
   - Home Feed Screen
      - (Read/GET) Query all posts of items regarding location
   - Create Post Screen
      - (Create/POST) Create a new post object
   - Profile Screen
      - (Read/GET) Query logged in user object
      - (Update/PUT) Update user profile information

### Networking
#### List of network requests by screen
   - Home Feed Screen
      - (Read/GET) Query the latest item posts.
        ```java
         // Specify which class to query
        ParseQuery<Item> query = ParseQuery.getQuery(Item.class);
        //include the user of the post
        query.include(Item.KEY_OWNER);
        //Limiting the number of posts getting back.
        query.setLimit(20);
        //the items created most recently will come first and the oldest ones will come last.
        query.addDescendingOrder(Item.KEY_CREATED_AT);
        ```
   - Create Item Screen
      - (Create/POST) Create a new item post
        ```java
        //Saves all the image into Parse
        for (int i = 0; i<photoFiles.size(); i++) {
            photoFiles.get(i).saveInBackground(new SaveCallback() {
                @Override
                public void done(ParseException e) {
                    if (e != null) {
                        Toast.makeText(CreateItemActivity.this, "Error while saving", Toast.LENGTH_SHORT).show();
                        return;
                    }
                }
            });
        }
        //An item is created and its parameters are assigned
        Item item = new Item();
        item.setTitle(itemName);
        item.setDescription(itemDescription);
        item.setCategory(itemCategory);
        item.setOwner(ParseUser.getCurrentUser());
        item.setIsRented(false);
        item.setPrice(itemPrice);
        item.setImages(photoFiles);
        item.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if (e != null) {
                    Toast.makeText(CreateItemActivity.this, "Error while saving", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(CreateItemActivity.this, "Item Created Successfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(CreateItemActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });                                      
        ```
   - Profile Screen
      - (Read/GET) Query all item rental posts where user is author
        ```java
        //Specify which class to query
        ParseQuery<Item> query = ParseQuery.getQuery(Item.class);
        //include the user of the post
        query.include(Item.KEY_OWNER);
        //Limiting the number of posts getting back.
        query.setLimit(20);
        //the items created most recently will come first and the oldest ones will come last.
        query.addDescendingOrder(Item.KEY_CREATED_AT);
        query.whereEqualTo(Item.KEY_OWNER, user);
        ```
      - (Create/POST) Create a new like on a post
      - (Delete) Delete existing like
      - (Create/POST) Create a new comment on a post
      - (Delete) Delete existing comment
   - Create Post Screen
      - (Create/POST) Create a new post object
   - Profile Screen
      - (Read/GET) Query logged in user object
      - (Update/PUT) Update user profile image
#### [OPTIONAL:] Existing API Endpoints
##### Google Places API
- Base URL - [https://maps.googleapis.com/maps/api/place/details/json?place_id="place id"&key="api key"]

   HTTP Verb | Endpoint | Description
   ----------|----------|------------
    `GET`    | &fields=address | gets address 
    `GET`    | &fields=name | gets a term to be matched against all content that Google has indexed for this place. Equivalent to keyword.
    `GET`    | &fields=location | gets the latitude/longitude around which to retrieve place information.
    `GET`    | &fields=radius | gets the distance (in meters) within which to bias place results. The maximum allowed radius is 50 000 meters.

- [Create basic snippets for each Parse network request]
- [OPTIONAL: List endpoints if using existing API such as Yelp]
