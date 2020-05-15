package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: atbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atbv implements atcv {

    /* renamed from: a */
    public static final byte[] f90034a = new byte[0];

    /* renamed from: c */
    private static final srn f90035c = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    public final bxvd f90036b;

    /* renamed from: d */
    private final Context f90037d;

    public atbv(Context context, bycu bycu) {
        this.f90037d = context;
        bxvd bxvd = (bxvd) bycu.mo74142c(5);
        bxvd.mo73625a((bxvk) bycu);
        this.f90036b = bxvd;
        bhd.m3026a(context.getApplicationContext());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgr.a(java.lang.String, boolean):java.lang.Object
     arg types: [java.lang.String, int]
     candidates:
      bgr.a(java.lang.String, java.lang.Object):void
      bgr.a(java.lang.String, boolean):java.lang.Object */
    /* renamed from: a */
    private final atcq m75432a(atcp atcp) {
        bha bha;
        bfw bfw;
        bha bha2;
        bfv bfv;
        byte[] bArr;
        try {
            if (m75433i()) {
                atcc a = mo49794a((byte[]) null);
                bgm a2 = atcg.m75537a(a);
                try {
                    atcg.m75538a(a2.mo3116a(bgq.PAYMENT, "token ref id"));
                    String a3 = asti.m74760a(bqcn.m112583a((int) atcp.f90083a));
                    byte[] bArr2 = f90034a;
                    bha = bha.NO_FURTHER_ACTION_REQUIRED;
                    bfw = new bfw();
                    try {
                        if (!bgq.PAYMENT.equals(bgp.OPERATION.f3179b)) {
                            if (!bgq.TAP_PAYMENT.equals(bgp.OPERATION.f3179b)) {
                                throw new bfq(bha.OPERATION_NOT_SUPPORTED);
                            }
                        }
                        bgs.f3191a.mo3121a("CDCVM_BLOB", bArr2);
                        new bfo().mo3074a();
                        bgo.m2984a(bfw, bha, "08");
                    } catch (Exception e) {
                        Log.e("core-hceclient", "::tokenSetCDCVM::catch::", e);
                        bgo.m2984a(bfw, bgo.m2983a(e), "08");
                    }
                    atcg.m75538a(bfw);
                    bha2 = bha.NO_FURTHER_ACTION_REQUIRED;
                    bfv = new bfv();
                    try {
                        if (!bgq.PAYMENT.equals(bgp.OPERATION.f3179b)) {
                            throw new bfq(bha.OPERATION_NOT_SUPPORTED);
                        } else if (a3 == null || a3.trim().length() != 8 || "baaaaaad".trim().isEmpty()) {
                            throw new bfq(bha.INVALID_DATA);
                        } else {
                            bgr bgr = bgs.f3191a;
                            bes.m2845a("UNPREDICTABLE_NUMBER", a3);
                            bes.m2845a("TRANSACTION_CONTEXT", "baaaaaad");
                            new bfd().mo3074a();
                            bfv.f3133a = (String) bgr.mo3119a("INAPP_PAYLOAD", true);
                            bgo.m2984a(bfv, bha2, "09");
                            atcg.m75538a(bfv);
                            byte[] a4 = asti.m74762a(bfv.f3133a);
                            bft a5 = a2.mo3115a();
                            atcg.m75538a(a5);
                            String str = a5.f3129a;
                            String str2 = new String(a4, 0, 15, StandardCharsets.UTF_8);
                            int parseInt = Integer.parseInt(new String(a4, 15, 2, StandardCharsets.UTF_8)) + 2000;
                            int parseInt2 = Integer.parseInt(new String(a4, 17, 2, StandardCharsets.UTF_8));
                            byte[] copyOfRange = Arrays.copyOfRange(a4, 21, 41);
                            byte[] copyOfRange2 = Arrays.copyOfRange(a4, 41, 61);
                            if (!Arrays.equals(new byte[20], copyOfRange2)) {
                                byte[] copyOf = Arrays.copyOf(copyOfRange, 40);
                                System.arraycopy(copyOfRange2, 0, copyOf, 20, 20);
                                bArr = copyOf;
                            } else {
                                bArr = copyOfRange;
                            }
                            mo49799a(a);
                            atcm atcm = new atcm(new atct(bArr, str2, parseInt2, parseInt, null, str));
                            atcg.m75539a(a2);
                            return atcm;
                        }
                    } catch (Exception e2) {
                        Log.e("core-hceclient", "::tokenInApp::catch::", e2);
                        bgo.m2984a(bfv, bgo.m2983a(e2), "09");
                    }
                } catch (atcf e3) {
                    try {
                        a2.mo3115a();
                        throw new atcr(e3);
                    } catch (Throwable th) {
                        atcg.m75539a(a2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    bgo.m2984a(bfw, bha, "08");
                    throw th2;
                }
            } else {
                throw new atcr();
            }
        } catch (atcz e4) {
            throw new atcr(e4);
        }
    }

    /* renamed from: i */
    private final boolean m75433i() {
        bfy c = mo49801c();
        int i = c.f3138a;
        boolean z = c.f3139b;
        String str = c.f3136e;
        String str2 = c.f3134c;
        String str3 = c.f3135d;
        return i > 0;
    }

    /* renamed from: b */
    public final btjw mo49800b() {
        return btjw.f149188c;
    }

    /* renamed from: c */
    public final bfy mo49801c() {
        bgm a = atcg.m75537a(mo49794a((byte[]) null));
        try {
            return a.mo3117a(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - ((bycu) this.f90036b.f164949b).f165709c), "token ref id");
        } finally {
            atcg.m75539a(a);
        }
    }

    /* renamed from: d */
    public final atcs mo49802d() {
        long currentTimeMillis = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(mo49801c().f3141g);
        long millis = TimeUnit.HOURS.toMillis(6);
        long j = ((bycu) this.f90036b.f164949b).f165709c;
        return new atcs(currentTimeMillis + j, currentTimeMillis + millis + j);
    }

    /* renamed from: e */
    public final boolean mo49803e() {
        return mo49801c().f3139b;
    }

    /* renamed from: f */
    public final boolean mo49804f() {
        return false;
    }

    /* renamed from: g */
    public final int mo49805g() {
        return ((bycu) this.f90036b.f164949b).f165714h;
    }

    /* renamed from: h */
    public final byte[] mo49806h() {
        return ((bycu) this.f90036b.mo74062i()).mo73642k();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ asqs mo49793a(askf askf, asqq asqq, String str) {
        try {
            if (m75433i()) {
                return new asre(mo49794a((byte[]) null), asqq, ((bycu) this.f90036b.f164949b).f165713g.mo73780k(), str);
            }
            return null;
        } catch (atcf | atcz e) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final atcc mo49794a(byte[] bArr) {
        bycy bycy;
        bycw bycw;
        bycw bycw2;
        bycu bycu = (bycu) this.f90036b.f164949b;
        String str = bycu.f165715i;
        bycy bycy2 = bycu.f165712f;
        if (bycy2 != null) {
            bycy = bycy2;
        } else {
            bycy = bycy.f165733j;
        }
        bycu bycu2 = (bycu) this.f90036b.f164949b;
        if ((bycu2.f165707a & 512) != 0) {
            bycw bycw3 = bycu2.f165716j;
            if (bycw3 != null) {
                bycw = bycw3;
                return new atcc(str, bycy, bycw, bArr, ((bycu) this.f90036b.f164949b).f165711e);
            }
            bycw2 = bycw.f165723i;
        } else {
            bycw2 = null;
        }
        bycw = bycw2;
        return new atcc(str, bycy, bycw, bArr, ((bycu) this.f90036b.f164949b).f165711e);
    }

    /* renamed from: a */
    public final atcq mo49795a(atcp atcp, askf askf, btiy btiy) {
        return m75432a(atcp);
    }

    /* renamed from: a */
    public final btmd mo49796a() {
        bxvd da = btlw.f149442g.mo74144da();
        bfy c = mo49801c();
        if (c.f3142h == null && c.f3141g == -1) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((btlw) da.f164949b).f149450h = true;
        }
        String str = c.f3134c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btlw btlw = (btlw) da.f164949b;
        str.getClass();
        btlw.f149444a = str;
        String str2 = c.f3135d;
        str2.getClass();
        btlw.f149445b = str2;
        String str3 = c.f3136e;
        str3.getClass();
        btlw.f149446c = str3;
        String num = Integer.toString(c.f3138a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        num.getClass();
        ((btlw) da.f164949b).f149447d = num;
        String num2 = Integer.toString(c.f3140f);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        num2.getClass();
        ((btlw) da.f164949b).f149448e = num2;
        btmr a = atvf.m76450a(this.f90037d);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((btlw) da.f164949b).f149449f = a;
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
    }

    /* renamed from: a */
    public final void mo49797a(asqs asqs) {
        try {
            m75432a(new atcp());
        } catch (atcr e) {
        }
    }

    /* renamed from: a */
    public final void mo49798a(asqs asqs, askf askf) {
        if (!(asqs instanceof asre)) {
            bnsl bnsl = (bnsl) f90035c.mo68388c();
            bnsl.mo68432a("atbv", "a", 191, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Unexpected applet type: %s. Doing nothing.", asqs.getClass());
            return;
        }
        asre asre = (asre) asqs;
        try {
            asqs.mo49387b().f89415k = mo49801c().f3138a;
        } catch (atcz e) {
            bnsl bnsl2 = (bnsl) f90035c.mo68390d();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("atbv", "a", 198, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to get number of keys left");
        }
        mo49799a(asre.f89486a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo49799a(atch atch) {
        if (atch != null) {
            bxvd bxvd = this.f90036b;
            String b = atch.mo49820b();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bycu bycu = (bycu) bxvd.f164949b;
            bycu bycu2 = bycu.f165705k;
            b.getClass();
            bycu.f165707a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bycu.f165715i = b;
            String a = stm.m36299a(atch.mo49822d());
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bycu bycu3 = (bycu) bxvd.f164949b;
            a.getClass();
            bycu3.f165707a |= 16;
            bycu3.f165711e = a;
            bycy a2 = atch.mo49819a();
            if (a2 == null) {
                bxvd bxvd2 = this.f90036b;
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                bycu bycu4 = (bycu) bxvd2.f164949b;
                bycu4.f165712f = null;
                bycu4.f165707a &= -33;
            } else {
                bxvd bxvd3 = this.f90036b;
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                bycu bycu5 = (bycu) bxvd3.f164949b;
                a2.getClass();
                bycu5.f165712f = a2;
                bycu5.f165707a |= 32;
            }
            bycw c = atch.mo49821c();
            if (c == null) {
                bxvd bxvd4 = this.f90036b;
                if (bxvd4.f164950c) {
                    bxvd4.mo74035c();
                    bxvd4.f164950c = false;
                }
                bycu bycu6 = (bycu) bxvd4.f164949b;
                bycu6.f165716j = null;
                bycu6.f165707a &= -513;
                return;
            }
            bxvd bxvd5 = this.f90036b;
            if (bxvd5.f164950c) {
                bxvd5.mo74035c();
                bxvd5.f164950c = false;
            }
            bycu bycu7 = (bycu) bxvd5.f164949b;
            c.getClass();
            bycu7.f165716j = c;
            bycu7.f165707a |= 512;
        }
    }
}
