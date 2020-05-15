package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.auth.cryptauth.ClientPublicKey;
import com.google.android.gms.auth.cryptauth.ExportedSymmetricKey;
import com.google.android.gms.common.api.Status;
import javax.crypto.SecretKey;

/* renamed from: itw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class itw extends aaab {

    /* renamed from: a */
    private final irb f21730a;

    /* renamed from: b */
    private final String f21731b;

    /* renamed from: c */
    private final Account f21732c;

    /* renamed from: d */
    private final ClientPublicKey f21733d;

    /* renamed from: e */
    private final sek f21734e = new sek(new String[]{"PerformProximityKeyAgreementOperation"}, (byte[]) null);

    public itw(irb irb, String str, Account account, ClientPublicKey clientPublicKey) {
        super(129, "PerformProximityKeyAgreementOperation");
        this.f21730a = irb;
        this.f21731b = str;
        this.f21732c = account;
        this.f21733d = clientPublicKey;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        isn isn = new isn(context);
        isn.f21612a = 5;
        try {
            SecretKey a = isw.m16064a(context, isn).mo13329a(this.f21731b, this.f21732c, this.f21733d);
            ExportedSymmetricKey exportedSymmetricKey = new ExportedSymmetricKey(a.getEncoded(), SystemClock.currentThreadTimeMillis());
            isn.f21613b = 1;
            isn.mo13317a();
            this.f21730a.mo13174a(exportedSymmetricKey);
        } catch (iqs e) {
            this.f21734e.mo25417e("Proximity key generation failed", e, new Object[0]);
            isn.mo13317a();
            mo6503a(new Status(25507));
        } catch (isu e2) {
            isn.mo13317a();
            mo6503a(new Status(25508));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f21730a.mo13175a(status);
    }
}
