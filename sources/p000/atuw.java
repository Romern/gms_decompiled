package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraService;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: atuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atuw extends atvb {

    /* renamed from: h */
    private static final srn f90948h = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public boolean f90949a = false;

    /* renamed from: b */
    final atgf f90950b;

    /* renamed from: c */
    final atds f90951c;

    /* renamed from: i */
    private final askf f90952i;

    /* renamed from: j */
    private final CardInfo f90953j;

    /* renamed from: k */
    private final atam f90954k;

    /* renamed from: l */
    private int f90955l;

    public atuw(askf askf, Messenger messenger, TokenizePanChimeraService tokenizePanChimeraService, CardInfo cardInfo) {
        super(tokenizePanChimeraService);
        sdo.m34959a(askf);
        sdo.m34959a(messenger);
        this.f90952i = askf;
        this.f90986e = messenger;
        this.f90953j = cardInfo;
        this.f90950b = atgf.m75807a(askf.f89126d);
        this.f90951c = atds.m75666a(askf);
        this.f90954k = new atam(askf);
    }

    /* renamed from: a */
    public static Message m76419a(AccountInfo accountInfo, String str, Handler handler, CardInfo cardInfo) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("data_card_info", cardInfo);
        return m76438a(16, bundle, accountInfo, str, handler);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x031d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x031e, code lost:
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        r6 = (p000.bnsl) p000.atuw.f90948h.mo68388c();
        r6.mo68437a(r5);
        r6.mo68432a("atuw", "a", (int) com.felicanetworks.mfc.mfi.BaseMfiEventCallback.TYPE_OPSRV_RESULT_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r6.mo68405a("Error deleting token after FeliCa provisioning failure");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0341, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0342, code lost:
        r3 = r0;
        r2 = 102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0346, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0347, code lost:
        r6 = (p000.bnsl) p000.atuw.f90948h.mo68388c();
        r6.mo68437a(r0);
        r6.mo68432a("atuw", "a", 248, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r6.mo68405a("Error provisioning felica");
        r1.f90988g = 101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0363, code lost:
        r2 = 102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0372, code lost:
        r1.f90988g = 101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x024f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0250, code lost:
        r5 = r0;
        r9.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0254, code lost:
        throw r5;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0341 A[ExcHandler: atfh (r0v7 'e' atfh A[CUSTOM_DECLARE]), Splitter:B:19:0x00a1] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0346 A[ExcHandler: asks (r0v6 'e' asks A[CUSTOM_DECLARE]), Splitter:B:15:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0362 A[ExcHandler: JSONException (e org.json.JSONException), Splitter:B:15:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0371 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:15:0x009b] */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        atgu atgu;
        bmtc bmtc;
        bmsq bmsq;
        bmtb bmtb;
        String str;
        Void[] voidArr = (Void[]) objArr;
        try {
            atgu = this.f90951c.f90152b.mo49954b(this.f90953j.f108340a);
        } catch (asks e) {
            bnsl bnsl = (bnsl) f90948h.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atuw", "a", 115, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error while reading card from DB");
            atgu = null;
        }
        if (atgu == null) {
            this.f90988g = 102;
            return false;
        }
        atgt atgt = atgu.f90326c;
        try {
            atgf atgf = this.f90950b;
            String str2 = this.f90952i.f89124b;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            AtomicReference atomicReference = new AtomicReference();
            AtomicReference atomicReference2 = new AtomicReference();
            ((bnsl) atgf.f90279a.mo68390d()).mo68420a("Reading secure element info for %s", atgt.name());
            atgg.m75818a(atgt, atgf.f90288g).mo49980a(str2, new atfy(atomicReference, countDownLatch, atomicReference2));
            atgf.m75809a(countDownLatch);
            bres bres = (bres) atomicReference2.get();
            if (bres == null) {
                JSONObject jSONObject = (JSONObject) atomicReference.get();
                sdo.m34959a(jSONObject);
                String jSONObject2 = jSONObject.toString();
                try {
                    this.f90955l = this.f90951c.f90152b.mo49944a(atgt);
                    try {
                        if (atgu.f90330g == null) {
                            this.f90988g = 102;
                            return false;
                        }
                        askf askf = this.f90952i;
                        btiy btiy = atgu.f90324a.f149123a;
                        if (btiy == null) {
                            btiy = btiy.f149054c;
                        }
                        try {
                            bmtc = (bmtc) GeneratedMessageLite.m124016a(bmtc.f130813c, boan.f132470d.mo68796b(atdm.m75640a(askf, btiy, atgu.f90329f, atgu.f90330g, jSONObject2).f149346a), bxus.m123744c());
                        } catch (bxwf e2) {
                            bxwf bxwf = e2;
                            bnsl bnsl2 = (bnsl) f90948h.mo68388c();
                            bnsl2.mo68437a(bxwf);
                            bnsl2.mo68432a("atuw", "a", 288, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68405a("Parsing payment bundle failed");
                            bmtc = null;
                        }
                        if (bmtc.f130815a == 6) {
                            bmsq = (bmsq) bmtc.f130816b;
                        } else {
                            bmsq = bmsq.f130734e;
                        }
                        if (bmsq.f130736a == 3) {
                            bmtb = (bmtb) bmsq.f130737b;
                        } else {
                            bmtb = bmtb.f130808d;
                        }
                        if (bmtb.f130811b.size() == 0) {
                            this.f90988g = 102;
                            return false;
                        }
                        JSONObject jSONObject3 = new JSONObject((String) bmtb.f130811b.get(0));
                        String string = bmtb.f130811b.size() > 1 ? new JSONObject((String) bmtb.f130811b.get(1)).getString("oneTimeDeleteUrl") : null;
                        try {
                            atgf atgf2 = this.f90950b;
                            String str3 = this.f90952i.f89124b;
                            boolean z = this.f90955l == 2;
                            atgf2.mo49941a(str3);
                            AtomicReference atomicReference3 = new AtomicReference();
                            AtomicReference atomicReference4 = new AtomicReference();
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("dynamicCardData", jSONObject3);
                            CountDownLatch countDownLatch2 = new CountDownLatch(1);
                            atgg.m75818a(atgt, atgf2.f90288g).mo49982a(str3, jSONObject4, z, string != null, string, new atfz(atomicReference3, countDownLatch2, atomicReference4));
                            atgf.m75809a(countDownLatch2);
                            bres bres2 = (bres) atomicReference4.get();
                            if (bres2 == null) {
                                String str4 = (String) atomicReference3.get();
                                sdo.m34959a((Object) str4);
                                atgn atgn = this.f90951c.f90152b;
                                btiy btiy2 = atgu.f90324a.f149123a;
                                if (btiy2 == null) {
                                    btiy2 = btiy.f149054c;
                                }
                                String str5 = btiy2.f149056a;
                                String str6 = bmsq.f130738c;
                                SQLiteDatabase f = atgn.mo49958f();
                                f.beginTransaction();
                                atgu atgu2 = (atgu) atxr.m76515a(f, atgl.f90298a, null, "SELECT * FROM SePaymentCards WHERE client_token_id=? AND account_id=? AND environment=?", str5, atgn.mo49961i(), atgn.mo49962j());
                                if (atgu2 != null) {
                                    btjk btjk = atgu2.f90324a;
                                    bxvd bxvd = (bxvd) btjk.mo74142c(5);
                                    bxvd.mo73625a((GeneratedMessageLite) btjk);
                                    if (bxvd.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd.f164950c = false;
                                    }
                                    btjk btjk2 = btjk.f149119C;
                                    str4.getClass();
                                    ((btjk) bxvd.f164949b).f149147y = str4;
                                    atgu2.f90324a = (btjk) bxvd.mo74062i();
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("card", atgu2.f90324a.serializeToBytes());
                                    contentValues.put("bundle_id", str6);
                                    contentValues.put("pending_state", (Integer) 4);
                                    f.update("SePaymentCards", contentValues, "account_id=? AND environment=? AND client_token_id=?", new String[]{atgn.mo49961i(), atgn.mo49962j(), str5});
                                    f.setTransactionSuccessful();
                                }
                                f.endTransaction();
                                this.f90951c.mo49859d();
                                return true;
                            }
                            try {
                                throw bres2;
                            } catch (bres e3) {
                                e = e3;
                            }
                        } catch (bres e4) {
                            e = e4;
                            bres bres3 = e;
                            bnsl bnsl3 = (bnsl) f90948h.mo68388c();
                            bnsl3.mo68437a(bres3);
                            bnsl3.mo68432a("atuw", "a", 190, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl3.mo68405a("Error while provisioning FeliCa card");
                            if (cgvo.m147167b()) {
                                brer brer = bres3.f142689a;
                                String str7 = "";
                                if (brer != null) {
                                    str7 = brer.mo49933a();
                                    str = brer.mo49934b();
                                } else {
                                    str = str7;
                                }
                                atam atam = this.f90954k;
                                int i = atgt != atgt.QUICPAY ? 3 : 2;
                                bxvd g = atam.mo49765g(139);
                                bxvd da = boyt.f135341h.mo74144da();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                boyt boyt = (boyt) da.f164949b;
                                boyt.f135344b = 1;
                                int i2 = boyt.f135343a | 1;
                                boyt.f135343a = i2;
                                boyt.f135345c = 1;
                                int i3 = 2 | i2;
                                boyt.f135343a = i3;
                                boyt.f135348f = i - 1;
                                int i4 = i3 | 64;
                                boyt.f135343a = i4;
                                str7.getClass();
                                int i5 = i4 | 32;
                                boyt.f135343a = i5;
                                boyt.f135347e = str7;
                                str.getClass();
                                boyt.f135343a = i5 | 16;
                                boyt.f135346d = str;
                                if (g.f164950c) {
                                    g.mo74035c();
                                    g.f164950c = false;
                                }
                                bpbx bpbx = (bpbx) g.f164949b;
                                boyt boyt2 = (boyt) da.mo74062i();
                                bpbx bpbx2 = bpbx.f135635S;
                                boyt2.getClass();
                                bpbx.f135645I = boyt2;
                                bpbx.f135656b |= 32;
                                atam.mo49741a((bpbx) g.mo74062i());
                            }
                            if (cgvo.m147167b()) {
                                if (bret.MFI_SERVICE_PROVIDER_LIMIT_REACHED.equals(bres3.f142689a)) {
                                    this.f90949a = true;
                                    this.f90951c.mo49855b(this.f90953j.f108340a, 11);
                                }
                            }
                            this.f90988g = atgh.m75822b(bres3);
                            return false;
                        }
                    } catch (IOException e5) {
                    } catch (atfh e6) {
                        int i6 = 102;
                        atfh atfh = e6;
                        this.f90987f = atfh.f90231a;
                        this.f90988g = i6;
                        return false;
                    } catch (JSONException e7) {
                    } catch (asks e8) {
                    }
                } catch (bres e9) {
                    bnsl bnsl4 = (bnsl) f90948h.mo68388c();
                    bnsl4.mo68437a(e9);
                    bnsl4.mo68432a("atuw", "a", 139, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl4.mo68405a("Error while provisioning FeliCa card");
                    this.f90988g = atgh.m75822b(e9);
                    return false;
                } catch (asks e10) {
                    bnsl bnsl5 = (bnsl) f90948h.mo68388c();
                    bnsl5.mo68437a(e10);
                    bnsl5.mo68432a("atuw", "a", 143, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl5.mo68405a("Error reading default felica card");
                    this.f90988g = 101;
                    return false;
                }
            } else {
                throw bres;
            }
        } catch (bres e11) {
            bnsl bnsl6 = (bnsl) f90948h.mo68388c();
            bnsl6.mo68437a(e11);
            bnsl6.mo68432a("atuw", "a", 129, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl6.mo68405a("Error while provisioning FeliCa card");
            this.f90988g = atgh.m75822b(e11);
            return false;
        }
    }

    /* renamed from: a */
    private final bmtc m76420a(String str) {
        try {
            return (bmtc) GeneratedMessageLite.m124016a(bmtc.f130813c, boan.f132470d.mo68796b(str), bxus.m123744c());
        } catch (bxwf e) {
            bnsl bnsl = (bnsl) f90948h.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atuw", "a", 288, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Parsing payment bundle failed");
            return null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x032e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x032f, code lost:
        r3 = r0;
        r2 = 102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0333, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0334, code lost:
        r6 = (p000.bnsl) p000.atuw.f90948h.mo68388c();
        r6.mo68437a(r0);
        r6.mo68432a("atuw", "a", 248, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r6.mo68405a("Error provisioning felica");
        r1.f90988g = 101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0350, code lost:
        r2 = 102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0353, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0354, code lost:
        r2 = 102;
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0357, code lost:
        r1.f90987f = r3.f90231a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x035b, code lost:
        r1.f90988g = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x035f, code lost:
        r1.f90988g = 101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0369, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x023d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x023e, code lost:
        r5 = r0;
        r9.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0242, code lost:
        throw r5;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x032e A[ExcHandler: atfh (r0v7 'e' atfh A[CUSTOM_DECLARE]), Splitter:B:17:0x0092] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0333 A[ExcHandler: asks (r0v6 'e' asks A[CUSTOM_DECLARE]), Splitter:B:13:0x008c] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x034f A[ExcHandler: JSONException (e org.json.JSONException), Splitter:B:13:0x008c] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x035e A[ExcHandler: IOException (e java.io.IOException), Splitter:B:13:0x008c] */
    /* renamed from: a */
    public final Boolean mo50210a(Void... voidArr) {
        atgu atgu;
        bmtc bmtc;
        bmsq bmsq;
        bmtb bmtb;
        String str;
        try {
            atgu = this.f90951c.f90152b.mo49954b(this.f90953j.f108340a);
        } catch (asks e) {
            bnsl bnsl = (bnsl) f90948h.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atuw", "a", 115, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error while reading card from DB");
            atgu = null;
        }
        if (atgu != null) {
            atgt atgt = atgu.f90326c;
            try {
                atgf atgf = this.f90950b;
                String str2 = this.f90952i.f89124b;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                AtomicReference atomicReference = new AtomicReference();
                AtomicReference atomicReference2 = new AtomicReference();
                ((bnsl) atgf.f90279a.mo68390d()).mo68420a("Reading secure element info for %s", atgt.name());
                atgg.m75818a(atgt, atgf.f90288g).mo49980a(str2, new atfy(atomicReference, countDownLatch, atomicReference2));
                atgf.m75809a(countDownLatch);
                bres bres = (bres) atomicReference2.get();
                if (bres == null) {
                    JSONObject jSONObject = (JSONObject) atomicReference.get();
                    sdo.m34959a(jSONObject);
                    String jSONObject2 = jSONObject.toString();
                    try {
                        this.f90955l = this.f90951c.f90152b.mo49944a(atgt);
                        try {
                            if (atgu.f90330g == null) {
                                this.f90988g = 102;
                                return false;
                            }
                            askf askf = this.f90952i;
                            btiy btiy = atgu.f90324a.f149123a;
                            if (btiy == null) {
                                btiy = btiy.f149054c;
                            }
                            try {
                                bmtc = (bmtc) GeneratedMessageLite.m124016a(bmtc.f130813c, boan.f132470d.mo68796b(atdm.m75640a(askf, btiy, atgu.f90329f, atgu.f90330g, jSONObject2).f149346a), bxus.m123744c());
                            } catch (bxwf e2) {
                                bxwf bxwf = e2;
                                bnsl bnsl2 = (bnsl) f90948h.mo68388c();
                                bnsl2.mo68437a(bxwf);
                                bnsl2.mo68432a("atuw", "a", 288, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl2.mo68405a("Parsing payment bundle failed");
                                bmtc = null;
                            }
                            if (bmtc.f130815a == 6) {
                                bmsq = (bmsq) bmtc.f130816b;
                            } else {
                                bmsq = bmsq.f130734e;
                            }
                            if (bmsq.f130736a == 3) {
                                bmtb = (bmtb) bmsq.f130737b;
                            } else {
                                bmtb = bmtb.f130808d;
                            }
                            if (bmtb.f130811b.size() == 0) {
                                this.f90988g = 102;
                                return false;
                            }
                            JSONObject jSONObject3 = new JSONObject((String) bmtb.f130811b.get(0));
                            String string = bmtb.f130811b.size() > 1 ? new JSONObject((String) bmtb.f130811b.get(1)).getString("oneTimeDeleteUrl") : null;
                            try {
                                atgf atgf2 = this.f90950b;
                                String str3 = this.f90952i.f89124b;
                                boolean z = this.f90955l == 2;
                                atgf2.mo49941a(str3);
                                AtomicReference atomicReference3 = new AtomicReference();
                                AtomicReference atomicReference4 = new AtomicReference();
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put("dynamicCardData", jSONObject3);
                                CountDownLatch countDownLatch2 = new CountDownLatch(1);
                                atgg.m75818a(atgt, atgf2.f90288g).mo49982a(str3, jSONObject4, z, string != null, string, new atfz(atomicReference3, countDownLatch2, atomicReference4));
                                atgf.m75809a(countDownLatch2);
                                bres bres2 = (bres) atomicReference4.get();
                                if (bres2 == null) {
                                    String str4 = (String) atomicReference3.get();
                                    sdo.m34959a((Object) str4);
                                    atgn atgn = this.f90951c.f90152b;
                                    btiy btiy2 = atgu.f90324a.f149123a;
                                    if (btiy2 == null) {
                                        btiy2 = btiy.f149054c;
                                    }
                                    String str5 = btiy2.f149056a;
                                    String str6 = bmsq.f130738c;
                                    SQLiteDatabase f = atgn.mo49958f();
                                    f.beginTransaction();
                                    atgu atgu2 = (atgu) atxr.m76515a(f, atgl.f90298a, null, "SELECT * FROM SePaymentCards WHERE client_token_id=? AND account_id=? AND environment=?", str5, atgn.mo49961i(), atgn.mo49962j());
                                    if (atgu2 != null) {
                                        btjk btjk = atgu2.f90324a;
                                        bxvd bxvd = (bxvd) btjk.mo74142c(5);
                                        bxvd.mo73625a((GeneratedMessageLite) btjk);
                                        if (bxvd.f164950c) {
                                            bxvd.mo74035c();
                                            bxvd.f164950c = false;
                                        }
                                        btjk btjk2 = btjk.f149119C;
                                        str4.getClass();
                                        ((btjk) bxvd.f164949b).f149147y = str4;
                                        atgu2.f90324a = (btjk) bxvd.mo74062i();
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put("card", atgu2.f90324a.serializeToBytes());
                                        contentValues.put("bundle_id", str6);
                                        contentValues.put("pending_state", (Integer) 4);
                                        f.update("SePaymentCards", contentValues, "account_id=? AND environment=? AND client_token_id=?", new String[]{atgn.mo49961i(), atgn.mo49962j(), str5});
                                        f.setTransactionSuccessful();
                                    }
                                    f.endTransaction();
                                    this.f90951c.mo49859d();
                                    return true;
                                }
                                try {
                                    throw bres2;
                                } catch (bres e3) {
                                    e = e3;
                                }
                            } catch (bres e4) {
                                e = e4;
                                bres bres3 = e;
                                bnsl bnsl3 = (bnsl) f90948h.mo68388c();
                                bnsl3.mo68437a(bres3);
                                bnsl3.mo68432a("atuw", "a", 190, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl3.mo68405a("Error while provisioning FeliCa card");
                                if (cgvo.m147167b()) {
                                    brer brer = bres3.f142689a;
                                    String str7 = "";
                                    if (brer != null) {
                                        str7 = brer.mo49933a();
                                        str = brer.mo49934b();
                                    } else {
                                        str = str7;
                                    }
                                    atam atam = this.f90954k;
                                    int i = atgt != atgt.QUICPAY ? 3 : 2;
                                    bxvd g = atam.mo49765g(139);
                                    bxvd da = boyt.f135341h.mo74144da();
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    boyt boyt = (boyt) da.f164949b;
                                    boyt.f135344b = 1;
                                    int i2 = boyt.f135343a | 1;
                                    boyt.f135343a = i2;
                                    boyt.f135345c = 1;
                                    int i3 = 2 | i2;
                                    boyt.f135343a = i3;
                                    boyt.f135348f = i - 1;
                                    int i4 = i3 | 64;
                                    boyt.f135343a = i4;
                                    str7.getClass();
                                    int i5 = i4 | 32;
                                    boyt.f135343a = i5;
                                    boyt.f135347e = str7;
                                    str.getClass();
                                    boyt.f135343a = i5 | 16;
                                    boyt.f135346d = str;
                                    if (g.f164950c) {
                                        g.mo74035c();
                                        g.f164950c = false;
                                    }
                                    bpbx bpbx = (bpbx) g.f164949b;
                                    boyt boyt2 = (boyt) da.mo74062i();
                                    bpbx bpbx2 = bpbx.f135635S;
                                    boyt2.getClass();
                                    bpbx.f135645I = boyt2;
                                    bpbx.f135656b |= 32;
                                    atam.mo49741a((bpbx) g.mo74062i());
                                }
                                if (cgvo.m147167b()) {
                                    if (bret.MFI_SERVICE_PROVIDER_LIMIT_REACHED.equals(bres3.f142689a)) {
                                        this.f90949a = true;
                                        this.f90951c.mo49855b(this.f90953j.f108340a, 11);
                                    }
                                }
                                this.f90988g = atgh.m75822b(bres3);
                                return false;
                            }
                        } catch (asks e5) {
                            asks asks = e5;
                            bnsl bnsl4 = (bnsl) f90948h.mo68388c();
                            bnsl4.mo68437a(asks);
                            bnsl4.mo68432a("atuw", "a", (int) BaseMfiEventCallback.TYPE_OPSRV_RESULT_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl4.mo68405a("Error deleting token after FeliCa provisioning failure");
                        } catch (IOException e6) {
                        } catch (atfh e7) {
                        } catch (JSONException e8) {
                        }
                    } catch (bres e9) {
                        bnsl bnsl5 = (bnsl) f90948h.mo68388c();
                        bnsl5.mo68437a(e9);
                        bnsl5.mo68432a("atuw", "a", 139, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl5.mo68405a("Error while provisioning FeliCa card");
                        this.f90988g = atgh.m75822b(e9);
                        return false;
                    } catch (asks e10) {
                        bnsl bnsl6 = (bnsl) f90948h.mo68388c();
                        bnsl6.mo68437a(e10);
                        bnsl6.mo68432a("atuw", "a", 143, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl6.mo68405a("Error reading default felica card");
                        this.f90988g = 101;
                        return false;
                    }
                } else {
                    throw bres;
                }
            } catch (bres e11) {
                bnsl bnsl7 = (bnsl) f90948h.mo68388c();
                bnsl7.mo68437a(e11);
                bnsl7.mo68432a("atuw", "a", 129, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl7.mo68405a("Error while provisioning FeliCa card");
                this.f90988g = atgh.m75822b(e11);
                return false;
            }
        } else {
            this.f90988g = 102;
            return false;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo50195a(Object obj) {
        Message message;
        try {
            if (((Boolean) obj).booleanValue()) {
                message = Message.obtain((Handler) null, 16001);
                Bundle bundle = new Bundle();
                bundle.putSerializable("data_felica_current_default", Integer.valueOf(this.f90955l));
                message.setData(bundle);
            } else {
                message = Message.obtain((Handler) null, this.f90988g);
                if (cgvo.m147167b()) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putSerializable("data_felica_issuer_limit_reached", Integer.valueOf(this.f90949a ? 1 : 0));
                    message.setData(bundle2);
                }
            }
            this.f90986e.send(message);
        } catch (RemoteException e) {
        }
    }
}
