package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: qsj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qsj extends qsi {

    /* renamed from: b */
    private static final bnic f42033b = bnic.m109489a((Object) 2);

    /* renamed from: c */
    private final rnt f42034c;

    /* renamed from: d */
    private final int f42035d;

    /* renamed from: e */
    private final Bundle f42036e;

    public qsj(rnt rnt, Account account, int i, Bundle bundle) {
        super("Delete", account);
        sdo.m34959a(rnt);
        this.f42034c = rnt;
        this.f42035d = i;
        sdo.m34959a(bundle);
        this.f42036e = bundle;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f42034c.mo11797a(status);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo24251b(Context context) {
        if (f42033b.contains(Integer.valueOf(this.f42035d))) {
            qvp qvp = (qvp) qvp.f42250b.mo13145b();
            if (qvp.mo24293a(this.f42031a, this.f42035d)) {
                try {
                    acyr acyr = this.f42031a;
                    int i = this.f42035d;
                    byte[] byteArray = this.f42036e.getByteArray("entity");
                    sdo.m34959a(acyr);
                    sdo.m34959a(byteArray);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    synchronized (qvp.f42257i) {
                        qvp.mo24292a(acyr);
                        bsty bsty = (bsty) qvp.f42254f.mo24290c(acyr).mo66812a(bsty.KEYSTORE_PASSPHRASE);
                        qrj a = qrk.m32721a(i);
                        qrf a2 = a.mo24228a(byteArray);
                        ArrayList arrayList = new ArrayList();
                        for (qtq qtq : qvp.f42253e.mo24274a(acyr, i, a.mo24226a(a2).mo67639g())) {
                            qtp qtp = new qtp(qtq);
                            qtp.f42109d = true;
                            qtp.f42110e = true;
                            arrayList.add(qtp.mo24267a());
                        }
                        if (!arrayList.isEmpty()) {
                            qvp.f42253e.mo24276a(acyr, (qtq[]) arrayList.toArray(new qtq[0]));
                            qwa qwa = qvp.f42256h;
                            qwb qwb = new qwb();
                            qwb.f42296a = acyr;
                            qwb.f42297b = ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE;
                            qwa.mo24303a(qwb.mo24305a());
                        }
                    }
                    qvp.f42249a.mo25412b("delete() [Latency: %dms]", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                    this.f42034c.mo11797a(Status.f30107a);
                } catch (qrl e) {
                    throw new qrp(1793, e.getMessage(), e);
                }
            } else {
                throw new qrp(1794, String.format(Locale.US, "Data of type %d is not subscribed.", Integer.valueOf(this.f42035d)));
            }
        } else {
            throw new qrp(1793, String.format(Locale.US, "Not allowed to delete data of type %d.", Integer.valueOf(this.f42035d)));
        }
    }
}
