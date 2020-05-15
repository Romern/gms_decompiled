package p000;

import java.util.Map;

/* renamed from: bktb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bktb {

    /* renamed from: a */
    public static final blgm f125261a;

    static {
        blgk f = blgm.m107133f();
        f.mo66488a(blgf.NULL_VALUE);
        f125261a = f.mo66486a();
    }

    /* renamed from: a */
    public static final int m106592a(blgm blgm) {
        blgl blgl = blgl.KIND_NOT_SET;
        int i = 24;
        switch (blgm.f126445b.ordinal()) {
            case 1:
            case 2:
            case 4:
                return 24;
            case 3:
                return blgm.mo66491b().length();
            case 5:
                int i2 = 24;
                for (Map.Entry entry : blgm.mo66493d().mo66481a().entrySet()) {
                    i2 += ((String) entry.getKey()).length() + 24 + m106592a((blgm) entry.getValue());
                }
                return i2;
            case 6:
                for (blgm blgm2 : blgm.mo66494e().mo66478a()) {
                    i += m106592a(blgm2);
                }
                return i;
            default:
                throw new IllegalArgumentException();
        }
    }
}
