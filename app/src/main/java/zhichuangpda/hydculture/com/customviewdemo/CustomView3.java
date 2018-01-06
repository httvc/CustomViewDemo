package zhichuangpda.hydculture.com.customviewdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Android Studio
 * Project：CustomViewDemo
 * Author：httvc
 * Email：jfjie2013@163.com
 * Date：2018/1/5.
 */

public class CustomView3 extends View{
    public CustomView3(Context context) {
        super(context);
    }

    public CustomView3(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView3(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint=new Paint();
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Shader shader = new LinearGradient(100, 100, 500, 500, Color.parseColor("#E91E63"), Color.parseColor("#2196F3"), Shader.TileMode.CLAMP);
        paint.setShader(shader);
        canvas.drawCircle(200,200,100,paint);

        Shader radShader=new RadialGradient(600,200,100,Color.parseColor("#E91E63"), Color.parseColor("#2196F3"),Shader.TileMode.CLAMP);
        paint.setShader(radShader);
        canvas.drawCircle(600,200,100,paint);

       // new SweepGradient();

    }
}
