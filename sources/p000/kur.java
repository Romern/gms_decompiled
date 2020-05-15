package p000;

import android.accounts.Account;
import android.content.Context;
import com.android.volley.RequestQueue;

/* renamed from: kur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kur implements cayy {

    /* renamed from: a */
    private final cijl f25133a;

    /* renamed from: b */
    private final cijl f25134b;

    /* renamed from: c */
    private final cijl f25135c;

    public kur(cijl cijl, cijl cijl2, cijl cijl3) {
        this.f25133a = cijl;
        this.f25134b = cijl2;
        this.f25135c = cijl3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Object obj;
        kdi kdi = (kdi) ((cayz) this.f25133a).f176439a;
        Context context = (Context) ((cayz) this.f25134b).f176439a;
        RequestQueue requestQueue = (RequestQueue) this.f25135c.mo6445a();
        if (!ccip.m129877q()) {
            obj = bmvz.f131120a;
        } else {
            Account account = kdi.f23888d;
            if (account != null) {
                aemh aemh = new aemh();
                aemh.f63516b = "autofill";
                aemh.f63518d = account.name;
                obj = bmxv.m108566b(new kjg(context, requestQueue, aema.m52142b(context, aemh.mo34328a())));
            } else {
                obj = bmvz.f131120a;
            }
        }
        cazf.m127593a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
