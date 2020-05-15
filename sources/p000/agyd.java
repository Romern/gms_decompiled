package p000;

import android.text.Spanned;
import com.felicanetworks.mfc.C0126R;

/* renamed from: agyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agyd implements agya {

    /* renamed from: a */
    private final Spanned f66848a;

    /* renamed from: b */
    private final Spanned f66849b;

    /* renamed from: c */
    private agws f66850c;

    public agyd(Spanned spanned, Spanned spanned2) {
        this.f66848a = spanned;
        this.f66849b = spanned2;
    }

    /* renamed from: a */
    public final int mo36175a() {
        return C0126R.C0128layout.purchase_dialog_text_item;
    }

    /* renamed from: a */
    public final void mo36176a(acm acm) {
        agws agws = (agws) acm;
        this.f66850c = agws;
        Spanned spanned = this.f66848a;
        Spanned spanned2 = this.f66849b;
        agws.f66749s.setText(agws.m55206a(spanned));
        agws.f66750t.setText(agws.m55206a(spanned2));
    }
}
