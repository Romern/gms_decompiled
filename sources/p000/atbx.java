package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tapandpay.paymentbundle.api.CryptoParameters;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: atbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atbx implements atcy {

    /* renamed from: a */
    private final Context f90042a;

    public atbx(Context context) {
        this.f90042a = context;
    }

    /* renamed from: a */
    private static boolean m75448a(atbv atbv) {
        return atbv != null && !((bycu) atbv.f90036b.f164949b).f165711e.isEmpty();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgr.a(java.lang.String, boolean):java.lang.Object
     arg types: [java.lang.String, int]
     candidates:
      bgr.a(java.lang.String, java.lang.Object):void
      bgr.a(java.lang.String, boolean):java.lang.Object */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0294 A[Catch:{ asks -> 0x02cd, all -> 0x021e, all -> 0x0161, all -> 0x02d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x029f A[Catch:{ asks -> 0x02cd, all -> 0x021e, all -> 0x0161, all -> 0x02d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02a0 A[Catch:{ asks -> 0x02cd, all -> 0x021e, all -> 0x0161, all -> 0x02d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ba A[Catch:{ asks -> 0x02cd, all -> 0x021e, all -> 0x0161, all -> 0x02d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bf A[Catch:{ asks -> 0x02cd, all -> 0x021e, all -> 0x0161, all -> 0x02d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d9 A[Catch:{ asks -> 0x02cd, all -> 0x021e, all -> 0x0161, all -> 0x02d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00de A[Catch:{ asks -> 0x02cd, all -> 0x021e, all -> 0x0161, all -> 0x02d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f7 A[Catch:{ asks -> 0x02cd, all -> 0x021e, all -> 0x0161, all -> 0x02d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fc A[Catch:{ asks -> 0x02cd, all -> 0x021e, all -> 0x0161, all -> 0x02d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011b A[SYNTHETIC, Splitter:B:49:0x011b] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0196 A[Catch:{ asks -> 0x02cd, all -> 0x021e, all -> 0x0161, all -> 0x02d6 }] */
    /* renamed from: b */
    private final atbv m75450b(askf askf, atcv atcv, bmtc bmtc, byte[] bArr, long j) {
        bgm bgm;
        bmsp bmsp;
        bmsp bmsp2;
        bmsp bmsp3;
        bmsp bmsp4;
        bxvd bxvd;
        bha bha;
        bfx bfx;
        bha bha2;
        bfw bfw;
        bmtc bmtc2 = bmtc;
        long j2 = j;
        atbv atbv = (atbv) atcv;
        atbw a = mo49807a(atbv, bArr);
        bgm bgm2 = a.f90038a;
        atbv atbv2 = a.f90040c;
        atcc atcc = a.f90039b;
        try {
            atcg.m75538a(bgm2.mo3116a(a.f90041d, "ignored"));
            try {
                byte[] bytes = asix.m74200a(askf).getBytes(StandardCharsets.UTF_8);
                byte[][] bArr2 = new byte[2][];
                atcc atcc2 = atcc;
                if (bmtc2.f130815a == 1) {
                    bmsp = (bmsp) bmtc2.f130816b;
                } else {
                    bmsp = bmsp.f130728e;
                }
                bArr2[0] = m75449a(bmsp.f130733d);
                String valueOf = String.valueOf(asti.m74760a(bytes));
                bArr2[1] = (valueOf.length() == 0 ? new String("2") : "2".concat(valueOf)).getBytes(StandardCharsets.UTF_8);
                byte[] a2 = bgy.m3014a(bArr2);
                bha bha3 = bha.NO_FURTHER_ACTION_REQUIRED;
                bfw bfw2 = new bfw();
                try {
                    bgm = bgm2;
                    try {
                        bgs.f3191a.mo3121a("CERTIFICATE", a2);
                        new bfa().mo3074a();
                        bgo.m2984a(bfw2, bha3, "06");
                    } catch (Exception e) {
                        e = e;
                        try {
                            Log.e("core-hceclient", "::tokenChannelUpdate::catch::", e);
                            bgo.m2984a(bfw2, bgo.m2983a(e), "06");
                            atcg.m75538a(bfw2);
                            byte[][] bArr3 = new byte[3][];
                            boan boan = boan.f132470d;
                            if (bmtc2.f130815a == 1) {
                            }
                            bArr3[0] = m75449a(boan.mo68794a(bmsp2.f130731b.mo73780k()));
                            boan boan2 = boan.f132470d;
                            if (bmtc2.f130815a == 1) {
                            }
                            bArr3[1] = m75449a(boan2.mo68794a(bmsp3.f130730a.mo73780k()));
                            boan boan3 = boan.f132470d;
                            if (bmtc2.f130815a == 1) {
                            }
                            bArr3[2] = m75449a(boan3.mo68794a(bmsp4.f130732c.mo73780k()));
                            bxvd = atbv2.f90036b;
                            if (m75448a(atbv)) {
                            }
                            long j3 = 0;
                            if (j2 != 0) {
                            }
                            if (bxvd.f164950c) {
                            }
                            bycu bycu = (bycu) bxvd.f164949b;
                            int i = bycu.f165707a | 4;
                            bycu.f165707a = i;
                            bycu.f165709c = j3;
                            bycu.f165707a = i | 8;
                            bycu.f165710d = j2;
                            bgm.mo3115a();
                            atcg.m75539a(bgm);
                            atbv2.mo49799a(atcc2);
                            return atbv2;
                        } catch (Throwable th) {
                            th = th;
                            bgo.m2984a(bfw2, bha3, "06");
                            throw th;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    bgm = bgm2;
                    Log.e("core-hceclient", "::tokenChannelUpdate::catch::", e);
                    bgo.m2984a(bfw2, bgo.m2983a(e), "06");
                    atcg.m75538a(bfw2);
                    byte[][] bArr32 = new byte[3][];
                    boan boan4 = boan.f132470d;
                    if (bmtc2.f130815a == 1) {
                    }
                    bArr32[0] = m75449a(boan4.mo68794a(bmsp2.f130731b.mo73780k()));
                    boan boan22 = boan.f132470d;
                    if (bmtc2.f130815a == 1) {
                    }
                    bArr32[1] = m75449a(boan22.mo68794a(bmsp3.f130730a.mo73780k()));
                    boan boan32 = boan.f132470d;
                    if (bmtc2.f130815a == 1) {
                    }
                    bArr32[2] = m75449a(boan32.mo68794a(bmsp4.f130732c.mo73780k()));
                    bxvd = atbv2.f90036b;
                    if (m75448a(atbv)) {
                    }
                    long j32 = 0;
                    if (j2 != 0) {
                    }
                    if (bxvd.f164950c) {
                    }
                    bycu bycu2 = (bycu) bxvd.f164949b;
                    int i2 = bycu2.f165707a | 4;
                    bycu2.f165707a = i2;
                    bycu2.f165709c = j32;
                    bycu2.f165707a = i2 | 8;
                    bycu2.f165710d = j2;
                    bgm.mo3115a();
                    atcg.m75539a(bgm);
                    atbv2.mo49799a(atcc2);
                    return atbv2;
                } catch (Throwable th2) {
                    th = th2;
                    bgo.m2984a(bfw2, bha3, "06");
                    throw th;
                }
                atcg.m75538a(bfw2);
                byte[][] bArr322 = new byte[3][];
                boan boan42 = boan.f132470d;
                if (bmtc2.f130815a == 1) {
                    bmsp2 = (bmsp) bmtc2.f130816b;
                } else {
                    bmsp2 = bmsp.f130728e;
                }
                bArr322[0] = m75449a(boan42.mo68794a(bmsp2.f130731b.mo73780k()));
                boan boan222 = boan.f132470d;
                if (bmtc2.f130815a == 1) {
                    bmsp3 = (bmsp) bmtc2.f130816b;
                } else {
                    bmsp3 = bmsp.f130728e;
                }
                bArr322[1] = m75449a(boan222.mo68794a(bmsp3.f130730a.mo73780k()));
                boan boan322 = boan.f132470d;
                if (bmtc2.f130815a == 1) {
                    bmsp4 = (bmsp) bmtc2.f130816b;
                } else {
                    bmsp4 = bmsp.f130728e;
                }
                bArr322[2] = m75449a(boan322.mo68794a(bmsp4.f130732c.mo73780k()));
                bxvd = atbv2.f90036b;
                if (m75448a(atbv)) {
                    String str = new String(bgy.m3014a(bArr322), StandardCharsets.UTF_8);
                    bha2 = bha.NO_FURTHER_ACTION_REQUIRED;
                    bfw = new bfw();
                    try {
                        if (bgq.REFRESH.equals(bgp.OPERATION.f3179b)) {
                            bgr bgr = bgs.f3191a;
                            bgr.mo3121a("TOKEN_DATA", str);
                            new bex().mo3074a();
                            new bfp().mo3074a();
                            String str2 = (String) bgr.mo3119a("TOKEN_DATA_SIGNATURE", false);
                            bgo.m2984a(bfw, bha2, "04");
                            atcg.m75538a(bfw);
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            bycu bycu3 = (bycu) bxvd.f164949b;
                            bycu bycu4 = bycu.f165705k;
                            bycu3.f165707a &= -2;
                            bycu3.f165708b = bycu.f165705k.f165708b;
                        } else {
                            throw new bfq(bha.OPERATION_NOT_SUPPORTED);
                        }
                    } catch (Exception e3) {
                        Log.e("core-hceclient", "::tokenUpdate::catch::", e3);
                        bgo.m2984a(bfw, bgo.m2983a(e3), "04");
                    }
                } else {
                    String str3 = new String(bgy.m3014a(bArr322), StandardCharsets.UTF_8);
                    bha = bha.NO_FURTHER_ACTION_REQUIRED;
                    bfx = new bfx();
                    try {
                        if (bgq.PROVISION.equals(bgp.OPERATION.f3179b)) {
                            bgr bgr2 = bgs.f3191a;
                            bgr2.mo3121a("TOKEN_DATA", str3);
                            new bex().mo3074a();
                            if (((Boolean) bgr2.mo3119a("IS_PROVISIONING_FLOW", true)).booleanValue()) {
                                new bfl().mo3074a();
                            } else {
                                new bfp().mo3074a();
                            }
                            String str4 = (String) bgr2.mo3119a("TOKEN_DATA_SIGNATURE", false);
                            bfx.f3137a = "ISSUER_COUNTRY_CODE=" + bgs.f3191a.mo3119a("ISSUER_COUNTRY_CODE", true) + ",PPSE_RESPONSE=" + bgs.f3191a.mo3119a("PPSE_RESPONSE", true);
                            bgo.m2984a(bfx, bha, "03");
                            atcg.m75538a(bfx);
                            Map a3 = bmyx.m108640a(',').mo66919b('=').mo66915a(bfx.f3137a);
                            bxtx a4 = bxtx.m123261a(asti.m74762a((String) a3.get("PPSE_RESPONSE")));
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            bycu bycu5 = (bycu) bxvd.f164949b;
                            bycu bycu6 = bycu.f165705k;
                            a4.getClass();
                            bycu5.f165707a |= 64;
                            bycu5.f165713g = a4;
                            int parseInt = Integer.parseInt((String) a3.get("ISSUER_COUNTRY_CODE"));
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            bycu bycu7 = (bycu) bxvd.f164949b;
                            bycu7.f165707a |= 128;
                            bycu7.f165714h = parseInt;
                        } else {
                            throw new bfq(bha.OPERATION_NOT_SUPPORTED);
                        }
                    } catch (Exception e4) {
                        Log.e("core-hceclient", "::tokenPerso::catch::", e4);
                        bgo.m2984a(bfx, bgo.m2983a(e4), "03");
                    }
                }
                long j322 = 0;
                if (j2 != 0) {
                    j322 = System.currentTimeMillis() - j2;
                }
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bycu bycu22 = (bycu) bxvd.f164949b;
                int i22 = bycu22.f165707a | 4;
                bycu22.f165707a = i22;
                bycu22.f165709c = j322;
                bycu22.f165707a = i22 | 8;
                bycu22.f165710d = j2;
                bgm.mo3115a();
                atcg.m75539a(bgm);
                atbv2.mo49799a(atcc2);
                return atbv2;
            } catch (asks e5) {
                throw new atcz(e5);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            bgm = bgm2;
            bgm.mo3115a();
            atcg.m75539a(bgm);
            throw th;
        }
    }

    /* renamed from: a */
    static byte[] m75449a(String str) {
        String valueOf = String.valueOf(str);
        return (valueOf.length() == 0 ? new String("1") : "1".concat(valueOf)).getBytes(StandardCharsets.UTF_8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final atbw mo49807a(atbv atbv, byte[] bArr) {
        atbv atbv2;
        atcc atcc;
        bgq bgq;
        bhd.m3026a(this.f90042a.getApplicationContext());
        if (!m75448a(atbv)) {
            atcc = new atcc(null, null, null, bArr, null);
            atbv2 = new atbv(this.f90042a, bycu.f165705k);
            bgq = bgq.PROVISION;
        } else {
            atcc a = atbv.mo49794a(bArr);
            bgq = bgq.REFRESH;
            atbv2 = atbv;
            atcc = a;
        }
        return new atbw(atcg.m75537a(atcc), atcc, atbv2, bgq);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ atcv mo49808a(askf askf, atcv atcv, bmtc bmtc, byte[] bArr, long j) {
        try {
            return m75450b(askf, atcv, bmtc, bArr, j);
        } catch (atcf e) {
            if (!cgwn.f187872a.mo6606a().mo84626g() || !e.f90078a.f3134c.equals(bha.TOKEN_REF_ID_ALREADY_PROVISIONED.f3219r)) {
                throw new RuntimeException("Error updating bundle", e);
            }
            try {
                return m75450b(askf, null, bmtc, bArr, j);
            } catch (atcf e2) {
                throw new RuntimeException("Error updating bundle on reperso retry", e2);
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
        bgm a = atcg.m75537a(new atcc("", null, null, null, ""));
        try {
            bfy a2 = a.mo3117a(System.currentTimeMillis(), "ignored");
            atcg.m75539a(a);
            String str = a2.f3134c;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btlw btlw = (btlw) da.f164949b;
            str.getClass();
            btlw.f149444a = str;
            String str2 = a2.f3135d;
            str2.getClass();
            btlw.f149445b = str2;
            String str3 = a2.f3136e;
            str3.getClass();
            btlw.f149446c = str3;
            String num = Integer.toString(a2.f3138a);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            num.getClass();
            ((btlw) da.f164949b).f149447d = num;
            String num2 = Integer.toString(a2.f3140f);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            num2.getClass();
            ((btlw) da.f164949b).f149448e = num2;
            btmr a3 = atvf.m76450a(this.f90042a);
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
            atcg.m75539a(a);
            throw th;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgr.a(java.lang.String, boolean):java.lang.Object
     arg types: [java.lang.String, int]
     candidates:
      bgr.a(java.lang.String, java.lang.Object):void
      bgr.a(java.lang.String, boolean):java.lang.Object */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ec, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r3.mo3115a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fa, code lost:
        throw r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fb, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fc, code lost:
        p000.atcg.m75539a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ff, code lost:
        throw r11;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:19:0x0075, B:40:0x00ef] */
    /* renamed from: a */
    public final CryptoParameters mo49810a(atcv atcv) {
        bha bha;
        bfs bfs;
        bxvd da = btli.f149372c.mo74144da();
        bxvd da2 = btjy.f149201d.mo74144da();
        atbw a = mo49807a((atbv) atcv, null);
        bgm bgm = a.f90038a;
        atcc atcc = a.f90039b;
        try {
            atcg.m75538a(bgm.mo3116a(a.f90041d, "ignored"));
            byte[] bArr = new byte[0];
            bha = bha.NO_FURTHER_ACTION_REQUIRED;
            bfs = new bfs();
            try {
                bgr bgr = bgs.f3191a;
                bgr.mo3121a("CHANNEL_PARAM", bArr);
                new bez().mo3074a();
                bfs.f3128a = (String) bgr.mo3119a("DEVICE_PUBLIC_KEY", false);
                bgo.m2984a(bfs, bha, "05");
            } catch (Exception e) {
                Log.e("core-hceclient", "::tokenChannelInitialize::catch::", e);
                bgo.m2984a(bfs, bgo.m2983a(e), "05");
            }
            atcg.m75538a(bfs);
            String str = bfs.f3128a;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            str.getClass();
            ((btjy) da2.f164949b).f149203a = str;
            bgm.mo3115a();
            bfy a2 = bgm.mo3117a(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()), "ignore");
            String a3 = stm.m36299a(a2.f3142h);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            a3.getClass();
            ((btjy) da2.f164949b).f149205c = a3;
            String a4 = stm.m36299a(a2.f3143i);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            a4.getClass();
            ((btjy) da2.f164949b).f149204b = a4;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btli btli = (btli) da.f164949b;
            btjy btjy = (btjy) da2.mo74062i();
            btjy.getClass();
            btli.f149375b = btjy;
            btli.f149374a = 1;
            CryptoParameters cryptoParameters = new CryptoParameters((btli) da.mo74062i(), atcc.f90068d);
            atcg.m75539a(bgm);
            return cryptoParameters;
        } catch (atcf e2) {
            throw new RuntimeException("Error talking to the SDK", e2);
        } catch (Throwable th) {
            bgo.m2984a(bfs, bha, "05");
            throw th;
        }
    }
}
