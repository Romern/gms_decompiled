package p000;

import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;

/* renamed from: poh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class poh extends poq {

    /* renamed from: c */
    private final pls f39913c;

    /* renamed from: d */
    private final long f39914d;

    /* renamed from: e */
    private final qav f39915e = new qav("BleDeviceOnline");

    public poh(pls pls, pnl pnl, plx plx, long j) {
        super(pnl, plx, false, false, "BleDeviceOnline");
        this.f39913c = pls;
        this.f39914d = j;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (java.util.Arrays.equals(p000.qat.m31759a((java.net.Inet4Address) r1.f29715c), r2) == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        if (java.util.Arrays.equals(r3, r2) == false) goto L_0x005c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0094  */
    /* renamed from: a */
    public final void mo23518a(pnl pnl) {
        CastDevice castDevice;
        pnk pnk;
        CastDevice castDevice2;
        String str = this.f39913c.f39619b;
        if (!TextUtils.isEmpty(str)) {
            pnm c = pnl.mo23492c(str);
            if (c == null || (castDevice2 = c.f39844a) == null || !castDevice2.mo17498c()) {
                if (c != null) {
                    if (c.f39844a.mo17497b()) {
                        CastDevice castDevice3 = c.f39844a;
                        byte[] bArr = this.f39913c.f39618a;
                        if (!castDevice3.mo17497b()) {
                            byte[] bArr2 = castDevice3.f29726n;
                            if (bArr2 == null) {
                                this.f39915e.mo23677d("Device %s doesn't have IP address or IP fragment.", castDevice3.f29725m);
                            }
                        }
                    }
                    castDevice = c.f39844a;
                    if (castDevice.f29725m == null || castDevice.f29726n == null) {
                        pet pet = new pet(castDevice);
                        pls pls = this.f39913c;
                        pet.f39005m = pls.f39618a;
                        pet.f39004l = pls.f39619b;
                        c = pnl.mo23482a(pet.mo22985a());
                    }
                    pnk = c.f39848e;
                    if (pnk == null) {
                        pnk = new pnk(this.f39914d);
                        c.f39848e = pnk;
                    }
                    pnk.f39830b = this.f39914d;
                }
                pls pls2 = this.f39913c;
                c = pnl.mo23482a(new pet(pls2.f39619b, pls2.f39618a).mo22985a());
                castDevice = c.f39844a;
                pet pet2 = new pet(castDevice);
                pls pls3 = this.f39913c;
                pet2.f39005m = pls3.f39618a;
                pet2.f39004l = pls3.f39619b;
                c = pnl.mo23482a(pet2.mo22985a());
                pnk = c.f39848e;
                if (pnk == null) {
                }
                pnk.f39830b = this.f39914d;
            }
        }
    }
}
