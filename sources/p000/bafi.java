package p000;

/* renamed from: bafi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bafi {
    /* renamed from: a */
    public static badj m86736a(bygx bygx) {
        boolean z;
        byif byif;
        if (bygx.f166403a == 1) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        if (bygx.f166403a == 1) {
            byif = (byif) bygx.f166404b;
        } else {
            byif = byif.f166558b;
        }
        return m86737a(byif);
    }

    /* renamed from: b */
    public static badr m86745b(bygx bygx) {
        boolean z;
        byjq byjq;
        if (bygx.f166403a == 2) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        if (bygx.f166403a == 2) {
            byjq = (byjq) bygx.f166404b;
        } else {
            byjq = byjq.f166688e;
        }
        return m86738a(byjq);
    }

    /* renamed from: a */
    public static badj m86737a(byif byif) {
        String str;
        badi b = badj.m86640b();
        bxwc bxwc = byif.f166560a;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            byja byja = (byja) bxwc.get(i);
            byte[] k = byja.f166627b.mo73780k();
            int a = byiz.m124863a(byja.f166628c);
            int i2 = 1;
            if (a == 0) {
                a = 1;
            }
            int i3 = a - 1;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (a != 1) {
                        str = a != 2 ? "PREFIX" : "EXACT";
                    } else {
                        str = "UNKNOWN";
                    }
                    throw new IllegalArgumentException(str.length() == 0 ? new String("Unknown secondary id matching type ") : "Unknown secondary id matching type ".concat(str));
                }
                i2 = 2;
            }
            b.mo55646a(k, i2);
        }
        return b.mo55645a();
    }

    /* renamed from: b */
    public static byif m86746b(badj badj) {
        int i;
        bxvd da = byif.f166558b.mo74144da();
        bnre i2 = badj.mo55608a().listIterator();
        while (i2.hasNext()) {
            badp badp = (badp) i2.next();
            bxvd da2 = byja.f166624d.mo74144da();
            bxtx a = bxtx.m123261a(badp.mo55630a());
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            byja byja = (byja) da2.f164949b;
            a.getClass();
            byja.f166626a |= 1;
            byja.f166627b = a;
            int b = badp.mo55631b();
            if (b == 1) {
                i = 2;
            } else if (b == 2) {
                i = 3;
            } else {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Unknown secondary id matching type ");
                sb.append(b);
                throw new IllegalArgumentException(sb.toString());
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            byja byja2 = (byja) da2.f164949b;
            byja2.f166628c = i - 1;
            byja2.f166626a |= 2;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byif byif = (byif) da.f164949b;
            byja byja3 = (byja) da2.mo74062i();
            byja3.getClass();
            if (!byif.f166560a.mo73666a()) {
                byif.f166560a = bxvk.m124021a(byif.f166560a);
            }
            byif.f166560a.add(byja3);
        }
        return (byif) da.mo74062i();
    }

    /* renamed from: a */
    public static badr m86738a(byjq byjq) {
        Long l;
        Long l2 = null;
        if ((byjq.f166690a & 4) != 0) {
            l = Long.valueOf(byjq.f166693d);
        } else {
            l = null;
        }
        if ((byjq.f166690a & 2) != 0) {
            l2 = Long.valueOf(byjq.f166692c);
        }
        return badr.m86659a(byjq.f166691b, l, l2);
    }

    /* renamed from: a */
    public static bxtx m86739a(byhi byhi) {
        return bxtx.m123261a(bnzi.m110904f().mo68722a(byhi.f166456d.mo73780k()).mo68740b());
    }

    /* renamed from: a */
    public static bygx m86740a(badj badj) {
        bxvd da = bygx.f166401c.mo74144da();
        byif b = m86746b(badj);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bygx bygx = (bygx) da.f164949b;
        b.getClass();
        bygx.f166404b = b;
        bygx.f166403a = 1;
        return (bygx) da.mo74062i();
    }

    /* renamed from: a */
    public static bygz m86741a(int i, int i2, byhm byhm) {
        bxvd da = bygz.f166410c.mo74144da();
        bxvd da2 = byhn.f166478e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        byhn byhn = (byhn) da2.f164949b;
        int i3 = byhn.f166480a | 1;
        byhn.f166480a = i3;
        byhn.f166481b = i;
        int i4 = i3 | 2;
        byhn.f166480a = i4;
        byhn.f166482c = i2;
        byhn.f166483d = byhm.f166477e;
        byhn.f166480a = i4 | 4;
        byhn byhn2 = (byhn) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bygz bygz = (bygz) da.f164949b;
        byhn2.getClass();
        bygz.f166413b = byhn2;
        bygz.f166412a = 2;
        return (bygz) da.mo74062i();
    }

    /* renamed from: a */
    public static byip m86742a(byte[] bArr) {
        if (bArr != null) {
            bxus a = bxus.m123742a();
            a.mo73904a(byip.f166588d);
            bygn bygn = (bygn) bxvk.m124016a(bygn.f166357a, bArr, a);
            bxvj bxvj = byip.f166588d;
            bygn.mo74135a(bxvj);
            if (bygn.f164952m.mo73911a(bxvj.f164958d)) {
                bxvj bxvj2 = byip.f166588d;
                bygn.mo74135a(bxvj2);
                Object b = bygn.f164952m.mo73913b(bxvj2.f164958d);
                if (b == null) {
                    b = bxvj2.f164956b;
                } else {
                    bxvj2.mo74139a(b);
                }
                return (byip) b;
            }
            throw new bxwf("Missing MessageSet extension");
        }
        throw new bxwf("Missing RecordingSetting data");
    }

    /* renamed from: a */
    public static byjq m86743a(badr badr) {
        bxvd da = byjq.f166688e.mo74144da();
        int a = badr.mo55635a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byjq byjq = (byjq) da.f164949b;
        byjq.f166690a |= 1;
        byjq.f166691b = a;
        Long c = badr.mo55637c();
        if (c != null) {
            long longValue = c.longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byjq byjq2 = (byjq) da.f164949b;
            byjq2.f166690a |= 2;
            byjq2.f166692c = longValue;
        }
        Long b = badr.mo55636b();
        if (b != null) {
            long longValue2 = b.longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byjq byjq3 = (byjq) da.f164949b;
            byjq3.f166690a |= 4;
            byjq3.f166693d = longValue2;
        }
        return (byjq) da.mo74062i();
    }

    /* renamed from: a */
    public static String m86744a(bxtx bxtx) {
        return boan.f132472f.mo68794a(bxtx.mo73780k());
    }
}
