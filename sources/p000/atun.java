package p000;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraService;
import java.io.IOException;

/* renamed from: atun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atun extends atvb {

    /* renamed from: a */
    private static final srn f90904a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    private String f90905b;

    /* renamed from: c */
    private boolean f90906c;

    /* renamed from: h */
    private final askf f90907h;

    /* renamed from: i */
    private String f90908i;

    /* renamed from: j */
    private final atds f90909j;

    /* renamed from: k */
    private final String f90910k;

    /* renamed from: l */
    private boolean f90911l;

    /* renamed from: m */
    private byte[] f90912m;

    /* renamed from: n */
    private byte[] f90913n = null;

    /* renamed from: o */
    private PushTokenizeRequest f90914o;

    /* renamed from: p */
    private btlv f90915p;

    /* renamed from: q */
    private byte[] f90916q;

    /* renamed from: r */
    private String f90917r;

    /* renamed from: s */
    private atam f90918s;

    /* renamed from: t */
    private bpbr f90919t;

    /* renamed from: u */
    private int f90920u;

    public atun(Bundle bundle, Messenger messenger, askf askf, TokenizePanChimeraService tokenizePanChimeraService) {
        super(tokenizePanChimeraService);
        this.f90907h = askf;
        this.f90986e = messenger;
        this.f90909j = atds.m75666a(askf);
        this.f90910k = askf.f89127e;
        srn srn = atbq.f90017a;
        this.f90905b = bundle.getString("data_billing_id");
        this.f90906c = bundle.getBoolean("data_is_newly_added_card");
        this.f90908i = bundle.getString("data_session_id");
        this.f90912m = bundle.getByteArray("data_orchestration_callback_data");
        int b = btna.m116943b(bundle.getInt("data_client_type"));
        this.f90920u = b == 0 ? 2 : b;
        this.f90914o = null;
        byte[] byteArray = bundle.getByteArray("data_push_tokenize_request");
        if (byteArray != null) {
            this.f90914o = (PushTokenizeRequest) sef.m35069a(byteArray, PushTokenizeRequest.CREATOR);
        }
        this.f90911l = bundle.getBoolean("data_is_account_tokenization", false);
        this.f90916q = bundle.getByteArray("data_opaque_card_data");
        this.f90917r = bundle.getString("data_server_session_id");
        try {
            byte[] byteArray2 = bundle.getByteArray("data_push_tokenize_params");
            if (byteArray2 != null) {
                this.f90915p = (btlv) GeneratedMessageLite.m124016a(btlv.f149435f, byteArray2, bxus.m123744c());
            }
        } catch (bxwf e) {
            bnsl bnsl = (bnsl) f90904a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atun", "a", 184, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to parse push tokenization params");
        }
        if (cgwn.m147263m()) {
            this.f90918s = new atam(this.f90907h);
            bxvd da = bpbr.f135616f.mo74144da();
            String str = this.f90908i;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpbr bpbr = (bpbr) da.f164949b;
            str.getClass();
            int i = bpbr.f135618a | 1;
            bpbr.f135618a = i;
            bpbr.f135619b = str;
            bpbr.f135620c = 10;
            bpbr.f135618a = i | 2;
            this.f90919t = (bpbr) da.mo74062i();
        }
    }

    /* renamed from: a */
    public static Message m76394a(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, byte[] bArr4, String str2, boolean z, boolean z2, String str3, int i, AccountInfo accountInfo, String str4, Handler handler) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("data_push_tokenize_request", bArr);
        bundle.putByteArray("data_orchestration_callback_data", bArr2);
        bundle.putString("data_billing_id", str);
        bundle.putBoolean("data_is_newly_added_card", z2);
        bundle.putString("data_session_id", str3);
        bundle.putInt("data_client_type", i);
        bundle.putBoolean("data_is_account_tokenization", z);
        bundle.putByteArray("data_push_tokenize_params", bArr3);
        bundle.putByteArray("data_opaque_card_data", bArr4);
        bundle.putString("data_server_session_id", str2);
        return atvb.m76438a(1, bundle, accountInfo, str4, handler);
    }

    /* renamed from: a */
    private final void m76395a(Bundle bundle) {
        this.f90905b = bundle.getString("data_billing_id");
        this.f90906c = bundle.getBoolean("data_is_newly_added_card");
        this.f90908i = bundle.getString("data_session_id");
        this.f90912m = bundle.getByteArray("data_orchestration_callback_data");
        int b = btna.m116943b(bundle.getInt("data_client_type"));
        if (b == 0) {
            b = 2;
        }
        this.f90920u = b;
        this.f90914o = null;
        byte[] byteArray = bundle.getByteArray("data_push_tokenize_request");
        if (byteArray != null) {
            this.f90914o = (PushTokenizeRequest) sef.m35069a(byteArray, PushTokenizeRequest.CREATOR);
        }
        this.f90911l = bundle.getBoolean("data_is_account_tokenization", false);
        this.f90916q = bundle.getByteArray("data_opaque_card_data");
        this.f90917r = bundle.getString("data_server_session_id");
        try {
            byte[] byteArray2 = bundle.getByteArray("data_push_tokenize_params");
            if (byteArray2 != null) {
                this.f90915p = (btlv) GeneratedMessageLite.m124016a(btlv.f149435f, byteArray2, bxus.m123744c());
            }
        } catch (bxwf e) {
            bnsl bnsl = (bnsl) f90904a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atun", "a", 184, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to parse push tokenization params");
        }
        if (cgwn.m147263m()) {
            this.f90918s = new atam(this.f90907h);
            bxvd da = bpbr.f135616f.mo74144da();
            String str = this.f90908i;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpbr bpbr = (bpbr) da.f164949b;
            str.getClass();
            int i = bpbr.f135618a | 1;
            bpbr.f135618a = i;
            bpbr.f135619b = str;
            bpbr.f135620c = 10;
            bpbr.f135618a = i | 2;
            this.f90919t = (bpbr) da.mo74062i();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x028c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x028d, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x028f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0290, code lost:
        r6 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        r1.f90988g = 101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0298, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x029d, code lost:
        if (p000.cgwn.m147263m() != false) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x029f, code lost:
        r6 = r1.f90918s;
        r7 = r1.f90919t;
        r8 = p000.bpbq.f135610e.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02ab, code lost:
        if (r8.f164950c != false) goto L_0x02ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02ad, code lost:
        r8.mo74035c();
        r8.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02b2, code lost:
        r9 = (p000.bpbq) r8.f164949b;
        r9.f135615d = 1;
        r9.f135612a = 1 | r9.f135612a;
        r6.mo49740a(r7, (p000.bpbq) r8.mo74062i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02c6, code lost:
        r6 = (p000.bnsl) p000.atun.f90904a.mo68388c();
        r6.mo68437a(r2);
        r6.mo68432a("atun", "a", 411, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r6.mo68405a("Error checking eligibility");
        r1.f90988g = 101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02dd, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x032f, code lost:
        r7 = p000.atvb.m76439a(r6.f90231a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0335, code lost:
        if (r7 != null) goto L_0x0339;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x033d, code lost:
        if (p000.cgwn.m147263m() != false) goto L_0x033f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x033f, code lost:
        r8 = r1.f90918s;
        r14 = r1.f90919t;
        r15 = p000.btmt.m116934b(r7.f149548a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0349, code lost:
        if (r15 == 0) goto L_0x034c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x034c, code lost:
        r15 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x034d, code lost:
        r10 = p000.bpbq.f135610e.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0355, code lost:
        if (r10.f164950c != false) goto L_0x0358;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0358, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x035d, code lost:
        r12 = (p000.bpbq) r10.f164949b;
        r12.f135615d = 5;
        r12.f135612a |= 1;
        r9 = p000.bpbp.m111755a(p000.btmt.m116933a(r15));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0373, code lost:
        if (r10.f164950c != false) goto L_0x0376;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0376, code lost:
        r10.mo74035c();
        r10.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x037b, code lost:
        r12 = (p000.bpbq) r10.f164949b;
        r15 = r9 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0381, code lost:
        if (r9 != 0) goto L_0x0383;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0383, code lost:
        r12.f135614c = java.lang.Integer.valueOf(r15);
        r12.f135613b = 2;
        r8.mo49740a(r14, (p000.bpbq) r10.mo74062i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0396, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0398, code lost:
        r8 = p000.btmt.m116934b(r7.f149548a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x039e, code lost:
        if (r8 == 0) goto L_0x03a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03a1, code lost:
        r8 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03a2, code lost:
        r8 = r8 - 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03a4, code lost:
        if (r8 != 1) goto L_0x03a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03a9, code lost:
        if (r8 != 2) goto L_0x03ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03ac, code lost:
        if (r8 != 3) goto L_0x03ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03b1, code lost:
        if (r8 != 4) goto L_0x03b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03b3, code lost:
        switch(r8) {
            case 15: goto L_0x03ca;
            case 16: goto L_0x03c2;
            case 17: goto L_0x03c0;
            default: goto L_0x03b6;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03b6, code lost:
        r1.f90988g = 101;
        r1.f90987f = r6.f90231a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03bf, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03c2, code lost:
        r1.f90988g = 114;
        r1.f90987f = r6.f90231a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03c9, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03ca, code lost:
        r1.f90987f = r6.f90231a;
        r2 = r7.f149549b.mo73780k();
        r1.f90913n = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03d6, code lost:
        if (r2 != null) goto L_0x03d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03dc, code lost:
        r1.f90988g = 108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03e1, code lost:
        r1.f90988g = 102;
        r2 = (p000.bnsl) p000.atun.f90904a.mo68388c();
        r2.mo68432a("atun", "a", 384, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r2.mo68405a("Server should never return CVN_EXPIRED without a recovery token.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03f7, code lost:
        r1.f90987f = r6.f90231a;
        r6 = r7.f149549b.mo73780k();
        r1.f90913n = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0403, code lost:
        if (r6 != null) goto L_0x0406;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0409, code lost:
        r1.f90988g = 106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x040e, code lost:
        r1.f90988g = 114;
        r2 = (p000.bnsl) p000.atun.f90904a.mo68388c();
        r2.mo68432a("atun", "a", 373, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r2.mo68405a("Server should never return INVALID_CARD_DATA_ERROR without a recovery token.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0424, code lost:
        r1.f90988g = 102;
        r1.f90987f = r6.f90231a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x042a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x042b, code lost:
        r8 = r7.f149550c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x042d, code lost:
        if (r8 == null) goto L_0x042f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x042f, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0432, code lost:
        r8 = r8.f149545a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0434, code lost:
        if (r8 == null) goto L_0x0437;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0437, code lost:
        r8 = p000.btiy.f149054c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x043f, code lost:
        if (android.text.TextUtils.isEmpty(r8.f149056a) == false) goto L_0x0441;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0441, code lost:
        r7 = r7.f149550c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0443, code lost:
        if (r7 == null) goto L_0x0446;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0446, code lost:
        r7 = p000.btms.f149543b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0448, code lost:
        r7 = r7.f149545a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x044a, code lost:
        if (r7 == null) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x044c, code lost:
        r7 = p000.btiy.f149054c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x044e, code lost:
        r7 = r7.f149056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:?, code lost:
        r8 = r1.f90909j.mo49853b(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0456, code lost:
        if (r8 != null) goto L_0x0458;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x045c, code lost:
        if (r8.mo59217a() != false) goto L_0x045e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x045f, code lost:
        r8 = r1.f90907h;
        r10 = p000.atcx.m75566a(r8.f89126d);
        r10.beginTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:?, code lost:
        r14 = android.database.DatabaseUtils.queryNumEntries(r10, "PaymentBundles", "bundle_id = ? AND account_id = ? AND environment = ? AND bundle_state NOT IN ('new', 'deleted')", new java.lang.String[]{r7, r8.f89123a, r8.f89125c});
        r10.setTransactionSuccessful();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:?, code lost:
        r10.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x048a, code lost:
        if (r14 > 0) goto L_0x048c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x049a, code lost:
        if (r1.f90909j.mo49855b(r7, 4) != false) goto L_0x049c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x049d, code lost:
        if (r2.length != 0) goto L_0x04a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x04a9, code lost:
        r1.f90988g = 101;
        r1.f90987f = r6.f90231a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x04b2, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x04bf, code lost:
        return mo50194a(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x04c0, code lost:
        r1.f90988g = 102;
        r1.f90987f = r6.f90231a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x04c7, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x04c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x04c9, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x04ce, code lost:
        if (p000.cgwn.m147263m() != false) goto L_0x04d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x04d0, code lost:
        r7 = r1.f90918s;
        r8 = r1.f90919t;
        r9 = p000.bpbq.f135610e.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x04dc, code lost:
        if (r9.f164950c != false) goto L_0x04df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x04df, code lost:
        r9.mo74035c();
        r9.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x04e4, code lost:
        r10 = (p000.bpbq) r9.f164949b;
        r10.f135615d = 3;
        r10.f135612a = 1 | r10.f135612a;
        r7.mo49740a(r8, (p000.bpbq) r9.mo74062i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x04f9, code lost:
        r7 = (p000.bnsl) p000.atun.f90904a.mo68388c();
        r7.mo68437a(r2);
        r7.mo68432a("atun", "a", 336, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r7.mo68405a("Error handling card already tokenized");
        r1.f90988g = 101;
        r1.f90987f = r6.f90231a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0517, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0518, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0519, code lost:
        r1.f90988g = 102;
        r1.f90987f = r6.f90231a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x051f, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:?, code lost:
        r1.f90909j.mo49859d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x028c A[ExcHandler: RuntimeException (r0v6 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:1:0x0010] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x028f A[ExcHandler: atfh (r0v2 'e' atfh A[CUSTOM_DECLARE]), Splitter:B:1:0x0010] */
    /* renamed from: a */
    public final btkd doInBackground(Boolean... boolArr) {
        atfh atfh;
        SQLiteDatabase a;
        int i;
        Boolean[] boolArr2 = boolArr;
        try {
            if (asiv.m74195e(this.f90907h)) {
                btkb btkb = (btkb) btkc.f149218n.mo74144da();
                int i2 = this.f90920u;
                if (btkb.f164950c) {
                    btkb.mo74035c();
                    btkb.f164950c = false;
                }
                ((btkc) btkb.f164949b).f149224e = btna.m116942a(i2);
                btmr a2 = atvf.m76450a(this.f90985d);
                if (btkb.f164950c) {
                    btkb.mo74035c();
                    btkb.f164950c = false;
                }
                btkc btkc = (btkc) btkb.f164949b;
                a2.getClass();
                btkc.f149221b = a2;
                btkc.f149222c = this.f90906c;
                String str = this.f90908i;
                str.getClass();
                btkc.f149223d = str;
                btkb.mo70823c(atrp.f90735d);
                String str2 = this.f90910k;
                if (btkb.f164950c) {
                    btkb.mo74035c();
                    btkb.f164950c = false;
                }
                str2.getClass();
                ((btkc) btkb.f164949b).f149227h = str2;
                sre.m36089i(rpr.m34216b());
                if (atgf.m75807a(this.f90985d).mo49940a()) {
                    btkb.mo70822b(bnfi.m109236a(atrp.f90732a, atrp.f90733b));
                    if (((Boolean) askd.f89119k.mo58455c()).booleanValue()) {
                        btkb.mo70822b(atrp.f90734c);
                    }
                } else {
                    btkb.mo70822b(atrp.f90732a);
                }
                btkb.mo70821a(aszs.m75257a());
                if (!TextUtils.isEmpty(this.f90917r)) {
                    String str3 = this.f90917r;
                    if (btkb.f164950c) {
                        btkb.mo74035c();
                        btkb.f164950c = false;
                    }
                    str3.getClass();
                    ((btkc) btkb.f164949b).f149232m = str3;
                } else if (this.f90911l) {
                    byte[] bArr = this.f90912m;
                    if (bArr != null) {
                        if (bArr.length != 0) {
                            ByteString a3 = ByteString.m123261a(bArr);
                            if (btkb.f164950c) {
                                btkb.mo74035c();
                                btkb.f164950c = false;
                            }
                            a3.getClass();
                            ((btkc) btkb.f164949b).f149228i = a3;
                        }
                    }
                    btlv btlv = this.f90915p;
                    if (btlv != null) {
                        if (btkb.f164950c) {
                            btkb.mo74035c();
                            btkb.f164950c = false;
                        }
                        btlv.getClass();
                        ((btkc) btkb.f164949b).f149230k = btlv;
                    }
                    byte[] bArr2 = this.f90916q;
                    if (!(bArr2 == null || bArr2.length == 0)) {
                        ByteString a4 = ByteString.m123261a(bArr2);
                        if (btkb.f164950c) {
                            btkb.mo74035c();
                            btkb.f164950c = false;
                        }
                        a4.getClass();
                        ((btkc) btkb.f164949b).f149229j = a4;
                    }
                } else if (this.f90914o != null) {
                    bxvd da = btlv.f149435f.mo74144da();
                    btof a5 = atyj.m76562a(this.f90914o.f108571b);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ((btlv) da.f164949b).f149437a = a5.mo3214a();
                    int i3 = this.f90914o.f108570a;
                    switch (i3) {
                        case 1:
                            i = 5;
                            break;
                        case 2:
                            i = 6;
                            break;
                        case 3:
                            i = 4;
                            break;
                        case 4:
                            i = 3;
                            break;
                        case 5:
                            i = 7;
                            break;
                        case 6:
                            i = 8;
                            break;
                        case 7:
                            i = 9;
                            break;
                        case 8:
                            i = 10;
                            break;
                        case 9:
                            i = 12;
                            break;
                        case 10:
                            i = 13;
                            break;
                        case 11:
                            i = 14;
                            break;
                        case 12:
                            i = 11;
                            break;
                        default:
                            StringBuilder sb = new StringBuilder(27);
                            sb.append("Unknown network ");
                            sb.append(i3);
                            throw new IllegalArgumentException(sb.toString());
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ((btlv) da.f164949b).f149438b = i - 2;
                    String a6 = stm.m36299a(this.f90914o.f108573d);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    btlv btlv2 = (btlv) da.f164949b;
                    a6.getClass();
                    btlv2.f149440d = a6;
                    PushTokenizeRequest pushTokenizeRequest = this.f90914o;
                    String str4 = pushTokenizeRequest.f108574e;
                    str4.getClass();
                    btlv2.f149439c = str4;
                    btlv2.f149441e = pushTokenizeRequest.f108576g;
                    btlv btlv3 = (btlv) da.mo74062i();
                    if (btkb.f164950c) {
                        btkb.mo74035c();
                        btkb.f164950c = false;
                    }
                    btlv3.getClass();
                    ((btkc) btkb.f164949b).f149230k = btlv3;
                    ByteString a7 = ByteString.m123261a(this.f90914o.f108572c);
                    if (btkb.f164950c) {
                        btkb.mo74035c();
                        btkb.f164950c = false;
                    }
                    a7.getClass();
                    ((btkc) btkb.f164949b).f149229j = a7;
                    byte[] bArr3 = this.f90912m;
                    if (!(bArr3 == null || bArr3.length == 0)) {
                        ByteString a8 = ByteString.m123261a(bArr3);
                        if (btkb.f164950c) {
                            btkb.mo74035c();
                            btkb.f164950c = false;
                        }
                        a8.getClass();
                        ((btkc) btkb.f164949b).f149228i = a8;
                    }
                } else {
                    byte[] bArr4 = this.f90912m;
                    if (bArr4 != null) {
                        if (bArr4.length != 0) {
                            ByteString a9 = ByteString.m123261a(bArr4);
                            if (btkb.f164950c) {
                                btkb.mo74035c();
                                btkb.f164950c = false;
                            }
                            a9.getClass();
                            ((btkc) btkb.f164949b).f149228i = a9;
                        }
                    }
                    if (this.f90905b != null) {
                        bxvd da2 = btiy.f149054c.mo74144da();
                        String str5 = this.f90905b;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        str5.getClass();
                        ((btiy) da2.f164949b).f149056a = str5;
                        if (btkb.f164950c) {
                            btkb.mo74035c();
                            btkb.f164950c = false;
                        }
                        btiy btiy = (btiy) da2.mo74062i();
                        btiy.getClass();
                        ((btkc) btkb.f164949b).f149220a = btiy;
                    }
                }
                return (btkd) atff.m75759a(this.f90907h, "t/cardtokenization/checkeligibility", btkb.mo74062i(), btkd.f149233h);
            }
            this.f90988g = 101;
            return null;
        } catch (atfh e) {
        } catch (IOException e2) {
            IOException iOException = e2;
            if (cgwn.m147263m()) {
                atam atam = this.f90918s;
                bpbr bpbr = this.f90919t;
                bxvd da3 = bpbq.f135610e.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bpbq bpbq = (bpbq) da3.f164949b;
                bpbq.f135615d = 2;
                bpbq.f135612a |= 1;
                atam.mo49740a(bpbr, (bpbq) da3.mo74062i());
            }
            bnsl bnsl = (bnsl) f90904a.mo68388c();
            bnsl.mo68437a(iOException);
            bnsl.mo68432a("atun", "a", (int) ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("IOException when checking eligibility");
            mo50221a(this.f90907h, (int) C0126R.string.tp_add_card_error_title, (int) C0126R.string.tp_add_card_error_content);
            return null;
        } catch (RuntimeException e3) {
        } catch (Throwable th) {
            Throwable th2 = th;
            a.endTransaction();
            throw th2;
        }
        this.f90988g = 101;
        this.f90987f = atfh.f90231a;
        return null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo50195a(Object obj) {
        Message message;
        btkd btkd = (btkd) obj;
        Bundle bundle = new Bundle();
        bundle.putInt("data_request_type", 1);
        byte[] bArr = null;
        if (btkd == null) {
            try {
                message = Message.obtain((Handler) null, this.f90988g);
                btnf btnf = this.f90987f;
                if (btnf != null) {
                    bArr = btnf.serializeToBytes();
                }
                bundle.putByteArray("tap_and_pay_api_error", bArr);
                bundle.putByteArray("data_recovery_token", this.f90913n);
            } catch (RemoteException e) {
                return;
            }
        } else {
            Message obtain = Message.obtain((Handler) null, 1001);
            bundle.putByteArray("data_response", btkd.serializeToBytes());
            message = obtain;
        }
        message.setData(bundle);
        this.f90986e.send(message);
    }
}
