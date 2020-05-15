package p000;

import com.google.android.gms.fitness.sensors.derived.SoftStepCounter;

/* renamed from: yzk */
final /* synthetic */ class yzk implements yzl {

    /* renamed from: a */
    private final yzp f54848a;

    public yzk(yzp yzp) {
        this.f54848a = yzp;
    }

    /* renamed from: a */
    public final Object mo30865a(String str) {
        yzp yzp = this.f54848a;
        yzp.m45080m("Can't init sensors in main thread");
        zgm a = zgl.m45389a();
        aesh aesh = new aesh(yzp.f54857c);
        zgf c = yzp.mo30876c();
        bngs j = bngx.m109377j();
        j.mo67668c(new zgk(zgj.m45375a(yzp.f54857c, a), str));
        j.mo67668c(new zjx(yzp.f54857c, yzp.f54858d.getLooper(), aesh, yzp.mo30887i()));
        if (yzp.mo30876c().mo19161b(bzzn.f172101an).isEmpty()) {
            j.mo67668c(new SoftStepCounter(yzp.f54857c, yzp.f54858d, zgl.m45389a()));
        }
        zkf zkf = new zkf(new zie(j.mo67664a()), "Local SW");
        bngs j2 = bngx.m109377j();
        zgf[] zgfArr = new zgf[4];
        zgfArr[0] = c;
        zgfArr[1] = zkf;
        if (c.mo19161b(bzzn.f172101an).isEmpty()) {
            c = zkf;
        }
        zix zix = new zix(c, bngx.m109356a(new ziu(yzp.f54857c)), true);
        bngs j3 = bngx.m109377j();
        j3.mo67668c(zix);
        j3.mo67668c(new zix(zkf, bngx.m109356a(new ziy(yzp.f54857c)), true));
        yzp.m45079d();
        j3.mo67668c(new zix(zix, bngx.m109356a(new ziz(yzp.f54857c, yhq.m44141j())), true));
        zgfArr[2] = new zkf(new zie(j3.mo67664a()), "Derived");
        zgfArr[3] = (zgf) yzp.f54860f.mo30867a();
        j2.mo67667b((Object[]) zgfArr);
        bmxv g = yzp.mo30883g(str);
        if (g.mo66813a()) {
            j2.mo67668c(new zkf((zgf) g.mo66814b(), "BLE"));
        }
        return new zie(j2.mo67664a());
    }
}
