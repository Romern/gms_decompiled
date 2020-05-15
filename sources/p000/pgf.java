package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: pgf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pgf {

    /* renamed from: a */
    public final Map f39078a = new HashMap();

    /* renamed from: b */
    private final Map f39079b = new HashMap();

    /* renamed from: c */
    private final Map f39080c = new HashMap();

    /* renamed from: a */
    public final String mo23038a(String str) {
        return (String) this.f39079b.get(str);
    }

    /* renamed from: b */
    public final int mo23040b(String str) {
        Integer num = (Integer) this.f39080c.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo23039a(String str, String str2, int i) {
        this.f39079b.put(str, str2);
        this.f39078a.put(str2, str);
        this.f39080c.put(str, Integer.valueOf(i));
    }
}
