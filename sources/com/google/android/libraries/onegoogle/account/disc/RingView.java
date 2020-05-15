package com.google.android.libraries.onegoogle.account.disc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.os.Build;
import android.support.p002v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RingView extends AppCompatImageView {

    /* renamed from: a */
    public final Path f111392a = new Path();

    /* renamed from: b */
    public int f111393b = -1;

    /* renamed from: c */
    public int f111394c = -1;

    /* renamed from: d */
    public int f111395d = -1;

    public RingView(Context context) {
        super(context);
        int i = Build.VERSION.SDK_INT;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int i = this.f111395d;
        if (!(i == this.f111393b || i == -1)) {
            canvas.clipPath(this.f111392a);
        }
        super.onDraw(canvas);
        canvas.restore();
    }

    public RingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = Build.VERSION.SDK_INT;
    }

    public RingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = Build.VERSION.SDK_INT;
    }
}
