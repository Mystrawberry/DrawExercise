package com.jimmy.www.drawexercise.drawview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
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
public class DrawCircle extends View {
    private Paint mPaint = new Paint();

    public DrawCircle(Context context) {
        this(context, null);
    }

    public DrawCircle(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DrawCircle(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();

    }

    private void initPaint() {
        mPaint.setColor(Color.BLACK);
        mPaint.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //canvas.drawCircle(0,0,30,mPaint);
        // 绘制一个圆，如果cx,cy 是0开始的话，那么只能看到一半的圆
        // 这是因为绘制圆以cx.cy为圆点，就是中心点，以这个点的位置开始绘制圆
        //所以左边一部分的圆是看不到的


        // 绘制背景
        canvas.drawColor(Color.BLUE);
        canvas.drawCircle(90, 90, 30, mPaint);
        //canvas.drawColor(Color.YELLOW);

    }
}
