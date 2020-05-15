package p000;

import android.accounts.Account;
import android.content.Context;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* renamed from: qss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qss extends qsi {

    /* renamed from: b */
    private final rnt f42058b;

    /* renamed from: c */
    private final int f42059c;

    public qss(rnt rnt, Account account, int i) {
        super("MarkStale", account);
        sdo.m34959a(rnt);
        this.f42058b = rnt;
        this.f42059c = i;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f42058b.mo11797a(status);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo24251b(Context context) {
        qvp qvp = (qvp) qvp.f42250b.mo13145b();
        if (qvp.mo24293a(this.f42031a, this.f42059c)) {
            acyr acyr = this.f42031a;
            int i = this.f42059c;
            sdo.m34959a(acyr);
            synchronized (qvp.f42257i) {
                qvp.f42252d.mo24254a(acyr, qta.m32827b(i), true);
                qwa qwa = qvp.f42256h;
                qwb qwb = new qwb();
                qwb.f42296a = acyr;
                qwb.f42297b = ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE;
                qwb.f42298c = false;
                qwa.mo24304b(qwb.mo24305a());
            }
            this.f42058b.mo11797a(Status.f30107a);
            return;
        }
        throw new qrp(1794, String.format(Locale.US, "Data of type %d is not subscribed.", Integer.valueOf(this.f42059c)));
    }
}
