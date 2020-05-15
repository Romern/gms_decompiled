package p000;

import android.accounts.Account;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.SyncPolicy;

/* renamed from: ackv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ackv {

    /* renamed from: a */
    public final cijl f60051a;

    public ackv(cijl cijl) {
        m49350a(cijl, 1);
        this.f60051a = cijl;
    }

    /* renamed from: a */
    public static void m49350a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }

    /* renamed from: a */
    public final acku mo32829a(String str, Account account, int i, int i2, SyncPolicy syncPolicy, LatestFootprintFilter latestFootprintFilter, rnt rnt) {
        baok baok = (baok) this.f60051a.mo6445a();
        m49350a(baok, 1);
        m49350a(str, 2);
        m49350a(account, 3);
        m49350a(syncPolicy, 6);
        m49350a(latestFootprintFilter, 7);
        m49350a(rnt, 8);
        return new acku(baok, str, account, i, i2, syncPolicy, latestFootprintFilter, rnt);
    }
}
