package p000;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: ayo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayo extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: a */
    public axw f2550a;

    /* renamed from: b */
    public final bel f2551b = new bel();

    /* renamed from: c */
    public boolean f2552c = true;

    /* renamed from: d */
    public final ArrayList f2553d;

    /* renamed from: e */
    public ImageView.ScaleType f2554e;

    /* renamed from: f */
    public String f2555f;

    /* renamed from: g */
    public bao f2556g;

    /* renamed from: h */
    public boolean f2557h;

    /* renamed from: i */
    public bch f2558i;

    /* renamed from: j */
    private final Matrix f2559j = new Matrix();

    /* renamed from: k */
    private float f2560k = 1.0f;

    /* renamed from: l */
    private final ValueAnimator.AnimatorUpdateListener f2561l;

    /* renamed from: m */
    private bap f2562m;

    /* renamed from: n */
    private int f2563n;

    /* renamed from: o */
    private final boolean f2564o;

    /* renamed from: p */
    private boolean f2565p;

    static {
        ayo.class.getSimpleName();
    }

    public ayo() {
        new HashSet();
        this.f2553d = new ArrayList();
        ayk ayk = new ayk(this);
        this.f2561l = ayk;
        this.f2563n = 255;
        this.f2564o = true;
        this.f2565p = false;
        this.f2551b.addUpdateListener(ayk);
    }

    /* renamed from: m */
    private final void m2443m() {
        axw axw = this.f2550a;
        if (axw != null) {
            float f = this.f2560k;
            setBounds(0, 0, (int) (((float) axw.f2513g.width()) * f), (int) (((float) this.f2550a.f2513g.height()) * f));
        }
    }

    /* renamed from: a */
    public final void mo2871a() {
        bcj a = bdl.m2735a(this.f2550a);
        axw axw = this.f2550a;
        this.f2558i = new bch(this, a, axw.f2512f, axw);
    }

    /* renamed from: b */
    public final void mo2879b() {
        bel bel = this.f2551b;
        if (bel.f3093i) {
            bel.cancel();
        }
        this.f2550a = null;
        this.f2558i = null;
        this.f2562m = null;
        bel bel2 = this.f2551b;
        bel2.f3092h = null;
        bel2.f3090f = -2.14748365E9f;
        bel2.f3091g = 2.14748365E9f;
        invalidateSelf();
    }

    /* renamed from: c */
    public final void mo2882c() {
        if (this.f2558i == null) {
            this.f2553d.add(new ayl(this));
            return;
        }
        if (this.f2552c || mo2892h() == 0) {
            bel bel = this.f2551b;
            bel.f3093i = true;
            boolean e = bel.mo3058e();
            for (Animator.AnimatorListener animatorListener : bel.f3081a) {
                int i = Build.VERSION.SDK_INT;
                animatorListener.onAnimationStart(bel, e);
            }
            bel.mo3050a((float) ((int) (!bel.mo3058e() ? bel.mo3059f() : bel.mo3060g())));
            bel.f3087c = 0;
            bel.f3089e = 0;
            bel.mo3064h();
        }
        if (!this.f2552c) {
            mo2874a((int) (mo2887g() >= 0.0f ? mo2886f() : mo2885e()));
            this.f2551b.mo3056d();
        }
    }

    /* renamed from: d */
    public final void mo2883d() {
        if (this.f2558i == null) {
            this.f2553d.add(new aym(this));
            return;
        }
        if (this.f2552c || mo2892h() == 0) {
            bel bel = this.f2551b;
            bel.f3093i = true;
            bel.mo3064h();
            bel.f3087c = 0;
            if (bel.mo3058e() && bel.f3088d == bel.mo3059f()) {
                bel.f3088d = bel.mo3060g();
            } else if (!bel.mo3058e() && bel.f3088d == bel.mo3060g()) {
                bel.f3088d = bel.mo3059f();
            }
        }
        if (!this.f2552c) {
            mo2874a((int) (mo2887g() >= 0.0f ? mo2886f() : mo2885e()));
            this.f2551b.mo3056d();
        }
    }

    public final void draw(Canvas canvas) {
        float f;
        float f2;
        this.f2565p = false;
        int i = -1;
        if (ImageView.ScaleType.FIT_XY == this.f2554e) {
            if (this.f2558i != null) {
                Rect bounds = getBounds();
                float width = ((float) bounds.width()) / ((float) this.f2550a.f2513g.width());
                float height = ((float) bounds.height()) / ((float) this.f2550a.f2513g.height());
                if (this.f2564o) {
                    float min = Math.min(width, height);
                    if (min < 1.0f) {
                        f2 = 1.0f / min;
                        width /= f2;
                        height /= f2;
                    } else {
                        f2 = 1.0f;
                    }
                    if (f2 > 1.0f) {
                        i = canvas.save();
                        float width2 = ((float) bounds.width()) / 2.0f;
                        float height2 = ((float) bounds.height()) / 2.0f;
                        float f3 = width2 * min;
                        float f4 = min * height2;
                        canvas.translate(width2 - f3, height2 - f4);
                        canvas.scale(f2, f2, f3, f4);
                    }
                }
                this.f2559j.reset();
                this.f2559j.preScale(width, height);
                this.f2558i.mo2923a(canvas, this.f2559j, this.f2563n);
                if (i > 0) {
                    canvas.restoreToCount(i);
                }
            }
        } else if (this.f2558i != null) {
            float f5 = this.f2560k;
            float min2 = Math.min(((float) canvas.getWidth()) / ((float) this.f2550a.f2513g.width()), ((float) canvas.getHeight()) / ((float) this.f2550a.f2513g.height()));
            if (f5 > min2) {
                f = this.f2560k / min2;
            } else {
                min2 = f5;
                f = 1.0f;
            }
            if (f > 1.0f) {
                i = canvas.save();
                float width3 = ((float) this.f2550a.f2513g.width()) / 2.0f;
                float height3 = ((float) this.f2550a.f2513g.height()) / 2.0f;
                float f6 = width3 * min2;
                float f7 = height3 * min2;
                float f8 = this.f2560k;
                canvas.translate((width3 * f8) - f6, (f8 * height3) - f7);
                canvas.scale(f, f, f6, f7);
            }
            this.f2559j.reset();
            this.f2559j.preScale(min2, min2);
            this.f2558i.mo2923a(canvas, this.f2559j, this.f2563n);
            if (i > 0) {
                canvas.restoreToCount(i);
            }
        }
        axq.m2409a();
    }

    /* renamed from: e */
    public final float mo2885e() {
        return this.f2551b.mo3059f();
    }

    /* renamed from: f */
    public final float mo2886f() {
        return this.f2551b.mo3060g();
    }

    /* renamed from: g */
    public final float mo2887g() {
        return this.f2551b.f3086b;
    }

    public final int getAlpha() {
        return this.f2563n;
    }

    public final int getIntrinsicHeight() {
        axw axw = this.f2550a;
        if (axw != null) {
            return (int) (((float) axw.f2513g.height()) * this.f2560k);
        }
        return -1;
    }

    public final int getIntrinsicWidth() {
        axw axw = this.f2550a;
        if (axw != null) {
            return (int) (((float) axw.f2513g.width()) * this.f2560k);
        }
        return -1;
    }

    public final int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public final int mo2892h() {
        return this.f2551b.getRepeatCount();
    }

    /* renamed from: i */
    public final boolean mo2893i() {
        bel bel = this.f2551b;
        if (bel != null) {
            return bel.f3093i;
        }
        return false;
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final void invalidateSelf() {
        if (!this.f2565p) {
            this.f2565p = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public final boolean isRunning() {
        return mo2893i();
    }

    /* renamed from: j */
    public final boolean mo2897j() {
        return this.f2550a.f2510d.mo15640c() > 0;
    }

    /* renamed from: k */
    public final float mo2898k() {
        return this.f2551b.mo3052b();
    }

    /* renamed from: l */
    public final bap mo2899l() {
        Context context;
        if (getCallback() == null) {
            return null;
        }
        bap bap = this.f2562m;
        if (bap != null) {
            Drawable.Callback callback = getCallback();
            if (callback == null || !(callback instanceof View)) {
                context = null;
            } else {
                context = ((View) callback).getContext();
            }
            if (!(context == null && bap.f2789a == null) && !bap.f2789a.equals(context)) {
                this.f2562m = null;
            }
        }
        if (this.f2562m == null) {
            this.f2562m = new bap(getCallback(), this.f2555f, this.f2550a.f2508b);
        }
        return this.f2562m;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public final void setAlpha(int i) {
        this.f2563n = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        bek.m2805a("Use addColorFilter instead.");
    }

    public final void start() {
        mo2882c();
    }

    public final void stop() {
        this.f2553d.clear();
        this.f2551b.mo3056d();
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: a */
    public final void mo2872a(float f) {
        axw axw = this.f2550a;
        if (axw == null) {
            this.f2553d.add(new ayi(this, f));
            return;
        }
        this.f2551b.mo3050a(bem.m2819a(axw.f2514h, axw.f2515i, f));
        axq.m2409a();
    }

    /* renamed from: b */
    public final void mo2880b(float f) {
        this.f2560k = f;
        m2443m();
    }

    /* renamed from: a */
    public final void mo2873a(float f, float f2) {
        axw axw = this.f2550a;
        if (axw != null) {
            float a = bem.m2819a(axw.f2514h, axw.f2515i, f);
            axw axw2 = this.f2550a;
            mo2875a((int) a, (int) bem.m2819a(axw2.f2514h, axw2.f2515i, f2));
            return;
        }
        this.f2553d.add(new ayg(this, f, f2));
    }

    /* renamed from: b */
    public final void mo2881b(int i) {
        this.f2551b.setRepeatCount(i);
    }

    /* renamed from: a */
    public final void mo2874a(int i) {
        if (this.f2550a == null) {
            this.f2553d.add(new ayh(this, i));
        } else {
            this.f2551b.mo3050a((float) i);
        }
    }

    /* renamed from: a */
    public final void mo2875a(int i, int i2) {
        if (this.f2550a == null) {
            this.f2553d.add(new ayf(this, i, i2));
        } else {
            this.f2551b.mo3051a((float) i, ((float) i2) + 0.99f);
        }
    }

    /* renamed from: a */
    public final void mo2876a(bau bau, Object obj, beq beq) {
        if (this.f2558i != null) {
            bav bav = bau.f2814a;
            if (bav == null) {
                ArrayList arrayList = new ArrayList();
                this.f2558i.mo2925a(bau, 0, arrayList, new bau(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((bau) arrayList.get(i)).f2814a.mo2926a(obj, beq);
                }
                if (arrayList.isEmpty()) {
                    return;
                }
            } else {
                bav.mo2926a(obj, beq);
            }
            invalidateSelf();
            if (obj == ayt.f2571A) {
                mo2872a(mo2898k());
                return;
            }
            return;
        }
        this.f2553d.add(new ayj(this, bau, obj, beq));
    }

    /* renamed from: a */
    public final void mo2877a(String str, Bitmap bitmap) {
        bap l = mo2899l();
        if (l == null) {
            bek.m2805a("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return;
        }
        if (bitmap == null) {
            ayp ayp = (ayp) l.f2791c.get(str);
            Bitmap bitmap2 = ayp.f2570e;
            ayp.f2570e = null;
        } else {
            Bitmap bitmap3 = ((ayp) l.f2791c.get(str)).f2570e;
            l.mo2958a(str, bitmap);
        }
        invalidateSelf();
    }

    /* renamed from: a */
    public final boolean mo2878a(axw axw) {
        if (this.f2550a == axw) {
            return false;
        }
        this.f2565p = false;
        mo2879b();
        this.f2550a = axw;
        mo2871a();
        bel bel = this.f2551b;
        axw axw2 = bel.f3092h;
        bel.f3092h = axw;
        if (axw2 != null) {
            bel.mo3051a((float) ((int) axw.f2514h), (float) ((int) axw.f2515i));
        } else {
            bel.mo3051a((float) ((int) Math.max(bel.f3090f, axw.f2514h)), (float) ((int) Math.min(bel.f3091g, axw.f2515i)));
        }
        float f = bel.f3088d;
        bel.f3088d = 0.0f;
        bel.mo3050a((float) ((int) f));
        mo2872a(this.f2551b.getAnimatedFraction());
        mo2880b(this.f2560k);
        m2443m();
        Iterator it = new ArrayList(this.f2553d).iterator();
        while (it.hasNext()) {
            ((ayn) it.next()).mo2869a();
            it.remove();
        }
        this.f2553d.clear();
        return true;
    }
}
