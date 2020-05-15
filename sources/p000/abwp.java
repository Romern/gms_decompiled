package p000;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: abwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abwp {

    /* renamed from: a */
    public final String f58640a;

    /* renamed from: b */
    public final acpl f58641b;

    /* renamed from: c */
    public final Queue f58642c = new ArrayDeque();

    /* renamed from: d */
    public abwo f58643d = null;

    /* renamed from: e */
    public final boolean f58644e;

    /* renamed from: f */
    private int f58645f = 0;

    public abwp(acpl acpl, String str, boolean z) {
        this.f58640a = str;
        this.f58641b = acpl;
        this.f58644e = z;
    }

    /* renamed from: a */
    public final synchronized void mo32389a(abwo abwo) {
        boolean z;
        boolean z2 = true;
        if (this.f58643d == abwo) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        int i = abwo.f58637c;
        if (this.f58645f < i) {
            z2 = false;
        }
        sdo.m34970a(z2);
        this.f58645f -= i;
    }

    /* renamed from: a */
    public final synchronized void mo32390a(abwo abwo, long j) {
        boolean z;
        if (this.f58643d == abwo) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        this.f58641b.mo32990a(abwo.mo32386a(4), j);
    }

    /* renamed from: a */
    public final boolean mo32391a(bqbd bqbd, abwl abwl, boolean z) {
        abwo abwo = new abwo(bqbd, abwl, z, 1, this);
        int intValue = ((Integer) abzt.f58864aE.mo58455c()).intValue();
        int i = abwo.f58637c;
        synchronized (this) {
            int i2 = this.f58645f + i;
            if (i2 > intValue) {
                return false;
            }
            this.f58645f = i2;
            if (this.f58643d != null) {
                this.f58642c.add(abwo);
                return true;
            }
            this.f58643d = abwo;
            this.f58641b.mo32995d(abwo.mo32388b());
            return true;
        }
    }
}
