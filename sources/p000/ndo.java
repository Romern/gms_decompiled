package p000;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: ndo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ndo {

    /* renamed from: f */
    private static final lvn f35345f = new lvn("RestoreRequestProcessor");

    /* renamed from: a */
    public final ndp f35346a;

    /* renamed from: b */
    public ltq f35347b;

    /* renamed from: c */
    public int f35348c;

    /* renamed from: d */
    public final HashMap f35349d;

    /* renamed from: e */
    public bxvd f35350e;

    public ndo(long j, long j2, String[] strArr, String str, String str2) {
        sdo.m34959a(strArr);
        ndp ndp = new ndp(j, j2, str, str2);
        this.f35346a = ndp;
        int length = strArr.length;
        if (length != 0) {
            bxvd a = ndp.mo20494a();
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            lth lth = lth.f32914q;
            ((lth) a.f164949b).f32926k = GeneratedMessageLite.m124030de();
            for (String str3 : strArr) {
                bxvd da = lsz.f32870k.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                lsz lsz = (lsz) da.f164949b;
                str3.getClass();
                lsz.f32872a |= 1;
                lsz.f32873b = str3;
                lsx lsx = lsx.f32860c;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                lsz lsz2 = (lsz) da.f164949b;
                lsx.getClass();
                lsz2.f32875d = lsx;
                lsz2.f32872a |= 4;
                a.mo74015a((lsz) da.mo74062i());
            }
            this.f35350e = a;
        } else {
            this.f35350e = null;
        }
        this.f35347b = null;
        this.f35348c = -1;
        this.f35349d = new HashMap();
    }

    /* renamed from: a */
    public final ndn mo20493a() {
        String str;
        lss lss;
        mde mde;
        boolean z;
        String str2;
        int a;
        int a2;
        boolean z2;
        if (this.f35347b != null) {
            while (this.f35348c < this.f35347b.f32977e.size()) {
                ltq ltq = this.f35347b;
                int i = this.f35348c;
                this.f35348c = i + 1;
                ltk ltk = (ltk) ltq.f32977e.get(i);
                ltq ltq2 = this.f35347b;
                if ((ltq2.f32973a & 4) != 0) {
                    str = ltq2.f32975c;
                } else {
                    str = null;
                }
                try {
                    if ((ltk.f32949a & 32) != 0) {
                        lss = ltk.f32956h;
                        if (lss == null) {
                            lss = lss.f32851d;
                        }
                    } else {
                        lss = null;
                    }
                    if (lss != null) {
                        bzxr bzxr = lss.f32855c;
                        if (bzxr == null) {
                            bzxr = bzxr.f171793c;
                        }
                        int a3 = bzxq.m126305a(bzxr.f171796b);
                        if (a3 == 0) {
                            z2 = false;
                        } else {
                            z2 = a3 == 3;
                        }
                        bmxy.m108589a(z2, "We only support WRAPPED_AES_256_GCM");
                        ByteString bxtx = lss.f32854b;
                        bxus b = bxus.m123743b();
                        mde mde2 = mde.f33472f;
                        try {
                            bxuc h = bxtx.mo73764h();
                            GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) mde2.mo74142c(4);
                            bxxv a4 = bxxm.f165037a.mo74228a(GeneratedMessageLite);
                            a4.mo74220a(GeneratedMessageLite, bxud.m123454a(h), b);
                            a4.mo74225d(GeneratedMessageLite);
                            h.mo73787a(0);
                            GeneratedMessageLite.m124027b(GeneratedMessageLite);
                            mde = (mde) GeneratedMessageLite;
                        } catch (IOException e) {
                            if (!(e.getCause() instanceof bxwf)) {
                                throw new bxwf(e.getMessage());
                            }
                            throw ((bxwf) e.getCause());
                        } catch (RuntimeException e2) {
                            if (e2.getCause() instanceof bxwf) {
                                throw ((bxwf) e2.getCause());
                            }
                            throw e2;
                        } catch (bxwf e3) {
                            throw e3;
                        } catch (bxwf e4) {
                            throw e4;
                        }
                    } else {
                        mde = null;
                    }
                    if (mde == null || str != null) {
                        if (str == null) {
                            z = false;
                        } else {
                            z = mde != null;
                        }
                        if ((!z || (ltk.f32949a & 4) != 0) && !((ltk.f32949a & 4) == 0 && ltk.f32952d.size() == 0)) {
                            if (str != null && mde == null) {
                                f35345f.mo25414c("Unencrypted package in encrypted set: %s", ltk.f32950b);
                            }
                            if (z) {
                                if ((ltk.f32949a & 64) != 0 && (a2 = lsr.m24351a(ltk.f32957i)) != 0 && a2 == 2) {
                                    return new ndj(ltk.f32950b, 2, str, mde, ltk.f32953e);
                                }
                                if ((ltk.f32949a & 64) != 0 && (a = lsr.m24351a(ltk.f32957i)) != 0 && a == 3) {
                                    return new ndj(ltk.f32950b, 1, str, mde, ltk.f32953e);
                                }
                                int a5 = lsr.m24351a(ltk.f32957i);
                                if (a5 == 0) {
                                    a5 = 1;
                                }
                                if (a5 != 1) {
                                    str2 = a5 != 2 ? "KEY_VALUE" : "FULL";
                                } else {
                                    str2 = "UNSPECIFIED";
                                }
                                throw new IllegalArgumentException(str2.length() == 0 ? new String("Unknown backup type: ") : "Unknown backup type: ".concat(str2));
                            } else if ((ltk.f32949a & 4) != 0) {
                                return new ndl(ltk.f32950b, ltk.f32953e);
                            } else {
                                String str3 = ltk.f32950b;
                                HashMap hashMap = new HashMap();
                                for (int i2 = 0; i2 < ltk.f32952d.size(); i2++) {
                                    ltr ltr = (ltr) ltk.f32952d.get(i2);
                                    String str4 = ltr.f32985b;
                                    if (!str4.startsWith("_tmp_")) {
                                        if ((ltr.f32984a & 2) != 0) {
                                            hashMap.put(str4, ltr.f32986c.getKey());
                                        } else {
                                            hashMap.put(str4, null);
                                        }
                                    }
                                }
                                return new ndm(str3, hashMap);
                            }
                        } else {
                            f35345f.mo25414c("Skipping app with no doc id or kv pairs: %s", ltk.f32950b);
                        }
                    } else {
                        f35345f.mo25416d("Package is encrypted but secondary key is missing, so skipping: %s", ltk.f32950b);
                    }
                } catch (bxwf e5) {
                    f35345f.mo25415d("Unable to parse wrapped tertiary key for package, skipping: %s", e5, ltk.f32950b);
                }
            }
        }
        return null;
    }
}
