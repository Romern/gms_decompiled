package com.google.android.wallet.p097ui.date;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentManager;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: com.google.android.wallet.ui.date.DatePickerView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DatePickerView extends LinearLayout implements View.OnClickListener, DatePickerDialog.OnDateSetListener, bkhp, bkdf, bjwo {

    /* renamed from: a */
    public TextView f152276a;

    /* renamed from: b */
    public TextView f152277b;

    /* renamed from: c */
    public bmqf f152278c;

    /* renamed from: d */
    public bmpe f152279d;

    /* renamed from: e */
    public bjvf f152280e;

    /* renamed from: f */
    public FragmentManager f152281f;

    /* renamed from: g */
    Toast f152282g;

    /* renamed from: h */
    public DatePickerView f152283h;

    /* renamed from: i */
    private blxc f152284i;

    /* renamed from: j */
    private bjwn f152285j;

    public DatePickerView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final void m118798a(CharSequence charSequence) {
        Toast toast = this.f152282g;
        if (toast != null) {
            toast.cancel();
        }
        if (!TextUtils.isEmpty(charSequence)) {
            Toast makeText = Toast.makeText(getContext(), charSequence, 0);
            this.f152282g = makeText;
            makeText.show();
            return;
        }
        this.f152282g = null;
    }

    /* renamed from: a */
    private static boolean m118799a(blxc blxc) {
        if (blxc != null) {
            return blxc.f128040b == 0 && blxc.f128041c == 0 && blxc.f128042d == 0;
        }
        return true;
    }

    /* renamed from: U */
    public final bkdw mo52821U() {
        return null;
    }

    /* renamed from: cL */
    public final boolean mo65798cL() {
        return this.f152278c.f130378g || this.f152284i != null;
    }

    /* renamed from: cM */
    public final boolean mo65799cM() {
        boolean cL = mo65798cL();
        if (cL) {
            m118798a((CharSequence) null);
        } else {
            m118798a((CharSequence) getContext().getString(C0126R.string.wallet_uic_error_field_must_not_be_empty));
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

    /* renamed from: ci */
    public final bjwm mo60055ci() {
        if (this.f152285j == null) {
            this.f152285j = new bjwn(this);
        }
        return this.f152285j;
    }

    /* renamed from: g */
    public final int mo66001g() {
        blxc blxc = this.f152284i;
        if (blxc != null) {
            return blxc.f128042d;
        }
        return 0;
    }

    public final CharSequence getError() {
        return null;
    }

    /* renamed from: h */
    public final int mo66002h() {
        blxc blxc = this.f152284i;
        if (blxc != null) {
            return blxc.f128041c;
        }
        return 0;
    }

    /* renamed from: i */
    public final int mo66003i() {
        blxc blxc = this.f152284i;
        if (blxc != null) {
            return blxc.f128040b;
        }
        return 0;
    }

    public void onClick(View view) {
        if (this.f152281f != null) {
            blxc blxc = this.f152279d.f130283c;
            if (blxc == null) {
                blxc = blxc.f128037e;
            }
            blxc blxc2 = this.f152279d.f130284d;
            if (blxc2 == null) {
                blxc2 = blxc.f128037e;
            }
            if (this.f152283h != null) {
                int a = bmpb.m108247a(this.f152279d.f130288h);
                if (a != 0 && a == 2) {
                    blxc blxc3 = this.f152283h.f152284i;
                    if (m118799a(blxc2) || (!m118799a(blxc3) && new GregorianCalendar(blxc2.f128040b, blxc2.f128041c, blxc2.f128042d).compareTo((Calendar) new GregorianCalendar(blxc3.f128040b, blxc3.f128041c, blxc3.f128042d)) > 0)) {
                        blxc2 = blxc3;
                    }
                } else {
                    int a2 = bmpb.m108247a(this.f152279d.f130288h);
                    if (a2 != 0 && a2 == 3) {
                        blxc blxc4 = this.f152283h.f152284i;
                        if (m118799a(blxc) || (!m118799a(blxc4) && new GregorianCalendar(blxc.f128040b, blxc.f128041c, blxc.f128042d).compareTo((Calendar) new GregorianCalendar(blxc4.f128040b, blxc4.f128041c, blxc4.f128042d)) < 0)) {
                            blxc = blxc4;
                        }
                    }
                }
            }
            blxc blxc5 = this.f152284i;
            bkhq bkhq = new bkhq();
            Bundle bundle = new Bundle();
            bjvp.m104736a(bundle, "initialDate", blxc5);
            bjvp.m104736a(bundle, "minDate", blxc);
            bjvp.m104736a(bundle, "maxDate", blxc2);
            bkhq.setArguments(bundle);
            bkhq.f124227a = this;
            bkhq.show(this.f152281f, "DatePickerDialog");
            return;
        }
        throw new IllegalStateException("FragmentManager not set in DatePickerView.");
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        mo72135a(i, i2 + 1, i3);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f152276a = (TextView) findViewById(C0126R.C0129id.label);
        this.f152277b = (TextView) findViewById(C0126R.C0129id.date_text);
        setOnClickListener(this);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("parentState"));
            this.f152284i = (blxc) bjvp.m104730a(bundle, "currentDate", (bxxk) blxc.f128037e.mo74142c(7));
            setVisibility(bundle.getInt("viewVisibility"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parentState", super.onSaveInstanceState());
        bjvp.m104736a(bundle, "currentDate", this.f152284i);
        bundle.putInt("viewVisibility", getVisibility());
        return bundle;
    }

    public final void setEnabled(boolean z) {
        if (this.f152278c.f130379h) {
            z = false;
        }
        super.setEnabled(z);
        bkfr.m105608d(this, z);
    }

    public DatePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DatePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final String mo52823a(String str) {
        return this.f152277b.getText().toString();
    }

    /* renamed from: a */
    public final void mo72135a(int i, int i2, int i3) {
        this.f152277b.setText(this.f152280e.mo65561a(i3, i2, i));
        bxvd da = blxc.f128037e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blxc blxc = (blxc) da.f164949b;
        int i4 = blxc.f128039a | 4;
        blxc.f128039a = i4;
        blxc.f128042d = i3;
        int i5 = i4 | 2;
        blxc.f128039a = i5;
        blxc.f128041c = i2;
        blxc.f128039a = i5 | 1;
        blxc.f128040b = i;
        this.f152284i = (blxc) da.mo74062i();
    }

    /* renamed from: a */
    public final void mo65794a(CharSequence charSequence, boolean z) {
        throw new IllegalArgumentException("Errors not supported on DatePickerView.");
    }

    /* renamed from: a */
    public final boolean mo65795a(Object obj) {
        return this.f152277b.getText().toString().equals(obj);
    }
}
