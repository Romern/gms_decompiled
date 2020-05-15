package p000;

import android.content.Context;

/* renamed from: astr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class astr extends asum {

    /* renamed from: a */
    private static final srn f89713a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public final void mo49486a(Context context, asqw asqw, int i) {
        if (cgwn.f187872a.mo6606a().mo84613aa() && asqw.f89457u != null && asqw.f89454r == -1) {
            String str = asqw.f89457u.f108340a;
            try {
                atdz atdz = new atdz(new askf(asqw.f89440d, asqw.f89441e, asqw.f89439c, context));
                atdz.mo49886d().execSQL("UPDATE PaymentCards SET last_tap_timestamp=? WHERE billing_id=? AND account_id=? AND environment=?", new Object[]{Long.valueOf(System.currentTimeMillis()), str, atdz.mo49890f(), atdz.mo49891g()});
            } catch (asks e) {
                bnsl bnsl = (bnsl) f89713a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("astr", "a", 37, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68448m();
            }
        }
    }
}
