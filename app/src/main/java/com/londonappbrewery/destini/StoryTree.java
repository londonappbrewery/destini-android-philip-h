package com.londonappbrewery.destini;

/**
 * Created by Philip on 11/15/2017.
 */

public class StoryTree
{
    // Private class to create Tree structure
    private class Node
    {
        public StoryArc currentStory;
        public Node topArc;
        public Node bottomArc;

        public Node(StoryArc currentStory)
        {
            this.currentStory = currentStory;
        }
    }

    private Node currentNode;
    private Node rootNode;

    public StoryTree(StoryArc rootArc)
    {
        Node root = new Node(rootArc);
        currentNode = root;
        rootNode = root;
    }

    public StoryArc getCurrentStory()
    {
        return currentNode.currentStory;
    }

    // Create tree structure --------------------------------
    public void insertTop(StoryArc topArc)
    {
        Node topNode = new Node(topArc);
        currentNode.topArc = topNode;
    }

    public void insertBottom( StoryArc bottomArc)
    {
        Node bottomNode = new Node(bottomArc);
        currentNode.bottomArc = bottomNode;
    }
    // /Create tree structure -------------------------------

    // Navigation through the tree --------------------------
    public void goRoot()
    {
        currentNode = rootNode;
    }

    public void goTop()
    {
        currentNode = currentNode.topArc;
    }

    public void goBottom()
    {
        currentNode = currentNode.bottomArc;
    }
    // /Navigation through the tree -------------------------

    public boolean isAtEnd()
    {
        return currentNode.bottomArc == null && currentNode.topArc == null;
    }
}

