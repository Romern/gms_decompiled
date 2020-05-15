package p000;

import java.util.concurrent.ExecutionException;

/* renamed from: ahno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahno extends ahnl {

    /* renamed from: e */
    final /* synthetic */ ahnp f67633e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahno(ahnp ahnp, ahkv ahkv, String str) {
        super(ahnp, "Read", ahkv, str);
        this.f67633e = ahnp;
    }

    /* renamed from: a */
    public final boolean mo36889a(ahna ahna) {
        while (true) {
            try {
                buuj a = ahoy.m56305a(ahna.mo36803e());
                buuw a2 = ahoy.m56306a(a);
                if (a2.equals(buuw.DISCONNECTION)) {
                    ahna.mo36805g();
                    ((bnsl) ahkm.f67363a.mo68390d()).mo68424a("EndpointManager received a DISCONNECTION frame from endpoint %s on channel %s, disconnecting.", this.f67631c, ahna.mo36795a());
                } else {
                    ahnp ahnp = this.f67633e;
                    Object obj = null;
                    try {
                        obj = ahnp.f67635b.mo25819b(new ahnh(ahnp, a2)).get();
                    } catch (InterruptedException | ExecutionException e) {
                        bnsl bnsl = (bnsl) ahfp.f67119a.mo68387b();
                        bnsl.mo68437a(e);
                        bnsl.mo68420a("Failed %s while waiting for the result.", "getOfflineFrameProcessor");
                        if (e instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    ahnm ahnm = (ahnm) obj;
                    if (ahnm == null) {
                        ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("EndpointManager discarded incoming OfflineFrame of type %s because it doesn't have a processor registered.", a2.name());
                    } else {
                        ahnm.mo36784a(a, this.f67631c, this.f67630b, ahna.mo36865l());
                    }
                }
            } catch (bxwf e2) {
                bnsl bnsl2 = (bnsl) ahkm.f67363a.mo68390d();
                bnsl2.mo68437a(e2);
                bnsl2.mo68424a("EndpointManager received an invalid OfflineFrame from endpoint %s on channel %s, discarding.", this.f67631c, ahna.mo36795a());
            }
        }
    }
}
