package com.example.myapplication;

import android.graphics.Canvas;
import android.graphics.Paint;

import android.view.View;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by Srijith on 28-01-2018.
 */

public class ImageItemDecoration extends RecyclerView.ItemDecoration {

  private Paint paint;

  public ImageItemDecoration() {
    paint = new Paint();
  }

  @Override
  public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
    paint.setColor(ContextCompat.getColor(parent.getContext(), R.color.white));
    int count = parent.getChildCount();
    for (int i = 0; i < count; i++) {
      View view = parent.getChildAt(i);
      int width = view.getRight();
      int height = view.getBottom();
      c.drawRect(width, 0, width + 4, height, paint);
    }
  }
}
