package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.HashResult;
import com.google.android.gms.common.api.Status;

/* renamed from: itt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class itt extends aaab {

    /* renamed from: f */
    private static final Logger f21715f = new Logger(new String[]{"HmacOperation"}, (byte[]) null);

    /* renamed from: a */
    private final irk f21716a;

    /* renamed from: b */
    private final Account f21717b;

    /* renamed from: c */
    private final String f21718c;

    /* renamed from: d */
    private final String f21719d;

    /* renamed from: e */
    private final byte[] f21720e;

    public itt(irk irk, Account account, String str, String str2, byte[] bArr) {
        super(129, "HmacOperation");
        this.f21716a = irk;
        this.f21717b = account;
        this.f21718c = str;
        this.f21719d = str2;
        this.f21720e = bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        f21715f.mo25412b("Hmac operation is called", new Object[0]);
        isn isn = new isn(context);
        isn.f21612a = 9;
        isx a = isw.m16064a(context, isn);
        try {
            Account account = this.f21717b;
            String str = this.f21718c;
            String str2 = this.f21719d;
            byte[] bArr = this.f21720e;
            if (bArr != null) {
                HashResult hashResult = new HashResult(1, ehv.m10468a(a.f21632a.mo13219a(str, account).f21655b.f21650a, bArr, str2));
                isn.f21613b = 1;
                isn.mo13317a();
                this.f21716a.mo13297a(hashResult);
                return;
            }
            throw new NullPointerException("Null data");
        } catch (isu e) {
            isn.mo13317a();
            mo6503a(new Status(25508));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f21716a.mo13298a(status);
    }
}
