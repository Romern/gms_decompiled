package p000;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.auth.cryptauth.ExportedSymmetricKey;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: grm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class grm {

    /* renamed from: a */
    private static final Logger f18891a = new Logger("Auth", "AuthzenSecretProviderHelper");

    /* renamed from: b */
    private static final long f18892b = TimeUnit.MINUTES.toMillis(60);

    /* renamed from: c */
    private static final byte[] f18893c = {71, 111, 111, 103, 108, 101, 79, 102, 102, 108, 105, 110, 101, 79, 84, 80};

    /* renamed from: d */
    private static final byte[] f18894d = {84, 72, 79, 84, 80};

    /* renamed from: e */
    private final Context f18895e;

    /* renamed from: a */
    static SecretKeySpec m13779a(SecretKey secretKey) {
        try {
            MessageDigest b = spn.m35868b("SHA256");
            if (b != null) {
                return new SecretKeySpec(byst.m125284a(secretKey, b.digest(f18893c), f18894d), "");
            }
            return null;
        } catch (GeneralSecurityException e) {
            f18891a.mo25417e("Unexpected exception in key derivation.", e, new Object[0]);
            return null;
        }
    }

    public grm(Context context) {
        this.f18895e = context;
    }

    /* renamed from: a */
    public final grv mo12135a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        aucb c = inl.m15759a(this.f18895e).mo13187c("authzen", new Account(str, "com.google"));
        try {
            aucu.m76783a(c, f18892b, TimeUnit.MILLISECONDS);
            ExportedSymmetricKey exportedSymmetricKey = (ExportedSymmetricKey) c.mo50386d();
            long j = exportedSymmetricKey.f10532c;
            SecretKeySpec a = m13779a(byrr.m125225a(exportedSymmetricKey.f10531b));
            if (a != null) {
                return new grv(str, a.getEncoded(), j);
            }
            f18891a.mo25418e("Failed to derive secret for %s.", Logger.m35081a(str));
            return null;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            f18891a.mo25417e("Error fetching key from Cryptauth", e, new Object[0]);
            return null;
        }
    }
}
