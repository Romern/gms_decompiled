package p000;

/* renamed from: bguz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bguz {

    /* renamed from: a */
    private static long f117617a = 0;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        r8 = new java.lang.RuntimeException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        new p000.bguy(r8).start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r8 == null) goto L_0x002b;
     */
    /* renamed from: a */
    public static void m100120a(Throwable th) {
        if (chcs.f188354a.mo6606a().mo85020I()) {
            synchronized (bguz.class) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - f117617a >= chcs.f188354a.mo6606a().mo85057aS()) {
                    f117617a = currentTimeMillis;
                }
            }
        }
    }
}
