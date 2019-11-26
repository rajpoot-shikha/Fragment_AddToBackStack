# Fragment_AddToBackStack
This repository contains sample application demonstrating how the addToBackStack() method works while performing Fragment Transactions.

public abstract FragmentTransaction addToBackStack (String name)

Added in API level 11. Add this transaction to the back stack. This means that the transaction will be remembered after it is committed,
and will reverse its operation when later popped off the stack.

Parameters 'name' :  An optional name for this back stack state, or null.
 
By calling addToBackStack(), the replace transaction is saved to the back stack so the user can reverse the 
transaction and bring back the previous fragment by pressing the Back button.

![AddToBackStack](https://user-images.githubusercontent.com/40024983/69622922-e94c7780-1067-11ea-989a-0816ef8f87e5.gif)

Thanks!
