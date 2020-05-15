package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.Payload;
import com.google.android.gms.auth.cryptauth.PlainText;
import com.google.android.gms.common.api.Status;

/* renamed from: iuj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iuj extends aaab {

    /* renamed from: e */
    private static final sek f21799e = new sek(new String[]{"VerifyDecryptOperation"}, (byte[]) null);

    /* renamed from: a */
    private final isl f21800a;

    /* renamed from: b */
    private final String f21801b;

    /* renamed from: c */
    private final Account f21802c;

    /* renamed from: d */
    private final Payload f21803d;

    public iuj(isl isl, String str, Account account, Payload payload) {
        super(129, "VerifyDecryptOperation");
        this.f21800a = isl;
        this.f21801b = str;
        this.f21802c = account;
        this.f21803d = payload;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        isn isn = new isn(context);
        isn.f21612a = 3;
        try {
            PlainText b = isw.m16064a(context, isn).mo13330b(this.f21801b, this.f21802c, this.f21803d);
            isn.f21613b = 1;
            isn.mo13317a();
            this.f21800a.mo13314a(b);
        } catch (iqs e) {
            f21799e.mo25417e("Failed to verifyDecrypt payload", e, new Object[0]);
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
        this.f21800a.mo13315a(status);
    }
}
