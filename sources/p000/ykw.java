package p000;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.logging.Level;

/* renamed from: ykw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ykw {

    /* renamed from: a */
    public final List f53993a = new ArrayList();

    /* renamed from: b */
    private final List f53994b;

    /* renamed from: c */
    private final Deque f53995c = new ArrayDeque();

    /* renamed from: d */
    private final long f53996d;

    /* renamed from: e */
    private long f53997e = 0;

    public ykw(List list, long j) {
        this.f53994b = list;
        this.f53996d = j;
    }

    /* renamed from: a */
    private final void m44294a(long j, long j2) {
        long j3 = 0;
        while (true) {
            yhu yhu = (yhu) this.f53995c.peekFirst();
            if (yhu != null && yhu.mo30387b() < j2) {
                yhu yhu2 = (yhu) this.f53995c.pollFirst();
                bmzs.m108696a(yhu2);
                if (yhu2.mo30387b() > j && yhu2.mo30387b() != j3) {
                    this.f53993a.add(yhu2);
                    j3 = yhu2.mo30387b();
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo30590a(int i, long j) {
        int i2 = i;
        long j2 = j;
        if (i2 < this.f53994b.size()) {
            bnjq bnjq = (bnjq) this.f53994b.get(i2);
            long j3 = 0;
            long j4 = 0;
            boolean z = false;
            while (bnjq.hasNext()) {
                if (((yhu) bnjq.mo67862a()).mo30387b() >= this.f53997e) {
                    if (((yhu) bnjq.mo67862a()).mo30387b() >= j2) {
                        break;
                    }
                    yhu yhu = (yhu) bnjq.next();
                    long b = yhu.mo30387b() - j4;
                    if (b <= j3) {
                        ypq.m44538a("Data point out of order (or duplicate): %s", Level.FINE, "Data point out of order (or duplicate): %s", yhu);
                    } else {
                        j4 = yhu.mo30387b();
                        if (!z || b >= this.f53996d) {
                            if (!bnjq.hasNext() || ((yhu) bnjq.mo67862a()).mo30387b() - yhu.mo30387b() < this.f53996d) {
                                mo30590a(i2 + 1, yhu.mo30387b());
                                m44294a(this.f53997e, yhu.mo30387b());
                            } else {
                                this.f53995c.add(yhu);
                                j3 = 0;
                                z = true;
                            }
                        }
                        this.f53997e = yhu.mo30387b();
                        this.f53993a.add(yhu);
                        j3 = 0;
                        z = true;
                    }
                } else {
                    j4 = ((yhu) bnjq.next()).mo30387b();
                }
            }
            mo30590a(i2 + 1, j2);
            m44294a(this.f53997e, j2);
        }
    }
}
