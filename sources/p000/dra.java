package p000;

/* renamed from: dra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class dra {

    /* renamed from: a */
    private final String f13850a;

    /* renamed from: b */
    private doh f13851b;

    public dra(doh doh) {
        this.f13850a = doh.f13690b;
        this.f13851b = doh;
    }

    /* renamed from: a */
    public final doh mo9469a() {
        return mo9470g();
    }

    /* renamed from: g */
    public final doh mo9470g() {
        if (this.f13851b == null) {
            dwq.m9681y();
            this.f13851b = dof.m8924b(this.f13850a);
        }
        return this.f13851b;
    }

    public dra(String str) {
        sdo.m34977c(str);
        this.f13850a = str;
        this.f13851b = null;
    }
}
