package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: kuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kuz implements cayy {

    /* renamed from: a */
    private final cijl f25146a;

    /* renamed from: b */
    private final cijl f25147b;

    /* renamed from: c */
    private final cijl f25148c;

    /* renamed from: d */
    private final cijl f25149d;

    public kuz(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4) {
        this.f25146a = cijl;
        this.f25147b = cijl2;
        this.f25148c = cijl3;
        this.f25149d = cijl4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Object obj;
        Context context = (Context) ((cayz) this.f25146a).f176439a;
        kdi kdi = (kdi) ((cayz) this.f25147b).f176439a;
        bmxv bmxv = (bmxv) this.f25148c.mo6445a();
        bnhe bnhe = (bnhe) this.f25149d.mo6445a();
        if (ccjv.m130166b()) {
            Account account = kdi.f23888d;
            obj = account == null ? new kbi() : (kbe) bnhe.getOrDefault(account, new kbi());
        } else {
            Account account2 = kdi.f23888d;
            if (account2 == null || !bmxv.mo66813a()) {
                obj = new kbi();
            } else {
                obj = new kbh(context.getSharedPreferences(String.format("com.google.android.gms.autofill.ACCOUNT_DATA-%s", kdi.f23887c), 0), (kfe) bmxv.mo66814b(), account2);
            }
        }
        cazf.m127593a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
