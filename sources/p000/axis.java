package p000;

import android.accounts.Account;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.walletp2p.internal.zeroparty.Transaction;

/* renamed from: axis */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axis {
    /* renamed from: a */
    static RequestFuture m82653a(Account account, String str, int i, int i2) {
        bxvd da = bzwa.f171589d.mo74144da();
        bxvd da2 = btsi.f150214c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        btsi btsi = (btsi) da2.f164949b;
        str.getClass();
        btsi.f150216a |= 1;
        btsi.f150217b = str;
        btsi btsi2 = (btsi) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzwa bzwa = (bzwa) da.f164949b;
        btsi2.getClass();
        bzwa.f171592b = btsi2;
        int i3 = bzwa.f171591a | 1;
        bzwa.f171591a = i3;
        if (i2 != 1) {
            bzwa.f171593c = 2;
            bzwa.f171591a = i3 | 2;
        } else {
            bzwa.f171593c = 1;
            bzwa.f171591a = i3 | 2;
        }
        return axmo.m82727a("b/fundstransfer/getPurchaseRecord", account, da.mo74062i(), bzwb.f171594g, i);
    }

    /* renamed from: a */
    static Transaction m82654a(bzwb bzwb) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i2;
        int i3;
        boolean z10;
        bzwb bzwb2 = bzwb;
        bltf bltf = bzwb2.f171598c;
        if (bltf == null) {
            bltf = bltf.f127682j;
        }
        if ((bltf.f127684a & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        if ((bltf.f127684a & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34970a(z2);
        blto blto = bltf.f127687d;
        if (blto == null) {
            blto = blto.f127722c;
        }
        if ((blto.f127724a & 1) == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        sdo.m34970a(z3);
        if ((bltf.f127684a & 4) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        sdo.m34970a(z4);
        bltl bltl = bltf.f127686c;
        if (bltl == null) {
            bltl = bltl.f127716d;
        }
        if ((bltl.f127718a & 1) == 0) {
            z5 = false;
        } else {
            z5 = true;
        }
        sdo.m34970a(z5);
        bltl bltl2 = bltf.f127686c;
        if (bltl2 == null) {
            bltl2 = bltl.f127716d;
        }
        if ((bltl2.f127718a & 2) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        sdo.m34970a(z6);
        if ((bltf.f127684a & 16) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        sdo.m34970a(z7);
        bltj bltj = bltf.f127688e;
        if (bltj == null) {
            bltj = bltj.f127708c;
        }
        if ((bltj.f127710a & 1) == 0) {
            z8 = false;
        } else {
            z8 = true;
        }
        sdo.m34970a(z8);
        bltj bltj2 = bltf.f127688e;
        if (bltj2 == null) {
            bltj2 = bltj.f127708c;
        }
        bltk bltk = bltj2.f127711b;
        if (bltk == null) {
            bltk = bltk.f127712c;
        }
        if ((bltk.f127714a & 1) == 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        sdo.m34970a(z9);
        blto blto2 = bltf.f127687d;
        if (blto2 == null) {
            blto2 = blto.f127722c;
        }
        int a = bltn.m107558a(blto2.f127725b);
        if (a == 0) {
            a = 1;
        }
        int i4 = a - 1;
        if (i4 != 0) {
            i = i4 != 3 ? i4 != 11 ? i4 != 5 ? i4 != 6 ? 0 : 1 : 3 : 5 : 4;
        } else {
            i = 2;
        }
        bltr bltr = bltf.f127685b;
        if (bltr == null) {
            bltr = bltr.f127727b;
        }
        int a2 = bltq.m107561a(bltr.f127729a);
        if (a2 == 0) {
            a2 = 1;
        }
        int i5 = a2 - 1;
        if (i5 == 2) {
            blte blte = bltf.f127690g;
            if (blte == null) {
                blte = blte.f127676d;
            }
            blth blth = blte.f127678a;
            if (blth == null) {
                blth = blth.f127697d;
            }
            String str6 = blth.f127700b;
            blte blte2 = bltf.f127690g;
            if (blte2 == null) {
                blte2 = blte.f127676d;
            }
            blth blth2 = blte2.f127678a;
            if (blth2 == null) {
                blth2 = blth.f127697d;
            }
            String str7 = blth2.f127699a;
            blte blte3 = bltf.f127690g;
            if (blte3 == null) {
                blte3 = blte.f127676d;
            }
            blth blth3 = blte3.f127678a;
            if (blth3 == null) {
                blth3 = blth.f127697d;
            }
            String str8 = blth3.f127701c;
            blte blte4 = bltf.f127690g;
            if (blte4 == null) {
                blte4 = blte.f127676d;
            }
            i2 = i;
            str4 = str6;
            str5 = str7;
            str2 = str8;
            str3 = blte4.f127679b;
            str = "";
            i3 = 1;
        } else if (i5 == 3) {
            blte blte5 = bltf.f127690g;
            if (blte5 == null) {
                blte5 = blte.f127676d;
            }
            blth blth4 = blte5.f127678a;
            if (blth4 == null) {
                blth4 = blth.f127697d;
            }
            String str9 = blth4.f127700b;
            blte blte6 = bltf.f127690g;
            if (blte6 == null) {
                blte6 = blte.f127676d;
            }
            blth blth5 = blte6.f127678a;
            if (blth5 == null) {
                blth5 = blth.f127697d;
            }
            String str10 = blth5.f127699a;
            blte blte7 = bltf.f127690g;
            if (blte7 == null) {
                blte7 = blte.f127676d;
            }
            blth blth6 = blte7.f127678a;
            if (blth6 == null) {
                blth6 = blth.f127697d;
            }
            String str11 = blth6.f127701c;
            blte blte8 = bltf.f127690g;
            if (blte8 == null) {
                blte8 = blte.f127676d;
            }
            String str12 = blte8.f127679b;
            if (i != 2) {
                i2 = i;
                str4 = str9;
                str5 = str10;
                str2 = str11;
                str3 = str12;
                str = "";
                i3 = 2;
            } else {
                blte blte9 = bltf.f127690g;
                if (blte9 == null) {
                    blte9 = blte.f127676d;
                }
                if (!blte9.f127680c) {
                    str4 = str9;
                    str5 = str10;
                    str2 = str11;
                    str3 = str12;
                    str = "";
                    i3 = 2;
                    i2 = 1;
                } else {
                    i2 = i;
                    str4 = str9;
                    str5 = str10;
                    str2 = str11;
                    str3 = str12;
                    str = "";
                    i3 = 2;
                }
            }
        } else if (i5 == 5) {
            bltg bltg = bltf.f127691h;
            if (bltg == null) {
                bltg = bltg.f127693b;
            }
            blti blti = bltg.f127695a;
            if (blti == null) {
                blti = blti.f127703c;
            }
            String str13 = blti.f127706b;
            bltg bltg2 = bltf.f127691h;
            if (bltg2 == null) {
                bltg2 = bltg.f127693b;
            }
            blti blti2 = bltg2.f127695a;
            if (blti2 == null) {
                blti2 = blti.f127703c;
            }
            i2 = i;
            str2 = str13;
            str = blti2.f127705a;
            str5 = "";
            str4 = str5;
            str3 = str4;
            i3 = 5;
        } else if (i5 == 12) {
            bltd bltd = bltf.f127692i;
            if (bltd == null) {
                bltd = bltd.f127670d;
            }
            blth blth7 = bltd.f127673b;
            if (blth7 == null) {
                blth7 = blth.f127697d;
            }
            String str14 = blth7.f127700b;
            bltd bltd2 = bltf.f127692i;
            if (bltd2 == null) {
                bltd2 = bltd.f127670d;
            }
            blth blth8 = bltd2.f127673b;
            if (blth8 == null) {
                blth8 = blth.f127697d;
            }
            String str15 = blth8.f127699a;
            bltd bltd3 = bltf.f127692i;
            if (bltd3 == null) {
                bltd3 = bltd.f127670d;
            }
            blth blth9 = bltd3.f127673b;
            if (blth9 == null) {
                blth9 = blth.f127697d;
            }
            String str16 = blth9.f127701c;
            bltd bltd4 = bltf.f127692i;
            if (bltd4 == null) {
                bltd4 = bltd.f127670d;
            }
            i2 = i;
            str4 = str14;
            str5 = str15;
            str2 = str16;
            str3 = bltd4.f127674c;
            str = "";
            i3 = 3;
        } else if (i5 != 13) {
            i2 = i;
            str5 = "";
            str4 = str5;
            str3 = str4;
            str2 = str3;
            str = str2;
            i3 = 0;
        } else {
            bltd bltd5 = bltf.f127692i;
            if (bltd5 == null) {
                bltd5 = bltd.f127670d;
            }
            blth blth10 = bltd5.f127672a;
            if (blth10 == null) {
                blth10 = blth.f127697d;
            }
            String str17 = blth10.f127700b;
            bltd bltd6 = bltf.f127692i;
            if (bltd6 == null) {
                bltd6 = bltd.f127670d;
            }
            blth blth11 = bltd6.f127672a;
            if (blth11 == null) {
                blth11 = blth.f127697d;
            }
            String str18 = blth11.f127699a;
            bltd bltd7 = bltf.f127692i;
            if (bltd7 == null) {
                bltd7 = bltd.f127670d;
            }
            blth blth12 = bltd7.f127672a;
            if (blth12 == null) {
                blth12 = blth.f127697d;
            }
            String str19 = blth12.f127701c;
            bltd bltd8 = bltf.f127692i;
            if (bltd8 == null) {
                bltd8 = bltd.f127670d;
            }
            i2 = i;
            str4 = str17;
            str5 = str18;
            str2 = str19;
            str3 = bltd8.f127674c;
            str = "";
            i3 = 4;
        }
        String str20 = bltf.f127689f;
        bltl bltl3 = bltf.f127686c;
        if (bltl3 == null) {
            bltl3 = bltl.f127716d;
        }
        long j = bltl3.f127719b;
        bltl bltl4 = bltf.f127686c;
        if (bltl4 == null) {
            bltl4 = bltl.f127716d;
        }
        String str21 = bltl4.f127720c;
        bltj bltj3 = bltf.f127688e;
        if (bltj3 == null) {
            bltj3 = bltj.f127708c;
        }
        bltk bltk2 = bltj3.f127711b;
        if (bltk2 == null) {
            bltk2 = bltk.f127712c;
        }
        long j2 = bltk2.f127715b;
        String str22 = bzwb2.f171599d;
        String str23 = bzwb2.f171600e;
        String str24 = bzwb2.f171601f;
        if (i2 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new Transaction(i3, i2, str20, j, str21, j2, str5, str4, str3, str2, str22, str23, str24, z10, str);
    }
}
