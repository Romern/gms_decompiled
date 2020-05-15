package p000;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: avpt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avpt extends IOException {

    /* renamed from: a */
    public final bnhe f93738a;

    public avpt(String str) {
        this(bnoj.f131912b, str);
    }

    public avpt(String str, Throwable th) {
        super(str, th);
        this.f93738a = bnoj.f131912b;
    }

    public avpt(Map map, String str) {
        super(str);
        bnha h = bnhe.m109414h();
        for (Map.Entry entry : map.entrySet()) {
            if (!((List) entry.getValue()).isEmpty()) {
                h.mo67695b(stm.m36299a((String) entry.getKey()), stm.m36299a((String) ((List) entry.getValue()).get(0)));
            }
        }
        this.f93738a = h.mo67618b();
    }
}
