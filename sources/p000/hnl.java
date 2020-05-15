package p000;

/* renamed from: hnl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hnl {

    /* renamed from: a */
    public final String f20074a;

    /* renamed from: b */
    public final Object f20075b;

    /* renamed from: c */
    protected final bmxe f20076c;

    protected hnl(String str, Object obj, bmxe bmxe) {
        sdo.m34977c(str);
        this.f20074a = str;
        this.f20075b = obj;
        sdo.m34959a(bmxe);
        this.f20076c = bmxe;
    }

    public final String toString() {
        String str = this.f20074a;
        StringBuilder sb = new StringBuilder(str.length() + 9);
        sb.append("Setting<");
        sb.append(str);
        sb.append(">");
        return sb.toString();
    }
}
