package p000;

/* renamed from: bbmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbmo {
    /* renamed from: a */
    public static bley m88189a(btdb btdb) {
        if (btdb.f148372a.isEmpty()) {
            return null;
        }
        bler bler = ((btec) btdb.f148372a.get(0)).f148492a;
        if (bler == null) {
            bler = bler.f126245D;
        }
        bxwc bxwc = bler.f126255e;
        if (bxwc.isEmpty()) {
            return null;
        }
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bley bley = (bley) bxwc.get(i);
            if ((bley.f126305a & 1) != 0) {
                bleu bleu = bley.f126306b;
                if (bleu == null) {
                    bleu = bleu.f126278h;
                }
                if (bleu.f126284e) {
                    return bley;
                }
            }
        }
        return (bley) bxwc.get(0);
    }
}
