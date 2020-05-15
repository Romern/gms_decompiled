package p000;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;

/* renamed from: lek */
final /* synthetic */ class lek implements bqeh {

    /* renamed from: a */
    private final les f25885a;

    /* renamed from: b */
    private final kck f25886b;

    /* renamed from: c */
    private final bqgj f25887c;

    /* renamed from: d */
    private final leh f25888d;

    /* renamed from: e */
    private final kca f25889e;

    public lek(les les, kck kck, bqgj bqgj, leh leh, kca kca) {
        this.f25885a = les;
        this.f25886b = kck;
        this.f25887c = bqgj;
        this.f25888d = leh;
        this.f25889e = kca;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        kca kca;
        kck kck;
        kjp kjp;
        char c;
        bqgg bqgg;
        kjs kjs;
        leh leh;
        FillForm fillForm;
        bqgg bqgg2;
        bqgj bqgj;
        bnic bnic;
        les les = this.f25885a;
        kck kck2 = this.f25886b;
        bqgj bqgj2 = this.f25887c;
        leh leh2 = this.f25888d;
        kca kca2 = this.f25889e;
        kjs kjs2 = (kjs) obj;
        kjp a = kph.m18285a(kjs2.f24276a);
        kdl kdl = null;
        if (les.f25909d.mo15089i()) {
            kwe.m18646a((Context) null).mo14887a(kjs2.f24280e);
        }
        if (a == null) {
            fillForm = new FillForm(bngx.m109376e(), kck2);
            bqgg = bqga.m112775a(new kek(bnon.f131923a));
            int i = Build.VERSION.SDK_INT;
            bqgg2 = les.mo15044a(kck2, fillForm, leh2.f25873c, bqgg, kqh.m18326a(kjs2.f24278c, leh2.f25874d));
            kjp = a;
            kca = kca2;
            leh = leh2;
            bqgj = bqgj2;
            kck = kck2;
            c = 0;
            kjs = kjs2;
        } else {
            FillForm a2 = kqj.m18328a(a, bmxv.m108566b(kck2), leh2.f25874d);
            if (les.f25909d.mo15089i()) {
                kwe.m18646a((Context) null).mo14888a(a);
            }
            bnia j = bnic.m109500j();
            bnre i2 = a2.f11641a.listIterator();
            while (i2.hasNext()) {
                j.mo67752b((Iterable) ((FillField) i2.next()).f11634d);
            }
            bnic a3 = j.mo67751a();
            bnia j2 = bnic.m109500j();
            bnrd a4 = les.f25907b.iterator();
            while (a4.hasNext()) {
                kdn kdn = (kdn) a4.next();
                if (kdn.mo14412a(a3)) {
                    j2.mo67629b(kdn.mo14410a());
                }
            }
            bnic a5 = j2.mo67751a();
            if (a5.isEmpty()) {
                return bqga.m112775a(lei.f25877b);
            }
            bmxv a6 = les.m18992a(a2, kck2);
            if (a6.mo66813a()) {
                bnic = bnic.m109489a((kcv) a6.mo66814b());
            } else {
                bnic = bnon.f131923a;
            }
            kcv kcv = a2.f11643c;
            if (kcv instanceof kdl) {
                kdl = (kdl) kcv;
            }
            c = 0;
            kjp = a;
            kck = kck2;
            kjs = kjs2;
            kca = kca2;
            bqgj = bqgj2;
            bqgg a7 = les.f25908c.mo14429a(new kej(new kel(bqgj2, kck2, bmxv.m108567c(kdl), bnic, new byte[0], les.f25915j), a5));
            leh = leh2;
            bqgg2 = les.mo15044a(kck, a2, leh2.f25873c, a7, kqh.m18326a(kjs.f24278c, leh2.f25874d));
            bqgg = a7;
            fillForm = a2;
        }
        bqgg[] bqggArr = new bqgg[2];
        bqggArr[c] = bqgg;
        bqggArr[1] = bqgg2;
        return bqga.m112783b(bqggArr).mo69214a(new ler(les, bqgg2, bqgj, leh, kjs, kjp, fillForm, bqgg, kck, kca), bqgj);
    }
}
