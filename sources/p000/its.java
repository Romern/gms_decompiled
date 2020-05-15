package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.KeyDerivationResult;
import com.google.android.gms.common.api.Status;

/* renamed from: its */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class its extends aaab {

    /* renamed from: g */
    private static final sek f21708g = new sek(new String[]{"HkdfOperation"}, (byte[]) null);

    /* renamed from: a */
    private final irh f21709a;

    /* renamed from: b */
    private final Account f21710b;

    /* renamed from: c */
    private final String f21711c;

    /* renamed from: d */
    private final String f21712d;

    /* renamed from: e */
    private final byte[] f21713e;

    /* renamed from: f */
    private final byte[] f21714f;

    public its(irh irh, Account account, String str, String str2, byte[] bArr, byte[] bArr2) {
        super(129, "HkdfOperation");
        this.f21709a = irh;
        this.f21710b = account;
        this.f21711c = str;
        this.f21712d = str2;
        this.f21713e = bArr;
        this.f21714f = bArr2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        f21708g.mo25412b("Hkdf operation is called", new Object[0]);
        isn isn = new isn(context);
        isn.f21612a = 10;
        try {
            KeyDerivationResult a = isw.m16064a(context, isn).mo13322a(this.f21710b, this.f21711c, this.f21712d, this.f21713e, this.f21714f);
            isn.f21613b = 1;
            isn.mo13317a();
            this.f21709a.mo13295a(a);
        } catch (isu e) {
            isn.mo13317a();
            mo6503a(new Status(25508));
        } catch (iqs e2) {
            f21708g.mo25417e("Failed hkdf", e2, new Object[0]);
            isn.mo13317a();
            mo6503a(new Status(25507));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f21709a.mo13296a(status);
    }
}
