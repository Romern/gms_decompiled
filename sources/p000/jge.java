package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.common.api.Status;

/* renamed from: jge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jge extends aaab {

    /* renamed from: a */
    private final jfz f22407a;

    /* renamed from: b */
    private final Account f22408b;

    /* renamed from: c */
    private final jhl f22409c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jge(jfz jfz, String str, String str2) {
        super(136, "FetchManagingAppInfo");
        jhl a = jhl.m16704a();
        this.f22407a = jfz;
        this.f22408b = new Account(str, str2);
        this.f22409c = a;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        int i = Build.VERSION.SDK_INT;
        jhh a = this.f22409c.mo13740a(context, this.f22408b);
        this.f22407a.mo13708a(a.f22485a, a.f22486b);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f22407a.mo13708a(status, (byte[]) null);
    }
}
