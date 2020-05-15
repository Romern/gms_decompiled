package p000;

import com.google.android.gms.nearby.internal.connection.DisconnectFromEndpointParams;

/* renamed from: ahju */
final /* synthetic */ class ahju implements Runnable {

    /* renamed from: a */
    private final ahki f67300a;

    /* renamed from: b */
    private final DisconnectFromEndpointParams f67301b;

    /* renamed from: c */
    private final ahkv f67302c;

    public ahju(ahki ahki, DisconnectFromEndpointParams disconnectFromEndpointParams, ahkv ahkv) {
        this.f67300a = ahki;
        this.f67301b = disconnectFromEndpointParams;
        this.f67302c = ahkv;
    }

    public final void run() {
        ahki ahki = this.f67300a;
        DisconnectFromEndpointParams disconnectFromEndpointParams = this.f67301b;
        ahkv ahkv = this.f67302c;
        String str = disconnectFromEndpointParams.f80565a;
        if (ahkv.mo36716e(str) || ahkv.mo36718f(str)) {
            ahki.f67338a.mo36767c(ahkv, str);
        }
    }
}
