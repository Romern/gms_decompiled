package p000;

import android.text.TextUtils;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TimeZone;

/* renamed from: ajen */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajen extends buqn {

    /* renamed from: a */
    final /* synthetic */ List f70437a;

    /* renamed from: b */
    final /* synthetic */ List f70438b;

    /* renamed from: c */
    final /* synthetic */ List f70439c;

    /* renamed from: d */
    final /* synthetic */ ClientAppIdentifier f70440d;

    /* renamed from: e */
    final /* synthetic */ String f70441e;

    /* renamed from: f */
    final /* synthetic */ List f70442f;

    /* renamed from: g */
    final /* synthetic */ List f70443g;

    /* renamed from: h */
    final /* synthetic */ List f70444h;

    /* renamed from: i */
    final /* synthetic */ List f70445i;

    /* renamed from: j */
    final /* synthetic */ bzcb f70446j;

    /* renamed from: k */
    final /* synthetic */ ajeu f70447k;

    /* renamed from: l */
    final /* synthetic */ ajeq f70448l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajen(ajeq ajeq, String str, List list, List list2, List list3, ClientAppIdentifier clientAppIdentifier, String str2, List list4, List list5, List list6, List list7, bzcb bzcb, ajeu ajeu) {
        super(str);
        this.f70448l = ajeq;
        this.f70437a = list;
        this.f70438b = list2;
        this.f70439c = list3;
        this.f70440d = clientAppIdentifier;
        this.f70441e = str2;
        this.f70442f = list4;
        this.f70443g = list5;
        this.f70444h = list6;
        this.f70445i = list7;
        this.f70446j = bzcb;
        this.f70447k = ajeu;
    }

    public final void run() {
        bxvf bxvf = (bxvf) bzcn.f169375h.mo74144da();
        List list = this.f70437a;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bzcn bzcn = (bzcn) bxvf.f164949b;
        if (!bzcn.f169378b.mo73666a()) {
            bzcn.f169378b = bxvk.m124021a(bzcn.f169378b);
        }
        bxsy.m123078a(list, bzcn.f169378b);
        bxvf.mo74133b(this.f70438b);
        List list2 = this.f70439c;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bzcn bzcn2 = (bzcn) bxvf.f164949b;
        if (!bzcn2.f169382f.mo73666a()) {
            bzcn2.f169382f = bxvk.m124021a(bzcn2.f169382f);
        }
        bxsy.m123078a(list2, bzcn2.f169382f);
        String id = TimeZone.getDefault().getID();
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bzcn bzcn3 = (bzcn) bxvf.f164949b;
        id.getClass();
        bzcn3.f169377a |= 16;
        bzcn3.f169383g = id;
        String a = this.f70448l.f70469k.mo38444a(this.f70440d);
        if (a != null) {
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bzcn bzcn4 = (bzcn) bxvf.f164949b;
            a.getClass();
            bzcn4.f169377a |= 8;
            bzcn4.f169380d = a;
        }
        aiwt aiwt = this.f70448l.f70464f;
        if (!TextUtils.isEmpty(this.f70441e)) {
            aiwt = null;
        }
        aiwt aiwt2 = !this.f70440d.mo44295c("0p:discoverer") ? aiwt : null;
        HashSet hashSet = new HashSet();
        for (byzs byzs : this.f70442f) {
            hashSet.add(byzs.f169163b);
        }
        hashSet.addAll(this.f70443g);
        if (hashSet.size() > 0) {
            if (cfos.m141988b()) {
                bnsl bnsl = (bnsl) ahfq.f67120a.mo68390d();
                bnsl.mo68432a("ajen", "run", 361, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68424a("%s REQUEST %s", "ReportRpcManager: ", hashSet);
            }
            this.f70448l.f70465g.mo38320a(this.f70440d.f80668c.f80723b, 16, hashSet, Collections.emptySet());
        }
        ajed ajed = this.f70448l.f70460b;
        ClientAppIdentifier clientAppIdentifier = this.f70440d;
        List list3 = this.f70444h;
        List list4 = this.f70445i;
        List list5 = this.f70442f;
        List list6 = this.f70443g;
        bzcn bzcn5 = (bzcn) bxvf.mo74062i();
        bzcb bzcb = this.f70446j;
        ajeu ajeu = this.f70447k;
        ajeq ajeq = this.f70448l;
        List<byyt> list7 = this.f70438b;
        bnia j = bnic.m109500j();
        bngs j2 = bngx.m109377j();
        for (byyt byyt : list7) {
            if ((byyt.f169010a & 1) != 0) {
                byys byys = byyt.f169011b;
                if (byys == null) {
                    byys = byys.f169002d;
                }
                int a2 = bzaj.m125580a(byys.f169005b);
                if (a2 != 0 && a2 == 107) {
                    byys byys2 = byyt.f169011b;
                    if (byys2 == null) {
                        byys2 = byys.f169002d;
                    }
                    j2.mo67668c(byys2);
                }
            }
        }
        for (ajag ajag : ((ajai) ahgz.m55754a(ajeq.f70459a, ajai.class)).mo38386a((byys[]) j2.mo67664a().toArray(new byys[0]))) {
            j.mo67629b(ajag.f70232b);
        }
        new ajes(ajed.f70415a, ajed.f70416b, clientAppIdentifier, list3, list4, list5, list6, bzcn5, bzcb, aiwt2, ajeu, j.mo67751a()).mo38568b();
    }
}
