package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.GetSeChipTransactionsResponse;
import com.google.android.gms.tapandpay.firstparty.SeTransactionInfo;
import com.google.android.gms.tapandpay.internal.firstparty.GetSeChipTransactionsRequest;
import com.google.android.gms.tapandpay.service.TapAndPayChimeraService;

/* renamed from: atjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atjd extends atki {
    public atjd(GetSeChipTransactionsRequest getSeChipTransactionsRequest, String str, aswm aswm) {
        super("GetSeChipTransactions", getSeChipTransactionsRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49611a(status, (GetSeChipTransactionsResponse) null);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        bngx bngx;
        int i;
        try {
            atgn a = atgn.m75827a(askg.m74277a(context));
            atgu b = a.mo49954b(((GetSeChipTransactionsRequest) this.f90410b).f108544a);
            if (b == null || !b.f90331h) {
                bngx = bngx.m109376e();
            } else {
                atgt atgt = b.f90326c;
                bngs bngs = new bngs();
                bnre i2 = a.f90304d.mo49942b(atgt).listIterator();
                while (i2.hasNext()) {
                    breq breq = (breq) i2.next();
                    int e = breq.mo60906e();
                    if (e != 1) {
                        if (e != 23) {
                            if (e == 27) {
                                i = 3;
                            } else if (e != 13) {
                                if (e != 14) {
                                    breq.mo60906e();
                                    i = 0;
                                } else {
                                    i = 4;
                                }
                            }
                        }
                        i = 2;
                    } else {
                        i = 1;
                    }
                    bngs.mo67668c(new SeTransactionInfo(breq.mo60902a(), breq.mo60903b(), breq.mo60904c().getCurrencyCode(), breq.mo60905d(), i));
                }
                bngx = bngs.mo67664a();
            }
            this.f90414d.mo49611a(Status.f30107a, new GetSeChipTransactionsResponse(bngx));
        } catch (bres e2) {
            bnsl bnsl = (bnsl) TapAndPayChimeraService.f108661a.mo68387b();
            bnsl.mo68437a(e2);
            bnsl.mo68432a("atjd", "b", 1954, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("SdkException while reading transactions");
            this.f90414d.mo49611a(new Status(atgh.m75821a(e2)), (GetSeChipTransactionsResponse) null);
        } catch (asks e3) {
            bnsl bnsl2 = (bnsl) TapAndPayChimeraService.f108661a.mo68387b();
            bnsl2.mo68437a(e3);
            bnsl2.mo68432a("atjd", "b", 1959, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Error while reading transactions");
            this.f90414d.mo49611a(Status.f30109c, (GetSeChipTransactionsResponse) null);
        }
    }
}
