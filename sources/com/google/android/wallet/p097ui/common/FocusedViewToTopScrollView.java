package com.google.android.wallet.p097ui.common;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;

/* renamed from: com.google.android.wallet.ui.common.FocusedViewToTopScrollView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FocusedViewToTopScrollView extends CallbackListenerScrollView implements ViewTreeObserver.OnGlobalLayoutListener, Runnable, Animator.AnimatorListener {

    /* renamed from: a */
    private static final Interpolator f151962a = new AccelerateDecelerateInterpolator();

    /* renamed from: b */
    private int f151963b;

    /* renamed from: c */
    private boolean f151964c = false;

    /* renamed from: d */
    private boolean f151965d = false;

    /* renamed from: e */
    private Interpolator f151966e = f151962a;

    /* renamed from: f */
    private float f151967f;

    /* renamed from: g */
    private long f151968g = 500;

    /* renamed from: q */
    public int f151969q;

    /* renamed from: r */
    public boolean f151970r = true;

    /* renamed from: s */
    boolean f151971s = true;

    /* renamed from: t */
    public Animator.AnimatorListener f151972t;

    /* renamed from: u */
    public int f151973u = -1;

    /* renamed from: v */
    ValueAnimator f151974v = null;

    /* renamed from: w */
    int f151975w = -1;

    /* renamed from: x */
    bkdl f151976x;

    /* renamed from: y */
    bkdl f151977y;

    public FocusedViewToTopScrollView(Context context) {
        super(context);
        m118461a(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private final void mo52148a() {
        ValueAnimator valueAnimator = this.f151974v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* renamed from: b */
    private final void mo52150b() {
        removeCallbacks(this);
        this.f151976x = null;
    }

    /* access modifiers changed from: protected */
    public int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        if (!this.f151970r) {
            return super.computeScrollDeltaToGetChildRectOnScreen(rect);
        }
        int scrollY = getScrollY();
        int height = getHeight() + scrollY;
        int max = Math.max((rect.top - scrollY) - this.f151969q, -getScrollY());
        if (rect.bottom > height + max) {
            if (rect.height() > getHeight()) {
                max = rect.top - scrollY;
            } else {
                max = rect.bottom - height;
            }
        }
        if (Math.abs(max) > this.f151963b) {
            return max;
        }
        return 0;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        this.f151977y = null;
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onGlobalLayout() {
        mo71866h();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f151964c = true;
        super.onLayout(z, i, i2, i3, i4);
        this.f151964c = false;
        this.f151965d = true;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superInstanceState"));
        this.f151963b = bundle.getInt("thresholdToScroll");
        this.f151970r = bundle.getBoolean("scrollToTop");
        this.f151969q = bundle.getInt("focusedViewOffset");
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superInstanceState", super.onSaveInstanceState());
        bundle.putInt("thresholdToScroll", this.f151963b);
        bundle.putBoolean("scrollToTop", this.f151970r);
        bundle.putInt("focusedViewOffset", this.f151969q);
        return bundle;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        bkdl bkdl = this.f151977y;
        if (bkdl != null && bkdl.f124047a) {
            return true;
        }
        mo52148a();
        return super.onTouchEvent(motionEvent);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FocusedViewToTopScrollView.a(int, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.wallet.ui.common.FocusedViewToTopScrollView.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.FocusedViewToTopScrollView.a(int, boolean):void */
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        boolean z2;
        if (!this.f151971s) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (z) {
                m118460a(getScrollY() + computeScrollDeltaToGetChildRectOnScreen, false);
            } else {
                scrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
            }
        }
        return z2;
    }

    public final void run() {
        float f;
        TimeInterpolator timeInterpolator;
        Animator.AnimatorListener animatorListener;
        bkdl bkdl = this.f151977y;
        if (bkdl == null || !bkdl.f124048b) {
            bkdl bkdl2 = this.f151976x;
            if (!bkdl2.f124049c) {
                mo52148a();
                mo71901a(this.f151976x.f124050d);
            } else {
                int abs = Math.abs(bkdl2.f124050d - getScrollY());
                ValueAnimator valueAnimator = this.f151974v;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    f = 0.0f;
                } else {
                    ValueAnimator valueAnimator2 = this.f151974v;
                    float animatedFraction = valueAnimator2.getAnimatedFraction();
                    TimeInterpolator interpolator = valueAnimator2.getInterpolator();
                    float f2 = 0.001f;
                    if (animatedFraction + 0.001f > 1.0f) {
                        f2 = -0.001f;
                    }
                    f = (((interpolator.getInterpolation(animatedFraction + f2) - interpolator.getInterpolation(animatedFraction)) / f2) * ((float) this.f151975w)) / ((float) this.f151974v.getDuration());
                    this.f151974v.cancel();
                    this.f151974v.removeAllUpdateListeners();
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(getScrollY(), this.f151976x.f124050d);
                this.f151974v = ofInt;
                ofInt.addListener(this);
                this.f151974v.addUpdateListener(new bkdj(this));
                long min = Math.min((long) (((float) Math.abs(this.f151976x.f124050d - getScrollY())) / this.f151967f), this.f151968g);
                this.f151974v.setDuration(min);
                float f3 = (f * ((float) min)) / ((float) abs);
                ValueAnimator valueAnimator3 = this.f151974v;
                if (Float.compare(f3, 0.0f) != 0) {
                    timeInterpolator = new bkdk(this.f151966e, f3);
                } else {
                    timeInterpolator = this.f151966e;
                }
                valueAnimator3.setInterpolator(timeInterpolator);
                this.f151977y = this.f151976x;
                this.f151973u = getScrollY();
                this.f151975w = abs;
                if (this.f151977y.f124047a && (animatorListener = this.f151972t) != null) {
                    this.f151974v.addListener(animatorListener);
                }
                this.f151974v.start();
            }
        }
        mo52150b();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FocusedViewToTopScrollView.a(int, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.wallet.ui.common.FocusedViewToTopScrollView.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.FocusedViewToTopScrollView.a(int, boolean):void */
    public final void scrollTo(int i, int i2) {
        if (!this.f151971s || !this.f151965d) {
            mo71901a(i2);
        } else {
            m118460a(i2, true);
        }
    }

    public FocusedViewToTopScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m118461a(context, attributeSet);
    }

    /* renamed from: a */
    private final void m118460a(int i, boolean z) {
        if (this.f151964c && getScrollY() == i) {
            mo71901a(i);
            return;
        }
        bkdl bkdl = this.f151976x;
        if (bkdl != null) {
            if (!bkdl.f124048b) {
                mo52150b();
            } else {
                return;
            }
        }
        bkdl bkdl2 = this.f151977y;
        if (bkdl2 == null || Math.abs(bkdl2.f124050d - i) > this.f151963b || this.f151973u != getScrollY()) {
            this.f151976x = new bkdl(i, false, false, z);
            post(this);
        }
    }

    public FocusedViewToTopScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m118461a(context, attributeSet);
    }

    public FocusedViewToTopScrollView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m118461a(context, attributeSet);
    }

    /* renamed from: a */
    private final void m118461a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bkju.f124467e);
        this.f151969q = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f151963b = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
        this.f151968g = (long) obtainStyledAttributes.getInteger(2, 500);
        this.f151967f = bkfr.m105541a(obtainStyledAttributes.getDimension(0, 250.0f)) / 1000.0f;
        obtainStyledAttributes.recycle();
        setSmoothScrollingEnabled(false);
        getContext().getResources().getDisplayMetrics();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    /* renamed from: a */
    public final void mo71901a(int i) {
        super.scrollTo(getScrollX(), i);
    }

    /* renamed from: a */
    public final void mo71902a(int i, boolean z, boolean z2) {
        bkdl bkdl = this.f151976x;
        if (bkdl != null) {
            if (!bkdl.f124048b) {
                mo52150b();
            } else {
                return;
            }
        }
        if (!z) {
            mo52148a();
            mo71901a(i);
            Animator.AnimatorListener animatorListener = this.f151972t;
            if (animatorListener != null) {
                animatorListener.onAnimationEnd(null);
                return;
            }
            return;
        }
        this.f151976x = new bkdl(i, true, z2, true);
        post(this);
    }

    /* renamed from: a */
    public final void mo71903a(boolean z) {
        if (this.f151971s != z) {
            this.f151971s = z;
            if (!z) {
                bkdl bkdl = this.f151977y;
                if (bkdl != null && (bkdl.f124048b || this.f151976x == null)) {
                    mo71901a(bkdl.f124050d);
                } else {
                    bkdl bkdl2 = this.f151976x;
                    if (bkdl2 != null) {
                        mo71901a(bkdl2.f124050d);
                    }
                }
                mo52150b();
                mo52148a();
            }
        }
    }
}
