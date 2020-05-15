package p000;

import com.google.android.gms.nearby.internal.connection.StartDiscoveryParams;
import java.util.concurrent.Callable;

/* renamed from: ahkb */
final /* synthetic */ class ahkb implements Callable {

    /* renamed from: a */
    private final ahki f67317a;

    /* renamed from: b */
    private final ahkv f67318b;

    /* renamed from: c */
    private final StartDiscoveryParams f67319c;

    public ahkb(ahki ahki, ahkv ahkv, StartDiscoveryParams startDiscoveryParams) {
        this.f67317a = ahki;
        this.f67318b = ahkv;
        this.f67319c = startDiscoveryParams;
    }

    public final Object call() {
        ahki ahki = this.f67317a;
        ahkv ahkv = this.f67318b;
        StartDiscoveryParams startDiscoveryParams = this.f67319c;
        if (!ahkv.mo36728k()) {
            return Integer.valueOf(ahki.f67338a.mo36756a(ahkv, startDiscoveryParams.f80638c, startDiscoveryParams.f80640e, startDiscoveryParams.f80641f));
        }
        return 8002;
    }
}
