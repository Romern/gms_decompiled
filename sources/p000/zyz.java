package p000;

import java.util.concurrent.ExecutorService;

@Deprecated
/* renamed from: zyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zyz implements Runnable {

    /* renamed from: a */
    private final zyx f56233a = new zyx();

    /* renamed from: b */
    private final zyy f56234b = new zyy();

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    public final void run() {
        boolean z;
        boolean a;
        boolean z2;
        zzi zzi = zzi.f56267a;
        zyn a2 = zzi.mo31622a();
        if (a2 != null) {
            synchronized (a2.f56204e) {
                z2 = !a2.f56205f.isEmpty();
            }
            if (z2) {
                z = true;
                a = zzj.m46748a();
                if (!z && !a) {
                    zyh.m46683c("FontsDownloadResultPump", "run fired but we have no work", new Object[0]);
                    return;
                }
                zyh.m46683c("FontsDownloadResultPump", "run svr work? %s update work? %s)", Boolean.valueOf(z), Boolean.valueOf(a));
                ExecutorService b = zzi.mo31624b();
                if (z) {
                    b.execute(this.f56233a);
                }
                if (!a) {
                    b.execute(this.f56234b);
                    return;
                }
                return;
            }
        }
        z = false;
        a = zzj.m46748a();
        if (!z) {
            zyh.m46683c("FontsDownloadResultPump", "run fired but we have no work", new Object[0]);
            return;
        }
        zyh.m46683c("FontsDownloadResultPump", "run svr work? %s update work? %s)", Boolean.valueOf(z), Boolean.valueOf(a));
        ExecutorService b2 = zzi.mo31624b();
        if (z) {
        }
        if (!a) {
        }
    }
}
