package p000;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ejq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ejq {

    /* renamed from: a */
    private final ejp f15149a;

    /* renamed from: b */
    private final ejn f15150b;

    /* renamed from: c */
    private final Map f15151c = new HashMap();

    public ejq(Context context, ejn ejn) {
        ejp ejp = new ejp(context);
        this.f15149a = ejp;
        this.f15150b = ejn;
    }

    /* renamed from: a */
    public final synchronized ejs mo10212a(String str) {
        if (this.f15151c.containsKey(str)) {
            return (ejs) this.f15151c.get(str);
        }
        eji a = this.f15149a.mo10211a(str);
        if (a == null) {
            return null;
        }
        ejn ejn = this.f15150b;
        ejs a2 = a.mo6270a(new ejh(ejn.f15143a, ejn.f15144b, ejn.f15145c, str));
        this.f15151c.put(str, a2);
        return a2;
    }
}
