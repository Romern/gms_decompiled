package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: lfb */
final /* synthetic */ class lfb implements bqeg {

    /* renamed from: a */
    private final bnic f25932a;

    public lfb(bnic bnic) {
        this.f25932a = bnic;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        bnic bnic = this.f25932a;
        bnia bnia = new bnia();
        bnrd a = bnic.iterator();
        while (a.hasNext()) {
            try {
                bnia.mo67752b((Iterable) ((kek) bqga.m112780a((Future) ((bqgg) a.next()))).f23936a);
            } catch (ExecutionException e) {
                bnsl bnsl = (bnsl) lfd.f25942a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("lfd", "a", (int) BaseMfiEventCallback.TYPE_OPSRV_REQUIRED_LIB_UNAVAILABLE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Fetching data entries from an account unsuccessful.");
            }
        }
        return bqga.m112775a((Object) bnia.mo67751a());
    }
}
