package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.internal.firstparty.SetSelectedTokenRequest;
import java.util.Objects;

/* renamed from: atka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atka extends atki {
    public atka(SetSelectedTokenRequest setSelectedTokenRequest, String str, aswm aswm) {
        super("SetSelectedToken", setSelectedTokenRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49249c(status);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atam.a(com.google.android.gms.tapandpay.firstparty.CardInfo, boolean, int, long):void
     arg types: [com.google.android.gms.tapandpay.firstparty.CardInfo, int, int, int]
     candidates:
      atam.a(com.google.android.gms.tapandpay.firstparty.CardInfo, java.lang.String, boolean, boolean):void
      atam.a(com.google.android.gms.tapandpay.firstparty.CardInfo, boolean, int, long):void */
    /* renamed from: b */
    public final void mo50005b(Context context) {
        Status status;
        atds a = atds.m75666a(askg.m74278a(context, this.f90413c));
        SetSelectedTokenRequest setSelectedTokenRequest = (SetSelectedTokenRequest) this.f90410b;
        String str = setSelectedTokenRequest.f108556a;
        long j = setSelectedTokenRequest.f108557b;
        int i = setSelectedTokenRequest.f108559d;
        if (j == -1 || str == null) {
            if (a.f90151a.mo49874a(i)) {
                status = Status.f30107a;
            } else {
                status = Status.f30109c;
            }
        } else if (j == 0) {
            int i2 = 8;
            if (!a.f90151a.mo49884c(str)) {
                atgn atgn = a.f90152b;
                atgu b = atgn.mo49954b(str);
                if (b == null) {
                    ((bnsl) atgn.f90301a.mo68388c()).mo68405a("Card not found");
                    i2 = 15003;
                } else {
                    try {
                        if (atgn.mo49951a(b.f90324a)) {
                            i2 = 0;
                        }
                    } catch (bres e) {
                        bnsl bnsl = (bnsl) atgn.f90301a.mo68387b();
                        bnsl.mo68437a(e);
                        bnsl.mo68405a("Error when changing card to default");
                        i2 = atgh.m75821a(e);
                    }
                }
            } else {
                atdz atdz = a.f90151a;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                SQLiteDatabase d = atdz.mo49886d();
                d.beginTransaction();
                try {
                    if (atdz.mo49875a(d, str)) {
                        String c = atdz.mo49883c(d);
                        String b2 = atdz.mo49881b(d, elapsedRealtime);
                        d.execSQL("UPDATE PaymentCards SET is_selected=(billing_id=?) WHERE account_id=? AND environment=?", atdz.mo49889e(str));
                        d.delete("PaymentCardOverrides", "account_id=? AND environment=?", atdz.mo49885c());
                        d.setTransactionSuccessful();
                        d.endTransaction();
                        asuc.getInstance().mo49501a(atdz.mo49888e(), str, 0, "setDefaultCard");
                        CardInfo b3 = atdz.mo49880b(str);
                        atam atam = new atam(atdz.f90167b);
                        boolean z = !Objects.equals(c, str);
                        boolean z2 = !Objects.equals(b2, str);
                        if (z) {
                            atam.mo49743a(b3);
                        }
                        if (z2) {
                            atam.mo49747a(b3, true, 0, 0L);
                        }
                        if (z || z2) {
                            atkl.f90415a.mo50008a();
                        }
                        i2 = 0;
                    } else {
                        d.endTransaction();
                    }
                } catch (Throwable th) {
                    d.endTransaction();
                    throw th;
                }
            }
            status = new Status(i2);
        } else if (a.f90151a.mo49877a(str, j, i)) {
            status = Status.f30107a;
        } else {
            status = Status.f30109c;
        }
        this.f90414d.mo49249c(status);
    }
}
