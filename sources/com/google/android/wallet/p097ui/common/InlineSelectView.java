package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.wallet.ui.common.InlineSelectView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InlineSelectView extends LinearLayout implements View.OnClickListener, bkdf, bjwg {

    /* renamed from: a */
    public bkee f152101a;

    /* renamed from: b */
    public bked f152102b = new bked(this);

    /* renamed from: c */
    public bjsv f152103c = new bjsv(this);

    /* renamed from: d */
    public boolean f152104d = true;

    /* renamed from: e */
    public int f152105e = -1;

    /* renamed from: f */
    public boolean[] f152106f;

    /* renamed from: g */
    Toast f152107g;

    /* renamed from: h */
    public bmpl f152108h;

    /* renamed from: i */
    public bjwp f152109i;

    /* renamed from: j */
    public bjwm f152110j;

    public InlineSelectView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final void m118616a(CharSequence charSequence) {
        Toast toast = this.f152107g;
        if (toast != null) {
            toast.cancel();
        }
        if (!TextUtils.isEmpty(charSequence)) {
            Toast makeText = Toast.makeText(getContext(), charSequence, 0);
            this.f152107g = makeText;
            makeText.show();
            return;
        }
        this.f152107g = null;
    }

    /* renamed from: b */
    private final void m118618b(int i, boolean z) {
        View findViewById;
        int i2;
        if (i >= 0 && i < getChildCount()) {
            View childAt = getChildAt(i);
            int a = bmpj.m108255a(this.f152108h.f130320e);
            if (a == 0) {
                a = 1;
            }
            int i3 = a - 1;
            if (i3 == 6) {
                CheckBox checkBox = (CheckBox) childAt.findViewById(C0126R.C0129id.check_box);
                if (checkBox != null) {
                    checkBox.setChecked(z);
                }
            } else if (i3 == 7) {
                RadioButton radioButton = (RadioButton) childAt.findViewById(C0126R.C0129id.radio_button);
                if (radioButton != null) {
                    radioButton.setChecked(z);
                    radioButton.invalidate();
                }
            } else if (i3 != 8 && (findViewById = childAt.findViewById(C0126R.C0129id.selection_indicator)) != null) {
                if (!z) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                findViewById.setVisibility(i2);
            }
        }
    }

    /* renamed from: U */
    public final bkdw mo52821U() {
        return null;
    }

    public final void addView(View view) {
        int childCount = getChildCount();
        super.addView(view);
        view.setTag(Integer.valueOf(childCount));
        view.setOnClickListener(this);
    }

    /* renamed from: c */
    public final String mo72020c() {
        StringBuilder sb = new StringBuilder();
        if (!m118617a(this.f152108h)) {
            int i = this.f152105e;
            if (i >= 0) {
                sb.append(((bmpk) this.f152108h.f130317b.get(i)).f130306g);
            }
        } else if (this.f152106f != null) {
            int i2 = 0;
            while (true) {
                boolean[] zArr = this.f152106f;
                if (i2 >= zArr.length) {
                    break;
                }
                if (zArr[i2]) {
                    if (sb.length() != 0) {
                        sb.append(",");
                        sb.append(((bmpk) this.f152108h.f130317b.get(i2)).f130306g);
                    } else {
                        sb.append(((bmpk) this.f152108h.f130317b.get(i2)).f130306g);
                    }
                }
                i2++;
            }
        }
        return sb.toString();
    }

    /* renamed from: cL */
    public final boolean mo65798cL() {
        if (!this.f152104d || this.f152105e >= 0) {
            return true;
        }
        boolean[] zArr = this.f152106f;
        if (zArr != null) {
            for (boolean z : zArr) {
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: cM */
    public final boolean mo65799cM() {
        boolean cL = mo65798cL();
        if (cL) {
            m118616a((CharSequence) null);
        } else {
            m118616a((CharSequence) getContext().getString(C0126R.string.wallet_uic_error_field_selection_required));
        }
        return cL;
    }

    /* renamed from: cN */
    public final boolean mo65800cN() {
        if (hasFocus() || !requestFocus()) {
            bkfr.m105602c(this);
        }
        return hasFocus();
    }

    /* renamed from: ch */
    public final bjwp mo60054ch() {
        return this.f152109i;
    }

    /* renamed from: ci */
    public final bjwm mo60055ci() {
        return this.f152110j;
    }

    public final CharSequence getError() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f152103c.mo65506a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.InlineSelectView.a(int, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.wallet.ui.common.InlineSelectView.a(java.lang.CharSequence, boolean):void
      com.google.android.wallet.ui.common.InlineSelectView.a(boolean[], boolean):void
      bkdf.a(java.lang.CharSequence, boolean):void
      com.google.android.wallet.ui.common.InlineSelectView.a(int, boolean):void */
    public void onClick(View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        if (m118617a(this.f152108h)) {
            boolean z = !this.f152106f[intValue];
            if (intValue >= 0 && intValue < getChildCount()) {
                this.f152106f[intValue] = z;
                m118618b(intValue, z);
                bkee bkee = this.f152101a;
                if (bkee != null) {
                    bkee.mo65890a(true);
                    return;
                }
                return;
            }
            return;
        }
        mo72017a(intValue, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.InlineSelectView.a(int, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.wallet.ui.common.InlineSelectView.a(java.lang.CharSequence, boolean):void
      com.google.android.wallet.ui.common.InlineSelectView.a(boolean[], boolean):void
      bkdf.a(java.lang.CharSequence, boolean):void
      com.google.android.wallet.ui.common.InlineSelectView.a(int, boolean):void */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superSavedInstanceState"));
        int i = 0;
        if (m118617a(this.f152108h)) {
            this.f152106f = bundle.getBooleanArray("multiSelectedItemIndices");
            while (true) {
                boolean[] zArr = this.f152106f;
                if (i >= zArr.length) {
                    break;
                }
                m118618b(i, zArr[i]);
                i++;
            }
        } else {
            mo72017a(bundle.getInt("selectedItemIndex", -1), false);
        }
        this.f152103c.mo65507a(bundle.getBundle("impressionLoggerState"));
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superSavedInstanceState", super.onSaveInstanceState());
        bundle.putInt("selectedItemIndex", this.f152105e);
        bundle.putBundle("impressionLoggerState", this.f152103c.mo65508b());
        bundle.putBooleanArray("multiSelectedItemIndices", this.f152106f);
        return bundle;
    }

    public final void setEnabled(boolean z) {
        boolean z2;
        super.setEnabled(z);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (!z || ((bmpk) this.f152108h.f130317b.get(i)).f130311l) {
                z2 = false;
            } else {
                z2 = true;
            }
            bkfr.m105608d(childAt, z2);
            childAt.setClickable(z2);
        }
    }

    public InlineSelectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public static boolean m118617a(bmpl bmpl) {
        int a;
        return (bmpl == null || (a = bmpj.m108255a(bmpl.f130320e)) == 0 || a != 7) ? false : true;
    }

    /* renamed from: a */
    public final String mo52823a(String str) {
        int i = this.f152105e;
        bmpl bmpl = this.f152108h;
        if (bmpl != null && i >= 0) {
            return bkft.m105633a((bmpk) bmpl.f130317b.get(i));
        }
        return "";
    }

    public InlineSelectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo72017a(int i, boolean z) {
        m118618b(this.f152105e, false);
        this.f152105e = i;
        m118618b(i, true);
        bkee bkee = this.f152101a;
        if (bkee != null) {
            bkee.mo65889a(this.f152105e, z);
        }
    }

    public InlineSelectView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    public final void mo65794a(CharSequence charSequence, boolean z) {
        throw new IllegalArgumentException("Errors not supported on InlineSelectView.");
    }

    /* renamed from: a */
    public final void mo72018a(boolean[] zArr, boolean z) {
        bkee bkee;
        boolean z2 = false;
        for (int i = 0; i < zArr.length; i++) {
            boolean z3 = zArr[i];
            boolean[] zArr2 = this.f152106f;
            if (z3 != zArr2[i]) {
                zArr2[i] = z3;
                m118618b(i, zArr[i]);
                z2 = true;
            }
        }
        if (z2 && (bkee = this.f152101a) != null) {
            bkee.mo65890a(z);
        }
    }

    /* renamed from: a */
    public final boolean mo65795a(Object obj) {
        return (obj instanceof Integer) && obj.equals(Integer.valueOf(this.f152105e));
    }
}
