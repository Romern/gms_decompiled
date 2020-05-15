package p000;

import android.accounts.Account;

/* renamed from: achl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class achl {

    /* renamed from: a */
    private final cijl f59857a;

    public achl(cijl cijl) {
        m49120a(cijl, 1);
        this.f59857a = cijl;
    }

    /* renamed from: a */
    private static void m49120a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }

    /* renamed from: a */
    public final achk mo32742a(Account account, int i, int i2, afmu afmu, rnt rnt) {
        acgi acgi = (acgi) this.f59857a.mo6445a();
        m49120a(acgi, 1);
        m49120a(account, 2);
        m49120a(afmu, 5);
        m49120a(rnt, 6);
        return new achk(acgi, account, i, i2, afmu, rnt);
    }
}
