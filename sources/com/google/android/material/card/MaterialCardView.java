package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MaterialCardView extends CardView implements Checkable, bhmg {

    /* renamed from: g */
    private static final int[] f151131g = {16842911};

    /* renamed from: h */
    private static final int[] f151132h = {16842912};

    /* renamed from: i */
    private final bhfx f151133i;

    /* renamed from: j */
    private boolean f151134j;

    /* renamed from: k */
    private boolean f151135k;

    public MaterialCardView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo1865a(float f) {
        super.mo1865a(f);
        this.f151133i.mo63681a();
    }

    /* renamed from: b */
    public final void mo1866b() {
        this.f151133i.mo63682a(ColorStateList.valueOf(0));
    }

    /* renamed from: d */
    public final boolean mo71062d() {
        bhfx bhfx = this.f151133i;
        return bhfx != null && bhfx.f118522r;
    }

    public final boolean isChecked() {
        return this.f151135k;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bhls.m101143a(this, this.f151133i.f118508d);
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (mo71062d()) {
            mergeDrawableStates(onCreateDrawableState, f151131g);
        }
        if (this.f151135k) {
            mergeDrawableStates(onCreateDrawableState, f151132h);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.f151135k);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(mo71062d());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f151135k);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        bhfx bhfx = this.f151133i;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (bhfx.f118519o != null) {
            int i5 = bhfx.f118510f;
            int i6 = bhfx.f118511g;
            int i7 = (measuredWidth - i5) - i6;
            int i8 = (measuredHeight - i5) - i6;
            int i9 = Build.VERSION.SDK_INT;
            if (bhfx.f118506b.f1475a) {
                float b = bhfx.mo63684b();
                int ceil = i8 - ((int) Math.ceil((double) (b + b)));
                float c = bhfx.mo63685c();
                i7 -= (int) Math.ceil((double) (c + c));
                i3 = ceil;
            } else {
                i3 = i8;
            }
            int i10 = bhfx.f118510f;
            int h = C1280ps.m19923h(bhfx.f118506b);
            if (h == 1) {
                i4 = i7;
            } else {
                i4 = i10;
            }
            bhfx.f118519o.setLayerInset(2, h == 1 ? i10 : i7, bhfx.f118510f, i4, i3);
        }
    }

    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        if (this.f151134j) {
            if (!this.f151133i.f118521q) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f151133i.f118521q = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public final void setChecked(boolean z) {
        if (this.f151135k != z) {
            toggle();
        }
    }

    public final void setClickable(boolean z) {
        Drawable drawable;
        super.setClickable(z);
        bhfx bhfx = this.f151133i;
        Drawable drawable2 = bhfx.f118513i;
        if (bhfx.f118506b.isClickable()) {
            drawable = bhfx.mo63689g();
        } else {
            drawable = bhfx.f118509e;
        }
        bhfx.f118513i = drawable;
        Drawable drawable3 = bhfx.f118513i;
        if (drawable2 != drawable3) {
            int i = Build.VERSION.SDK_INT;
            if (bhfx.f118506b.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) bhfx.f118506b.getForeground()).setDrawable(drawable3);
            } else {
                bhfx.f118506b.setForeground(bhfx.mo63680a(drawable3));
            }
        }
    }

    public final void toggle() {
        if (mo71062d() && isEnabled()) {
            this.f151135k = !this.f151135k;
            refreshDrawableState();
            int i = Build.VERSION.SDK_INT;
            bhfx bhfx = this.f151133i;
            Drawable drawable = bhfx.f118518n;
            if (drawable != null) {
                Rect bounds = drawable.getBounds();
                int i2 = bounds.bottom;
                bhfx.f118518n.setBounds(bounds.left, bounds.top, bounds.right, i2 - 1);
                bhfx.f118518n.setBounds(bounds.left, bounds.top, bounds.right, i2);
            }
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.materialCardViewStyle);
    }

    /* renamed from: a */
    public final void mo63916a(bhlx bhlx) {
        this.f151133i.mo63683a(bhlx);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(bhpq.m101285a(context, attributeSet, i, 2132019481), attributeSet, i);
        float f;
        Drawable drawable;
        this.f151135k = false;
        this.f151134j = true;
        TypedArray a = bhki.m101052a(getContext(), attributeSet, bhfy.f118526b, i, 2132019481, new int[0]);
        bhfx bhfx = new bhfx(this, attributeSet, i);
        this.f151133i = bhfx;
        bhfx.mo63682a(((ahq) this.f1479f.f550a).f556e);
        bhfx bhfx2 = this.f151133i;
        bhfx2.f118507c.set(this.f1477c.left, this.f1477c.top, this.f1477c.right, this.f1477c.bottom);
        float f2 = 0.0f;
        if ((!bhfx2.f118506b.f1476b || bhfx2.mo63686d()) && !bhfx2.mo63687e()) {
            f = 0.0f;
        } else {
            f = bhfx2.mo63688f();
        }
        if (bhfx2.f118506b.f1476b) {
            int i2 = Build.VERSION.SDK_INT;
            if (bhfx2.f118506b.f1475a) {
                double d = 1.0d - bhfx.f118504a;
                double b = (double) ahp.m764b(bhfx2.f118506b.f1479f);
                Double.isNaN(b);
                f2 = (float) (d * b);
            }
        }
        int i3 = (int) (f - f2);
        MaterialCardView materialCardView = bhfx2.f118506b;
        materialCardView.f1477c.set(bhfx2.f118507c.left + i3, bhfx2.f118507c.top + i3, bhfx2.f118507c.right + i3, bhfx2.f118507c.bottom + i3);
        ahp.m765c(materialCardView.f1479f);
        bhfx bhfx3 = this.f151133i;
        bhfx3.f118517m = bhky.m101077a(bhfx3.f118506b.getContext(), a, 8);
        if (bhfx3.f118517m == null) {
            bhfx3.f118517m = ColorStateList.valueOf(-1);
        }
        bhfx3.f118512h = a.getDimensionPixelSize(9, 0);
        boolean z = a.getBoolean(0, false);
        bhfx3.f118522r = z;
        bhfx3.f118506b.setLongClickable(z);
        bhfx3.f118516l = bhky.m101077a(bhfx3.f118506b.getContext(), a, 3);
        Drawable b2 = bhky.m101078b(bhfx3.f118506b.getContext(), a, 2);
        bhfx3.f118514j = b2;
        if (b2 != null) {
            Drawable mutate = b2.mutate();
            int i4 = Build.VERSION.SDK_INT;
            bhfx3.f118514j = mutate;
            C1173lt.m19601a(bhfx3.f118514j, bhfx3.f118516l);
        }
        if (bhfx3.f118519o != null) {
            bhfx3.f118519o.setDrawableByLayerId(C0126R.C0129id.mtrl_card_checked_layer_id, bhfx3.mo63690h());
        }
        bhfx3.f118515k = bhky.m101077a(bhfx3.f118506b.getContext(), a, 4);
        if (bhfx3.f118515k == null) {
            bhfx3.f118515k = ColorStateList.valueOf(bhkx.m101073a(bhfx3.f118506b, (int) C0126R.attr.colorControlHighlight));
        }
        ColorStateList a2 = bhky.m101077a(bhfx3.f118506b.getContext(), a, 1);
        bhfx3.f118509e.mo63948c(a2 == null ? ColorStateList.valueOf(0) : a2);
        if (!bhlg.f118948a || (drawable = bhfx3.f118518n) == null) {
            bhlr bhlr = bhfx3.f118520p;
            if (bhlr != null) {
                bhlr.mo63948c(bhfx3.f118515k);
            }
        } else {
            ((RippleDrawable) drawable).setColor(bhfx3.f118515k);
        }
        bhfx3.mo63681a();
        bhfx3.f118509e.mo63941a((float) bhfx3.f118512h, bhfx3.f118517m);
        super.setBackgroundDrawable(bhfx3.mo63680a(bhfx3.f118508d));
        bhfx3.f118513i = bhfx3.f118506b.isClickable() ? bhfx3.mo63689g() : bhfx3.f118509e;
        bhfx3.f118506b.setForeground(bhfx3.mo63680a(bhfx3.f118513i));
        a.recycle();
    }
}
