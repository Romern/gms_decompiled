package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: kvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kvt implements cayy {

    /* renamed from: a */
    private final cijl f25232a;

    /* renamed from: b */
    private final cijl f25233b;

    /* renamed from: c */
    private final cijl f25234c;

    public kvt(cijl cijl, cijl cijl2, cijl cijl3) {
        this.f25232a = cijl;
        this.f25233b = cijl2;
        this.f25234c = cijl3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Object obj;
        Context context = (Context) ((cayz) this.f25232a).f176439a;
        bnhe bnhe = (bnhe) this.f25234c.mo6445a();
        Account account = ((kdi) ((cayz) this.f25233b).f176439a).f23888d;
        if (account == null) {
            obj = bmvz.f131120a;
        } else if (!ccjv.m130166b()) {
            awbt awbt = new awbt();
            awbt.f94149b = account;
            awbt.mo51835a(ccip.m129872l() ^ true ? 1 : 0);
            obj = bmxv.m108566b(new awkh(context, awbt.mo51834a()));
        } else {
            obj = bmxv.m108567c((awkh) bnhe.get(account));
        }
        cazf.m127593a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
