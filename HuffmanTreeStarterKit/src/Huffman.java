import java.util.List;
import java.util.ArrayList;

import java.util.Map;
import java.util.HashMap;

import java.io.FileNotFoundException;

public class Huffman {	
  private Tree root;
  private Map<Character, String> characterCodes;

  public Huffman()
  {
    characterCodes = new HashMap<Character, String>();
  }

  public void buildTreeFromFile(String filePath) throws FileNotFoundException {
    List<Tree> nodes = new ArrayList<Tree>();
    populateNodesFromFile(filePath, nodes);
    root = buildTreeFromNodes(nodes);

    buildCharacterCodes(root, "");
  }

  private void populateNodesFromFile(String filePath, List<Tree> nodes) throws FileNotFoundException {
    // This should populate the list nodes with Tree objects from the given file.
    // Each line of the file contains the character and then the weight for that node separated by a comma.
    // So A,1 would mean a node with character 'A' and weight 1.
  }
  
  private Tree buildTreeFromNodes(List<Tree> nodes) {
    // This should sort the nodes and populate your Huffman tree into the root Tree object.
    // This method will be recursive.
    //   The first terminating condition is that the side of the List is 1. If that's the case you can simply return the one node.
    //   If not
    //     sort the list of nodes and create a new tree node with the first two nodes in the List.
    //     The weight of the new node will be the combined weight of those two nodes.
    //     At this point, if the size of nodes is 2, return the new node (this is another terminating condition).
    //     If not
    //       Remove those 2 nodes from the List and add the new node that you created from them to the list.
    //       Call buildTreeFromNodes with the List.
  }

  private void buildCharacterCodes(Tree tree, String code) {
    // This is a recursive method to build the character codes for all of the leaves of the tree.
    // By doing this and storing the codes in a Map, we are able to implement getCode in constant time, which then
    // allows us to implement encode in linear time.

    // If the tree is a leaf (terminating condition), add the code and return.
    // Otherwise call buildCharacterCodes with the left and right nodes of the tree.
    //   This will build the code recursively because you will also pass "0" as the second parameter when calling it for the left child
    //   or you will pass "1" as the second parameter when calling it for the right child.
  }
	
	public void printTree() {

  }

	public String getCode(char ch) {
    // This should perform in constant time: O(C)
  }

  public String encode(String value) {
    // This should perform in linear time O(n)
    // Iterate over the characters in value and build the encoded value.
  }

	public String decode(String code) {
    // This should perform in linear time O(n)
    // Iterate over the characters of the code. Start at the root and crawl down the tree (left for 0 and right for 1)
    // until you reach a leaf (character).
    // Add that character to the decoded string and repeate (go back to the root and crawl the tree until you reach the next character).
    // Continue this until you've decoded the entire value of code.
  }
}
