package p000;

import android.text.TextUtils;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: dpr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dpr extends drx {
    public dpr() {
        super("PushAnalyticsDataToServer");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9410a() {
        char c;
        tjk tjk;
        long j;
        bxvd bxvd;
        bxvd bxvd2;
        Iterator it;
        bxvd bxvd3;
        bxhk bxhk;
        int i;
        bxhj bxhj;
        dpq dpq;
        long j2;
        boolean z;
        dpk F = dwq.m9649F();
        int i2 = 1;
        boolean z2 = false;
        if (F.f13747a) {
            bxvd b = dpf.m9019b();
            long a = dwq.m9665i().mo20505a();
            bxvd da = bxhe.f163350h.mo74144da();
            if (F.f13748b.size() > 0) {
                ArrayList arrayList = new ArrayList();
                int i3 = 0;
                while (i3 < F.f13748b.size()) {
                    dpq dpq2 = (dpq) F.f13748b.valueAt(i3);
                    int size = dpq2.f13790b.size();
                    bxvd da2 = bxhk.f163412d.mo74144da();
                    bxco bxco = dpq2.f13789a;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = z2;
                    }
                    bxhk bxhk2 = (bxhk) da2.f164949b;
                    bxhk2.f163415b = bxco.f162973bD;
                    bxhk2.f163414a |= i2;
                    if (size == 0) {
                        bxhk = (bxhk) da2.mo74062i();
                    } else {
                        int i4 = 0;
                        while (i4 < size) {
                            dpp dpp = (dpp) dpq2.f13790b.get(i4);
                            if (!dpp.f13785b) {
                                bxhj = dpp.mo9405b();
                                dpp.f13785b = z2;
                                bxvd bxvd4 = dpp.f13788e;
                                if (bxvd4.f164950c) {
                                    bxvd4.mo74035c();
                                    bxvd4.f164950c = z2;
                                }
                                bxhl bxhl = (bxhl) bxvd4.f164949b;
                                bxhl bxhl2 = bxhl.f163417d;
                                int i5 = bxhl.f163419a | 1;
                                bxhl.f163419a = i5;
                                bxhl.f163420b = 0;
                                bxhl.f163419a = i5 | 2;
                                bxhl.f163421c = 0;
                                dpp.f13786c = 0;
                                dpp.f13787d = 0;
                                dpp.f13784a.mo9378a();
                                i = i3;
                                dpq = dpq2;
                                j2 = a;
                            } else {
                                long j3 = a;
                                bxvd bxvd5 = dpp.f13788e;
                                if (!bxvd5.f164950c) {
                                    z = false;
                                } else {
                                    bxvd5.mo74035c();
                                    z = false;
                                    bxvd5.f164950c = false;
                                }
                                bxhl bxhl3 = (bxhl) bxvd5.f164949b;
                                bxhl bxhl4 = bxhl.f163417d;
                                bxhl3.f163419a |= 2;
                                j2 = j3;
                                bxhl3.f163421c = j2;
                                dpp.f13785b = z;
                                dph dph = new dph();
                                Iterator it2 = dpp.f13784a.f13741a.entrySet().iterator();
                                while (it2.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it2.next();
                                    dpi dpi = (dpi) entry.getKey();
                                    Iterator it3 = ((HashMap) entry.getValue()).values().iterator();
                                    while (it3.hasNext()) {
                                        Iterator it4 = it2;
                                        dpg dpg = (dpg) it3.next();
                                        Iterator it5 = it3;
                                        if (dpg.f13738b) {
                                            dph.mo9379a(dpi, new dpg(dpg.f13737a, j2));
                                            dpg.mo9377a(j2);
                                            it3 = it5;
                                            it2 = it4;
                                            i3 = i3;
                                        } else {
                                            it3 = it5;
                                            it2 = it4;
                                        }
                                    }
                                }
                                i = i3;
                                bxhj = dpp.mo9405b();
                                bxvd bxvd6 = dpp.f13788e;
                                if (bxvd6.f164950c) {
                                    bxvd6.mo74035c();
                                    bxvd6.f164950c = false;
                                }
                                bxhl bxhl5 = (bxhl) bxvd6.f164949b;
                                bxhl5.f163419a |= 1;
                                bxhl5.f163420b = j2;
                                bxvd bxvd7 = dpp.f13788e;
                                if (bxvd7.f164950c) {
                                    bxvd7.mo74035c();
                                    bxvd7.f164950c = false;
                                }
                                bxhl bxhl6 = (bxhl) bxvd7.f164949b;
                                bxhl6.f163419a |= 2;
                                dpq = dpq2;
                                bxhl6.f163421c = Long.MAX_VALUE;
                                dpp.f13785b = true;
                                dpp.f13786c = 0;
                                dpp.f13787d = 0;
                                dpp.f13784a.mo9378a();
                                dpp.f13784a = dph;
                            }
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bxhk bxhk3 = (bxhk) da2.f164949b;
                            bxhj.getClass();
                            if (!bxhk3.f163416c.mo73666a()) {
                                bxhk3.f163416c = GeneratedMessageLite.m124021a(bxhk3.f163416c);
                            }
                            bxhk3.f163416c.add(bxhj);
                            i4++;
                            dpq2 = dpq;
                            i3 = i;
                            i2 = 1;
                            a = j2;
                            z2 = false;
                        }
                        int i6 = size - 1;
                        if (!((dpp) dpq2.f13790b.get(i6)).f13785b) {
                            dpq2.f13790b.clear();
                        } else {
                            dpq2.f13790b.clear();
                            dpq2.f13790b.add((dpp) dpq2.f13790b.get(i6));
                        }
                        bxhk = (bxhk) da2.mo74062i();
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = z2;
                    }
                    bxhe bxhe = (bxhe) da.f164949b;
                    bxhk.getClass();
                    if (!bxhe.f163353b.mo73666a()) {
                        bxhe.f163353b = GeneratedMessageLite.m124021a(bxhe.f163353b);
                    }
                    bxhe.f163353b.add(bxhk);
                    if (!dpq2.f13791c) {
                        arrayList.add(Integer.valueOf(F.f13748b.keyAt(i3)));
                    }
                    i3++;
                }
                j = a;
                int size2 = arrayList.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    F.f13748b.remove(((Integer) arrayList.get(i7)).intValue());
                }
            } else {
                j = a;
            }
            if (!F.f13750d.isEmpty()) {
                Iterator it6 = F.f13750d.values().iterator();
                while (it6.hasNext()) {
                    dpj dpj = (dpj) it6.next();
                    bxvd da3 = bxhd.f163344e.mo74144da();
                    if (!TextUtils.isEmpty(dpj.f13744a)) {
                        String str = dpj.f13744a;
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bxhd bxhd = (bxhd) da3.f164949b;
                        str.getClass();
                        bxhd.f163346a |= 1;
                        bxhd.f163347b = str;
                    }
                    if (!TextUtils.isEmpty(dpj.f13745b)) {
                        String str2 = dpj.f13745b;
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bxhd bxhd2 = (bxhd) da3.f164949b;
                        str2.getClass();
                        bxhd2.f163346a |= 2;
                        bxhd2.f163348c = str2;
                    }
                    if (dpj.f13746c.size() <= 0) {
                        bxvd2 = b;
                        it = it6;
                    } else {
                        int i8 = 0;
                        while (i8 < dpj.f13746c.size()) {
                            dpm dpm = (dpm) dpj.f13746c.valueAt(i8);
                            bxvd da4 = bxhh.f163382h.mo74144da();
                            int i9 = dpm.f13759a;
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            bxhh bxhh = (bxhh) da4.f164949b;
                            int i10 = bxhh.f163384a | 1;
                            bxhh.f163384a = i10;
                            bxhh.f163385b = i9;
                            int i11 = dpm.f13760b;
                            int i12 = i10 | 8;
                            bxhh.f163384a = i12;
                            bxhh.f163386c = i11;
                            int i13 = dpm.f13761c;
                            int i14 = i12 | 16;
                            bxhh.f163384a = i14;
                            bxhh.f163387d = i13;
                            int i15 = dpm.f13762d;
                            int i16 = i14 | 32;
                            bxhh.f163384a = i16;
                            bxhh.f163388e = i15;
                            int i17 = dpm.f13763e;
                            int i18 = i16 | 64;
                            bxhh.f163384a = i18;
                            bxhh.f163389f = i17;
                            bxvd bxvd8 = b;
                            Iterator it7 = it6;
                            long j4 = dpm.f13764f;
                            if (j4 != -1) {
                                bxvd3 = bxvd8;
                                bxhh.f163384a = i18 | 128;
                                bxhh.f163390g = (int) (j4 / ((long) (i11 + i13)));
                            } else {
                                bxvd3 = bxvd8;
                            }
                            dpm.mo9395a();
                            bxhh bxhh2 = (bxhh) da4.mo74062i();
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bxhd bxhd3 = (bxhd) da3.f164949b;
                            bxhh2.getClass();
                            if (!bxhd3.f163349d.mo73666a()) {
                                bxhd3.f163349d = GeneratedMessageLite.m124021a(bxhd3.f163349d);
                            }
                            bxhd3.f163349d.add(bxhh2);
                            i8++;
                            it6 = it7;
                            b = bxvd3;
                        }
                        bxvd2 = b;
                        it = it6;
                    }
                    dpj.f13746c.clear();
                    bxhd bxhd4 = (bxhd) da3.mo74062i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bxhe bxhe2 = (bxhe) da.f164949b;
                    bxhd4.getClass();
                    if (!bxhe2.f163356e.mo73666a()) {
                        bxhe2.f163356e = GeneratedMessageLite.m124021a(bxhe2.f163356e);
                    }
                    bxhe2.f163356e.add(bxhd4);
                    it6 = it;
                    b = bxvd2;
                }
                bxvd = b;
                F.f13750d.clear();
            } else {
                bxvd = b;
            }
            dpo dpo = F.f13751e;
            bxvd da5 = bxhi.f163391m.mo74144da();
            int i19 = dpo.f13777a;
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bxhi bxhi = (bxhi) da5.f164949b;
            int i20 = bxhi.f163393a | 1;
            bxhi.f163393a = i20;
            bxhi.f163394b = i19;
            int i21 = dpo.f13778b;
            int i22 = i20 | 2;
            bxhi.f163393a = i22;
            bxhi.f163395c = i21;
            int i23 = dpo.f13779c;
            int i24 = i22 | 4;
            bxhi.f163393a = i24;
            bxhi.f163396d = i23;
            int i25 = dpo.f13780d;
            bxhi.f163393a = i24 | 8;
            bxhi.f163397e = i25;
            if (dpo.f13783g.size() > 0) {
                for (int i26 = 0; i26 < dpo.f13783g.size(); i26++) {
                    dpn dpn = (dpn) dpo.f13783g.valueAt(i26);
                    bxvd da6 = bxhg.f163367n.mo74144da();
                    bxco bxco2 = dpn.f13765a;
                    if (da6.f164950c) {
                        da6.mo74035c();
                        da6.f164950c = false;
                    }
                    bxhg bxhg = (bxhg) da6.f164949b;
                    bxhg.f163370b = bxco2.f162973bD;
                    int i27 = bxhg.f163369a | 1;
                    bxhg.f163369a = i27;
                    int i28 = dpn.f13766b;
                    int i29 = i27 | 4;
                    bxhg.f163369a = i29;
                    bxhg.f163371c = i28;
                    int i30 = dpn.f13767c;
                    int i31 = i29 | 8;
                    bxhg.f163369a = i31;
                    bxhg.f163372d = i30;
                    int i32 = dpn.f13768d;
                    int i33 = i31 | 512;
                    bxhg.f163369a = i33;
                    bxhg.f163377i = i32;
                    int i34 = dpn.f13769e;
                    int i35 = i33 | 1024;
                    bxhg.f163369a = i35;
                    bxhg.f163378j = i34;
                    int i36 = dpn.f13770f;
                    int i37 = i35 | 16;
                    bxhg.f163369a = i37;
                    bxhg.f163373e = i36;
                    int i38 = dpn.f13771g;
                    int i39 = i37 | 32;
                    bxhg.f163369a = i39;
                    bxhg.f163374f = i38;
                    int i40 = dpn.f13772h;
                    int i41 = i39 | 128;
                    bxhg.f163369a = i41;
                    bxhg.f163375g = i40;
                    int i42 = dpn.f13773i;
                    int i43 = i41 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    bxhg.f163369a = i43;
                    bxhg.f163376h = i42;
                    int i44 = dpn.f13774j;
                    int i45 = i43 | 2048;
                    bxhg.f163369a = i45;
                    bxhg.f163379k = i44;
                    int i46 = dpn.f13775k;
                    int i47 = i45 | 4096;
                    bxhg.f163369a = i47;
                    bxhg.f163380l = i46;
                    int i48 = dpn.f13776l;
                    bxhg.f163369a = i47 | 8192;
                    bxhg.f163381m = i48;
                    bxhg bxhg2 = (bxhg) da6.mo74062i();
                    dpn.mo9398a();
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    bxhi bxhi2 = (bxhi) da5.f164949b;
                    bxhg2.getClass();
                    if (!bxhi2.f163404l.mo73666a()) {
                        bxhi2.f163404l = GeneratedMessageLite.m124021a(bxhi2.f163404l);
                    }
                    bxhi2.f163404l.add(bxhg2);
                }
            }
            long b2 = (long) dpo.f13781e.mo10093b();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bxhi bxhi3 = (bxhi) da5.f164949b;
            bxhi3.f163393a |= 16;
            bxhi3.f163398f = b2;
            long c2 = (long) dpo.f13781e.mo10094c();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bxhi bxhi4 = (bxhi) da5.f164949b;
            int i49 = bxhi4.f163393a | 32;
            bxhi4.f163393a = i49;
            bxhi4.f163399g = c2;
            int i50 = dpo.f13781e.f14866c;
            bxhi4.f163393a = i49 | 64;
            bxhi4.f163400h = (long) i50;
            long b3 = (long) dpo.f13782f.mo10093b();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bxhi bxhi5 = (bxhi) da5.f164949b;
            bxhi5.f163393a |= 128;
            bxhi5.f163401i = b3;
            long c3 = (long) dpo.f13782f.mo10094c();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bxhi bxhi6 = (bxhi) da5.f164949b;
            int i51 = bxhi6.f163393a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bxhi6.f163393a = i51;
            bxhi6.f163402j = c3;
            int i52 = dpo.f13782f.f14866c;
            bxhi6.f163393a = i51 | 512;
            bxhi6.f163403k = (long) i52;
            dpo.mo9402a();
            bxhi bxhi7 = (bxhi) da5.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxhe bxhe3 = (bxhe) da.f164949b;
            bxhi7.getClass();
            bxhe3.f163355d = bxhi7;
            bxhe3.f163352a |= 4;
            if (!F.f13752f.isEmpty()) {
                List list = F.f13752f;
                int size3 = list.size();
                for (int i53 = 0; i53 < size3; i53++) {
                    tnt tnt = (tnt) list.get(i53);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bxhe bxhe4 = (bxhe) da.f164949b;
                    tnt.getClass();
                    if (!bxhe4.f163357f.mo73666a()) {
                        bxhe4.f163357f = GeneratedMessageLite.m124021a(bxhe4.f163357f);
                    }
                    bxhe4.f163357f.add(tnt);
                }
                F.f13752f.clear();
            }
            if (F.f13753g.size() > 0) {
                for (int i54 = 0; i54 < F.f13753g.size(); i54++) {
                    dpl dpl = (dpl) F.f13753g.valueAt(i54);
                    bxvd da7 = bxhf.f163359g.mo74144da();
                    int i55 = dpl.f13754a;
                    if (da7.f164950c) {
                        da7.mo74035c();
                        da7.f164950c = false;
                    }
                    bxhf bxhf = (bxhf) da7.f164949b;
                    int i56 = bxhf.f163361a | 1;
                    bxhf.f163361a = i56;
                    bxhf.f163362b = i55;
                    int i57 = dpl.f13755b;
                    int i58 = i56 | 2;
                    bxhf.f163361a = i58;
                    bxhf.f163363c = i57;
                    int i59 = dpl.f13756c;
                    int i60 = i58 | 4;
                    bxhf.f163361a = i60;
                    bxhf.f163364d = i59;
                    int i61 = dpl.f13757d;
                    int i62 = i60 | 8;
                    bxhf.f163361a = i62;
                    bxhf.f163365e = i61;
                    int i63 = dpl.f13758e;
                    bxhf.f163361a = i62 | 16;
                    bxhf.f163366f = i63;
                    bxhf bxhf2 = (bxhf) da7.mo74062i();
                    dpl.f13755b = 0;
                    dpl.f13756c = 0;
                    dpl.f13757d = 0;
                    dpl.f13758e = 0;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bxhe bxhe5 = (bxhe) da.f164949b;
                    bxhf2.getClass();
                    if (!bxhe5.f163358g.mo73666a()) {
                        bxhe5.f163358g = GeneratedMessageLite.m124021a(bxhe5.f163358g);
                    }
                    bxhe5.f163358g.add(bxhf2);
                }
                F.f13753g.clear();
            }
            bxvd da8 = bxhl.f163417d.mo74144da();
            long j5 = F.f13749c;
            if (da8.f164950c) {
                da8.mo74035c();
                da8.f164950c = false;
            }
            bxhl bxhl7 = (bxhl) da8.f164949b;
            int i64 = bxhl7.f163419a | 1;
            bxhl7.f163419a = i64;
            bxhl7.f163420b = j5;
            bxhl7.f163419a = i64 | 2;
            bxhl7.f163421c = j;
            bxhl bxhl8 = (bxhl) da8.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxhe bxhe6 = (bxhe) da.f164949b;
            bxhl8.getClass();
            bxhe6.f163354c = bxhl8;
            bxhe6.f163352a |= 1;
            F.f13749c = j;
            bxhe bxhe7 = (bxhe) da.mo74062i();
            bxvd bxvd9 = bxvd;
            if (bxvd9.f164950c) {
                bxvd9.mo74035c();
                bxvd9.f164950c = false;
            }
            tjk tjk2 = (tjk) bxvd9.f164949b;
            tjk tjk3 = tjk.f46190i;
            bxhe7.getClass();
            tjk2.f46193b = bxhe7;
            tjk2.f46192a |= 1;
            tjk = (tjk) bxvd9.mo74062i();
            c = 0;
            F.f13747a = false;
        } else {
            c = 0;
            tjk = null;
        }
        if (tjk != null) {
            new Object[1][c] = tjk;
            dwq.m9650G().mo9376a(tjk, 2);
        }
        mo9514a(cdgp.f180782a.mo6606a().mo77588h(), dqy.m9123a("PushAnalyticsDataToServer"));
    }
}
