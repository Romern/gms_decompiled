package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;

/* renamed from: sbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class sbm extends sam implements rjm, sbn {

    /* renamed from: H */
    public final sat f44003H;

    /* renamed from: I */
    public final Set f44004I;

    /* renamed from: a */
    private final Account f44005a;

    /* JADX WARNING: Illegal instructions before constructor call */
    protected sbm(Context context, Looper looper, int i, sat sat, rlz rlz, rof rof) {
        this(context, looper, r3, r4, i, sat, rlz, rof);
        sbq a = sbq.m34856a(context);
        rfi rfi = rfi.f42868a;
        sdo.m34959a(rlz);
        sdo.m34959a(rof);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Set mo25290C() {
        return this.f44004I;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Set mo16779a(Set set) {
        return set;
    }

    /* renamed from: u */
    public Set mo16786u() {
        return !mo12787g() ? Collections.emptySet() : this.f44004I;
    }

    /* renamed from: y */
    public final Account mo25309y() {
        return this.f44005a;
    }

    /* renamed from: z */
    public Feature[] mo25310z() {
        return new Feature[0];
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    protected sbm(Context context, Looper looper, sbq sbq, rfi rfi, int i, sat sat, rlz rlz, rof rof) {
        super(context, looper, sbq, rfi, i, r6, r7, r10.f43968f);
        sbk sbk;
        sbl sbl;
        sat sat2 = sat;
        rlz rlz2 = rlz;
        rof rof2 = rof;
        if (rlz2 != null) {
            sbk = new sbk(rlz2);
        } else {
            sbk = null;
        }
        if (rof2 != null) {
            sbl = new sbl(rof2);
        } else {
            sbl = null;
        }
        this.f44003H = sat2;
        this.f44005a = sat2.f43963a;
        Set set = sat2.f43965c;
        Set<Scope> a = mo16779a(set);
        for (Scope scope : a) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f44004I = a;
    }
}
