package p000;

/* renamed from: kph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kph {
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List, java.lang.Iterable], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static kjp m18285a(Iterable r5) {
        int size = r5.size();
        kjp kjp = null;
        for (int i = 0; i < size; i++) {
            kjp kjp2 = (kjp) r5.get(i);
            if (kjp2.f24266c.mo66813a()) {
                return kjp2;
            }
            if (kjp == null) {
                kjp = kjp2;
            }
        }
        return kjp;
    }
}
