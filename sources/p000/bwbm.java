package p000;

/* renamed from: bwbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwbm {

    /* renamed from: a */
    public String f158748a = "";

    /* renamed from: b */
    public String f158749b = "";

    /* renamed from: c */
    public String f158750c = "";

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f158748a);
        if (!this.f158749b.isEmpty()) {
            sb.append("-");
            sb.append(this.f158749b);
        }
        if (!this.f158750c.isEmpty()) {
            sb.append("-");
            sb.append(this.f158750c);
        }
        return sb.toString();
    }
}
