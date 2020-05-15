package p000;

import java.util.Iterator;

/* renamed from: akey */
final /* synthetic */ class akey implements Runnable {

    /* renamed from: a */
    private final akgy f71767a;

    /* renamed from: b */
    private final akdd f71768b;

    public akey(akgy akgy, akdd akdd) {
        this.f71767a = akgy;
        this.f71768b = akdd;
    }

    public final void run() {
        ajnw ajnw;
        akgy akgy = this.f71767a;
        akdd akdd = this.f71768b;
        while (!akdd.mo39255c()) {
            Iterator it = akgy.f71945l.keySet().iterator();
            if (it.hasNext()) {
                ajnw = (ajnw) akgy.f71945l.remove(it.next());
            } else {
                ajnw = null;
            }
            if (ajnw == null) {
                ajnw = akgy.m59543a(akdd);
            }
            if (ajnw != null) {
                ajnv ajnv = ajnv.UNKNOWN_FRAME_TYPE;
                ajnz ajnz = ajnz.UNKNOWN_SECURITY_TYPE;
                akgr akgr = akgr.SUCCESS;
                ajnv a = ajnv.m58896a(ajnw.f71025b);
                if (a == null) {
                    a = ajnv.UNKNOWN_FRAME_TYPE;
                }
                if (a.ordinal() != 5) {
                    bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
                    bnsl.mo68432a("akgy", "c", 4266, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    ajnv a2 = ajnv.m58896a(ajnw.f71025b);
                    if (a2 == null) {
                        a2 = ajnv.UNKNOWN_FRAME_TYPE;
                    }
                    bnsl.mo68420a("Discarding unknown frame of type %s", a2);
                } else {
                    akgy.mo39385a(new akez(akgy, ajnw));
                }
            }
        }
    }
}
