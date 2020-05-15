package com.google.android.gms.romanesco.restoresettings;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FastScroller extends RelativeLayout {

    /* renamed from: a */
    public apco f107303a;

    /* renamed from: b */
    public aah f107304b;

    /* renamed from: c */
    public boolean f107305c;

    /* renamed from: d */
    public View f107306d;

    /* renamed from: e */
    private final int f107307e;

    /* renamed from: f */
    private boolean f107308f;

    public FastScroller(Context context) {
        super(context);
        this.f107307e = context.getResources().getDimensionPixelSize(C0126R.dimen.fast_scroller_touch_target_width);
    }

    /* renamed from: a */
    private static final int m92321a(int i, int i2) {
        return Math.min(Math.max(0, i2), i);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f107306d = findViewById(C0126R.C0129id.fast_scroller_scroll_bar);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f107305c) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        float f = 0.0f;
        if (!this.f107308f && ((float) (getWidth() - this.f107307e)) - motionEvent.getX() > 0.0f) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                }
            }
            this.f107308f = false;
            this.f107306d.setSelected(false);
            return true;
        }
        this.f107308f = true;
        this.f107306d.setSelected(true);
        mo58854a(motionEvent.getY());
        float y = motionEvent.getY();
        int a = this.f107303a.mo161a();
        if (this.f107306d.getY() != 0.0f) {
            if (this.f107306d.getY() + ((float) this.f107306d.getHeight()) < ((float) getHeight())) {
                f = y / ((float) getHeight());
            } else {
                f = 1.0f;
            }
        }
        this.f107304b.mo63b(m92321a(a - 1, (int) (f * ((float) a))), 0);
        return true;
    }

    /* renamed from: a */
    public final void mo58854a(float f) {
        int height = this.f107306d.getHeight();
        this.f107306d.setY((float) m92321a(getHeight() - height, (int) (f - ((float) (height / 2)))));
    }

    public FastScroller(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f107307e = context.getResources().getDimensionPixelSize(C0126R.dimen.fast_scroller_touch_target_width);
    }
}
