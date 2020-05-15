package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: bcsf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcsf extends bcux {

    /* renamed from: a */
    private final bmxv f104785a;

    /* renamed from: b */
    private final bmxv f104786b;

    /* renamed from: c */
    private final bmxv f104787c;

    /* renamed from: d */
    private final bmxv f104788d;

    /* renamed from: e */
    private final bmxv f104789e;

    /* renamed from: f */
    private final bmxv f104790f;

    /* renamed from: g */
    private final bmxv f104791g;

    public bcsf(bmxv bmxv, bmxv bmxv2, bmxv bmxv3, bmxv bmxv4, bmxv bmxv5, bmxv bmxv6, bmxv bmxv7) {
        this.f104785a = bmxv;
        this.f104786b = bmxv2;
        this.f104787c = bmxv3;
        this.f104788d = bmxv4;
        this.f104789e = bmxv5;
        this.f104790f = bmxv6;
        this.f104791g = bmxv7;
    }

    /* renamed from: a */
    public final bmxv mo57424a() {
        return this.f104785a;
    }

    /* renamed from: b */
    public final bmxv mo57425b() {
        return this.f104786b;
    }

    /* renamed from: c */
    public final bmxv mo57426c() {
        return this.f104787c;
    }

    /* renamed from: d */
    public final bmxv mo57427d() {
        return this.f104788d;
    }

    /* renamed from: e */
    public final bmxv mo57428e() {
        return this.f104789e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcux) {
            bcux bcux = (bcux) obj;
            return this.f104785a.equals(bcux.mo57424a()) && this.f104786b.equals(bcux.mo57425b()) && this.f104787c.equals(bcux.mo57426c()) && this.f104788d.equals(bcux.mo57427d()) && this.f104789e.equals(bcux.mo57428e()) && this.f104790f.equals(bcux.mo57430f()) && this.f104791g.equals(bcux.mo57431g());
        }
    }

    /* renamed from: f */
    public final bmxv mo57430f() {
        return this.f104790f;
    }

    /* renamed from: g */
    public final bmxv mo57431g() {
        return this.f104791g;
    }

    public final int hashCode() {
        return ((((((((this.f104787c.hashCode() ^ 842269859) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.f104791g.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104785a);
        String valueOf2 = String.valueOf(this.f104786b);
        String valueOf3 = String.valueOf(this.f104787c);
        String valueOf4 = String.valueOf(this.f104788d);
        String valueOf5 = String.valueOf(this.f104789e);
        String valueOf6 = String.valueOf(this.f104790f);
        String valueOf7 = String.valueOf(this.f104791g);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        StringBuilder sb = new StringBuilder(length + AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER + length2 + length3 + length4 + length5 + length6 + String.valueOf(valueOf7).length());
        sb.append("VisualElementDetail{entryPointId=");
        sb.append(valueOf);
        sb.append(", entryPointEventId=");
        sb.append(valueOf2);
        sb.append(", correlationId=");
        sb.append(valueOf3);
        sb.append(", actionTriggeredLogId=");
        sb.append(valueOf4);
        sb.append(", elapsedTimeFromPriorEventMillis=");
        sb.append(valueOf5);
        sb.append(", visualElementId=");
        sb.append(valueOf6);
        sb.append(", lighterVisualElementMetadata=");
        sb.append(valueOf7);
        sb.append("}");
        return sb.toString();
    }
}
