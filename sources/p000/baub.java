package p000;

/* renamed from: baub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baub extends batz {

    /* renamed from: a */
    public final baui f101747a;

    /* renamed from: b */
    public final bmxv f101748b;

    public baub(baui baui, bmxv bmxv) {
        this.f101747a = baui;
        this.f101748b = bmxv;
    }

    /* renamed from: a */
    public final baui mo55959a() {
        return this.f101747a;
    }

    /* renamed from: b */
    public final bmxv mo55960b() {
        return this.f101748b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof batz) {
            batz batz = (batz) obj;
            return this.f101747a.equals(batz.mo55959a()) && this.f101748b.equals(batz.mo55960b());
        }
    }

    public final int hashCode() {
        baui baui = this.f101747a;
        int i = baui.f164758ag;
        if (i == 0) {
            i = bxxm.f165037a.mo74228a(baui).mo74216a(baui);
            baui.f164758ag = i;
        }
        return this.f101748b.hashCode() ^ ((i ^ 1000003) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f101747a);
        String valueOf2 = String.valueOf(this.f101748b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53 + String.valueOf(valueOf2).length());
        sb.append("AddFileGroupRequest{dataFileGroup=");
        sb.append(valueOf);
        sb.append(", accountOptional=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
