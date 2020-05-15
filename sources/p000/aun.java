package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: aun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aun extends auo implements aui {

    /* renamed from: a */
    ArrayList f2275a;

    /* renamed from: b */
    final Drawable.Callback f2276b;

    /* renamed from: d */
    private aul f2277d;

    /* renamed from: e */
    private Context f2278e;

    /* renamed from: f */
    private Animator.AnimatorListener f2279f;

    public aun() {
        this(null);
    }

    /* renamed from: a */
    public static aun m2131a(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        aun aun = new aun(context);
        aun.f2280c = C1163lk.m19268a(context.getResources(), i, context.getTheme());
        aun.f2280c.setCallback(aun.f2276b);
        new aum(aun.f2280c.getConstantState());
        return aun;
    }

    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f2280c;
        if (drawable != null) {
            C1173lt.m19602a(drawable, theme);
        }
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.f2280c;
        if (drawable != null) {
            return C1173lt.m19609c(drawable);
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            this.f2277d.f2270b.draw(canvas);
            if (this.f2277d.f2271c.isStarted()) {
                invalidateSelf();
                return;
            }
            return;
        }
        drawable.draw(canvas);
    }

    public final int getAlpha() {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            return this.f2277d.f2270b.getAlpha();
        }
        return C1173lt.m19607b(drawable);
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.f2280c;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        int i = this.f2277d.f2269a;
        return changingConfigurations;
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            return this.f2277d.f2270b.getColorFilter();
        }
        return C1173lt.m19610d(drawable);
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.f2280c == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        return new aum(this.f2280c.getConstantState());
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            return this.f2277d.f2270b.getIntrinsicHeight();
        }
        return drawable.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            return this.f2277d.f2270b.getIntrinsicWidth();
        }
        return drawable.getIntrinsicWidth();
    }

    public final int getOpacity() {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            return this.f2277d.f2270b.getOpacity();
        }
        return drawable.getOpacity();
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            return this.f2277d.f2270b.isAutoMirrored();
        }
        return C1173lt.m19606a(drawable);
    }

    public final boolean isRunning() {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            return this.f2277d.f2271c.isRunning();
        }
        return ((AnimatedVectorDrawable) drawable).isRunning();
    }

    public final boolean isStateful() {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            return this.f2277d.f2270b.isStateful();
        }
        return drawable.isStateful();
    }

    public final Drawable mutate() {
        Drawable drawable = this.f2280c;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            this.f2277d.f2270b.setBounds(rect);
        } else {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            return this.f2277d.f2270b.setLevel(i);
        }
        return drawable.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            return this.f2277d.f2270b.setState(iArr);
        }
        return drawable.setState(iArr);
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            this.f2277d.f2270b.setAlpha(i);
        } else {
            drawable.setAlpha(i);
        }
    }

    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            this.f2277d.f2270b.setAutoMirrored(z);
        } else {
            C1173lt.m19605a(drawable, z);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            this.f2277d.f2270b.setColorFilter(colorFilter);
        } else {
            drawable.setColorFilter(colorFilter);
        }
    }

    public final void setTint(int i) {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            this.f2277d.f2270b.setTint(i);
        } else {
            C1173lt.m19599a(drawable, i);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            this.f2277d.f2270b.setTintList(colorStateList);
        } else {
            C1173lt.m19601a(drawable, colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            this.f2277d.f2270b.setTintMode(mode);
        } else {
            C1173lt.m19604a(drawable, mode);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f2280c;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f2277d.f2270b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public final void start() {
        Drawable drawable = this.f2280c;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f2277d.f2271c.isStarted()) {
            this.f2277d.f2271c.start();
            invalidateSelf();
        }
    }

    public final void stop() {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            this.f2277d.f2271c.end();
        } else {
            ((AnimatedVectorDrawable) drawable).stop();
        }
    }

    private aun(Context context) {
        this.f2279f = null;
        this.f2275a = null;
        this.f2276b = new auj(this);
        this.f2278e = context;
        this.f2277d = new aul();
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            int eventType = xmlPullParser.getEventType();
            int depth = xmlPullParser.getDepth() + 1;
            while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if ("animated-vector".equals(name)) {
                        TypedArray a = C1164ll.m19313a(resources, theme, attributeSet, auf.f2263e);
                        int resourceId = a.getResourceId(0, 0);
                        if (resourceId != 0) {
                            aux a2 = aux.m2149a(resources, resourceId, theme);
                            a2.f2342d = false;
                            a2.setCallback(this.f2276b);
                            aux aux = this.f2277d.f2270b;
                            if (aux != null) {
                                aux.setCallback(null);
                            }
                            this.f2277d.f2270b = a2;
                        }
                        a.recycle();
                    } else if ("target".equals(name)) {
                        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, auf.f2264f);
                        String string = obtainAttributes.getString(0);
                        int resourceId2 = obtainAttributes.getResourceId(1, 0);
                        if (resourceId2 != 0) {
                            Context context = this.f2278e;
                            if (context != null) {
                                int i = Build.VERSION.SDK_INT;
                                Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                                loadAnimator.setTarget(this.f2277d.f2270b.f2341b.f2328b.f2321l.get(string));
                                int i2 = Build.VERSION.SDK_INT;
                                aul aul = this.f2277d;
                                if (aul.f2272d == null) {
                                    aul.f2272d = new ArrayList();
                                    this.f2277d.f2273e = new C1223np();
                                }
                                this.f2277d.f2272d.add(loadAnimator);
                                this.f2277d.f2273e.put(loadAnimator, string);
                            } else {
                                obtainAttributes.recycle();
                                throw new IllegalStateException("Context can't be null when inflating animators");
                            }
                        }
                        obtainAttributes.recycle();
                    } else {
                        continue;
                    }
                }
                eventType = xmlPullParser.next();
            }
            aul aul2 = this.f2277d;
            if (aul2.f2271c == null) {
                aul2.f2271c = new AnimatorSet();
            }
            aul2.f2271c.playTogether(aul2.f2272d);
            return;
        }
        C1173lt.m19603a(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    /* renamed from: a */
    private static void m2132a(AnimatedVectorDrawable animatedVectorDrawable, auh auh) {
        if (auh.f2266a == null) {
            auh.f2266a = new aug(auh);
        }
        animatedVectorDrawable.registerAnimationCallback(auh.f2266a);
    }

    /* renamed from: a */
    public static void m2133a(Drawable drawable, auh auh) {
        if (drawable != null && (drawable instanceof Animatable)) {
            int i = Build.VERSION.SDK_INT;
            m2132a((AnimatedVectorDrawable) drawable, auh);
        }
    }

    /* renamed from: a */
    public final void mo2526a() {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            Animator.AnimatorListener animatorListener = this.f2279f;
            if (animatorListener != null) {
                this.f2277d.f2271c.removeListener(animatorListener);
                this.f2279f = null;
            }
            ArrayList arrayList = this.f2275a;
            if (arrayList != null) {
                arrayList.clear();
                return;
            }
            return;
        }
        ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
    }

    /* renamed from: a */
    public final void mo2540a(auh auh) {
        Drawable drawable = this.f2280c;
        if (drawable != null) {
            m2132a((AnimatedVectorDrawable) drawable, auh);
        } else if (auh != null) {
            if (this.f2275a == null) {
                this.f2275a = new ArrayList();
            }
            if (!this.f2275a.contains(auh)) {
                this.f2275a.add(auh);
                if (this.f2279f == null) {
                    this.f2279f = new auk(this);
                }
                this.f2277d.f2271c.addListener(this.f2279f);
            }
        }
    }
}
