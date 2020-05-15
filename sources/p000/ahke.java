package p000;

import com.google.android.gms.nearby.internal.connection.AcceptConnectionRequestParams;
import java.util.concurrent.Callable;

/* renamed from: ahke */
final /* synthetic */ class ahke implements Callable {

    /* renamed from: a */
    private final ahki f67326a;

    /* renamed from: b */
    private final AcceptConnectionRequestParams f67327b;

    /* renamed from: c */
    private final ahkv f67328c;

    public ahke(ahki ahki, AcceptConnectionRequestParams acceptConnectionRequestParams, ahkv ahkv) {
        this.f67326a = ahki;
        this.f67327b = acceptConnectionRequestParams;
        this.f67328c = ahkv;
    }

    public final Object call() {
        ahki ahki = this.f67326a;
        AcceptConnectionRequestParams acceptConnectionRequestParams = this.f67327b;
        ahkv ahkv = this.f67328c;
        String str = acceptConnectionRequestParams.f80560c;
        if (ahkv.mo36716e(str)) {
            return 8003;
        }
        if (!ahkv.mo36720g(str)) {
            return Integer.valueOf(ahki.f67338a.mo36757a(ahkv, str, acceptConnectionRequestParams.f80561d, acceptConnectionRequestParams.f80562e));
        }
        bnsl bnsl = (bnsl) ahkm.f67363a.mo68388c();
        bnsl.mo68432a("ahki", "a", 230, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68418a("Client %d invoked acceptConnectionRequest() after having already accepted/rejected the connection to %s.", ahkv.mo36706b(), str);
        return 8009;
    }
}
