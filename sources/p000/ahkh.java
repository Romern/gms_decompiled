package p000;

import com.google.android.gms.nearby.internal.connection.SendPayloadParams;
import java.util.concurrent.Callable;

/* renamed from: ahkh */
final /* synthetic */ class ahkh implements Callable {

    /* renamed from: a */
    private final ahki f67335a;

    /* renamed from: b */
    private final ahkv f67336b;

    /* renamed from: c */
    private final SendPayloadParams f67337c;

    public ahkh(ahki ahki, ahkv ahkv, SendPayloadParams sendPayloadParams) {
        this.f67335a = ahki;
        this.f67336b = ahkv;
        this.f67337c = sendPayloadParams;
    }

    public final Object call() {
        ahki ahki = this.f67335a;
        ahkv ahkv = this.f67336b;
        SendPayloadParams sendPayloadParams = this.f67337c;
        for (String str : sendPayloadParams.f80625b) {
            if (ahkv.mo36716e(str)) {
                ahki.f67338a.mo36762a(ahkv, sendPayloadParams.f80625b, sendPayloadParams.f80626c);
                return 0;
            }
        }
        return 8011;
    }
}
