package p000;

import android.accounts.Account;

/* renamed from: afvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afvz implements cayy {

    /* renamed from: a */
    private final cijl f64858a;

    public afvz(cijl cijl) {
        this.f64858a = cijl;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        batv batv;
        ayte b = aytf.m84780b();
        Account account = (Account) ((cayz) this.f64858a).f176439a;
        if (cfgv.m139557b()) {
            batv = batx.m87541b(b, account.toString(), (int) cfgy.m139568e());
        } else {
            batv = batx.m87539a(b, account.toString(), (int) cfgy.m139568e());
        }
        cazf.m127593a(batv, "Cannot return null from a non-@Nullable @Provides method");
        return batv;
    }
}
