package p000;

import com.google.android.gms.location.internal.DeviceOrientationRequestInternal;

/* renamed from: bfue */
public final /* synthetic */ class bfue implements Runnable {

    /* renamed from: a */
    private final bfuh f115317a;

    /* renamed from: b */
    private final int f115318b;

    /* renamed from: c */
    private final String f115319c;

    /* renamed from: d */
    private final DeviceOrientationRequestInternal f115320d;

    /* renamed from: e */
    private final bfuh f115321e;

    /* renamed from: f */
    private final aehq f115322f;

    public bfue(bfuh bfuh, int i, String str, DeviceOrientationRequestInternal deviceOrientationRequestInternal, bfuh bfuh2, aehq aehq) {
        this.f115317a = bfuh;
        this.f115318b = i;
        this.f115319c = str;
        this.f115320d = deviceOrientationRequestInternal;
        this.f115321e = bfuh2;
        this.f115322f = aehq;
    }

    public final void run() {
        bfuh bfuh = this.f115317a;
        int i = this.f115318b;
        String str = this.f115319c;
        DeviceOrientationRequestInternal deviceOrientationRequestInternal = this.f115320d;
        bfuh bfuh2 = this.f115321e;
        aehq aehq = this.f115322f;
        bfub bfub = new bfub(i, str, deviceOrientationRequestInternal, bfuh2, aehq);
        bfuh.f115327c.mo25985a(aehq.asBinder(), bfub);
    }
}
