package com.google.android.libraries.material.progress;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.PowerManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MaterialProgressBar extends ProgressBar {

    /* renamed from: a */
    private int f111309a;

    /* renamed from: b */
    private int f111310b;

    /* renamed from: c */
    private int f111311c;

    /* renamed from: d */
    private int f111312d;

    /* renamed from: e */
    private int f111313e;

    /* renamed from: f */
    private azyz f111314f;

    /* renamed from: g */
    private Drawable f111315g;

    static {
        MaterialProgressBar.class.getSimpleName();
    }

    private MaterialProgressBar(Context context) {
        super(context, null, 16842872);
        super.getProgress();
    }

    /* renamed from: a */
    private static int m94781a(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        StringBuilder sb = new StringBuilder(59);
        sb.append("Invalid attribute value for mtrlLinearGrowFrom: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    private final void m94784b(TypedArray typedArray, boolean z) {
        int i;
        float f;
        boolean z2;
        int[] iArr = azzi.f100318a;
        if (typedArray.hasValue(0)) {
            i = typedArray.getColor(0, -1);
        } else {
            i = getResources().getColor(C0126R.color.quantum_googblue);
        }
        int color = typedArray.getColor(8, -1);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{16842803});
        float f2 = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        int i2 = typedArray.getInt(6, 0);
        if (color != -1) {
            f = 1.0f;
        } else {
            f = f2;
        }
        if (z) {
            int i3 = this.f111312d;
            if (this.f111309a == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            setIndeterminateDrawable(new azzg(i3, i, color, f, z2, m94781a(i2)));
            return;
        }
        setProgressDrawable(new azzc(this.f111312d, i, color, f, m94781a(i2)));
    }

    /* renamed from: c */
    private final void m94785c() {
        m94786d();
        if (isIndeterminate()) {
            getProgressDrawable().setVisible(false, false);
            getIndeterminateDrawable().setVisible(m94788f(), true);
            return;
        }
        getProgressDrawable().setVisible(m94788f(), true);
        getIndeterminateDrawable().setVisible(false, false);
    }

    /* renamed from: d */
    private final void m94786d() {
        if (isIndeterminate()) {
            if (this.f111309a != 0) {
                setMinimumHeight(this.f111312d);
            } else {
                setMinimumHeight(0);
            }
        } else if (this.f111310b != 0) {
            setMinimumHeight(this.f111312d);
        } else {
            setMinimumHeight(0);
        }
    }

    /* renamed from: e */
    private final int m94787e() {
        return !isIndeterminate() ? this.f111310b : this.f111309a;
    }

    /* renamed from: f */
    private final boolean m94788f() {
        if (!C1280ps.m19871F(this) || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent != null) {
                if (!(parent instanceof View)) {
                    return true;
                }
                view = (View) parent;
            } else if (getWindowVisibility() != 0) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    private final Drawable m94789g() {
        return !isIndeterminate() ? getProgressDrawable() : getIndeterminateDrawable();
    }

    /* renamed from: h */
    private final void m94790h() {
        if (m94787e() == 0 && isIndeterminate()) {
            Context context = getContext();
            int i = Build.VERSION.SDK_INT;
            if (ValueAnimator.areAnimatorsEnabled()) {
                int i2 = Build.VERSION.SDK_INT;
                if (!((PowerManager) context.getSystemService("power")).isPowerSaveMode()) {
                    if (m94789g() != this.f111314f) {
                        this.f111315g.setVisible(false, false);
                        this.f111315g.setCallback(null);
                        unscheduleDrawable(this.f111315g);
                        setIndeterminateDrawable(this.f111314f);
                        onSizeChanged(getWidth(), getHeight(), getWidth(), getHeight());
                    }
                }
            }
            if (m94789g() != this.f111315g) {
                this.f111314f.mo55413a();
                this.f111314f.setCallback(null);
                unscheduleDrawable(this.f111314f);
                setIndeterminateDrawable(this.f111315g);
                onSizeChanged(getWidth(), getHeight(), getWidth(), getHeight());
            }
        }
        Drawable g = m94789g();
        if (g != null) {
            boolean f = m94788f();
            if ((g instanceof azys) && !f) {
                ((azys) g).mo55413a();
            } else {
                g.setVisible(f, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m94788f()) {
            mo60481a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        if (m94789g() instanceof azys) {
            ((azys) m94789g()).mo55413a();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (!(getPaddingLeft() == 0 && getPaddingTop() == 0)) {
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        }
        if (!(getPaddingRight() == 0 && getPaddingBottom() == 0)) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        m94789g().draw(canvas);
        canvas.restoreToCount(save);
    }

    /* access modifiers changed from: protected */
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (m94787e() == 0) {
            setMeasuredDimension(this.f111311c + getPaddingLeft() + getPaddingRight(), this.f111311c + getPaddingTop() + getPaddingBottom());
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int i3 = this.f111312d;
        int i4 = this.f111313e;
        setMeasuredDimension(measuredWidth, resolveSizeAndState(i3 + i4 + i4 + getPaddingTop() + getPaddingBottom(), i2, 0));
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (m94787e() != 0) {
            int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
            int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
            Drawable indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable != null) {
                indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
            }
            Drawable progressDrawable = getProgressDrawable();
            if (progressDrawable != null) {
                progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
                return;
            }
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m94790h();
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        m94790h();
    }

    public final synchronized void setIndeterminate(boolean z) {
        super.setIndeterminate(z);
        m94786d();
        Drawable g = m94789g();
        if (g != null) {
            g.setVisible(m94788f(), false);
        }
    }

    /* renamed from: a */
    private final void m94782a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, azzi.f100318a, i, 2132019334);
        this.f111312d = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f111313e = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        int i2 = obtainStyledAttributes.getInt(3, 0);
        this.f111309a = i2;
        if (i2 == 0) {
            m94783a(obtainStyledAttributes, true);
        } else if (i2 == 1 || i2 == 2) {
            m94784b(obtainStyledAttributes, true);
        } else {
            throw new IllegalArgumentException("Invalid determinate progress style");
        }
        int i3 = obtainStyledAttributes.getInt(2, 1);
        this.f111310b = i3;
        if (i3 == 0) {
            m94783a(obtainStyledAttributes, false);
        } else if (i3 == 1) {
            m94784b(obtainStyledAttributes, false);
        } else {
            throw new IllegalArgumentException("Invalid determinate progress style");
        }
        obtainStyledAttributes.recycle();
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.getProgress();
        m94782a(context, attributeSet, 0);
        m94785c();
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.getProgress();
        m94782a(context, attributeSet, i);
        m94785c();
    }

    /* renamed from: b */
    public final void mo60482b() {
        if (!m94788f()) {
            setVisibility(4);
            return;
        }
        Drawable g = m94789g();
        if (g instanceof azys) {
            ((azys) g).mo55414a(new azzh(this));
        } else {
            setVisibility(4);
        }
    }

    /* renamed from: a */
    private final void m94783a(TypedArray typedArray, boolean z) {
        int[] iArr;
        int i;
        int i2;
        int i3;
        int[] iArr2 = azzi.f100318a;
        int i4 = typedArray.getInt(7, 3);
        if (typedArray.hasValue(1)) {
            iArr = getResources().getIntArray(typedArray.getResourceId(1, -1));
        } else if (typedArray.hasValue(0)) {
            iArr = new int[]{typedArray.getColor(0, 0)};
        } else {
            iArr = null;
        }
        if (iArr == null) {
            iArr = getResources().getIntArray(C0126R.array.material_google_colors);
        }
        if (i4 == 1) {
            i = getResources().getDimensionPixelSize(C0126R.dimen.material_progress_circle_size_small);
        } else if (i4 == 2) {
            i = getResources().getDimensionPixelSize(C0126R.dimen.material_progress_circle_size_medium);
        } else if (i4 == 3) {
            i = getResources().getDimensionPixelSize(C0126R.dimen.material_progress_circle_size_large);
        } else {
            throw new IllegalStateException("Invalid progress circle size");
        }
        this.f111311c = i;
        if (i4 == 1) {
            i2 = getResources().getDimensionPixelSize(C0126R.dimen.material_progress_circle_stroke_width_small);
        } else if (i4 == 2) {
            i2 = getResources().getDimensionPixelSize(C0126R.dimen.material_progress_circle_stroke_width_medium);
        } else if (i4 == 3) {
            i2 = getResources().getDimensionPixelSize(C0126R.dimen.material_progress_circle_stroke_width_large);
        } else {
            throw new IllegalStateException("Invalid progress circle size");
        }
        if (i4 == 1) {
            i3 = getResources().getDimensionPixelSize(C0126R.dimen.material_progress_circle_inset_small);
        } else if (i4 == 2) {
            i3 = getResources().getDimensionPixelSize(C0126R.dimen.material_progress_circle_inset_medium);
        } else if (i4 == 3) {
            i3 = getResources().getDimensionPixelSize(C0126R.dimen.material_progress_circle_inset_large);
        } else {
            throw new IllegalStateException("Invalid progress circle size");
        }
        if (z) {
            this.f111315g = C1133kh.m17836a(getContext(), (int) C0126R.C0127drawable.quantum_ic_sync_grey600_24);
            azyz azyz = new azyz(i2, i3, iArr);
            this.f111314f = azyz;
            setIndeterminateDrawable(azyz);
            return;
        }
        setProgressDrawable(new azyv(i2, i3, iArr[0]));
    }

    /* renamed from: a */
    public final void mo60481a() {
        if (getVisibility() != 0) {
            setVisibility(0);
        } else if (m94788f()) {
            m94789g().setVisible(true, false);
        }
    }
}
