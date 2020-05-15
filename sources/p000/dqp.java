package p000;

import java.util.Iterator;
import java.util.Set;

/* renamed from: dqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dqp implements Runnable {

    /* renamed from: a */
    final /* synthetic */ dqs f13822a;

    /* renamed from: b */
    private final dqm f13823b;

    /* renamed from: c */
    private final long f13824c;

    /* renamed from: d */
    private final long f13825d;

    public dqp(dqs dqs, dqm dqm, long j, long j2) {
        this.f13822a = dqs;
        sdo.m34974b(j2 >= j);
        sdo.m34959a(dqm);
        this.f13823b = dqm;
        this.f13824c = j;
        this.f13825d = j2;
    }

    public final void run() {
        boolean z;
        long b = dwq.m9665i().mo20506b();
        long j = this.f13824c;
        long j2 = j != 0 ? b + j : 0;
        long j3 = this.f13825d;
        long j4 = j3 != Long.MAX_VALUE ? j3 + b : Long.MAX_VALUE;
        dqr dqr = this.f13822a.f13832a;
        dqq dqq = new dqq(this.f13823b, j2, j4);
        long j5 = dqq.f13828c;
        if (j5 < dqr.f13831c) {
            dqr.f13831c = j5;
            z = true;
        } else {
            z = false;
        }
        Set a = dqr.f13830b.mo67361a(dqq.f13826a);
        if (a != null) {
            if (!dqq.mo9450a()) {
                Iterator it = a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        dqr.mo9451a(dqq);
                        break;
                    }
                    dqq dqq2 = (dqq) it.next();
                    if (!dqq2.mo9450a() && dqq2.f13826a.equals(dqq.f13826a)) {
                        if (dqq2.f13828c > dqq.f13828c) {
                            egm egm = dqr.f13829a;
                            Long valueOf = Long.valueOf(dqq2.f13827b);
                            Set set = (Set) egm.get(valueOf);
                            if (set != null && set.remove(dqq2) && set.isEmpty()) {
                                egm.remove(valueOf);
                            }
                            dqr.f13830b.mo67310c(dqq2.f13826a, dqq2);
                            dqr.mo9451a(dqq);
                        }
                    }
                }
            } else {
                dqr.mo9451a(dqq);
            }
        } else {
            dqr.mo9451a(dqq);
        }
        if (z || this.f13822a.f13832a.f13831c < b) {
            this.f13822a.mo9453a();
        }
    }
}
