package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.p002v7.widget.AppCompatButton;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.felicanetworks.mfc.C0126R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MaterialButton extends AppCompatButton implements Checkable, bhmg {

    /* renamed from: c */
    private static final int[] f151118c = {16842911};

    /* renamed from: g */
    private static final int[] f151119g = {16842912};

    /* renamed from: d */
    public final bhfu f151120d;

    /* renamed from: e */
    public ColorStateList f151121e;

    /* renamed from: f */
    public int f151122f;

    /* renamed from: h */
    private final LinkedHashSet f151123h;

    /* renamed from: i */
    private PorterDuff.Mode f151124i;

    /* renamed from: j */
    private Drawable f151125j;

    /* renamed from: k */
    private int f151126k;

    /* renamed from: l */
    private int f151127l;

    /* renamed from: m */
    private int f151128m;

    /* renamed from: n */
    private boolean f151129n;

    /* renamed from: o */
    private boolean f151130o;

    public MaterialButton(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private final String mo52703a() {
        return (!mo71047d() ? Button.class : CompoundButton.class).getName();
    }

    /* renamed from: b */
    public final void mo71043b(int i) {
        if (this.f151128m != i) {
            this.f151128m = i;
            setCompoundDrawablePadding(i);
        }
    }

    /* renamed from: c */
    public final void mo71045c(boolean z) {
        Drawable drawable = this.f151125j;
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            Drawable mutate = drawable.mutate();
            this.f151125j = mutate;
            C1173lt.m19601a(mutate, this.f151121e);
            PorterDuff.Mode mode = this.f151124i;
            if (mode != null) {
                C1173lt.m19604a(this.f151125j, mode);
            }
            int i2 = this.f151126k;
            if (i2 == 0) {
                i2 = this.f151125j.getIntrinsicWidth();
            }
            int i3 = this.f151126k;
            if (i3 == 0) {
                i3 = this.f151125j.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f151125j;
            int i4 = this.f151127l;
            drawable2.setBounds(i4, 0, i2 + i4, i3);
        }
        int i5 = this.f151122f;
        boolean z2 = true;
        if (!(i5 == 1 || i5 == 2)) {
            z2 = false;
        }
        if (!z) {
            Drawable[] b = C1334rs.m20108b(this);
            Drawable drawable3 = b[0];
            Drawable drawable4 = b[2];
            if ((z2 && drawable3 != this.f151125j) || (!z2 && drawable4 != this.f151125j)) {
                mo52709a(z2);
                return;
            }
            return;
        }
        mo52709a(z2);
    }

    /* renamed from: cj */
    public final void mo71046cj() {
        boolean z;
        if (this.f151125j != null && getLayout() != null) {
            int i = this.f151122f;
            boolean z2 = true;
            if (i == 1 || i == 3) {
                this.f151127l = 0;
                mo71045c(false);
                return;
            }
            TextPaint paint = getPaint();
            String charSequence = getText().toString();
            if (getTransformationMethod() != null) {
                charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
            }
            int min = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
            int i2 = this.f151126k;
            if (i2 == 0) {
                i2 = this.f151125j.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - min) - C1280ps.m19927j(this)) - i2) - this.f151128m) - C1280ps.m19925i(this)) / 2;
            if (C1280ps.m19923h(this) != 1) {
                z = false;
            } else {
                z = true;
            }
            if (this.f151122f != 4) {
                z2 = false;
            }
            if (z != z2) {
                measuredWidth = -measuredWidth;
            }
            if (this.f151127l != measuredWidth) {
                this.f151127l = measuredWidth;
                mo71045c(false);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo71047d() {
        bhfu bhfu = this.f151120d;
        return bhfu != null && bhfu.f118501p;
    }

    /* renamed from: e */
    public final boolean mo71048e() {
        bhfu bhfu = this.f151120d;
        return bhfu != null && !bhfu.f118499n;
    }

    public final boolean isChecked() {
        return this.f151129n;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (mo71048e()) {
            bhls.m101143a(this, this.f151120d.mo63675c());
        }
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (mo71047d()) {
            mergeDrawableStates(onCreateDrawableState, f151118c);
        }
        if (this.f151129n) {
            mergeDrawableStates(onCreateDrawableState, f151119g);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(mo52703a());
        accessibilityEvent.setChecked(this.f151129n);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(mo52703a());
        accessibilityNodeInfo.setCheckable(mo71047d());
        accessibilityNodeInfo.setChecked(this.f151129n);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = Build.VERSION.SDK_INT;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        mo71046cj();
    }

    /* access modifiers changed from: protected */
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        mo71046cj();
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public final void setBackgroundColor(int i) {
        if (mo71048e()) {
            bhfu bhfu = this.f151120d;
            if (bhfu.mo63675c() != null) {
                bhfu.mo63675c().setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        if (!mo71048e()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
            this.f151120d.mo63672a();
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public final void setBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C1391tv.m20459b(getContext(), i);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    public final void setBackgroundTintList(ColorStateList colorStateList) {
        mo71041a(colorStateList);
    }

    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        mo71042a(mode);
    }

    public final void setChecked(boolean z) {
        if (mo71047d() && isEnabled() && this.f151129n != z) {
            this.f151129n = z;
            refreshDrawableState();
            if (!this.f151130o) {
                this.f151130o = true;
                Iterator it = this.f151123h.iterator();
                while (it.hasNext()) {
                    ((bhft) it.next()).mo63671a();
                }
                this.f151130o = false;
            }
        }
    }

    public final void setElevation(float f) {
        super.setElevation(f);
        if (mo71048e()) {
            this.f151120d.mo63675c().mo63949d(f);
        }
    }

    public final void toggle() {
        setChecked(!this.f151129n);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.materialButtonStyle);
    }

    /* renamed from: a */
    private final void mo52709a(boolean z) {
        if (!z) {
            C1334rs.m20105a(this, null, null, this.f151125j, null);
        } else {
            C1334rs.m20105a(this, this.f151125j, null, null, null);
        }
    }

    /* renamed from: b */
    public final void mo71044b(Drawable drawable) {
        if (this.f151125j != drawable) {
            this.f151125j = drawable;
            mo71045c(true);
        }
    }

    public final ColorStateList getBackgroundTintList() {
        adp adp;
        if (mo71048e()) {
            return this.f151120d.f118495j;
        }
        C1493xp xpVar = this.f1176b;
        if (xpVar == null || (adp = xpVar.f27600a) == null) {
            return null;
        }
        return adp.f285a;
    }

    public final PorterDuff.Mode getBackgroundTintMode() {
        adp adp;
        if (mo71048e()) {
            return this.f151120d.f118494i;
        }
        C1493xp xpVar = this.f1176b;
        if (xpVar == null || (adp = xpVar.f27600a) == null) {
            return null;
        }
        return adp.f286b;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.drawable.InsetDrawable.<init>(android.graphics.drawable.Drawable, int, int, int, int):void}
     arg types: [android.graphics.drawable.LayerDrawable, int, int, int, int]
     candidates:
      ClspMth{android.graphics.drawable.InsetDrawable.<init>(android.graphics.drawable.Drawable, float, float, float, float):void}
      ClspMth{android.graphics.drawable.InsetDrawable.<init>(android.graphics.drawable.Drawable, int, int, int, int):void} */
    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(bhpq.m101285a(context, attributeSet, i, 2132019469), attributeSet, i);
        this.f151123h = new LinkedHashSet();
        this.f151129n = false;
        this.f151130o = false;
        Context context2 = getContext();
        TypedArray a = bhki.m101052a(context2, attributeSet, bhfv.f118503a, i, 2132019469, new int[0]);
        this.f151128m = a.getDimensionPixelSize(12, 0);
        this.f151124i = bhkn.m101062a(a.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f151121e = bhky.m101077a(getContext(), a, 14);
        this.f151125j = bhky.m101078b(getContext(), a, 10);
        this.f151122f = a.getInteger(11, 1);
        this.f151126k = a.getDimensionPixelSize(13, 0);
        bhfu bhfu = new bhfu(this, bhlx.m101158a(context2, attributeSet, i, 2132019469).mo63972a());
        this.f151120d = bhfu;
        bhfu.f118488c = a.getDimensionPixelOffset(1, 0);
        bhfu.f118489d = a.getDimensionPixelOffset(2, 0);
        bhfu.f118490e = a.getDimensionPixelOffset(3, 0);
        bhfu.f118491f = a.getDimensionPixelOffset(4, 0);
        if (a.hasValue(8)) {
            int dimensionPixelSize = a.getDimensionPixelSize(8, -1);
            bhfu.f118492g = dimensionPixelSize;
            bhfu.mo63673a(bhfu.f118487b.mo63978a((float) dimensionPixelSize));
            bhfu.f118500o = true;
        }
        bhfu.f118493h = a.getDimensionPixelSize(20, 0);
        bhfu.f118494i = bhkn.m101062a(a.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        bhfu.f118495j = bhky.m101077a(bhfu.f118486a.getContext(), a, 6);
        bhfu.f118496k = bhky.m101077a(bhfu.f118486a.getContext(), a, 19);
        bhfu.f118497l = bhky.m101077a(bhfu.f118486a.getContext(), a, 16);
        bhfu.f118501p = a.getBoolean(5, false);
        int dimensionPixelSize2 = a.getDimensionPixelSize(9, 0);
        int i2 = C1280ps.m19925i(bhfu.f118486a);
        int paddingTop = bhfu.f118486a.getPaddingTop();
        int j = C1280ps.m19927j(bhfu.f118486a);
        int paddingBottom = bhfu.f118486a.getPaddingBottom();
        if (a.hasValue(0)) {
            bhfu.mo63672a();
        } else {
            MaterialButton materialButton = bhfu.f118486a;
            bhlr bhlr = new bhlr(bhfu.f118487b);
            bhlr.mo63942a(bhfu.f118486a.getContext());
            C1173lt.m19601a(bhlr, bhfu.f118495j);
            PorterDuff.Mode mode = bhfu.f118494i;
            if (mode != null) {
                C1173lt.m19604a(bhlr, mode);
            }
            bhlr.mo63941a((float) bhfu.f118493h, bhfu.f118496k);
            bhlr bhlr2 = new bhlr(bhfu.f118487b);
            bhlr2.setTint(0);
            bhlr2.mo63940a((float) bhfu.f118493h, 0);
            bhfu.f118498m = new bhlr(bhfu.f118487b);
            C1173lt.m19599a(bhfu.f118498m, -1);
            bhfu.f118502q = new RippleDrawable(bhlg.m101096b(bhfu.f118497l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{bhlr2, bhlr}), bhfu.f118488c, bhfu.f118490e, bhfu.f118489d, bhfu.f118491f), bhfu.f118498m);
            super.setBackgroundDrawable(bhfu.f118502q);
            bhlr c = bhfu.mo63675c();
            if (c != null) {
                c.mo63949d((float) dimensionPixelSize2);
            }
        }
        C1280ps.m19885a(bhfu.f118486a, i2 + bhfu.f118488c, paddingTop + bhfu.f118490e, j + bhfu.f118489d, paddingBottom + bhfu.f118491f);
        a.recycle();
        setCompoundDrawablePadding(this.f151128m);
        mo71045c(this.f151125j != null);
    }

    /* renamed from: a */
    public final void mo71041a(ColorStateList colorStateList) {
        if (mo71048e()) {
            bhfu bhfu = this.f151120d;
            if (bhfu.f118495j != colorStateList) {
                bhfu.f118495j = colorStateList;
                if (bhfu.mo63675c() != null) {
                    C1173lt.m19601a(bhfu.mo63675c(), bhfu.f118495j);
                    return;
                }
                return;
            }
            return;
        }
        C1493xp xpVar = this.f1176b;
        if (xpVar != null) {
            if (xpVar.f27600a == null) {
                xpVar.f27600a = new adp();
            }
            adp adp = xpVar.f27600a;
            adp.f285a = colorStateList;
            adp.f288d = true;
            xpVar.mo16498a();
        }
    }

    /* renamed from: a */
    public final void mo71042a(PorterDuff.Mode mode) {
        if (mo71048e()) {
            bhfu bhfu = this.f151120d;
            if (bhfu.f118494i != mode) {
                bhfu.f118494i = mode;
                if (bhfu.mo63675c() != null && bhfu.f118494i != null) {
                    C1173lt.m19604a(bhfu.mo63675c(), bhfu.f118494i);
                    return;
                }
                return;
            }
            return;
        }
        C1493xp xpVar = this.f1176b;
        if (xpVar != null) {
            if (xpVar.f27600a == null) {
                xpVar.f27600a = new adp();
            }
            adp adp = xpVar.f27600a;
            adp.f286b = mode;
            adp.f287c = true;
            xpVar.mo16498a();
        }
    }

    /* renamed from: a */
    public final void mo63916a(bhlx bhlx) {
        if (mo71048e()) {
            this.f151120d.mo63673a(bhlx);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }
}
