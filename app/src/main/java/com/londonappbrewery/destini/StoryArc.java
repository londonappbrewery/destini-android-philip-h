package com.londonappbrewery.destini;

/**
 * Created by Philip on 11/15/2017.
 */

public class StoryArc
{
    private int storyId;
    private int topButtonTextId;
    private int bottomButtonTextId;

    public StoryArc(int storyId, int topButtonTextId, int bottomButtonTextId)
    {
        this.storyId = storyId;
        this.topButtonTextId = topButtonTextId;
        this.bottomButtonTextId = bottomButtonTextId;
    }

    public StoryArc(int endId)
    {
        this.storyId = endId;
        this.topButtonTextId = -1;
        this.bottomButtonTextId = -1;
    }

    public int getStoryId()
    {
        return storyId;
    }

    public void setStoryId(int storyId)
    {
        this.storyId = storyId;
    }

    public int getTopButtonTextId()
    {
        return topButtonTextId;
    }

    public void setTopButtonTextId(int topButtonTextId)
    {
        this.topButtonTextId = topButtonTextId;
    }

    public int getBottomButtonTextId()
    {
        return bottomButtonTextId;
    }

    public void setBottomButtonTextId(int bottomButtonTextId)
    {
        this.bottomButtonTextId = bottomButtonTextId;
    }

    @Override
    public String toString() {
        return "StoryArc{" +
                "storyId=" + storyId +
                ", topButtonTextId=" + topButtonTextId +
                ", bottomButtonTextId=" + bottomButtonTextId +
                '}';
    }
}