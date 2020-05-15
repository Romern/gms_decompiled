package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.wallet.ui.common.CheckboxView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CheckboxView extends bkbp implements bjwp, bjwm {

    /* renamed from: h */
    public CompoundButton.OnCheckedChangeListener f151921h;

    /* renamed from: i */
    public bmqf f151922i;

    /* renamed from: j */
    public View f151923j;

    /* renamed from: k */
    private boolean f151924k = false;

    /* renamed from: l */
    private CharSequence f151925l;

    /* renamed from: m */
    private bjwk f151926m;

    /* renamed from: n */
    private final ArrayList f151927n = new ArrayList();

    public CheckboxView(Context context) {
        super(context);
    }

    /* renamed from: h */
    private final long m118422h() {
        return isChecked() ? 1 : 0;
    }

    /* renamed from: a */
    public final void mo52946a(bjwk bjwk) {
        this.f151926m = bjwk;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo65796b() {
        return this.f151924k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final bmnr mo65797c() {
        bxvd da = bmnr.f130153o.mo74144da();
        String charSequence = !TextUtils.isEmpty(this.f151925l) ? this.f151925l.toString() : getContext().getString(C0126R.string.wallet_uic_error_field_must_not_be_empty);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmnr bmnr = (bmnr) da.f164949b;
        charSequence.getClass();
        int i = bmnr.f130155a | 4;
        bmnr.f130155a = i;
        bmnr.f130159e = charSequence;
        bmnr.f130162h = 4;
        bmnr.f130155a = i | 32;
        return (bmnr) da.mo74062i();
    }

    /* renamed from: g */
    public final bmqh mo71871g() {
        return !isChecked() ? bmqh.UNCHECKED : bmqh.CHECKED;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        super.onCheckedChanged(compoundButton, z);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f151921h;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z);
        }
        if (!this.f123954g) {
            bjwl.m104782a(this.f151926m, this.f151927n, m118422h());
        }
    }

    public final void setEnabled(boolean z) {
        bmqf bmqf = this.f151922i;
        if (bmqf != null) {
            z = z && !bkft.m105640a(bmqf) && !this.f151922i.f130379h;
        }
        super.setEnabled(z);
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f151923j;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        bmmq bmmq;
        bmqk bmqk;
        bmqh bmqh;
        int a = bmmb.m108166a(bmmv.f130058d);
        if (a != 0 && a == 18) {
            if (bmmv.f130056b == 11) {
                bmmq = (bmmq) bmmv.f130057c;
            } else {
                bmmq = bmmq.f130039c;
            }
            if (bmmq.f130041a == 1) {
                bmqk = (bmqk) bmmq.f130042b;
            } else {
                bmqk = bmqk.f130403g;
            }
            if (bmqk.f130406b == 5) {
                bmqh = bmqh.m108281a(((Integer) bmqk.f130407c).intValue());
                if (bmqh == null) {
                    bmqh = bmqh.UNKNOWN;
                }
            } else {
                bmqh = bmqh.UNKNOWN;
            }
            mo71870a(bmqh);
            return;
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        int a2 = bmmb.m108166a(bmmv.f130058d);
        if (a2 == 0) {
            a2 = 1;
        }
        objArr[0] = Integer.valueOf(a2 - 1);
        objArr[1] = this.f151922i.f130375d;
        throw new IllegalArgumentException(String.format(locale, "Unknown ResultingActionReference action type: %s for %s", objArr));
    }

    public CheckboxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CheckboxView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CheckboxView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    public final void mo71869a(bmqf bmqf) {
        bmow bmow;
        this.f151922i = bmqf;
        if (bmqf.f130373b == 10) {
            bmow = (bmow) bmqf.f130374c;
        } else {
            bmow = bmow.f130264f;
        }
        bmqh bmqh = bmqh.UNKNOWN;
        int a = bmov.m108241a(bmow.f130270e);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 1) {
            mo65789a();
        } else if (i2 != 2) {
            int a2 = bmov.m108241a(bmow.f130270e);
            if (a2 != 0) {
                i = a2;
            }
            StringBuilder sb = new StringBuilder(42);
            sb.append("Unknown Checkbox display type: ");
            sb.append(i - 1);
            throw new IllegalArgumentException(sb.toString());
        } else {
            super.mo65791a((CompoundButton) this.f123950c);
        }
        if ((bmow.f130266a & 1) == 0) {
            bxvd da = bmnr.f130153o.mo74144da();
            String str = bmqf.f130380i;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmnr bmnr = (bmnr) da.f164949b;
            str.getClass();
            bmnr.f130155a |= 4;
            bmnr.f130159e = str;
            mo65793a((bmnr) da.mo74062i());
        } else {
            bmnr bmnr2 = bmow.f130267b;
            if (bmnr2 == null) {
                bmnr2 = bmnr.f130153o;
            }
            mo65793a(bmnr2);
        }
        bmqh a3 = bmqh.m108281a(bmow.f130268c);
        if (a3 == null) {
            a3 = bmqh.UNKNOWN;
        }
        mo71870a(a3);
        this.f151924k = !bmqf.f130378g;
        this.f151925l = bmow.f130269d;
        setEnabled(isEnabled());
    }

    /* renamed from: a */
    public final void mo71870a(bmqh bmqh) {
        bmqh bmqh2 = bmqh.UNKNOWN;
        int ordinal = bmqh.ordinal();
        if (ordinal == 1) {
            setChecked(true);
        } else if (ordinal == 2) {
            setChecked(false);
        } else {
            int i = bmqh.f130395e;
            StringBuilder sb = new StringBuilder(39);
            sb.append("Unsupported checkbox state: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo52771a(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bjwj bjwj = (bjwj) arrayList.get(i);
            bmqh bmqh = bmqh.UNKNOWN;
            int a = bmna.m108191a(bjwj.f123509a.f130094d);
            int i2 = 1;
            if (a == 0) {
                a = 1;
            }
            int i3 = a - 1;
            if (i3 != 1) {
                if (i3 == 3) {
                    continue;
                } else if (i3 != 4) {
                    int a2 = bmna.m108191a(bjwj.f123509a.f130094d);
                    if (a2 != 0) {
                        i2 = a2;
                    }
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Unsupported trigger type: ");
                    sb.append(i2 - 1);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            this.f151927n.add(bjwj);
        }
    }

    /* renamed from: a */
    public final boolean mo52055a(bmne bmne) {
        return bjwl.m104786a(bmne, m118422h());
    }

    /* renamed from: a */
    public final boolean mo65795a(Object obj) {
        return (obj instanceof Integer) && obj.equals(Integer.valueOf(mo71871g().f130395e));
    }
}
