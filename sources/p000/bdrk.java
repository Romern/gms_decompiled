package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: bdrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdrk {

    /* renamed from: a */
    private final qws f106300a;

    public bdrk(Context context) {
        this.f106300a = m91331a(context, cagl.FPOP_CLIENT.name(), null);
    }

    /* renamed from: a */
    protected static final qws m91331a(Context context, String str, String str2) {
        return new qws(context, str, str2);
    }

    public bdrk(Context context, Account account) {
        this.f106300a = m91331a(context, cagl.FPOP_CLIENT.name(), account.name);
    }

    /* renamed from: a */
    public final void mo58311a(int i, bxpw bxpw) {
        qwo a = this.f106300a.mo24335a(bxpw.serializeToBytes());
        a.mo24328b(i - 1);
        a.mo24327b();
    }
}
