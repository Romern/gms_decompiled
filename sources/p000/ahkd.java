package p000;

import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.internal.connection.SendConnectionRequestParams;
import java.util.concurrent.Callable;

/* renamed from: ahkd */
final /* synthetic */ class ahkd implements Callable {

    /* renamed from: a */
    private final ahki f67323a;

    /* renamed from: b */
    private final SendConnectionRequestParams f67324b;

    /* renamed from: c */
    private final ahkv f67325c;

    public ahkd(ahki ahki, SendConnectionRequestParams sendConnectionRequestParams, ahkv ahkv) {
        this.f67323a = ahki;
        this.f67324b = sendConnectionRequestParams;
        this.f67325c = ahkv;
    }

    public final Object call() {
        ConnectionOptions connectionOptions;
        ahki ahki = this.f67323a;
        SendConnectionRequestParams sendConnectionRequestParams = this.f67324b;
        ahkv ahkv = this.f67325c;
        String str = sendConnectionRequestParams.f80619e;
        if (ahkv.mo36718f(str) || ahkv.mo36716e(str)) {
            return 8003;
        }
        ConnectionOptions connectionOptions2 = sendConnectionRequestParams.f80623i;
        ahky ahky = ahki.f67338a;
        byte[] a = ahki.m55918a(sendConnectionRequestParams.f80618d, sendConnectionRequestParams.f80622h);
        byte[] bArr = sendConnectionRequestParams.f80620f;
        if (connectionOptions2 != null) {
            connectionOptions = connectionOptions2;
        } else {
            connectionOptions = new ahib().f67234a;
        }
        int a2 = ahky.mo36759a(ahkv, a, str, bArr, connectionOptions, sendConnectionRequestParams.f80621g);
        if (a2 != 0) {
            ahkv.mo36741r(str);
        }
        return Integer.valueOf(a2);
    }
}
