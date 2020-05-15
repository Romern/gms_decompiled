package p000;

import android.accounts.Account;
import android.content.Context;
import android.util.Base64;
import com.google.android.gms.common.api.Status;

/* renamed from: qsx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qsx extends qsi {

    /* renamed from: b */
    private final rnt f42074b;

    /* renamed from: c */
    private final String f42075c;

    public qsx(rnt rnt, Account account, String str) {
        super("VerifyPassphrase", account);
        sdo.m34959a(rnt);
        this.f42074b = rnt;
        sdo.m34959a((Object) str);
        this.f42075c = str;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f42074b.mo11797a(status);
    }

    /* renamed from: b */
    public final void mo24251b(Context context) {
        qqz qqz;
        boolean a;
        qvn qvn = (qvn) qvn.f42243a.mo13145b();
        acyr acyr = this.f42031a;
        String str = this.f42075c;
        synchronized (qvn.f42247d) {
            try {
                bstz bstz = qvn.f42245b.mo24300c(acyr).f147076c;
                if (bstz == null) {
                    bstz = bstz.f147086g;
                }
                if (bstz.f147091d != 2) {
                    qqz = qqz.m32679a(str);
                } else {
                    qrc a2 = qrc.m32684a(sqd.m35966a(bstz.f147092e), str);
                    qqz = new qqz(Base64.encodeToString(a2.mo24215a(qrb.PASSWORD, "nigori-key"), 2), a2);
                }
                a = qvn.mo24288a(acyr, qqz);
            } catch (qqw | qra e) {
                throw new qrp(qrq.m32743a(e), "Failed to create cryptographer from the passphrase.", e);
            }
        }
        if (a) {
            ((qvr) qvr.f42258a.mo13145b()).mo24294a(this.f42031a);
            this.f42074b.mo11797a(Status.f30107a);
            return;
        }
        throw new qrp(1795, "Wrong passphrase.");
    }
}
