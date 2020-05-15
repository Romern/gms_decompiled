package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import android.util.MutableBoolean;
import com.google.android.gms.auth.cryptauth.CryptauthPublicKey;
import com.google.android.gms.common.api.Status;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: jpt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jpt extends aaab {

    /* renamed from: a */
    static final long f23003a = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: b */
    private static final sek f23004b = jsy.m17256a("GetMyPublicKey");

    /* renamed from: c */
    private final jsd f23005c;

    /* renamed from: d */
    private final ios f23006d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jpt(jsd jsd) {
        super(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD, "GetMyPublicKey");
        ios a = inl.m15759a(rpr.m34216b());
        this.f23005c = jsd;
        this.f23006d = a;
    }

    /* renamed from: b */
    public static byte[] m17081b(Context context) {
        MutableBoolean mutableBoolean = new MutableBoolean(false);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new jpt(new jsc(byteArrayOutputStream, mutableBoolean)).mo6502a(context);
            if (mutableBoolean.value) {
                return byteArrayOutputStream.toByteArray();
            }
            return null;
        } catch (aaaj | RemoteException e) {
            f23004b.mo25418e("Failed to fetch public key.", new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        List d = soz.m35801d(context, context.getPackageName());
        if (!d.isEmpty()) {
            try {
                aucb d2 = this.f23006d.mo13188d("PublicKey", (Account) d.get(0));
                aucu.m76783a(d2, f23003a, TimeUnit.MILLISECONDS);
                CryptauthPublicKey cryptauthPublicKey = (CryptauthPublicKey) d2.mo50386d();
                if (cryptauthPublicKey != null) {
                    this.f23005c.mo14031a(Status.f30107a, cryptauthPublicKey.f10517b);
                    return;
                }
                throw new aaaj(8, "Null public key");
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                throw new aaaj(8, e.getMessage());
            }
        } else {
            throw new aaaj(8, "No account found");
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f23005c.mo14031a(status, null);
    }
}
