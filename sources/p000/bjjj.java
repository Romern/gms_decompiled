package p000;

import java.util.ArrayList;
import java.util.Locale;

/* renamed from: bjjj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjjj {
    /* renamed from: a */
    static bjjh m103654a(bwxl bwxl, bjjh bjjh, C1230nw nwVar, bjji bjji) {
        if (bwxl.f161390f == 236049775) {
            bjjh bjjh2 = (bjjh) nwVar.mo15534a(bwxl.f161386b);
            bmxy.m108582a(bjjh2, String.format(Locale.US, "The referenced node %s does not exist in current page.", Long.valueOf(bwxl.f161386b)));
            bjjh bjjh3 = bjjh2.f122823a;
            if (bjjh3 != null) {
                ArrayList arrayList = bjjh3.f122824b;
                if (arrayList != null) {
                    arrayList.remove(bjjh2);
                    bjjh2.f122823a = null;
                }
                bjjh3.mo65297b();
            }
            bjjh.mo65296a(bjjh2);
            bjjh.mo65297b();
            return bjjh2;
        }
        bjjh bjjh4 = new bjjh(bwxl);
        nwVar.mo15540b(bwxl.f161386b, bjjh4);
        if (bjjh != null) {
            bjjh.mo65296a(bjjh4);
        }
        bjjh4.mo65295a();
        for (bwxl bwxl2 : bjji.mo65298a(bwxl)) {
            m103654a(bwxl2, bjjh4, nwVar, bjji);
        }
        return bjjh4;
    }

    /* renamed from: a */
    static bwxl m103655a(bjjh bjjh, bjji bjji) {
        bwxl bwxl = bjjh.f122825c;
        if (!bjjh.f122826d || bjjh.f122824b == null) {
            return bwxl;
        }
        C1230nw nwVar = new C1230nw();
        ArrayList arrayList = bjjh.f122824b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bwxl a = m103655a((bjjh) arrayList.get(i), bjji);
            nwVar.mo15540b(a.f161386b, a);
        }
        bwxl bwxl2 = bjjh.f122825c;
        switch (bwxl2.f161390f) {
            case 62160224:
                bxvd bxvd = (bxvd) bwxl2.mo74142c(5);
                bxvd.mo73625a((bxvk) bwxl2);
                bxvf bxvf = (bxvf) bxvd;
                bxvj bxvj = bxai.f161690e;
                bwxl2.mo74135a(bxvj);
                Object b = bwxl2.f164952m.mo73913b(bxvj.f164958d);
                if (b == null) {
                    b = bxvj.f164956b;
                } else {
                    bxvj.mo74139a(b);
                }
                bxai bxai = (bxai) b;
                bxvd bxvd2 = (bxvd) bxai.mo74142c(5);
                bxvd2.mo73625a((bxvk) bxai);
                int size2 = ((bxai) bxvd2.f164949b).f161692a.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    bwxl bwxl3 = (bwxl) nwVar.mo15534a(((bwxl) ((bxai) bxvd2.f164949b).f161692a.get(i2)).f161386b);
                    if (bwxl3 != null) {
                        if (bxvd2.f164950c) {
                            bxvd2.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        bxai bxai2 = (bxai) bxvd2.f164949b;
                        bwxl3.getClass();
                        if (!bxai2.f161692a.mo73666a()) {
                            bxai2.f161692a = bxvk.m124021a(bxai2.f161692a);
                        }
                        bxai2.f161692a.set(i2, bwxl3);
                    }
                }
                int size3 = ((bxai) bxvd2.f164949b).f161693b.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    bwxl bwxl4 = (bwxl) nwVar.mo15534a(((bwxl) ((bxai) bxvd2.f164949b).f161693b.get(i3)).f161386b);
                    if (bwxl4 != null) {
                        if (bxvd2.f164950c) {
                            bxvd2.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        bxai bxai3 = (bxai) bxvd2.f164949b;
                        bwxl4.getClass();
                        if (!bxai3.f161693b.mo73666a()) {
                            bxai3.f161693b = bxvk.m124021a(bxai3.f161693b);
                        }
                        bxai3.f161693b.set(i3, bwxl4);
                    }
                }
                bxvf.mo74125a(bxai.f161690e, (bxai) bxvd2.mo74062i());
                return (bwxl) bxvf.mo74062i();
            case 62783159:
                bxvd bxvd3 = (bxvd) bwxl2.mo74142c(5);
                bxvd3.mo73625a((bxvk) bwxl2);
                bxvf bxvf2 = (bxvf) bxvd3;
                bxvj bxvj2 = bxaf.f161682e;
                bwxl2.mo74135a(bxvj2);
                Object b2 = bwxl2.f164952m.mo73913b(bxvj2.f164958d);
                if (b2 == null) {
                    b2 = bxvj2.f164956b;
                } else {
                    bxvj2.mo74139a(b2);
                }
                bxaf bxaf = (bxaf) b2;
                bxvd bxvd4 = (bxvd) bxaf.mo74142c(5);
                bxvd4.mo73625a((bxvk) bxaf);
                bxaf bxaf2 = (bxaf) bxvd4.f164949b;
                if ((bxaf2.f161684a & 2) != 0) {
                    bwxl bwxl5 = bxaf2.f161686c;
                    if (bwxl5 == null) {
                        bwxl5 = bwxl.f161383i;
                    }
                    bwxl bwxl6 = (bwxl) nwVar.mo15534a(bwxl5.f161386b);
                    if (bwxl6 != null) {
                        if (bxvd4.f164950c) {
                            bxvd4.mo74035c();
                            bxvd4.f164950c = false;
                        }
                        bxaf bxaf3 = (bxaf) bxvd4.f164949b;
                        bwxl6.getClass();
                        bxaf3.f161686c = bwxl6;
                        bxaf3.f161684a |= 2;
                    }
                }
                bxaf bxaf4 = (bxaf) bxvd4.f164949b;
                if ((bxaf4.f161684a & 1) != 0) {
                    bwxl bwxl7 = bxaf4.f161685b;
                    if (bwxl7 == null) {
                        bwxl7 = bwxl.f161383i;
                    }
                    bwxl bwxl8 = (bwxl) nwVar.mo15534a(bwxl7.f161386b);
                    if (bwxl8 != null) {
                        if (bxvd4.f164950c) {
                            bxvd4.mo74035c();
                            bxvd4.f164950c = false;
                        }
                        bxaf bxaf5 = (bxaf) bxvd4.f164949b;
                        bwxl8.getClass();
                        bxaf5.f161685b = bwxl8;
                        bxaf5.f161684a |= 1;
                    }
                }
                bxvf2.mo74125a(bxaf.f161682e, (bxaf) bxvd4.mo74062i());
                return (bwxl) bxvf2.mo74062i();
            case 214299793:
                bxvd bxvd5 = (bxvd) bwxl2.mo74142c(5);
                bxvd5.mo73625a((bxvk) bwxl2);
                bxvf bxvf3 = (bxvf) bxvd5;
                bxvj bxvj3 = bwsv.f160917e;
                bwxl2.mo74135a(bxvj3);
                Object b3 = bwxl2.f164952m.mo73913b(bxvj3.f164958d);
                if (b3 == null) {
                    b3 = bxvj3.f164956b;
                } else {
                    bxvj3.mo74139a(b3);
                }
                bwsv bwsv = (bwsv) b3;
                bxvd bxvd6 = (bxvd) bwsv.mo74142c(5);
                bxvd6.mo73625a((bxvk) bwsv);
                bwss bwss = (bwss) bxvd6;
                int size4 = ((bwsv) bwss.f164949b).f160920b.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    bwxl bwxl9 = (bwxl) nwVar.mo15534a(((bwxl) ((bwsv) bwss.f164949b).f160920b.get(i4)).f161386b);
                    if (bwxl9 != null) {
                        if (bwss.f164950c) {
                            bwss.mo74035c();
                            bwss.f164950c = false;
                        }
                        bwsv bwsv2 = (bwsv) bwss.f164949b;
                        bwxl9.getClass();
                        bwsv2.mo73532a();
                        bwsv2.f160920b.set(i4, bwxl9);
                    }
                }
                bxvf3.mo74125a(bwsv.f160917e, (bwsv) bwss.mo74062i());
                return (bwxl) bxvf3.mo74062i();
            case 228971051:
                bxvd bxvd7 = (bxvd) bwxl2.mo74142c(5);
                bxvd7.mo73625a((bxvk) bwxl2);
                bxvf bxvf4 = (bxvf) bxvd7;
                bxvj bxvj4 = bwnr.f160385e;
                bwxl2.mo74135a(bxvj4);
                Object b4 = bwxl2.f164952m.mo73913b(bxvj4.f164958d);
                if (b4 == null) {
                    b4 = bxvj4.f164956b;
                } else {
                    bxvj4.mo74139a(b4);
                }
                bwnr bwnr = (bwnr) b4;
                bxvd bxvd8 = (bxvd) bwnr.mo74142c(5);
                bxvd8.mo73625a((bxvk) bwnr);
                bwxl bwxl10 = ((bwnr) bxvd8.f164949b).f160389c;
                if (bwxl10 == null) {
                    bwxl10 = bwxl.f161383i;
                }
                bwxl bwxl11 = (bwxl) nwVar.mo15534a(bwxl10.f161386b);
                if (bwxl11 != null) {
                    if (bxvd8.f164950c) {
                        bxvd8.mo74035c();
                        bxvd8.f164950c = false;
                    }
                    bwnr bwnr2 = (bwnr) bxvd8.f164949b;
                    bwxl11.getClass();
                    bwnr2.f160389c = bwxl11;
                    bwnr2.f160387a |= 2;
                }
                bwxl bwxl12 = ((bwnr) bxvd8.f164949b).f160388b;
                if (bwxl12 == null) {
                    bwxl12 = bwxl.f161383i;
                }
                bwxl bwxl13 = (bwxl) nwVar.mo15534a(bwxl12.f161386b);
                if (bwxl13 != null) {
                    if (bxvd8.f164950c) {
                        bxvd8.mo74035c();
                        bxvd8.f164950c = false;
                    }
                    bwnr bwnr3 = (bwnr) bxvd8.f164949b;
                    bwxl13.getClass();
                    bwnr3.f160388b = bwxl13;
                    bwnr3.f160387a |= 1;
                }
                bxvf4.mo74125a(bwnr.f160385e, (bwnr) bxvd8.mo74062i());
                return (bwxl) bxvf4.mo74062i();
            case 228982939:
                bxvd bxvd9 = (bxvd) bwxl2.mo74142c(5);
                bxvd9.mo73625a((bxvk) bwxl2);
                bxvf bxvf5 = (bxvf) bxvd9;
                bxvj bxvj5 = bxaj.f161698e;
                bwxl2.mo74135a(bxvj5);
                Object b5 = bwxl2.f164952m.mo73913b(bxvj5.f164958d);
                if (b5 == null) {
                    b5 = bxvj5.f164956b;
                } else {
                    bxvj5.mo74139a(b5);
                }
                bxaj bxaj = (bxaj) b5;
                bxvd bxvd10 = (bxvd) bxaj.mo74142c(5);
                bxvd10.mo73625a((bxvk) bxaj);
                int size5 = ((bxaj) bxvd10.f164949b).f161700a.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    bwxl bwxl14 = (bwxl) nwVar.mo15534a(((bwxl) ((bxaj) bxvd10.f164949b).f161700a.get(i5)).f161386b);
                    if (bwxl14 != null) {
                        if (bxvd10.f164950c) {
                            bxvd10.mo74035c();
                            bxvd10.f164950c = false;
                        }
                        bxaj bxaj2 = (bxaj) bxvd10.f164949b;
                        bwxl14.getClass();
                        if (!bxaj2.f161700a.mo73666a()) {
                            bxaj2.f161700a = bxvk.m124021a(bxaj2.f161700a);
                        }
                        bxaj2.f161700a.set(i5, bwxl14);
                    }
                }
                bxvf5.mo74125a(bxaj.f161698e, (bxaj) bxvd10.mo74062i());
                return (bwxl) bxvf5.mo74062i();
            case 228982941:
                int i6 = bjrk.f123180s;
                bxvd bxvd11 = (bxvd) bwxl2.mo74142c(5);
                bxvd11.mo73625a((bxvk) bwxl2);
                bxvf bxvf6 = (bxvf) bxvd11;
                bxvj bxvj6 = bxan.f161724d;
                bwxl2.mo74135a(bxvj6);
                Object b6 = bwxl2.f164952m.mo73913b(bxvj6.f164958d);
                if (b6 == null) {
                    b6 = bxvj6.f164956b;
                } else {
                    bxvj6.mo74139a(b6);
                }
                bxan bxan = (bxan) b6;
                bxvd bxvd12 = (bxvd) bxan.mo74142c(5);
                bxvd12.mo73625a((bxvk) bxan);
                bxan bxan2 = (bxan) bxvd12.f164949b;
                if ((bxan2.f161726a & 1) != 0) {
                    bwxl bwxl15 = bxan2.f161727b;
                    if (bwxl15 == null) {
                        bwxl15 = bwxl.f161383i;
                    }
                    bwxl bwxl16 = (bwxl) nwVar.mo15534a(bwxl15.f161386b);
                    if (bwxl16 != null) {
                        if (bxvd12.f164950c) {
                            bxvd12.mo74035c();
                            bxvd12.f164950c = false;
                        }
                        bxan bxan3 = (bxan) bxvd12.f164949b;
                        bwxl16.getClass();
                        bxan3.f161727b = bwxl16;
                        bxan3.f161726a |= 1;
                    }
                }
                bxvf6.mo74125a(bxan.f161724d, (bxan) bxvd12.mo74062i());
                return (bwxl) bxvf6.mo74062i();
            case 229613734:
                bxvd bxvd13 = (bxvd) bwxl2.mo74142c(5);
                bxvd13.mo73625a((bxvk) bwxl2);
                bxvf bxvf7 = (bxvf) bxvd13;
                bxvj bxvj7 = bwzo.f161628d;
                bwxl2.mo74135a(bxvj7);
                Object b7 = bwxl2.f164952m.mo73913b(bxvj7.f164958d);
                if (b7 == null) {
                    b7 = bxvj7.f164956b;
                } else {
                    bxvj7.mo74139a(b7);
                }
                bwzo bwzo = (bwzo) b7;
                bxvd bxvd14 = (bxvd) bwzo.mo74142c(5);
                bxvd14.mo73625a((bxvk) bwzo);
                bwzo bwzo2 = (bwzo) bxvd14.f164949b;
                if ((bwzo2.f161630a & 1) != 0) {
                    bwxl bwxl17 = bwzo2.f161631b;
                    if (bwxl17 == null) {
                        bwxl17 = bwxl.f161383i;
                    }
                    bwxl bwxl18 = (bwxl) nwVar.mo15534a(bwxl17.f161386b);
                    if (bwxl18 != null) {
                        if (bxvd14.f164950c) {
                            bxvd14.mo74035c();
                            bxvd14.f164950c = false;
                        }
                        bwzo bwzo3 = (bwzo) bxvd14.f164949b;
                        bwxl18.getClass();
                        bwzo3.f161631b = bwxl18;
                        bwzo3.f161630a |= 1;
                    }
                }
                bxvf7.mo74125a(bwzo.f161628d, (bwzo) bxvd14.mo74062i());
                return (bwxl) bxvf7.mo74062i();
            case 231420908:
                bxvd bxvd15 = (bxvd) bwxl2.mo74142c(5);
                bxvd15.mo73625a((bxvk) bwxl2);
                bxvf bxvf8 = (bxvf) bxvd15;
                bxvj bxvj8 = bwyt.f161522d;
                bwxl2.mo74135a(bxvj8);
                Object b8 = bwxl2.f164952m.mo73913b(bxvj8.f164958d);
                if (b8 == null) {
                    b8 = bxvj8.f164956b;
                } else {
                    bxvj8.mo74139a(b8);
                }
                bwyt bwyt = (bwyt) b8;
                bxvd bxvd16 = (bxvd) bwyt.mo74142c(5);
                bxvd16.mo73625a((bxvk) bwyt);
                int size6 = ((bwyt) bxvd16.f164949b).f161525b.size();
                for (int i7 = 0; i7 < size6; i7++) {
                    bwxl bwxl19 = (bwxl) nwVar.mo15534a(((bwxl) ((bwyt) bxvd16.f164949b).f161525b.get(i7)).f161386b);
                    if (bwxl19 != null) {
                        if (bxvd16.f164950c) {
                            bxvd16.mo74035c();
                            bxvd16.f164950c = false;
                        }
                        bwyt bwyt2 = (bwyt) bxvd16.f164949b;
                        bwxl19.getClass();
                        if (!bwyt2.f161525b.mo73666a()) {
                            bwyt2.f161525b = bxvk.m124021a(bwyt2.f161525b);
                        }
                        bwyt2.f161525b.set(i7, bwxl19);
                    }
                }
                bxvf8.mo74125a(bwyt.f161522d, (bwyt) bxvd16.mo74062i());
                return (bwxl) bxvf8.mo74062i();
            case 251682194:
                bxvd bxvd17 = (bxvd) bwxl2.mo74142c(5);
                bxvd17.mo73625a((bxvk) bwxl2);
                bxvf bxvf9 = (bxvf) bxvd17;
                bxvj bxvj9 = bxam.f161719c;
                bwxl2.mo74135a(bxvj9);
                Object b9 = bwxl2.f164952m.mo73913b(bxvj9.f164958d);
                if (b9 == null) {
                    b9 = bxvj9.f164956b;
                } else {
                    bxvj9.mo74139a(b9);
                }
                bxam bxam = (bxam) b9;
                bxvd bxvd18 = (bxvd) bxam.mo74142c(5);
                bxvd18.mo73625a((bxvk) bxam);
                int size7 = ((bxam) bxvd18.f164949b).f161721a.size();
                for (int i8 = 0; i8 < size7; i8++) {
                    bwxl bwxl20 = (bwxl) nwVar.mo15534a(((bwxl) ((bxam) bxvd18.f164949b).f161721a.get(i8)).f161386b);
                    if (bwxl20 != null) {
                        if (bxvd18.f164950c) {
                            bxvd18.mo74035c();
                            bxvd18.f164950c = false;
                        }
                        bxam bxam2 = (bxam) bxvd18.f164949b;
                        bwxl20.getClass();
                        if (!bxam2.f161721a.mo73666a()) {
                            bxam2.f161721a = bxvk.m124021a(bxam2.f161721a);
                        }
                        bxam2.f161721a.set(i8, bwxl20);
                    }
                }
                bxvf9.mo74125a(bxam.f161719c, (bxam) bxvd18.mo74062i());
                return (bwxl) bxvf9.mo74062i();
            case 261261518:
                bxvd bxvd19 = (bxvd) bwxl2.mo74142c(5);
                bxvd19.mo73625a((bxvk) bwxl2);
                bxvf bxvf10 = (bxvf) bxvd19;
                bxvj bxvj10 = bwwq.f161282c;
                bwxl2.mo74135a(bxvj10);
                Object b10 = bwxl2.f164952m.mo73913b(bxvj10.f164958d);
                if (b10 == null) {
                    b10 = bxvj10.f164956b;
                } else {
                    bxvj10.mo74139a(b10);
                }
                bwwq bwwq = (bwwq) b10;
                bxvd bxvd20 = (bxvd) bwwq.mo74142c(5);
                bxvd20.mo73625a((bxvk) bwwq);
                int size8 = ((bwwq) bxvd20.f164949b).f161284a.size();
                for (int i9 = 0; i9 < size8; i9++) {
                    bwxl bwxl21 = (bwxl) nwVar.mo15534a(((bwxl) ((bwwq) bxvd20.f164949b).f161284a.get(i9)).f161386b);
                    if (bwxl21 != null) {
                        if (bxvd20.f164950c) {
                            bxvd20.mo74035c();
                            bxvd20.f164950c = false;
                        }
                        bwwq bwwq2 = (bwwq) bxvd20.f164949b;
                        bwxl21.getClass();
                        if (!bwwq2.f161284a.mo73666a()) {
                            bwwq2.f161284a = bxvk.m124021a(bwwq2.f161284a);
                        }
                        bwwq2.f161284a.set(i9, bwxl21);
                    }
                }
                bxvf10.mo74125a(bwwq.f161282c, (bwwq) bxvd20.mo74062i());
                return (bwxl) bxvf10.mo74062i();
            case 264434503:
                bxvd bxvd21 = (bxvd) bwxl2.mo74142c(5);
                bxvd21.mo73625a((bxvk) bwxl2);
                bxvf bxvf11 = (bxvf) bxvd21;
                bxvj bxvj11 = bwpe.f160527d;
                bwxl2.mo74135a(bxvj11);
                Object b11 = bwxl2.f164952m.mo73913b(bxvj11.f164958d);
                if (b11 == null) {
                    b11 = bxvj11.f164956b;
                } else {
                    bxvj11.mo74139a(b11);
                }
                bwpe bwpe = (bwpe) b11;
                bxvd bxvd22 = (bxvd) bwpe.mo74142c(5);
                bxvd22.mo73625a((bxvk) bwpe);
                bwpe bwpe2 = (bwpe) bxvd22.f164949b;
                if ((bwpe2.f160529a & 1) != 0) {
                    bwxl bwxl22 = bwpe2.f160530b;
                    if (bwxl22 == null) {
                        bwxl22 = bwxl.f161383i;
                    }
                    bwxl bwxl23 = (bwxl) nwVar.mo15534a(bwxl22.f161386b);
                    if (bwxl23 != null) {
                        if (bxvd22.f164950c) {
                            bxvd22.mo74035c();
                            bxvd22.f164950c = false;
                        }
                        bwpe bwpe3 = (bwpe) bxvd22.f164949b;
                        bwxl23.getClass();
                        bwpe3.f160530b = bwxl23;
                        bwpe3.f160529a |= 1;
                    }
                }
                bxvf11.mo74125a(bwpe.f160527d, (bwpe) bxvd22.mo74062i());
                return (bwxl) bxvf11.mo74062i();
            default:
                return bwxl2;
        }
    }

    /* renamed from: a */
    public static bwxl m103656a(bwze bwze, bwxl bwxl, bjji bjji) {
        C1230nw nwVar = new C1230nw();
        bjjh a = m103654a(bwxl, null, nwVar, bjji);
        bxwc bxwc = bwze.f161581a;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bwxl bwxl2 = (bwxl) bxwc.get(i);
            bjjh bjjh = (bjjh) nwVar.mo15534a(bwxl2.f161386b);
            if (bjjh != null) {
                bjjh.f122825c = bwxl2;
                bjjh bjjh2 = bjjh.f122823a;
                if (bjjh2 != null) {
                    bjjh2.mo65297b();
                }
                bjjh.mo65295a();
                for (bwxl bwxl3 : bjji.mo65298a(bwxl2)) {
                    m103654a(bwxl3, bjjh, nwVar, bjji);
                }
            }
        }
        return m103655a(a, bjji);
    }
}
