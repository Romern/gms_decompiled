package p000;

import android.net.Uri;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.InAppCvmConfig;
import com.google.android.gms.tapandpay.firstparty.InStoreCvmConfig;
import com.google.android.gms.tapandpay.firstparty.OnlineAccountCardLinkInfo;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;

/* renamed from: atyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atyj {
    /* renamed from: a */
    public static int m76559a(btof btof) {
        btof btof2 = btof.NONE;
        switch (btof.ordinal()) {
            case 3:
                return 2;
            case 4:
                return 4;
            case 5:
                return 3;
            case 6:
            case 10:
            case 12:
            case 13:
            default:
                return 1;
            case 7:
                return 5;
            case 8:
                return 6;
            case 9:
                return 7;
            case 11:
                return 9;
            case 14:
                return 13;
            case 15:
                return 15;
            case 16:
                return 14;
        }
    }

    /* renamed from: a */
    public static boolean m76564a(CardInfo cardInfo) {
        TokenStatus tokenStatus = cardInfo.f108345f;
        return tokenStatus != null && tokenStatus.f108458a.f108457b == 9;
    }

    /* renamed from: b */
    public static int m76565b(int i) {
        btof btof = btof.NONE;
        switch (i - 2) {
            case 1:
                return 4;
            case 2:
                return 3;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 12;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            default:
                return 1000;
        }
    }

    /* renamed from: c */
    public static int m76566c(int i) {
        btof btof = btof.NONE;
        int i2 = i - 2;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                i3 = 3;
                if (i2 != 3) {
                    return 0;
                }
            }
        }
        return i3;
    }

    /* renamed from: d */
    public static int m76567d(int i) {
        btof btof = btof.NONE;
        return i + -2 != 1 ? 0 : 1;
    }

    /* renamed from: e */
    public static int m76568e(int i) {
        btof btof = btof.NONE;
        int i2 = i - 2;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                return 0;
            }
        }
        return i3;
    }

    /* renamed from: a */
    public static int m76560a(btpr btpr) {
        if (btpr == null) {
            return 1;
        }
        btof btof = btof.NONE;
        int b = btpq.m117019b(btpr.f149881a);
        if (b == 0) {
            b = 1;
        }
        int i = b - 2;
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 5;
        }
        if (i != 4) {
            return 1;
        }
        return 4;
    }

    /* renamed from: a */
    public static asmg m76561a(btjk btjk, boolean z, int i) {
        asoa asoa;
        asny asny;
        Uri uri;
        InStoreCvmConfig inStoreCvmConfig;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        btjk btjk2 = btjk;
        asoc asoc = new asoc();
        btjc btjc = btjk2.f149136n;
        if (btjc != null) {
            asoc.f89286a = btjc.f149082a;
            asoc.f89287b = btjc.f149085d;
            asoc.f89288c = btjc.f149087f;
            btjc btjc2 = btjk2.f149136n;
            if (btjc2 == null) {
                btjc2 = btjc.f149080s;
            }
            asoc.f89289d = btjc2.f149089h;
            btjc btjc3 = btjk2.f149136n;
            if (btjc3 == null) {
                btjc3 = btjc.f149080s;
            }
            asoc.f89290e = btjc3.f149088g;
            btjc btjc4 = btjk2.f149136n;
            if (btjc4 == null) {
                btjc4 = btjc.f149080s;
            }
            asoc.f89292g = btjc4.f149084c;
            btjc btjc5 = btjk2.f149136n;
            if (btjc5 == null) {
                btjc5 = btjc.f149080s;
            }
            asoc.f89293h = btjc5.f149083b;
            btjc btjc6 = btjk2.f149136n;
            if (btjc6 == null) {
                btjc6 = btjc.f149080s;
            }
            asoc.f89294i = btjc6.f149086e;
            btjc btjc7 = btjk2.f149136n;
            if (btjc7 == null) {
                btjc7 = btjc.f149080s;
            }
            asoc.f89297l = btjc7.f149091j;
            btjc btjc8 = btjk2.f149136n;
            if (btjc8 == null) {
                btjc8 = btjc.f149080s;
            }
            asoc.f89298m = btjc8.f149092k;
            btjc btjc9 = btjk2.f149136n;
            if (btjc9 == null) {
                btjc9 = btjc.f149080s;
            }
            asoc.f89299n = btjc9.f149093l;
            btjc btjc10 = btjk2.f149136n;
            if (btjc10 == null) {
                btjc10 = btjc.f149080s;
            }
            asoc.f89303r = btjc10.f149095n;
            btjc btjc11 = btjk2.f149136n;
            if (btjc11 == null) {
                btjc11 = btjc.f149080s;
            }
            asoc.f89304s = btjc11.f149096o;
            btjc btjc12 = btjk2.f149136n;
            if (btjc12 == null) {
                btjc12 = btjc.f149080s;
            }
            asoc.f89305t = btjc12.f149097p;
            btjc btjc13 = btjk2.f149136n;
            if (btjc13 == null) {
                btjc13 = btjc.f149080s;
            }
            asoc.f89306u = btjc13.f149098q;
            btjc btjc14 = btjk2.f149136n;
            if (btjc14 == null) {
                btjc14 = btjc.f149080s;
            }
            btjb a = btjb.m116830a(btjc14.f149099r);
            if (a == null) {
                a = btjb.UNRECOGNIZED;
            }
            asoc.f89307v = bepw.m95430a(btjb.class, a);
            btjc btjc15 = btjk2.f149136n;
            if (btjc15 == null) {
                btjc15 = btjc.f149080s;
            }
            if (btjc15.f149090i != null) {
                btjc btjc16 = btjk2.f149136n;
                if (btjc16 == null) {
                    btjc16 = btjc.f149080s;
                }
                btix btix = btjc16.f149090i;
                if (btix == null) {
                    btix = btix.f149049d;
                }
                asoc.f89291f = btix.f149051a;
                btjc btjc17 = btjk2.f149136n;
                if (btjc17 == null) {
                    btjc17 = btjc.f149080s;
                }
                btix btix2 = btjc17.f149090i;
                if (btix2 == null) {
                    btix2 = btix.f149049d;
                }
                asoc.f89295j = btix2.f149052b;
                btjc btjc18 = btjk2.f149136n;
                if (btjc18 == null) {
                    btjc18 = btjc.f149080s;
                }
                btix btix3 = btjc18.f149090i;
                if (btix3 == null) {
                    btix3 = btix.f149049d;
                }
                asoc.f89296k = btix3.f149053c;
            }
            btjc btjc19 = btjk2.f149136n;
            if (btjc19 == null) {
                btjc19 = btjc.f149080s;
            }
            if (btjc19.f149094m != null) {
                btjc btjc20 = btjk2.f149136n;
                if (btjc20 == null) {
                    btjc20 = btjc.f149080s;
                }
                btix btix4 = btjc20.f149094m;
                if (btix4 == null) {
                    btix4 = btix.f149049d;
                }
                asoc.f89300o = btix4.f149051a;
                btjc btjc21 = btjk2.f149136n;
                if (btjc21 == null) {
                    btjc21 = btjc.f149080s;
                }
                btix btix5 = btjc21.f149094m;
                if (btix5 == null) {
                    btix5 = btix.f149049d;
                }
                asoc.f89301p = btix5.f149052b;
                btjc btjc22 = btjk2.f149136n;
                if (btjc22 == null) {
                    btjc22 = btjc.f149080s;
                }
                btix btix6 = btjc22.f149094m;
                if (btix6 == null) {
                    btix6 = btix.f149049d;
                }
                asoc.f89302q = btix6.f149053c;
            }
        }
        aspd aspd = new aspd();
        btjp btjp = btjk2.f149139q;
        int i7 = 5;
        int i8 = 3;
        int i9 = 1;
        if (btjp != null) {
            int i10 = btjp.f149158a;
            int i11 = 4;
            if (i10 != 0) {
                i2 = i10 != 1 ? i10 != 2 ? i10 != 3 ? 0 : 5 : 4 : 3;
            } else {
                i2 = 2;
            }
            if (i2 == 0) {
                i2 = 1;
            }
            btof btof = btof.NONE;
            int i12 = i2 - 2;
            if (i12 != 1) {
                i3 = i12 != 2 ? i12 != 3 ? 1 : 4 : 3;
            } else {
                i3 = 2;
            }
            aspd.f89340a = i3;
            aspd.f89341b = btjp.f149159b;
            int i13 = btjp.f149161d;
            if (i13 != 0) {
                i4 = i13 != 1 ? i13 != 2 ? i13 != 3 ? 0 : 5 : 4 : 3;
            } else {
                i4 = 2;
            }
            if (i4 == 0) {
                i4 = 1;
            }
            int i14 = i4 - 2;
            if (i14 != 2) {
                i5 = i14 != 3 ? 1 : 3;
            } else {
                i5 = 2;
            }
            aspd.f89342c = i5;
            btjp btjp2 = btjk2.f149139q;
            if (btjp2 == null) {
                btjp2 = btjp.f149156e;
            }
            int i15 = btjp2.f149160c;
            if (i15 != 0) {
                i6 = i15 != 1 ? i15 != 2 ? i15 != 3 ? 0 : 5 : 4 : 3;
            } else {
                i6 = 2;
            }
            if (i6 == 0) {
                i6 = 1;
            }
            int i16 = i6 - 2;
            if (i16 == 1) {
                i11 = 2;
            } else if (i16 == 2) {
                i11 = 3;
            } else if (i16 != 3) {
                i11 = 1;
            }
            aspd.f89343d = i11;
        }
        InAppCvmConfig inAppCvmConfig = null;
        if (btjk2.f149143u != null) {
            asoa = new asoa();
            btja btja = btjk2.f149143u;
            if (btja == null) {
                btja = btja.f149062e;
            }
            asoa.f89282a = btja.f149064a;
            btja btja2 = btjk2.f149143u;
            if (btja2 == null) {
                btja2 = btja.f149062e;
            }
            asoa.f89283b = btja2.f149065b;
            btja btja3 = btjk2.f149143u;
            if (btja3 == null) {
                btja3 = btja.f149062e;
            }
            asoa.f89284c = btja3.f149066c;
            btja btja4 = btjk2.f149143u;
            if (btja4 == null) {
                btja4 = btja.f149062e;
            }
            asoa.f89285d = btja4.f149067d;
        } else {
            asoa = null;
        }
        if (btjk2.f149144v != null) {
            asny = new asny();
            btiz btiz = btjk2.f149144v;
            if (btiz == null) {
                btiz = btiz.f149058c;
            }
            asny.f89280a = btiz.f149060a;
            btiz btiz2 = btjk2.f149144v;
            if (btiz2 == null) {
                btiz2 = btiz.f149058c;
            }
            asny.f89281b = btiz2.f149061b;
        } else {
            asny = null;
        }
        OnlineAccountCardLinkInfo[] onlineAccountCardLinkInfoArr = new OnlineAccountCardLinkInfo[btjk2.f149146x.size()];
        for (int i17 = 0; i17 < btjk2.f149146x.size(); i17++) {
            asog asog = new asog();
            int a2 = btji.m116838a(((btjj) btjk2.f149146x.get(i17)).f149117a);
            if (a2 == 0) {
                a2 = 1;
            }
            asog.f89308a = m76567d(a2);
            int a3 = btjh.m116837a(((btjj) btjk2.f149146x.get(i17)).f149118b);
            if (a3 == 0) {
                a3 = 1;
            }
            asog.f89309b = m76568e(a3);
            onlineAccountCardLinkInfoArr[i17] = asog.mo49284a();
        }
        asmg asmg = new asmg();
        btiy btiy = btjk2.f149123a;
        if (btiy == null) {
            btiy = btiy.f149054c;
        }
        asmg.f89223a = btiy.f149056a;
        btiy btiy2 = btjk2.f149123a;
        if (btiy2 == null) {
            btiy2 = btiy.f149054c;
        }
        asmg.f89224b = btiy2.f149057b.mo73780k();
        asmg.f89225c = btjk2.f149130h;
        asmg.f89226d = btjk2.f149129g;
        int a4 = btjl.m116841a(btjk2.f149127e);
        if (a4 == 0) {
            a4 = 1;
        }
        asmg.f89227e = m76565b(a4);
        asoz asoz = new asoz();
        asox asox = new asox();
        btof a5 = btof.m116979a(btjk2.f149135m);
        if (a5 == null) {
            a5 = btof.UNRECOGNIZED;
        }
        asox.f89330b = m76559a(a5);
        asoz.f89331a = asox.mo49311a();
        asoz.f89333c = z;
        asoz.f89332b = i;
        asmg.f89228f = asoz.mo49314a();
        asmg.f89229g = btjk2.f149128f;
        if (!bmxx.m108577a(btjk2.f149131i)) {
            uri = Uri.parse(btjk2.f149131i);
        } else {
            uri = null;
        }
        asmg.f89230h = uri;
        asmg.f89231i = C1165lm.m19355b(btjk2.f149132j, 255);
        asmg.f89232j = C1165lm.m19355b(btjk2.f149133k, 255);
        asmg.f89233k = asoc.mo49277a();
        asmg.f89234l = btjk2.f149137o;
        asmg.f89235m = aspd.mo49320a();
        asmg.f89236n = btjk2.f149140r;
        btjo btjo = btjk2.f149141s;
        if (btjo != null && (i7 = btjn.m116843a(btjo.f149155a)) == 0) {
            i7 = 1;
        }
        int i18 = i7 - 2;
        if (i7 != 0) {
            if (i18 == 1) {
                i8 = 2;
            } else if (i18 != 2) {
                i8 = 1;
            }
            asmg.f89238p = i8;
            asmg.f89237o = btjk2.f149142t.mo73780k();
            int a6 = btog.m116982a(btjk2.f149145w);
            if (a6 != 0) {
                i9 = a6;
            }
            asmg.f89239q = m76566c(i9);
            if (asoa != null) {
                inStoreCvmConfig = asoa.mo49274a();
            } else {
                inStoreCvmConfig = null;
            }
            asmg.f89240r = inStoreCvmConfig;
            if (asny != null) {
                inAppCvmConfig = new InAppCvmConfig(asny.f89280a, asny.f89281b);
            }
            asmg.f89241s = inAppCvmConfig;
            asmg.f89242t = btjk2.f149138p;
            asmg.f89243u = onlineAccountCardLinkInfoArr;
            asmg.f89244v = btjk2.f149148z;
            asmg.f89245w = btjk2.f149125c;
            asmg.f89247y = btjk2.f149121A;
            asmg.f89248z = btjk2.f149124b;
            bztk bztk = btjk2.f149126d;
            if (bztk == null) {
                bztk = bztk.f171338c;
            }
            asmg.f89220A = bztk.f171340a;
            bztk bztk2 = btjk2.f149126d;
            if (bztk2 == null) {
                bztk2 = bztk.f171338c;
            }
            asmg.f89221B = bztk2.f171341b;
            return asmg;
        }
        throw null;
    }

    /* renamed from: a */
    public static btof m76562a(int i) {
        switch (i) {
            case 1:
                return btof.APTEST_TSP;
            case 2:
                return btof.AMEX_TSP;
            case 3:
                return btof.MASTERCARD_TSP;
            case 4:
                return btof.VISA_TSP;
            case 5:
                return btof.DISCOVER_TSP;
            case 6:
                return btof.EFTPOS_TSP;
            case 7:
                return btof.INTERAC_TSP;
            case 8:
                return btof.OBERTHUR_TSP;
            case 9:
                return btof.PAYPAL_TSP;
            case 10:
            case 11:
            case 12:
            default:
                StringBuilder sb = new StringBuilder(34);
                sb.append("Unknown token provider ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            case 13:
                return btof.JCB_TSP;
            case 14:
                return btof.ELO_TSP;
            case 15:
                return btof.GEMALTO_TSP;
        }
    }

    /* renamed from: a */
    public static boolean m76563a(btjk btjk, btjk btjk2) {
        bxvd bxvd = (bxvd) btjk.mo74142c(5);
        bxvd.mo73625a((bxvk) btjk);
        bxvd bxvd2 = (bxvd) btjk2.mo74142c(5);
        bxvd2.mo73625a((bxvk) btjk2);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        btjk btjk3 = btjk.f149119C;
        ((btjk) bxvd.f164949b).f149142t = btjk.f149119C.f149142t;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        ((btjk) bxvd2.f164949b).f149142t = btjk.f149119C.f149142t;
        return ((btjk) bxvd.mo74062i()).equals(bxvd2.mo74062i());
    }
}
