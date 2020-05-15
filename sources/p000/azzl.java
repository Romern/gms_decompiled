package p000;

/* renamed from: azzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azzl extends azzs {

    /* renamed from: a */
    public final int f100323a;

    /* renamed from: b */
    public final azzv f100324b;

    /* renamed from: c */
    public final azzv f100325c;

    /* renamed from: d */
    public final azzv f100326d;

    /* renamed from: e */
    public final azzv f100327e;

    /* renamed from: f */
    public final Integer f100328f;

    /* renamed from: g */
    public final boolean f100329g;

    /* renamed from: h */
    public final boolean f100330h;

    public azzl(int i, azzv azzv, azzv azzv2, azzv azzv3, azzv azzv4, Integer num, boolean z, boolean z2) {
        this.f100323a = i;
        if (azzv != null) {
            this.f100324b = azzv;
            if (azzv2 != null) {
                this.f100325c = azzv2;
                if (azzv3 != null) {
                    this.f100326d = azzv3;
                    if (azzv4 != null) {
                        this.f100327e = azzv4;
                        this.f100328f = num;
                        this.f100329g = z;
                        this.f100330h = z2;
                        return;
                    }
                    throw new NullPointerException("Null downSyncWithListenerPolicy");
                }
                throw new NullPointerException("Null downSyncPolicy");
            }
            throw new NullPointerException("Null upSyncWithListenerPolicy");
        }
        throw new NullPointerException("Null upSyncPolicy");
    }

    /* renamed from: a */
    public final int mo55496a() {
        return this.f100323a;
    }

    /* renamed from: b */
    public final azzv mo55497b() {
        return this.f100324b;
    }

    /* renamed from: c */
    public final azzv mo55498c() {
        return this.f100325c;
    }

    /* renamed from: d */
    public final azzv mo55499d() {
        return this.f100326d;
    }

    /* renamed from: e */
    public final azzv mo55500e() {
        return this.f100327e;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof azzs) {
            azzs azzs = (azzs) obj;
            return this.f100323a == azzs.mo55496a() && this.f100324b.equals(azzs.mo55497b()) && this.f100325c.equals(azzs.mo55498c()) && this.f100326d.equals(azzs.mo55499d()) && this.f100327e.equals(azzs.mo55500e()) && ((num = this.f100328f) == null ? azzs.mo55502f() == null : num.equals(azzs.mo55502f())) && this.f100329g == azzs.mo55503g() && this.f100330h == azzs.mo55504h();
        }
    }

    /* renamed from: f */
    public final Integer mo55502f() {
        return this.f100328f;
    }

    /* renamed from: g */
    public final boolean mo55503g() {
        return this.f100329g;
    }

    /* renamed from: h */
    public final boolean mo55504h() {
        return this.f100330h;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.f100323a ^ 1000003) * 1000003) ^ this.f100324b.hashCode()) * 1000003) ^ this.f100325c.hashCode()) * 1000003) ^ this.f100326d.hashCode()) * 1000003) ^ this.f100327e.hashCode()) * 1000003;
        Integer num = this.f100328f;
        int i = 1237;
        int hashCode2 = (((hashCode ^ (num != null ? num.hashCode() : 0)) * 1000003) ^ (!this.f100329g ? 1237 : 1231)) * 1000003;
        if (this.f100330h) {
            i = 1231;
        }
        return hashCode2 ^ i;
    }

    public final String toString() {
        int i = this.f100323a;
        String valueOf = String.valueOf(this.f100324b);
        String valueOf2 = String.valueOf(this.f100325c);
        String valueOf3 = String.valueOf(this.f100326d);
        String valueOf4 = String.valueOf(this.f100327e);
        String valueOf5 = String.valueOf(this.f100328f);
        boolean z = this.f100329g;
        boolean z2 = this.f100330h;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 183 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("SyncPolicy{syncType=");
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
        sb.append(", requiresPlugged=");
        sb.append(z);
        sb.append(", requiresUnmetered=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
