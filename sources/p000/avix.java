package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: avix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avix {

    /* renamed from: b */
    private static avix f93256b;

    /* renamed from: a */
    public final Map f93257a = new HashMap();

    private avix() {
    }

    /* renamed from: a */
    public static avix m78596a() {
        if (f93256b == null) {
            f93256b = new avix();
        }
        return f93256b;
    }

    /* renamed from: a */
    public final void mo51286a(String str) {
        this.f93257a.remove(str);
    }
}
