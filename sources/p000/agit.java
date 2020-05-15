package p000;

/* renamed from: agit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agit {

    /* renamed from: a */
    final agje f65646a;

    public agit(agje agje) {
        this.f65646a = agje;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo35473a() {
        try {
            svq b = svr.m36484b(this.f65646a.f65685a);
            if (b == null) {
                this.f65646a.mo35497E().f65572k.mo35435a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (b.mo26176b("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            this.f65646a.mo35497E().f65572k.mo35436a("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
