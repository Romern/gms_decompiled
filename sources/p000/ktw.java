package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: ktw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ktw implements cayy {

    /* renamed from: a */
    private final cijl f25051a;

    /* renamed from: b */
    private final cijl f25052b;

    public ktw(cijl cijl, cijl cijl2) {
        this.f25051a = cijl;
        this.f25052b = cijl2;
    }

    /* renamed from: a */
    public static ktw m18572a(cijl cijl, cijl cijl2) {
        return new ktw(cijl, cijl2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Context context = (Context) this.f25051a.mo6445a();
        Account[] a = lqo.m19535a(((ktm) this.f25052b).mo6445a());
        bnha bnha = new bnha();
        for (Account account : a) {
            bnha.mo67695b(account, new kfe(context, 2, (qqa) qqs.m32662b().mo24210a(account)));
        }
        bnhe b = bnha.mo67618b();
        cazf.m127593a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
