package com.jimmy.www.drawexercise.drawview;

import android.content.Context;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * <pre>
 *     author : Jimmy.tsang
 *     e-mail : jimmytsangfly@gmail.com
 *     time   : 2017/08/09
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class BasicDraw extends View {
    private Paint mPaint = new Paint();

    public BasicDraw(Context context) {
        super(context);
    }

    public BasicDraw(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BasicDraw(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

}
