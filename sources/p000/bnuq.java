package p000;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: bnuq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnuq extends bnuo {

    /* renamed from: c */
    private static final Map f132203c;

    /* renamed from: d */
    private final bnsr f132204d;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
     arg types: [bnsr, bnuq[]]
     candidates:
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object */
    static {
        EnumMap enumMap = new EnumMap(bnsr.class);
        bnsr[] values = bnsr.values();
        for (bnsr bnsr : values) {
            bnuq[] bnuqArr = new bnuq[10];
            for (int i = 0; i < 10; i++) {
                bnuqArr[i] = new bnuq(i, bnsr, bnss.f132100a);
            }
            enumMap.put((Object) bnsr, (Object) bnuqArr);
        }
        f132203c = Collections.unmodifiableMap(enumMap);
    }

    private bnuq(int i, bnsr bnsr, bnss bnss) {
        super(bnss, i);
        bnuy.m110474a(bnsr, "format char");
        this.f132204d = bnsr;
        if (!bnss.mo68464a()) {
            char c = bnsr.f132096l;
            c = bnss.mo68466b() ? c & 65503 : c;
            StringBuilder sb = new StringBuilder("%");
            bnss.mo68463a(sb);
            sb.append((char) c);
            sb.toString();
        }
    }

    /* renamed from: a */
    public static bnuq m110456a(int i, bnsr bnsr, bnss bnss) {
        if (i < 10 && bnss.mo68464a()) {
            return ((bnuq[]) f132203c.get(bnsr))[i];
        }
        return new bnuq(i, bnsr, bnss);
    }

    /* renamed from: a */
    public final void mo68499a(bnup bnup, Object obj) {
        bnup.mo68482a(obj, this.f132204d, this.f132202b);
    }
}
