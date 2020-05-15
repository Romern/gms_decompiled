package p000;

import com.google.android.gms.nearby.connection.AdvertisingOptions;
import java.util.concurrent.Callable;

/* renamed from: ahlv */
final /* synthetic */ class ahlv implements Callable {

    /* renamed from: a */
    private final ahmn f67479a;

    /* renamed from: b */
    private final ahkv f67480b;

    /* renamed from: c */
    private final byte[] f67481c;

    /* renamed from: d */
    private final String f67482d;

    /* renamed from: e */
    private final AdvertisingOptions f67483e;

    /* renamed from: f */
    private final aify f67484f;

    public ahlv(ahmn ahmn, ahkv ahkv, byte[] bArr, String str, AdvertisingOptions advertisingOptions, aify aify) {
        this.f67479a = ahmn;
        this.f67480b = ahkv;
        this.f67481c = bArr;
        this.f67482d = str;
        this.f67483e = advertisingOptions;
        this.f67484f = aify;
    }

    public final Object call() {
        byte[] bArr;
        ahmn ahmn = this.f67479a;
        ahkv ahkv = this.f67480b;
        byte[] bArr2 = this.f67481c;
        String str = this.f67482d;
        AdvertisingOptions advertisingOptions = this.f67483e;
        aify aify = this.f67484f;
        int a = ahkv.mo36685a(ahmn.mo36853b());
        if (a != 0) {
            ((bnsl) ahkm.f67363a.mo68387b()).mo68424a("Missing required permissions, aborting call to startAdvertising() for endpointInfo %s and serviceId %s", ahkm.m55981a(bArr2), str);
            return Integer.valueOf(a);
        }
        String c = ahkv.mo36711c();
        if (cfnv.m140801y()) {
            bArr = ahkv.mo36734n();
        } else {
            bArr = null;
        }
        ahmk a2 = ahmn.mo36838a(ahkv, str, c, bArr2, bArr, advertisingOptions);
        int i = a2.f67540a;
        if (i != 0) {
            return Integer.valueOf(i);
        }
        ahkv.mo36697a(str, ahmn.mo36958g(), aify, a2.f67541b, advertisingOptions);
        return 0;
    }
}
