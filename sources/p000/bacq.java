package p000;

/* renamed from: bacq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bacq extends bacu {

    /* renamed from: a */
    private final int f100484a;

    /* renamed from: b */
    private final bacx f100485b;

    /* renamed from: c */
    private final bacx f100486c;

    /* renamed from: d */
    private final bacx f100487d;

    /* renamed from: e */
    private final bacx f100488e;

    /* renamed from: f */
    private final Integer f100489f;

    /* renamed from: g */
    private final boolean f100490g;

    /* renamed from: h */
    private final boolean f100491h;

    public bacq(int i, bacx bacx, bacx bacx2, bacx bacx3, bacx bacx4, Integer num, boolean z, boolean z2) {
        this.f100484a = i;
        this.f100485b = bacx;
        this.f100486c = bacx2;
        this.f100487d = bacx3;
        this.f100488e = bacx4;
        this.f100489f = num;
        this.f100490g = z;
        this.f100491h = z2;
    }

    /* renamed from: a */
    public final int mo55570a() {
        return this.f100484a;
    }

    /* renamed from: b */
    public final bacx mo55571b() {
        return this.f100485b;
    }

    /* renamed from: c */
    public final bacx mo55572c() {
        return this.f100486c;
    }

    /* renamed from: d */
    public final bacx mo55573d() {
        return this.f100487d;
    }

    /* renamed from: e */
    public final bacx mo55574e() {
        return this.f100488e;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bacu) {
            bacu bacu = (bacu) obj;
            return this.f100484a == bacu.mo55570a() && this.f100485b.equals(bacu.mo55571b()) && this.f100486c.equals(bacu.mo55572c()) && this.f100487d.equals(bacu.mo55573d()) && this.f100488e.equals(bacu.mo55574e()) && ((num = this.f100489f) == null ? bacu.mo55576f() == null : num.equals(bacu.mo55576f())) && this.f100490g == bacu.mo55577g() && this.f100491h == bacu.mo55578h();
        }
    }

    /* renamed from: f */
    public final Integer mo55576f() {
        return this.f100489f;
    }

    /* renamed from: g */
    public final boolean mo55577g() {
        return this.f100490g;
    }

    /* renamed from: h */
    public final boolean mo55578h() {
        return this.f100491h;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.f100484a ^ 1000003) * 1000003) ^ this.f100485b.hashCode()) * 1000003) ^ this.f100486c.hashCode()) * 1000003) ^ this.f100487d.hashCode()) * 1000003) ^ this.f100488e.hashCode()) * 1000003;
        Integer num = this.f100489f;
        int i = 1237;
        int hashCode2 = (((hashCode ^ (num != null ? num.hashCode() : 0)) * 1000003) ^ (!this.f100490g ? 1237 : 1231)) * 1000003;
        if (this.f100491h) {
            i = 1231;
        }
        return hashCode2 ^ i;
    }

    public final String toString() {
        int i = this.f100484a;
        String valueOf = String.valueOf(this.f100485b);
        String valueOf2 = String.valueOf(this.f100486c);
        String valueOf3 = String.valueOf(this.f100487d);
        String valueOf4 = String.valueOf(this.f100488e);
        String valueOf5 = String.valueOf(this.f100489f);
        boolean z = this.f100490g;
        boolean z2 = this.f100491h;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 188 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("CoreSyncPolicy{syncType=");
        sb.append(i);
        sb.append(", upSyncPolicy=");
        sb.append(valueOf);
        sb.append(", upSyncWithListenerPolicy=");
        sb.append(valueOf2);
        sb.append(", downSyncPolicy=");
        sb.append(valueOf3);
        sb.append(", downSyncWithListenerPolicy=");
        sb.append(valueOf4);
        sb.append(", pushPolicyId=");
        sb.append(valueOf5);
        sb.append(", requiresCharging=");
        sb.append(z);
        sb.append(", requiresUnmetered=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
