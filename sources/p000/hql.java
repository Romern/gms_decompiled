package p000;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.HintRequest;

/* renamed from: hql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hql implements hep {

    /* renamed from: a */
    public static final sek f20228a = ght.m13172b("ListHintsOperation");

    /* renamed from: b */
    public final bngx f20229b;

    /* renamed from: c */
    public final HintRequest f20230c;

    /* renamed from: d */
    private final Context f20231d;

    public hql(Context context, HintRequest hintRequest) {
        this.f20231d = context;
        bngs j = bngx.m109377j();
        int i = spn.f44932a;
        j.mo67668c(new hnb(context));
        j.mo67668c(new hmv(context));
        j.mo67668c(hms.m14612a(context));
        j.mo67668c(new hna(context));
        if (((Boolean) hfa.f19633b.mo58455c()).booleanValue()) {
            j.mo67668c(new hnv(context));
        }
        this.f20229b = j.mo67664a();
        this.f20230c = hintRequest;
    }

    /* renamed from: a */
    public final adbj mo12290a() {
        return adbj.AUTH_API_CREDENTIALS_LIST_HINTS;
    }

    /* renamed from: a */
    public final bqgg mo12291a(hez hez) {
        return bqdx.m112673a(bqdx.m112674a(new hou(this.f20231d).mo12291a(hez), new hqc(this, hez), bqfb.INSTANCE), hqd.f20220a, bqfb.INSTANCE);
    }
}
