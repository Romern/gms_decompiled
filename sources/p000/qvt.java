package p000;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: qvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qvt {

    /* renamed from: a */
    public static final imo f42265a = new qvs();

    /* renamed from: b */
    public final qta f42266b = ((qta) qta.f42084i.mo13145b());

    /* renamed from: c */
    public final qvd f42267c;

    /* renamed from: d */
    public final Object f42268d;

    /* renamed from: e */
    private final qtr f42269e = qtr.m32879a();

    /* renamed from: f */
    private final qvk f42270f = ((qvk) qvk.f42238a.mo13145b());

    public qvt(Context context) {
        this.f42267c = qvd.m32933a(context);
        this.f42268d = new Object();
    }

    /* renamed from: a */
    public final void mo24297a(acyr acyr) {
        synchronized (this.f42268d) {
            this.f42266b.mo24255a(acyr, qta.f42078c, qta.f42076a, qta.f42077b);
            this.f42269e.mo24269a(acyr);
            qvk qvk = this.f42270f;
            qvk.f42240b.sendBroadcast(new Intent("com.google.android.gms.chromesync.METADATA_UPDATED").putExtra("account", acyr.mo33252a()), "com.google.android.gms.chromesync.permission.METADATA_UPDATED");
        }
    }

    /* renamed from: b */
    public final bmxv mo24299b(acyr acyr) {
        bmxv bmxv;
        bmxv bmxv2;
        synchronized (this.f42268d) {
            if (!((Boolean) this.f42266b.mo24253a(acyr, qta.f42078c)).booleanValue()) {
                bmxv = (bmxv) this.f42266b.mo24253a(acyr, qta.f42077b);
            } else {
                try {
                    qvd qvd = this.f42267c;
                    sdo.m34959a(acyr);
                    bxvd da = bsts.f147051b.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    "users/me".getClass();
                    ((bsts) da.f164949b).f147053a = "users/me";
                    bsts bsts = (bsts) da.mo74062i();
                    qrr qrr = qvd.f42220a;
                    ClientContext a = qvd.mo24283a(acyr);
                    if (qrr.f42011i == null) {
                        qrr.f42011i = chtv.m149566a(chtu.UNARY, "google.internal.chrome.sync.passwords.v1.Passwords/GetMetadata", ciie.m150370a(bsts.f147051b), ciie.m150370a(bstx.f147072d));
                    }
                    bmxv2 = bmxv.m108566b((bstx) qrr.f42015a.mo25553a(qrr.f42011i, a, bsts, 10000, TimeUnit.MILLISECONDS));
                } catch (chuw e) {
                    if (qve.m32935a(e) != chus.NOT_FOUND) {
                        throw new qrp(257, qve.m32936b(e), e);
                    }
                    throw new qvc();
                } catch (gid e2) {
                    throw new qrp(qrq.m32742a(e2), e2);
                } catch (qvc e3) {
                    bmxv2 = bmvz.f131120a;
                }
                mo24298a(acyr, bmxv2);
                bmxv = bmxv2;
            }
        }
        return bmxv;
    }

    /* renamed from: c */
    public final bstx mo24300c(acyr acyr) {
        bstx bstx;
        synchronized (this.f42268d) {
            bmxv b = mo24299b(acyr);
            if (!b.mo66813a()) {
                qvd qvd = this.f42267c;
                sdo.m34959a(acyr);
                bxvd da = bstm.f147030b.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                "users/me".getClass();
                ((bstm) da.f164949b).f147032a = "users/me";
                bstm bstm = (bstm) da.mo74062i();
                try {
                    qrr qrr = qvd.f42220a;
                    ClientContext a = qvd.mo24283a(acyr);
                    if (qrr.f42012j == null) {
                        qrr.f42012j = chtv.m149566a(chtu.UNARY, "google.internal.chrome.sync.passwords.v1.Passwords/CreateMetadata", ciie.m150370a(bstm.f147030b), ciie.m150370a(bstx.f147072d));
                    }
                    bstx = (bstx) qrr.f42015a.mo25553a(qrr.f42012j, a, bstm, 10000, TimeUnit.MILLISECONDS);
                    mo24298a(acyr, bmxv.m108566b(bstx));
                } catch (chuw e) {
                    qve.m32935a(e);
                    throw new qrp(257, qve.m32936b(e), e);
                } catch (gid e2) {
                    throw new qrp(qrq.m32742a(e2), e2);
                }
            } else {
                bstx = (bstx) b.mo66814b();
            }
        }
        return bstx;
    }

    /* renamed from: a */
    public final void mo24298a(acyr acyr, bmxv bmxv) {
        bmxv bmxv2 = (bmxv) this.f42266b.mo24253a(acyr, qta.f42077b);
        if ((bmxv2.mo66813a() || bmxv.mo66813a()) && (!bmxv2.mo66813a() || !bmxv.mo66813a() || !TextUtils.equals(((bstx) bmxv2.mo66814b()).f147074a, ((bstx) bmxv.mo66814b()).f147074a))) {
            mo24297a(acyr);
        }
        this.f42266b.mo24254a(acyr, qta.f42078c, false);
        this.f42266b.mo24254a(acyr, qta.f42077b, bmxv);
    }
}
