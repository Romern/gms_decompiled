package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aqon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqon {

    /* renamed from: a */
    public static final sek f86414a = aqom.m71875b("AccountSessionStore");

    /* renamed from: b */
    public static final aqon f86415b = new aqon();

    /* renamed from: c */
    public final Map f86416c = Collections.synchronizedMap(new HashMap());

    private aqon() {
    }

    /* renamed from: a */
    public final void mo48019a(String str, int i) {
        f86414a.mo25409a("clearAccount(package_name=%s, session_id=%d)", str, Integer.valueOf(i));
        this.f86416c.remove(str);
    }
}
