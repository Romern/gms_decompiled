package p000;

import android.accounts.Account;
import com.google.android.gms.auth.cryptauth.Payload;
import com.google.android.gms.auth.cryptauth.SignedBlob;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: jnk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jnk {
    /* renamed from: a */
    static final byte[] m16970a(adyd adyd, ios ios, byte[] bArr) {
        Account[] a = adyd.mo33916a("com.google");
        if (a.length > 0) {
            Account account = a[0];
            bxvd da = byrv.f167517d.mo74144da();
            int i = bysa.UNLOCK_KEY_SIGNED_CHALLENGE.f167549q;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byrv byrv = (byrv) da.f164949b;
            int i2 = i - 1;
            if (i != 0) {
                byrv.f167520b = i2;
                byrv.f167519a |= 1;
                aucb a2 = ios.mo13182a("PublicKey", account, new Payload(bArr, ((byrv) da.mo74062i()).serializeToBytes(), new byte[0]));
                try {
                    aucu.m76783a(a2, cchc.m129656b(), TimeUnit.MILLISECONDS);
                    SignedBlob signedBlob = (SignedBlob) a2.mo50386d();
                    if (signedBlob != null) {
                        return signedBlob.f10557b;
                    }
                    throw new jmm("Signed blob is null.");
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    throw new jmm(e);
                }
            } else {
                throw null;
            }
        } else {
            throw new jmm("No account to sign.");
        }
    }
}
