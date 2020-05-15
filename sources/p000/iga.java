package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.authzen.SigncryptedMessage;
import com.google.android.gms.auth.cryptauth.Payload;
import com.google.android.gms.auth.cryptauth.SignedBlob;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: iga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iga extends ify {

    /* renamed from: a */
    private final Account f20902a;

    /* renamed from: b */
    private final int f20903b;

    /* renamed from: c */
    private final byte[] f20904c;

    /* renamed from: d */
    private final Logger f20905d = new Logger("SigncryptPayloadOperation");

    /* renamed from: e */
    private final iie f20906e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iga(iie iie, Account account, int i, byte[] bArr) {
        super("SigncryptPayload");
        long j = ifj.f20859a;
        sdo.m34959a(iie);
        this.f20906e = iie;
        sdo.m34959a(account);
        this.f20902a = account;
        this.f20903b = i;
        this.f20904c = (byte[]) sdo.m34959a(bArr);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f20906e.mo13040a(new iij(status, null).mo13041b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo12979b(Context context) {
        Account account = this.f20902a;
        if (account.name.equals("<<default account>>")) {
            Account[] a = adyd.m51363a(context).mo33916a("com.google");
            if (a.length > 0) {
                account = a[0];
            } else {
                throw new aaaj(8, "No account found to sign");
            }
        }
        bysa a2 = bysa.m125237a(this.f20903b);
        if (a2 == bysa.UNLOCK_KEY_SIGNED_CHALLENGE) {
            try {
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
                    this.f20906e.mo13040a(new iij(Status.f30107a, new SigncryptedMessage(((SignedBlob) ifj.m15368a(inl.m15759a(context).mo13182a("PublicKey", account, new Payload(this.f20904c, ((byrv) da.mo74062i()).serializeToBytes(), new byte[0])))).f10557b)).mo13041b());
                    return;
                }
                throw null;
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                this.f20905d.mo25417e("Failed to sign message", e, new Object[0]);
                throw new aaaj(8, e.getMessage());
            }
        } else {
            try {
                this.f20906e.mo13040a(new iij(Status.f30107a, new SigncryptedMessage(ifj.m15369a(context, a2, this.f20904c, account))).mo13041b());
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                this.f20905d.mo25417e("Failed to sign message", e2, new Object[0]);
                throw new aaaj(8, e2.getMessage());
            }
        }
    }
}
