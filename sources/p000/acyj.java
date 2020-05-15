package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identity.accounts.api.AccountData;
import com.google.android.gms.identity.accounts.security.EncryptedAccountData;

/* renamed from: acyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acyj extends aaab {

    /* renamed from: a */
    private final AccountData f61080a;

    /* renamed from: b */
    private final acyk f61081b;

    public acyj(acyk acyk, AccountData accountData) {
        super(9, "EncryptAccountData");
        this.f61080a = accountData;
        this.f61081b = acyk;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        byte[] bArr;
        acxx a = acye.m49986a(context);
        acyk acyk = this.f61081b;
        AccountData accountData = this.f61080a;
        sdo.checkIfNull(accountData, "Account data must not be null.");
        byte[] bArr2 = new byte[16];
        a.f61060a.nextBytes(bArr2);
        byte[] a2 = a.mo33224a(accountData, bArr2);
        if (a2 != null) {
            bArr = sef.m35074a(new EncryptedAccountData(1, a2, bArr2, a.mo33225a(bArr2, a2)));
        } else {
            bArr = null;
        }
        acyk.mo33242a(bArr);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f61081b.mo33242a((byte[]) null);
    }
}
