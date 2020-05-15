package p000;

import android.os.Bundle;
import java.util.Arrays;

/* renamed from: aqkt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqkt implements rjh, rjj {

    /* renamed from: a */
    public static final aqkt f86306a = new aqks().mo47941a();

    /* renamed from: b */
    public final boolean f86307b;

    /* renamed from: c */
    public final boolean f86308c;

    /* renamed from: d */
    public final String f86309d;

    /* renamed from: e */
    public final boolean f86310e;

    /* renamed from: f */
    public final String f86311f;

    /* renamed from: g */
    public final String f86312g;

    /* renamed from: h */
    public final boolean f86313h;

    /* renamed from: i */
    public final Long f86314i;

    /* renamed from: j */
    public final Long f86315j;

    public aqkt(boolean z, boolean z2, String str, boolean z3, String str2, String str3, boolean z4, Long l, Long l2) {
        this.f86307b = z;
        this.f86308c = z2;
        this.f86309d = str;
        this.f86310e = z3;
        this.f86313h = z4;
        this.f86311f = str2;
        this.f86312g = str3;
        this.f86314i = l;
        this.f86315j = l2;
    }

    /* renamed from: a */
    public final Bundle mo47943a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", this.f86307b);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", this.f86308c);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", this.f86309d);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", this.f86310e);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", this.f86311f);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", this.f86312g);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", this.f86313h);
        Long l = this.f86314i;
        if (l != null) {
            bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", l.longValue());
        }
        Long l2 = this.f86315j;
        if (l2 != null) {
            bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", l2.longValue());
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aqkt) {
            aqkt aqkt = (aqkt) obj;
            return this.f86307b == aqkt.f86307b && this.f86308c == aqkt.f86308c && sdg.m34949a(this.f86309d, aqkt.f86309d) && this.f86310e == aqkt.f86310e && this.f86313h == aqkt.f86313h && sdg.m34949a(this.f86311f, aqkt.f86311f) && sdg.m34949a(this.f86312g, aqkt.f86312g) && sdg.m34949a(this.f86314i, aqkt.f86314i) && sdg.m34949a(this.f86315j, aqkt.f86315j);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f86307b), Boolean.valueOf(this.f86308c), this.f86309d, Boolean.valueOf(this.f86310e), Boolean.valueOf(this.f86313h), this.f86311f, this.f86312g, this.f86314i, this.f86315j});
    }
}
