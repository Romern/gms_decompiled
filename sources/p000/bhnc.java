package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bhnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bhnc extends FrameLayout {

    /* renamed from: e */
    private static final View.OnTouchListener f119097e = new bhnb();

    /* renamed from: a */
    public int f119098a;

    /* renamed from: b */
    public final float f119099b;

    /* renamed from: c */
    public bhmw f119100c;

    /* renamed from: d */
    public bhmv f119101d;

    /* renamed from: f */
    private final float f119102f;

    /* renamed from: g */
    private ColorStateList f119103g;

    /* renamed from: h */
    private PorterDuff.Mode f119104h;

    protected bhnc(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bhmv bhmv = this.f119101d;
        if (bhmv != null) {
            int i = Build.VERSION.SDK_INT;
            WindowInsets rootWindowInsets = bhmv.f119092a.f119110e.getRootWindowInsets();
            if (rootWindowInsets != null) {
                bhmv.f119092a.f119115j = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                bhmv.f119092a.mo64017a();
            }
        }
        C1280ps.m19937s(this);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bhmv bhmv = this.f119101d;
        if (bhmv != null && bhmv.f119092a.mo64023f()) {
            bhnd.f119105a.post(new bhmu(bhmv));
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        bhmw bhmw = this.f119100c;
        if (bhmw != null) {
            bhnd bhnd = bhmw.f119093a;
            bhnd.f119110e.f119100c = null;
            bhnd.mo64024g();
        }
    }

    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        if (!(drawable == null || this.f119103g == null)) {
            drawable = drawable.mutate();
            int i = Build.VERSION.SDK_INT;
            C1173lt.m19601a(drawable, this.f119103g);
            C1173lt.m19604a(drawable, this.f119104h);
        }
        super.setBackgroundDrawable(drawable);
    }

    public final void setBackgroundTintList(ColorStateList colorStateList) {
        this.f119103g = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            int i = Build.VERSION.SDK_INT;
            C1173lt.m19601a(mutate, colorStateList);
            C1173lt.m19604a(mutate, this.f119104h);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f119104h = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            int i = Build.VERSION.SDK_INT;
            C1173lt.m19604a(mutate, mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener == null ? f119097e : null);
        super.setOnClickListener(onClickListener);
    }

    protected bhnc(Context context, AttributeSet attributeSet) {
        super(bhpq.m101285a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, bhne.f119122a);
        if (obtainStyledAttributes.hasValue(6)) {
            C1280ps.m19918f(this, (float) obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.f119098a = obtainStyledAttributes.getInt(2, 0);
        this.f119102f = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(bhky.m101077a(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(bhkn.m101062a(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f119099b = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f119097e);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(C0126R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(bhgk.m100859a(bhkx.m101073a(this, (int) C0126R.attr.colorSurface), bhkx.m101073a(this, (int) C0126R.attr.colorOnSurface), this.f119102f));
            if (this.f119103g != null) {
                int i = Build.VERSION.SDK_INT;
                C1173lt.m19601a(gradientDrawable, this.f119103g);
            } else {
                int i2 = Build.VERSION.SDK_INT;
            }
            C1280ps.m19890a(this, gradientDrawable);
        }
    }
}
