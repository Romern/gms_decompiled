package com.google.android.gms.nearby.sharing.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SelectionSlider extends FrameLayout {

    /* renamed from: a */
    public ImageView f81160a;

    /* renamed from: b */
    public int f81161b;

    /* renamed from: c */
    public abh f81162c;

    /* renamed from: d */
    public final abj f81163d = new akji(this);

    /* renamed from: e */
    private LinearLayout f81164e;

    /* renamed from: f */
    private final List f81165f = new ArrayList();

    /* renamed from: g */
    private int f81166g;

    /* renamed from: h */
    private int f81167h;

    /* renamed from: i */
    private VelocityTracker f81168i;

    /* renamed from: j */
    private float f81169j;

    public SelectionSlider(Context context) {
        super(context);
        m67628a(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private final void m67628a(Context context, AttributeSet attributeSet) {
        ImageView imageView = new ImageView(context);
        this.f81160a = imageView;
        imageView.setLayoutParams(generateDefaultLayoutParams());
        addView(this.f81160a);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f81164e = linearLayout;
        linearLayout.setLayoutParams(generateDefaultLayoutParams());
        addView(this.f81164e);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f81166g = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f81167h = viewConfiguration.getScaledMaximumFlingVelocity();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eoi.f15401m, 0, 0);
            if (obtainStyledAttributes.hasValue(0)) {
                this.f81160a.setImageDrawable(obtainStyledAttributes.getDrawable(0));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    private final int m67629b() {
        if (akiu.m59860a(getContext())) {
            return (((m67631c() - m67632d()) - 1) * getMeasuredWidth()) / m67631c();
        }
        return (m67632d() * getMeasuredWidth()) / m67631c();
    }

    /* renamed from: c */
    private final int m67631c() {
        abh abh = this.f81162c;
        if (abh != null) {
            return abh.mo161a();
        }
        return 0;
    }

    /* renamed from: d */
    private final int m67632d() {
        abh abh = this.f81162c;
        if (abh != null) {
            return ((ajuy) abh).f71344f;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        mo44665a(true);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0 || motionEvent.getX() <= ((float) m67629b()) || motionEvent.getX() >= ((float) (m67629b() + this.f81160a.getWidth()))) {
            return false;
        }
        this.f81169j = motionEvent.getX();
        if (this.f81168i == null) {
            this.f81168i = VelocityTracker.obtain();
        }
        this.f81168i.addMovement(motionEvent);
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            this.f81168i.addMovement(motionEvent);
            this.f81168i.computeCurrentVelocity(1000, (float) this.f81167h);
            float xVelocity = this.f81168i.getXVelocity();
            if (Math.abs(xVelocity) > ((float) this.f81166g)) {
                int width = getWidth() - this.f81160a.getWidth();
                if (akiu.m59860a(getContext())) {
                    i2 = -width;
                    i = 0;
                } else {
                    i = width;
                    i2 = 0;
                }
                ajs ajs = new ajs(this.f81160a, ajs.f664k);
                ajs.f671a = xVelocity;
                ajs.f680j.f683a = -16.8f;
                ajs.f677g = (float) i2;
                ajs.f676f = (float) i;
                akjh akjh = new akjh(this);
                if (!ajs.f679i.contains(akjh)) {
                    ajs.f679i.add(akjh);
                }
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    throw new AndroidRuntimeException("Animations may only be started on the main thread");
                } else if (!ajs.f675e) {
                    ajs.f675e = true;
                    float translationX = ((View) ajs.f673c).getTranslationX();
                    ajs.f672b = translationX;
                    if (translationX > ajs.f676f || translationX < ajs.f677g) {
                        throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                    }
                    ajp a = ajp.m880a();
                    if (a.f657c.size() == 0) {
                        a.mo834b().mo832a();
                    }
                    if (!a.f657c.contains(ajs)) {
                        a.f657c.add(ajs);
                    }
                }
            } else {
                mo44663a(mo44662a());
            }
            this.f81161b = 0;
            this.f81169j = 0.0f;
            this.f81168i.recycle();
            this.f81168i = null;
        } else if (actionMasked == 2) {
            this.f81168i.addMovement(motionEvent);
            int x = (int) ((motionEvent.getX() - this.f81169j) + ((float) m67629b()));
            this.f81161b = x;
            int max = Math.max(x, 0);
            this.f81161b = max;
            int min = Math.min(max, getWidth() - this.f81160a.getWidth());
            this.f81161b = min;
            if (akiu.m59860a(getContext())) {
                min += (-getWidth()) + this.f81160a.getWidth();
            }
            this.f81160a.setTranslationX((float) min);
        } else if (actionMasked == 3) {
            m67630b(true);
            this.f81161b = 0;
            this.f81169j = 0.0f;
            this.f81168i.recycle();
            this.f81168i = null;
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private final void m67630b(boolean z) {
        int b = m67629b();
        if (akiu.m59860a(getContext())) {
            b += (-getMeasuredWidth()) + this.f81160a.getWidth();
        }
        if (z && this.f81160a.isLaidOut()) {
            this.f81160a.animate().translationX((float) b);
            return;
        }
        this.f81160a.animate().cancel();
        this.f81160a.setTranslationX((float) b);
    }

    public SelectionSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m67628a(context, attributeSet);
    }

    public SelectionSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m67628a(context, attributeSet);
    }

    /* renamed from: a */
    public final int mo44662a() {
        int width = (this.f81161b + (this.f81160a.getWidth() / 2)) / this.f81160a.getWidth();
        if (akiu.m59860a(getContext())) {
            width = (m67631c() - width) - 1;
        }
        return Math.min(Math.max(width, 0), m67631c() - 1);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.nearby.sharing.view.SelectionSlider.a(int, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.gms.nearby.sharing.view.SelectionSlider.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.gms.nearby.sharing.view.SelectionSlider.a(int, boolean):void */
    /* renamed from: a */
    public final void mo44663a(int i) {
        mo44664a(i, true);
    }

    /* renamed from: a */
    public final void mo44664a(int i, boolean z) {
        if (this.f81162c == null) {
            return;
        }
        if (i < 0 || i > m67631c() - 1) {
            throw new IllegalArgumentException();
        }
        ((ajuy) this.f81162c).mo38953g(i);
        mo44665a(z);
    }

    /* renamed from: a */
    public final void mo44665a(boolean z) {
        if (this.f81162c != null) {
            this.f81160a.getLayoutParams().width = getMeasuredWidth() / this.f81162c.mo161a();
        } else {
            this.f81160a.getLayoutParams().width = -1;
        }
        invalidate();
        this.f81164e.removeAllViews();
        if (this.f81162c != null) {
            while (this.f81165f.size() > this.f81162c.mo161a()) {
                acm acm = (acm) this.f81165f.remove(0);
            }
            while (this.f81165f.size() < this.f81162c.mo161a()) {
                this.f81165f.add(this.f81162c.mo172b(this.f81164e, 0));
            }
            this.f81164e.setWeightSum((float) this.f81162c.mo161a());
            for (int i = 0; i < this.f81162c.mo161a(); i++) {
                this.f81162c.mo176b((acm) this.f81165f.get(i), i);
                View view = ((acm) this.f81165f.get(i)).f201a;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
                this.f81164e.addView(view, i);
            }
        }
        m67630b(z);
        int d = m67632d();
        for (int i2 = 0; i2 < m67631c(); i2++) {
            View view2 = ((acm) this.f81165f.get(i2)).f201a;
            if (i2 == d) {
                view2.setSelected(true);
            } else {
                view2.setSelected(false);
            }
        }
    }
}
