package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.folsom.SharedKey;
import com.google.android.gms.chromesync.operation.SaveTrustedVaultIntentOperation;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: qsl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qsl extends qsi {

    /* renamed from: b */
    private final rnt f42038b;

    /* renamed from: c */
    private final bmzi f42039c;

    /* renamed from: d */
    private final qvt f42040d = ((qvt) qvt.f42265a.mo13145b());

    /* renamed from: e */
    private final qvn f42041e = ((qvn) qvn.f42243a.mo13145b());

    public qsl(Context context, rnt rnt, Account account) {
        super("EnrollTrustedVaultPassphrase", account);
        sdo.m34959a(rnt);
        this.f42038b = rnt;
        this.f42039c = bmzn.m108681a((bmzi) new qsk(context));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f42038b.mo11797a(status);
    }

    /* renamed from: b */
    public final void mo24251b(Context context) {
        Context context2 = context;
        bmxv b = this.f42040d.mo24299b(this.f42031a);
        if (b.mo66813a()) {
            bstz bstz = ((bstx) b.mo66814b()).f147076c;
            if (bstz == null) {
                bstz = bstz.f147086g;
            }
            bsty a = bsty.m116191a(bstz.f147089b);
            if (a == null) {
                a = bsty.UNRECOGNIZED;
            }
            if (a == bsty.KEYSTORE_PASSPHRASE) {
                try {
                    aucu.m76782a(((izm) this.f42039c.mo6606a()).mo13530d(this.f42031a.f61088b));
                    qvn qvn = this.f42041e;
                    acyr acyr = this.f42031a;
                    synchronized (qvn.f42247d) {
                        bmxv b2 = qvn.f42245b.mo24299b(acyr);
                        try {
                            List list = (List) aucu.m76782a(qvn.f42246c.mo13529c(acyr.f61088b));
                            if (!list.isEmpty()) {
                                qqz a2 = qqz.m32681a(((SharedKey) bnjd.m109595d(list)).f10906b);
                                qqy b3 = qvn.mo24289b(acyr);
                                sdo.m34966a(a2, "cryptographerKey cannot be null");
                                ArrayList arrayList = new ArrayList(b3.f41983a.size());
                                arrayList.addAll(b3.f41983a.values());
                                arrayList.add(a2);
                                qqy qqy = new qqy(arrayList, a2.f41985a);
                                bxvd da = qul.f42159b.mo74144da();
                                bnrd a3 = qqy.f41983a.values().iterator();
                                while (a3.hasNext()) {
                                    quk a4 = ((qqz) a3.next()).mo24214a();
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    qul qul = (qul) da.f164949b;
                                    a4.getClass();
                                    if (!qul.f42161a.mo73666a()) {
                                        qul.f42161a = bxvk.m124021a(qul.f42161a);
                                    }
                                    qul.f42161a.add(a4);
                                }
                                qui a5 = qqy.mo24212a(((qul) da.mo74062i()).mo73642k());
                                qvt qvt = qvn.f42245b;
                                String str = ((bstx) b2.mo66814b()).f147074a;
                                bstz bstz2 = ((bstx) b2.mo66814b()).f147076c;
                                if (bstz2 == null) {
                                    bstz2 = bstz.f147086g;
                                }
                                long j = bstz2.f147093f;
                                synchronized (qvt.f42268d) {
                                    qvd qvd = qvt.f42267c;
                                    sdo.m34959a(acyr);
                                    sdo.m34977c(str);
                                    sdo.m34959a(a5);
                                    bxvd da2 = bstr.f147046d.mo74144da();
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bstr bstr = (bstr) da2.f164949b;
                                    str.getClass();
                                    bstr.f147048a = str;
                                    a5.getClass();
                                    bstr.f147049b = a5;
                                    bstr.f147050c = j;
                                    bstr bstr2 = (bstr) da2.mo74062i();
                                    try {
                                        qrr qrr = qvd.f42220a;
                                        ClientContext a6 = qvd.mo24283a(acyr);
                                        if (qrr.f42013k == null) {
                                            qrr.f42013k = chtv.m149566a(chtu.UNARY, "google.internal.chrome.sync.passwords.v1.Passwords/EnableTrustedVaultPassphrase", ciie.m150370a(bstr.f147046d), ciie.m150370a(bstx.f147072d));
                                        }
                                        qvt.mo24298a(acyr, bmxv.m108566b((bstx) qrr.f42015a.mo25553a(qrr.f42013k, a6, bstr2, 10000, TimeUnit.MILLISECONDS)));
                                    } catch (chuw e) {
                                        qve.m32935a(e);
                                        throw new qrp(257, qve.m32936b(e), e);
                                    } catch (gid e2) {
                                        throw new qrp(qrq.m32742a(e2), e2);
                                    }
                                }
                            } else {
                                throw new qrp(257, "Failed to retrieve key material.");
                            }
                        } catch (InterruptedException | ExecutionException e3) {
                            if (!(e3.getCause() instanceof rjp)) {
                                throw new qrp(257, "Failed to retrieve key material.", e3);
                            }
                            throw qrp.m32740a((rjp) e3.getCause());
                        } catch (qqw | qra e4) {
                            throw new qrp(1025, "Failed to create key bag.", e4);
                        }
                    }
                    context2.startService(SaveTrustedVaultIntentOperation.m22430a(context2, this.f42031a));
                    this.f42038b.mo11797a(Status.f30107a);
                    return;
                } catch (InterruptedException | ExecutionException e5) {
                    if (e5.getCause() instanceof rjp) {
                        rjp rjp = (rjp) e5.getCause();
                        throw new qrp(qrq.m32741a(rjp.mo24655a()), rjp);
                    }
                    throw new qrp(1025, e5);
                }
            }
        }
        throw new qrp(1793, "Must be a keystore passphrase user to enroll in trusted vault passphrase.");
    }
}
