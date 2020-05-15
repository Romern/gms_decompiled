package p000;

/* renamed from: thk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class thk extends thq {

    /* renamed from: a */
    private final bmxv f46024a;

    /* renamed from: b */
    private final bmxv f46025b;

    /* renamed from: c */
    private final bmxv f46026c;

    public thk(bmxv bmxv, bmxv bmxv2, bmxv bmxv3) {
        this.f46024a = bmxv;
        this.f46025b = bmxv2;
        this.f46026c = bmxv3;
    }

    /* renamed from: a */
    public final bmxv mo26523a() {
        return this.f46024a;
    }

    /* renamed from: b */
    public final bmxv mo26524b() {
        return this.f46025b;
    }

    /* renamed from: c */
    public final bmxv mo26525c() {
        return this.f46026c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof thq) {
            thq thq = (thq) obj;
            return this.f46024a.equals(thq.mo26523a()) && this.f46025b.equals(thq.mo26524b()) && this.f46026c.equals(thq.mo26525c());
        }
    }

    public final int hashCode() {
        return ((((this.f46024a.hashCode() ^ 1000003) * 1000003) ^ this.f46025b.hashCode()) * 1000003) ^ this.f46026c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f46024a);
        String valueOf2 = String.valueOf(this.f46025b);
        String valueOf3 = String.valueOf(this.f46026c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 49 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ContactInfoCardData{emails=");
        sb.append(valueOf);
        sb.append(", phones=");
        sb.append(valueOf2);
        sb.append(", addresses=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
