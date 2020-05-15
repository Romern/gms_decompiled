package p000;

/* renamed from: avly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avly {

    /* renamed from: a */
    public final String f93350a;

    /* renamed from: b */
    public final long f93351b;

    /* renamed from: c */
    public final long f93352c;

    public avly(String str, long j, long j2) {
        this.f93350a = str;
        this.f93351b = j;
        this.f93352c = j2;
    }

    public final String toString() {
        String str = this.f93350a;
        long j = this.f93351b;
        long j2 = this.f93352c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42);
        sb.append(str);
        sb.append(":");
        sb.append(j);
        sb.append(":");
        sb.append(j2);
        return sb.toString();
    }
}
