package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: avtd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avtd {

    /* renamed from: a */
    private final Map f93880a;

    public avtd() {
        this.f93880a = new HashMap();
    }

    /* renamed from: a */
    public final avte mo51593a() {
        return new avte(bnim.m109536b(this.f93880a));
    }

    public avtd(Map map) {
        this.f93880a = new HashMap(map);
    }

    /* renamed from: a */
    public final void mo51594a(avti avti, Object obj) {
        mo51595a(new avtc(avti, obj));
    }

    /* renamed from: a */
    public final void mo51595a(avtc... avtcArr) {
        for (avtc avtc : avtcArr) {
            String a = avtc.mo51592a();
            if (a != null) {
                this.f93880a.put(avtc.f93878a.f93886a, a);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo51596a(avti avti) {
        return this.f93880a.containsKey(avti.f93886a);
    }
}
