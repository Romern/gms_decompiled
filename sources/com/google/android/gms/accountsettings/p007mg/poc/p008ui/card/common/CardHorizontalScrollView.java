package com.google.android.gms.accountsettings.p007mg.poc.p008ui.card.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;

/* renamed from: com.google.android.gms.accountsettings.mg.poc.ui.card.common.CardHorizontalScrollView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CardHorizontalScrollView extends HorizontalScrollView {

    /* renamed from: a */
    private boolean f7759a;

    /* renamed from: b */
    private float f7760b;

    /* renamed from: c */
    private boolean f7761c;

    /* renamed from: d */
    private float f7762d;

    /* renamed from: e */
    private boolean f7763e;

    public CardHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private final boolean m4969a() {
        return canScrollHorizontally(-1);
    }

    /* renamed from: b */
    private final boolean m4971b() {
        return canScrollHorizontally(1);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f7763e = false;
            this.f7759a = true;
            this.f7760b = motionEvent.getX();
        } else if (actionMasked == 1) {
            this.f7763e = false;
        } else if (actionMasked == 2 && this.f7759a) {
            if (m4970a(motionEvent, this.f7760b)) {
                this.f7759a = false;
                if (!m4969a()) {
                    this.f7763e = true;
                }
            } else if (m4972b(motionEvent, this.f7760b)) {
                this.f7759a = false;
                if (!m4971b()) {
                    this.f7763e = true;
                }
            }
        }
        if (!this.f7763e) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f7763e) {
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f7761c = true;
            this.f7762d = motionEvent.getX();
        } else if (actionMasked == 1) {
            this.f7763e = false;
        } else if (actionMasked == 2 && this.f7761c) {
            if (m4970a(motionEvent, this.f7762d)) {
                this.f7761c = false;
                if (!m4969a()) {
                    this.f7763e = true;
                }
            } else if (m4972b(motionEvent, this.f7762d)) {
                this.f7761c = false;
                if (!m4971b()) {
                    this.f7763e = true;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private static final boolean m4970a(MotionEvent motionEvent, float f) {
        return motionEvent.getX() - f > 0.0f;
    }

    /* renamed from: b */
    private static final boolean m4972b(MotionEvent motionEvent, float f) {
        return motionEvent.getX() - f < 0.0f;
    }
}
