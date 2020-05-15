package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: atbn */
final /* synthetic */ class atbn implements atbl {

    /* renamed from: a */
    private final atbq f90005a;

    /* renamed from: b */
    private final String f90006b;

    /* renamed from: c */
    private final btlr f90007c;

    /* renamed from: d */
    private final String f90008d;

    /* renamed from: e */
    private final askf f90009e;

    /* renamed from: f */
    private final byte[] f90010f;

    /* renamed from: g */
    private final long f90011g;

    /* renamed from: h */
    private final String f90012h;

    /* renamed from: i */
    private final byte[] f90013i;

    /* renamed from: j */
    private final String f90014j;

    public atbn(atbq atbq, String str, btlr btlr, String str2, askf askf, byte[] bArr, long j, String str3, byte[] bArr2, String str4) {
        this.f90005a = atbq;
        this.f90006b = str;
        this.f90007c = btlr;
        this.f90008d = str2;
        this.f90009e = askf;
        this.f90010f = bArr;
        this.f90011g = j;
        this.f90012h = str3;
        this.f90013i = bArr2;
        this.f90014j = str4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x0226 A[Catch:{ atcz -> 0x02ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0251 A[Catch:{ atcz -> 0x02ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x025c A[Catch:{ atcz -> 0x02ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x026a A[Catch:{ atcz -> 0x02ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x026b A[Catch:{ atcz -> 0x02ff }] */
    /* renamed from: a */
    public final Object mo49778a(atda atda) {
        byda byda;
        long j;
        byda byda2;
        bxvd bxvd;
        byte[] bArr;
        String str;
        bmtc bmtc;
        atcv atcv;
        bmts bmts;
        bmts bmts2;
        bmts bmts3;
        bmts bmts4;
        atda atda2 = atda;
        atbq atbq = this.f90005a;
        String str2 = this.f90006b;
        btlr btlr = this.f90007c;
        String str3 = this.f90008d;
        askf askf = this.f90009e;
        byte[] bArr2 = this.f90010f;
        long j2 = this.f90011g;
        String str4 = this.f90012h;
        byte[] bArr3 = this.f90013i;
        String str5 = this.f90014j;
        try {
            String str6 = (String) bmxu.m108565a(atda2.f90110k, atda2.f90101b);
            if (str6.equals(str2)) {
                atcy b = atbq.mo49786b(askf.f89126d, str6);
                int b2 = btny.m116969b(btlr.f149412c);
                if (b2 == 0) {
                    b2 = 1;
                }
                int i = b2 - 2;
                long j3 = j2;
                if (i != 1) {
                    if (i == 2) {
                        bnsl bnsl = (bnsl) atbq.f90017a.mo68390d();
                        bnsl.mo68432a("atbq", "a", 617, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68420a("Payment bundle %s included", str6);
                        try {
                            bmtc bmtc2 = (bmtc) bxvk.m124016a(bmtc.f130813c, boan.f132470d.mo68796b(str3), bxus.m123744c());
                            if (cgwn.m147258h()) {
                                if (bmtc2.f130815a != 3) {
                                    bArr = bArr3;
                                    str = str6;
                                } else if (str5 != null) {
                                    bmtp bmtp = ((bmts) bmtc2.f130816b).f130910a;
                                    if (bmtp == null) {
                                        bmtp = bmtp.f130893f;
                                    }
                                    bmti bmti = bmtp.f130898d;
                                    if (bmti == null) {
                                        bmti = bmti.f130844c;
                                    }
                                    bmto bmto = bmti.f130847b;
                                    if (bmto == null) {
                                        bmto = bmto.f130881k;
                                    }
                                    if (bmto.f130892j.isEmpty()) {
                                        bxvd bxvd2 = (bxvd) bmtc2.mo74142c(5);
                                        bxvd2.mo73625a((bxvk) bmtc2);
                                        if (bmtc2.f130815a == 3) {
                                            bmts = (bmts) bmtc2.f130816b;
                                        } else {
                                            bmts = bmts.f130908c;
                                        }
                                        bxvd bxvd3 = (bxvd) bmts.mo74142c(5);
                                        bxvd3.mo73625a((bxvk) bmts);
                                        if (bmtc2.f130815a == 3) {
                                            bmts2 = (bmts) bmtc2.f130816b;
                                        } else {
                                            bmts2 = bmts.f130908c;
                                        }
                                        bmtp bmtp2 = bmts2.f130910a;
                                        if (bmtp2 == null) {
                                            bmtp2 = bmtp.f130893f;
                                        }
                                        bxvd bxvd4 = (bxvd) bmtp2.mo74142c(5);
                                        bxvd4.mo73625a((bxvk) bmtp2);
                                        str = str6;
                                        if (bmtc2.f130815a == 3) {
                                            try {
                                                bmts3 = (bmts) bmtc2.f130816b;
                                            } catch (bxwf e) {
                                                e = e;
                                                bArr = bArr3;
                                                bnsl bnsl2 = (bnsl) atbq.f90017a.mo68388c();
                                                bnsl2.mo68437a(e);
                                                bnsl2.mo68432a("atbq", "a", 730, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                bnsl2.mo68405a("Failed to parse payment bundle");
                                                bmtc = null;
                                                if (bmtc != null) {
                                                }
                                                byda2 = atda2.f90109j;
                                                if (byda2 == null) {
                                                }
                                                long currentTimeMillis = System.currentTimeMillis();
                                                if (!bxvd.f164950c) {
                                                }
                                                byda byda3 = (byda) bxvd.f164949b;
                                                int i2 = byda3.f165752a | 1;
                                                byda3.f165752a = i2;
                                                byda3.f165753b = currentTimeMillis;
                                                byda3.f165752a = i2 | 2;
                                                byda3.f165754c++;
                                                atda2.f90109j = (byda) bxvd.mo74062i();
                                                return atda2;
                                            }
                                        } else {
                                            bmts3 = bmts.f130908c;
                                        }
                                        bmtp bmtp3 = bmts3.f130910a;
                                        if (bmtp3 == null) {
                                            bmtp3 = bmtp.f130893f;
                                        }
                                        bmti bmti2 = bmtp3.f130898d;
                                        if (bmti2 == null) {
                                            bmti2 = bmti.f130844c;
                                        }
                                        bxvd bxvd5 = (bxvd) bmti2.mo74142c(5);
                                        bxvd5.mo73625a((bxvk) bmti2);
                                        bArr = bArr3;
                                        if (bmtc2.f130815a == 3) {
                                            try {
                                                bmts4 = (bmts) bmtc2.f130816b;
                                            } catch (bxwf e2) {
                                                e = e2;
                                                bnsl bnsl22 = (bnsl) atbq.f90017a.mo68388c();
                                                bnsl22.mo68437a(e);
                                                bnsl22.mo68432a("atbq", "a", 730, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                bnsl22.mo68405a("Failed to parse payment bundle");
                                                bmtc = null;
                                                if (bmtc != null) {
                                                }
                                                byda2 = atda2.f90109j;
                                                if (byda2 == null) {
                                                }
                                                long currentTimeMillis2 = System.currentTimeMillis();
                                                if (!bxvd.f164950c) {
                                                }
                                                byda byda32 = (byda) bxvd.f164949b;
                                                int i22 = byda32.f165752a | 1;
                                                byda32.f165752a = i22;
                                                byda32.f165753b = currentTimeMillis2;
                                                byda32.f165752a = i22 | 2;
                                                byda32.f165754c++;
                                                atda2.f90109j = (byda) bxvd.mo74062i();
                                                return atda2;
                                            }
                                        } else {
                                            bmts4 = bmts.f130908c;
                                        }
                                        bmtp bmtp4 = bmts4.f130910a;
                                        if (bmtp4 == null) {
                                            bmtp4 = bmtp.f130893f;
                                        }
                                        bmti bmti3 = bmtp4.f130898d;
                                        if (bmti3 == null) {
                                            bmti3 = bmti.f130844c;
                                        }
                                        bmto bmto2 = bmti3.f130847b;
                                        if (bmto2 == null) {
                                            bmto2 = bmto.f130881k;
                                        }
                                        bxvd bxvd6 = (bxvd) bmto2.mo74142c(5);
                                        bxvd6.mo73625a((bxvk) bmto2);
                                        if (bxvd6.f164950c) {
                                            bxvd6.mo74035c();
                                            bxvd6.f164950c = false;
                                        }
                                        str5.getClass();
                                        ((bmto) bxvd6.f164949b).f130892j = str5;
                                        if (bxvd5.f164950c) {
                                            bxvd5.mo74035c();
                                            bxvd5.f164950c = false;
                                        }
                                        bmto bmto3 = (bmto) bxvd6.mo74062i();
                                        bmto3.getClass();
                                        ((bmti) bxvd5.f164949b).f130847b = bmto3;
                                        if (bxvd4.f164950c) {
                                            bxvd4.mo74035c();
                                            bxvd4.f164950c = false;
                                        }
                                        bmti bmti4 = (bmti) bxvd5.mo74062i();
                                        bmti4.getClass();
                                        ((bmtp) bxvd4.f164949b).f130898d = bmti4;
                                        if (bxvd3.f164950c) {
                                            bxvd3.mo74035c();
                                            bxvd3.f164950c = false;
                                        }
                                        bmtp bmtp5 = (bmtp) bxvd4.mo74062i();
                                        bmts bmts5 = bmts.f130908c;
                                        bmtp5.getClass();
                                        ((bmts) bxvd3.f164949b).f130910a = bmtp5;
                                        if (bxvd2.f164950c) {
                                            bxvd2.mo74035c();
                                            bxvd2.f164950c = false;
                                        }
                                        bmtc bmtc3 = (bmtc) bxvd2.f164949b;
                                        bmts bmts6 = (bmts) bxvd3.mo74062i();
                                        bmts6.getClass();
                                        bmtc3.f130816b = bmts6;
                                        bmtc3.f130815a = 3;
                                        bmtc = (bmtc) bxvd2.mo74062i();
                                        if (bmtc != null) {
                                            if (atda2.f90110k == null) {
                                                atcv = atda2.f90108i;
                                            } else {
                                                atcv = null;
                                            }
                                            byda = null;
                                            atcv a = b.mo49808a(askf, atcv, bmtc, bArr2, j3);
                                            atda2.f90103d = "unacknowledged";
                                            atda2.f90104e = str4;
                                            atda2.f90105f = null;
                                            atda2.f90108i = a;
                                            atda2.f90106g = bArr;
                                            atda2.f90110k = null;
                                            atda2.f90101b = str;
                                        }
                                    } else {
                                        bArr = bArr3;
                                        str = str6;
                                    }
                                }
                                bmtc = bmtc2;
                                if (bmtc != null) {
                                }
                            }
                            bArr = bArr3;
                            str = str6;
                            bmtc = bmtc2;
                        } catch (bxwf e3) {
                            e = e3;
                            bArr = bArr3;
                            str = str6;
                            bnsl bnsl222 = (bnsl) atbq.f90017a.mo68388c();
                            bnsl222.mo68437a(e);
                            bnsl222.mo68432a("atbq", "a", 730, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl222.mo68405a("Failed to parse payment bundle");
                            bmtc = null;
                            if (bmtc != null) {
                            }
                            byda2 = atda2.f90109j;
                            if (byda2 == null) {
                            }
                            long currentTimeMillis22 = System.currentTimeMillis();
                            if (!bxvd.f164950c) {
                            }
                            byda byda322 = (byda) bxvd.f164949b;
                            int i222 = byda322.f165752a | 1;
                            byda322.f165752a = i222;
                            byda322.f165753b = currentTimeMillis22;
                            byda322.f165752a = i222 | 2;
                            byda322.f165754c++;
                            atda2.f90109j = (byda) bxvd.mo74062i();
                            return atda2;
                        }
                        if (bmtc != null) {
                        }
                    } else if (i == 3) {
                        btoa a2 = btoa.m116971a(btlr.f149413d);
                        if (a2 == null) {
                            a2 = btoa.UNRECOGNIZED;
                        }
                        String a3 = atcw.m75565a(a2);
                        bnsl bnsl3 = (bnsl) atbq.f90017a.mo68390d();
                        bnsl3.mo68432a("atbq", "a", 653, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68424a("Payment bundle %s converted to %s", str6, a3);
                        atda2.f90103d = "type_switch";
                        atda2.f90104e = str4;
                        atda2.f90106g = bArr3;
                        atda2.f90105f = null;
                        atda2.f90110k = a3;
                        byda = null;
                    }
                    byda2 = atda2.f90109j;
                    if (byda2 == null) {
                        bxvd = (bxvd) byda2.mo74142c(5);
                        bxvd.mo73625a((bxvk) byda2);
                    } else {
                        bxvd = byda.f165750e.mo74144da();
                    }
                    long currentTimeMillis222 = System.currentTimeMillis();
                    if (!bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    byda byda3222 = (byda) bxvd.f164949b;
                    int i2222 = byda3222.f165752a | 1;
                    byda3222.f165752a = i2222;
                    byda3222.f165753b = currentTimeMillis222;
                    byda3222.f165752a = i2222 | 2;
                    byda3222.f165754c++;
                    atda2.f90109j = (byda) bxvd.mo74062i();
                    return atda2;
                }
                byda = null;
                bnsl bnsl4 = (bnsl) atbq.f90017a.mo68390d();
                bnsl4.mo68432a("atbq", "a", 641, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68420a("Payment bundle %s deferred", str6);
                atda2.f90103d = "requested";
                atda2.f90104e = str4;
                atda2.f90106g = bArr3;
                long currentTimeMillis3 = System.currentTimeMillis();
                int i3 = btlr.f149410a;
                if (i3 == 2) {
                    bxun bxun = (bxun) btlr.f149411b;
                    j = TimeUnit.SECONDS.toMillis(bxun.f164863a) + TimeUnit.NANOSECONDS.toMillis((long) bxun.f164864b);
                } else if (i3 != 3 || !((Boolean) btlr.f149411b).booleanValue()) {
                    j = TimeUnit.MINUTES.toMillis(1);
                } else {
                    j = TimeUnit.DAYS.toMillis(100);
                }
                atda2.f90107h = currentTimeMillis3 + j;
                atda2.f90105f = bArr2;
                atda2.f90109j = byda;
                return atda2;
            }
            throw new atbk("Bundle type changed");
        } catch (atcz e4) {
            throw new atbk(e4);
        }
    }
}
