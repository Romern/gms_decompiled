package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialRequest;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialResponse;
import com.google.android.gms.tapandpay.firstparty.TransactionData;
import java.io.IOException;

/* renamed from: atjo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atjo extends atki {
    public atjo(RetrieveInAppPaymentCredentialRequest retrieveInAppPaymentCredentialRequest, String str, aswm aswm) {
        super("RetrieveInAppPaymentCredential", retrieveInAppPaymentCredentialRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49615a(status, new RetrieveInAppPaymentCredentialResponse());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0095, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        p000.atbq.m75407a(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009f, code lost:
        throw ((p000.atcr) r0.getCause());
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0095 A[ExcHandler: atbk (r0v20 'e' atbk A[CUSTOM_DECLARE]), Splitter:B:8:0x0054] */
    /* renamed from: b */
    public final void mo50005b(Context context) {
        String str;
        String str2;
        String str3;
        Context context2 = context;
        String str4 = ((RetrieveInAppPaymentCredentialRequest) this.f90410b).f108420a;
        atbu atbu = new atbu(askg.m74284b(str4, context2, this.f90413c));
        asuc instance = asuc.getInstance();
        if (instance.mo49503a(context2)) {
            try {
                RetrieveInAppPaymentCredentialRequest retrieveInAppPaymentCredentialRequest = (RetrieveInAppPaymentCredentialRequest) this.f90410b;
                String str5 = retrieveInAppPaymentCredentialRequest.f108421b;
                TransactionData transactionData = retrieveInAppPaymentCredentialRequest.f108422c;
                byte[] bArr = retrieveInAppPaymentCredentialRequest.f108423d;
                boolean z = retrieveInAppPaymentCredentialRequest.f108424e;
                Context context3 = atbu.f90033b.f89126d;
                int i = aszv.f89931a;
                if (aszv.m75265a(context3, str4, str5)) {
                    atds a = atds.m75666a(atbu.f90033b);
                    SQLiteDatabase a2 = asko.m74292a(context3).mo49214a();
                    a2.beginTransaction();
                    try {
                        btiy a3 = a.mo49843a(str5);
                        try {
                            atbu.m75426b();
                            str2 = "atbu";
                            str = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                            str3 = "a";
                            atcq atcq = (atcq) atbm.m75388a(atbu.f90033b, str5, new atbr(atbu, transactionData, bArr, z, a3));
                            a2.setTransactionSuccessful();
                            a2.endTransaction();
                            atct a4 = atcq.mo49826a();
                            this.f90414d.mo49615a(Status.f30107a, new RetrieveInAppPaymentCredentialResponse(a4.f90095b, a4.f90094a, a4.f90096c, a4.f90097d, a4.f90098e, a4.f90099f));
                            instance.mo49505b(context2, "inApp");
                        } catch (atdb e) {
                            e = e;
                            str = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                            str2 = "atbu";
                            str3 = "a";
                            bnsl bnsl = (bnsl) atbu.f90032a.mo68388c();
                            bnsl.mo68432a(str2, str3, 227, str);
                            bnsl.mo68405a("The card has no bundle");
                            throw new atcr(e);
                        } catch (atbk e2) {
                        }
                    } catch (atdb e3) {
                        e = e3;
                        bnsl bnsl2 = (bnsl) atbu.f90032a.mo68388c();
                        bnsl2.mo68432a(str2, str3, 227, str);
                        bnsl2.mo68405a("The card has no bundle");
                        throw new atcr(e);
                    } catch (atbk e22) {
                    } catch (Throwable th) {
                        a2.endTransaction();
                        throw th;
                    }
                } else {
                    throw new atdc();
                }
            } catch (IllegalStateException e4) {
                throw new aaaj(8, "Illegal state of the bundle. Tap in progress?", null, e4);
            } catch (atdc e5) {
                Intent className = new Intent().setClassName(context2, "com.google.android.gms.tapandpay.tap.TapKeyguardActivity");
                className.setFlags(268435456);
                throw new aaaj(15000, "Unlock required", PendingIntent.getActivity(context2, 0, className, 1207959552), e5);
            } catch (aths e6) {
                throw new aaaj(13, "Storage key missing", null, e6);
            } catch (atfh e7) {
                throw new RuntimeException(e7);
            } catch (IOException e8) {
                throw new aaaj(7, "Network Error", null, e8);
            } catch (atcr e9) {
                throw new aaaj(15001, "No usable credentials for payment", null, e9);
            } catch (atcn e10) {
                try {
                    throw new aaaj(0, e10.getMessage(), null, e10);
                } catch (Throwable th2) {
                    instance.mo49505b(context2, "inApp");
                    throw th2;
                }
            }
        } else {
            throw new aaaj(13, "In-store tap in progress");
        }
    }
}
