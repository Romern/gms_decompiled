package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.Payload;
import com.google.android.gms.auth.cryptauth.SignedBlob;
import com.google.android.gms.common.api.Status;

/* renamed from: iuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iuh extends aaab {

    /* renamed from: e */
    private static final sek f21789e = new sek(new String[]{"SignForOperation"}, (byte[]) null);

    /* renamed from: a */
    private final isi f21790a;

    /* renamed from: b */
    private final String f21791b;

    /* renamed from: c */
    private final Account f21792c;

    /* renamed from: d */
    private final Payload f21793d;

    public iuh(isi isi, String str, Account account, Payload payload) {
        super(129, "SignForOperation");
        this.f21790a = isi;
        this.f21791b = str;
        this.f21792c = account;
        this.f21793d = payload;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        isn isn = new isn(context);
        isn.f21612a = 1;
        try {
            SignedBlob a = isw.m16064a(context, isn).mo13327a(this.f21791b, this.f21792c, this.f21793d);
            isn.f21613b = 1;
            isn.mo13317a();
            this.f21790a.mo13176a(a);
        } catch (iqs e) {
            f21789e.mo25417e("Failed to sign payload", e, new Object[0]);
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
        this.f21790a.mo13177a(status);
    }
}
