package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    StoryTree storyTree;
    TextView storyTextView;
    Button topButton, bottomButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        storyTextView = (TextView) findViewById(R.id.storyTextView);
        topButton = (Button) findViewById(R.id.buttonTop);
        bottomButton = (Button) findViewById(R.id.buttonBottom);

        initStoryLine();
        setWidgets();

        topButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                storyTree.goTop();
                setWidgets();
            }
        });


        bottomButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                storyTree.goBottom();
                setWidgets();
            }
        });
    }

    private void initStoryLine()
    {
        // Create the story line
        storyTree = new StoryTree(
                new StoryArc(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2)
        );
        // Create Top story line
        storyTree.insertTop(
                new StoryArc(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2)
        );
        storyTree.goTop();
        storyTree.insertTop(
                new StoryArc(R.string.T6_End)
        );
        storyTree.insertBottom(
                new StoryArc(R.string.T5_End)
        );
        storyTree.goRoot();
        // Create bottom Story Line
        storyTree.insertBottom(
                new StoryArc(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2)
        );
        storyTree.goBottom();
        storyTree.insertTop(
                new StoryArc(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2)
        );
        storyTree.insertBottom(
                new StoryArc(R.string.T4_End)
        );
        storyTree.goTop();
        storyTree.insertTop(
                new StoryArc(R.string.T6_End)
        );
        storyTree.insertBottom(
                new StoryArc(R.string.T5_End)
        );
        storyTree.goRoot();
    }

    private void setWidgets()
    {
        storyTextView.setText(storyTree.getCurrentStory().getStoryId());
        if (storyTree.isAtEnd())
        {
            topButton.setVisibility(View.INVISIBLE);
            bottomButton.setVisibility(View.INVISIBLE);
        } else
        {
            topButton.setText(storyTree.getCurrentStory().getTopButtonTextId());
            bottomButton.setText(storyTree.getCurrentStory().getBottomButtonTextId());
        }
    }
}
