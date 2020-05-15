package p000;

import android.content.Context;
import com.felicanetworks.mfc.C0126R;

/* renamed from: awzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awzx extends awzz {

    /* renamed from: c */
    public static String f95458c;

    /* renamed from: a */
    public String f95459a;

    /* renamed from: b */
    public String f95460b;

    public awzx(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo52924a(boolean z, boolean z2) {
        super.mo52924a(z, z2);
        int i = 0;
        if (z) {
            this.f95477f.setText(this.f95459a);
            this.f95479h.setOrientation(1);
        } else {
            this.f95477f.setText(this.f95460b);
            this.f95479h.setOrientation(0);
        }
        this.f95477f.setSingleLine(!z);
        if (this.f124130k.isChecked() && !z) {
            i = 8;
        }
        if (!((bmbz) this.f124136q).f128640e.isEmpty()) {
            this.f95478g.setVisibility(i);
        }
        int a = bmby.m107883a(((bmbz) this.f124136q).f128639d);
        if (a != 0 && a == 4) {
            this.f95480i.setVisibility(i);
        }
    }

    /* renamed from: b */
    public final CharSequence mo52926b() {
        String format = String.format("%s %s", this.f95476e.getText(), this.f95477f.getText());
        return getResources().getString(C0126R.string.wallet_address_selected, format);
    }

    public final void setEnabled(boolean z) {
        boolean z2 = false;
        if (z && mo52925a()) {
            z2 = true;
        }
        super.setEnabled(z2);
    }

    /* renamed from: a */
    public final boolean mo52925a() {
        int a = bmby.m107883a(((bmbz) this.f124136q).f128639d);
        return a == 0 || a != 2;
    }
}
