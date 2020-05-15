package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: kun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kun implements cayy {

    /* renamed from: a */
    private final cijl f25117a;

    /* renamed from: b */
    private final cijl f25118b;

    public kun(cijl cijl, cijl cijl2) {
        this.f25117a = cijl;
        this.f25118b = cijl2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Object obj;
        Context context = (Context) ((cayz) this.f25118b).f176439a;
        Account account = ((kdi) ((cayz) this.f25117a).f176439a).f23888d;
        if (account != null && !ccip.m129877q()) {
            aemh aemh = new aemh();
            aemh.f63516b = "autofill";
            aemh.f63518d = account.name;
            obj = bmxv.m108566b(new kid(aema.m52142b(context, aemh.mo34328a())));
        } else {
            obj = bmvz.f131120a;
        }
        cazf.m127593a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
