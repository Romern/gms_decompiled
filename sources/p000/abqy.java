package p000;

/* renamed from: abqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abqy extends acpn {

    /* renamed from: a */
    final /* synthetic */ abrv f58023a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abqy(abrv abrv, bqbd bqbd) {
        super(bqbd);
        this.f58023a = abrv;
    }

    /* renamed from: b */
    public final void mo32291b() {
        String str;
        abrv abrv = this.f58023a;
        if (acaw.m48785b() != abrv.f58071g.f60620b.getBoolean("enabled-appdatasearch-corpora-with-whitelist", false)) {
            if (!acaw.m48785b()) {
                str = "disabled";
            } else {
                str = "enabled";
            }
            absg.m48185a("Need to reparse resources because appdataseach corpora with whitelist was %s.", str);
            new abzq(abrv.f58077m, abrv.f58064C, abrv.f58071g.mo33034h()).mo32550a(true);
            acrl acrl = abrv.f58071g;
            acrl.f60620b.edit().putBoolean("enabled-appdatasearch-corpora-with-whitelist", acaw.m48785b()).commit();
        }
        abrv.f58077m.mo32507d();
        if (cemq.m137366c() && ((Boolean) abzt.f58881aV.mo58455c()).booleanValue()) {
            acpg.f60408a.mo32983a(abrv.f58066b, 3, 0);
        }
    }
}
