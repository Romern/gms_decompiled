package p000;

import android.content.Context;

/* renamed from: hoo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hoo implements hep {

    /* renamed from: a */
    public final String f20129a;

    /* renamed from: b */
    public final hln f20130b;

    /* renamed from: c */
    private final Context f20131c;

    public hoo(Context context, String str) {
        this.f20131c = context;
        this.f20129a = str;
        this.f20130b = hln.m14581a(context);
    }

    /* renamed from: a */
    public final adbj mo12290a() {
        return adbj.AUTH_API_CREDENTIALS_INTERNAL_LIST_ELIGIBLE_ACCOUNTS_FOR_PASSWORD_SAVE;
    }

    /* renamed from: a */
    public final bqgg mo12291a(hez hez) {
        return bqdx.m112674a(new hou(this.f20131c).mo12291a(hez), new hoi(this, hez), bqfb.INSTANCE);
    }
}
