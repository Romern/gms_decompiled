package p000;

/* renamed from: axxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axxe extends axxd {

    /* renamed from: a */
    private final String f96637a;

    public axxe(String str) {
        this.f96637a = str;
    }

    /* renamed from: a */
    public final boolean mo53708a(axxi axxi, int i, boolean z, String str) {
        boolean z2;
        if (!chnj.f188812a.mo6606a().mo85398X()) {
            return false;
        }
        boolean equals = "com.google.android.wearable.app".equals(axxi.f96646a.f96377a);
        String str2 = axxi.f96647b.f96640b;
        if (!equals || !str2.startsWith("/bugreport/")) {
            if (chmo.m148984b()) {
                String str3 = axxi.f96647b.f96639a;
                if (str3.equals(this.f96637a) || str3.equals("cloud")) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((!str3.equals(str) && !z2) && !"cloud".equals(str)) {
                    return true;
                }
            }
            if (i < 2 || !equals || (!str2.startsWith("/contacts2/") && !str2.startsWith("/package_manager/"))) {
                return false;
            }
            return true;
        } else if (axxi.f96648c || z) {
            return false;
        } else {
            return true;
        }
    }
}
