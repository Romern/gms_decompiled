package p000;

import android.os.Bundle;

/* renamed from: wge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wge implements wgd {

    /* renamed from: a */
    public static final String f50614a = wgc.m41906a("FamilyApiMessage");

    /* renamed from: b */
    public final Bundle f50615b = new Bundle(13);

    static {
        wgc.m41906a("isDirectAddInvitations");
    }

    public wge(String str, String str2) {
        sdo.m34977c(str);
        sdo.m34977c(str2);
        this.f50615b.putString(f50614a, "ManageFamilyV2");
        this.f50615b.putString("accountName", str);
        this.f50615b.putString("appId", str2);
    }
}
