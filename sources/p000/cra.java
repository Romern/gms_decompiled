package p000;

/* renamed from: cra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cra {

    /* renamed from: a */
    private Class f11874a;

    /* renamed from: b */
    private Class f11875b;

    /* renamed from: c */
    private Class f11876c;

    public cra() {
    }

    /* renamed from: a */
    public final void mo8183a(Class cls, Class cls2, Class cls3) {
        this.f11874a = cls;
        this.f11875b = cls2;
        this.f11876c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cra cra = (cra) obj;
            return this.f11874a.equals(cra.f11874a) && this.f11875b.equals(cra.f11875b) && crd.m7395a(this.f11876c, cra.f11876c);
        }
    }

    public final int hashCode() {
        int hashCode = ((this.f11874a.hashCode() * 31) + this.f11875b.hashCode()) * 31;
        Class cls = this.f11876c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11874a);
        String valueOf2 = String.valueOf(this.f11875b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30 + String.valueOf(valueOf2).length());
        sb.append("MultiClassKey{first=");
        sb.append(valueOf);
        sb.append(", second=");
        sb.append(valueOf2);
        sb.append('}');
        return sb.toString();
    }

    public cra(Class cls, Class cls2, Class cls3) {
        mo8183a(cls, cls2, cls3);
    }
}
