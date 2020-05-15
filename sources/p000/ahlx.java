package p000;

import com.google.android.gms.nearby.connection.DiscoveryOptions;
import java.util.concurrent.Callable;

/* renamed from: ahlx */
final /* synthetic */ class ahlx implements Callable {

    /* renamed from: a */
    private final ahmn f67488a;

    /* renamed from: b */
    private final ahkv f67489b;

    /* renamed from: c */
    private final String f67490c;

    /* renamed from: d */
    private final DiscoveryOptions f67491d;

    /* renamed from: e */
    private final aigh f67492e;

    public ahlx(ahmn ahmn, ahkv ahkv, String str, DiscoveryOptions discoveryOptions, aigh aigh) {
        this.f67488a = ahmn;
        this.f67489b = ahkv;
        this.f67490c = str;
        this.f67491d = discoveryOptions;
        this.f67492e = aigh;
    }

    public final Object call() {
        ahmn ahmn = this.f67488a;
        ahkv ahkv = this.f67489b;
        String str = this.f67490c;
        DiscoveryOptions discoveryOptions = this.f67491d;
        aigh aigh = this.f67492e;
        int a = ahkv.mo36685a(ahmn.mo36856c());
        if (a != 0) {
            ((bnsl) ahkm.f67363a.mo68387b()).mo68420a("Missing required permissions, aborting call to startDiscovery() for serviceId %s", str);
            return Integer.valueOf(a);
        }
        ahmk a2 = ahmn.mo36837a(ahkv, str, discoveryOptions);
        int i = a2.f67540a;
        if (i != 0) {
            return Integer.valueOf(i);
        }
        ahmn.f67550g.put(ahkv, new ahmh());
        ahkv.mo36698a(str, ahmn.mo36958g(), aigh, a2.f67541b, discoveryOptions);
        return 0;
    }
}
