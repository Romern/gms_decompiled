package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.clientlog.LogContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.google.android.wallet.ui.common.RegionCodeView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RegionCodeView extends FrameLayout implements bkey, bjwp, bkdf {

    /* renamed from: a */
    private boolean f152180a;

    /* renamed from: b */
    private int f152181b;

    /* renamed from: c */
    private bjwk f152182c;

    /* renamed from: d */
    public TextView f152183d;

    /* renamed from: e */
    public RegionCodeSelectorSpinner f152184e;

    /* renamed from: f */
    public bmdn f152185f;

    /* renamed from: g */
    public boolean f152186g;

    /* renamed from: h */
    public bkey f152187h;

    /* renamed from: i */
    private final ArrayList f152188i = new ArrayList();

    public RegionCodeView(Context context) {
        super(context);
    }

    /* renamed from: U */
    public final bkdw mo52821U() {
        return null;
    }

    /* renamed from: a */
    public final int mo72078a() {
        return !this.f152186g ? this.f152184e.mo72077i() : this.f152181b;
    }

    /* renamed from: a */
    public final void mo52946a(bjwk bjwk) {
        this.f152182c = bjwk;
    }

    /* renamed from: cL */
    public final boolean mo65798cL() {
        return this.f152186g || this.f152184e.mo65798cL();
    }

    /* renamed from: cM */
    public final boolean mo65799cM() {
        return this.f152186g || this.f152184e.mo65799cM();
    }

    /* renamed from: cN */
    public final boolean mo65800cN() {
        if (!this.f152186g) {
            return this.f152184e.mo65800cN();
        }
        if (this.f152183d.hasFocus() || !this.f152183d.requestFocus()) {
            bkfr.m105602c(this.f152183d);
        }
        return this.f152183d.hasFocus();
    }

    public final CharSequence getError() {
        if (!this.f152186g) {
            return this.f152184e.getError();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        RegionCodeSelectorSpinner regionCodeSelectorSpinner = (RegionCodeSelectorSpinner) findViewById(C0126R.C0129id.region_code_spinner);
        this.f152184e = regionCodeSelectorSpinner;
        regionCodeSelectorSpinner.f152061o = getContext().getString(C0126R.string.wallet_uic_address_field_country);
        this.f152183d = (TextView) findViewById(C0126R.C0129id.region_code_text);
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f152184e.setEnabled(z);
        this.f152183d.setEnabled(z);
    }

    /* renamed from: a */
    public final String mo52823a(String str) {
        if (this.f152186g) {
            return this.f152183d.getText().toString();
        }
        return this.f152184e.mo52823a((String) null);
    }

    public RegionCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo72079a(int i) {
        int position;
        if (this.f152180a) {
            this.f152181b = i;
            if (!this.f152186g) {
                RegionCodeSelectorSpinner regionCodeSelectorSpinner = this.f152184e;
                if (regionCodeSelectorSpinner.getAdapter() == null) {
                    throw new IllegalStateException("Populate selector with region codes before setting the selected Region Code");
                } else if (i != 0 && i != regionCodeSelectorSpinner.mo72077i() && (position = ((bkez) regionCodeSelectorSpinner.getAdapter()).getPosition(Integer.valueOf(i))) >= 0) {
                    regionCodeSelectorSpinner.mo71972b(position);
                }
            }
        } else {
            throw new IllegalStateException("setRegionCodes() must be called before setSelectedRegionCode()");
        }
    }

    public RegionCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public RegionCodeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    public final void mo52935a(int i, int i2, boolean z) {
        boolean z2;
        bmnc bmnc;
        bmnc bmnc2;
        if (!z || i == this.f152181b) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f152181b = i;
        bkey bkey = this.f152187h;
        if (bkey != null) {
            bkey.mo52935a(i, getId(), z2);
        }
        if (z2) {
            int size = this.f152188i.size();
            for (int i3 = 0; i3 < size; i3++) {
                bjwj bjwj = (bjwj) this.f152188i.get(i3);
                bmne bmne = bjwj.f123509a;
                if (bmne.f130091a == 2) {
                    bmnc = (bmnc) bmne.f130092b;
                } else {
                    bmnc = bmnc.f130080d;
                }
                if ((bmnc.f130082a & 1) != 0) {
                    bmne bmne2 = bjwj.f123509a;
                    if (bmne2.f130091a == 2) {
                        bmnc2 = (bmnc) bmne2.f130092b;
                    } else {
                        bmnc2 = bmnc.f130080d;
                    }
                    bmmw bmmw = bmnc2.f130083b;
                    if (bmmw == null) {
                        bmmw = bmmw.f130060c;
                    }
                    if (Pattern.compile(bmmw.f130063b).matcher(bjtv.m104615a(this.f152181b)).matches()) {
                        this.f152182c.mo65590a(bjwj);
                    }
                } else {
                    this.f152182c.mo65590a(bjwj);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo72080a(long j) {
        this.f152184e.mo71969a(j);
    }

    /* renamed from: a */
    public final void mo72081a(bmdn bmdn) {
        this.f152185f = bmdn;
        if (bmdn != null) {
            mo72080a(bmdn.f128835c);
        }
    }

    /* renamed from: a */
    public final void mo72082a(LogContext logContext) {
        this.f152184e.mo71971a(logContext);
    }

    /* renamed from: a */
    public final void mo65794a(CharSequence charSequence, boolean z) {
        if (!this.f152186g) {
            this.f152184e.mo65794a(charSequence, z);
        }
    }

    /* renamed from: a */
    public final void mo52771a(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            bjwj bjwj = (bjwj) arrayList.get(i);
            int a = bmna.m108191a(bjwj.f123509a.f130094d);
            if (a != 0 && a == 2) {
                this.f152188i.add(bjwj);
                i++;
            } else {
                Locale locale = Locale.US;
                int i2 = 1;
                Object[] objArr = new Object[1];
                int a2 = bmna.m108191a(bjwj.f123509a.f130094d);
                if (a2 != 0) {
                    i2 = a2;
                }
                objArr[0] = Integer.valueOf(i2 - 1);
                throw new IllegalArgumentException(String.format(locale, "Unsupported trigger type: %s", objArr));
            }
        }
    }

    /* renamed from: a */
    public void mo72073a(List list) {
        Integer[] numArr = null;
        if (list.size() == 1) {
            RegionCodeSelectorSpinner regionCodeSelectorSpinner = this.f152184e;
            regionCodeSelectorSpinner.f152179v = null;
            regionCodeSelectorSpinner.setVisibility(8);
            this.f152183d.setText(bjtl.m104573b(((Integer) list.get(0)).intValue()));
            mo52935a(((Integer) list.get(0)).intValue(), getId(), false);
            this.f152183d.setVisibility(0);
            this.f152186g = true;
        } else {
            RegionCodeSelectorSpinner regionCodeSelectorSpinner2 = this.f152184e;
            regionCodeSelectorSpinner2.f152179v = this;
            ContextThemeWrapper contextThemeWrapper = regionCodeSelectorSpinner2.f152178u;
            if (list != null) {
                int size = list.size();
                Integer[] numArr2 = new Integer[size];
                for (int i = 0; i < size; i++) {
                    numArr2[i] = Integer.valueOf(((Integer) list.get(i)).intValue());
                }
                numArr = numArr2;
            }
            bkez bkez = new bkez(contextThemeWrapper, numArr);
            bkez.setDropDownViewResource(C0126R.C0128layout.view_spinner_dropdown);
            regionCodeSelectorSpinner2.setAdapter((SpinnerAdapter) bkez);
            regionCodeSelectorSpinner2.setOnItemSelectedListener(new bkex(regionCodeSelectorSpinner2));
            this.f152184e.setVisibility(0);
            this.f152183d.setVisibility(8);
            this.f152186g = false;
        }
        this.f152180a = true;
    }

    /* renamed from: a */
    public final boolean mo52055a(bmne bmne) {
        int a = bmna.m108191a(bmne.f130094d);
        if (a != 0 && a == 2) {
            return false;
        }
        int a2 = bmna.m108191a(bmne.f130094d);
        if (a2 == 0) {
            a2 = 1;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unsupported trigger type: ");
        sb.append(a2 - 1);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final boolean mo65795a(Object obj) {
        return bjtv.m104615a(mo72078a()).equals(obj);
    }
}
