package p000;

/* renamed from: zyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zyy implements Runnable {
    public final void run() {
        try {
            synchronized (zzj.f56287a) {
                if (zzj.f56288b != null) {
                    zzj.f56288b.mo31631b();
                }
            }
        } catch (Exception e) {
            zyh.m46681a("FontsDownloadResultPump", e, "failed async advanceUpdate", new Object[0]);
        }
    }
}
