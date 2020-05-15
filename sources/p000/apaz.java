package p000;

import android.text.TextUtils;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: apaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apaz {
    /* renamed from: a */
    private static int m69982a(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 3;
            }
        }
        return i2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: apaz.a(java.lang.String, boolean):bxvd
     arg types: [java.lang.String, int]
     candidates:
      apaz.a(bzcu, bzcx):bxvd
      apaz.a(java.lang.String, boolean):bxvd */
    /* renamed from: a */
    public static bxvd m69983a(bzcu bzcu, bzcx bzcx) {
        int i;
        int i2;
        int i3;
        bleq bleq;
        bzdq bzdq;
        bzcu bzcu2 = bzcu;
        bxvd da = btcr.f148306b.mo74144da();
        bzdh bzdh = bzcx.f169436f;
        if (bzdh == null) {
            bzdh = bzdh.f169466A;
        }
        String valueOf = String.valueOf(bzdh.f169490v);
        long j = bzcu2.f169411b;
        bxvd da2 = blds.f126121d.mo74144da();
        bxvd da3 = bldr.f126116d.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bldr bldr = (bldr) da3.f164949b;
        valueOf.getClass();
        int i4 = bldr.f126118a | 1;
        bldr.f126118a = i4;
        bldr.f126119b = valueOf;
        bldr.f126118a = i4 | 2;
        bldr.f126120c = j;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        blds blds = (blds) da2.f164949b;
        bldr bldr2 = (bldr) da3.mo74062i();
        bldr2.getClass();
        blds.f126124b = bldr2;
        blds.f126123a |= 1;
        bleq bleq2 = (bleq) bler.f126245D.mo74144da();
        bxwc bxwc = bzcu2.f169420k;
        int size = bxwc.size();
        int i5 = 0;
        while (i5 < size) {
            bzdq bzdq2 = (bzdq) bxwc.get(i5);
            long j2 = bzdq2.f169539b;
            String valueOf2 = String.valueOf(j2);
            String str = bzdq2.f169542e;
            String str2 = bzdq2.f169540c;
            String str3 = bzdq2.f169541d;
            boolean z = bzdq2.f169549l;
            int i6 = size;
            int i7 = i5;
            long j3 = bzdq2.f169545h;
            bxvd bxvd = da;
            bleq bleq3 = bleq2;
            long j4 = bzdq2.f169546i;
            bxvd da4 = blfa.f126316h.mo74144da();
            bxwc bxwc2 = bxwc;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            blfa blfa = (blfa) da4.f164949b;
            valueOf2.getClass();
            bzdq bzdq3 = bzdq2;
            int i8 = blfa.f126318a | 1;
            blfa.f126318a = i8;
            blfa.f126319b = valueOf2;
            int i9 = i8 | 2;
            blfa.f126318a = i9;
            blfa.f126320c = j2;
            str2.getClass();
            int i10 = i9 | 4;
            blfa.f126318a = i10;
            blfa.f126321d = str2;
            str3.getClass();
            blfa.f126318a = i10 | 8;
            blfa.f126322e = str3;
            bxvd da5 = bldq.f126112c.mo74144da();
            bxvd da6 = bzkf.f170382d.mo74144da();
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            bzkf bzkf = (bzkf) da6.f164949b;
            bzkf.f170384a |= 1;
            bzkf.f170385b = j3;
            bxyk a = bxzt.m124580a(j4);
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            bzkf bzkf2 = (bzkf) da6.f164949b;
            a.getClass();
            bzkf2.f170386c = a;
            bzkf2.f170384a |= 2;
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bldq bldq = (bldq) da5.f164949b;
            bzkf bzkf3 = (bzkf) da6.mo74062i();
            bzkf3.getClass();
            if (!bldq.f126115b.mo73666a()) {
                bldq.f126115b = GeneratedMessageLite.m124021a(bldq.f126115b);
            }
            bldq.f126115b.add(bzkf3);
            if (z) {
                bldp bldp = bldp.STARRED;
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bldq bldq2 = (bldq) da5.f164949b;
                bldp.getClass();
                if (!bldq2.f126114a.mo73666a()) {
                    bldq2.f126114a = GeneratedMessageLite.m124019a(bldq2.f126114a);
                }
                bldq2.f126114a.mo74153d(bldp.f126111c);
            }
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            blfa blfa2 = (blfa) da4.f164949b;
            bldq bldq3 = (bldq) da5.mo74062i();
            bldq3.getClass();
            blfa2.f126324g = bldq3;
            blfa2.f126318a |= 64;
            if (!TextUtils.isEmpty(str)) {
                try {
                    long parseLong = Long.parseLong(str, 16);
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    blfa blfa3 = (blfa) da4.f164949b;
                    blfa3.f126318a |= 16;
                    blfa3.f126323f = parseLong;
                } catch (NumberFormatException e) {
                    if (!cgij.f186992a.mo6606a().mo83882r()) {
                        throw e;
                    }
                }
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            blds blds2 = (blds) da2.f164949b;
            blfa blfa4 = (blfa) da4.mo74062i();
            blfa4.getClass();
            if (!blds2.f126125c.mo73666a()) {
                blds2.f126125c = GeneratedMessageLite.m124021a(blds2.f126125c);
            }
            blds2.f126125c.add(blfa4);
            String str4 = bzcu2.f169412c;
            if (cgij.m145554l()) {
                bzdq = bzdq3;
                if ((bzdq.f169538a & 8192) != 0) {
                    bxvd da7 = bleh.f126199o.mo74144da();
                    bzdr bzdr = bzdq.f169547j;
                    if (bzdr == null) {
                        bzdr = bzdr.f169556m;
                    }
                    if ((bzdr.f169558a & 1) != 0) {
                        bzdr bzdr2 = bzdq.f169547j;
                        if (bzdr2 == null) {
                            bzdr2 = bzdr.f169556m;
                        }
                        String str5 = bzdr2.f169559b;
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        bleh bleh = (bleh) da7.f164949b;
                        str5.getClass();
                        bleh.f126201a |= 2;
                        bleh.f126203c = str5;
                    }
                    bzdr bzdr3 = bzdq.f169547j;
                    if (bzdr3 == null) {
                        bzdr3 = bzdr.f169556m;
                    }
                    if ((bzdr3.f169558a & 4) != 0) {
                        bzdr bzdr4 = bzdq.f169547j;
                        if (bzdr4 == null) {
                            bzdr4 = bzdr.f169556m;
                        }
                        String str6 = bzdr4.f169561d;
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        bleh bleh2 = (bleh) da7.f164949b;
                        str6.getClass();
                        bleh2.f126201a |= 32;
                        bleh2.f126206f = str6;
                    }
                    bzdr bzdr5 = bzdq.f169547j;
                    if (bzdr5 == null) {
                        bzdr5 = bzdr.f169556m;
                    }
                    if ((bzdr5.f169558a & 2) != 0) {
                        bzdr bzdr6 = bzdq.f169547j;
                        if (bzdr6 == null) {
                            bzdr6 = bzdr.f169556m;
                        }
                        String str7 = bzdr6.f169560c;
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        bleh bleh3 = (bleh) da7.f164949b;
                        str7.getClass();
                        bleh3.f126201a |= 16;
                        bleh3.f126205e = str7;
                    }
                    bzdr bzdr7 = bzdq.f169547j;
                    if (bzdr7 == null) {
                        bzdr7 = bzdr.f169556m;
                    }
                    if ((16 & bzdr7.f169558a) != 0) {
                        bzdr bzdr8 = bzdq.f169547j;
                        if (bzdr8 == null) {
                            bzdr8 = bzdr.f169556m;
                        }
                        String str8 = bzdr8.f169563f;
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        bleh bleh4 = (bleh) da7.f164949b;
                        str8.getClass();
                        bleh4.f126201a |= 64;
                        bleh4.f126207g = str8;
                    }
                    bzdr bzdr9 = bzdq.f169547j;
                    if (bzdr9 == null) {
                        bzdr9 = bzdr.f169556m;
                    }
                    if ((bzdr9.f169558a & 8) != 0) {
                        bzdr bzdr10 = bzdq.f169547j;
                        if (bzdr10 == null) {
                            bzdr10 = bzdr.f169556m;
                        }
                        String str9 = bzdr10.f169562e;
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        bleh bleh5 = (bleh) da7.f164949b;
                        str9.getClass();
                        bleh5.f126201a |= 128;
                        bleh5.f126208h = str9;
                    }
                    bzdr bzdr11 = bzdq.f169547j;
                    if (bzdr11 == null) {
                        bzdr11 = bzdr.f169556m;
                    }
                    if ((bzdr11.f169558a & 32) != 0) {
                        bzdr bzdr12 = bzdq.f169547j;
                        if (bzdr12 == null) {
                            bzdr12 = bzdr.f169556m;
                        }
                        String str10 = bzdr12.f169564g;
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        bleh bleh6 = (bleh) da7.f164949b;
                        str10.getClass();
                        bleh6.f126201a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        bleh6.f126209i = str10;
                    }
                    bzdr bzdr13 = bzdq.f169547j;
                    if (bzdr13 == null) {
                        bzdr13 = bzdr.f169556m;
                    }
                    if ((bzdr13.f169558a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        bzdr bzdr14 = bzdq.f169547j;
                        if (bzdr14 == null) {
                            bzdr14 = bzdr.f169556m;
                        }
                        String str11 = bzdr14.f169567j;
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        bleh bleh7 = (bleh) da7.f164949b;
                        str11.getClass();
                        bleh7.f126201a |= 2048;
                        bleh7.f126212l = str11;
                    }
                    bzdr bzdr15 = bzdq.f169547j;
                    if (bzdr15 == null) {
                        bzdr15 = bzdr.f169556m;
                    }
                    if ((bzdr15.f169558a & 64) != 0) {
                        bzdr bzdr16 = bzdq.f169547j;
                        if (bzdr16 == null) {
                            bzdr16 = bzdr.f169556m;
                        }
                        String str12 = bzdr16.f169565h;
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        bleh bleh8 = (bleh) da7.f164949b;
                        str12.getClass();
                        bleh8.f126201a |= 1024;
                        bleh8.f126211k = str12;
                    }
                    bzdr bzdr17 = bzdq.f169547j;
                    if (bzdr17 == null) {
                        bzdr17 = bzdr.f169556m;
                    }
                    if ((bzdr17.f169558a & 128) != 0) {
                        bzdr bzdr18 = bzdq.f169547j;
                        if (bzdr18 == null) {
                            bzdr18 = bzdr.f169556m;
                        }
                        String str13 = bzdr18.f169566i;
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        bleh bleh9 = (bleh) da7.f164949b;
                        str13.getClass();
                        bleh9.f126201a |= 4096;
                        bleh9.f126213m = str13;
                    }
                    String valueOf3 = String.valueOf(bzdq.f169539b);
                    bzdr bzdr19 = bzdq.f169547j;
                    if (bzdr19 == null) {
                        bzdr19 = bzdr.f169556m;
                    }
                    bxvd a2 = m69985a(valueOf3, bzdr19.f169559b.equals(str4));
                    if (da7.f164950c) {
                        da7.mo74035c();
                        da7.f164950c = false;
                    }
                    bleh bleh10 = (bleh) da7.f164949b;
                    bleu bleu = (bleu) a2.mo74062i();
                    bleu.getClass();
                    bleh10.f126202b = bleu;
                    bleh10.f126201a |= 1;
                    bleq = bleq3;
                    bleq.mo66471a(da7);
                    i5 = i7 + 1;
                    bleq2 = bleq;
                    size = i6;
                    da = bxvd;
                    bxwc = bxwc2;
                } else {
                    bleq = bleq3;
                }
            } else {
                bleq = bleq3;
                bzdq = bzdq3;
            }
            if (str4 != null) {
                bxvd da8 = bleh.f126199o.mo74144da();
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                bleh bleh11 = (bleh) da8.f164949b;
                str4.getClass();
                bleh11.f126201a |= 8;
                bleh11.f126204d = str4;
                bxvd a3 = m69985a(String.valueOf(bzdq.f169539b), true);
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                bleh bleh12 = (bleh) da8.f164949b;
                bleu bleu2 = (bleu) a3.mo74062i();
                bleu2.getClass();
                bleh12.f126202b = bleu2;
                bleh12.f126201a |= 1;
                bleq.mo66471a(da8);
            }
            i5 = i7 + 1;
            bleq2 = bleq;
            size = i6;
            da = bxvd;
            bxwc = bxwc2;
        }
        bxvd bxvd2 = da;
        bleq bleq4 = bleq2;
        bxwc bxwc3 = bzcu2.f169415f;
        int size2 = bxwc3.size();
        int i11 = 0;
        while (i11 < size2) {
            bzdm bzdm = (bzdm) bxwc3.get(i11);
            bxvw bxvw = bzdm.f169524d;
            int size3 = bxvw.size();
            int i12 = 0;
            while (true) {
                i3 = i11 + 1;
                if (i12 >= size3) {
                    break;
                }
                long longValue = ((Long) bxvw.get(i12)).longValue();
                bxvd da9 = blex.f126295g.mo74144da();
                String str14 = bzdm.f169522b;
                if (da9.f164950c) {
                    da9.mo74035c();
                    da9.f164950c = false;
                }
                blex blex = (blex) da9.f164949b;
                str14.getClass();
                int i13 = blex.f126297a | 2;
                blex.f126297a = i13;
                blex.f126299c = str14;
                String str15 = bzdm.f169523c;
                str15.getClass();
                blex.f126297a = i13 | 4;
                blex.f126300d = str15;
                bxvd a4 = m69985a(String.valueOf(longValue), bzdm.f169527g);
                if (da9.f164950c) {
                    da9.mo74035c();
                    da9.f164950c = false;
                }
                blex blex2 = (blex) da9.f164949b;
                bleu bleu3 = (bleu) a4.mo74062i();
                bleu3.getClass();
                blex2.f126298b = bleu3;
                blex2.f126297a |= 1;
                if (bleq4.f164950c) {
                    bleq4.mo74035c();
                    bleq4.f164950c = false;
                }
                bler bler = (bler) bleq4.f164949b;
                blex blex3 = (blex) da9.mo74062i();
                blex3.getClass();
                bler.mo66475c();
                bler.f126258h.add(blex3);
                i12++;
            }
            i11 = i3;
        }
        bxwc bxwc4 = bzcu2.f169416g;
        int size4 = bxwc4.size();
        int i14 = 0;
        while (i14 < size4) {
            bzdj bzdj = (bzdj) bxwc4.get(i14);
            bxvw bxvw2 = bzdj.f169500d;
            int size5 = bxvw2.size();
            int i15 = 0;
            while (true) {
                i2 = i14 + 1;
                if (i15 >= size5) {
                    break;
                }
                long longValue2 = ((Long) bxvw2.get(i15)).longValue();
                bxvd da10 = bldu.f126131f.mo74144da();
                String str16 = bzdj.f169498b;
                if (da10.f164950c) {
                    da10.mo74035c();
                    da10.f164950c = false;
                }
                bldu bldu = (bldu) da10.f164949b;
                str16.getClass();
                int i16 = bldu.f126133a | 2;
                bldu.f126133a = i16;
                bldu.f126135c = str16;
                String str17 = bzdj.f169499c;
                str17.getClass();
                bldu.f126133a = i16 | 4;
                bldu.f126136d = str17;
                bxvd a5 = m69985a(String.valueOf(longValue2), bzdj.f169503g);
                if (da10.f164950c) {
                    da10.mo74035c();
                    da10.f164950c = false;
                }
                bldu bldu2 = (bldu) da10.f164949b;
                bleu bleu4 = (bleu) a5.mo74062i();
                bleu4.getClass();
                bldu2.f126134b = bleu4;
                bldu2.f126133a |= 1;
                if (bleq4.f164950c) {
                    bleq4.mo74035c();
                    bleq4.f164950c = false;
                }
                bler bler2 = (bler) bleq4.f164949b;
                bldu bldu3 = (bldu) da10.mo74062i();
                bldu3.getClass();
                bler2.mo66474b();
                bler2.f126257g.add(bldu3);
                i15++;
            }
            i14 = i2;
        }
        bxwc bxwc5 = bzcu2.f169417h;
        int size6 = bxwc5.size();
        int i17 = 0;
        while (i17 < size6) {
            bzdo bzdo = (bzdo) bxwc5.get(i17);
            bxvw bxvw3 = bzdo.f169533d;
            int size7 = bxvw3.size();
            int i18 = 0;
            while (true) {
                i = i17 + 1;
                if (i18 >= size7) {
                    break;
                }
                long longValue3 = ((Long) bxvw3.get(i18)).longValue();
                bxvd da11 = bldh.f126066l.mo74144da();
                String str18 = bzdo.f169531b;
                if (da11.f164950c) {
                    da11.mo74035c();
                    da11.f164950c = false;
                }
                bldh bldh = (bldh) da11.f164949b;
                str18.getClass();
                int i19 = bldh.f126068a | 8;
                bldh.f126068a = i19;
                bldh.f126071d = str18;
                String str19 = bzdo.f169532c;
                str19.getClass();
                bldh.f126068a = i19 | 2;
                bldh.f126070c = str19;
                bxvd a6 = m69985a(String.valueOf(longValue3), bzdo.f169534e);
                if (da11.f164950c) {
                    da11.mo74035c();
                    da11.f164950c = false;
                }
                bldh bldh2 = (bldh) da11.f164949b;
                bleu bleu5 = (bleu) a6.mo74062i();
                bleu5.getClass();
                bldh2.f126069b = bleu5;
                bldh2.f126068a |= 1;
                if (bleq4.f164950c) {
                    bleq4.mo74035c();
                    bleq4.f164950c = false;
                }
                bler bler3 = (bler) bleq4.f164949b;
                bldh bldh3 = (bldh) da11.mo74062i();
                bldh3.getClass();
                bler3.mo66476d();
                bler3.f126265o.add(bldh3);
                i18++;
            }
            i17 = i;
        }
        bxvd da12 = blew.f126288f.mo74144da();
        if (da12.f164950c) {
            da12.mo74035c();
            da12.f164950c = false;
        }
        blew blew = (blew) da12.f164949b;
        blds blds3 = (blds) da2.mo74062i();
        blds3.getClass();
        if (!blew.f126294e.mo73666a()) {
            blew.f126294e = GeneratedMessageLite.m124021a(blew.f126294e);
        }
        blew.f126294e.add(blds3);
        blew blew2 = (blew) da12.mo74062i();
        if (bleq4.f164950c) {
            bleq4.mo74035c();
            bleq4.f164950c = false;
        }
        bler bler4 = (bler) bleq4.f164949b;
        blew2.getClass();
        bler4.f126253c = blew2;
        bler4.f126251a |= 2;
        bxvd bxvd3 = bxvd2;
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        bler bler5 = (bler) bleq4.mo74062i();
        bler5.getClass();
        ((btcr) bxvd3.f164949b).f148308a = bler5;
        return bxvd3;
    }

    /* renamed from: a */
    public static bxvd m69984a(bzcx bzcx) {
        int i;
        bzdh bzdh = bzcx.f169436f;
        if (bzdh == null) {
            bzdh = bzdh.f169466A;
        }
        String valueOf = String.valueOf(bzdh.f169490v);
        bzdh bzdh2 = bzcx.f169436f;
        if (bzdh2 == null) {
            bzdh2 = bzdh.f169466A;
        }
        bxvd da = bzlf.f170517e.mo74144da();
        bxvd da2 = bzlb.f170498c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bzlb bzlb = (bzlb) da2.f164949b;
        valueOf.getClass();
        bzlb.f170500a |= 1;
        bzlb.f170501b = valueOf;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzlf bzlf = (bzlf) da.f164949b;
        bzlb bzlb2 = (bzlb) da2.mo74062i();
        bzlb2.getClass();
        bzlf.f170520b = bzlb2;
        bzlf.f170519a |= 1;
        bxvd da3 = bzla.f170493d.mo74144da();
        String str = bzdh2.f169471c;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bzla bzla = (bzla) da3.f164949b;
        str.getClass();
        int i2 = bzla.f170495a | 2;
        bzla.f170495a = i2;
        bzla.f170496b = str;
        String str2 = bzdh2.f169470b;
        str2.getClass();
        bzla.f170495a = i2 | 4;
        bzla.f170497c = str2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzlf bzlf2 = (bzlf) da.f164949b;
        bzla bzla2 = (bzla) da3.mo74062i();
        bzla2.getClass();
        bzlf2.f170521c = bzla2;
        bzlf2.f170519a |= 2;
        bxvd da4 = bzlc.f170502h.mo74144da();
        long j = bzdh2.f169477i;
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bzlc bzlc = (bzlc) da4.f164949b;
        int i3 = bzlc.f170504a | 2;
        bzlc.f170504a = i3;
        bzlc.f170508e = j;
        long j2 = bzdh2.f169478j;
        bzlc.f170504a = i3 | 4;
        bzlc.f170509f = j2;
        bxvd da5 = bxyk.f165095c.mo74144da();
        long j3 = bzdh2.f169482n;
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        ((bxyk) da5.f164949b).f165097a = j3;
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bzlc bzlc2 = (bzlc) da4.f164949b;
        bxyk bxyk = (bxyk) da5.mo74062i();
        bxyk.getClass();
        bzlc2.f170510g = bxyk;
        bzlc2.f170504a |= 16;
        bxvd da6 = bzkl.f170439g.mo74144da();
        int a = bzdg.m125686a(bzdh2.f169483o);
        if (a == 0) {
            a = 1;
        }
        if (a != 1) {
            i = a == 2 ? 2 : 3;
        } else {
            i = 1;
        }
        if (da6.f164950c) {
            da6.mo74035c();
            da6.f164950c = false;
        }
        bzkl bzkl = (bzkl) da6.f164949b;
        bzkl.f170443c = i - 1;
        int i4 = bzkl.f170441a | 2;
        bzkl.f170441a = i4;
        double d = bzdh2.f169481m;
        bzkl.f170441a = i4 | 4;
        bzkl.f170444d = d;
        int a2 = bzde.m125684a(bzdh2.f169487s);
        if (a2 == 0) {
            a2 = 1;
        }
        int a3 = m69982a(a2);
        if (da6.f164950c) {
            da6.mo74035c();
            da6.f164950c = false;
        }
        bzkl bzkl2 = (bzkl) da6.f164949b;
        bzkl2.f170445e = a3 - 1;
        bzkl2.f170441a |= 16;
        int a4 = bzde.m125684a(bzdh2.f169488t);
        if (a4 == 0) {
            a4 = 1;
        }
        int a5 = m69982a(a4);
        if (da6.f164950c) {
            da6.mo74035c();
            da6.f164950c = false;
        }
        bzkl bzkl3 = (bzkl) da6.f164949b;
        bzkl3.f170446f = a5 - 1;
        int i5 = bzkl3.f170441a | 32;
        bzkl3.f170441a = i5;
        bzkl3.f170442b = 1;
        bzkl3.f170441a = i5 | 1;
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bzlc bzlc3 = (bzlc) da4.f164949b;
        bzkl bzkl4 = (bzkl) da6.mo74062i();
        bzkl4.getClass();
        bzlc3.f170506c = bzkl4;
        bzlc3.f170505b = 8;
        bxvd da7 = bzle.f170513c.mo74144da();
        String str3 = bzdh2.f169493y;
        if (da7.f164950c) {
            da7.mo74035c();
            da7.f164950c = false;
        }
        bzle bzle = (bzle) da7.f164949b;
        str3.getClass();
        bzle.f170515a |= 1;
        bzle.f170516b = str3;
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bzlc bzlc4 = (bzlc) da4.f164949b;
        bzle bzle2 = (bzle) da7.mo74062i();
        bzle2.getClass();
        bzlc4.f170507d = bzle2;
        bzlc4.f170504a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzlf bzlf3 = (bzlf) da.f164949b;
        bzlc bzlc5 = (bzlc) da4.mo74062i();
        bzlc5.getClass();
        bzlf3.f170522d = bzlc5;
        bzlf3.f170519a |= 4;
        bzlf bzlf4 = (bzlf) da.mo74062i();
        bxvd da8 = btcp.f148299c.mo74144da();
        btco btco = btco.UDC;
        if (da8.f164950c) {
            da8.mo74035c();
            da8.f164950c = false;
        }
        btcp btcp = (btcp) da8.f164949b;
        btco.getClass();
        if (!btcp.f148301a.mo73666a()) {
            btcp.f148301a = GeneratedMessageLite.m124019a(btcp.f148301a);
        }
        btcp.f148301a.mo74153d(btco.mo3214a());
        if (da8.f164950c) {
            da8.mo74035c();
            da8.f164950c = false;
        }
        bzlf4.getClass();
        ((btcp) da8.f164949b).f148302b = bzlf4;
        return da8;
    }

    /* renamed from: a */
    private static bxvd m69985a(String str, boolean z) {
        bxvd da = bleu.f126278h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bleu bleu = (bleu) da.f164949b;
        bleu.f126282c = 13;
        int i = bleu.f126280a | 4;
        bleu.f126280a = i;
        str.getClass();
        int i2 = i | 16;
        bleu.f126280a = i2;
        bleu.f126283d = str;
        if (z) {
            bleu.f126280a = i2 | 32;
            bleu.f126284e = true;
        }
        return da;
    }
}
