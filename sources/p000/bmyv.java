package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: bmyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmyv {

    /* renamed from: a */
    private final bmyx f131214a;

    /* renamed from: b */
    private final bmyx f131215b;

    public bmyv(bmyx bmyx, bmyx bmyx2) {
        this.f131214a = bmyx;
        bmxy.m108581a(bmyx2);
        this.f131215b = bmyx2;
    }

    /* renamed from: a */
    public final Map mo66915a(CharSequence charSequence) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : this.f131214a.mo66918a(charSequence)) {
            Iterator b = this.f131215b.mo66923b((CharSequence) str);
            bmxy.m108596a(b.hasNext(), "Chunk [%s] is not a valid entry", str);
            String str2 = (String) b.next();
            bmxy.m108596a(!linkedHashMap.containsKey(str2), "Duplicate key [%s] found.", str2);
            bmxy.m108596a(b.hasNext(), "Chunk [%s] is not a valid entry", str);
            linkedHashMap.put(str2, (String) b.next());
            bmxy.m108596a(!b.hasNext(), "Chunk [%s] is not a valid entry", str);
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }
}
