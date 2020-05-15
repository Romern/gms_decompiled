package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: kvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kvf implements cayy {

    /* renamed from: a */
    private final cijl f25165a;

    /* renamed from: b */
    private final cijl f25166b;

    public kvf(cijl cijl, cijl cijl2) {
        this.f25165a = cijl;
        this.f25166b = cijl2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        String str;
        Context context = (Context) ((cayz) this.f25165a).f176439a;
        Account account = ((kdi) ((cayz) this.f25166b).f176439a).f23888d;
        if (account != null) {
            str = account.name;
        } else {
            str = null;
        }
        qws qws = new qws(context, "AUTOFILL_WITH_GOOGLE", str);
        qws.mo24337a(cagz.UNMETERED_OR_DAILY);
        kxs kxs = new kxs(qws);
        cazf.m127593a(kxs, "Cannot return null from a non-@Nullable @Provides method");
        return kxs;
    }
}
