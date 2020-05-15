package p000;

import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;

/* renamed from: oyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oyc {

    /* renamed from: a */
    public static final bnsn f38597a = odk.m28481a("CAR.SETUP.INSTALLER");

    /* renamed from: b */
    public final String f38598b;

    /* renamed from: c */
    public final oya f38599c;

    /* renamed from: d */
    public final PackageManager f38600d;

    /* renamed from: e */
    public final PackageInstaller f38601e;

    /* renamed from: f */
    final oyb f38602f;

    /* renamed from: g */
    public final C0034at f38603g;

    /* renamed from: h */
    private final C1504y f38604h = new oxz(this);

    public oyc(oya oya, PackageManager packageManager, String str, String str2) {
        this.f38598b = str;
        this.f38599c = oya;
        this.f38600d = packageManager;
        this.f38601e = packageManager.getPackageInstaller();
        this.f38602f = new oyb(this);
        this.f38603g = new C0034at(new oyd(2, str2));
        ((C0013ak) oya).getLifecycle().mo557a(this.f38604h);
    }

    /* renamed from: a */
    public final void mo22776a(int i) {
        oyd oyd = (oyd) this.f38603g.mo2448b();
        bmxy.m108581a(oyd);
        oyd.f38605a = i;
        this.f38603g.mo2453l(oyd);
    }

    /* renamed from: a */
    public final boolean mo22777a() {
        oyd oyd = (oyd) this.f38603g.mo2448b();
        bmxy.m108581a(oyd);
        int i = oyd.f38605a;
        if (!(i == 4 || i == 1 || i == 5)) {
            Intent a = oyi.m29995a(this.f38598b);
            if (a.resolveActivity(this.f38600d) != null) {
                bnsi d = f38597a.mo68390d();
                d.mo68432a("oyc", "a", 137, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68420a("AppInstaller requesting install of pkg=%s", this.f38598b);
                this.f38599c.mo22770a(a);
                return true;
            }
            bnsi c = f38597a.mo68388c();
            c.mo68432a("oyc", "a", 143, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68420a("AppInstaller failed install intent unresolved for pkg=%s", this.f38598b);
            mo22776a(5);
        }
        return false;
    }
}
