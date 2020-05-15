package p000;

/* renamed from: omu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class omu extends onk {

    /* renamed from: a */
    private final ofb f37959a;

    /* renamed from: b */
    private final ofb f37960b;

    /* renamed from: c */
    private final bmzi f37961c;

    /* renamed from: d */
    private final bmzi f37962d;

    public omu(ofb ofb, ofb ofb2, bmzi bmzi, bmzi bmzi2) {
        if (ofb != null) {
            this.f37959a = ofb;
            if (ofb2 != null) {
                this.f37960b = ofb2;
                if (bmzi != null) {
                    this.f37961c = bmzi;
                    if (bmzi2 != null) {
                        this.f37962d = bmzi2;
                        return;
                    }
                    throw new NullPointerException("Null resetEnabledSupplier");
                }
                throw new NullPointerException("Null timeoutSupplier");
            }
            throw new NullPointerException("Null falsePositive");
        }
        throw new NullPointerException("Null issue");
    }

    /* renamed from: a */
    public final ofb mo22316a() {
        return this.f37959a;
    }

    /* renamed from: b */
    public final ofb mo22317b() {
        return this.f37960b;
    }

    /* renamed from: c */
    public final bmzi mo22318c() {
        return this.f37961c;
    }

    /* renamed from: d */
    public final bmzi mo22319d() {
        return this.f37962d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof onk) {
            onk onk = (onk) obj;
            return this.f37959a.equals(onk.mo22316a()) && this.f37960b.equals(onk.mo22317b()) && this.f37961c.equals(onk.mo22318c()) && this.f37962d.equals(onk.mo22319d());
        }
    }

    public final int hashCode() {
        return ((((((this.f37959a.hashCode() ^ 1000003) * 1000003) ^ this.f37960b.hashCode()) * 1000003) ^ this.f37961c.hashCode()) * 1000003) ^ this.f37962d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f37959a);
        String valueOf2 = String.valueOf(this.f37960b);
        String valueOf3 = String.valueOf(this.f37961c);
        String valueOf4 = String.valueOf(this.f37962d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 77 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("UsbIssueInfo{issue=");
        sb.append(valueOf);
        sb.append(", falsePositive=");
        sb.append(valueOf2);
        sb.append(", timeoutSupplier=");
        sb.append(valueOf3);
        sb.append(", resetEnabledSupplier=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
