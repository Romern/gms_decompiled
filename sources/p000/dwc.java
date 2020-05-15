package p000;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: dwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dwc extends drx {

    /* renamed from: c */
    public final Set f14252c = new HashSet();

    public dwc() {
        super("InterestRecordExpirationOperation");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9410a() {
        long j;
        Iterator it = this.f14252c.iterator();
        long a = dwq.m9665i().mo20505a();
        new Object[1][0] = Long.valueOf(a);
        HashSet hashSet = null;
        while (it.hasNext()) {
            dwa dwa = (dwa) it.next();
            if (dwa.m9590a(dwa, a)) {
                if (hashSet == null) {
                    hashSet = new HashSet();
                }
                new Object[1][0] = dwa;
                hashSet.add(dwa);
                it.remove();
            }
        }
        if (hashSet != null && hashSet.size() > 0) {
            dwq.m9674r().mo9733b(hashSet);
        }
        if (!this.f14252c.isEmpty()) {
            j = Long.MAX_VALUE;
            for (dwa dwa2 : this.f14252c) {
                j = Math.min(j, dwa2.mo9744a() + dwa2.mo9750e().mo9778e());
            }
        } else {
            j = -1;
        }
        new Object[1][0] = Long.valueOf(j);
        dwq.m9667k().mo9433a(this);
        if (j != -1) {
            long j2 = j - a;
            new Object[1][0] = Long.valueOf(j2);
            mo9514a(j2, dqy.m9123a("InterestRecordExpirationOperation"));
        }
    }

    /* renamed from: a */
    public final void mo9763a(dwa dwa) {
        new Object[1][0] = dwa;
        if (this.f14252c.remove(dwa)) {
            new Object[1][0] = dwa;
            mo9516a(dqy.m9123a("InterestRecordExpirationOperation"));
        }
    }
}
