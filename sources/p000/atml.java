package p000;

import android.content.Context;
import java.io.File;

/* renamed from: atml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atml extends C0034at {

    /* renamed from: a */
    public static final srn f90485a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: g */
    final bqgj f90486g = snp.m35702a(10);

    /* renamed from: h */
    public final Context f90487h;

    public atml(Context context) {
        this.f90487h = context;
    }

    /* renamed from: a */
    public static File m76181a(Context context) {
        return new File(context.getCacheDir(), "token_selector_anim");
    }

    /* renamed from: e */
    public final String mo50041e() {
        if (atyg.m76554a(this.f90487h)) {
            return cgxl.f187974a.mo6606a().mo84684e();
        }
        return cgxl.f187974a.mo6606a().mo84685f();
    }

    /* renamed from: a */
    public final void mo2443a() {
        bqgg bqgg;
        File a = atmi.m76178a(this.f90487h, asmd.m74372a(mo50041e()));
        if (a.exists()) {
            bqgg = bqga.m112775a(atmj.m76179a(a));
        } else {
            File a2 = m76181a(this.f90487h);
            String[] list = a2.list();
            if (list != null) {
                for (String str : list) {
                    new File(a2, str).delete();
                }
            }
            bqgg = bqdx.m112673a(this.f90486g.mo25819b(new atmg(this.f90487h, mo50041e(), a)), new atmf(), this.f90486g);
        }
        bqga.m112781a(bqgg, new atmh(this), bqfb.INSTANCE);
    }
}
