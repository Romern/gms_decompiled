package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.KeyHandleResult;
import com.google.android.gms.common.api.Status;

/* renamed from: itp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class itp extends aaab {

    /* renamed from: d */
    private static final Logger f21697d = new Logger(new String[]{"GetKeyHandleOperation"}, (byte[]) null);

    /* renamed from: a */
    private final irq f21698a;

    /* renamed from: b */
    private final String f21699b;

    /* renamed from: c */
    private final Account f21700c;

    public itp(irq irq, String str, Account account) {
        super(129, "GetKeyHandleOperation");
        this.f21698a = irq;
        this.f21699b = str;
        this.f21700c = account;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        f21697d.mo25412b("Get key handle operation is called.", new Object[0]);
        try {
            this.f21698a.mo13301a(new KeyHandleResult(1, new ipo(context).mo13221b(this.f21699b, this.f21700c).f21636a));
        } catch (isu e) {
            mo6503a(new Status(25508));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f21698a.mo13302a(status);
    }
}
