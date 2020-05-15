package com.google.android.gms.walletp2p.feature.widgets.pagerlayout;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PagerLayout extends FrameLayout {

    /* renamed from: a */
    public int f110753a = 0;

    /* renamed from: b */
    private Animation f110754b;

    /* renamed from: c */
    private Animation f110755c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f110756d;

    /* renamed from: e */
    private Map f110757e = new HashMap();

    /* renamed from: f */
    private Animation f110758f;

    /* renamed from: g */
    private Animation f110759g;

    /* renamed from: h */
    private Animation f110760h;

    /* renamed from: i */
    private Animation f110761i;

    public PagerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f110754b = AnimationUtils.loadAnimation(context, C0126R.anim.walletp2p_fade_in);
        this.f110755c = AnimationUtils.loadAnimation(context, C0126R.anim.walletp2p_fade_out);
        this.f110758f = AnimationUtils.loadAnimation(context, C0126R.anim.walletp2p_slide_in_left);
        this.f110759g = AnimationUtils.loadAnimation(context, C0126R.anim.walletp2p_slide_in_right);
        this.f110760h = AnimationUtils.loadAnimation(context, C0126R.anim.walletp2p_slide_out_left);
        this.f110761i = AnimationUtils.loadAnimation(context, C0126R.anim.walletp2p_slide_out_right);
        setMeasureAllChildren(true);
    }

    /* renamed from: b */
    public final void mo60211b(int i) {
        boolean z;
        if (i < getChildCount()) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        int i2 = this.f110753a;
        if (i != i2) {
            View childAt = getChildAt(i2);
            View childAt2 = getChildAt(i);
            if (chky.f188736a.mo6606a().mo85320a()) {
                this.f110756d = true;
                ObjectAnimator duration = ObjectAnimator.ofFloat(childAt2, "alpha", 0.0f, 1.0f).setDuration(350L);
                duration.addListener(new axln(this, childAt2, childAt));
                duration.start();
            } else {
                this.f110756d = true;
                this.f110755c.setAnimationListener(new axlo(childAt, childAt2));
                childAt.startAnimation(this.f110755c);
                this.f110754b.setAnimationListener(new axlp(this, childAt2));
                childAt2.startAnimation(this.f110754b);
            }
            this.f110753a = i;
        }
    }

    /* renamed from: c */
    public final void mo60212c(int i) {
        boolean z;
        if (i < getChildCount()) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        int i2 = this.f110753a;
        if (i != i2) {
            View childAt = getChildAt(i2);
            View childAt2 = getChildAt(i);
            this.f110756d = true;
            this.f110761i.setAnimationListener(new axll(childAt, childAt2));
            childAt.startAnimation(this.f110761i);
            this.f110758f.setAnimationListener(new axlm(this, childAt2));
            childAt2.startAnimation(this.f110758f);
            this.f110753a = i;
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f110756d) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        View view;
        if (this.f110757e.containsKey(Integer.valueOf(this.f110753a))) {
            view = getChildAt(((Integer) this.f110757e.get(Integer.valueOf(this.f110753a))).intValue());
        } else {
            view = getChildAt(this.f110753a);
        }
        measureChild(view, i, i2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), JGCastService.FLAG_PRIVATE_DISPLAY));
    }

    /* renamed from: a */
    public final void mo60208a() {
        boolean z;
        if (getChildCount() > 2) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        int i = this.f110753a;
        if (i != 2) {
            View childAt = getChildAt(i);
            View childAt2 = getChildAt(2);
            this.f110756d = true;
            this.f110760h.setAnimationListener(new axlj(childAt, childAt2));
            childAt.startAnimation(this.f110760h);
            this.f110759g.setAnimationListener(new axlk(this, childAt2));
            childAt2.startAnimation(this.f110759g);
            this.f110753a = 2;
        }
    }

    /* renamed from: a */
    public final void mo60209a(int i) {
        sdo.m34970a(i < getChildCount());
        getChildAt(this.f110753a).setVisibility(8);
        getChildAt(i).setVisibility(0);
        this.f110753a = i;
    }

    /* renamed from: a */
    public final void mo60210a(int i, int i2) {
        boolean z = true;
        sdo.m34970a(i < getChildCount());
        if (i2 >= getChildCount()) {
            z = false;
        }
        sdo.m34970a(z);
        this.f110757e.put(Integer.valueOf(i), Integer.valueOf(i2));
    }
}
