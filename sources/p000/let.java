package p000;

import android.content.Context;
import com.google.android.gms.autofill.data.Credential;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;
import com.google.android.gms.autofill.service.common.ClientState;
import com.google.android.gms.autofill.service.common.ImmutableDetectionHistory;

/* renamed from: let */
final /* synthetic */ class let implements bqeh {

    /* renamed from: a */
    private final lfd f25919a;

    /* renamed from: b */
    private final kck f25920b;

    /* renamed from: c */
    private final leh f25921c;

    /* renamed from: d */
    private final bqgj f25922d;

    /* renamed from: e */
    private final String f25923e;

    /* renamed from: f */
    private final kca f25924f;

    public let(lfd lfd, kck kck, leh leh, bqgj bqgj, String str, kca kca) {
        this.f25919a = lfd;
        this.f25920b = kck;
        this.f25921c = leh;
        this.f25922d = bqgj;
        this.f25923e = str;
        this.f25924f = kca;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bnon bnon;
        char c;
        bqgg bqgg;
        lfd lfd = this.f25919a;
        kck kck = this.f25920b;
        leh leh = this.f25921c;
        bqgj bqgj = this.f25922d;
        String str = this.f25923e;
        kca kca = this.f25924f;
        kjs kjs = (kjs) obj;
        kjp a = kph.m18285a(kjs.f24276a);
        if (a == null) {
            return bqga.m112775a(lei.f25877b);
        }
        if (lfd.f25946e.mo15089i()) {
            kwe.m18646a((Context) null).mo14887a(kjs.f24280e);
        }
        FillForm a2 = kqj.m18328a(a, bmxv.m108566b(kck), leh.f25874d);
        if (lfd.f25946e.mo15089i()) {
            kwe.m18646a((Context) null).mo14888a(a);
        }
        bnia j = bnic.m109500j();
        bnre i = a2.f11641a.listIterator();
        while (i.hasNext()) {
            j.mo67752b((Iterable) ((FillField) i.next()).f11634d);
        }
        bnic a3 = j.mo67751a();
        bnia j2 = bnic.m109500j();
        bnrd a4 = lfd.f25943b.iterator();
        while (a4.hasNext()) {
            kdn kdn = (kdn) a4.next();
            if (kdn.mo14412a(a3)) {
                j2.mo67629b(kdn.mo14410a());
            }
        }
        if (!j2.mo67751a().contains(Credential.class)) {
            return bqga.m112775a(lei.f25877b);
        }
        bmxv a5 = lfd.m19004a(a2, kck);
        if (a5.mo66813a()) {
            bnon = bnic.m109489a((kcv) a5.mo66814b());
        } else {
            bnon = bnon.f131923a;
        }
        kcv kcv = a2.f11643c;
        kdl kdl = kcv instanceof kdl ? (kdl) kcv : null;
        bnia bnia = new bnia();
        bnrd a6 = lfd.f25944c.iterator();
        while (a6.hasNext()) {
            bnia.mo67629b(((kfx) a6.next()).mo14429a(new kej(new kel(bqgj, kck, bmxv.m108567c(kdl), bnon, new byte[0], lfd.f25950i), bnic.m109489a(Credential.class))));
            a = a;
            bnia = bnia;
            a2 = a2;
            kca = kca;
            kck = kck;
        }
        FillForm fillForm = a2;
        kck kck2 = kck;
        kca kca2 = kca;
        kjp kjp = a;
        bnic a7 = bnia.mo67751a();
        bqgg a8 = bqga.m112782b(a7).mo69214a(new lfb(a7), bqgj);
        if (lfd.f25946e.mo15080a(str) >= lhi.f26105c) {
            bqgg = bqga.m112775a(bmvz.f131120a);
            c = 0;
        } else {
            ClientState clientState = leh.f25873c;
            c = 0;
            bqgg = lfd.f25945d.mo14962a(new lcf(kck2, fillForm, ImmutableDetectionHistory.m7172a(clientState.f11671c), bqdx.m112673a(a8, leu.f25925a, bqgj), kqh.m18326a(kjs.f24278c, leh.f25874d), lfd.f25950i));
        }
        bqgg[] bqggArr = new bqgg[2];
        bqggArr[c] = bqgg;
        bqggArr[1] = a8;
        return bqga.m112783b(bqggArr).mo69214a(new lfc(lfd, bqgg, leh, kjs, kjp, fillForm, a8, kck2, kca2), bqgj);
    }
}
