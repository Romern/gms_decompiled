package p000;

import android.content.Context;

/* renamed from: atgg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atgg {

    /* renamed from: a */
    private static final srn f90291a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    private static cijs f90292b;

    /* renamed from: c */
    private static ciln f90293c;

    /* renamed from: d */
    private static athb f90294d;

    /* renamed from: a */
    private static synchronized athb m75817a(Context context, atgt atgt) {
        athb athb;
        String str;
        synchronized (atgg.class) {
            if (f90294d == null) {
                brgl b = atgf.m75810b(context);
                brha brha = new brha();
                brgz brgz = new brgz(rpr.m34216b().getRequestQueue());
                if (askc.m74274c(askc.m74272b())) {
                    new breo(2);
                } else {
                    new breo(1);
                }
                if (!rfy.m33549f(context)) {
                    str = "WC020003";
                } else {
                    str = "WC020002";
                }
                ((bnsl) f90291a.mo68390d()).mo68420a("Initializing ApTest SDK with wallet %s", str);
                f90294d = new athb(brha, b, brgz, str, context, atgt.f90322g);
            }
            athb = f90294d;
        }
        return athb;
    }

    /* renamed from: b */
    private static synchronized ciln m75820b(Context context) {
        ciln ciln;
        String str;
        synchronized (atgg.class) {
            if (f90293c == null) {
                brgl b = atgf.m75810b(context);
                brha brha = new brha();
                brgz brgz = new brgz(rpr.m34216b().getRequestQueue());
                breo breo = askc.m74274c(askc.m74272b()) ? new breo(2) : new breo(1);
                if (!askc.m74274c(askc.m74272b())) {
                    str = "WC020002";
                } else {
                    str = "WC020003";
                }
                ((bnsl) f90291a.mo68390d()).mo68405a("Initializing iD SDK");
                f90293c = new ciln(brha, b, brgz, breo, str);
            }
            ciln = f90293c;
        }
        return ciln;
    }

    /* renamed from: a */
    public static brfc m75818a(atgt atgt, Context context) {
        atgt atgt2 = atgt.ID;
        int ordinal = atgt.ordinal();
        if (ordinal == 0) {
            return m75820b(context);
        }
        if (ordinal == 1) {
            return m75819a(context);
        }
        if (ordinal == 2 || ordinal == 3) {
            return m75817a(context, atgt);
        }
        throw new IllegalArgumentException("Unsupported Felica postpaid provider.");
    }

    /* renamed from: a */
    private static synchronized cijs m75819a(Context context) {
        cijs cijs;
        String str;
        synchronized (atgg.class) {
            if (f90292b == null) {
                brgl b = atgf.m75810b(context);
                brha brha = new brha();
                brgz brgz = new brgz(rpr.m34216b().getRequestQueue());
                if (askc.m74274c(askc.m74272b())) {
                    new breo(2);
                } else {
                    new breo(1);
                }
                if (!rfy.m33549f(context)) {
                    str = "WC020003";
                } else {
                    str = "WC020002";
                }
                ((bnsl) f90291a.mo68390d()).mo68420a("Initializing QPSDK with wallet %s", str);
                f90292b = new cijs(brha, b, brgz, str);
            }
            cijs = f90292b;
        }
        return cijs;
    }
}
