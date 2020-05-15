package p000;

import android.content.Context;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import java.util.Locale;

/* renamed from: hkq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hkq implements hep {

    /* renamed from: a */
    public final String f19952a;

    /* renamed from: b */
    public final hmc f19953b;

    /* renamed from: c */
    public final hdw f19954c;

    /* renamed from: d */
    private final Context f19955d;

    public hkq(Context context, String str, SavePasswordRequest savePasswordRequest) {
        this.f19955d = context;
        this.f19952a = str;
        this.f19953b = hmc.m14599a(context);
        this.f19954c = new hdw(savePasswordRequest.f10245a.f10255a.toLowerCase(Locale.US), "");
    }

    /* renamed from: a */
    public final adbj mo12290a() {
        return adbj.AUTH_API_CREDENTIALS_INTERNAL_MATCH_PASSWORD;
    }

    /* renamed from: a */
    public final bqgg mo12291a(hez hez) {
        return bqdx.m112674a(new hoo(this.f19955d, this.f19952a).mo12291a(hez), new hki(this, hez), bqfb.INSTANCE);
    }
}
