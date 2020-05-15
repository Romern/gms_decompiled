package p000;

/* renamed from: bgbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bgbt {

    /* renamed from: a */
    private final bhcv f116009a;

    /* renamed from: b */
    private final String f116010b;

    public bgbt(bhcv bhcv, String str) {
        this.f116009a = bhcv == null ? new bhcw() : bhcv;
        this.f116010b = str == null ? "" : str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof bgbt) {
            bgbt bgbt = (bgbt) obj;
            return this.f116009a.equals(bgbt.f116009a) && this.f116010b.equals(bgbt.f116010b);
        }
    }

    public int hashCode() {
        return (this.f116009a.hashCode() * 31) + this.f116010b.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f116009a);
        String str = this.f116010b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + str.length());
        sb.append("Client: ");
        sb.append(valueOf);
        sb.append(" Tag: ");
        sb.append(str);
        return sb.toString();
    }
}
