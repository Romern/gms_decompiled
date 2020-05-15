package p000;

import java.util.ArrayList;

/* renamed from: zyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zyx implements Runnable {
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r2 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r2.hasNext() == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r3 = (p000.zyk) r2.next();
        r4 = r3.mo31592a(r1.f56206g, r1.f56207h);
        r5 = r3.mo31596b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (r5 <= 60000) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        p000.zyh.m46680a("FontsServer", "Fetch for %s (status %s) cancelled for timeout after %d ms", r3.f56185c, r4, java.lang.Long.valueOf(r5));
        r1.mo31601a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        return;
     */
    public final void run() {
        try {
            zyn a = zzi.f56267a.mo31622a();
            synchronized (a.f56204e) {
                if (!a.f56205f.isEmpty()) {
                    ArrayList arrayList = new ArrayList(a.f56205f.values());
                }
            }
        } catch (Exception e) {
            zyh.m46681a("FontsDownloadResultPump", e, "failed async checkComplete", new Object[0]);
        }
    }
}
