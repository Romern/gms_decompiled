package p000;

import java.util.List;
import java.util.Map;

/* renamed from: yju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yju {

    /* renamed from: a */
    public static final bnhe f53948a;

    /* renamed from: b */
    public final bnhe f53949b;

    static {
        bnha h = bnhe.m109414h();
        Float valueOf = Float.valueOf(0.0f);
        h.mo67695b(4, valueOf);
        h.mo67695b(3, valueOf);
        h.mo67695b(7, Float.valueOf(1.4f));
        h.mo67695b(8, Float.valueOf(2.7f));
        h.mo67695b(1, Float.valueOf(4.3f));
        h.mo67695b(0, Float.valueOf(27.0f));
        f53948a = h.mo67618b();
    }

    public yju(Map map) {
        this.f53949b = bnhe.m109413a(map);
    }

    /* renamed from: a */
    public static float m44248a(List list) {
        int size = list.size();
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            f += ((yjt) list.get(i)).f53947c;
        }
        return f;
    }

    /* renamed from: a */
    public final Iterable mo30578a(Iterable iterable, Iterable iterable2, yhx yhx) {
        return new ykj(new yjs(this, yhx), iterable, iterable2);
    }
}
