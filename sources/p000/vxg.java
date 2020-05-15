package p000;

import java.util.Map;

/* renamed from: vxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vxg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Map f50182a;

    /* renamed from: b */
    final /* synthetic */ vwy f50183b;

    /* renamed from: c */
    final /* synthetic */ vxi f50184c;

    public vxg(vxi vxi, Map map, vwy vwy) {
        this.f50184c = vxi;
        this.f50182a = map;
        this.f50183b = vwy;
    }

    public final void run() {
        byte[] bArr;
        try {
            bArr = this.f50184c.f50186a.mo28940a(this.f50182a);
            if (bArr == null) {
                this.f50184c.f50187b = vxv.m41563a("Received null");
                bArr = this.f50184c.f50187b;
            }
        } catch (Exception e) {
            vxi vxi = this.f50184c;
            String valueOf = String.valueOf(e.toString());
            vxi.f50187b = vxv.m41563a(valueOf.length() == 0 ? new String("Snapshot failed: ") : "Snapshot failed: ".concat(valueOf));
            bArr = this.f50184c.f50187b;
            this.f50184c.mo28907b();
        }
        this.f50183b.mo28920a(bArr);
    }
}
