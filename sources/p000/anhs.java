package p000;

/* renamed from: anhs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anhs {
    /* renamed from: a */
    public static final boolean m64428a(String str, int i) {
        if (!str.startsWith("__internal.") && i != 1) {
            String a = angb.m64191a(str);
            if (!cgem.f186663a.mo6606a().mo83563t().f165797a.contains(a) && (!(i == 9 || i == 16 || i == 17) || !ange.m64198a(cgem.f186663a.mo6606a().mo83566w(), a))) {
                if ((i != 9 && i != 17) || !cgem.f186663a.mo6606a().mo83565v().f165797a.contains(a)) {
                    return i != 21 || cgem.f186663a.mo6606a().mo83564u();
                }
                return false;
            }
        }
        return false;
    }
}
