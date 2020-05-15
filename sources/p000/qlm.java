package p000;

import android.util.Log;
import java.util.List;

/* renamed from: qlm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qlm {

    /* renamed from: a */
    public final djk f41656a;

    /* renamed from: b */
    public final List f41657b;

    /* renamed from: c */
    private String f41658c;

    public qlm(djk djk, String str, List list) {
        this.f41656a = djk;
        this.f41657b = list;
        this.f41658c = str;
        if (str != null) {
            qlp a = qlp.m32393a();
            synchronized (a.f41664a) {
                a.f41664a.add(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo24083a() {
        String str = this.f41658c;
        if (str != null) {
            qlp a = qlp.m32393a();
            synchronized (a.f41664a) {
                if (!a.f41664a.remove(str)) {
                    Log.w("ChmraDebugLogger", str.length() == 0 ? new String("Failed removal of client ID ") : "Failed removal of client ID ".concat(str));
                }
            }
            this.f41658c = null;
        }
    }
}
