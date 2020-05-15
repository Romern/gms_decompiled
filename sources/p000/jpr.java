package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: jpr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jpr extends aaab {

    /* renamed from: a */
    private final rnt f22998a;

    /* renamed from: b */
    private final Account f22999b;

    public jpr(rnt rnt, String str) {
        super(142, "ForceDeviceSync");
        this.f22998a = rnt;
        this.f22999b = new Account(str, "com.google");
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (!cchr.f178999a.mo6606a().mo75972d()) {
            return;
        }
        if (!soz.m35791a(context, this.f22999b)) {
            String valueOf = String.valueOf(this.f22999b.name);
            throw new aaaj(102, valueOf.length() == 0 ? new String("Account not found: ") : "Account not found: ".concat(valueOf));
        }
        jpp.m17075a();
        jpq.m17076a(context, this.f22999b);
        this.f22998a.mo11797a(Status.f30107a);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f22998a.mo11797a(status);
    }
}
