package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.chromesync.ChromeSyncState;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: qsn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qsn extends qsi {

    /* renamed from: b */
    private final qrx f42043b;

    /* renamed from: c */
    private final bmzi f42044c;

    public qsn(Context context, qrx qrx, Account account) {
        super("GetState", account);
        sdo.m34959a(qrx);
        this.f42043b = qrx;
        this.f42044c = bmzn.m108681a((bmzi) new qsm(context));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f42043b.mo24233a(new qse(status, null).mo24247b());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d0  */
    /* renamed from: b */
    public final void mo24251b(Context context) {
        boolean z;
        bsty a;
        int ordinal;
        bmxv b = ((qvt) qvt.f42265a.mo13145b()).mo24299b(this.f42031a);
        PendingIntent pendingIntent = null;
        int i = 0;
        if (!b.mo66813a()) {
            this.f42043b.mo24233a(new qse(Status.f30107a, new ChromeSyncState(false, 0, null, false)).mo24247b());
            return;
        }
        bstz bstz = ((bstx) b.mo66814b()).f147076c;
        if (bstz == null) {
            bstz = bstz.f147086g;
        }
        if (!qqy.m32675a(bstz)) {
            try {
                ((qvn) qvn.f42243a.mo13145b()).mo24287a(this.f42031a);
                z = false;
            } catch (qrp e) {
                int i2 = e.f42002a;
                if (i2 == 1537) {
                    pendingIntent = qwg.m32995a(context, this.f42031a.mo33252a());
                } else if (i2 == 1538) {
                    pendingIntent = e.f42003b;
                } else {
                    throw e;
                }
                z = false;
                qrx qrx = this.f42043b;
                Status status = Status.f30107a;
                bsty bsty = bsty.PASSPHRASE_TYPE_UNSPECIFIED;
                a = bsty.m116191a(bstz.f147089b);
                if (a == null) {
                }
                ordinal = a.ordinal();
                if (ordinal == 1) {
                }
                qrx.mo24233a(new qse(status, new ChromeSyncState(true, i, pendingIntent, z)).mo24247b());
            }
        } else if (cddg.f180524a.mo6606a().mo77285a()) {
            aucb b2 = ((izm) this.f42044c.mo6606a()).mo13528b(this.f42031a.f61088b);
            try {
                aucu.m76782a(b2);
                z = ((Integer) b2.mo50386d()).equals(5);
            } catch (InterruptedException | CancellationException | ExecutionException e2) {
                z = false;
                qrx qrx2 = this.f42043b;
                Status status2 = Status.f30107a;
                bsty bsty2 = bsty.PASSPHRASE_TYPE_UNSPECIFIED;
                a = bsty.m116191a(bstz.f147089b);
                if (a == null) {
                }
                ordinal = a.ordinal();
                if (ordinal == 1) {
                }
                qrx2.mo24233a(new qse(status2, new ChromeSyncState(true, i, pendingIntent, z)).mo24247b());
            }
        } else {
            z = false;
        }
        qrx qrx22 = this.f42043b;
        Status status22 = Status.f30107a;
        bsty bsty22 = bsty.PASSPHRASE_TYPE_UNSPECIFIED;
        a = bsty.m116191a(bstz.f147089b);
        if (a == null) {
            a = bsty.UNRECOGNIZED;
        }
        ordinal = a.ordinal();
        if (ordinal == 1) {
            i = 1;
        } else if (ordinal == 2) {
            i = 2;
        } else if (ordinal == 3) {
            i = 3;
        } else if (ordinal == 4) {
            i = 4;
        } else if (ordinal == 5) {
            i = 5;
        }
        qrx22.mo24233a(new qse(status22, new ChromeSyncState(true, i, pendingIntent, z)).mo24247b());
    }
}
