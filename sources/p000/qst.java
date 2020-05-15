package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.common.api.Status;
import java.util.List;
import java.util.Locale;

/* renamed from: qst */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qst extends qsi {

    /* renamed from: b */
    private static final bnic f42060b = bnic.m109490a((Object) 2, (Object) 1);

    /* renamed from: c */
    private final rnt f42061c;

    /* renamed from: d */
    private final int f42062d;

    /* renamed from: e */
    private final Bundle f42063e;

    public qst(rnt rnt, Account account, int i, Bundle bundle) {
        super("Save", account);
        sdo.m34959a(rnt);
        this.f42061c = rnt;
        this.f42062d = i;
        sdo.m34959a(bundle);
        this.f42063e = bundle;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f42061c.mo11797a(status);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c5, code lost:
        if (((p000.qtq) r4.mo66814b()).f42115d.equals(r9.f42115d) == false) goto L_0x00c7;
     */
    /* renamed from: b */
    public final void mo24251b(Context context) {
        bmxv bmxv;
        qtp qtp;
        if (f42060b.contains(Integer.valueOf(this.f42062d))) {
            qvp qvp = (qvp) qvp.f42250b.mo13145b();
            if (qvp.mo24293a(this.f42031a, this.f42062d)) {
                try {
                    acyr acyr = this.f42031a;
                    int i = this.f42062d;
                    byte[] byteArray = this.f42063e.getByteArray("entity");
                    sdo.m34959a(acyr);
                    sdo.m34959a(byteArray);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    synchronized (qvp.f42257i) {
                        qvp.mo24292a(acyr);
                        bsty bsty = (bsty) qvp.f42254f.mo24290c(acyr).mo66812a(bsty.KEYSTORE_PASSPHRASE);
                        qrj a = qrk.m32721a(i);
                        bmxv a2 = qvp.mo24291a(a, acyr);
                        qrf a3 = a.mo24228a(byteArray);
                        List a4 = qvp.f42253e.mo24274a(acyr, i, bngx.m109356a(a3.f41993b));
                        if (!a4.isEmpty()) {
                            bmxv = bmxv.m108566b((qtq) a4.get(0));
                        } else {
                            bmxv = bmvz.f131120a;
                        }
                        if (!bmxv.mo66813a()) {
                            bxxc c = a.mo24230c(a3.f41994c, a2);
                            qtp = new qtp();
                            qtp.f42106a = a.mo24220a(a3.f41994c);
                            qtp.mo24268a(a.f41996b);
                            qtp.f42107b = c.mo73639aL();
                        } else {
                            qtp = a.mo24229a((qtq) bmxv.mo66814b(), a3, a2);
                        }
                        qtp.f42110e = false;
                        qtp.f42109d = true;
                        qtq a5 = qtp.mo24267a();
                        if (!bmxv.mo66813a()) {
                        }
                        qvp.f42253e.mo24276a(acyr, a5);
                        qvr qvr = qvp.f42255g;
                        bmxv a6 = qtm.m32864a(a3.f41992a);
                        if (a6.mo66813a()) {
                            synchronized (qvr.f42264f) {
                                bsty bsty2 = (bsty) qvr.f42263e.mo24290c(acyr).mo66812a(bsty.KEYSTORE_PASSPHRASE);
                                qvr.f42262d.mo24271a((qtm) a6.mo66814b(), acyr, qvr.m32965a(qrk.m32721a(a3.f41992a), a3));
                            }
                        }
                        qwa qwa = qvp.f42256h;
                        qwb qwb = new qwb();
                        qwb.f42296a = acyr;
                        qwb.f42297b = ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE;
                        qwa.mo24303a(qwb.mo24305a());
                    }
                    qvp.f42249a.mo25412b("save() [Latency: %dms]", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                    this.f42061c.mo11797a(Status.f30107a);
                } catch (qrl e) {
                    throw new qrp(1793, e);
                }
            } else {
                throw new qrp(1794, String.format(Locale.US, "Data of type %d is not subscribed.", Integer.valueOf(this.f42062d)));
            }
        } else {
            throw new qrp(1793, String.format(Locale.US, "Not allowed to save data of type %d.", Integer.valueOf(this.f42062d)));
        }
    }
}
