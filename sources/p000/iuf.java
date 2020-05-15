package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.Payload;
import com.google.android.gms.auth.cryptauth.SignCryptedBlob;
import com.google.android.gms.common.api.Status;

/* renamed from: iuf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iuf extends aaab {

    /* renamed from: f */
    private static final Logger f21778f = new Logger(new String[]{"VerifyDecryptOperation"}, (byte[]) null);

    /* renamed from: a */
    private final isf f21779a;

    /* renamed from: b */
    private final String f21780b;

    /* renamed from: c */
    private final String f21781c;

    /* renamed from: d */
    private final Account f21782d;

    /* renamed from: e */
    private final Payload f21783e;

    public iuf(isf isf, String str, String str2, Account account, Payload payload) {
        super(129, "SignCryptOperation");
        this.f21779a = isf;
        this.f21780b = str;
        this.f21781c = str2;
        this.f21782d = account;
        this.f21783e = payload;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        isn isn = new isn(context);
        isn.f21612a = 2;
        try {
            SignCryptedBlob a = isw.m16064a(context, isn).mo13325a(this.f21780b, this.f21781c, this.f21782d, this.f21783e);
            isn.f21613b = 1;
            isn.mo13317a();
            this.f21779a.mo13312a(a);
        } catch (iqs e) {
            f21778f.mo25417e("Failed to sign payload", e, new Object[0]);
            isn.mo13317a();
            mo6503a(new Status(25507));
        } catch (isu e2) {
            f21778f.mo25410a((Throwable) e2);
            isn.mo13317a();
            mo6503a(new Status(25508));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f21779a.mo13313a(status);
    }
}
