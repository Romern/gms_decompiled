package p000;

/* renamed from: knw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class knw extends kny {

    /* renamed from: b */
    private final int f24548b;

    /* renamed from: c */
    private final int f24549c;

    public knw(int i, int i2, int i3) {
        super(i);
        this.f24548b = i2;
        this.f24549c = i3;
    }

    /* renamed from: b */
    public final boolean mo14729b(kom kom) {
        int i = kom.f24618q;
        kol kol = kom.f24623v;
        if (kol != null) {
            bnre i2 = ((koh) kol).f24573b.listIterator();
            while (i2.hasNext()) {
                kok kok = (kok) i2.next();
                if (bmwb.m108443a(kok.mo14744a(), "maxlength")) {
                    try {
                        i = Integer.parseInt(kok.mo14745b());
                    } catch (NumberFormatException e) {
                        return false;
                    }
                }
            }
        }
        return i > 0 && i <= this.f24549c && i >= this.f24548b;
    }
}
