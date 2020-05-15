package p000;

import android.content.Context;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: hoh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hoh implements hep {

    /* renamed from: a */
    public static final sek f20114a = ght.m13171a("ListCredentialsOperation");

    /* renamed from: b */
    public final hky f20115b;

    /* renamed from: c */
    public final String f20116c;

    /* renamed from: d */
    public final bngx f20117d;

    /* renamed from: e */
    public final boolean f20118e;

    /* renamed from: f */
    public final bnic f20119f;

    public hoh(Context context, String str, List list, boolean z, Set set) {
        this.f20115b = hms.m14612a(context);
        this.f20116c = str;
        this.f20117d = bngx.m109368a((Collection) list);
        this.f20118e = z;
        this.f20119f = bnic.m109495a((Collection) set);
    }

    /* renamed from: a */
    public final adbj mo12290a() {
        return adbj.AUTH_API_CREDENTIALS_LIST_CREDENTIALS;
    }

    /* renamed from: a */
    public final bqgg mo12291a(hez hez) {
        return bqdx.m112673a(bqga.m112771a(new hoa(this, hez), bqfb.INSTANCE), hob.f20108a, bqfb.INSTANCE);
    }
}
