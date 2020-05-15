package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.authzen.legacy.internal.OtpSecret;
import com.google.android.gms.auth.cryptauth.ExportedSymmetricKey;
import com.google.android.gms.common.api.Status;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: iip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iip extends aaab {

    /* renamed from: b */
    private static final byte[] f21057b = {71, 111, 111, 103, 108, 101, 79, 102, 102, 108, 105, 110, 101, 79, 84, 80};

    /* renamed from: c */
    private static final byte[] f21058c = {84, 72, 79, 84, 80};

    /* renamed from: d */
    private static final Logger f21059d = new Logger("AuthZenSecretProviderOperation");

    /* renamed from: a */
    private final String f21060a;

    /* renamed from: e */
    private final iim f21061e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iip(iim iim, String str) {
        super(107, "AuthZenSecretProvider");
        long j = ifj.f20859a;
        sdo.m34959a(iim);
        this.f21061e = iim;
        sdo.m34959a((Object) str);
        this.f21060a = str;
    }

    /* renamed from: a */
    static SecretKeySpec m15486a(SecretKey secretKey) {
        try {
            MessageDigest b = spn.m35868b("SHA256");
            if (b != null) {
                return new SecretKeySpec(byst.m125284a(secretKey, b.digest(f21057b), f21058c), "");
            }
            return null;
        } catch (GeneralSecurityException e) {
            f21059d.mo25417e("Unexpected exception in key derivation.", e, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        try {
            ExportedSymmetricKey exportedSymmetricKey = (ExportedSymmetricKey) ifj.m15368a(inl.m15759a(context).mo13187c("authzen", new Account(this.f21060a, "com.google")));
            SecretKey a = byrr.m125225a(exportedSymmetricKey.f10531b);
            long j = exportedSymmetricKey.f10532c;
            SecretKeySpec a2 = m15486a(a);
            if (a2 == null) {
                f21059d.mo25418e("Failed to derive secret for %s.", Logger.m35081a(this.f21060a));
                this.f21061e.mo13043a(Status.f30109c, (OtpSecret) null);
                return;
            }
            this.f21061e.mo13043a(Status.f30107a, new OtpSecret(1, this.f21060a, a2.getEncoded(), j));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            f21059d.mo25417e("Failed to retrieve key", e, new Object[0]);
            this.f21061e.mo13043a(Status.f30109c, (OtpSecret) null);
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f21061e.mo13043a(status, (OtpSecret) null);
    }
}
