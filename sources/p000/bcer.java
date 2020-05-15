package p000;

/* renamed from: bcer */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcer extends bcfw {

    /* renamed from: a */
    public final ByteString f104054a;

    /* renamed from: b */
    public final int f104055b;

    /* renamed from: c */
    public final bmxv f104056c;

    /* renamed from: d */
    public final bmxv f104057d;

    /* renamed from: e */
    public final bmxv f104058e;

    /* renamed from: f */
    public final bmxv f104059f;

    public bcer(ByteString bxtx, int i, bmxv bmxv, bmxv bmxv2, bmxv bmxv3, bmxv bmxv4) {
        this.f104054a = bxtx;
        this.f104055b = i;
        this.f104056c = bmxv;
        this.f104057d = bmxv2;
        this.f104058e = bmxv3;
        this.f104059f = bmxv4;
    }

    /* renamed from: a */
    public final ByteString mo56743a() {
        return this.f104054a;
    }

    /* renamed from: b */
    public final int mo56744b() {
        return this.f104055b;
    }

    /* renamed from: c */
    public final bmxv mo56745c() {
        return this.f104056c;
    }

    /* renamed from: d */
    public final bmxv mo56746d() {
        return this.f104057d;
    }

    /* renamed from: e */
    public final bmxv mo56747e() {
        return this.f104058e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcfw) {
            bcfw bcfw = (bcfw) obj;
            return this.f104054a.equals(bcfw.mo56743a()) && this.f104055b == bcfw.mo56744b() && this.f104056c.equals(bcfw.mo56745c()) && this.f104057d.equals(bcfw.mo56746d()) && this.f104058e.equals(bcfw.mo56747e()) && this.f104059f.equals(bcfw.mo56749f());
        }
    }

    /* renamed from: f */
    public final bmxv mo56749f() {
        return this.f104059f;
    }

    public final int hashCode() {
        return ((((((((((this.f104054a.hashCode() ^ 1000003) * 1000003) ^ this.f104055b) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.f104059f.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104054a);
        int i = this.f104055b;
        String valueOf2 = String.valueOf(this.f104056c);
        String valueOf3 = String.valueOf(this.f104057d);
        String valueOf4 = String.valueOf(this.f104058e);
        String valueOf5 = String.valueOf(this.f104059f);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 110 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("ClearcutEvent{event=");
        sb.append(valueOf);
        sb.append(", eventCode=");
        sb.append(i);
        sb.append(", eventFlowId=");
        sb.append(valueOf2);
        sb.append(", experimentIds=");
        sb.append(valueOf3);
        sb.append(", logSourceName=");
        sb.append(valueOf4);
        sb.append(", uploadAccountName=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
