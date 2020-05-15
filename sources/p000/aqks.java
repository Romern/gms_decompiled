package p000;

import android.os.Bundle;

/* renamed from: aqks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqks {

    /* renamed from: a */
    public boolean f86297a;

    /* renamed from: b */
    public boolean f86298b;

    /* renamed from: c */
    public String f86299c;

    /* renamed from: d */
    public boolean f86300d;

    /* renamed from: e */
    public String f86301e;

    /* renamed from: f */
    public String f86302f;

    /* renamed from: g */
    public boolean f86303g;

    /* renamed from: h */
    public Long f86304h;

    /* renamed from: i */
    public Long f86305i;

    /* renamed from: a */
    public static aqks m71765a(Bundle bundle) {
        aqks aqks = new aqks();
        aqks.f86297a = bundle.getBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        aqks.f86298b = bundle.getBoolean("com.google.android.gms.signin.internal.idTokenRequested");
        aqks.f86299c = bundle.getString("com.google.android.gms.signin.internal.serverClientId");
        aqks.f86300d = bundle.getBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        aqks.f86301e = bundle.getString("com.google.android.gms.signin.internal.hostedDomain");
        aqks.f86302f = bundle.getString("com.google.android.gms.signin.internal.logSessionId");
        aqks.f86303g = bundle.getBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        aqks.f86304h = Long.valueOf(bundle.getLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion"));
        aqks.f86305i = Long.valueOf(bundle.getLong("com.google.android.gms.signin.internal.realClientLibraryVersion"));
        return aqks;
    }

    /* renamed from: a */
    public final aqkt mo47941a() {
        return new aqkt(this.f86297a, this.f86298b, this.f86299c, this.f86300d, this.f86301e, this.f86302f, this.f86303g, this.f86304h, this.f86305i);
    }

    /* renamed from: a */
    public final void mo47942a(String str) {
        sdo.m34959a((Object) str);
        String str2 = this.f86299c;
        boolean z = true;
        if (str2 != null && !str2.equals(str)) {
            z = false;
        }
        sdo.m34975b(z, "two different server client ids provided");
    }
}
