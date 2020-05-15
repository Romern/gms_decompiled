package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: bbio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbio {

    /* renamed from: a */
    private final Context f102748a;

    /* renamed from: b */
    private final bbir f102749b;

    public bbio(Context context, bbir bbir) {
        this.f102748a = context;
        this.f102749b = bbir;
    }

    /* renamed from: a */
    public final bbin mo56152a() {
        Context context = this.f102748a;
        cagl cagl = cagl.MDI_SYNC_COMPONENTS_VERBOSE;
        return new bbin(new qws(context, cagl.name(), null), this.f102749b);
    }

    /* renamed from: a */
    public final bbin mo56153a(Account account) {
        Context context = this.f102748a;
        cagl cagl = cagl.MDI_SYNC_COMPONENTS_GAIA;
        return new bbin(new qws(context, cagl.name(), account.name), this.f102749b);
    }
}
