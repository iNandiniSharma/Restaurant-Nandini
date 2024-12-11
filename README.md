### README: Restaurant Application

---

#### **Overview**
The Restaurant Application is a menu-driven system, designed for users to browse a food menu, select items, view details, and place orders. This application can be extended to manage inventory, staff, and financial transactions in a real-world scenario.
---

#### **Features**
1. **Menu Display**: Shows a list of food items with their names, IDs, and prices.
2. **Item Selection**: Allows users to select menu items by ID.
3. **Order Management**: Confirms user selections and displays a summary of chosen items.
4. **Error Handling**: Guides users to re-enter IDs or correct inputs if invalid data is provided.
---

#### **Technologies Used**
- **Programming Language**: Java v22
---

#### **Code Highlights (advanced features used in code)**
- **Sealed Classes:** Restricts subclassing of `Employee` to `Manager`, `Chef`, and `Waiter`.
- **Pattern Matching for Switch:** Simplifies role-specific operations in `OrderProcessor`.
- **Records:** Used for immutable `MenuItemRecord` objects.
---

#### **Usage**
- **1. Run the application and follow the prompts**
- **Enter a name:** Nandini  
- **Enter your email id:** Nandini.Sharma@sc.com
- **View the Menu Item and Enter the ID of the menu item you want to select:** 4
- **Do not worry if you have to change the selection**
- **Do you want to proceed with this selection? (Y/N):** N
- **'N' or 'n' will bring the Menu back to re-select your food preference** 
- **Only once confirmed as 'Y' or 'y' the food item will be packed and served**
---

#### **UML Image**
![Menu Screenshot](./Drawing.png)
---

#### **Future Enhancements Roadmap**
- Staff and inventory management modules.
- Analytics and reporting for restaurant performance.
--- 
