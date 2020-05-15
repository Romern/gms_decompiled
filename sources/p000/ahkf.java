package p000;

import com.google.android.gms.nearby.internal.connection.RejectConnectionRequestParams;
import java.util.concurrent.Callable;

/* renamed from: ahkf */
final /* synthetic */ class ahkf implements Callable {

    /* renamed from: a */
    private final ahki f67329a;

    /* renamed from: b */
    private final RejectConnectionRequestParams f67330b;

    /* renamed from: c */
    private final ahkv f67331c;

    public ahkf(ahki ahki, RejectConnectionRequestParams rejectConnectionRequestParams, ahkv ahkv) {
        this.f67329a = ahki;
        this.f67330b = rejectConnectionRequestParams;
        this.f67331c = ahkv;
    }

    public final Object call() {
        ahki ahki = this.f67329a;
        RejectConnectionRequestParams rejectConnectionRequestParams = this.f67330b;
        ahkv ahkv = this.f67331c;
        String str = rejectConnectionRequestParams.f80614b;
        if (ahkv.mo36716e(str)) {
            return 8003;
        }
        if (!ahkv.mo36720g(str)) {
            return Integer.valueOf(ahki.f67338a.mo36755a(ahkv, str));
        }
        bnsl bnsl = (bnsl) ahkm.f67363a.mo68388c();
        bnsl.mo68432a("ahki", "a", 262, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68418a("Client %d invoked rejectConnectionRequest() after having already accepted/rejected the connection to %s.", ahkv.mo36706b(), str);
        return 8009;
    }
}
