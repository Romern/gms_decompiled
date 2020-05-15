package p000;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.paymentbundle.api.CryptoParameters;
import com.google.android.gms.tapandpay.security.StorageKey;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: atro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atro {

    /* renamed from: b */
    private static final srn f90714b = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    final atds f90715a;

    /* renamed from: c */
    private Bundle f90716c;

    /* renamed from: d */
    private final askf f90717d;

    /* renamed from: e */
    private final String f90718e;

    /* renamed from: f */
    private final byte[] f90719f;

    /* renamed from: g */
    private final String f90720g;

    /* renamed from: h */
    private final String f90721h;

    /* renamed from: i */
    private final atbq f90722i;

    /* renamed from: j */
    private final CryptoParameters f90723j;

    /* renamed from: k */
    private final String f90724k;

    /* renamed from: l */
    private final btiy f90725l;

    /* renamed from: m */
    private final boolean f90726m;

    /* renamed from: n */
    private final byte[] f90727n;

    /* renamed from: o */
    private final String f90728o;

    /* renamed from: p */
    private String f90729p;

    /* renamed from: q */
    private final String f90730q;

    /* renamed from: r */
    private final PushTokenizeRequest f90731r;

    static {
        new Uri.Builder().scheme("content").authority("com.google.android.wearable.settings").path("tapandpay").build();
    }

    public atro(askf askf, btiy btiy, String str, byte[] bArr, String str2, String str3, String str4, boolean z, byte[] bArr2, String str5, String str6, PushTokenizeRequest pushTokenizeRequest, atbq atbq) {
        this.f90717d = askf;
        this.f90718e = str;
        this.f90719f = bArr;
        this.f90720g = str2;
        this.f90721h = str3;
        this.f90722i = atbq;
        this.f90724k = stm.m36299a(str4);
        this.f90723j = atbq.mo49786b(askf.f89126d, str3).mo49810a(null);
        this.f90730q = str6;
        this.f90725l = btiy;
        this.f90731r = pushTokenizeRequest;
        this.f90726m = z;
        this.f90727n = bArr2;
        this.f90728o = str5;
        this.f90715a = atds.m75666a(askf);
    }

    /* JADX INFO: additional move instructions added (2) to help type inference */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: btnf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: btnf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: btnf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: btnf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: btnf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: btnf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: btnf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: btnf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: btnf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: btnf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: btnf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v37, resolved type: btnf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v40, resolved type: btnf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v52, resolved type: btnf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v69, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v70, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v71, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v73, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v74, resolved type: btnf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v75, resolved type: btnf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v76, resolved type: btnf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v79, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v80, resolved type: btnf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v81, resolved type: btnf} */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02fa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02fd, code lost:
        r30 = "b";
        r5 = null;
        r2 = r0;
        r8 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0307, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x030a, code lost:
        r30 = "b";
        r5 = null;
        r2 = r0;
        r8 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0314, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0315, code lost:
        r28 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0322, code lost:
        r30 = "b";
        r5 = null;
        r8 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00be, code lost:
        r2 = r0;
        r8 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
        r6 = "b";
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x05a3, code lost:
        r8 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
        r6 = "b";
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c8, code lost:
        r2 = r0;
        r8 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
        r6 = "b";
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d0, code lost:
        r2 = r0;
        r28 = r3;
        r8 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
        r6 = "b";
        r5 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02fa A[ExcHandler: asks | RuntimeException (r0v27 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:89:0x01cb] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0307 A[ExcHandler: atcz | IOException (r0v26 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:89:0x01cb] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0599  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x05a2 A[ExcHandler: atdb (e atdb), Splitter:B:1:0x000d] */
    /* renamed from: b */
    private final Bundle m76254b() {
        btnf btnf;
        int i;
        int i2;
        byte[] bArr;
        String str;
        String str2;
        byte[] bArr2;
        String str3;
        String str4;
        String str5;
        byte[] bArr3;
        atfh atfh;
        byte[] bArr4;
        String str6;
        String str7;
        String str8;
        byte[] bArr5;
        String str9;
        String str10;
        byte[] bArr6;
        Throwable th;
        byte[] bArr7;
        String str11;
        String str12;
        byte[] bArr8;
        Throwable th2;
        btnf btnf2;
        HashMap hashMap;
        atgn atgn;
        byte[] k;
        String str13;
        String[] strArr;
        byte[] bArr9;
        String str14;
        byte[] bArr10;
        String str15;
        byte[] bArr11;
        byte[] bArr12;
        byte[] bArr13;
        byte[] bArr14;
        String str16;
        String str17;
        String str18;
        askf askf;
        StorageKey a;
        athj athj;
        btlr btlr;
        String str19 = "Unable to fetch cards";
        String str20 = "atro";
        try {
            Bundle bundle = new Bundle();
            this.f90729p = this.f90725l.f149056a;
            btiw a2 = new athh().mo49987a(this.f90717d);
            bxvd da = btmv.f149551m.mo74144da();
            String str21 = a2.f149047b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btmv btmv = (btmv) da.f164949b;
            str21.getClass();
            btmv.f149555c = str21;
            a2.getClass();
            btmv.f149556d = a2;
            String a3 = stm.m36299a(this.f90718e);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a3.getClass();
            ((btmv) da.f164949b).f149557e = a3;
            btmr a4 = atvf.m76450a(this.f90717d.f89126d);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btmv btmv2 = (btmv) da.f164949b;
            a4.getClass();
            btmv2.f149558f = a4;
            String str22 = this.f90720g;
            str22.getClass();
            btmv2.f149560h = str22;
            String a5 = stm.m36299a(this.f90724k);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a5.getClass();
            ((btmv) da.f164949b).f149561i = a5;
            String a6 = stm.m36299a(this.f90730q);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btmv btmv3 = (btmv) da.f164949b;
            a6.getClass();
            btmv3.f149562j = a6;
            btiy btiy = this.f90725l;
            if (btiy != null) {
                btiy.getClass();
                btmv3.f149553a = btiy;
            }
            if (!TextUtils.isEmpty(this.f90728o)) {
                String str23 = this.f90728o;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                str23.getClass();
                ((btmv) da.f164949b).f149564l = str23;
            } else {
                bxtx a7 = bxtx.m123261a(this.f90719f);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                a7.getClass();
                ((btmv) da.f164949b).f149554b = a7;
            }
            CryptoParameters cryptoParameters = this.f90723j;
            if (cryptoParameters != null) {
                btli btli = cryptoParameters.f108621a;
                if (btli != null) {
                    btli.getClass();
                    ((btmv) da.f164949b).f149559g = btli;
                }
            }
            PushTokenizeRequest pushTokenizeRequest = this.f90731r;
            if (pushTokenizeRequest != null) {
                bxtx a8 = bxtx.m123261a(pushTokenizeRequest.f108572c);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                a8.getClass();
                ((btmv) da.f164949b).f149563k = a8;
            } else if (this.f90726m) {
                byte[] bArr15 = this.f90727n;
                if (bArr15 != null) {
                    bxtx a9 = bxtx.m123261a(bArr15);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    a9.getClass();
                    ((btmv) da.f164949b).f149563k = a9;
                }
            }
            atbq atbq = this.f90722i;
            askf askf2 = this.f90717d;
            String str24 = this.f90721h;
            String str25 = this.f90729p;
            atbq.mo49787b().mo50002b(askf2);
            atda atda = new atda(askf2, str25, str24, "new");
            btmv btmv4 = (btmv) da.mo74062i();
            askf askf3 = this.f90717d;
            btmw btmw = btmw.f149565h;
            if (!stm.m36302d(btmv4.f149557e)) {
                hashMap = new HashMap();
                hashMap.put(4, 13);
            } else {
                hashMap = new HashMap();
            }
            btmw btmw2 = (btmw) atff.m75760a(askf3, "e/cardtokenization/tokenizecard", btmv4, btmw, hashMap);
            bundle.putByteArray("data_tokenize_card_response", btmw2.mo73642k());
            int a10 = btnx.m116967a(btmw2.f149567a);
            if (a10 != 0) {
                if (a10 == 2) {
                    return bundle;
                }
            }
            this.f90715a.mo49859d();
            if (!atbq.m75408a(this.f90721h)) {
                try {
                    atbq atbq2 = this.f90722i;
                    String str26 = this.f90720g;
                    CryptoParameters cryptoParameters2 = this.f90723j;
                    if (cryptoParameters2 != null) {
                        bArr14 = cryptoParameters2.f108622b;
                    } else {
                        bArr14 = null;
                    }
                    askf askf4 = this.f90717d;
                    try {
                        atbq2.mo49781a();
                        askf = atda.f90100a;
                        a = atbm.m75385a().mo49999a(askf);
                        str3 = str19;
                        athj = new athj(a);
                        str18 = str20;
                    } catch (aths e) {
                        e = e;
                        str3 = str19;
                        str18 = str20;
                        str17 = "b";
                        str16 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                        bArr3 = null;
                        throw new atcz(e);
                    }
                    try {
                        SQLiteDatabase a11 = atbm.m75382a(askf.f89126d);
                        a11.beginTransaction();
                        str17 = "b";
                        str16 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                        try {
                            if (DatabaseUtils.queryNumEntries(a11, "PaymentBundles", "bundle_id = ? AND account_id = ? AND environment = ?", atbm.m75392a(atda.f90102c, askf)) <= 0) {
                                bArr3 = null;
                                bArr3 = null;
                                bArr3 = null;
                                bArr3 = null;
                                bArr3 = null;
                                bArr3 = null;
                                bArr3 = null;
                                bArr3 = null;
                                try {
                                    a11.insertOrThrow("PaymentBundles", null, atbm.m75381a(atda, athj, a.f108658a));
                                    a11.setTransactionSuccessful();
                                    try {
                                        a11.endTransaction();
                                    } catch (aths e2) {
                                        e = e2;
                                        throw new atcz(e);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    Throwable th4 = th;
                                    a11.endTransaction();
                                    throw th4;
                                }
                                try {
                                    btlr btlr2 = btmw2.f149568b;
                                    if (btlr2 != null) {
                                        btlr = btlr2;
                                    } else {
                                        btlr = btlr.f149408e;
                                    }
                                    atbq2.mo49782a(askf4, atda, str26, bArr14, btlr, btmw2.f149569c.mo73780k(), btmw2.f149570d, btmw2.f149572f, btmw2.f149573g);
                                    atbq2.mo49783a(askf4.f89126d, askf4.f89125c);
                                    this.f90715a.mo49859d();
                                    CardInfo b = this.f90715a.mo49853b(this.f90729p);
                                    if (b != null) {
                                        bundle.putParcelable("data_card_info", b);
                                        return bundle;
                                    }
                                    throw new RuntimeException();
                                } catch (atdb e3) {
                                    str19 = str3;
                                    str20 = str18;
                                    str2 = str17;
                                    str = str16;
                                    bArr9 = bArr3;
                                    bArr2 = bArr9;
                                    try {
                                        this.f90715a.mo49859d();
                                        btnf = bArr2;
                                        i2 = 102;
                                        i = 2;
                                        bArr = bArr2;
                                    } catch (asks | atfh | IOException e4) {
                                        bnsl bnsl = (bnsl) f90714b.mo68388c();
                                        bnsl.mo68437a(e4);
                                        bnsl.mo68432a(str20, str2, 267, str);
                                        bnsl.mo68405a(str19);
                                        btnf = bArr2;
                                        i2 = 102;
                                        i = 2;
                                        bArr = bArr2;
                                    }
                                    String valueOf = String.valueOf(btmt.m116935c(i));
                                    String valueOf2 = String.valueOf(btnf);
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 79 + String.valueOf(valueOf2).length());
                                    sb.append("Error during tokenization with errorCode=");
                                    sb.append(valueOf);
                                    sb.append(", errorType=");
                                    sb.append(i2);
                                    sb.append(", errorMessage=");
                                    sb.append(valueOf2);
                                    throw new atrn(sb.toString(), i2, btnf, bArr);
                                } catch (atfh e5) {
                                    atfh = e5;
                                    str20 = str18;
                                    str5 = str17;
                                    str4 = str16;
                                    btmu a12 = atvb.m76439a(atfh.f90231a);
                                    if (athh.m75883a(this.f90717d, atfh)) {
                                    }
                                    bArr = bArr4;
                                    btnf = atfh.f90231a;
                                    String valueOf3 = String.valueOf(btmt.m116935c(i));
                                    String valueOf22 = String.valueOf(btnf);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 79 + String.valueOf(valueOf22).length());
                                    sb2.append("Error during tokenization with errorCode=");
                                    sb2.append(valueOf3);
                                    sb2.append(", errorType=");
                                    sb2.append(i2);
                                    sb2.append(", errorMessage=");
                                    sb2.append(valueOf22);
                                    throw new atrn(sb2.toString(), i2, btnf, bArr);
                                } catch (atcz | IOException e6) {
                                    th = e6;
                                    str20 = str18;
                                    str10 = str17;
                                    str9 = str16;
                                    bArr12 = bArr3;
                                    bArr6 = bArr12;
                                    bnsl bnsl2 = (bnsl) f90714b.mo68388c();
                                    bnsl2.mo68437a(th);
                                    bnsl2.mo68432a(str20, str10, 370, str9);
                                    bnsl2.mo68405a("Backing off from tokenizing card");
                                    btnf = atey.m75751a(this.f90717d, C0126R.string.tp_add_card_error_title, C0126R.string.tp_add_card_error_content);
                                    i2 = 101;
                                    i = 2;
                                    bArr = bArr6;
                                    String valueOf32 = String.valueOf(btmt.m116935c(i));
                                    String valueOf222 = String.valueOf(btnf);
                                    StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf32).length() + 79 + String.valueOf(valueOf222).length());
                                    sb22.append("Error during tokenization with errorCode=");
                                    sb22.append(valueOf32);
                                    sb22.append(", errorType=");
                                    sb22.append(i2);
                                    sb22.append(", errorMessage=");
                                    sb22.append(valueOf222);
                                    throw new atrn(sb22.toString(), i2, btnf, bArr);
                                } catch (asks | RuntimeException e7) {
                                    th2 = e7;
                                    str20 = str18;
                                    str12 = str17;
                                    str11 = str16;
                                    bArr13 = bArr3;
                                    bArr8 = bArr13;
                                    bnsl bnsl3 = (bnsl) f90714b.mo68388c();
                                    bnsl3.mo68437a(th2);
                                    bnsl3.mo68432a(str20, str12, 376, str11);
                                    bnsl3.mo68405a("Error tokenizing");
                                    btnf = bArr8;
                                    i2 = 101;
                                    i = 2;
                                    bArr = bArr8;
                                    String valueOf322 = String.valueOf(btmt.m116935c(i));
                                    String valueOf2222 = String.valueOf(btnf);
                                    StringBuilder sb222 = new StringBuilder(String.valueOf(valueOf322).length() + 79 + String.valueOf(valueOf2222).length());
                                    sb222.append("Error during tokenization with errorCode=");
                                    sb222.append(valueOf322);
                                    sb222.append(", errorType=");
                                    sb222.append(i2);
                                    sb222.append(", errorMessage=");
                                    sb222.append(valueOf2222);
                                    throw new atrn(sb222.toString(), i2, btnf, bArr);
                                }
                            } else {
                                bArr3 = null;
                                a11.setTransactionSuccessful();
                                throw new atdb();
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            bArr3 = null;
                            Throwable th42 = th;
                            a11.endTransaction();
                            throw th42;
                        }
                    } catch (aths e8) {
                        e = e8;
                        str17 = "b";
                        str16 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                        bArr3 = null;
                        throw new atcz(e);
                    } catch (atdb e9) {
                        str14 = "b";
                        bArr10 = null;
                        str = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                        str19 = str3;
                        str20 = str18;
                        str2 = str14;
                        bArr9 = bArr10;
                        bArr2 = bArr9;
                        this.f90715a.mo49859d();
                        btnf = bArr2;
                        i2 = 102;
                        i = 2;
                        bArr = bArr2;
                        String valueOf3222 = String.valueOf(btmt.m116935c(i));
                        String valueOf22222 = String.valueOf(btnf);
                        StringBuilder sb2222 = new StringBuilder(String.valueOf(valueOf3222).length() + 79 + String.valueOf(valueOf22222).length());
                        sb2222.append("Error during tokenization with errorCode=");
                        sb2222.append(valueOf3222);
                        sb2222.append(", errorType=");
                        sb2222.append(i2);
                        sb2222.append(", errorMessage=");
                        sb2222.append(valueOf22222);
                        throw new atrn(sb2222.toString(), i2, btnf, bArr);
                    } catch (atfh e10) {
                        str15 = "b";
                        bArr11 = null;
                        atfh = e10;
                        str4 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                        str20 = str18;
                        str5 = str15;
                        btmu a122 = atvb.m76439a(atfh.f90231a);
                        if (athh.m75883a(this.f90717d, atfh)) {
                        }
                        bArr = bArr4;
                        btnf = atfh.f90231a;
                        String valueOf32222 = String.valueOf(btmt.m116935c(i));
                        String valueOf222222 = String.valueOf(btnf);
                        StringBuilder sb22222 = new StringBuilder(String.valueOf(valueOf32222).length() + 79 + String.valueOf(valueOf222222).length());
                        sb22222.append("Error during tokenization with errorCode=");
                        sb22222.append(valueOf32222);
                        sb22222.append(", errorType=");
                        sb22222.append(i2);
                        sb22222.append(", errorMessage=");
                        sb22222.append(valueOf222222);
                        throw new atrn(sb22222.toString(), i2, btnf, bArr);
                    } catch (atcz | IOException e11) {
                        String str27 = "b";
                        byte[] bArr16 = null;
                        th = e11;
                        str9 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                        str20 = str18;
                        str10 = str27;
                        bArr12 = bArr16;
                        bArr6 = bArr12;
                        bnsl bnsl22 = (bnsl) f90714b.mo68388c();
                        bnsl22.mo68437a(th);
                        bnsl22.mo68432a(str20, str10, 370, str9);
                        bnsl22.mo68405a("Backing off from tokenizing card");
                        btnf = atey.m75751a(this.f90717d, C0126R.string.tp_add_card_error_title, C0126R.string.tp_add_card_error_content);
                        i2 = 101;
                        i = 2;
                        bArr = bArr6;
                        String valueOf322222 = String.valueOf(btmt.m116935c(i));
                        String valueOf2222222 = String.valueOf(btnf);
                        StringBuilder sb222222 = new StringBuilder(String.valueOf(valueOf322222).length() + 79 + String.valueOf(valueOf2222222).length());
                        sb222222.append("Error during tokenization with errorCode=");
                        sb222222.append(valueOf322222);
                        sb222222.append(", errorType=");
                        sb222222.append(i2);
                        sb222222.append(", errorMessage=");
                        sb222222.append(valueOf2222222);
                        throw new atrn(sb222222.toString(), i2, btnf, bArr);
                    } catch (asks | RuntimeException e12) {
                        String str28 = "b";
                        byte[] bArr17 = null;
                        th2 = e12;
                        str11 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                        str20 = str18;
                        str12 = str28;
                        bArr13 = bArr17;
                        bArr8 = bArr13;
                        bnsl bnsl32 = (bnsl) f90714b.mo68388c();
                        bnsl32.mo68437a(th2);
                        bnsl32.mo68432a(str20, str12, 376, str11);
                        bnsl32.mo68405a("Error tokenizing");
                        btnf = bArr8;
                        i2 = 101;
                        i = 2;
                        bArr = bArr8;
                        String valueOf3222222 = String.valueOf(btmt.m116935c(i));
                        String valueOf22222222 = String.valueOf(btnf);
                        StringBuilder sb2222222 = new StringBuilder(String.valueOf(valueOf3222222).length() + 79 + String.valueOf(valueOf22222222).length());
                        sb2222222.append("Error during tokenization with errorCode=");
                        sb2222222.append(valueOf3222222);
                        sb2222222.append(", errorType=");
                        sb2222222.append(i2);
                        sb2222222.append(", errorMessage=");
                        sb2222222.append(valueOf22222222);
                        throw new atrn(sb2222222.toString(), i2, btnf, bArr);
                    }
                } catch (aths e13) {
                    e = e13;
                    str18 = str20;
                    str17 = "b";
                    str16 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                    bArr3 = null;
                    throw new atcz(e);
                } catch (atdb e14) {
                    str14 = "b";
                    bArr10 = null;
                    str = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                    str19 = str3;
                    str2 = str14;
                    bArr9 = bArr10;
                    bArr2 = bArr9;
                    this.f90715a.mo49859d();
                    btnf = bArr2;
                    i2 = 102;
                    i = 2;
                    bArr = bArr2;
                    String valueOf32222222 = String.valueOf(btmt.m116935c(i));
                    String valueOf222222222 = String.valueOf(btnf);
                    StringBuilder sb22222222 = new StringBuilder(String.valueOf(valueOf32222222).length() + 79 + String.valueOf(valueOf222222222).length());
                    sb22222222.append("Error during tokenization with errorCode=");
                    sb22222222.append(valueOf32222222);
                    sb22222222.append(", errorType=");
                    sb22222222.append(i2);
                    sb22222222.append(", errorMessage=");
                    sb22222222.append(valueOf222222222);
                    throw new atrn(sb22222222.toString(), i2, btnf, bArr);
                } catch (atfh e15) {
                    e = e15;
                    str15 = "b";
                    bArr11 = null;
                    atfh = e;
                    str4 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                    str5 = str15;
                    btmu a1222 = atvb.m76439a(atfh.f90231a);
                    if (athh.m75883a(this.f90717d, atfh)) {
                    }
                    bArr = bArr4;
                    btnf = atfh.f90231a;
                    String valueOf322222222 = String.valueOf(btmt.m116935c(i));
                    String valueOf2222222222 = String.valueOf(btnf);
                    StringBuilder sb222222222 = new StringBuilder(String.valueOf(valueOf322222222).length() + 79 + String.valueOf(valueOf2222222222).length());
                    sb222222222.append("Error during tokenization with errorCode=");
                    sb222222222.append(valueOf322222222);
                    sb222222222.append(", errorType=");
                    sb222222222.append(i2);
                    sb222222222.append(", errorMessage=");
                    sb222222222.append(valueOf2222222222);
                    throw new atrn(sb222222222.toString(), i2, btnf, bArr);
                } catch (atcz | IOException e16) {
                } catch (asks | RuntimeException e17) {
                }
            } else {
                str6 = str19;
                String str29 = str20;
                String str30 = "b";
                String str31 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                bArr2 = null;
                btnf2 = null;
                bArr7 = null;
                bArr5 = null;
                btnf2 = null;
                bArr7 = null;
                bArr5 = null;
                btnf2 = null;
                bArr7 = null;
                bArr5 = null;
                try {
                    atgn = this.f90715a.f90152b;
                    String str32 = this.f90729p;
                    k = btmw2.f149569c.mo73780k();
                    str13 = this.f90720g;
                    strArr = new String[3];
                    strArr[0] = str32;
                    strArr[1] = atgn.mo49961i();
                } catch (atdb e18) {
                    str20 = str29;
                    str8 = str30;
                    str7 = str31;
                    str19 = str6;
                    this.f90715a.mo49859d();
                    btnf = bArr2;
                    i2 = 102;
                    i = 2;
                    bArr = bArr2;
                    String valueOf3222222222 = String.valueOf(btmt.m116935c(i));
                    String valueOf22222222222 = String.valueOf(btnf);
                    StringBuilder sb2222222222 = new StringBuilder(String.valueOf(valueOf3222222222).length() + 79 + String.valueOf(valueOf22222222222).length());
                    sb2222222222.append("Error during tokenization with errorCode=");
                    sb2222222222.append(valueOf3222222222);
                    sb2222222222.append(", errorType=");
                    sb2222222222.append(i2);
                    sb2222222222.append(", errorMessage=");
                    sb2222222222.append(valueOf22222222222);
                    throw new atrn(sb2222222222.toString(), i2, btnf, bArr);
                } catch (atfh e19) {
                    e = e19;
                    str20 = str29;
                    str8 = str30;
                    str7 = str31;
                    atfh = e;
                    btmu a12222 = atvb.m76439a(atfh.f90231a);
                    if (athh.m75883a(this.f90717d, atfh)) {
                    }
                    bArr = bArr4;
                    btnf = atfh.f90231a;
                    String valueOf32222222222 = String.valueOf(btmt.m116935c(i));
                    String valueOf222222222222 = String.valueOf(btnf);
                    StringBuilder sb22222222222 = new StringBuilder(String.valueOf(valueOf32222222222).length() + 79 + String.valueOf(valueOf222222222222).length());
                    sb22222222222.append("Error during tokenization with errorCode=");
                    sb22222222222.append(valueOf32222222222);
                    sb22222222222.append(", errorType=");
                    sb22222222222.append(i2);
                    sb22222222222.append(", errorMessage=");
                    sb22222222222.append(valueOf222222222222);
                    throw new atrn(sb22222222222.toString(), i2, btnf, bArr);
                } catch (atcz | IOException e20) {
                    e = e20;
                    str20 = str29;
                    str8 = str30;
                    str7 = str31;
                    th = e;
                    bArr6 = bArr7;
                    bnsl bnsl222 = (bnsl) f90714b.mo68388c();
                    bnsl222.mo68437a(th);
                    bnsl222.mo68432a(str20, str10, 370, str9);
                    bnsl222.mo68405a("Backing off from tokenizing card");
                    btnf = atey.m75751a(this.f90717d, C0126R.string.tp_add_card_error_title, C0126R.string.tp_add_card_error_content);
                    i2 = 101;
                    i = 2;
                    bArr = bArr6;
                    String valueOf322222222222 = String.valueOf(btmt.m116935c(i));
                    String valueOf2222222222222 = String.valueOf(btnf);
                    StringBuilder sb222222222222 = new StringBuilder(String.valueOf(valueOf322222222222).length() + 79 + String.valueOf(valueOf2222222222222).length());
                    sb222222222222.append("Error during tokenization with errorCode=");
                    sb222222222222.append(valueOf322222222222);
                    sb222222222222.append(", errorType=");
                    sb222222222222.append(i2);
                    sb222222222222.append(", errorMessage=");
                    sb222222222222.append(valueOf2222222222222);
                    throw new atrn(sb222222222222.toString(), i2, btnf, bArr);
                } catch (asks | RuntimeException e21) {
                    e = e21;
                    str20 = str29;
                    str8 = str30;
                    str7 = str31;
                    th2 = e;
                    bArr8 = btnf2;
                    bnsl bnsl322 = (bnsl) f90714b.mo68388c();
                    bnsl322.mo68437a(th2);
                    bnsl322.mo68432a(str20, str12, 376, str11);
                    bnsl322.mo68405a("Error tokenizing");
                    btnf = bArr8;
                    i2 = 101;
                    i = 2;
                    bArr = bArr8;
                    String valueOf3222222222222 = String.valueOf(btmt.m116935c(i));
                    String valueOf22222222222222 = String.valueOf(btnf);
                    StringBuilder sb2222222222222 = new StringBuilder(String.valueOf(valueOf3222222222222).length() + 79 + String.valueOf(valueOf22222222222222).length());
                    sb2222222222222.append("Error during tokenization with errorCode=");
                    sb2222222222222.append(valueOf3222222222222);
                    sb2222222222222.append(", errorType=");
                    sb2222222222222.append(i2);
                    sb2222222222222.append(", errorMessage=");
                    sb2222222222222.append(valueOf22222222222222);
                    throw new atrn(sb2222222222222.toString(), i2, btnf, bArr);
                }
                try {
                    strArr[2] = atgn.mo49962j();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("bundle_handle", k);
                    contentValues.put("session_id", str13);
                    if (atgn.mo49958f().update("SePaymentCards", contentValues, "client_token_id=? AND account_id=? AND environment=?", strArr) <= 0) {
                        bnsl bnsl4 = (bnsl) f90714b.mo68388c();
                        str20 = str29;
                        str8 = str30;
                        str7 = str31;
                        try {
                            bnsl4.mo68432a(str20, str8, 237, str7);
                            bnsl4.mo68405a("Could not save bundle handle");
                        } catch (atdb e22) {
                            str19 = str6;
                            this.f90715a.mo49859d();
                            btnf = bArr2;
                            i2 = 102;
                            i = 2;
                            bArr = bArr2;
                            String valueOf32222222222222 = String.valueOf(btmt.m116935c(i));
                            String valueOf222222222222222 = String.valueOf(btnf);
                            StringBuilder sb22222222222222 = new StringBuilder(String.valueOf(valueOf32222222222222).length() + 79 + String.valueOf(valueOf222222222222222).length());
                            sb22222222222222.append("Error during tokenization with errorCode=");
                            sb22222222222222.append(valueOf32222222222222);
                            sb22222222222222.append(", errorType=");
                            sb22222222222222.append(i2);
                            sb22222222222222.append(", errorMessage=");
                            sb22222222222222.append(valueOf222222222222222);
                            throw new atrn(sb22222222222222.toString(), i2, btnf, bArr);
                        } catch (atfh e23) {
                            e = e23;
                            atfh = e;
                            btmu a122222 = atvb.m76439a(atfh.f90231a);
                            if (athh.m75883a(this.f90717d, atfh)) {
                            }
                            bArr = bArr4;
                            btnf = atfh.f90231a;
                            String valueOf322222222222222 = String.valueOf(btmt.m116935c(i));
                            String valueOf2222222222222222 = String.valueOf(btnf);
                            StringBuilder sb222222222222222 = new StringBuilder(String.valueOf(valueOf322222222222222).length() + 79 + String.valueOf(valueOf2222222222222222).length());
                            sb222222222222222.append("Error during tokenization with errorCode=");
                            sb222222222222222.append(valueOf322222222222222);
                            sb222222222222222.append(", errorType=");
                            sb222222222222222.append(i2);
                            sb222222222222222.append(", errorMessage=");
                            sb222222222222222.append(valueOf2222222222222222);
                            throw new atrn(sb222222222222222.toString(), i2, btnf, bArr);
                        } catch (atcz | IOException e24) {
                            e = e24;
                            th = e;
                            bArr6 = bArr7;
                            bnsl bnsl2222 = (bnsl) f90714b.mo68388c();
                            bnsl2222.mo68437a(th);
                            bnsl2222.mo68432a(str20, str10, 370, str9);
                            bnsl2222.mo68405a("Backing off from tokenizing card");
                            btnf = atey.m75751a(this.f90717d, C0126R.string.tp_add_card_error_title, C0126R.string.tp_add_card_error_content);
                            i2 = 101;
                            i = 2;
                            bArr = bArr6;
                            String valueOf3222222222222222 = String.valueOf(btmt.m116935c(i));
                            String valueOf22222222222222222 = String.valueOf(btnf);
                            StringBuilder sb2222222222222222 = new StringBuilder(String.valueOf(valueOf3222222222222222).length() + 79 + String.valueOf(valueOf22222222222222222).length());
                            sb2222222222222222.append("Error during tokenization with errorCode=");
                            sb2222222222222222.append(valueOf3222222222222222);
                            sb2222222222222222.append(", errorType=");
                            sb2222222222222222.append(i2);
                            sb2222222222222222.append(", errorMessage=");
                            sb2222222222222222.append(valueOf22222222222222222);
                            throw new atrn(sb2222222222222222.toString(), i2, btnf, bArr);
                        } catch (asks | RuntimeException e25) {
                            e = e25;
                            th2 = e;
                            bArr8 = btnf2;
                            bnsl bnsl3222 = (bnsl) f90714b.mo68388c();
                            bnsl3222.mo68437a(th2);
                            bnsl3222.mo68432a(str20, str12, 376, str11);
                            bnsl3222.mo68405a("Error tokenizing");
                            btnf = bArr8;
                            i2 = 101;
                            i = 2;
                            bArr = bArr8;
                            String valueOf32222222222222222 = String.valueOf(btmt.m116935c(i));
                            String valueOf222222222222222222 = String.valueOf(btnf);
                            StringBuilder sb22222222222222222 = new StringBuilder(String.valueOf(valueOf32222222222222222).length() + 79 + String.valueOf(valueOf222222222222222222).length());
                            sb22222222222222222.append("Error during tokenization with errorCode=");
                            sb22222222222222222.append(valueOf32222222222222222);
                            sb22222222222222222.append(", errorType=");
                            sb22222222222222222.append(i2);
                            sb22222222222222222.append(", errorMessage=");
                            sb22222222222222222.append(valueOf222222222222222222);
                            throw new atrn(sb22222222222222222.toString(), i2, btnf, bArr);
                        }
                    }
                    CardInfo b2 = this.f90715a.mo49853b(this.f90729p);
                    if (b2 != null) {
                        bundle.putParcelable("data_card_info", b2);
                        return bundle;
                    }
                    throw new RuntimeException();
                } catch (atdb e26) {
                    str20 = str29;
                    str8 = str30;
                    str7 = str31;
                    str19 = str6;
                    this.f90715a.mo49859d();
                    btnf = bArr2;
                    i2 = 102;
                    i = 2;
                    bArr = bArr2;
                    String valueOf322222222222222222 = String.valueOf(btmt.m116935c(i));
                    String valueOf2222222222222222222 = String.valueOf(btnf);
                    StringBuilder sb222222222222222222 = new StringBuilder(String.valueOf(valueOf322222222222222222).length() + 79 + String.valueOf(valueOf2222222222222222222).length());
                    sb222222222222222222.append("Error during tokenization with errorCode=");
                    sb222222222222222222.append(valueOf322222222222222222);
                    sb222222222222222222.append(", errorType=");
                    sb222222222222222222.append(i2);
                    sb222222222222222222.append(", errorMessage=");
                    sb222222222222222222.append(valueOf2222222222222222222);
                    throw new atrn(sb222222222222222222.toString(), i2, btnf, bArr);
                } catch (atfh e27) {
                    e = e27;
                    str20 = str29;
                    str8 = str30;
                    str7 = str31;
                    atfh = e;
                    btmu a1222222 = atvb.m76439a(atfh.f90231a);
                    if (athh.m75883a(this.f90717d, atfh)) {
                        bArr4 = bArr3;
                        i2 = 102;
                        i = 2;
                    } else if (a1222222 != null) {
                        int b3 = btmt.m116934b(a1222222.f149548a);
                        if (b3 == 0) {
                            b3 = 1;
                        }
                        int i3 = b3 - 2;
                        if (i3 == 1) {
                            String str33 = str3;
                            try {
                                this.f90715a.mo49859d();
                                bArr4 = bArr3;
                                i = b3;
                                i2 = 101;
                            } catch (asks | atfh | IOException e28) {
                                bnsl bnsl5 = (bnsl) f90714b.mo68388c();
                                bnsl5.mo68437a(e28);
                                bnsl5.mo68432a(str20, str5, 294, str4);
                                bnsl5.mo68405a(str33);
                                bArr4 = bArr3;
                                i = b3;
                                i2 = 101;
                            }
                        } else if (i3 != 12) {
                            if (i3 != 3) {
                                if (i3 == 4) {
                                    byte[] k2 = a1222222.f149549b.mo73780k();
                                    if (k2 == null) {
                                        bArr4 = k2;
                                    } else if (k2.length != 0) {
                                        bArr4 = k2;
                                        i = b3;
                                        i2 = 106;
                                    } else {
                                        bArr4 = k2;
                                        i = b3;
                                        i2 = 102;
                                    }
                                } else if (i3 != 5) {
                                    if (i3 != 8) {
                                        if (i3 != 9) {
                                            switch (i3) {
                                                case 14:
                                                    bArr4 = bArr3;
                                                    i = b3;
                                                    i2 = ErrorInfo.TYPE_SDU_MEMORY_FULL;
                                                    break;
                                                case 15:
                                                    bArr3 = a1222222.f149549b.mo73780k();
                                                    if (bArr3 != null && bArr3.length != 0) {
                                                        bArr4 = a1222222.f149549b.mo73780k();
                                                        i = b3;
                                                        i2 = 108;
                                                        break;
                                                    } else {
                                                        bnsl bnsl6 = (bnsl) f90714b.mo68388c();
                                                        bnsl6.mo68432a(str20, str5, 352, str4);
                                                        bnsl6.mo68405a("Server should never return CVN_EXPIRED without a recovery token.");
                                                    }
                                                    break;
                                                case 16:
                                                    bArr4 = bArr3;
                                                    i = b3;
                                                    i2 = 102;
                                                    break;
                                                default:
                                                    bnsl bnsl7 = (bnsl) f90714b.mo68388c();
                                                    bnsl7.mo68432a(str20, str5, 360, str4);
                                                    bnsl7.mo68409a("Unknown error code: %d", btmt.m116933a(b3));
                                                    bArr4 = bArr3;
                                                    i = b3;
                                                    i2 = 101;
                                                    break;
                                            }
                                        }
                                    } else {
                                        try {
                                            this.f90715a.mo49855b(this.f90729p, 4);
                                        } catch (asks e29) {
                                            bnsl bnsl8 = (bnsl) f90714b.mo68388c();
                                            bnsl8.mo68437a(e29);
                                            bnsl8.mo68432a(str20, str5, 330, str4);
                                            bnsl8.mo68405a("Error deleting token to restart tokenization");
                                            bArr4 = bArr3;
                                            i = b3;
                                            i2 = 102;
                                        }
                                    }
                                    bArr4 = bArr3;
                                    i = b3;
                                    i2 = 102;
                                } else {
                                    bArr4 = bArr3;
                                }
                                i = b3;
                                i2 = 102;
                            }
                            bArr4 = bArr3;
                            i = b3;
                            i2 = 102;
                        } else {
                            try {
                                this.f90715a.mo49859d();
                                bArr4 = bArr3;
                                i = b3;
                                i2 = 102;
                            } catch (asks | atfh | IOException e30) {
                                bnsl bnsl9 = (bnsl) f90714b.mo68388c();
                                bnsl9.mo68437a(e30);
                                bnsl9.mo68432a(str20, str5, 285, str4);
                                bnsl9.mo68405a(str3);
                                bArr4 = bArr3;
                                i = b3;
                                i2 = 102;
                            }
                        }
                    } else {
                        bArr4 = bArr3;
                        i2 = 101;
                        i = 2;
                    }
                    bArr = bArr4;
                    btnf = atfh.f90231a;
                    String valueOf3222222222222222222 = String.valueOf(btmt.m116935c(i));
                    String valueOf22222222222222222222 = String.valueOf(btnf);
                    StringBuilder sb2222222222222222222 = new StringBuilder(String.valueOf(valueOf3222222222222222222).length() + 79 + String.valueOf(valueOf22222222222222222222).length());
                    sb2222222222222222222.append("Error during tokenization with errorCode=");
                    sb2222222222222222222.append(valueOf3222222222222222222);
                    sb2222222222222222222.append(", errorType=");
                    sb2222222222222222222.append(i2);
                    sb2222222222222222222.append(", errorMessage=");
                    sb2222222222222222222.append(valueOf22222222222222222222);
                    throw new atrn(sb2222222222222222222.toString(), i2, btnf, bArr);
                } catch (atcz | IOException e31) {
                    e = e31;
                    str20 = str29;
                    str8 = str30;
                    str7 = str31;
                    th = e;
                    bArr6 = bArr7;
                    bnsl bnsl22222 = (bnsl) f90714b.mo68388c();
                    bnsl22222.mo68437a(th);
                    bnsl22222.mo68432a(str20, str10, 370, str9);
                    bnsl22222.mo68405a("Backing off from tokenizing card");
                    btnf = atey.m75751a(this.f90717d, C0126R.string.tp_add_card_error_title, C0126R.string.tp_add_card_error_content);
                    i2 = 101;
                    i = 2;
                    bArr = bArr6;
                    String valueOf32222222222222222222 = String.valueOf(btmt.m116935c(i));
                    String valueOf222222222222222222222 = String.valueOf(btnf);
                    StringBuilder sb22222222222222222222 = new StringBuilder(String.valueOf(valueOf32222222222222222222).length() + 79 + String.valueOf(valueOf222222222222222222222).length());
                    sb22222222222222222222.append("Error during tokenization with errorCode=");
                    sb22222222222222222222.append(valueOf32222222222222222222);
                    sb22222222222222222222.append(", errorType=");
                    sb22222222222222222222.append(i2);
                    sb22222222222222222222.append(", errorMessage=");
                    sb22222222222222222222.append(valueOf222222222222222222222);
                    throw new atrn(sb22222222222222222222.toString(), i2, btnf, bArr);
                } catch (asks | RuntimeException e32) {
                    e = e32;
                    str20 = str29;
                    str8 = str30;
                    str7 = str31;
                    th2 = e;
                    bArr8 = btnf2;
                    bnsl bnsl32222 = (bnsl) f90714b.mo68388c();
                    bnsl32222.mo68437a(th2);
                    bnsl32222.mo68432a(str20, str12, 376, str11);
                    bnsl32222.mo68405a("Error tokenizing");
                    btnf = bArr8;
                    i2 = 101;
                    i = 2;
                    bArr = bArr8;
                    String valueOf322222222222222222222 = String.valueOf(btmt.m116935c(i));
                    String valueOf2222222222222222222222 = String.valueOf(btnf);
                    StringBuilder sb222222222222222222222 = new StringBuilder(String.valueOf(valueOf322222222222222222222).length() + 79 + String.valueOf(valueOf2222222222222222222222).length());
                    sb222222222222222222222.append("Error during tokenization with errorCode=");
                    sb222222222222222222222.append(valueOf322222222222222222222);
                    sb222222222222222222222.append(", errorType=");
                    sb222222222222222222222.append(i2);
                    sb222222222222222222222.append(", errorMessage=");
                    sb222222222222222222222.append(valueOf2222222222222222222222);
                    throw new atrn(sb222222222222222222222.toString(), i2, btnf, bArr);
                }
            }
        } catch (atdb e33) {
        } catch (atfh e34) {
            e = e34;
            str6 = str19;
            str7 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
            str8 = "b";
            bArr5 = null;
            atfh = e;
            btmu a12222222 = atvb.m76439a(atfh.f90231a);
            if (athh.m75883a(this.f90717d, atfh)) {
            }
            bArr = bArr4;
            btnf = atfh.f90231a;
            String valueOf3222222222222222222222 = String.valueOf(btmt.m116935c(i));
            String valueOf22222222222222222222222 = String.valueOf(btnf);
            StringBuilder sb2222222222222222222222 = new StringBuilder(String.valueOf(valueOf3222222222222222222222).length() + 79 + String.valueOf(valueOf22222222222222222222222).length());
            sb2222222222222222222222.append("Error during tokenization with errorCode=");
            sb2222222222222222222222.append(valueOf3222222222222222222222);
            sb2222222222222222222222.append(", errorType=");
            sb2222222222222222222222.append(i2);
            sb2222222222222222222222.append(", errorMessage=");
            sb2222222222222222222222.append(valueOf22222222222222222222222);
            throw new atrn(sb2222222222222222222222.toString(), i2, btnf, bArr);
        } catch (atcz | IOException e35) {
            e = e35;
            str7 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
            str8 = "b";
            bArr7 = null;
            th = e;
            bArr6 = bArr7;
            bnsl bnsl222222 = (bnsl) f90714b.mo68388c();
            bnsl222222.mo68437a(th);
            bnsl222222.mo68432a(str20, str10, 370, str9);
            bnsl222222.mo68405a("Backing off from tokenizing card");
            btnf = atey.m75751a(this.f90717d, C0126R.string.tp_add_card_error_title, C0126R.string.tp_add_card_error_content);
            i2 = 101;
            i = 2;
            bArr = bArr6;
            String valueOf32222222222222222222222 = String.valueOf(btmt.m116935c(i));
            String valueOf222222222222222222222222 = String.valueOf(btnf);
            StringBuilder sb22222222222222222222222 = new StringBuilder(String.valueOf(valueOf32222222222222222222222).length() + 79 + String.valueOf(valueOf222222222222222222222222).length());
            sb22222222222222222222222.append("Error during tokenization with errorCode=");
            sb22222222222222222222222.append(valueOf32222222222222222222222);
            sb22222222222222222222222.append(", errorType=");
            sb22222222222222222222222.append(i2);
            sb22222222222222222222222.append(", errorMessage=");
            sb22222222222222222222222.append(valueOf222222222222222222222222);
            throw new atrn(sb22222222222222222222222.toString(), i2, btnf, bArr);
        } catch (asks | RuntimeException e36) {
            e = e36;
            str7 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
            str8 = "b";
            btnf2 = null;
            th2 = e;
            bArr8 = btnf2;
            bnsl bnsl322222 = (bnsl) f90714b.mo68388c();
            bnsl322222.mo68437a(th2);
            bnsl322222.mo68432a(str20, str12, 376, str11);
            bnsl322222.mo68405a("Error tokenizing");
            btnf = bArr8;
            i2 = 101;
            i = 2;
            bArr = bArr8;
            String valueOf322222222222222222222222 = String.valueOf(btmt.m116935c(i));
            String valueOf2222222222222222222222222 = String.valueOf(btnf);
            StringBuilder sb222222222222222222222222 = new StringBuilder(String.valueOf(valueOf322222222222222222222222).length() + 79 + String.valueOf(valueOf2222222222222222222222222).length());
            sb222222222222222222222222.append("Error during tokenization with errorCode=");
            sb222222222222222222222222.append(valueOf322222222222222222222222);
            sb222222222222222222222222.append(", errorType=");
            sb222222222222222222222222.append(i2);
            sb222222222222222222222222.append(", errorMessage=");
            sb222222222222222222222222.append(valueOf2222222222222222222222222);
            throw new atrn(sb222222222222222222222222.toString(), i2, btnf, bArr);
        }
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [byte[]], assign insn: PHI: (r2v9 ?) = (r2v13 ?), (r2v15 ?), (r2v18 ?), (r2v25 ?), (r2v30 ?) binds: [B:270:?, B:266:0x0512, B:261:0x0502, B:191:0x03a8, B:185:0x0385] */
    /* JADX WARN: Type inference failed for: r2v13, assign insn: 0x0532: MOVE  (r2v13 ? I:?[OBJECT, ARRAY]) = (r11v1 btnf) */
    /* JADX WARN: Type inference failed for: r2v15, assign insn: 0x0512: MOVE  (r2v15 ? I:?[OBJECT, ARRAY]) = (r11v1 btnf) */
    /* JADX WARN: Type inference failed for: r2v18, assign insn: 0x0505: MOVE  (r2v18 ? I:?[OBJECT, ARRAY]) = (r11v4 btnf) */
    /* JADX WARN: Type inference failed for: r3v23, types: [byte[]], assign insn: 0x048e: INVOKE  (r3v23 ? I:byte[]) = (r3v22 bxtx) type: VIRTUAL call: bxtx.k():byte[] */
    /* JADX WARN: Type inference failed for: r8v31, types: [byte[]], assign insn: 0x042d: INVOKE  (r8v31 ? I:byte[]) = (r8v30 bxtx) type: VIRTUAL call: bxtx.k():byte[] */
    /* JADX WARN: Type inference failed for: r3v32, types: [byte[]], assign insn: 0x0438: INVOKE  (r3v32 ? I:byte[]) = (r3v31 bxtx) type: VIRTUAL call: bxtx.k():byte[] */
    /* JADX WARN: Type inference failed for: r2v25, assign insn: 0x03cf: MOVE  (r2v25 ? I:?[OBJECT, ARRAY]) = (r11v15 btnf) */
    /* JADX WARN: Type inference failed for: r2v30, assign insn: 0x039a: MOVE  (r2v30 ? I:?[OBJECT, ARRAY]) = (r11v19 btnf) */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0357, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x035a, code lost:
        r5 = r27;
        r6 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0360, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0363, code lost:
        r5 = r27;
        r6 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0369, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x036a, code lost:
        r5 = r27;
        r6 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0372, code lost:
        r5 = r27;
        r6 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x019b, code lost:
        if (r6 != 2) goto L_0x019d;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:95:0x0200, B:138:0x02b5] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0371 A[ExcHandler: atdb (e atdb), PHI: r11 r27 r28 10  PHI: (r11v23 btnf) = (r11v27 btnf), (r11v35 btnf), (r11v59 btnf) binds: [B:138:0x02b5, B:120:0x026f, B:95:0x0200] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r27v0 java.lang.String) = (r27v1 java.lang.String), (r27v5 java.lang.String), (r27v7 java.lang.String) binds: [B:138:0x02b5, B:120:0x026f, B:95:0x0200] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r28v0 java.lang.String) = (r28v1 java.lang.String), (r28v5 java.lang.String), (r28v7 java.lang.String) binds: [B:138:0x02b5, B:120:0x026f, B:95:0x0200] A[DONT_GENERATE, DONT_INLINE], Splitter:B:95:0x0200] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03e7 A[Catch:{ atdb -> 0x0508, atfh -> 0x03d3, IOException -> 0x03a2, atcz -> 0x03a0, RuntimeException -> 0x037f, asks -> 0x037d, all -> 0x05a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x04fd A[Catch:{ atdb -> 0x0508, atfh -> 0x03d3, IOException -> 0x03a2, atcz -> 0x03a0, RuntimeException -> 0x037f, asks -> 0x037d, all -> 0x05a5 }] */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: a */
    public final synchronized Bundle mo50148a() {
        Bundle bundle;
        btnf btnf;
        int i;
        int i2;
        ? r2;
        String str;
        String str2;
        atfh atfh;
        btnf btnf2;
        Throwable th;
        btnf btnf3;
        Throwable th2;
        btnf btnf4;
        HashMap hashMap;
        String str3;
        String str4;
        byte[] bArr;
        btlr btlr;
        byte[] bArr2;
        btli btli;
        synchronized (this) {
            try {
                if (this.f90716c == null) {
                    Bundle bundle2 = new Bundle();
                    this.f90729p = this.f90725l.f149056a;
                    btiw a = new athh().mo49987a(this.f90717d);
                    bxvd da = btmv.f149551m.mo74144da();
                    String str5 = a.f149047b;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    btmv btmv = (btmv) da.f164949b;
                    str5.getClass();
                    btmv.f149555c = str5;
                    a.getClass();
                    btmv.f149556d = a;
                    String a2 = stm.m36299a(this.f90718e);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    a2.getClass();
                    ((btmv) da.f164949b).f149557e = a2;
                    btmr a3 = atvf.m76450a(this.f90717d.f89126d);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    btmv btmv2 = (btmv) da.f164949b;
                    a3.getClass();
                    btmv2.f149558f = a3;
                    String str6 = this.f90720g;
                    str6.getClass();
                    btmv2.f149560h = str6;
                    String a4 = stm.m36299a(this.f90724k);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    a4.getClass();
                    ((btmv) da.f164949b).f149561i = a4;
                    String a5 = stm.m36299a(this.f90730q);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    btmv btmv3 = (btmv) da.f164949b;
                    a5.getClass();
                    btmv3.f149562j = a5;
                    btiy btiy = this.f90725l;
                    if (btiy != null) {
                        btiy.getClass();
                        btmv3.f149553a = btiy;
                    }
                    if (!TextUtils.isEmpty(this.f90728o)) {
                        String str7 = this.f90728o;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        str7.getClass();
                        ((btmv) da.f164949b).f149564l = str7;
                    } else {
                        bxtx a6 = bxtx.m123261a(this.f90719f);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        a6.getClass();
                        ((btmv) da.f164949b).f149554b = a6;
                    }
                    CryptoParameters cryptoParameters = this.f90723j;
                    if (!(cryptoParameters == null || (btli = cryptoParameters.f108621a) == null)) {
                        btli.getClass();
                        ((btmv) da.f164949b).f149559g = btli;
                    }
                    PushTokenizeRequest pushTokenizeRequest = this.f90731r;
                    if (pushTokenizeRequest != null) {
                        bxtx a7 = bxtx.m123261a(pushTokenizeRequest.f108572c);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        a7.getClass();
                        ((btmv) da.f164949b).f149563k = a7;
                    } else if (this.f90726m && (bArr2 = this.f90727n) != null) {
                        bxtx a8 = bxtx.m123261a(bArr2);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        a8.getClass();
                        ((btmv) da.f164949b).f149563k = a8;
                    }
                    atbq atbq = this.f90722i;
                    askf askf = this.f90717d;
                    String str8 = this.f90721h;
                    String str9 = this.f90729p;
                    atbq.mo49787b().mo50002b(askf);
                    atda atda = new atda(askf, str9, str8, "new");
                    btmv btmv4 = (btmv) da.mo74062i();
                    askf askf2 = this.f90717d;
                    btmw btmw = btmw.f149565h;
                    if (!stm.m36302d(btmv4.f149557e)) {
                        hashMap = new HashMap();
                        hashMap.put(4, 13);
                    } else {
                        hashMap = new HashMap();
                    }
                    btmw btmw2 = (btmw) atff.m75760a(askf2, "e/cardtokenization/tokenizecard", btmv4, btmw, hashMap);
                    bundle2.putByteArray("data_tokenize_card_response", btmw2.mo73642k());
                    int a9 = btnx.m116967a(btmw2.f149567a);
                    if (a9 == 0) {
                    }
                    this.f90715a.mo49859d();
                    if (!atbq.m75408a(this.f90721h)) {
                        try {
                            atbq atbq2 = this.f90722i;
                            String str10 = this.f90720g;
                            CryptoParameters cryptoParameters2 = this.f90723j;
                            if (cryptoParameters2 != null) {
                                bArr = cryptoParameters2.f108622b;
                            } else {
                                bArr = null;
                            }
                            askf askf3 = this.f90717d;
                            try {
                                atbq2.mo49781a();
                                askf askf4 = atda.f90100a;
                                StorageKey a10 = atbm.m75385a().mo49999a(askf4);
                                athj athj = new athj(a10);
                                SQLiteDatabase a11 = atbm.m75382a(askf4.f89126d);
                                a11.beginTransaction();
                                str4 = "atro";
                                str3 = "b";
                                try {
                                    if (DatabaseUtils.queryNumEntries(a11, "PaymentBundles", "bundle_id = ? AND account_id = ? AND environment = ?", atbm.m75392a(atda.f90102c, askf4)) <= 0) {
                                        btnf = null;
                                        btnf = null;
                                        btnf = null;
                                        btnf = null;
                                        btnf = null;
                                        btnf = null;
                                        btnf = null;
                                        btnf = null;
                                        try {
                                            a11.insertOrThrow("PaymentBundles", null, atbm.m75381a(atda, athj, a10.f108658a));
                                            a11.setTransactionSuccessful();
                                            try {
                                                a11.endTransaction();
                                            } catch (aths e) {
                                                e = e;
                                                throw new atcz(e);
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            Throwable th4 = th;
                                            a11.endTransaction();
                                            throw th4;
                                        }
                                        try {
                                            btlr btlr2 = btmw2.f149568b;
                                            if (btlr2 != null) {
                                                btlr = btlr2;
                                            } else {
                                                btlr = btlr.f149408e;
                                            }
                                            atbq2.mo49782a(askf3, atda, str10, bArr, btlr, btmw2.f149569c.mo73780k(), btmw2.f149570d, btmw2.f149572f, btmw2.f149573g);
                                            atbq2.mo49783a(askf3.f89126d, askf3.f89125c);
                                            this.f90715a.mo49859d();
                                            CardInfo b = this.f90715a.mo49853b(this.f90729p);
                                            if (b != null) {
                                                bundle2.putParcelable("data_card_info", b);
                                                this.f90716c = bundle2;
                                            } else {
                                                throw new RuntimeException();
                                            }
                                        } catch (atdb e2) {
                                        } catch (atfh e3) {
                                            atfh = e3;
                                            str2 = str4;
                                            str = str3;
                                            btmu a12 = atvb.m76439a(atfh.f90231a);
                                            if (!athh.m75883a(this.f90717d, atfh)) {
                                            }
                                            btnf = atfh.f90231a;
                                            r2 = btnf;
                                            String valueOf = String.valueOf(btmt.m116935c(i));
                                            String valueOf2 = String.valueOf(btnf);
                                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 79 + String.valueOf(valueOf2).length());
                                            sb.append("Error during tokenization with errorCode=");
                                            sb.append(valueOf);
                                            sb.append(", errorType=");
                                            sb.append(i2);
                                            sb.append(", errorMessage=");
                                            sb.append(valueOf2);
                                            throw new atrn(sb.toString(), i2, btnf, r2);
                                        } catch (atcz | IOException e4) {
                                            th = e4;
                                            str2 = str4;
                                            str = str3;
                                            bnsl bnsl = (bnsl) f90714b.mo68388c();
                                            bnsl.mo68437a(th);
                                            bnsl.mo68432a(str2, str, 370, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl.mo68405a("Backing off from tokenizing card");
                                            i2 = 101;
                                            i = 2;
                                            btnf = atey.m75751a(this.f90717d, C0126R.string.tp_add_card_error_title, C0126R.string.tp_add_card_error_content);
                                            r2 = btnf;
                                            String valueOf3 = String.valueOf(btmt.m116935c(i));
                                            String valueOf22 = String.valueOf(btnf);
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 79 + String.valueOf(valueOf22).length());
                                            sb2.append("Error during tokenization with errorCode=");
                                            sb2.append(valueOf3);
                                            sb2.append(", errorType=");
                                            sb2.append(i2);
                                            sb2.append(", errorMessage=");
                                            sb2.append(valueOf22);
                                            throw new atrn(sb2.toString(), i2, btnf, r2);
                                        } catch (asks | RuntimeException e5) {
                                            th2 = e5;
                                            str2 = str4;
                                            str = str3;
                                            bnsl bnsl2 = (bnsl) f90714b.mo68388c();
                                            bnsl2.mo68437a(th2);
                                            bnsl2.mo68432a(str2, str, 376, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl2.mo68405a("Error tokenizing");
                                            r2 = btnf;
                                            i2 = 101;
                                            i = 2;
                                            String valueOf32 = String.valueOf(btmt.m116935c(i));
                                            String valueOf222 = String.valueOf(btnf);
                                            StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf32).length() + 79 + String.valueOf(valueOf222).length());
                                            sb22.append("Error during tokenization with errorCode=");
                                            sb22.append(valueOf32);
                                            sb22.append(", errorType=");
                                            sb22.append(i2);
                                            sb22.append(", errorMessage=");
                                            sb22.append(valueOf222);
                                            throw new atrn(sb22.toString(), i2, btnf, r2);
                                        }
                                    } else {
                                        btnf = null;
                                        a11.setTransactionSuccessful();
                                        throw new atdb();
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    btnf = null;
                                    Throwable th42 = th;
                                    a11.endTransaction();
                                    throw th42;
                                }
                            } catch (aths e6) {
                                e = e6;
                                str4 = "atro";
                                str3 = "b";
                                btnf = null;
                                throw new atcz(e);
                            }
                        } catch (atdb e7) {
                            btnf = null;
                            String str11 = "atro";
                            String str12 = "b";
                            try {
                                this.f90715a.mo49859d();
                                r2 = btnf;
                                i2 = 102;
                                i = 2;
                            } catch (asks | atfh | IOException e8) {
                                Throwable th6 = e8;
                                bnsl bnsl3 = (bnsl) f90714b.mo68388c();
                                bnsl3.mo68437a(th6);
                                bnsl3.mo68432a(str2, str, 267, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl3.mo68405a("Unable to fetch cards");
                                r2 = btnf;
                                i2 = 102;
                                i = 2;
                            }
                            String valueOf322 = String.valueOf(btmt.m116935c(i));
                            String valueOf2222 = String.valueOf(btnf);
                            StringBuilder sb222 = new StringBuilder(String.valueOf(valueOf322).length() + 79 + String.valueOf(valueOf2222).length());
                            sb222.append("Error during tokenization with errorCode=");
                            sb222.append(valueOf322);
                            sb222.append(", errorType=");
                            sb222.append(i2);
                            sb222.append(", errorMessage=");
                            sb222.append(valueOf2222);
                            throw new atrn(sb222.toString(), i2, btnf, r2);
                        } catch (atfh e9) {
                            e = e9;
                            btnf2 = null;
                            String str13 = "atro";
                            String str14 = "b";
                            atfh = e;
                            btmu a122 = atvb.m76439a(atfh.f90231a);
                            if (!athh.m75883a(this.f90717d, atfh)) {
                            }
                            btnf = atfh.f90231a;
                            r2 = btnf;
                            String valueOf3222 = String.valueOf(btmt.m116935c(i));
                            String valueOf22222 = String.valueOf(btnf);
                            StringBuilder sb2222 = new StringBuilder(String.valueOf(valueOf3222).length() + 79 + String.valueOf(valueOf22222).length());
                            sb2222.append("Error during tokenization with errorCode=");
                            sb2222.append(valueOf3222);
                            sb2222.append(", errorType=");
                            sb2222.append(i2);
                            sb2222.append(", errorMessage=");
                            sb2222.append(valueOf22222);
                            throw new atrn(sb2222.toString(), i2, btnf, r2);
                        } catch (atcz | IOException e10) {
                            e = e10;
                            btnf3 = null;
                            String str15 = "atro";
                            String str16 = "b";
                            th = e;
                            bnsl bnsl4 = (bnsl) f90714b.mo68388c();
                            bnsl4.mo68437a(th);
                            bnsl4.mo68432a(str2, str, 370, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl4.mo68405a("Backing off from tokenizing card");
                            i2 = 101;
                            i = 2;
                            btnf = atey.m75751a(this.f90717d, C0126R.string.tp_add_card_error_title, C0126R.string.tp_add_card_error_content);
                            r2 = btnf;
                            String valueOf32222 = String.valueOf(btmt.m116935c(i));
                            String valueOf222222 = String.valueOf(btnf);
                            StringBuilder sb22222 = new StringBuilder(String.valueOf(valueOf32222).length() + 79 + String.valueOf(valueOf222222).length());
                            sb22222.append("Error during tokenization with errorCode=");
                            sb22222.append(valueOf32222);
                            sb22222.append(", errorType=");
                            sb22222.append(i2);
                            sb22222.append(", errorMessage=");
                            sb22222.append(valueOf222222);
                            throw new atrn(sb22222.toString(), i2, btnf, r2);
                        } catch (asks | RuntimeException e11) {
                            e = e11;
                            btnf4 = null;
                            str2 = "atro";
                            str = "b";
                            th2 = e;
                            bnsl bnsl22 = (bnsl) f90714b.mo68388c();
                            bnsl22.mo68437a(th2);
                            bnsl22.mo68432a(str2, str, 376, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl22.mo68405a("Error tokenizing");
                            r2 = btnf;
                            i2 = 101;
                            i = 2;
                            String valueOf322222 = String.valueOf(btmt.m116935c(i));
                            String valueOf2222222 = String.valueOf(btnf);
                            StringBuilder sb222222 = new StringBuilder(String.valueOf(valueOf322222).length() + 79 + String.valueOf(valueOf2222222).length());
                            sb222222.append("Error during tokenization with errorCode=");
                            sb222222.append(valueOf322222);
                            sb222222.append(", errorType=");
                            sb222222.append(i2);
                            sb222222.append(", errorMessage=");
                            sb222222.append(valueOf2222222);
                            throw new atrn(sb222222.toString(), i2, btnf, r2);
                        }
                    } else {
                        str4 = "atro";
                        str3 = "b";
                        btnf = null;
                        btnf4 = null;
                        btnf3 = null;
                        btnf2 = null;
                        btnf = null;
                        btnf4 = null;
                        btnf3 = null;
                        btnf2 = null;
                        btnf = null;
                        btnf4 = null;
                        btnf3 = null;
                        btnf2 = null;
                        atgn atgn = this.f90715a.f90152b;
                        String str17 = this.f90729p;
                        byte[] k = btmw2.f149569c.mo73780k();
                        String str18 = this.f90720g;
                        String[] strArr = new String[3];
                        strArr[0] = str17;
                        strArr[1] = atgn.mo49961i();
                        try {
                            strArr[2] = atgn.mo49962j();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("bundle_handle", k);
                            contentValues.put("session_id", str18);
                            if (atgn.mo49958f().update("SePaymentCards", contentValues, "client_token_id=? AND account_id=? AND environment=?", strArr) <= 0) {
                                bnsl bnsl5 = (bnsl) f90714b.mo68388c();
                                str2 = str4;
                                str = str3;
                                try {
                                    bnsl5.mo68432a(str2, str, 237, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl5.mo68405a("Could not save bundle handle");
                                } catch (atdb e12) {
                                    this.f90715a.mo49859d();
                                    r2 = btnf;
                                    i2 = 102;
                                    i = 2;
                                    String valueOf3222222 = String.valueOf(btmt.m116935c(i));
                                    String valueOf22222222 = String.valueOf(btnf);
                                    StringBuilder sb2222222 = new StringBuilder(String.valueOf(valueOf3222222).length() + 79 + String.valueOf(valueOf22222222).length());
                                    sb2222222.append("Error during tokenization with errorCode=");
                                    sb2222222.append(valueOf3222222);
                                    sb2222222.append(", errorType=");
                                    sb2222222.append(i2);
                                    sb2222222.append(", errorMessage=");
                                    sb2222222.append(valueOf22222222);
                                    throw new atrn(sb2222222.toString(), i2, btnf, r2);
                                } catch (atfh e13) {
                                    e = e13;
                                    atfh = e;
                                    btmu a1222 = atvb.m76439a(atfh.f90231a);
                                    if (!athh.m75883a(this.f90717d, atfh)) {
                                    }
                                    btnf = atfh.f90231a;
                                    r2 = btnf;
                                    String valueOf32222222 = String.valueOf(btmt.m116935c(i));
                                    String valueOf222222222 = String.valueOf(btnf);
                                    StringBuilder sb22222222 = new StringBuilder(String.valueOf(valueOf32222222).length() + 79 + String.valueOf(valueOf222222222).length());
                                    sb22222222.append("Error during tokenization with errorCode=");
                                    sb22222222.append(valueOf32222222);
                                    sb22222222.append(", errorType=");
                                    sb22222222.append(i2);
                                    sb22222222.append(", errorMessage=");
                                    sb22222222.append(valueOf222222222);
                                    throw new atrn(sb22222222.toString(), i2, btnf, r2);
                                } catch (atcz | IOException e14) {
                                    e = e14;
                                    th = e;
                                    bnsl bnsl42 = (bnsl) f90714b.mo68388c();
                                    bnsl42.mo68437a(th);
                                    bnsl42.mo68432a(str2, str, 370, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl42.mo68405a("Backing off from tokenizing card");
                                    i2 = 101;
                                    i = 2;
                                    btnf = atey.m75751a(this.f90717d, C0126R.string.tp_add_card_error_title, C0126R.string.tp_add_card_error_content);
                                    r2 = btnf;
                                    String valueOf322222222 = String.valueOf(btmt.m116935c(i));
                                    String valueOf2222222222 = String.valueOf(btnf);
                                    StringBuilder sb222222222 = new StringBuilder(String.valueOf(valueOf322222222).length() + 79 + String.valueOf(valueOf2222222222).length());
                                    sb222222222.append("Error during tokenization with errorCode=");
                                    sb222222222.append(valueOf322222222);
                                    sb222222222.append(", errorType=");
                                    sb222222222.append(i2);
                                    sb222222222.append(", errorMessage=");
                                    sb222222222.append(valueOf2222222222);
                                    throw new atrn(sb222222222.toString(), i2, btnf, r2);
                                } catch (asks | RuntimeException e15) {
                                    e = e15;
                                    th2 = e;
                                    bnsl bnsl222 = (bnsl) f90714b.mo68388c();
                                    bnsl222.mo68437a(th2);
                                    bnsl222.mo68432a(str2, str, 376, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl222.mo68405a("Error tokenizing");
                                    r2 = btnf;
                                    i2 = 101;
                                    i = 2;
                                    String valueOf3222222222 = String.valueOf(btmt.m116935c(i));
                                    String valueOf22222222222 = String.valueOf(btnf);
                                    StringBuilder sb2222222222 = new StringBuilder(String.valueOf(valueOf3222222222).length() + 79 + String.valueOf(valueOf22222222222).length());
                                    sb2222222222.append("Error during tokenization with errorCode=");
                                    sb2222222222.append(valueOf3222222222);
                                    sb2222222222.append(", errorType=");
                                    sb2222222222.append(i2);
                                    sb2222222222.append(", errorMessage=");
                                    sb2222222222.append(valueOf22222222222);
                                    throw new atrn(sb2222222222.toString(), i2, btnf, r2);
                                }
                            }
                            CardInfo b2 = this.f90715a.mo49853b(this.f90729p);
                            if (b2 != null) {
                                bundle2.putParcelable("data_card_info", b2);
                                this.f90716c = bundle2;
                            } else {
                                throw new RuntimeException();
                            }
                        } catch (atdb e16) {
                            str2 = str4;
                            str = str3;
                            this.f90715a.mo49859d();
                            r2 = btnf;
                            i2 = 102;
                            i = 2;
                            String valueOf32222222222 = String.valueOf(btmt.m116935c(i));
                            String valueOf222222222222 = String.valueOf(btnf);
                            StringBuilder sb22222222222 = new StringBuilder(String.valueOf(valueOf32222222222).length() + 79 + String.valueOf(valueOf222222222222).length());
                            sb22222222222.append("Error during tokenization with errorCode=");
                            sb22222222222.append(valueOf32222222222);
                            sb22222222222.append(", errorType=");
                            sb22222222222.append(i2);
                            sb22222222222.append(", errorMessage=");
                            sb22222222222.append(valueOf222222222222);
                            throw new atrn(sb22222222222.toString(), i2, btnf, r2);
                        } catch (atfh e17) {
                            e = e17;
                            str2 = str4;
                            str = str3;
                            atfh = e;
                            btmu a12222 = atvb.m76439a(atfh.f90231a);
                            if (!athh.m75883a(this.f90717d, atfh)) {
                            }
                            btnf = atfh.f90231a;
                            r2 = btnf;
                            String valueOf322222222222 = String.valueOf(btmt.m116935c(i));
                            String valueOf2222222222222 = String.valueOf(btnf);
                            StringBuilder sb222222222222 = new StringBuilder(String.valueOf(valueOf322222222222).length() + 79 + String.valueOf(valueOf2222222222222).length());
                            sb222222222222.append("Error during tokenization with errorCode=");
                            sb222222222222.append(valueOf322222222222);
                            sb222222222222.append(", errorType=");
                            sb222222222222.append(i2);
                            sb222222222222.append(", errorMessage=");
                            sb222222222222.append(valueOf2222222222222);
                            throw new atrn(sb222222222222.toString(), i2, btnf, r2);
                        } catch (atcz | IOException e18) {
                            e = e18;
                            str2 = str4;
                            str = str3;
                            th = e;
                            bnsl bnsl422 = (bnsl) f90714b.mo68388c();
                            bnsl422.mo68437a(th);
                            bnsl422.mo68432a(str2, str, 370, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl422.mo68405a("Backing off from tokenizing card");
                            i2 = 101;
                            i = 2;
                            btnf = atey.m75751a(this.f90717d, C0126R.string.tp_add_card_error_title, C0126R.string.tp_add_card_error_content);
                            r2 = btnf;
                            String valueOf3222222222222 = String.valueOf(btmt.m116935c(i));
                            String valueOf22222222222222 = String.valueOf(btnf);
                            StringBuilder sb2222222222222 = new StringBuilder(String.valueOf(valueOf3222222222222).length() + 79 + String.valueOf(valueOf22222222222222).length());
                            sb2222222222222.append("Error during tokenization with errorCode=");
                            sb2222222222222.append(valueOf3222222222222);
                            sb2222222222222.append(", errorType=");
                            sb2222222222222.append(i2);
                            sb2222222222222.append(", errorMessage=");
                            sb2222222222222.append(valueOf22222222222222);
                            throw new atrn(sb2222222222222.toString(), i2, btnf, r2);
                        } catch (asks | RuntimeException e19) {
                            e = e19;
                            str2 = str4;
                            str = str3;
                            th2 = e;
                            bnsl bnsl2222 = (bnsl) f90714b.mo68388c();
                            bnsl2222.mo68437a(th2);
                            bnsl2222.mo68432a(str2, str, 376, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2222.mo68405a("Error tokenizing");
                            r2 = btnf;
                            i2 = 101;
                            i = 2;
                            String valueOf32222222222222 = String.valueOf(btmt.m116935c(i));
                            String valueOf222222222222222 = String.valueOf(btnf);
                            StringBuilder sb22222222222222 = new StringBuilder(String.valueOf(valueOf32222222222222).length() + 79 + String.valueOf(valueOf222222222222222).length());
                            sb22222222222222.append("Error during tokenization with errorCode=");
                            sb22222222222222.append(valueOf32222222222222);
                            sb22222222222222.append(", errorType=");
                            sb22222222222222.append(i2);
                            sb22222222222222.append(", errorMessage=");
                            sb22222222222222.append(valueOf222222222222222);
                            throw new atrn(sb22222222222222.toString(), i2, btnf, r2);
                        }
                    }
                }
                try {
                    sre.m36089i(this.f90717d.f89126d);
                } catch (asks e20) {
                    asks asks = e20;
                    bnsl bnsl6 = (bnsl) f90714b.mo68388c();
                    bnsl6.mo68437a(asks);
                    bnsl6.mo68432a("atro", "a", 143, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl6.mo68405a("Error writing num payment tokens to wear settings");
                }
                bundle = this.f90716c;
            } catch (atdb e21) {
                str2 = "atro";
                str = "b";
                btnf = null;
                this.f90715a.mo49859d();
                r2 = btnf;
                i2 = 102;
                i = 2;
                String valueOf322222222222222 = String.valueOf(btmt.m116935c(i));
                String valueOf2222222222222222 = String.valueOf(btnf);
                StringBuilder sb222222222222222 = new StringBuilder(String.valueOf(valueOf322222222222222).length() + 79 + String.valueOf(valueOf2222222222222222).length());
                sb222222222222222.append("Error during tokenization with errorCode=");
                sb222222222222222.append(valueOf322222222222222);
                sb222222222222222.append(", errorType=");
                sb222222222222222.append(i2);
                sb222222222222222.append(", errorMessage=");
                sb222222222222222.append(valueOf2222222222222222);
                throw new atrn(sb222222222222222.toString(), i2, btnf, r2);
            } catch (atfh e22) {
                e = e22;
                str2 = "atro";
                str = "b";
                btnf2 = null;
                atfh = e;
                btmu a122222 = atvb.m76439a(atfh.f90231a);
                if (!athh.m75883a(this.f90717d, atfh)) {
                    i2 = 102;
                    i = 2;
                } else if (a122222 != null) {
                    int b3 = btmt.m116934b(a122222.f149548a);
                    if (b3 == 0) {
                        b3 = 1;
                    }
                    int i3 = b3 - 2;
                    if (i3 == 1) {
                        try {
                            this.f90715a.mo49859d();
                            i = b3;
                            i2 = 101;
                        } catch (asks | atfh | IOException e23) {
                            Throwable th7 = e23;
                            bnsl bnsl7 = (bnsl) f90714b.mo68388c();
                            bnsl7.mo68437a(th7);
                            bnsl7.mo68432a(str2, str, 294, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl7.mo68405a("Unable to fetch cards");
                            i = b3;
                            i2 = 101;
                        }
                    } else if (i3 != 12) {
                        if (i3 != 3) {
                            if (i3 == 4) {
                                ? k2 = a122222.f149549b.mo73780k();
                                if (k2 == 0) {
                                    btnf = k2;
                                } else if (k2.length != 0) {
                                    i2 = 106;
                                    btnf = k2;
                                    i = b3;
                                } else {
                                    btnf = k2;
                                    i = b3;
                                    i2 = 102;
                                }
                            } else if (i3 != 5) {
                                if (i3 != 8) {
                                    if (i3 != 9) {
                                        switch (i3) {
                                            case 14:
                                                i2 = ErrorInfo.TYPE_SDU_MEMORY_FULL;
                                                i = b3;
                                                break;
                                            case 15:
                                                ? k3 = a122222.f149549b.mo73780k();
                                                if (k3 != 0 && k3.length != 0) {
                                                    i2 = 108;
                                                    btnf = a122222.f149549b.mo73780k();
                                                    i = b3;
                                                    break;
                                                } else {
                                                    bnsl bnsl8 = (bnsl) f90714b.mo68388c();
                                                    bnsl8.mo68432a(str2, str, 352, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                    bnsl8.mo68405a("Server should never return CVN_EXPIRED without a recovery token.");
                                                    i = b3;
                                                    btnf = k3;
                                                    i2 = 102;
                                                    break;
                                                }
                                                break;
                                            case 16:
                                                break;
                                            default:
                                                bnsl bnsl9 = (bnsl) f90714b.mo68388c();
                                                bnsl9.mo68432a(str2, str, 360, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                bnsl9.mo68409a("Unknown error code: %d", btmt.m116933a(b3));
                                                i = b3;
                                                i2 = 101;
                                                break;
                                        }
                                    }
                                } else {
                                    try {
                                        this.f90715a.mo49855b(this.f90729p, 4);
                                    } catch (asks e24) {
                                        asks asks2 = e24;
                                        bnsl bnsl10 = (bnsl) f90714b.mo68388c();
                                        bnsl10.mo68437a(asks2);
                                        bnsl10.mo68432a(str2, str, 330, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl10.mo68405a("Error deleting token to restart tokenization");
                                        i = b3;
                                        i2 = 102;
                                        btnf = atfh.f90231a;
                                        r2 = btnf;
                                        String valueOf3222222222222222 = String.valueOf(btmt.m116935c(i));
                                        String valueOf22222222222222222 = String.valueOf(btnf);
                                        StringBuilder sb2222222222222222 = new StringBuilder(String.valueOf(valueOf3222222222222222).length() + 79 + String.valueOf(valueOf22222222222222222).length());
                                        sb2222222222222222.append("Error during tokenization with errorCode=");
                                        sb2222222222222222.append(valueOf3222222222222222);
                                        sb2222222222222222.append(", errorType=");
                                        sb2222222222222222.append(i2);
                                        sb2222222222222222.append(", errorMessage=");
                                        sb2222222222222222.append(valueOf22222222222222222);
                                        throw new atrn(sb2222222222222222.toString(), i2, btnf, r2);
                                    }
                                }
                                i = b3;
                                i2 = 102;
                            }
                            i = b3;
                            i2 = 102;
                        }
                        i = b3;
                        i2 = 102;
                    } else {
                        try {
                            this.f90715a.mo49859d();
                            i = b3;
                            i2 = 102;
                        } catch (asks | atfh | IOException e25) {
                            Throwable th8 = e25;
                            bnsl bnsl11 = (bnsl) f90714b.mo68388c();
                            bnsl11.mo68437a(th8);
                            bnsl11.mo68432a(str2, str, 285, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl11.mo68405a("Unable to fetch cards");
                            i = b3;
                            i2 = 102;
                        }
                    }
                } else {
                    i2 = 101;
                    i = 2;
                }
                btnf = atfh.f90231a;
                r2 = btnf;
                String valueOf32222222222222222 = String.valueOf(btmt.m116935c(i));
                String valueOf222222222222222222 = String.valueOf(btnf);
                StringBuilder sb22222222222222222 = new StringBuilder(String.valueOf(valueOf32222222222222222).length() + 79 + String.valueOf(valueOf222222222222222222).length());
                sb22222222222222222.append("Error during tokenization with errorCode=");
                sb22222222222222222.append(valueOf32222222222222222);
                sb22222222222222222.append(", errorType=");
                sb22222222222222222.append(i2);
                sb22222222222222222.append(", errorMessage=");
                sb22222222222222222.append(valueOf222222222222222222);
                throw new atrn(sb22222222222222222.toString(), i2, btnf, r2);
            } catch (IOException e26) {
                e = e26;
                str2 = "atro";
                str = "b";
                btnf3 = null;
                th = e;
                bnsl bnsl4222 = (bnsl) f90714b.mo68388c();
                bnsl4222.mo68437a(th);
                bnsl4222.mo68432a(str2, str, 370, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4222.mo68405a("Backing off from tokenizing card");
                i2 = 101;
                i = 2;
                btnf = atey.m75751a(this.f90717d, C0126R.string.tp_add_card_error_title, C0126R.string.tp_add_card_error_content);
                r2 = btnf;
                String valueOf322222222222222222 = String.valueOf(btmt.m116935c(i));
                String valueOf2222222222222222222 = String.valueOf(btnf);
                StringBuilder sb222222222222222222 = new StringBuilder(String.valueOf(valueOf322222222222222222).length() + 79 + String.valueOf(valueOf2222222222222222222).length());
                sb222222222222222222.append("Error during tokenization with errorCode=");
                sb222222222222222222.append(valueOf322222222222222222);
                sb222222222222222222.append(", errorType=");
                sb222222222222222222.append(i2);
                sb222222222222222222.append(", errorMessage=");
                sb222222222222222222.append(valueOf2222222222222222222);
                throw new atrn(sb222222222222222222.toString(), i2, btnf, r2);
            } catch (atcz e27) {
                e = e27;
                str2 = "atro";
                str = "b";
                btnf3 = null;
                th = e;
                bnsl bnsl42222 = (bnsl) f90714b.mo68388c();
                bnsl42222.mo68437a(th);
                bnsl42222.mo68432a(str2, str, 370, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl42222.mo68405a("Backing off from tokenizing card");
                i2 = 101;
                i = 2;
                btnf = atey.m75751a(this.f90717d, C0126R.string.tp_add_card_error_title, C0126R.string.tp_add_card_error_content);
                r2 = btnf;
                String valueOf3222222222222222222 = String.valueOf(btmt.m116935c(i));
                String valueOf22222222222222222222 = String.valueOf(btnf);
                StringBuilder sb2222222222222222222 = new StringBuilder(String.valueOf(valueOf3222222222222222222).length() + 79 + String.valueOf(valueOf22222222222222222222).length());
                sb2222222222222222222.append("Error during tokenization with errorCode=");
                sb2222222222222222222.append(valueOf3222222222222222222);
                sb2222222222222222222.append(", errorType=");
                sb2222222222222222222.append(i2);
                sb2222222222222222222.append(", errorMessage=");
                sb2222222222222222222.append(valueOf22222222222222222222);
                throw new atrn(sb2222222222222222222.toString(), i2, btnf, r2);
            } catch (RuntimeException e28) {
                e = e28;
                str2 = "atro";
                str = "b";
                btnf4 = null;
                th2 = e;
                bnsl bnsl22222 = (bnsl) f90714b.mo68388c();
                bnsl22222.mo68437a(th2);
                bnsl22222.mo68432a(str2, str, 376, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl22222.mo68405a("Error tokenizing");
                r2 = btnf;
                i2 = 101;
                i = 2;
                String valueOf32222222222222222222 = String.valueOf(btmt.m116935c(i));
                String valueOf222222222222222222222 = String.valueOf(btnf);
                StringBuilder sb22222222222222222222 = new StringBuilder(String.valueOf(valueOf32222222222222222222).length() + 79 + String.valueOf(valueOf222222222222222222222).length());
                sb22222222222222222222.append("Error during tokenization with errorCode=");
                sb22222222222222222222.append(valueOf32222222222222222222);
                sb22222222222222222222.append(", errorType=");
                sb22222222222222222222.append(i2);
                sb22222222222222222222.append(", errorMessage=");
                sb22222222222222222222.append(valueOf222222222222222222222);
                throw new atrn(sb22222222222222222222.toString(), i2, btnf, r2);
            } catch (asks e29) {
                e = e29;
                str2 = "atro";
                str = "b";
                btnf4 = null;
                th2 = e;
                bnsl bnsl222222 = (bnsl) f90714b.mo68388c();
                bnsl222222.mo68437a(th2);
                bnsl222222.mo68432a(str2, str, 376, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl222222.mo68405a("Error tokenizing");
                r2 = btnf;
                i2 = 101;
                i = 2;
                String valueOf322222222222222222222 = String.valueOf(btmt.m116935c(i));
                String valueOf2222222222222222222222 = String.valueOf(btnf);
                StringBuilder sb222222222222222222222 = new StringBuilder(String.valueOf(valueOf322222222222222222222).length() + 79 + String.valueOf(valueOf2222222222222222222222).length());
                sb222222222222222222222.append("Error during tokenization with errorCode=");
                sb222222222222222222222.append(valueOf322222222222222222222);
                sb222222222222222222222.append(", errorType=");
                sb222222222222222222222.append(i2);
                sb222222222222222222222.append(", errorMessage=");
                sb222222222222222222222.append(valueOf2222222222222222222222);
                throw new atrn(sb222222222222222222222.toString(), i2, btnf, r2);
            } catch (Throwable th9) {
                throw th9;
            }
        }
        return bundle;
    }
}
