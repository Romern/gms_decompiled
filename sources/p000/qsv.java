package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: qsv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qsv extends qsi {

    /* renamed from: b */
    private final rnt f42068b;

    /* renamed from: c */
    private final String f42069c;

    /* renamed from: d */
    private final int f42070d;

    /* renamed from: e */
    private final String f42071e;

    public qsv(rnt rnt, String str, Account account, int i, String str2) {
        super("Unsubscribe", account);
        sdo.m34959a(rnt);
        this.f42068b = rnt;
        sdo.m34977c(str);
        this.f42069c = str;
        this.f42070d = i;
        sdo.m34959a((Object) str2);
        this.f42071e = str2;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f42068b.mo11797a(status);
    }

    /* renamed from: b */
    public final void mo24251b(Context context) {
        try {
            Intent a = qsg.m32789a(this.f42071e);
            a.setPackage(this.f42069c).putExtra("account_name", this.f42031a.f61088b).putExtra("account_type", this.f42031a.f61089c);
            qvp qvp = (qvp) qvp.f42250b.mo13145b();
            acyr acyr = this.f42031a;
            int i = this.f42070d;
            String a2 = qsg.m32790a(a);
            sdo.m34959a(acyr);
            sdo.m34977c(a2);
            synchronized (qvp.f42257i) {
                qty d = qta.m32829d(i);
                ArrayList arrayList = new ArrayList((Collection) qvp.f42252d.mo24253a(acyr, d));
                if (arrayList.contains(a2)) {
                    arrayList.remove(a2);
                    qvp.f42252d.mo24254a(acyr, d, bngx.m109368a((Collection) arrayList));
                    if (arrayList.size() == 0) {
                        qvp.f42251c.mo24270a(acyr, i);
                    }
                }
            }
            this.f42068b.mo11797a(Status.f30107a);
        } catch (URISyntaxException e) {
            throw new qrp(1793, "Unable to parse the intent.", e);
        }
    }
}
