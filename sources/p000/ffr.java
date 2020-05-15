package p000;

/* renamed from: ffr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ffr {
    /* renamed from: a */
    public static ffk m11619a(String str) {
        bxvd da = ffk.f16456b.mo74144da();
        if (!bmxx.m108578b(str).trim().isEmpty()) {
            String trim = str.trim();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            trim.getClass();
            ((ffk) da.f164949b).f16458a = trim;
        }
        return (ffk) da.mo74062i();
    }

    /* renamed from: b */
    public static String m11621b(ffk ffk) {
        if (m11620a(ffk)) {
            return ffk.f16458a;
        }
        throw new ffq();
    }

    /* renamed from: a */
    public static boolean m11620a(ffk ffk) {
        return ffk != null && !ffk.f16458a.trim().isEmpty();
    }
}
