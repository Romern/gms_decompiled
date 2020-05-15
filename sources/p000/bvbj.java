package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: bvbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bvbj {

    /* renamed from: a */
    private final Map f155538a = new HashMap();

    /* renamed from: b */
    private final Set f155539b = Collections.synchronizedSet(new HashSet());

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bvbw mo73150a(buzt buzt);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bvbw mo73151a(buzt buzt, Set set);

    /* renamed from: a */
    public final void mo73278a(bvbw bvbw) {
        Set set = this.f155539b;
        sdo.m34959a(bvbw);
        set.add(bvbw);
    }

    /* renamed from: b */
    public final bvbw mo73279b(buzt buzt) {
        bvbw a;
        bvbw a2;
        sdo.m34959a(buzt);
        synchronized (this.f155538a) {
            a = mo73151a(buzt, this.f155538a.keySet());
            if (a == null) {
                synchronized (this.f155539b) {
                    a2 = mo73151a(buzt, this.f155539b);
                    if (a2 != null) {
                        this.f155539b.remove(a2);
                    }
                }
                a = a2;
            }
            if (a == null) {
                a = mo73150a(buzt);
            }
            if (a != null) {
                Integer num = (Integer) this.f155538a.get(a);
                if (num == null) {
                    num = 0;
                }
                this.f155538a.put(a, Integer.valueOf(num.intValue() + 1));
            }
        }
        return a;
    }

    /* renamed from: c */
    public final void mo73281c(bvbw bvbw) {
        boolean z;
        sdo.m34959a(bvbw);
        synchronized (this.f155538a) {
            Integer num = (Integer) this.f155538a.get(bvbw);
            if (num != null) {
                z = true;
                if (num.intValue() > 1) {
                    this.f155538a.put(bvbw, Integer.valueOf(num.intValue() - 1));
                    z = false;
                } else {
                    this.f155538a.remove(bvbw);
                }
            } else {
                throw new IllegalArgumentException("Unknown connection.");
            }
        }
        if (z) {
            bvbw.close();
        }
    }

    /* renamed from: b */
    public final void mo73280b(bvbw bvbw) {
        Set set = this.f155539b;
        sdo.m34959a(bvbw);
        if (set.remove(bvbw)) {
            bvbw.close();
        }
    }
}
