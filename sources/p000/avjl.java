package p000;

/* renamed from: avjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avjl {

    /* renamed from: a */
    public static final bnhe f93272a;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b(0, 0);
        h.mo67695b(1, 1);
        h.mo67695b(2, 5);
        h.mo67695b(3, 8);
        h.mo67695b(4, 7);
        h.mo67695b(5, 4);
        h.mo67695b(6, 3);
        f93272a = h.mo67618b();
    }

    /* renamed from: a */
    public static int m78613a(int i) {
        bnhe bnhe = f93272a;
        Integer valueOf = Integer.valueOf(i);
        if (bnhe.containsKey(valueOf)) {
            return ((Integer) f93272a.get(valueOf)).intValue();
        }
        return 0;
    }
}
