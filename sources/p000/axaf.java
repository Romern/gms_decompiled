package p000;

import android.content.Context;
import com.felicanetworks.mfc.C0126R;

/* renamed from: axaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axaf extends axah {
    public axaf(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo52924a(boolean z, boolean z2) {
        super.mo52924a(z, z2);
        if (z) {
            this.f95516d.setOrientation(1);
        } else {
            this.f95516d.setOrientation(0);
        }
        this.f95514b.setSingleLine(!z);
    }

    /* renamed from: b */
    public final CharSequence mo52926b() {
        String format = String.format("%s %s", this.f95513a.getText(), this.f95514b.getText());
        return getResources().getString(C0126R.string.wallet_customer_selected, format);
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
        return !((bmes) this.f124136q).f129015f;
    }
}
