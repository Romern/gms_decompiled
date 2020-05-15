package p000;

/* renamed from: svc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class svc implements sue {

    /* renamed from: d */
    public int f45209d = Integer.MAX_VALUE;

    /* renamed from: e */
    public int f45210e;

    /* renamed from: f */
    public CharSequence f45211f;

    /* renamed from: a */
    public abstract int mo23821a();

    /* renamed from: a */
    public int compareTo(sue sue) {
        return sud.m36341a(this, sue);
    }

    /* renamed from: a */
    public void mo26084a(int i) {
        throw null;
    }

    /* renamed from: a */
    public void mo26085a(CharSequence charSequence) {
        throw null;
    }

    /* renamed from: b */
    public abstract svb mo23822b();

    /* renamed from: b */
    public void mo26086b(int i) {
        throw null;
    }

    /* renamed from: c */
    public int mo26087c() {
        return this.f45210e;
    }

    /* renamed from: d */
    public CharSequence mo26088d() {
        return this.f45211f;
    }

    /* renamed from: e */
    public int mo26089e() {
        return this.f45209d;
    }

    /* renamed from: f */
    public boolean mo26146f() {
        return true;
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        int hashCode = hashCode();
        int e = mo26089e();
        String valueOf = String.valueOf(mo26088d());
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 25 + String.valueOf(valueOf).length());
        sb.append(simpleName);
        sb.append("@");
        sb.append(hashCode);
        sb.append(":");
        sb.append(e);
        sb.append(":");
        sb.append(valueOf);
        return sb.toString();
    }
}
