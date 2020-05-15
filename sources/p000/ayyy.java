package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: ayyy */
final /* synthetic */ class ayyy implements bqeg {

    /* renamed from: a */
    private final ayza f98778a;

    /* renamed from: b */
    private final ayyg f98779b;

    /* renamed from: c */
    private final aywt f98780c;

    /* renamed from: d */
    private final List f98781d;

    /* renamed from: e */
    private final bqgg f98782e;

    /* renamed from: f */
    private final String f98783f;

    /* renamed from: g */
    private final bqgg f98784g;

    /* renamed from: h */
    private final bqgg f98785h;

    /* renamed from: i */
    private final ayvy f98786i;

    public ayyy(ayza ayza, ayyg ayyg, aywt aywt, List list, bqgg bqgg, String str, bqgg bqgg2, bqgg bqgg3, ayvy ayvy) {
        this.f98778a = ayza;
        this.f98779b = ayyg;
        this.f98780c = aywt;
        this.f98781d = list;
        this.f98782e = bqgg;
        this.f98783f = str;
        this.f98784g = bqgg2;
        this.f98785h = bqgg3;
        this.f98786i = ayvy;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        boolean z;
        Integer num;
        bxvt bxvt;
        ayza ayza = this.f98778a;
        ayyg ayyg = this.f98779b;
        aywt aywt = this.f98780c;
        List list = this.f98781d;
        bqgg bqgg = this.f98782e;
        String str = this.f98783f;
        bqgg bqgg2 = this.f98784g;
        bqgg bqgg3 = this.f98785h;
        ayvy ayvy = this.f98786i;
        bxvd da = boki.f133411g.mo74144da();
        bptv bptv = ayyg.f98740a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boki boki = (boki) da.f164949b;
        bptv.getClass();
        boki.f133414b = bptv;
        boki.f133413a |= 1;
        bptv a = ayyv.m85089a(ayyg, true);
        if (a != null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "No Parent Event");
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boki boki2 = (boki) da.f164949b;
        a.getClass();
        boki2.f133416d = a;
        boki2.f133413a |= 2;
        bptu bptu = ayyc.m85064a(ayyg).f98654c;
        if (bptu == null) {
            bptu = bptu.f139179e;
        }
        bxvf bxvf = (bxvf) bpby.f135681j.mo74144da();
        int i = bptu.f139183c;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bpby bpby = (bpby) bxvf.f164949b;
        int i2 = bpby.f135683a | 4;
        bpby.f135683a = i2;
        bpby.f135684b = i;
        int i3 = bptu.f139182b;
        bpby.f135683a = i2 | 8;
        bpby.f135685c = i3;
        bqbo a2 = bqbo.m112517a(aywt.f98647b);
        if (a2 == null) {
            a2 = bqbo.UNASSIGNED_USER_ACTION_ID;
        }
        int i4 = a2.f140429Q;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bpby bpby2 = (bpby) bxvf.f164949b;
        bpby2.f135683a |= 16;
        bpby2.f135686d = i4;
        bqbo a3 = bqbo.m112517a(aywt.f98647b);
        if (a3 == null) {
            a3 = bqbo.UNASSIGNED_USER_ACTION_ID;
        }
        int i5 = a3.f140429Q;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bpby bpby3 = (bpby) bxvf.f164949b;
        bpby3.f135683a |= 16;
        bpby3.f135686d = i5;
        bxvt bxvt2 = aywt.f98648c;
        int size = bxvt2.size();
        int i6 = 0;
        while (i6 < size) {
            switch (((Integer) bxvt2.get(i6)).intValue()) {
                case 100000001:
                    bxvt = bxvt2;
                    bxvj bxvj = ayxz.f98722a;
                    aywt.mo74135a(bxvj);
                    Object b = aywt.f164952m.mo73913b(bxvj.f164958d);
                    if (b == null) {
                        b = bxvj.f164956b;
                    } else {
                        bxvj.mo74139a(b);
                    }
                    int a4 = bqbm.m112515a(((ayya) b).f98726a);
                    if (a4 == 0) {
                        a4 = 1;
                    }
                    int i7 = a4 - 1;
                    if (bxvf.f164950c) {
                        bxvf.mo74035c();
                        bxvf.f164950c = false;
                    }
                    bpby bpby4 = (bpby) bxvf.f164949b;
                    bpby4.f135683a |= 32;
                    bpby4.f135687e = i7;
                    break;
                case 100000002:
                    bxvt = bxvt2;
                    bxvj bxvj2 = ayxz.f98723b;
                    aywt.mo74135a(bxvj2);
                    Object b2 = aywt.f164952m.mo73913b(bxvj2.f164958d);
                    if (b2 == null) {
                        b2 = bxvj2.f164956b;
                    } else {
                        bxvj2.mo74139a(b2);
                    }
                    int a5 = bqbj.m112512a(((bqbk) b2).f140382a);
                    if (a5 == 0) {
                        a5 = 1;
                    }
                    int i8 = a5 - 1;
                    if (bxvf.f164950c) {
                        bxvf.mo74035c();
                        bxvf.f164950c = false;
                    }
                    bpby bpby5 = (bpby) bxvf.f164949b;
                    bpby5.f135683a |= 64;
                    bpby5.f135688f = i8;
                    break;
                case 100000003:
                    bxvj bxvj3 = ayzu.f98817b;
                    aywt.mo74135a(bxvj3);
                    bxvt = bxvt2;
                    Object b3 = aywt.f164952m.mo73913b(bxvj3.f164958d);
                    if (b3 == null) {
                        b3 = bxvj3.f164956b;
                    } else {
                        bxvj3.mo74139a(b3);
                    }
                    int i9 = ((ayyx) b3).f98776a;
                    if (bxvf.f164950c) {
                        bxvf.mo74035c();
                        bxvf.f164950c = false;
                    }
                    bpby bpby6 = (bpby) bxvf.f164949b;
                    bpby6.f135683a |= 128;
                    bpby6.f135689g = i9;
                    break;
                default:
                    bxvt = bxvt2;
                    break;
            }
            i6++;
            bxvt2 = bxvt;
        }
        if (!list.isEmpty()) {
            bxvf bxvf2 = (bxvf) bokh.f133408a.mo74144da();
            int size2 = list.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((ayyk) bqga.m112780a((Future) ((bqgg) list.get(i10)))).mo54528a(bxvf2);
            }
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bpby bpby7 = (bpby) bxvf.f164949b;
            bokh bokh = (bokh) bxvf2.mo74062i();
            bokh.getClass();
            bpby7.f135691i = bokh;
            bpby7.f135683a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        }
        bxvf[] bxvfArr = (bxvf[]) bqga.m112780a((Future) bqgg);
        if (bxvfArr != null) {
            for (bxvf bxvf3 : bxvfArr) {
                if (bxvf.f164950c) {
                    bxvf.mo74035c();
                    bxvf.f164950c = false;
                }
                bpby bpby8 = (bpby) bxvf.f164949b;
                bpcb bpcb = (bpcb) bxvf3.mo74062i();
                bpcb.getClass();
                if (!bpby8.f135690h.mo73666a()) {
                    bpby8.f135690h = GeneratedMessageLite.m124021a(bpby8.f135690h);
                }
                bpby8.f135690h.add(bpcb);
            }
        }
        bpby bpby9 = (bpby) bxvf.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boki boki3 = (boki) da.f164949b;
        bpby9.getClass();
        boki3.f133417e = bpby9;
        boki3.f133413a |= 16;
        bxvp bxvp = (bxvp) ayza.f98789a.mo40449c(ayyg).mo66815c();
        aywe aywe = ayza.f98790b;
        aywc i11 = aywd.m84968i();
        i11.mo54475a(str);
        i11.mo54473a((bxxc) bqga.m112780a((Future) bqgg2));
        i11.f98604a = (boki) da.mo74062i();
        if (bxvp != null) {
            num = Integer.valueOf(bxvp.mo3214a());
        } else {
            num = null;
        }
        i11.f98605b = num;
        i11.f98608e = (int[]) bqga.m112780a((Future) bqgg3);
        i11.mo54474a(cagz.DEFAULT);
        i11.f98606c = Long.valueOf(ayvj.m84935a(ayyg.f98743d) / 1000);
        i11.f98607d = Long.valueOf(ayyg.f98743d / 1000);
        return aywe.mo54476a(i11.mo54472a(), ayvy.f98588b);
    }
}
