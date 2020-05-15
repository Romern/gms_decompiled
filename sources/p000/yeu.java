package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: yeu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yeu extends yel {

    /* renamed from: a */
    private final Map f53706a = new HashMap();

    public yeu(int i) {
        super(i);
    }

    /* renamed from: a */
    public final caaw mo30398a(long j) {
        return yyp.m45048a(this.f53706a);
    }

    /* renamed from: b */
    public final double mo30399b(cadn cadn) {
        caaw a = mo30397a(cadn);
        double d = 0.0d;
        if (yyp.m45052c(a)) {
            yyp.m45051b(a);
            Map unmodifiableMap = Collections.unmodifiableMap(a.f172385e);
            bnha a2 = bnhe.m109406a(unmodifiableMap.size());
            for (Map.Entry entry : unmodifiableMap.entrySet()) {
                if ((((caar) entry.getValue()).f172367a & 1) != 0) {
                    a2.mo67695b((String) entry.getKey(), Float.valueOf((float) ((caar) entry.getValue()).f172368b));
                }
            }
            bnrd a3 = a2.mo67618b().entrySet().iterator();
            while (a3.hasNext()) {
                Map.Entry entry2 = (Map.Entry) a3.next();
                String str = (String) entry2.getKey();
                Float f = (Float) entry2.getValue();
                if (f != null) {
                    double floatValue = (double) f.floatValue();
                    Double.isNaN(floatValue);
                    d += floatValue;
                    Float f2 = (Float) this.f53706a.get(str);
                    if (f2 == null) {
                        this.f53706a.put(str, f);
                    } else {
                        this.f53706a.put(str, Float.valueOf(f2.floatValue() + f.floatValue()));
                    }
                }
            }
        }
        return d;
    }
}
