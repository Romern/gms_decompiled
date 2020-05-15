package p000;

/* renamed from: bdfh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdfh extends bdic {

    /* renamed from: a */
    public final int f105453a;

    /* renamed from: b */
    private final bqgk f105454b;

    /* renamed from: c */
    private final int f105455c;

    /* renamed from: d */
    private final int f105456d;

    /* renamed from: e */
    private final boolean f105457e;

    /* renamed from: f */
    private final bdhz f105458f;

    public bdfh(bqgk bqgk, int i, int i2, int i3, bdhz bdhz, boolean z) {
        this.f105454b = bqgk;
        this.f105455c = i;
        this.f105456d = i2;
        this.f105453a = i3;
        this.f105458f = bdhz;
        this.f105457e = z;
    }

    /* renamed from: a */
    public final bqgk mo57982a() {
        return this.f105454b;
    }

    /* renamed from: b */
    public final bqgk mo57983b() {
        return null;
    }

    /* renamed from: c */
    public final int mo57984c() {
        return this.f105455c;
    }

    /* renamed from: d */
    public final int mo57985d() {
        return this.f105456d;
    }

    /* renamed from: e */
    public final int mo57986e() {
        return this.f105453a;
    }

    public final boolean equals(Object obj) {
        bdhz bdhz;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bdic)) {
            return false;
        }
        bdic bdic = (bdic) obj;
        bqgk bqgk = this.f105454b;
        if (bqgk == null ? bdic.mo57982a() == null : bqgk.equals(bdic.mo57982a())) {
            return bdic.mo57983b() == null && this.f105455c == bdic.mo57984c() && this.f105456d == bdic.mo57985d() && this.f105453a == bdic.mo57986e() && ((bdhz = this.f105458f) == null ? bdic.mo57990h() == null : bdhz.equals(bdic.mo57990h())) && bdic.mo57988f() == null && this.f105457e == bdic.mo57989g();
        }
    }

    /* renamed from: f */
    public final bdia mo57988f() {
        return null;
    }

    /* renamed from: g */
    public final boolean mo57989g() {
        return this.f105457e;
    }

    /* renamed from: h */
    public final bdhz mo57990h() {
        return this.f105458f;
    }

    public final int hashCode() {
        int i;
        bqgk bqgk = this.f105454b;
        int i2 = 0;
        if (bqgk != null) {
            i = bqgk.hashCode();
        } else {
            i = 0;
        }
        int i3 = (((((((i ^ 1000003) * -721379959) ^ this.f105455c) * 1000003) ^ this.f105456d) * 1000003) ^ this.f105453a) * 1000003;
        bdhz bdhz = this.f105458f;
        if (bdhz != null) {
            i2 = bdhz.hashCode();
        }
        return ((i3 ^ i2) * -721379959) ^ (!this.f105457e ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f105454b);
        String valueOf2 = String.valueOf((Object) null);
        int i = this.f105455c;
        int i2 = this.f105456d;
        int i3 = this.f105453a;
        String valueOf3 = String.valueOf(this.f105458f);
        String valueOf4 = String.valueOf((Object) null);
        boolean z = this.f105457e;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 269 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("PrimesThreadsConfigurations{primesExecutorService=");
        sb.append(valueOf);
        sb.append(", initExecutorService=");
        sb.append(valueOf2);
        sb.append(", primesInitializationPriority=");
        sb.append(i);
        sb.append(", primesMetricExecutorPriority=");
        sb.append(i2);
        sb.append(", primesMetricExecutorPoolSize=");
        sb.append(i3);
        sb.append(", initAfterResumed=");
        sb.append(valueOf3);
        sb.append(", activityResumedCallback=");
        sb.append(valueOf4);
        sb.append(", enableEarlyTimers=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
