package p000;

import android.net.NetworkRequest;
import java.util.concurrent.ExecutionException;

/* renamed from: aiuk */
final /* synthetic */ class aiuk implements Runnable {

    /* renamed from: a */
    private final aivd f69789a;

    /* renamed from: b */
    private final aivw f69790b;

    /* renamed from: c */
    private final NetworkRequest f69791c;

    public aiuk(aivd aivd, aivw aivw, NetworkRequest networkRequest) {
        this.f69789a = aivd;
        this.f69790b = aivw;
        this.f69791c = networkRequest;
    }

    public final void run() {
        aivd aivd = this.f69789a;
        aivw aivw = this.f69790b;
        NetworkRequest networkRequest = this.f69791c;
        try {
            bqgy c = bqgy.m112818c();
            aius aius = new aius(c, aivw);
            aivd.f69848a.requestNetwork(networkRequest, aius, ((int) cfnv.f184625a.mo6606a().mo81813be()) * 1000);
            aiux aiux = (aiux) c.get();
            aivd.f69851d.put(aivw, aius);
            aivd.f69852e.put(aivw, aiux.mo37999a());
            aivd.f69853f.put(aivw, aiux);
            aivd.f69850c.mo38025c(aivw.f69911c);
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aivd", "a", 746, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Successfully joined a WiFi Aware network.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        }
    }
}
