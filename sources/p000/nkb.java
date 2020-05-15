package p000;

import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: nkb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nkb {

    /* renamed from: a */
    final /* synthetic */ nkq f35880a;

    public nkb(nkq nkq) {
        this.f35880a = nkq;
    }

    /* renamed from: a */
    public final void mo20938a(nyj nyj) {
        if (nyj != null) {
            nkq nkq = this.f35880a;
            nkq.f35906h = nyj;
            bnsn bnsn = nkq.f35898a;
            nyh nyh = nkq.f35903e;
            nyh.f36937m = nkq.f35906h;
            nyh.mo21836c(ErrorInfo.TYPE_SDU_MEMORY_FULL);
            return;
        }
        bnsi b = nkq.f35898a.mo68387b();
        b.mo68432a("nkb", "a", 366, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b.mo68405a("Cannot get BluetoothProfileUtil");
    }
}
