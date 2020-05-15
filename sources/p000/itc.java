package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: itc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class itc {

    /* renamed from: a */
    public final iss f21656a;

    /* renamed from: b */
    public final iqu f21657b;

    public itc(Context context, Account account, iss iss) {
        this.f21657b = new iqu(context, account, iss, (String) ipl.f21493c.mo58455c());
        this.f21656a = iss;
    }

    /* renamed from: a */
    public static final ehh m16088a(chus chus) {
        chus chus2 = chus.OK;
        int ordinal = chus.ordinal();
        if (ordinal == 1 || ordinal == 4 || ordinal == 8 || ordinal == 10 || ordinal == 14) {
            return ehh.TEMPORARY_CONNECTION_FAILURE;
        }
        return ehh.INVALID_REQUEST_ERROR;
    }

    /* renamed from: a */
    public final void mo13331a() {
        this.f21657b.mo13265b();
    }
}
