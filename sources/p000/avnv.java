package p000;

/* renamed from: avnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class avnv {

    /* renamed from: a */
    protected final avtd f93564a = avte.m79303a();

    /* renamed from: b */
    private final String f93565b;

    protected avnv(String str) {
        this.f93565b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo51445a() {
        sdo.m34975b(this.f93564a.mo51596a(avnw.f93566e), "The name of the next action needs to be set.");
        sdo.m34975b(this.f93564a.mo51596a(avnw.f93567f), "The params of the next action needs to be set.");
    }

    /* renamed from: b */
    public final avni mo51447b() {
        String str = this.f93565b;
        mo51445a();
        return new avni(str, this.f93564a.mo51593a());
    }

    /* renamed from: a */
    public void mo51446a(String str, avte avte) {
        this.f93564a.mo51594a(avnw.f93566e, str);
        this.f93564a.mo51594a(avnw.f93567f, avte);
    }
}
