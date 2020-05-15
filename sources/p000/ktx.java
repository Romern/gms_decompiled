package p000;

import android.accounts.Account;
import android.content.Context;
import java.util.Map;

/* renamed from: ktx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ktx implements cayy {

    /* renamed from: a */
    private final cijl f25053a;

    /* renamed from: b */
    private final cijl f25054b;

    /* renamed from: c */
    private final cijl f25055c;

    /* renamed from: d */
    private final cijl f25056d;

    /* renamed from: e */
    private final cijl f25057e;

    /* renamed from: f */
    private final cijl f25058f;

    public ktx(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4, cijl cijl5, cijl cijl6) {
        this.f25053a = cijl;
        this.f25054b = cijl2;
        this.f25055c = cijl3;
        this.f25056d = cijl4;
        this.f25057e = cijl5;
        this.f25058f = cijl6;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Context context = (Context) ((cayz) this.f25053a).f176439a;
        bnhe bnhe = (bnhe) this.f25055c.mo6445a();
        bnhe bnhe2 = (bnhe) this.f25056d.mo6445a();
        kwu kwu = (kwu) this.f25057e.mo6445a();
        lhi b = ((kvv) this.f25058f).mo6445a();
        bnha bnha = new bnha();
        bnrd a = ((bnhe) this.f25054b.mo6445a()).entrySet().iterator();
        while (a.hasNext()) {
            Map.Entry entry = (Map.Entry) a.next();
            Account account = (Account) entry.getKey();
            kbe kbe = (kbe) bnhe.get(account);
            awkh awkh = (awkh) bnhe2.get(account);
            if (kbe != null && awkh != null) {
                bnha.mo67695b(account, new khd(context, (kfe) entry.getValue(), awkh, kbe, account, kwu.mo14899a(), b.mo15093m()));
                context = context;
            }
        }
        bnhe b2 = bnha.mo67618b();
        cazf.m127593a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
