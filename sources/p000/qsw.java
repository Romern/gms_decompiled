package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: qsw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qsw extends qsi {

    /* renamed from: b */
    private final rnt f42072b;

    /* renamed from: c */
    private final byte[] f42073c;

    public qsw(rnt rnt, Account account, Bundle bundle) {
        super("VerifyEncryptionKey", account);
        sdo.m34959a(rnt);
        this.f42072b = rnt;
        this.f42073c = (byte[]) sdo.m34959a(bundle.getByteArray("encryption_key"));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f42072b.mo11797a(status);
    }

    /* renamed from: b */
    public final void mo24251b(Context context) {
        boolean a;
        try {
            quk quk = (quk) GeneratedMessageLite.m124016a(quk.f42153e, this.f42073c, bxus.m123744c());
            try {
                qvn qvn = (qvn) qvn.f42243a.mo13145b();
                acyr acyr = this.f42031a;
                qqz a2 = qqz.m32680a(quk);
                synchronized (qvn.f42247d) {
                    a = qvn.mo24288a(acyr, a2);
                }
                if (a) {
                    ((qvr) qvr.f42258a.mo13145b()).mo24294a(this.f42031a);
                    this.f42072b.mo11797a(Status.f30107a);
                    return;
                }
                throw new qrp(1795, "Wrong passphrase.");
            } catch (qqw e) {
                throw new qrp(1025, "Error when verifying passphrase cryptographer.", e);
            }
        } catch (bxwf e2) {
            throw new qrp(1793, "Error parsing the proto.", e2);
        }
    }
}
