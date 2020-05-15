package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.stateful.ExtendableSavedState;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FloatingActionButton extends bhko implements bhie, bhmg, ail {

    /* renamed from: a */
    public int f151182a;

    /* renamed from: b */
    public boolean f151183b;

    /* renamed from: c */
    public final Rect f151184c;

    /* renamed from: e */
    private ColorStateList f151185e;

    /* renamed from: f */
    private PorterDuff.Mode f151186f;

    /* renamed from: g */
    private ColorStateList f151187g;

    /* renamed from: h */
    private int f151188h;

    /* renamed from: i */
    private int f151189i;

    /* renamed from: j */
    private int f151190j;

    /* renamed from: k */
    private int f151191k;

    /* renamed from: l */
    private final Rect f151192l;

    /* renamed from: m */
    private final C1499xv f151193m;

    /* renamed from: n */
    private final bhif f151194n;

    /* renamed from: o */
    private bhiv f151195o;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class BaseBehavior extends aim {

        /* renamed from: a */
        private Rect f151196a;

        /* renamed from: b */
        private boolean f151197b;

        public BaseBehavior() {
            this.f151197b = true;
        }

        /* renamed from: a */
        private final boolean m117590a(View view, FloatingActionButton floatingActionButton) {
            aip aip = (aip) floatingActionButton.getLayoutParams();
            if (this.f151197b && aip.f601f == view.getId() && floatingActionButton.f118917d == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        private final boolean m117592b(View view, FloatingActionButton floatingActionButton) {
            if (!m117590a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((aip) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.mo71166c();
                return true;
            }
            floatingActionButton.mo71167d();
            return true;
        }

        /* renamed from: d */
        private static boolean m117593d(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof aip) {
                return ((aip) layoutParams).f596a instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo764a(aip aip) {
            if (aip.f603h == 0) {
                aip.f603h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bhiz.f118779c);
            this.f151197b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior.a(android.view.View, com.google.android.material.floatingactionbutton.FloatingActionButton):boolean
         arg types: [com.google.android.material.appbar.AppBarLayout, com.google.android.material.floatingactionbutton.FloatingActionButton]
         candidates:
          com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior.a(android.view.View, android.graphics.Rect):boolean
          aim.a(android.view.View, android.os.Parcelable):void
          aim.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View):void
          aim.a(android.view.View, android.graphics.Rect):boolean
          aim.a(android.view.View, android.view.View):boolean
          com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior.a(android.view.View, com.google.android.material.floatingactionbutton.FloatingActionButton):boolean */
        /* renamed from: a */
        private final boolean m117591a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m117590a((View) appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f151196a == null) {
                this.f151196a = new Rect();
            }
            Rect rect = this.f151196a;
            bhjf.m101008a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.mo70982f()) {
                floatingActionButton.mo71166c();
                return true;
            }
            floatingActionButton.mo71167d();
            return true;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo771a(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.f151184c;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: ps.g(android.view.View, int):void
         arg types: [com.google.android.material.floatingactionbutton.FloatingActionButton, int]
         candidates:
          ps.g(android.view.View, float):void
          ps.g(android.view.View, int):void */
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo773a(CoordinatorLayout coordinatorLayout, View view, int i) {
            int i2;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List b = coordinatorLayout.mo1875b(floatingActionButton);
            int size = b.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) b.get(i4);
                if (!(view2 instanceof AppBarLayout)) {
                    if (m117593d(view2) && m117592b(view2, floatingActionButton)) {
                        break;
                    }
                } else if (m117591a(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo1876b(floatingActionButton, i);
            Rect rect = floatingActionButton.f151184c;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            aip aip = (aip) floatingActionButton.getLayoutParams();
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - aip.rightMargin) {
                i2 = rect.right;
            } else {
                i2 = floatingActionButton.getLeft() <= aip.leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - aip.bottomMargin) {
                i3 = rect.bottom;
            } else if (floatingActionButton.getTop() <= aip.topMargin) {
                i3 = -rect.top;
            }
            if (i3 != 0) {
                C1280ps.m19922g((View) floatingActionButton, i3);
            }
            if (i2 == 0) {
                return true;
            }
            C1280ps.m19924h(floatingActionButton, i2);
            return true;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo777a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m117591a(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
                return false;
            } else if (!m117593d(view2)) {
                return false;
            } else {
                m117592b(view2, floatingActionButton);
                return false;
            }
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private final int m117580a(int i) {
        int i2 = this.f151190j;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i == -1) {
            return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m117580a(1) : m117580a(0);
        }
        if (i != 1) {
            return resources.getDimensionPixelSize(C0126R.dimen.design_fab_size_normal);
        }
        return resources.getDimensionPixelSize(C0126R.dimen.design_fab_size_mini);
    }

    /* renamed from: e */
    private final bhiv m117583e() {
        if (this.f151195o == null) {
            int i = Build.VERSION.SDK_INT;
            this.f151195o = new bhix(this, new bhil(this));
        }
        return this.f151195o;
    }

    /* renamed from: b */
    public final int mo71165b() {
        return m117580a(this.f151189i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bhko.a(int, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.material.floatingactionbutton.FloatingActionButton.a(int, int):int
      com.google.android.material.floatingactionbutton.FloatingActionButton.a(com.google.android.material.floatingactionbutton.FloatingActionButton, android.graphics.drawable.Drawable):void
      bhko.a(int, boolean):void */
    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo71166c() {
        bhiv e = m117583e();
        if (e.f118749B.getVisibility() != 0) {
            if (e.f118776u != 2) {
                return;
            }
        } else if (e.f118776u == 1) {
            return;
        }
        Animator animator = e.f118770o;
        if (animator != null) {
            animator.cancel();
        }
        if (e.mo63839i()) {
            bhdp bhdp = e.f118772q;
            if (bhdp == null) {
                if (e.f118769n == null) {
                    e.f118769n = bhdp.m100679a(e.f118749B.getContext(), C0126R.animator.design_fab_hide_motion_spec);
                }
                bhdp = e.f118769n;
                C1244oj.m19766a(bhdp);
            }
            AnimatorSet a = e.mo63824a(bhdp, 0.0f, 0.0f, 0.0f);
            a.addListener(new bhim(e));
            a.start();
            return;
        }
        e.f118749B.mo63901a(4, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bhko.a(int, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.material.floatingactionbutton.FloatingActionButton.a(int, int):int
      com.google.android.material.floatingactionbutton.FloatingActionButton.a(com.google.android.material.floatingactionbutton.FloatingActionButton, android.graphics.drawable.Drawable):void
      bhko.a(int, boolean):void */
    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo71167d() {
        bhiv e = m117583e();
        if (e.f118749B.getVisibility() == 0) {
            if (e.f118776u != 1) {
                return;
            }
        } else if (e.f118776u == 2) {
            return;
        }
        Animator animator = e.f118770o;
        if (animator != null) {
            animator.cancel();
        }
        if (e.mo63839i()) {
            if (e.f118749B.getVisibility() != 0) {
                e.f118749B.setAlpha(0.0f);
                e.f118749B.setScaleY(0.0f);
                e.f118749B.setScaleX(0.0f);
                e.mo63825a(0.0f);
            }
            bhdp bhdp = e.f118771p;
            if (bhdp == null) {
                if (e.f118768m == null) {
                    e.f118768m = bhdp.m100679a(e.f118749B.getContext(), C0126R.animator.design_fab_show_motion_spec);
                }
                bhdp = e.f118768m;
                C1244oj.m19766a(bhdp);
            }
            AnimatorSet a = e.mo63824a(bhdp, 1.0f, 1.0f, 1.0f);
            a.addListener(new bhin(e));
            a.start();
            return;
        }
        e.f118749B.mo63901a(0, false);
        e.f118749B.setAlpha(1.0f);
        e.f118749B.setScaleY(1.0f);
        e.f118749B.setScaleX(1.0f);
        e.mo63825a(1.0f);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m117583e().mo63830a(getDrawableState());
    }

    public final ColorStateList getBackgroundTintList() {
        return this.f151185e;
    }

    public final PorterDuff.Mode getBackgroundTintMode() {
        return this.f151186f;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        m117583e().mo63834d();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bhiv e = m117583e();
        bhlr bhlr = e.f118758c;
        if (bhlr != null) {
            bhls.m101143a(e.f118749B, bhlr);
        }
        if (e.mo63837g()) {
            ViewTreeObserver viewTreeObserver = e.f118749B.getViewTreeObserver();
            if (e.f118750C == null) {
                e.f118750C = new bhip(e);
            }
            viewTreeObserver.addOnPreDrawListener(e.f118750C);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bhiv e = m117583e();
        ViewTreeObserver viewTreeObserver = e.f118749B.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = e.f118750C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            e.f118750C = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int b = mo71165b();
        this.f151182a = (b - this.f151191k) / 2;
        m117583e().mo63835e();
        int min = Math.min(m117581a(b, i), m117581a(b, i2));
        setMeasuredDimension(this.f151184c.left + min + this.f151184c.right, min + this.f151184c.top + this.f151184c.bottom);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.f1048b);
        bhif bhif = this.f151194n;
        Bundle bundle = (Bundle) extendableSavedState.f151229c.get("expandableWidgetHelper");
        C1244oj.m19766a(bundle);
        bhif.f118704b = bundle.getBoolean("expanded", false);
        bhif.f118705c = bundle.getInt("expandedComponentIdHint", 0);
        if (bhif.f118704b) {
            ViewParent parent = bhif.f118703a.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).mo1871a(bhif.f118703a);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        C1245ok okVar = extendableSavedState.f151229c;
        bhif bhif = this.f151194n;
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", bhif.f118704b);
        bundle.putInt("expandedComponentIdHint", bhif.f118705c);
        okVar.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.f151192l;
            if (C1280ps.m19868C(this)) {
                rect.set(0, 0, getWidth(), getHeight());
                mo71164a(rect);
                if (!this.f151192l.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public final void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public final void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f151185e != colorStateList) {
            this.f151185e = colorStateList;
            bhiv e = m117583e();
            bhlr bhlr = e.f118758c;
            if (bhlr != null) {
                bhlr.setTintList(colorStateList);
            }
            bhih bhih = e.f118760e;
            if (bhih != null) {
                bhih.mo63796a(colorStateList);
            }
        }
    }

    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f151186f != mode) {
            this.f151186f = mode;
            bhlr bhlr = m117583e().f118758c;
            if (bhlr != null) {
                bhlr.setTintMode(mode);
            }
        }
    }

    public final void setElevation(float f) {
        super.setElevation(f);
        m117583e().mo63832b(f);
    }

    public final void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            m117583e().mo63831b();
        }
    }

    public final void setImageResource(int i) {
        this.f151193m.mo16514a(i);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            C1173lt.m19611e(drawable);
        }
    }

    public final void setScaleX(float f) {
        super.setScaleX(f);
        m117583e();
    }

    public final void setScaleY(float f) {
        super.setScaleY(f);
        m117583e();
    }

    public final void setTranslationX(float f) {
        super.setTranslationX(f);
        m117583e();
    }

    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        m117583e();
    }

    public final void setTranslationZ(float f) {
        super.setTranslationZ(f);
        m117583e();
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(bhpq.m101285a(context, attributeSet, i, 2132019309), attributeSet, i);
        this.f151184c = new Rect();
        this.f151192l = new Rect();
        Context context2 = getContext();
        TypedArray a = bhki.m101052a(context2, attributeSet, bhiz.f118778b, i, 2132019309, new int[0]);
        this.f151185e = bhky.m101077a(context2, a, 1);
        this.f151186f = bhkn.m101062a(a.getInt(2, -1), (PorterDuff.Mode) null);
        this.f151187g = bhky.m101077a(context2, a, 12);
        this.f151189i = a.getInt(7, -1);
        this.f151190j = a.getDimensionPixelSize(6, 0);
        this.f151188h = a.getDimensionPixelSize(3, 0);
        float dimension = a.getDimension(4, 0.0f);
        float dimension2 = a.getDimension(9, 0.0f);
        float dimension3 = a.getDimension(11, 0.0f);
        this.f151183b = a.getBoolean(16, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0126R.dimen.mtrl_fab_min_touch_target);
        this.f151191k = a.getDimensionPixelSize(10, 0);
        bhdp a2 = bhdp.m100680a(context2, a, 15);
        bhdp a3 = bhdp.m100680a(context2, a, 8);
        bhlx a4 = bhlx.m101159a(context2, attributeSet, i, 2132019309, bhlx.f119029a).mo63972a();
        boolean z = a.getBoolean(5, false);
        setEnabled(a.getBoolean(0, true));
        a.recycle();
        C1499xv xvVar = new C1499xv(this);
        this.f151193m = xvVar;
        xvVar.mo16515a(attributeSet, i);
        this.f151194n = new bhif(this);
        m117583e().mo63829a(a4);
        m117583e().mo63827a(this.f151185e, this.f151186f, this.f151187g, this.f151188h);
        m117583e().f118767l = dimensionPixelSize;
        bhiv e = m117583e();
        if (e.f118764i != dimension) {
            e.f118764i = dimension;
            e.mo63826a(dimension, e.f118765j, e.f118766k);
        }
        bhiv e2 = m117583e();
        if (e2.f118765j != dimension2) {
            e2.f118765j = dimension2;
            e2.mo63826a(e2.f118764i, dimension2, e2.f118766k);
        }
        bhiv e3 = m117583e();
        if (e3.f118766k != dimension3) {
            e3.f118766k = dimension3;
            e3.mo63826a(e3.f118764i, e3.f118765j, dimension3);
        }
        bhiv e4 = m117583e();
        int i2 = this.f151191k;
        if (e4.f118775t != i2) {
            e4.f118775t = i2;
            e4.mo63831b();
        }
        m117583e().f118771p = a2;
        m117583e().f118772q = a3;
        m117583e().f118762g = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* renamed from: a */
    private static int m117581a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final aim mo762a() {
        return new Behavior();
    }

    /* renamed from: a */
    public final void mo71164a(Rect rect) {
        rect.left += this.f151184c.left;
        rect.top += this.f151184c.top;
        rect.right -= this.f151184c.right;
        rect.bottom -= this.f151184c.bottom;
    }

    /* renamed from: a */
    public final void mo63916a(bhlx bhlx) {
        m117583e().mo63829a(bhlx);
    }
}
