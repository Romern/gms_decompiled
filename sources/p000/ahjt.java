package p000;

import com.google.android.gms.nearby.internal.connection.CancelPayloadParams;
import java.util.concurrent.Callable;

/* renamed from: ahjt */
final /* synthetic */ class ahjt implements Callable {

    /* renamed from: a */
    private final ahki f67297a;

    /* renamed from: b */
    private final ahkv f67298b;

    /* renamed from: c */
    private final CancelPayloadParams f67299c;

    public ahjt(ahki ahki, ahkv ahkv, CancelPayloadParams cancelPayloadParams) {
        this.f67297a = ahki;
        this.f67298b = ahkv;
        this.f67299c = cancelPayloadParams;
    }

    public final Object call() {
        ahki ahki = this.f67297a;
        return Integer.valueOf(ahki.f67338a.mo36754a(this.f67298b, this.f67299c.f80564b));
    }
}
