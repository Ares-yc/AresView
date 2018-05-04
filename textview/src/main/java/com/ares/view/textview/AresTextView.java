package com.ares.view.textview;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * ====================================
 * 作    者：Ares(颜崔)
 * 地    址：https://github.com/Ares-yc
 * 描    述：
 * 版    本：1.0.0
 * 创建时间：2018/5/3.
 * 修改时间：2018/5/3.
 * ====================================
 */

public class AresTextView extends View{

    //构造函数会在项目里new的时候调用
    //AresTextView aresTextView = new AresTextView(this);
    public AresTextView(Context context) {
        super(context);
        Log.e("调试-->"+"AresTextView","new的时候调用");
    }

    //在布局layout中调用
    public AresTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        Log.e("调试-->"+"AresTextView","在布局layout中调用");
    }

    //在布局layout中调用,且有自定义Style
    public AresTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Log.e("调试-->"+"AresTextView","在布局layout中调用,且有自定义Style");
    }

    /**
     * 自定义View的测量方法
     * @param widthMeasureSpec
     * @param heightMeasureSpec
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        //布局的宽高都是由这个方法指定
        //指定布局的宽高，需要测量

        //获取宽高的模式
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);

        if (widthMode == MeasureSpec.AT_MOST){//在布局中指定了wrap_content

        }else if (widthMode == MeasureSpec.EXACTLY){//在布局中指定了确切的值  100dp match_parent

        }else if (widthMode == MeasureSpec.UNSPECIFIED){//尽可能的大,很少用到  ListView ScrollView

        }

    }

    /**
     * 用于绘制
     * @param canvas
     */
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    /**
     * 处理用户交互、触摸事件
     * @param event
     * @return
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }
}
