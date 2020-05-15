package p000;

import com.google.android.gms.drive.events.ChangeEvent;
import java.util.Map;

/* renamed from: ujv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ujv implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f47820a;

    /* renamed from: b */
    final /* synthetic */ boolean f47821b;

    /* renamed from: c */
    final /* synthetic */ ujx f47822c;

    public ujv(ujx ujx, boolean z, boolean z2) {
        this.f47822c = ujx;
        this.f47820a = z;
        this.f47821b = z2;
    }

    public final void run() {
        boolean z;
        sdo.m34970a(this.f47822c.mo27596c());
        Map map = this.f47822c.f47826b;
        if (map != null) {
            int i = 0;
            for (uot uot : map.values()) {
                if (uot.mo27785e() != null) {
                    i++;
                }
            }
            this.f47822c.f47825a.f47881J = i;
        }
        ujx ujx = this.f47822c;
        vea vea = ujx.f47828d;
        ujp ujp = ujx.f47827c;
        if (ujp.f48336ao) {
            vea.f49098a.mo27414a(ujp);
        } else if (ujp.f47810b != null) {
            ujp a = vea.f49098a.mo27368a(new uih("", ujp.f47809a), ujp.f47810b);
            if (a == null) {
                vea.f49098a.mo27414a(ujp);
            } else {
                vea.f49098a.mo27414a(a);
                ujp = a;
            }
        } else {
            vea.f49098a.mo27414a(ujp);
        }
        ujx.f47827c = ujp;
        ujx ujx2 = this.f47822c;
        ukg ukg = ujx2.f47825a;
        long j = ukg.f47902ae;
        int i2 = 1;
        if (j < 0) {
            long j2 = ujx2.f47827c.f48366m;
            sdo.m34970a(j < 0);
            sdo.m34974b(j2 >= 0);
            ukg.f47902ae = j2;
        }
        ujx ujx3 = this.f47822c;
        vea vea2 = ujx3.f47828d;
        ukg ukg2 = ujx3.f47825a;
        boolean z2 = this.f47820a;
        sdo.m34970a(ukg2.f47902ae >= 0);
        vea2.f49098a.mo27376a(ukg2, z2);
        if (!vea2.f49105b.mo27498a()) {
            uif uif = vea2.f49105b;
            long j3 = ukg2.f47902ae;
            sdo.m34970a(!uif.mo27498a());
            if (j3 >= 0) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34974b(z);
            uif.f47676a = Long.valueOf(j3);
        }
        Map map2 = this.f47822c.f47826b;
        if (map2 != null) {
            for (uot uot2 : map2.values()) {
                uot2.mo27779c();
            }
            this.f47822c.f47826b = null;
        }
        if (this.f47821b) {
            ujx ujx4 = this.f47822c;
            if (ujx4.mo27523A() || !ujx4.mo27570af()) {
                i2 = 4;
            } else {
                ukg ukg3 = ujx4.f47825a;
                if (ukg3.f47909al) {
                    ukg3.f47909al = false;
                    i2 = 3;
                }
            }
            ujx4.f47829e.execute(new ujt(new ChangeEvent(ujx4.mo27610g(), i2), ujx4.mo27551a()));
            if (!this.f47820a) {
                ujx ujx5 = this.f47822c;
                ujx5.f47829e.execute(new uju(ujx5.mo27610g()));
            }
        }
    }
}
