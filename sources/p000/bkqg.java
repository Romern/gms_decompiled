package p000;

import java.util.Map;

/* renamed from: bkqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkqg {
    /* renamed from: a */
    public static String m106277a(blgm blgm) {
        StringBuilder sb = new StringBuilder();
        m106278a(blgm, new bkxh(sb));
        return sb.toString();
    }

    /* renamed from: a */
    public static void m106278a(blgm blgm, bkxh bkxh) {
        blgl blgl = blgl.KIND_NOT_SET;
        switch (blgm.f126445b.ordinal()) {
            case 1:
                bkxh.mo66425e();
                return;
            case 2:
                double a = blgm.mo66490a();
                bkxh.mo66426f();
                if (Double.isNaN(a)) {
                    throw new IllegalArgumentException("NaN values are not supported.");
                } else if (!Double.isInfinite(a)) {
                    long j = (long) a;
                    if (a != ((double) j)) {
                        bkxh.f125376a.append(a);
                        return;
                    } else {
                        bkxh.f125376a.append(j);
                        return;
                    }
                } else {
                    throw new IllegalArgumentException("Infinite values are not supported.");
                }
            case 3:
                bkxh.mo66422b(blgm.mo66491b());
                return;
            case 4:
                bkxh.mo66420a(blgm.mo66492c());
                return;
            case 5:
                blgh d = blgm.mo66493d();
                bkxh.mo66423c();
                for (Map.Entry entry : d.mo66481a().entrySet()) {
                    bkxh.mo66419a((String) entry.getKey());
                    m106278a((blgm) entry.getValue(), bkxh);
                }
                bkxh.mo66424d();
                return;
            case 6:
                blge e = blgm.mo66494e();
                bkxh.mo66417a();
                for (blgm blgm2 : e.mo66478a()) {
                    m106278a(blgm2, bkxh);
                }
                bkxh.mo66421b();
                return;
            default:
                String valueOf = String.valueOf(blgm.f126445b);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("Unsupported value type: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
