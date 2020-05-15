package p000;

/* renamed from: biyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biyi {

    /* renamed from: a */
    public String f122257a = "Unknown";

    /* renamed from: b */
    public String f122258b = "Unknown";

    /* renamed from: a */
    public static String m102972a(String str, boolean z) {
        if ("VisibleUsingXml".equals(str) || "Visible".equals(str) || "Invisible".equals(str)) {
            if (!z) {
                if ("VisibleUsingXml".equals(str)) {
                    return "VisibleUsingXml_to_Invisible";
                }
                if ("Visible".equals(str)) {
                    return "Visible_to_Invisible";
                }
            } else if ("Invisible".equals(str)) {
                return "Invisible_to_Visible";
            }
            return str;
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Illegal visibility state: ") : "Illegal visibility state: ".concat(valueOf));
    }

    /* renamed from: c */
    public static final String m102973c(boolean z, boolean z2) {
        return !z ? "Invisible" : !z2 ? "Visible" : "VisibleUsingXml";
    }

    /* renamed from: b */
    public final void mo64867b(boolean z, boolean z2) {
        this.f122258b = this.f122258b.equals("Unknown") ? m102973c(z, z2) : this.f122258b;
    }

    /* renamed from: a */
    public final void mo64866a(boolean z, boolean z2) {
        this.f122257a = this.f122257a.equals("Unknown") ? m102973c(z, z2) : this.f122257a;
    }
}
