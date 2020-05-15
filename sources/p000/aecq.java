package p000;

/* renamed from: aecq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aecq extends aeeg {

    /* renamed from: a */
    public final String f63168a;

    /* renamed from: b */
    public final String f63169b;

    /* renamed from: c */
    private final String f63170c;

    /* renamed from: d */
    private final bmzi f63171d;

    public aecq(String str, String str2, String str3, bmzi bmzi) {
        this.f63170c = str;
        if (str2 != null) {
            this.f63168a = str2;
            if (str3 != null) {
                this.f63169b = str3;
                this.f63171d = bmzi;
                return;
            }
            throw new NullPointerException("Null oneoffTaskTag");
        }
        throw new NullPointerException("Null periodicTaskTag");
    }

    /* renamed from: a */
    public final String mo34053a() {
        return this.f63170c;
    }

    /* renamed from: b */
    public final String mo34054b() {
        return this.f63168a;
    }

    /* renamed from: c */
    public final String mo34055c() {
        return this.f63169b;
    }

    /* renamed from: d */
    public final bmzi mo34056d() {
        return this.f63171d;
    }

    public final boolean equals(Object obj) {
        bmzi bmzi;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeeg) {
            aeeg aeeg = (aeeg) obj;
            return this.f63170c.equals(aeeg.mo34053a()) && this.f63168a.equals(aeeg.mo34054b()) && this.f63169b.equals(aeeg.mo34055c()) && ((bmzi = this.f63171d) == null ? aeeg.mo34056d() == null : bmzi.equals(aeeg.mo34056d()));
        }
    }

    public final int hashCode() {
        int hashCode = (((((this.f63170c.hashCode() ^ 1000003) * 1000003) ^ this.f63168a.hashCode()) * 1000003) ^ this.f63169b.hashCode()) * 1000003;
        bmzi bmzi = this.f63171d;
        return hashCode ^ (bmzi != null ? bmzi.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f63170c;
        String str2 = this.f63168a;
        String str3 = this.f63169b;
        String valueOf = String.valueOf(this.f63171d);
        int length = str.length();
        int length2 = str2.length();
        StringBuilder sb = new StringBuilder(length + 75 + length2 + str3.length() + String.valueOf(valueOf).length());
        sb.append("TaskConfig{serviceName=");
        sb.append(str);
        sb.append(", periodicTaskTag=");
        sb.append(str2);
        sb.append(", oneoffTaskTag=");
        sb.append(str3);
        sb.append(", policySupplier=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
