package p000;

import java.util.List;

/* renamed from: aknb */
final /* synthetic */ class aknb implements bmxj {

    /* renamed from: a */
    static final bmxj f72292a = new aknb();

    private aknb() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0305  */
    public final Object apply(Object obj) {
        char c;
        char c2;
        int i;
        cafe cafe;
        List c3 = aknc.f72293a.mo66925c((CharSequence) ((String) obj));
        int i2 = 2;
        if (c3.size() >= 2) {
            String str = (String) c3.get(0);
            String str2 = (String) c3.get(1);
            bxvd da = akkp.f72169e.mo74144da();
            String a = aknk.m60086a(str);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            akkp akkp = (akkp) da.f164949b;
            a.getClass();
            akkp.f72171a |= 1;
            akkp.f72172b = a;
            if (!bmxx.m108577a(str2)) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                akkp akkp2 = (akkp) da.f164949b;
                str2.getClass();
                akkp2.f72171a |= 2;
                akkp2.f72173c = str2;
            }
            bxvd da2 = caet.f172852g.mo74144da();
            bxvd da3 = cafh.f172902d.mo74144da();
            String c4 = akmk.m60019c(str);
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            cafh cafh = (cafh) da3.f164949b;
            c4.getClass();
            cafh.f172904a |= 2;
            cafh.f172906c = c4;
            String b = akmk.m60017b(str, str2);
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            cafh cafh2 = (cafh) da3.f164949b;
            b.getClass();
            cafh2.f172904a |= 1;
            cafh2.f172905b = b;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            caet caet = (caet) da2.f164949b;
            cafh cafh3 = (cafh) da3.mo74062i();
            cafh3.getClass();
            caet.f172855b = cafh3;
            caet.f172854a |= 1;
            cafg cafg = null;
            if (c3.size() > 2) {
                String str3 = (String) c3.get(2);
                if (str3 == null || str3.length() == 0) {
                    cafe = null;
                } else {
                    List c5 = aknc.f72294b.mo66925c((CharSequence) str3);
                    if (c5.size() < 3) {
                        throw new IllegalArgumentException(str3.length() == 0 ? new String("QualityScore curve requires 3 fields, got ") : "QualityScore curve requires 3 fields, got ".concat(str3));
                    }
                    bxvd da4 = cafe.f172889e.mo74144da();
                    int parseInt = Integer.parseInt((String) c5.get(0));
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    cafe cafe2 = (cafe) da4.f164949b;
                    cafe2.f172891a |= 1;
                    cafe2.f172892b = parseInt;
                    int parseInt2 = Integer.parseInt((String) c5.get(1));
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    cafe cafe3 = (cafe) da4.f164949b;
                    cafe3.f172891a |= 2;
                    cafe3.f172893c = parseInt2;
                    for (int i3 = 2; i3 < c5.size(); i3++) {
                        int parseInt3 = Integer.parseInt((String) c5.get(i3));
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        cafe cafe4 = (cafe) da4.f164949b;
                        if (!cafe4.f172894d.mo73666a()) {
                            cafe4.f172894d = GeneratedMessageLite.m124019a(cafe4.f172894d);
                        }
                        cafe4.f172894d.mo74153d(parseInt3);
                    }
                    cafe = (cafe) da4.mo74062i();
                }
                if (cafe != null) {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    caet caet2 = (caet) da2.f164949b;
                    cafe.getClass();
                    caet2.f172856c = cafe;
                    caet2.f172854a |= 2;
                }
            }
            if (c3.size() > 3) {
                String str4 = (String) c3.get(3);
                if (!(str4 == null || str4.length() == 0)) {
                    List c6 = aknc.f72294b.mo66925c((CharSequence) str4);
                    if (c6.size() < 3) {
                        throw new IllegalArgumentException(str4.length() == 0 ? new String("ThroughputCurve requires 3 fields, got ") : "ThroughputCurve requires 3 fields, got ".concat(str4));
                    }
                    caff caff = (caff) cafg.f172895f.mo74144da();
                    int parseInt4 = Integer.parseInt((String) c6.get(0));
                    if (caff.f164950c) {
                        caff.mo74035c();
                        caff.f164950c = false;
                    }
                    cafg cafg2 = (cafg) caff.f164949b;
                    cafg2.f172897a |= 1;
                    cafg2.f172898b = parseInt4;
                    int parseInt5 = Integer.parseInt((String) c6.get(1));
                    if (caff.f164950c) {
                        caff.mo74035c();
                        caff.f164950c = false;
                    }
                    cafg cafg3 = (cafg) caff.f164949b;
                    cafg3.f172897a |= 2;
                    cafg3.f172899c = parseInt5;
                    for (int i4 = 2; i4 < c6.size(); i4++) {
                        caff.mo74636a(Integer.parseInt((String) c6.get(i4)));
                    }
                    cafg = (cafg) caff.mo74062i();
                }
                if (cafg != null) {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    caet caet3 = (caet) da2.f164949b;
                    cafg.getClass();
                    caet3.f172857d = cafg;
                    caet3.f172854a |= 4;
                }
            }
            if (c3.size() > 4) {
                String str5 = (String) c3.get(4);
                int hashCode = str5.hashCode();
                if (hashCode != -1842317375) {
                    if (hashCode != -1841833244) {
                        if (hashCode == -817816397 && str5.equals("METERED_UNKNOWN")) {
                            c2 = 2;
                            if (c2 == 0) {
                                i = c2 != 1 ? c2 != 2 ? 0 : 1 : 3;
                            } else {
                                i = 2;
                            }
                            if (i != 0) {
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                caet caet4 = (caet) da2.f164949b;
                                caet4.f172858e = i - 1;
                                caet4.f172854a |= 8;
                            }
                        }
                    } else if (str5.equals("METERED_TIME")) {
                        c2 = 1;
                        if (c2 == 0) {
                        }
                        if (i != 0) {
                        }
                    }
                } else if (str5.equals("METERED_DATA")) {
                    c2 = 0;
                    if (c2 == 0) {
                    }
                    if (i != 0) {
                    }
                }
                c2 = 65535;
                if (c2 == 0) {
                }
                if (i != 0) {
                }
            }
            if (c3.size() > 5) {
                String str6 = (String) c3.get(5);
                int hashCode2 = str6.hashCode();
                if (hashCode2 != -994068448) {
                    if (hashCode2 != -820482173) {
                        if (hashCode2 == 1798159134 && str6.equals("CAPTIVE_PORTAL_COMPATIBLE")) {
                            c = 0;
                            if (c != 0) {
                                i2 = 3;
                            } else if (c != 1) {
                                i2 = c != 2 ? 0 : 1;
                            }
                            if (i2 != 0) {
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                caet caet5 = (caet) da2.f164949b;
                                caet5.f172859f = i2 - 1;
                                caet5.f172854a |= 16;
                            }
                        }
                    } else if (str6.equals("CAPTIVE_PORTAL_INCOMPATIBLE")) {
                        c = 1;
                        if (c != 0) {
                        }
                        if (i2 != 0) {
                        }
                    }
                } else if (str6.equals("CAPTIVE_PORTAL_UNKNOWN")) {
                    c = 2;
                    if (c != 0) {
                    }
                    if (i2 != 0) {
                    }
                }
                c = 65535;
                if (c != 0) {
                }
                if (i2 != 0) {
                }
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            akkp akkp3 = (akkp) da.f164949b;
            caet caet6 = (caet) da2.mo74062i();
            caet6.getClass();
            akkp3.f72174d = caet6;
            akkp3.f72171a |= 4;
            return (akkp) da.mo74062i();
        }
        throw new IllegalArgumentException("Requires the form ssid|bssid[|...]");
    }
}
