package p000;

/* renamed from: bntk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bntk {

    /* renamed from: a */
    public final bnuu f132132a;

    /* renamed from: b */
    public final String f132133b;

    public bntk(bnuu bnuu, String str) {
        bnuy.m110474a(bnuu, "parser");
        this.f132132a = bnuu;
        bnuy.m110474a(str, "message");
        this.f132133b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bntk) {
            bntk bntk = (bntk) obj;
            return this.f132132a.equals(bntk.f132132a) && this.f132133b.equals(bntk.f132133b);
        }
    }

    public final int hashCode() {
        return this.f132132a.hashCode() ^ this.f132133b.hashCode();
    }
}
