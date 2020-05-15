package p000;

import java.io.IOException;

/* renamed from: buve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buve implements blvq {

    /* renamed from: a */
    final /* synthetic */ buvf f155030a;

    public buve(buvf buvf) {
        this.f155030a = buvf;
    }

    /* renamed from: a */
    public final void mo13805a(blvp blvp) {
        srn srn = bvcm.f155598a;
        buvh buvh = this.f155030a.f155031a;
        try {
            buvh.f155040g.put(new buvg(new buvo(buvh.f155034a, blvp)));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: a */
    public final void mo13806a(IOException iOException) {
        bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
        bnsl.mo68437a(iOException);
        bnsl.mo68432a("buve", "a", 117, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("BleGattAccept: error accepting connection");
        this.f155030a.f155031a.mo73133a(iOException);
    }
}
