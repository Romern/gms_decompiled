package com.google.android.gms.accountsettings.p007mg.poc.p008ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.OverScroller;
import android.widget.ScrollView;

/* renamed from: com.google.android.gms.accountsettings.mg.poc.ui.view.BottomNavMenuScrollView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BottomNavMenuScrollView extends ScrollView {

    /* renamed from: a */
    public int f7782a;

    /* renamed from: b */
    public int f7783b;

    /* renamed from: c */
    public boolean f7784c;

    /* renamed from: d */
    public exk f7785d;

    /* renamed from: e */
    private final OverScroller f7786e;

    /* renamed from: f */
    private float f7787f;

    public BottomNavMenuScrollView(Context context) {
        super(context);
        this.f7786e = new OverScroller(context);
    }

    /* renamed from: a */
    private final boolean m4981a(int i) {
        if (i < Math.round(((float) this.f7782a) * 0.75f)) {
            post(new exz(this));
            return true;
        } else if (i < this.f7782a) {
            post(new eya(this));
            return true;
        } else if (i >= this.f7783b) {
            return false;
        } else {
            post(new eyb(this));
            return true;
        }
    }

    public final void fling(int i) {
        int height = getHeight();
        this.f7786e.fling(getScrollX(), getScrollY(), 0, i, 0, 0, 0, Math.max(0, getChildAt(0).getHeight() - height));
        if (!m4981a(this.f7786e.getFinalY())) {
            super.fling(i);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            if (motionEvent.getY() >= this.f7787f) {
                z = false;
            }
            this.f7784c = z;
            this.f7787f = motionEvent.getY();
        } else if (motionEvent.getAction() == 1 && m4981a(getScrollY())) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public BottomNavMenuScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7786e = new OverScroller(context);
    }
}
