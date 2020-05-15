package p000;

/* renamed from: axqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axqv implements axor {

    /* renamed from: a */
    private final String f96281a;

    /* renamed from: b */
    private final String f96282b;

    public axqv(axor axor) {
        this.f96281a = axor.mo53320a();
        this.f96282b = axor.mo53321b();
    }

    /* renamed from: a */
    public final String mo53320a() {
        return this.f96281a;
    }

    /* renamed from: b */
    public final String mo53321b() {
        return this.f96282b;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataItemAssetEntity[@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.f96281a == null) {
            sb.append(",noid");
        } else {
            sb.append(",");
            sb.append(this.f96281a);
        }
        sb.append(", key=");
        sb.append(this.f96282b);
        sb.append("]");
        return sb.toString();
    }

    public axqv(String str, String str2) {
        this.f96281a = str;
        this.f96282b = str2;
    }
}
