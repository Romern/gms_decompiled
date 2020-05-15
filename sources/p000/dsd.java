package p000;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: dsd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dsd extends drx {

    /* renamed from: c */
    public final Set f13926c = new HashSet();

    public dsd() {
        super("ExpirationOperation");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9410a() {
        Iterator it = this.f13926c.iterator();
        long a = dwq.m9665i().mo20505a();
        new Object[1][0] = Long.valueOf(a);
        HashSet hashSet = null;
        long j = Long.MAX_VALUE;
        while (it.hasNext()) {
            Object next = it.next();
            long b = dwa.m9588a((dwa) next);
            if (dwa.m9588a((dwa) next) > a) {
                j = Math.min(j, b);
            } else {
                if (hashSet == null) {
                    hashSet = new HashSet();
                }
                new Object[1][0] = next;
                hashSet.add(next);
                it.remove();
            }
        }
        if (hashSet != null && !hashSet.isEmpty()) {
            dwq.m9674r().mo9733b(hashSet);
        }
        if (j != Long.MAX_VALUE) {
            new Object[1][0] = Long.valueOf(j);
            dwq.m9667k().mo9433a(this);
            long j2 = j - a;
            new Object[1][0] = Long.valueOf(j2);
            mo9514a(j2, dqy.m9123a("ExpirationOperation"));
        }
    }

    /* renamed from: a */
    public final void mo9528a(Object obj) {
        new Object[1][0] = obj;
        if (this.f13926c.remove(obj)) {
            mo9516a(dqy.m9123a("ExpirationOperation"));
        }
    }
}
