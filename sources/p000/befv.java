package p000;

import android.accounts.Account;
import android.net.Uri;
import java.io.FileNotFoundException;

/* renamed from: befv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class befv implements befb {

    /* renamed from: a */
    private final befa f111517a;

    /* renamed from: b */
    private final Uri f111518b;

    public befv(befa befa, Uri uri) {
        this.f111517a = befa;
        this.f111518b = uri;
    }

    /* renamed from: a */
    public final bqgg mo60652a(Account account) {
        try {
            Integer a = befc.m94934a((byeg) this.f111517a.mo60643a(this.f111518b, new behr((bxxk) byeg.f165899d.mo74142c(7)), new beer[0]), account);
            if (a != null) {
                return bqga.m112775a(a);
            }
            throw new bego("Account not found");
        } catch (FileNotFoundException e) {
            throw new bego("Account not found", e);
        } catch (Exception e2) {
            return bqga.m112777a((Throwable) e2);
        }
    }
}
