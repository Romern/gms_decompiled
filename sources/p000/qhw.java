package p000;

import android.accounts.Account;
import android.content.Context;
import java.io.IOException;
import java.util.List;

/* renamed from: qhw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qhw {

    /* renamed from: a */
    private static final sek f41434a = qgn.m32143a("AccountModule");

    /* renamed from: a */
    public static List m32192a(Context context, bngx bngx) {
        bngs j = bngx.m109377j();
        bnre i = bngx.listIterator();
        while (i.hasNext()) {
            Account account = (Account) i.next();
            String str = null;
            try {
                str = gie.m13194b(context, account, "AndroidCheckInServer");
            } catch (C1020gis e) {
                f41434a.mo25416d("awaiting user notification for token", new Object[0]);
            } catch (gid e2) {
                f41434a.mo25417e("Unrecoverable authentication exception: %s.", e2, e2.getMessage());
            } catch (IOException e3) {
                f41434a.mo25415d("error reading account token", e3, new Object[0]);
            }
            String str2 = account.name;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2);
            sb.append("[");
            sb.append(str2);
            sb.append("]");
            j.mo67668c(sb.toString());
            if (str != null && !str.isEmpty()) {
                j.mo67668c(str);
            }
        }
        if (bngx.isEmpty()) {
            j.mo67668c("");
        }
        return j.mo67664a();
    }
}
