package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: bcmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcmo implements bcnl {

    /* renamed from: a */
    private final Context f104487a;

    /* renamed from: b */
    private final bcoh f104488b;

    /* renamed from: c */
    private final cbds f104489c;

    /* renamed from: d */
    private final bmxv f104490d;

    /* renamed from: e */
    private final bmxv f104491e;

    public bcmo(bcoh bcoh, ContactId contactId, Context context) {
        this.f104488b = bcoh;
        this.f104489c = bclk.m89245a(contactId);
        this.f104490d = bmxv.m108566b(contactId);
        this.f104491e = bmvz.f131120a;
        this.f104487a = context;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bqgg mo56978a(bqgg bqgg, Object obj) {
        return bqdx.m112674a(bqgg, new bcmn((bydz) obj), bqfb.INSTANCE);
    }

    public bcmo(bcoh bcoh, ConversationId conversationId, Context context) {
        cbds cbds;
        this.f104488b = bcoh;
        if (conversationId.mo60556c() == ConversationId.IdType.GROUP) {
            bxvd da = cbds.f176782e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((cbds) da.f164949b).f176784a = cbel.m127776a(6);
            String b = conversationId.mo60557d().mo60504b();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            b.getClass();
            ((cbds) da.f164949b).f176787d = b;
            String a = conversationId.mo60557d().mo60503a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a.getClass();
            ((cbds) da.f164949b).f176785b = a;
            cbds = (cbds) da.mo74062i();
        } else {
            cbds = bclk.m89245a(conversationId.mo60558e());
        }
        this.f104489c = cbds;
        this.f104491e = bmxv.m108566b(conversationId);
        this.f104490d = bmvz.f131120a;
        this.f104487a = context;
    }

    /* renamed from: a */
    public final bqgg mo56979a(cbmo cbmo) {
        bxvd da = bydz.f165878c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bydz bydz = (bydz) da.f164949b;
        cbmo.getClass();
        bydz.f165880a = cbmo;
        cbds cbds = this.f104489c;
        cbds.getClass();
        bydz.f165881b = cbds;
        return bqga.m112775a((bydz) da.mo74062i());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo56980a(Object obj) {
        String str;
        bmxv bmxv;
        bmxv bmxv2;
        cbdk cbdk;
        int i;
        bxtx bxtx;
        byea byea = (byea) obj;
        bchp l = bchq.m89041l();
        cbdv cbdv = byea.f165884a;
        if (cbdv == null) {
            cbdv = cbdv.f176794j;
        }
        l.mo56896c(cbdv.f176796a);
        cbdv cbdv2 = byea.f165884a;
        if (cbdv2 == null) {
            cbdv2 = cbdv.f176794j;
        }
        cbdt cbdt = cbdv2.f176797b;
        if (cbdt == null) {
            cbdt = cbdt.f176788d;
        }
        l.mo56891a(cbdt.f176792c);
        cbdv cbdv3 = byea.f165884a;
        if (cbdv3 == null) {
            cbdv3 = cbdv.f176794j;
        }
        if (!cbdv3.f176804i.isEmpty()) {
            cbdv cbdv4 = byea.f165884a;
            if (cbdv4 == null) {
                cbdv4 = cbdv.f176794j;
            }
            l.f104170a = bmxv.m108566b(cbdv4.f176804i);
        }
        cbdv cbdv5 = byea.f165884a;
        if (cbdv5 == null) {
            cbdv5 = cbdv.f176794j;
        }
        cbdt cbdt2 = cbdv5.f176797b;
        if (cbdt2 == null) {
            cbdt2 = cbdt.f176788d;
        }
        String str2 = "";
        if (cbdt2.f176790a == 2) {
            str = (String) cbdt2.f176791b;
        } else {
            str = str2;
        }
        if (TextUtils.isEmpty(str)) {
            cbdv cbdv6 = byea.f165884a;
            if (cbdv6 == null) {
                cbdv6 = cbdv.f176794j;
            }
            cbdt cbdt3 = cbdv6.f176797b;
            if (cbdt3 == null) {
                cbdt3 = cbdt.f176788d;
            }
            if (cbdt3.f176790a == 1) {
                bxtx = (bxtx) cbdt3.f176791b;
            } else {
                bxtx = bxtx.f164797b;
            }
            l.mo56893a(bxtx.mo73780k());
        } else {
            cbdv cbdv7 = byea.f165884a;
            if (cbdv7 == null) {
                cbdv7 = cbdv.f176794j;
            }
            cbdt cbdt4 = cbdv7.f176797b;
            if (cbdt4 == null) {
                cbdt4 = cbdt.f176788d;
            }
            if (cbdt4.f176790a == 2) {
                str2 = (String) cbdt4.f176791b;
            }
            l.mo56895b(str2);
        }
        cbdv cbdv8 = byea.f165884a;
        if (cbdv8 == null) {
            cbdv8 = cbdv.f176794j;
        }
        if (cbdv8.f176798c != null) {
            bchl b = bchm.m89027b();
            ArrayList arrayList = new ArrayList();
            cbdv cbdv9 = byea.f165884a;
            if (cbdv9 == null) {
                cbdv9 = cbdv.f176794j;
            }
            cbdq cbdq = cbdv9.f176798c;
            if (cbdq == null) {
                cbdq = cbdq.f176772b;
            }
            bxwc bxwc = cbdq.f176774a;
            int size = bxwc.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(bclk.m89246a((cbds) bxwc.get(i2)));
            }
            b.mo56888a(arrayList);
            l.f104171b = bmxv.m108566b(b.mo56887a());
        }
        HashMap hashMap = new HashMap();
        cbdv cbdv10 = byea.f165884a;
        if (cbdv10 == null) {
            cbdv10 = cbdv.f176794j;
        }
        Map unmodifiableMap = Collections.unmodifiableMap(cbdv10.f176799d);
        for (String str3 : unmodifiableMap.keySet()) {
            hashMap.put(str3, ((bxte) unmodifiableMap.get(str3)).mo73642k());
        }
        l.mo56892a(hashMap);
        bngs j = bngx.m109377j();
        bbqe a = bbqe.m88387a(this.f104487a);
        if (a.mo56357a(6, a.f103062a.f103102X)) {
            cbdv cbdv11 = byea.f165884a;
            if (cbdv11 == null) {
                cbdv11 = cbdv.f176794j;
            }
            bxwc bxwc2 = cbdv11.f176800e;
            int size2 = bxwc2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                cbdy cbdy = (cbdy) bxwc2.get(i3);
                Context context = this.f104487a;
                cbdj cbdj = cbdy.f176812b;
                if (cbdj == null) {
                    cbdj = cbdj.f176740j;
                }
                bmxv a2 = bclb.m89215a(context, cbdj, bmvz.f131120a, bmvz.f131120a);
                if (a2.mo66813a()) {
                    bcta d = bctb.m89884d();
                    d.mo57496a(cbdy.f176811a);
                    d.mo57495a((bcov) a2.mo66814b());
                    j.mo67668c(d.mo57494a());
                }
            }
        }
        l.mo56890a(j.mo67664a());
        bbqe a3 = bbqe.m88387a(this.f104487a);
        if (a3.mo56357a(4, a3.f103062a.f103103Y)) {
            cbdv cbdv12 = byea.f165884a;
            if (cbdv12 == null) {
                cbdv12 = cbdv.f176794j;
            }
            cbef cbef = cbdv12.f176803h;
            if (cbef == null) {
                cbef = cbef.f176837c;
            }
            bctc c = bctd.m89892c();
            c.mo57500a(0);
            c.mo57501b(0);
            if (((Boolean) bbqt.m88417a(this.f104487a).f103104Z.mo58455c()).booleanValue() && (cbdk = cbef.f176839a) != null) {
                int i4 = cbdk.f176753a;
                if (i4 != 0) {
                    i = i4 != 1 ? 0 : 3;
                } else {
                    i = 2;
                }
                if (i == 0) {
                    i = 1;
                }
                if (i - 2 != 1) {
                    c.mo57500a(0);
                } else {
                    c.mo57500a(1);
                }
            }
            bbqe a4 = bbqe.m88387a(this.f104487a);
            if (a4.mo56357a(3, a4.f103062a.f103132aa)) {
                int i5 = cbef.f176840b;
                int i6 = i5 != 0 ? i5 != 1 ? 0 : 3 : 2;
                if (i6 == 0) {
                    i6 = 1;
                }
                if (i6 - 2 != 1) {
                    c.mo57501b(1);
                } else {
                    c.mo57501b(2);
                }
            }
            l.f104172c = bmxv.m108566b(c.mo57499a());
        }
        bngs j2 = bngx.m109377j();
        bbqe a5 = bbqe.m88387a(this.f104487a);
        if (a5.mo56357a(8, a5.f103062a.f103129aX)) {
            cbdv cbdv13 = byea.f165884a;
            if (cbdv13 == null) {
                cbdv13 = cbdv.f176794j;
            }
            bxwc bxwc3 = cbdv13.f176801f;
            int size3 = bxwc3.size();
            for (int i7 = 0; i7 < size3; i7++) {
                cbdy cbdy2 = (cbdy) bxwc3.get(i7);
                Context context2 = this.f104487a;
                bmvz bmvz = bmvz.f131120a;
                bmvz bmvz2 = bmvz.f131120a;
                bcta d2 = bctb.m89884d();
                cbdj cbdj2 = cbdy2.f176812b;
                if (cbdj2 == null) {
                    cbdj2 = cbdj.f176740j;
                }
                bmxv a6 = bclb.m89215a(context2, cbdj2, bmvz, bmvz2);
                if (a6.mo66813a()) {
                    d2.mo57496a(cbdy2.f176811a);
                    d2.mo57495a((bcov) a6.mo66814b());
                    if (!cbdy2.f176813c.mo73779j()) {
                        d2.mo57497a(cbdy2.f176813c.mo73780k());
                    }
                    bmxv2 = bmxv.m108566b(d2.mo57494a());
                } else {
                    bmxv2 = bmvz.f131120a;
                }
                if (bmxv2.mo66813a()) {
                    j2.mo67668c((bctb) bmxv2.mo66814b());
                }
            }
        }
        l.mo56894b(j2.mo67664a());
        if (bbqe.m88387a(this.f104487a).mo56359c()) {
            cbdv cbdv14 = byea.f165884a;
            if (cbdv14 == null) {
                cbdv14 = cbdv.f176794j;
            }
            cbdm cbdm = cbdv14.f176802g;
            if (cbdm == null) {
                cbdm = cbdm.f176759c;
            }
            int a7 = cbek.m127775a(cbdm.f176761a);
            if (a7 == 0) {
                a7 = 1;
            }
            if (a7 - 2 == 1) {
                bcfx a8 = bcfx.m88929a(this.f104487a);
                bcoh bcoh = this.f104488b;
                Context context3 = this.f104487a;
                int a9 = cbek.m127775a(cbdm.f176761a);
                if (a9 != 0 && a9 == 3) {
                    try {
                        bxte bxte = cbdm.f176762b;
                        if (bxte == null) {
                            bxte = bxte.f164763c;
                        }
                        bxtx bxtx2 = bxte.f164766b;
                        bxus c2 = bxus.m123744c();
                        cbgf cbgf = cbgf.f177024b;
                        try {
                            bxuc h = bxtx2.mo73764h();
                            bxvk bxvk = (bxvk) cbgf.mo74142c(4);
                            bxxv a10 = bxxm.f165037a.mo74228a(bxvk);
                            a10.mo74220a(bxvk, bxud.m123454a(h), c2);
                            a10.mo74225d(bxvk);
                            h.mo73787a(0);
                            bxvk.m124027b(bxvk);
                            bcuo a11 = bcly.m89263a(bcoh, context3, (cbgf) bxvk, "RICH_TEXT_ACCESSORY_VIEW", a8);
                            bcup c3 = bcuq.m90048c();
                            c3.mo57570a(a11);
                            bmxv = bmxv.m108566b(c3.mo57569a());
                        } catch (IOException e) {
                            if (!(e.getCause() instanceof bxwf)) {
                                throw new bxwf(e.getMessage());
                            }
                            throw ((bxwf) e.getCause());
                        } catch (RuntimeException e2) {
                            if (e2.getCause() instanceof bxwf) {
                                throw ((bxwf) e2.getCause());
                            }
                            throw e2;
                        } catch (bxwf e3) {
                            throw e3;
                        } catch (bxwf e4) {
                            throw e4;
                        }
                    } catch (bxwf e5) {
                        bbos.m88294d("RichTextCustomViewContentProtoConverter", "can not convert proto to RichText");
                        bmxv = bmvz.f131120a;
                    }
                } else {
                    bbos.m88294d("RichTextCustomViewContentProtoConverter", "This CustomViewContent is not type of RICH_TEXT");
                    bmxv = bmvz.f131120a;
                }
                if (bmxv.mo66813a()) {
                    l.f104173d = bmxv.m108566b((bcsv) bmxv.mo66814b());
                }
            }
        }
        bbyj c4 = bbyk.m88611c();
        c4.f103755b = 2;
        c4.f103754a = bmxv.m108566b(l.mo56889a());
        return c4.mo56546a();
    }

    /* renamed from: a */
    public final void mo56981a(UUID uuid, int i, chuv chuv, bcfx bcfx, long j) {
        if (this.f104490d.mo66813a()) {
            bcnr q = bcns.m89409q();
            q.mo57011b(10003);
            q.mo57012b(this.f104488b.mo57058b().mo57074e());
            q.mo57010a(this.f104488b.mo57059c().mo73781l());
            q.mo57013b(uuid.toString());
            q.mo57007a((ContactId) this.f104490d.mo66814b());
            q.mo57014c(9);
            q.mo57009a(Integer.valueOf(chuv.f189233s.f189211r));
            q.mo57003a(i);
            q.mo57004a(j);
            bcfx.mo56753a(q.mo57002a());
            return;
        }
        bcnr q2 = bcns.m89409q();
        q2.mo57011b(10003);
        q2.mo57012b(this.f104488b.mo57058b().mo57074e());
        q2.mo57010a(this.f104488b.mo57059c().mo73781l());
        q2.mo57013b(uuid.toString());
        q2.mo57008a((ConversationId) this.f104491e.mo66814b());
        q2.mo57009a(Integer.valueOf(chuv.f189233s.f189211r));
        q2.mo57014c(9);
        q2.mo57003a(i);
        q2.mo57004a(j);
        bcfx.mo56753a(q2.mo57002a());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo56982a(UUID uuid, Object obj, bcfx bcfx, long j) {
        bbyk bbyk = (bbyk) obj;
        if (this.f104490d.mo66813a()) {
            bcnr q = bcns.m89409q();
            q.mo57011b(10003);
            q.mo57012b(this.f104488b.mo57058b().mo57074e());
            q.mo57010a(this.f104488b.mo57059c().mo73781l());
            q.mo57013b(uuid.toString());
            q.mo57014c(9);
            q.mo57003a(1);
            q.mo57004a(j);
            bcfx.mo56753a(q.mo57002a());
            return;
        }
        bcnr q2 = bcns.m89409q();
        q2.mo57011b(10003);
        q2.mo57012b(this.f104488b.mo57058b().mo57074e());
        q2.mo57010a(this.f104488b.mo57059c().mo73781l());
        q2.mo57013b(uuid.toString());
        q2.mo57008a((ConversationId) this.f104491e.mo66814b());
        q2.mo57014c(9);
        q2.mo57003a(1);
        q2.mo57004a(j);
        bcfx.mo56753a(q2.mo57002a());
    }
}
