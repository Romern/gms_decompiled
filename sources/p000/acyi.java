package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identity.accounts.api.AccountData;
import com.google.android.gms.identity.accounts.security.EncryptedAccountData;

/* renamed from: acyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acyi extends aaab {

    /* renamed from: a */
    private final byte[] f61078a;

    /* renamed from: b */
    private final acyk f61079b;

    public acyi(acyk acyk, byte[] bArr) {
        super(9, "DecryptAccountData");
        this.f61079b = acyk;
        this.f61078a = bArr;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        boolean z;
        EncryptedAccountData encryptedAccountData;
        acxx a = acye.m49986a(context);
        acyk acyk = this.f61079b;
        byte[] bArr = this.f61078a;
        sdo.checkIfNull(bArr, "Encrypted bytes must not be null.");
        if (bArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "Encrypted bytes must not be empty.");
        AccountData accountData = null;
        try {
            encryptedAccountData = (EncryptedAccountData) sef.m35069a(bArr, EncryptedAccountData.CREATOR);
        } catch (sec e) {
            encryptedAccountData = null;
        }
        if (encryptedAccountData != null && a.mo33223a(encryptedAccountData)) {
            accountData = a.mo33226b(encryptedAccountData);
        }
        acyk.mo33241a(accountData);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f61079b.mo33241a((AccountData) null);
    }
}
