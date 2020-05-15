package p000;

import android.content.Context;
import com.google.android.gms.tapandpay.paymentbundle.api.CryptoParameters;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: atcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atcb implements atcy {

    /* renamed from: a */
    private final Context f90063a;

    public atcb(Context context) {
        this.f90063a = context;
    }

    /* renamed from: a */
    private static boolean m75500a(atby atby) {
        return atby != null && !((bycu) atby.f90045b.f164949b).f165711e.isEmpty();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bji.a(byte[], int, short):short
     arg types: [byte[], int, int]
     candidates:
      bji.a(byte[], int, byte):byte
      bji.a(byte[], int, long):int
      bji.a(byte[], int, short):short */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f7, code lost:
        r8 = r16;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fe, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ff, code lost:
        r17 = r12;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0229 A[SYNTHETIC, Splitter:B:118:0x0229] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0395 A[Catch:{ asks -> 0x042f, IOException -> 0x0439 }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0396 A[Catch:{ asks -> 0x042f, IOException -> 0x0439 }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x03bd A[Catch:{ asks -> 0x042f, IOException -> 0x0439 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x03be A[Catch:{ asks -> 0x042f, IOException -> 0x0439 }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x03d6 A[Catch:{ asks -> 0x042f, IOException -> 0x0439 }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03dd A[Catch:{ asks -> 0x042f, IOException -> 0x0439 }] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x03e3 A[Catch:{ asks -> 0x042f, IOException -> 0x0439 }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03e4 A[Catch:{ asks -> 0x042f, IOException -> 0x0439 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f6 A[ExcHandler: all (r0v20 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:26:0x0085] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0123 A[SYNTHETIC, Splitter:B:67:0x0123] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0128 A[SYNTHETIC, Splitter:B:69:0x0128] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0142 A[SYNTHETIC, Splitter:B:74:0x0142] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0147 A[SYNTHETIC, Splitter:B:76:0x0147] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0160 A[SYNTHETIC, Splitter:B:80:0x0160] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0165 A[SYNTHETIC, Splitter:B:82:0x0165] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0184 A[SYNTHETIC, Splitter:B:87:0x0184] */
    /* renamed from: b */
    private final atby m75502b(askf askf, atcv atcv, bmtc bmtc, byte[] bArr, long j) {
        bit bit;
        Throwable th;
        IOException iOException;
        bmsp bmsp;
        bin bin;
        Throwable th2;
        atbz atbz;
        bmsp bmsp2;
        bmsp bmsp3;
        bmsp bmsp4;
        bxvd bxvd;
        atby atby;
        Throwable th3;
        Exception exc;
        bin bin2;
        bin bin3;
        Exception exc2;
        bmtc bmtc2 = bmtc;
        long j2 = j;
        atby atby2 = (atby) atcv;
        atca a = mo49818a(atby2, bArr);
        bit bit2 = a.f90059a;
        atby atby3 = a.f90061c;
        atbz atbz2 = a.f90060b;
        try {
            atce.m75535a(bit2.mo3166a(a.f90062d, "ignored"));
            try {
                byte[] bytes = asix.m74200a(askf).getBytes(StandardCharsets.UTF_8);
                byte[][] bArr2 = new byte[2][];
                if (bmtc2.f130815a == 1) {
                    try {
                        bmsp = (bmsp) bmtc2.f130816b;
                    } catch (IOException e) {
                        iOException = e;
                        bit = bit2;
                    } catch (Throwable th4) {
                        th = th4;
                        bit = bit2;
                        bit.mo3165a();
                        atce.m75536a(bit);
                        throw th;
                    }
                } else {
                    bmsp = bmsp.f130728e;
                }
                bArr2[0] = m75501a(bmsp.f130733d);
                String valueOf = String.valueOf(asti.m74760a(bytes));
                bArr2[1] = (valueOf.length() == 0 ? new String("2") : "2".concat(valueOf)).getBytes(StandardCharsets.UTF_8);
                byte[] a2 = bjc.m3173a(bArr2);
                bin bin4 = bib.f3271a;
                bin bin5 = new bin();
                bin bin6 = bin4;
                try {
                    bin bin7 = new bin();
                    bix a3 = biy.m3166a();
                    if (biw.OPERATION.f3341b == null) {
                        atbz = atbz2;
                    } else {
                        atbz = atbz2;
                        if (!biw.OPERATION.f3341b.equals(bii.PROVISION)) {
                            try {
                                if (!biw.OPERATION.f3341b.equals(bii.REPERSO)) {
                                    if (!biw.OPERATION.f3341b.equals(bii.REFRESH)) {
                                        throw new bic(bib.f3276f);
                                    }
                                }
                            } catch (Exception e2) {
                                exc2 = e2;
                                bin = bin6;
                                try {
                                    bis.m3128a(bin5, bis.m3127a(exc2), "06");
                                    bje.m3183a(bin5.f3322d, biw.OPERATION.f3341b, 0);
                                    atce.m75535a(bin5);
                                    byte[][] bArr3 = new byte[3][];
                                    boan boan = boan.f132470d;
                                    if (bmtc2.f130815a != 1) {
                                    }
                                    bArr3[0] = m75501a(boan.mo68794a(bmsp2.f130731b.mo73780k()));
                                    boan boan2 = boan.f132470d;
                                    if (bmtc2.f130815a != 1) {
                                    }
                                    bArr3[1] = m75501a(boan2.mo68794a(bmsp3.f130730a.mo73780k()));
                                    boan boan3 = boan.f132470d;
                                    if (bmtc2.f130815a != 1) {
                                    }
                                    bArr3[2] = m75501a(boan3.mo68794a(bmsp4.f130732c.mo73780k()));
                                    bxvd = atby3.f90045b;
                                    if (!m75500a(atby2)) {
                                    }
                                    if (j2 != 0) {
                                    }
                                    if (bxvd.f164950c) {
                                    }
                                    bycu bycu = (bycu) bxvd.f164949b;
                                    int i = bycu.f165707a | 4;
                                    bycu.f165707a = i;
                                    bycu.f165709c = r13;
                                    bycu.f165707a = i | 8;
                                    bycu.f165710d = j2;
                                    bit.mo3165a();
                                    atce.m75536a(bit);
                                    atby atby4 = atby;
                                    atby4.mo49812a(atbz);
                                    return atby4;
                                } catch (Throwable th5) {
                                    th2 = th5;
                                    bis.m3128a(bin5, bin, "06");
                                    bje.m3183a(bin5.f3322d, biw.OPERATION.f3341b, 0);
                                    throw th2;
                                }
                            } catch (Throwable th6) {
                                th2 = th6;
                                bin = bin6;
                                bis.m3128a(bin5, bin, "06");
                                bje.m3183a(bin5.f3322d, biw.OPERATION.f3341b, 0);
                                throw th2;
                            }
                        }
                    }
                    bix.m3145f(a3.mo3187f().mo3154b(a2, new byte[1024]));
                    bis.m3128a(bin7, bin6, "06");
                    bje.m3183a(bin7.f3322d, biw.OPERATION.f3341b, 0);
                    bin5 = bin7;
                } catch (Exception e3) {
                    e = e3;
                    bin = bin6;
                    exc2 = e;
                    bis.m3128a(bin5, bis.m3127a(exc2), "06");
                    bje.m3183a(bin5.f3322d, biw.OPERATION.f3341b, 0);
                    atce.m75535a(bin5);
                    byte[][] bArr32 = new byte[3][];
                    boan boan4 = boan.f132470d;
                    if (bmtc2.f130815a != 1) {
                    }
                    bArr32[0] = m75501a(boan4.mo68794a(bmsp2.f130731b.mo73780k()));
                    boan boan22 = boan.f132470d;
                    if (bmtc2.f130815a != 1) {
                    }
                    bArr32[1] = m75501a(boan22.mo68794a(bmsp3.f130730a.mo73780k()));
                    boan boan32 = boan.f132470d;
                    if (bmtc2.f130815a != 1) {
                    }
                    bArr32[2] = m75501a(boan32.mo68794a(bmsp4.f130732c.mo73780k()));
                    bxvd = atby3.f90045b;
                    if (!m75500a(atby2)) {
                    }
                    if (j2 != 0) {
                    }
                    if (bxvd.f164950c) {
                    }
                    bycu bycu2 = (bycu) bxvd.f164949b;
                    int i2 = bycu2.f165707a | 4;
                    bycu2.f165707a = i2;
                    bycu2.f165709c = r13;
                    bycu2.f165707a = i2 | 8;
                    bycu2.f165710d = j2;
                    bit.mo3165a();
                    atce.m75536a(bit);
                    atby atby42 = atby;
                    atby42.mo49812a(atbz);
                    return atby42;
                } catch (Throwable th7) {
                }
                atce.m75535a(bin5);
                byte[][] bArr322 = new byte[3][];
                boan boan42 = boan.f132470d;
                if (bmtc2.f130815a != 1) {
                    bmsp2 = (bmsp) bmtc2.f130816b;
                } else {
                    bmsp2 = bmsp.f130728e;
                }
                bArr322[0] = m75501a(boan42.mo68794a(bmsp2.f130731b.mo73780k()));
                boan boan222 = boan.f132470d;
                if (bmtc2.f130815a != 1) {
                    bmsp3 = (bmsp) bmtc2.f130816b;
                } else {
                    bmsp3 = bmsp.f130728e;
                }
                bArr322[1] = m75501a(boan222.mo68794a(bmsp3.f130730a.mo73780k()));
                boan boan322 = boan.f132470d;
                if (bmtc2.f130815a != 1) {
                    bmsp4 = (bmsp) bmtc2.f130816b;
                } else {
                    bmsp4 = bmsp.f130728e;
                }
                bArr322[2] = m75501a(boan322.mo68794a(bmsp4.f130732c.mo73780k()));
                bxvd = atby3.f90045b;
                if (!m75500a(atby2)) {
                    String str = new String(bjc.m3173a(bArr322), StandardCharsets.UTF_8);
                    bin2 = bib.f3271a;
                    bin3 = new bin();
                    try {
                        bin bin8 = new bin();
                        if (str.length() == 0) {
                            throw new bic(bib.f3277g);
                        } else if (biw.OPERATION.f3341b.equals(bii.REFRESH)) {
                            new biu().mo3168a(str);
                            bis.m3128a(bin8, bin2, "04");
                            bje.m3183a(bin8.f3322d, biw.OPERATION.f3341b, 0);
                            bin3 = bin8;
                            atce.m75535a(bin3);
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            bycu bycu3 = (bycu) bxvd.f164949b;
                            bycu bycu4 = bycu.f165705k;
                            bycu3.f165707a &= -2;
                            bycu3.f165708b = bycu.f165705k.f165708b;
                            bit = bit2;
                            atby = atby3;
                        } else {
                            throw new bic(bib.f3276f);
                        }
                    } catch (Exception e4) {
                        Exception exc3 = e4;
                        biy.m3166a().f3347c[11] = -91;
                        bis.m3128a(bin3, bis.m3127a(exc3), "04");
                        bje.m3183a(bin3.f3322d, biw.OPERATION.f3341b, 0);
                    }
                } else {
                    String str2 = new String(bjc.m3173a(bArr322), StandardCharsets.UTF_8);
                    bin bin9 = bib.f3271a;
                    bio bio = new bio();
                    try {
                        biu biu = new biu();
                        bio bio2 = new bio();
                        bix a4 = biy.m3166a();
                        if (str2.length() != 0) {
                            if (biw.OPERATION.f3341b != null) {
                                if (!biw.OPERATION.f3341b.equals(bii.PROVISION)) {
                                    try {
                                        if (!biw.OPERATION.f3341b.equals(bii.REPERSO)) {
                                            bit = bit2;
                                            atby = atby3;
                                        }
                                    } catch (Exception e5) {
                                        exc = e5;
                                        bit = bit2;
                                        atby = atby3;
                                        try {
                                            biy.m3166a().f3347c[11] = -91;
                                            bis.m3128a(bio, bis.m3127a(exc), "03");
                                            bje.m3183a(bio.f3322d, biw.OPERATION.f3341b, 0);
                                            atce.m75535a(bio);
                                            Map a5 = bmyx.m108640a(',').mo66919b('=').mo66915a(bio.f3324a);
                                            bxtx a6 = bxtx.m123261a(asti.m74762a((String) a5.get("PPSE_RESPONSE")));
                                            if (!bxvd.f164950c) {
                                            }
                                            bycu bycu5 = (bycu) bxvd.f164949b;
                                            bycu bycu6 = bycu.f165705k;
                                            a6.getClass();
                                            bycu5.f165707a |= 64;
                                            bycu5.f165713g = a6;
                                            int parseInt = Integer.parseInt((String) a5.get("ISSUER_COUNTRY_CODE"));
                                            if (!bxvd.f164950c) {
                                            }
                                            bycu bycu7 = (bycu) bxvd.f164949b;
                                            bycu7.f165707a |= 128;
                                            bycu7.f165714h = parseInt;
                                            if (j2 != 0) {
                                            }
                                            if (bxvd.f164950c) {
                                            }
                                            bycu bycu22 = (bycu) bxvd.f164949b;
                                            int i22 = bycu22.f165707a | 4;
                                            bycu22.f165707a = i22;
                                            bycu22.f165709c = r13;
                                            bycu22.f165707a = i22 | 8;
                                            bycu22.f165710d = j2;
                                            bit.mo3165a();
                                            atce.m75536a(bit);
                                            atby atby422 = atby;
                                            atby422.mo49812a(atbz);
                                            return atby422;
                                        } catch (Throwable th8) {
                                            th = th8;
                                            th3 = th;
                                            bis.m3128a(bio, bin9, "03");
                                            bje.m3183a(bio.f3322d, biw.OPERATION.f3341b, 0);
                                            throw th3;
                                        }
                                    } catch (Throwable th9) {
                                        th3 = th9;
                                        bit = bit2;
                                        bis.m3128a(bio, bin9, "03");
                                        bje.m3183a(bio.f3322d, biw.OPERATION.f3341b, 0);
                                        throw th3;
                                    }
                                }
                                biu.mo3168a(str2);
                                if (a4.f3347c[0] == 92) {
                                    biu.m3135a();
                                }
                                bix a7 = biy.m3166a();
                                StringBuilder sb = new StringBuilder();
                                int a8 = bji.m3195a(a7.f3345a, 20);
                                sb.append("ISSUER_COUNTRY_CODE=");
                                if (a8 != 0) {
                                    sb.append(bji.m3199a(a8));
                                }
                                sb.append(",PPSE_RESPONSE=");
                                byte[] c = a7.mo3182c(335623);
                                if (c != null) {
                                    int length = c.length;
                                    int i3 = length + 5;
                                    byte[] bArr4 = new byte[i3];
                                    atby = atby3;
                                    bit = bit2;
                                    try {
                                        short a9 = bji.m3202a(bArr4, 0, (short) -16628);
                                        int i4 = a9 + 1;
                                        bArr4[a9] = (byte) (i3 - 3);
                                        int i5 = i4 + 1;
                                        bArr4[i4] = -91;
                                        bArr4[i5] = (byte) length;
                                        bji.m3197a(c, 0, bArr4, i5 + 1, length);
                                        sb.append(bji.m3201a(bArr4));
                                    } catch (Exception e6) {
                                        e = e6;
                                        exc = e;
                                        biy.m3166a().f3347c[11] = -91;
                                        bis.m3128a(bio, bis.m3127a(exc), "03");
                                        bje.m3183a(bio.f3322d, biw.OPERATION.f3341b, 0);
                                        atce.m75535a(bio);
                                        Map a52 = bmyx.m108640a(',').mo66919b('=').mo66915a(bio.f3324a);
                                        bxtx a62 = bxtx.m123261a(asti.m74762a((String) a52.get("PPSE_RESPONSE")));
                                        if (!bxvd.f164950c) {
                                        }
                                        bycu bycu52 = (bycu) bxvd.f164949b;
                                        bycu bycu62 = bycu.f165705k;
                                        a62.getClass();
                                        bycu52.f165707a |= 64;
                                        bycu52.f165713g = a62;
                                        int parseInt2 = Integer.parseInt((String) a52.get("ISSUER_COUNTRY_CODE"));
                                        if (!bxvd.f164950c) {
                                        }
                                        bycu bycu72 = (bycu) bxvd.f164949b;
                                        bycu72.f165707a |= 128;
                                        bycu72.f165714h = parseInt2;
                                        if (j2 != 0) {
                                        }
                                        if (bxvd.f164950c) {
                                        }
                                        bycu bycu222 = (bycu) bxvd.f164949b;
                                        int i222 = bycu222.f165707a | 4;
                                        bycu222.f165707a = i222;
                                        bycu222.f165709c = r13;
                                        bycu222.f165707a = i222 | 8;
                                        bycu222.f165710d = j2;
                                        bit.mo3165a();
                                        atce.m75536a(bit);
                                        atby atby4222 = atby;
                                        atby4222.mo49812a(atbz);
                                        return atby4222;
                                    }
                                } else {
                                    bit = bit2;
                                    atby = atby3;
                                }
                                sb.append(",");
                                String sb2 = sb.toString();
                                if (!sb2.isEmpty()) {
                                    sb2 = sb2.substring(0, sb2.length() - 1);
                                }
                                bio2.f3324a = sb2;
                                a4.mo3174a(73499, sb2.getBytes());
                                bis.m3128a(bio2, bin9, "03");
                                bje.m3183a(bio2.f3322d, biw.OPERATION.f3341b, 0);
                                bio = bio2;
                                atce.m75535a(bio);
                                Map a522 = bmyx.m108640a(',').mo66919b('=').mo66915a(bio.f3324a);
                                bxtx a622 = bxtx.m123261a(asti.m74762a((String) a522.get("PPSE_RESPONSE")));
                                if (!bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                bycu bycu522 = (bycu) bxvd.f164949b;
                                bycu bycu622 = bycu.f165705k;
                                a622.getClass();
                                bycu522.f165707a |= 64;
                                bycu522.f165713g = a622;
                                int parseInt22 = Integer.parseInt((String) a522.get("ISSUER_COUNTRY_CODE"));
                                if (!bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                bycu bycu722 = (bycu) bxvd.f164949b;
                                bycu722.f165707a |= 128;
                                bycu722.f165714h = parseInt22;
                            } else {
                                bit = bit2;
                                atby = atby3;
                            }
                            throw new bic(bib.f3276f);
                        }
                        throw new bic(bib.f3277g);
                    } catch (Exception e7) {
                        e = e7;
                        bit = bit2;
                        atby = atby3;
                        exc = e;
                        biy.m3166a().f3347c[11] = -91;
                        bis.m3128a(bio, bis.m3127a(exc), "03");
                        bje.m3183a(bio.f3322d, biw.OPERATION.f3341b, 0);
                        atce.m75535a(bio);
                        Map a5222 = bmyx.m108640a(',').mo66919b('=').mo66915a(bio.f3324a);
                        bxtx a6222 = bxtx.m123261a(asti.m74762a((String) a5222.get("PPSE_RESPONSE")));
                        if (!bxvd.f164950c) {
                        }
                        bycu bycu5222 = (bycu) bxvd.f164949b;
                        bycu bycu6222 = bycu.f165705k;
                        a6222.getClass();
                        bycu5222.f165707a |= 64;
                        bycu5222.f165713g = a6222;
                        int parseInt222 = Integer.parseInt((String) a5222.get("ISSUER_COUNTRY_CODE"));
                        if (!bxvd.f164950c) {
                        }
                        bycu bycu7222 = (bycu) bxvd.f164949b;
                        bycu7222.f165707a |= 128;
                        bycu7222.f165714h = parseInt222;
                        if (j2 != 0) {
                        }
                        if (bxvd.f164950c) {
                        }
                        bycu bycu2222 = (bycu) bxvd.f164949b;
                        int i2222 = bycu2222.f165707a | 4;
                        bycu2222.f165707a = i2222;
                        bycu2222.f165709c = r13;
                        bycu2222.f165707a = i2222 | 8;
                        bycu2222.f165710d = j2;
                        bit.mo3165a();
                        atce.m75536a(bit);
                        atby atby42222 = atby;
                        atby42222.mo49812a(atbz);
                        return atby42222;
                    } catch (Throwable th10) {
                        th = th10;
                        bit = bit2;
                        th3 = th;
                        bis.m3128a(bio, bin9, "03");
                        bje.m3183a(bio.f3322d, biw.OPERATION.f3341b, 0);
                        throw th3;
                    }
                }
                long currentTimeMillis = j2 != 0 ? System.currentTimeMillis() - j2 : 0;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bycu bycu22222 = (bycu) bxvd.f164949b;
                int i22222 = bycu22222.f165707a | 4;
                bycu22222.f165707a = i22222;
                bycu22222.f165709c = currentTimeMillis;
                bycu22222.f165707a = i22222 | 8;
                bycu22222.f165710d = j2;
                bit.mo3165a();
                atce.m75536a(bit);
                atby atby422222 = atby;
                atby422222.mo49812a(atbz);
                return atby422222;
            } catch (asks e8) {
                throw new atcz(e8);
            } catch (IOException e9) {
                e = e9;
                iOException = e;
                try {
                    throw new atcz(iOException);
                } catch (Throwable th11) {
                    th = th11;
                    th = th;
                    bit.mo3165a();
                    atce.m75536a(bit);
                    throw th;
                }
            }
        } catch (IOException e10) {
            e = e10;
            bit = bit2;
            iOException = e;
            throw new atcz(iOException);
        } catch (Throwable th12) {
            th = th12;
            bit = bit2;
            th = th;
            bit.mo3165a();
            atce.m75536a(bit);
            throw th;
        }
    }

    /* renamed from: a */
    static byte[] m75501a(String str) {
        String valueOf = String.valueOf(str);
        return (valueOf.length() == 0 ? new String("1") : "1".concat(valueOf)).getBytes(StandardCharsets.UTF_8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final atca mo49818a(atby atby, byte[] bArr) {
        atby atby2;
        atbz atbz;
        bii bii;
        if (!m75500a(atby)) {
            atbz = new atbz(null, null, null, bArr, null);
            atby2 = new atby(this.f90063a, bycu.f165705k);
            bii = bii.PROVISION;
        } else {
            atbz a = atby.mo49811a(bArr);
            bii = bii.REFRESH;
            atby2 = atby;
            atbz = a;
        }
        return new atca(atce.m75534a(atbz), atbz, atby2, bii);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ atcv mo49808a(askf askf, atcv atcv, bmtc bmtc, byte[] bArr, long j) {
        try {
            return m75502b(askf, atcv, bmtc, bArr, j);
        } catch (atcd e) {
            if (e.f90076a.f3321c.equals(bib.f3287q.f3321c)) {
                try {
                    return m75502b(askf, null, bmtc, bArr, j);
                } catch (atcd e2) {
                    throw new RuntimeException("Error updating bundle on reperso retry", e2);
                }
            } else {
                throw new RuntimeException("Error updating bundle", e);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final btmd mo49809a() {
        bxvd da = btlw.f149442g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btlw) da.f164949b).f149450h = true;
        bit a = atce.m75534a(new atbz("", null, null, null, ""));
        try {
            bip a2 = a.mo3167a(System.currentTimeMillis(), "ignored");
            atce.m75536a(a);
            String str = a2.f3321c;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btlw btlw = (btlw) da.f164949b;
            str.getClass();
            btlw.f149444a = str;
            String str2 = a2.f3322d;
            str2.getClass();
            btlw.f149445b = str2;
            String str3 = a2.f3323e;
            str3.getClass();
            btlw.f149446c = str3;
            String num = Integer.toString(a2.f3325a);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            num.getClass();
            ((btlw) da.f164949b).f149447d = num;
            String num2 = Integer.toString(a2.f3327f);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            num2.getClass();
            ((btlw) da.f164949b).f149448e = num2;
            btmr a3 = atvf.m76450a(this.f90063a);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a3.getClass();
            ((btlw) da.f164949b).f149449f = a3;
            bxvd da2 = btmd.f149473c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            btmd btmd = (btmd) da2.f164949b;
            btlw btlw2 = (btlw) da.mo74062i();
            btlw2.getClass();
            btmd.f149476b = btlw2;
            btmd.f149475a = 3;
            return (btmd) da2.mo74062i();
        } catch (Throwable th) {
            atce.m75536a(a);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014c, code lost:
        r15 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r3.mo3165a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015a, code lost:
        throw r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015b, code lost:
        r15 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x015c, code lost:
        p000.atce.m75536a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x015f, code lost:
        throw r15;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:37:0x00cd, B:58:0x014f] */
    /* renamed from: a */
    public final CryptoParameters mo49810a(atcv atcv) {
        bin bin;
        bik bik;
        bxvd da = btli.f149372c.mo74144da();
        bxvd da2 = btjy.f149201d.mo74144da();
        atca a = mo49818a((atby) atcv, null);
        bit bit = a.f90059a;
        atbz atbz = a.f90060b;
        try {
            atce.m75535a(bit.mo3166a(a.f90062d, "ignored"));
            byte[] bArr = new byte[0];
            bin = bib.f3271a;
            bik = new bik();
            try {
                bik bik2 = new bik();
                bix a2 = biy.m3166a();
                if (biw.OPERATION.f3341b != null) {
                    if (!biw.OPERATION.f3341b.equals(bii.PROVISION) && !biw.OPERATION.f3341b.equals(bii.REPERSO)) {
                        if (!biw.OPERATION.f3341b.equals(bii.REFRESH)) {
                            throw new bic(bib.f3276f);
                        }
                    }
                }
                byte[] bArr2 = new byte[1024];
                bix.m3145f(a2.mo3187f().mo3150a(bArr, bArr2));
                Object[] a3 = bjd.m3180a(bArr2);
                if (a3 != null) {
                    bik2.f3318a = a3[0].toString();
                    bis.m3128a(bik2, bin, "05");
                    bje.m3183a(bik2.f3322d, biw.OPERATION.f3341b, 0);
                    bik = bik2;
                    atce.m75535a(bik);
                    String str = bik.f3318a;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    str.getClass();
                    ((btjy) da2.f164949b).f149203a = str;
                    bit.mo3165a();
                    bip a4 = bit.mo3167a(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()), "ignore");
                    String a5 = stm.m36299a(a4.f3329h);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    a5.getClass();
                    ((btjy) da2.f164949b).f149205c = a5;
                    String a6 = stm.m36299a(a4.f3330i);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    a6.getClass();
                    ((btjy) da2.f164949b).f149204b = a6;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    btli btli = (btli) da.f164949b;
                    btjy btjy = (btjy) da2.mo74062i();
                    btjy.getClass();
                    btli.f149375b = btjy;
                    btli.f149374a = 1;
                    CryptoParameters cryptoParameters = new CryptoParameters((btli) da.mo74062i(), atbz.f90051d);
                    atce.m75536a(bit);
                    return cryptoParameters;
                }
                throw new bic(bib.f3275e);
            } catch (Exception e) {
                bis.m3128a(bik, bis.m3127a(e), "05");
                bje.m3183a(bik.f3322d, biw.OPERATION.f3341b, 0);
            }
        } catch (atcd e2) {
            throw new RuntimeException("Error talking to the SDK", e2);
        } catch (Throwable th) {
            bis.m3128a(bik, bin, "05");
            bje.m3183a(bik.f3322d, biw.OPERATION.f3341b, 0);
            throw th;
        }
    }
}
