package com.google.android.gms.nearby.sharing.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.p002v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RoundedCornerRectImageView extends AppCompatImageView {

    /* renamed from: a */
    public int f81154a;

    /* renamed from: b */
    private final float f81155b;

    /* renamed from: c */
    private final Path f81156c = new Path();

    /* renamed from: d */
    private final Paint f81157d = new Paint(0);

    /* renamed from: e */
    private final Paint f81158e = new Paint(1);

    /* renamed from: f */
    private final Paint f81159f = new Paint(0);

    public RoundedCornerRectImageView(Context context) {
        super(context);
        this.f81155b = (float) akim.m59828a(context, 8);
        this.f81157d.setColor(-1728053248);
        this.f81157d.setStyle(Paint.Style.FILL);
        this.f81159f.setColor(akim.m59831c(context));
        this.f81159f.setStyle(Paint.Style.STROKE);
        this.f81159f.setStrokeWidth((float) akim.m59828a(context, 1));
        this.f81158e.setColor(-1);
        this.f81158e.setTextSize((float) akim.m59828a(context, 20));
        this.f81158e.setTextAlign(Paint.Align.CENTER);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        Canvas canvas2 = canvas;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth();
        int paddingRight = getPaddingRight();
        int paddingLeft2 = getPaddingLeft();
        int height = getHeight();
        int paddingBottom = getPaddingBottom();
        int paddingTop2 = getPaddingTop();
        Path path = this.f81156c;
        float f4 = (float) paddingLeft;
        float f5 = (float) paddingTop;
        float f6 = (float) ((width - paddingRight) - paddingLeft2);
        float f7 = (float) ((height - paddingBottom) - paddingTop2);
        float f8 = this.f81155b;
        path.addRoundRect(f4, f5, f6, f7, f8, f8, Path.Direction.CW);
        canvas2.clipPath(this.f81156c);
        super.onDraw(canvas);
        if (this.f81154a > 0) {
            f3 = f4;
            f2 = f5;
            f = f6;
            canvas.drawRect(f3, f2, f6, f7, this.f81157d);
            int width2 = getWidth();
            int height2 = getHeight();
            float descent = this.f81158e.descent();
            float ascent = this.f81158e.ascent();
            int i = this.f81154a;
            StringBuilder sb = new StringBuilder(12);
            sb.append("+");
            sb.append(i);
            canvas2.drawText(sb.toString(), (float) (width2 / 2), (float) ((int) ((((float) height2) / 2.0f) - ((descent + ascent) / 2.0f))), this.f81158e);
        } else {
            f3 = f4;
            f2 = f5;
            f = f6;
        }
        float f9 = this.f81155b;
        canvas.drawRoundRect(f3, f2, f, f7, f9, f9, this.f81159f);
    }

    public RoundedCornerRectImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f81155b = (float) akim.m59828a(context, 8);
        this.f81157d.setColor(-1728053248);
        this.f81157d.setStyle(Paint.Style.FILL);
        this.f81159f.setColor(akim.m59831c(context));
        this.f81159f.setStyle(Paint.Style.STROKE);
        this.f81159f.setStrokeWidth((float) akim.m59828a(context, 1));
        this.f81158e.setColor(-1);
        this.f81158e.setTextSize((float) akim.m59828a(context, 20));
        this.f81158e.setTextAlign(Paint.Align.CENTER);
    }

    public RoundedCornerRectImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f81155b = (float) akim.m59828a(context, 8);
        this.f81157d.setColor(-1728053248);
        this.f81157d.setStyle(Paint.Style.FILL);
        this.f81159f.setColor(akim.m59831c(context));
        this.f81159f.setStyle(Paint.Style.STROKE);
        this.f81159f.setStrokeWidth((float) akim.m59828a(context, 1));
        this.f81158e.setColor(-1);
        this.f81158e.setTextSize((float) akim.m59828a(context, 20));
        this.f81158e.setTextAlign(Paint.Align.CENTER);
    }
}
