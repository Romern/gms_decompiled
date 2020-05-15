package p000;

import java.util.List;

/* renamed from: fco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class fco {
    /* renamed from: a */
    private static final boolean m11482a(List list, int i, fen fen) {
        if (i >= list.size()) {
            return false;
        }
        boolean a = sdg.m34949a(((fen) list.get(i)).f16396a, fen.f16396a);
        list.subList(i, list.size()).clear();
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bsxn mo10723a(fen fen);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract bsxn mo10725b(fen fen);

    /* renamed from: a */
    public final boolean mo10724a(List list, fen fen) {
        bsxn a = mo10723a(fen);
        if (a != null) {
            int size = list.size() - 1;
            int i = -1;
            while (size >= 0 && sdg.m34949a(a, mo10723a((fen) list.get(size)))) {
                i = size;
                size--;
            }
            if (i != -1) {
                if (sdg.m34949a(((fen) list.get(i)).f16396a, fen.f16396a)) {
                    return m11482a(list, i, fen);
                }
                bsxn b = mo10725b((fen) list.get(i));
                if (b != null) {
                    if (sdg.m34949a(b, mo10725b(fen))) {
                        return m11482a(list, i + 1, fen);
                    }
                    while (true) {
                        i++;
                        if (i < list.size()) {
                            if (!sdg.m34949a(b, mo10725b((fen) list.get(i)))) {
                                break;
                            }
                        } else {
                            i = -1;
                            break;
                        }
                    }
                    if (i != -1) {
                        return m11482a(list, i, fen);
                    }
                    return false;
                }
            }
        }
        return false;
    }
}
