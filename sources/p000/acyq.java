package p000;

import android.os.Bundle;

/* renamed from: acyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acyq {

    /* renamed from: a */
    public final Bundle f61085a;

    public acyq(Bundle bundle) {
        this.f61085a = bundle;
    }

    /* renamed from: a */
    public static acyp m50010a() {
        return new acyp(Bundle.EMPTY);
    }

    /* renamed from: b */
    public final bmxv mo33247b() {
        return bmxv.m108567c(this.f61085a.getString("title"));
    }

    /* renamed from: c */
    public final boolean mo33248c() {
        return this.f61085a.getBoolean("should_show_consent", false);
    }

    /* renamed from: d */
    public final bmxv mo33249d() {
        return bmxv.m108567c(this.f61085a.getString("privacy_policy_url"));
    }

    /* renamed from: e */
    public final bmxv mo33250e() {
        return bmxv.m108567c(this.f61085a.getString("terms_of_service_url"));
    }

    /* renamed from: f */
    public final bmxv mo33251f() {
        return this.f61085a.containsKey("theme") ? bmxv.m108566b(Integer.valueOf(this.f61085a.getInt("theme", 0))) : bmvz.f131120a;
    }

    /* renamed from: a */
    public static acyp m50011a(Bundle bundle) {
        return new acyp(bundle);
    }
}
