package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.ads.afma.proto2api.C0152c;
import com.google.ads.afma.proto2api.C0157h;

/* renamed from: dby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dby implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f12757a;

    /* renamed from: b */
    final /* synthetic */ dca f12758b;

    public dby(dca dca, int i) {
        this.f12758b = dca;
        this.f12757a = i;
    }

    public final void run() {
        C0152c cVar;
        dca dca = this.f12758b;
        int i = this.f12757a;
        if (i > 0) {
            try {
                Thread.sleep((long) (i * 1000));
            } catch (InterruptedException e) {
            }
        }
        try {
            PackageInfo packageInfo = dca.f12765a.getPackageManager().getPackageInfo(dca.f12765a.getPackageName(), 0);
            Context context = dca.f12765a;
            cVar = aagl.m21220a(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable th) {
            cVar = null;
        }
        this.f12758b.f12774j = cVar;
        if (this.f12757a < 4) {
            if (!(cVar == null || (cVar.f7518a & 4194304) == 0 || cVar.f7532o.equals("0000000000000000000000000000000000000000000000000000000000000000") || (cVar.f7520c & 4096) == 0)) {
                C0157h hVar = cVar.f7517P;
                if (hVar == null) {
                    hVar = C0157h.f7558e;
                }
                if ((hVar.f7560a & 1) != 0) {
                    C0157h hVar2 = cVar.f7517P;
                    if (hVar2 == null) {
                        hVar2 = C0157h.f7558e;
                    }
                    if (hVar2.f7561b != -2) {
                        return;
                    }
                }
            }
            this.f12758b.mo8505a(this.f12757a + 1);
        }
    }
}
