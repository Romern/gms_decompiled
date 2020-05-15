package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: bmzd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bmzd {

    /* renamed from: a */
    private final Map f131256a = new HashMap();

    /* renamed from: b */
    private int f131257b = -1;

    /* renamed from: a */
    public final void mo66934a() {
        char[][] cArr = new char[(this.f131257b + 1)][];
        for (Map.Entry entry : this.f131256a.entrySet()) {
            cArr[((Character) entry.getKey()).charValue()] = ((String) entry.getValue()).toCharArray();
        }
    }

    /* renamed from: a */
    public final void mo66935a(char c, String str) {
        this.f131256a.put(Character.valueOf(c), str);
        if (c > this.f131257b) {
            this.f131257b = c;
        }
    }
}
