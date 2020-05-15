package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.InStoreCvmConfig;
import com.google.android.gms.tapandpay.firstparty.TransactionData;

/* renamed from: atbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atbu {

    /* renamed from: a */
    public static final srn f90032a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    public final askf f90033b;

    public atbu(askf askf) {
        this.f90033b = askf;
    }

    /* renamed from: a */
    private final InStoreCvmConfig m75424a(CardInfo cardInfo, atcv atcv) {
        InStoreCvmConfig inStoreCvmConfig = cardInfo.f108358s;
        if (inStoreCvmConfig == null) {
            inStoreCvmConfig = aszu.m75260a(atcv.mo49805g());
        }
        sre.m36089i(this.f90033b.f89126d);
        if (!cgxr.f187985a.mo6606a().mo84693e() || !asul.f89755a) {
            return inStoreCvmConfig;
        }
        bnsl bnsl = (bnsl) f90032a.mo68388c();
        bnsl.mo68432a("atbu", "a", 137, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Device unlock override enabled");
        asoa a = inStoreCvmConfig.mo59242a();
        a.f89282a = true;
        a.f89283b = 30;
        return a.mo49274a();
    }

    /* renamed from: b */
    public static final atbm m75426b() {
        return new atbm();
    }

    /* renamed from: a */
    private final void m75425a(CardInfo cardInfo, atbl atbl) {
        try {
            m75426b();
            mo49792a((atcv) atbm.m75388a(this.f90033b, cardInfo.f108340a, atbl));
        } catch (aths e) {
            bnsl bnsl = (bnsl) f90032a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atbu", "a", 298, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("No storage key available to update transaction log");
        } catch (atdb e2) {
            bnsl bnsl2 = (bnsl) f90032a.mo68388c();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("atbu", "a", (int) ErrorInfo.TYPE_FSC_HTTP_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Bundle for the given applet doesn't exist anymore");
        } catch (asks e3) {
            bnsl bnsl3 = (bnsl) f90032a.mo68388c();
            bnsl3.mo68437a(e3);
            bnsl3.mo68432a("atbu", "a", 304, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Error updating bundle after transaction");
        } catch (atbk e4) {
            throw new RuntimeException(e4);
        }
    }

    /* renamed from: a */
    public final asqs mo49788a(CardInfo cardInfo, asqw asqw, boolean z) {
        try {
            m75426b();
            atda a = atbm.m75384a(this.f90033b, cardInfo.f108340a);
            asqw.f89459w = a.f90101b;
            atcv atcv = a.f90108i;
            if (atcv == null) {
                return null;
            }
            InStoreCvmConfig inStoreCvmConfig = cardInfo.f108358s;
            if (inStoreCvmConfig == null) {
                inStoreCvmConfig = aszu.m75260a(atcv.mo49805g());
            }
            sre.m36089i(this.f90033b.f89126d);
            if (cgxr.f187985a.mo6606a().mo84693e()) {
                if (asul.f89755a) {
                    bnsl bnsl = (bnsl) f90032a.mo68388c();
                    bnsl.mo68432a("atbu", "a", 137, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Device unlock override enabled");
                    asoa a2 = inStoreCvmConfig.mo59242a();
                    a2.f89282a = true;
                    a2.f89283b = 30;
                    inStoreCvmConfig = a2.mo49274a();
                }
            }
            String str = cardInfo.f108340a;
            asqw.f89447k = inStoreCvmConfig.f108387d;
            asqw.f89446j = inStoreCvmConfig.f108386c;
            asqw.f89444h = inStoreCvmConfig.f108384a;
            asqw.f89445i = (long) inStoreCvmConfig.f108385b;
            asqw.f89449m = atcv.mo49805g();
            asqw.f89458v = atcv.mo49804f();
            aszu aszu = new aszu(this.f90033b.f89126d, inStoreCvmConfig, asqw);
            if (z) {
                if (asqw.f89458v) {
                    if (!aszu.mo49382a()) {
                        throw new atbk(new atcu());
                    }
                }
            }
            asqs a3 = atcv.mo49793a(this.f90033b, aszu, str);
            asqw.f89460x = a3.mo49393h();
            return a3;
        } catch (atdb e) {
            bnsl bnsl2 = (bnsl) f90032a.mo68388c();
            bnsl2.mo68432a("atbu", "a", 81, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Creating payment applet for not-existing card");
            return null;
        } catch (atbk e2) {
            bnsl a4 = f90032a.mo26019b(aske.m74275a());
            a4.mo68432a("atbu", "a", 84, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            a4.mo68405a("createPaymentApplet threw velocity check exception");
            throw ((atcu) e2.getCause());
        }
    }

    /* renamed from: a */
    public final atct mo49789a(String str, String str2, TransactionData transactionData, byte[] bArr, boolean z) {
        String str3 = str2;
        Context context = this.f90033b.f89126d;
        int i = aszv.f89931a;
        if (aszv.m75265a(context, str, str3)) {
            atds a = atds.m75666a(this.f90033b);
            SQLiteDatabase a2 = asko.m74292a(context).mo49214a();
            a2.beginTransaction();
            try {
                btiy a3 = a.mo49843a(str3);
                m75426b();
                atcq atcq = (atcq) atbm.m75388a(this.f90033b, str3, new atbr(this, transactionData, bArr, z, a3));
                a2.setTransactionSuccessful();
                a2.endTransaction();
                return atcq.mo49826a();
            } catch (atdb e) {
                bnsl bnsl = (bnsl) f90032a.mo68388c();
                bnsl.mo68432a("atbu", "a", 227, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("The card has no bundle");
                throw new atcr(e);
            } catch (atbk e2) {
                atbq.m75407a(context);
                throw ((atcr) e2.getCause());
            } catch (Throwable th) {
                a2.endTransaction();
                throw th;
            }
        } else {
            throw new atdc();
        }
    }

    /* renamed from: a */
    public final void mo49790a() {
        CardInfo b;
        if (cgwn.m147256f()) {
            atkm atkm = new atkm(this.f90033b.f89126d);
            try {
                String string = atkm.f90420c.getString("dirty_hce_client_token_id", null);
                if (!(string == null || (b = new atdz(this.f90033b).mo49880b(string)) == null)) {
                    m75425a(b, new atbs(mo49788a(b, new asqw(), true)));
                }
            } catch (atcu e) {
                bnsl a = f90032a.mo26019b(aske.m74275a());
                a.mo68437a(e);
                a.mo68432a("atbu", "a", 272, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                a.mo68405a("createWithoutChecks failed");
            } catch (Throwable th) {
                atkm.mo50012a((String) null);
                throw th;
            }
            atkm.mo50012a((String) null);
        }
    }

    /* renamed from: a */
    public final void mo49791a(asqs asqs, CardInfo cardInfo) {
        m75425a(cardInfo, new atbt(this, asqs));
    }

    /* renamed from: a */
    public final void mo49792a(atcv atcv) {
        try {
            if (!atcv.mo49803e()) {
                return;
            }
        } catch (atcz e) {
            bnsl bnsl = (bnsl) f90032a.mo68390d();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atbu", "a", (int) MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to get information about bundle refresh");
        }
        atbq.m75407a(this.f90033b.f89126d);
    }
}
