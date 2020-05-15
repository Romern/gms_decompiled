package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.CryptauthPublicKey;
import com.google.android.gms.common.api.Status;

/* renamed from: iud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iud extends aaab {

    /* renamed from: d */
    private static final Logger f21769d = new Logger(new String[]{"RetrievePublicKey"}, (byte[]) null);

    /* renamed from: a */
    private final isc f21770a;

    /* renamed from: b */
    private final String f21771b;

    /* renamed from: c */
    private final Account f21772c;

    public iud(isc isc, String str, Account account) {
        super(129, "RetrievePublicKeyOperation");
        this.f21770a = isc;
        this.f21771b = str;
        this.f21772c = account;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        isn isn = new isn(context);
        isn.f21612a = 7;
        try {
            CryptauthPublicKey cryptauthPublicKey = new CryptauthPublicKey(1, new ipo(context).mo13221b(this.f21771b, this.f21772c).f21637b);
            isn.f21613b = 1;
            isn.mo13317a();
            this.f21770a.mo13310a(cryptauthPublicKey);
        } catch (isu e) {
            f21769d.mo25415d("Failed to retrieve public key", e, new Object[0]);
            isn.f21613b = 11;
            isn.mo13317a();
            mo6503a(new Status(25505));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f21770a.mo13311a(status);
    }
}
