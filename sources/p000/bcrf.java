package p000;

/* renamed from: bcrf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcrf extends bcov {

    /* renamed from: a */
    private final bmxv f104692a;

    /* renamed from: b */
    private final bmxv f104693b;

    /* renamed from: c */
    private final bmxv f104694c;

    /* renamed from: d */
    private final bmxv f104695d;

    /* renamed from: e */
    private final long f104696e;

    /* renamed from: f */
    private final bcom f104697f;

    /* renamed from: g */
    private final bcom f104698g;

    public bcrf(bmxv bmxv, bmxv bmxv2, bmxv bmxv3, bmxv bmxv4, long j, bcom bcom, bcom bcom2) {
        this.f104692a = bmxv;
        this.f104693b = bmxv2;
        this.f104694c = bmxv3;
        this.f104695d = bmxv4;
        this.f104696e = j;
        this.f104697f = bcom;
        this.f104698g = bcom2;
    }

    /* renamed from: a */
    public final bmxv mo57115a() {
        return this.f104692a;
    }

    /* renamed from: b */
    public final bmxv mo57116b() {
        return this.f104693b;
    }

    /* renamed from: c */
    public final bmxv mo57117c() {
        return this.f104694c;
    }

    /* renamed from: d */
    public final bmxv mo57118d() {
        return this.f104695d;
    }

    /* renamed from: e */
    public final long mo57119e() {
        return this.f104696e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcov) {
            bcov bcov = (bcov) obj;
            return this.f104692a.equals(bcov.mo57115a()) && this.f104693b.equals(bcov.mo57116b()) && this.f104694c.equals(bcov.mo57117c()) && this.f104695d.equals(bcov.mo57118d()) && this.f104696e == bcov.mo57119e() && this.f104697f.equals(bcov.mo57121g()) && this.f104698g.equals(bcov.mo57123i());
        }
    }

    /* renamed from: g */
    public final bcom mo57121g() {
        return this.f104697f;
    }

    public final int hashCode() {
        int hashCode = this.f104692a.hashCode();
        int hashCode2 = this.f104693b.hashCode();
        int hashCode3 = this.f104694c.hashCode();
        int hashCode4 = this.f104695d.hashCode();
        long j = this.f104696e;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.f104697f.hashCode()) * 1000003) ^ this.f104698g.hashCode();
    }

    /* renamed from: i */
    public final bcom mo57123i() {
        return this.f104698g;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104692a);
        String valueOf2 = String.valueOf(this.f104693b);
        String valueOf3 = String.valueOf(this.f104694c);
        String valueOf4 = String.valueOf(this.f104695d);
        long j = this.f104696e;
        String valueOf5 = String.valueOf(this.f104697f);
        String valueOf6 = String.valueOf(this.f104698g);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 173 + length2 + length3 + length4 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("Action{traceId=");
        sb.append(valueOf);
        sb.append(", messageId=");
        sb.append(valueOf2);
        sb.append(", eventCallbackPayload=");
        sb.append(valueOf3);
        sb.append(", eventCallbackDestination=");
        sb.append(valueOf4);
        sb.append(", actionTriggeredLogId=");
        sb.append(j);
        sb.append(", actionPayload=");
        sb.append(valueOf5);
        sb.append(", eventCallbackFailureActionPayload=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}
