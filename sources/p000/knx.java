package p000;

/* renamed from: knx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class knx extends kny {
    public knx(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo14730a(kok kok);

    /* renamed from: b */
    public final boolean mo14729b(kom kom) {
        kol kol = kom.f24623v;
        if (kol != null) {
            koh koh = (koh) kol;
            if ("input".equals(koh.f24572a)) {
                bnre i = koh.f24573b.listIterator();
                while (i.hasNext()) {
                    if (mo14730a((kok) i.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
