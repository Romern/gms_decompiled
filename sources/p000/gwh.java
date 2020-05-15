package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: gwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gwh extends rjx {

    /* renamed from: a */
    public static final /* synthetic */ int f19117a = 0;

    /* renamed from: b */
    private static final rjo f19118b = new rjo("Auth.CREDENTIALS_INTERNAL_API", f19120d, f19119c);

    /* renamed from: c */
    private static final rje f19119c = new rje();

    /* renamed from: d */
    private static final rjl f19120d = new gvv();

    public gwh(Context context, hid hid) {
        super(context, f19118b, hid, rjw.f43159a);
    }

    /* renamed from: a */
    public final aucb mo12277a(Account account, String str, boolean z) {
        return mo24732b(new gvu(account, str, z));
    }

    /* renamed from: a */
    public final void mo12278a() {
        mo24732b(new gwc());
    }

    /* renamed from: a */
    public final void mo12279a(String str) {
        mo24732b(new gvt(str));
    }
}
