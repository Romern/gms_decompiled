package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: itr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class itr extends aaab {

    /* renamed from: d */
    private static final sek f21704d = new sek(new String[]{"HaveKeyWithKeyNameOperation"}, (byte[]) null);

    /* renamed from: a */
    private final ire f21705a;

    /* renamed from: b */
    private final String f21706b;

    /* renamed from: c */
    private final Account f21707c;

    public itr(ire ire, String str, Account account) {
        super(129, "HaveKeyWithKeyNameOperation");
        this.f21705a = ire;
        this.f21706b = str;
        this.f21707c = account;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        f21704d.mo25412b("Have key with key name operation is called.", new Object[0]);
        try {
            new ipo(context).mo13221b(this.f21706b, this.f21707c);
            this.f21705a.mo13294a(true);
        } catch (isu e) {
            this.f21705a.mo13294a(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f21705a.mo13293a(status);
    }
}
