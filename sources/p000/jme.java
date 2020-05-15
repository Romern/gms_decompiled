package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.ClientPublicKey;
import com.google.android.gms.auth.cryptauth.ExportedSymmetricKey;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: jme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jme {

    /* renamed from: a */
    public static final /* synthetic */ int f22813a = 0;

    /* renamed from: b */
    private static final Logger f22814b = jsy.m17256a("KeyAgreementPerformer");

    /* renamed from: a */
    public static final byte[] m16917a(Context context, byte[] bArr) {
        jta a = jsz.m17257a();
        List d = soz.m35801d(context.getApplicationContext(), context.getPackageName());
        if (d.isEmpty()) {
            f22814b.mo25418e("No account found", new Object[0]);
            a.mo14061q(5);
            return null;
        }
        aucb a2 = inl.m15759a(context).mo13181a("PublicKey", (Account) d.get(0), new ClientPublicKey(bArr));
        try {
            qxo a3 = a.mo14040a("key_agreement_execution_time");
            aucu.m76783a(a2, cchc.m129656b(), TimeUnit.MILLISECONDS);
            a.mo14044a(a3);
            ExportedSymmetricKey exportedSymmetricKey = (ExportedSymmetricKey) a2.mo50386d();
            if (exportedSymmetricKey == null) {
                f22814b.mo25418e("Null exported symmetric key", new Object[0]);
                a.mo14061q(4);
                return null;
            }
            a.mo14061q(0);
            return exportedSymmetricKey.f10531b;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
                a.mo14061q(3);
            } else if (e instanceof TimeoutException) {
                a.mo14061q(1);
            } else {
                a.mo14061q(2);
            }
            f22814b.mo25418e("Failed to perform key agreement.", new Object[0]);
            return null;
        }
    }
}
