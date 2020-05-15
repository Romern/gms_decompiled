package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: hkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hkx implements hep {

    /* renamed from: a */
    private final Context f19967a;

    /* renamed from: b */
    private final String f19968b;

    /* renamed from: c */
    private final Account f19969c;

    public hkx(Context context, String str, Account account) {
        sdo.m34959a(context);
        this.f19967a = context;
        sdo.m34977c(str);
        this.f19968b = str;
        sdo.m34959a(account);
        this.f19969c = account;
    }

    /* renamed from: a */
    public final adbj mo12290a() {
        return adbj.AUTH_API_CREDENTIALS_INTERNAL_UPDATE_DEFAULT_ACCOUNT;
    }

    /* renamed from: a */
    public final bqgg mo12291a(hez hez) {
        if (ccdj.f178786a.mo6606a().mo75794a()) {
            soz.m35788a(this.f19967a, this.f19968b, this.f19969c);
        }
        return bqga.m112775a((Object) null);
    }
}
