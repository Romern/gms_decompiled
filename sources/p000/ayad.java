package p000;

/* renamed from: ayad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayad {

    /* renamed from: a */
    final axzf f96891a;

    /* renamed from: b */
    final boolean f96892b;

    public ayad(axzf axzf, boolean z) {
        sdo.m34959a(axzf);
        this.f96891a = axzf;
        this.f96892b = z;
    }

    public final String toString() {
        String str = this.f96891a.f96814a;
        String str2 = !this.f96892b ? "" : " (metered)";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + str2.length());
        sb.append("PeerConnection{node=");
        sb.append(str);
        sb.append(str2);
        sb.append('}');
        return sb.toString();
    }
}
