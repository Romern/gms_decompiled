package p000;

import android.content.Context;

/* renamed from: hln */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hln {

    /* renamed from: a */
    public final hmc f19985a;

    private hln(Context context) {
        this.f19985a = hmc.m14599a(context);
    }

    /* renamed from: a */
    public static hln m14581a(Context context) {
        int i = spn.f44932a;
        return new hln(context);
    }

    /* renamed from: b */
    public final bqgg mo12604b(acyr acyr) {
        return mo12605b(acyr, "credentials_need_first_time_welcome");
    }

    /* renamed from: a */
    public final bqgg mo12602a(acyr acyr) {
        return mo12605b(acyr, "credentials_enable_service");
    }

    /* renamed from: b */
    public final bqgg mo12605b(acyr acyr, String str) {
        return bqdx.m112673a(this.f19985a.mo12614a(acyr, bnic.m109489a(str)), new hll(), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo12603a(acyr acyr, String str) {
        return bqdx.m112673a(this.f19985a.mo12613a(acyr, str), hlg.f19979a, bqfb.INSTANCE);
    }
}
