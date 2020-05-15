package p000;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.HintRequest;
import java.util.concurrent.ExecutorService;

/* renamed from: hms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hms implements hky, hkz {

    /* renamed from: a */
    public static final Logger f20041a = ght.m13172b("ChromeSyncCredentialProvider");

    /* renamed from: b */
    public final hmc f20042b;

    /* renamed from: c */
    public final hnw f20043c;

    /* renamed from: d */
    public final bqgj f20044d = bqgs.m112811a((ExecutorService) sne.m35694a(2, 9));

    private hms(Context context) {
        this.f20042b = hmc.m14599a(context);
        this.f20043c = hnw.m14663a(context);
    }

    /* renamed from: a */
    public static hms m14612a(Context context) {
        int i = spn.f44932a;
        return new hms(context);
    }

    /* renamed from: a */
    public final bqgg mo12600a(acyr acyr, HintRequest hintRequest) {
        if (hintRequest.f10115c) {
            return bqdx.m112673a(this.f20042b.mo12617b(acyr), hmj.f20023a, bqfb.INSTANCE);
        }
        return bqga.m112775a((Object) bngx.m109376e());
    }

    /* renamed from: a */
    public final bqgg mo12597a(acyr acyr, String str) {
        return bqdx.m112673a(this.f20042b.mo12613a(acyr, str), new hmd(acyr), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo12598a(acyr acyr, String str, Credential credential) {
        return bqdx.m112673a(this.f20042b.mo12615a(acyr, hmt.m14618a(credential, str)), new hmn(credential), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo12599a(acyr acyr, String str, Credential credential, boolean z, String str2, String str3) {
        bqgg a = bqdx.m112673a(this.f20042b.mo12613a(acyr, str), new hmk(credential), bqfb.INSTANCE);
        return (!z || !bmxi.m108538a(acyr.f61088b, credential.f10092a)) ? a : bqdx.m112674a(a, new hml(this, acyr, str, str2, str3), bqfb.INSTANCE);
    }
}
