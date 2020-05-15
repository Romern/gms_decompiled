package p000;

/* renamed from: tqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tqh extends tql {

    /* renamed from: a */
    private final Object f46497a;

    /* renamed from: b */
    private final Exception f46498b;

    /* renamed from: c */
    private final int f46499c;

    public tqh(int i, Object obj, Exception exc) {
        if (i != 0) {
            this.f46499c = i;
            this.f46497a = obj;
            this.f46498b = exc;
            return;
        }
        throw new NullPointerException("Null status");
    }

    /* renamed from: a */
    public final Object mo26735a() {
        return this.f46497a;
    }

    /* renamed from: b */
    public final Exception mo26736b() {
        return this.f46498b;
    }

    /* renamed from: c */
    public final int mo26737c() {
        return this.f46499c;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Exception exc;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tql)) {
            return false;
        }
        tql tql = (tql) obj;
        return this.f46499c == tql.mo26737c() && ((obj2 = this.f46497a) == null ? tql.mo26735a() == null : obj2.equals(tql.mo26735a())) && ((exc = this.f46498b) == null ? tql.mo26736b() == null : exc.equals(tql.mo26736b()));
    }

    public final int hashCode() {
        int i;
        int i2 = (this.f46499c ^ 1000003) * 1000003;
        Object obj = this.f46497a;
        int i3 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 ^ i) * 1000003;
        Exception exc = this.f46498b;
        if (exc != null) {
            i3 = exc.hashCode();
        }
        return i4 ^ i3;
    }

    public final String toString() {
        int i = this.f46499c;
        String str = i != 1 ? i != 2 ? "ERROR" : "LOADING" : "SUCCESS";
        String valueOf = String.valueOf(this.f46497a);
        String valueOf2 = String.valueOf(this.f46498b);
        StringBuilder sb = new StringBuilder(str.length() + 36 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("Resource{status=");
        sb.append(str);
        sb.append(", data=");
        sb.append(valueOf);
        sb.append(", exception=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
