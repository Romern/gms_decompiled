package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: jgl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jgl extends rrj {

    /* renamed from: a */
    private static final Logger f22424a = ght.m13171a("AuthManaged", "FetchManagingAppInfoLoader");

    /* renamed from: b */
    private final jhm f22425b;

    /* renamed from: c */
    private final jhl f22426c;

    /* renamed from: d */
    private final Account f22427d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jgl(Context context, Account account) {
        super(context);
        jhl a = jhl.m16704a();
        jhm a2 = jhm.m16712a(context);
        sdo.m34959a(account);
        this.f22427d = account;
        this.f22426c = a;
        this.f22425b = a2;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        f22424a.mo25414c("loadInBackground", new Object[0]);
        this.f22425b.mo13743a(2);
        jhh a = this.f22426c.mo13740a(getContext(), this.f22427d);
        this.f22426c.mo13742b(getContext(), this.f22427d);
        if (ccgz.m129649c()) {
            if (ccgz.m129648b()) {
                this.f22425b.mo13744a(9, this.f22426c.mo13738a(a.f22486b));
            } else {
                this.f22425b.mo13743a(9);
            }
        }
        return new jgk(a.f22486b, a.f22487c);
    }
}
