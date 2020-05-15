package p000;

import java.util.Map;
import java.util.Set;

/* renamed from: arjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arjk {

    /* renamed from: a */
    private static arjk f87793a;

    /* renamed from: b */
    private final Map f87794b = new C1223np();

    /* renamed from: c */
    private final Set f87795c = new C1225nr();

    private arjk() {
    }

    /* renamed from: a */
    public static synchronized arjk m73009a() {
        arjk arjk;
        synchronized (arjk.class) {
            if (f87793a == null) {
                f87793a = new arjk();
            }
            arjk = f87793a;
        }
        return arjk;
    }

    /* renamed from: b */
    public final synchronized aucb mo48610b(rjx rjx, String str) {
        rob rob = (rob) this.f87794b.get(str);
        if (rob == null) {
            return aucu.m76778a((Object) null);
        } else if (this.f87795c.contains(rob)) {
            this.f87795c.remove(rob);
            this.f87794b.remove(str);
            return rjx.mo24698a(rob);
        } else {
            return aucu.m76778a((Object) null);
        }
    }

    /* renamed from: a */
    public final synchronized rod mo48606a(rjx rjx, String str) {
        rod rod;
        if (!this.f87794b.containsKey(str)) {
            rod = rjx.mo24714a(new Object(), str);
            rob rob = rod.f43429b;
            sdo.checkIfNull(rob, "Key must not be null");
            this.f87794b.put(str, rob);
        } else {
            rod = null;
        }
        return rod;
    }

    /* renamed from: a */
    public final synchronized void mo48607a(rjx rjx, rob rob) {
        this.f87795c.remove(rob);
        rjx.mo24698a(rob);
    }

    /* renamed from: a */
    public final synchronized void mo48608a(rjx rjx, roh roh, rpf rpf) {
        rob a = roh.mo24969a();
        sdo.checkIfNull(a, "Key must not be null");
        this.f87795c.add(a);
        rjx.mo24699a(roh, rpf).mo50372a(new arjj(this, rjx, a));
    }

    /* renamed from: a */
    public final boolean mo48609a(String str) {
        return this.f87794b.containsKey(str);
    }
}
