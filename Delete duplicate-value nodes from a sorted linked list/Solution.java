class Solution{

  private static Node removeDuplicates(Node head) {
      if(head==null) {
         return null;
      }
      Node temp = head;
      Node curr = head;
      while(temp.next!=null) {
         if(temp.data==temp.next.data) {
            temp.next=temp.next.next;
            curr = temp;
         }else {
            curr = curr.next;
            temp = temp.next;
         }
      }
      return head;
   }
}
