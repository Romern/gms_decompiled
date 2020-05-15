package com.google.android.gms.common.widget.phone;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.LinearLayout;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SnackbarLayout extends LinearLayout {

    /* renamed from: a */
    public final int f30411a;

    /* renamed from: b */
    public final int f30412b;

    /* renamed from: c */
    public final int f30413c;

    /* renamed from: d */
    public final int f30414d;

    /* renamed from: e */
    public final int f30415e;

    /* renamed from: f */
    public suv f30416f;

    /* renamed from: g */
    public suw f30417g;

    public SnackbarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, suc.f45165a, 0, 0);
        this.f30411a = obtainStyledAttributes.getInt(3, 0);
        this.f30412b = obtainStyledAttributes.getInt(5, 0);
        this.f30413c = obtainStyledAttributes.getInt(4, 0);
        this.f30414d = (int) obtainStyledAttributes.getDimension(6, 0.0f);
        this.f30415e = (int) obtainStyledAttributes.getDimension(7, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        suv suv = this.f30416f;
        if (suv != null) {
            suu suu = (suu) suv;
            if (!suu.f45198a.get()) {
                ((WindowManager) suu.f45199b.getSystemService("window")).addView(suu.f45200c, suu.f45201d);
                suu.mo26136b();
            }
        }
        super.onDetachedFromWindow();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        suw suw = this.f30417g;
        if (suw != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                synchronized (suw) {
                    ((suu) suw).mo26137c();
                }
            } else if (actionMasked == 1) {
                ((suu) suw).mo26136b();
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public SnackbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, suc.f45165a, i, 0);
        this.f30411a = obtainStyledAttributes.getInt(3, 0);
        this.f30412b = obtainStyledAttributes.getInt(5, 0);
        this.f30413c = obtainStyledAttributes.getInt(4, 0);
        this.f30414d = (int) obtainStyledAttributes.getDimension(6, 0.0f);
        this.f30415e = (int) obtainStyledAttributes.getDimension(7, 0.0f);
        obtainStyledAttributes.recycle();
    }
}
