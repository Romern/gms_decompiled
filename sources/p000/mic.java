package p000;

/* renamed from: mic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mic extends mih {

    /* renamed from: a */
    private final String f33766a;

    /* renamed from: b */
    private final mij f33767b;

    /* renamed from: c */
    private final bngx f33768c;

    public mic(String str, mij mij, bngx bngx) {
        this.f33766a = str;
        if (mij != null) {
            this.f33767b = mij;
            if (bngx != null) {
                this.f33768c = bngx;
                return;
            }
            throw new NullPointerException("Null apkSplits");
        }
        throw new NullPointerException("Null baseApk");
    }

    /* renamed from: a */
    public final String mo20048a() {
        return this.f33766a;
    }

    /* renamed from: b */
    public final mij mo20049b() {
        return this.f33767b;
    }

    /* renamed from: c */
    public final bngx mo20050c() {
        return this.f33768c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mih) {
            mih mih = (mih) obj;
            return this.f33766a.equals(mih.mo20048a()) && this.f33767b.equals(mih.mo20049b()) && bnkn.m109669a(this.f33768c, mih.mo20050c());
        }
    }

    public final int hashCode() {
        return ((((this.f33766a.hashCode() ^ 1000003) * 1000003) ^ this.f33767b.hashCode()) * 1000003) ^ this.f33768c.hashCode();
    }

    public final String toString() {
        String str = this.f33766a;
        String valueOf = String.valueOf(this.f33767b);
        String valueOf2 = String.valueOf(this.f33768c);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 39 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("Apk{packageName=");
        sb.append(str);
        sb.append(", baseApk=");
        sb.append(valueOf);
        sb.append(", apkSplits=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
