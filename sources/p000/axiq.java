package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.android.volley.AuthFailureError;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.walletp2p.internal.firstparty.GetTransactionDetailsRequest;
import com.google.android.gms.walletp2p.internal.firstparty.GetTransactionDetailsResponse;
import com.google.android.gms.walletp2p.internal.zeroparty.Transaction;
import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.ExecutionException;

/* renamed from: axiq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axiq extends axeq {

    /* renamed from: e */
    private final GetTransactionDetailsRequest f96021e;

    public axiq(GetTransactionDetailsRequest getTransactionDetailsRequest, Account account, Bundle bundle, axnc axnc) {
        super("GetFirstPartyTransactionDetailsOperation", getTransactionDetailsRequest, account, bundle, axnc);
        this.f96021e = getTransactionDetailsRequest;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        ((axnc) this.f95864c).mo53263a((GetTransactionDetailsResponse) null, status);
    }

    /* JADX WARNING: Removed duplicated region for block: B:85:0x014a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0146 A[SYNTHETIC] */
    /* renamed from: b */
    public final void mo53072b(Context context) {
        int i;
        String str;
        String str2;
        String str3;
        Context context2 = context;
        Account[] a = axlr.m82700a(context2, this.f95862a);
        int length = a.length;
        int i2 = 0;
        while (i2 < length) {
            try {
                bzwb bzwb = (bzwb) axis.m82653a(a[i2], this.f96021e.f110781a, mo53071a(), 2).get();
                if ((bzwb.f171596a & 2) == 0) {
                    i = i2;
                    i2 = i + 1;
                } else {
                    Transaction a2 = axis.m82654a(bzwb);
                    if (chlq.m148935b()) {
                        axnc axnc = (axnc) this.f95864c;
                        long j = a2.f110834d;
                        String str4 = a2.f110835e;
                        String str5 = a2.f110837g;
                        int i3 = a2.f110831a;
                        if (i3 == 1) {
                            str = context2.getString(C0126R.string.walletp2p_payment_to, str5);
                        } else if (i3 == 2) {
                            str = context2.getString(C0126R.string.walletp2p_payment_from, str5);
                        } else if (i3 == 3) {
                            str = context2.getString(C0126R.string.walletp2p_request_to, str5);
                        } else if (i3 == 4) {
                            str = context2.getString(C0126R.string.walletp2p_request_from, str5);
                        } else if (i3 != 5) {
                            str = str5;
                        } else {
                            str = context2.getString(C0126R.string.walletp2p_transferred_to_bank);
                        }
                        i = i2;
                        try {
                            String format = DateFormat.getDateInstance().format(new Date(a2.f110836f));
                            int i4 = a2.f110832b;
                            if (i4 == 1) {
                                int i5 = a2.f110831a;
                                if (i5 != 1) {
                                    if (i5 == 2 || i5 == 3) {
                                        Object[] objArr = new Object[1];
                                        objArr[0] = format;
                                        str2 = context2.getString(C0126R.string.walletp2p_claimed_with_date, objArr);
                                        axnc.mo53263a(new GetTransactionDetailsResponse(j, str4, str, str2, a2.f110843m, a2.f110844n), Status.f30107a);
                                        return;
                                    } else if (i5 != 4) {
                                        str3 = a2.f110842l;
                                    }
                                }
                                Object[] objArr2 = new Object[1];
                                objArr2[0] = format;
                                str2 = context2.getString(C0126R.string.walletp2p_paid_with_date, objArr2);
                                axnc.mo53263a(new GetTransactionDetailsResponse(j, str4, str, str2, a2.f110843m, a2.f110844n), Status.f30107a);
                                return;
                            } else if (i4 != 3) {
                                if (i4 != 5) {
                                    str2 = a2.f110842l;
                                } else {
                                    Object[] objArr3 = new Object[1];
                                    try {
                                        objArr3[0] = format;
                                        str2 = context2.getString(C0126R.string.walletp2p_declined_with_date, objArr3);
                                    } catch (ExecutionException e) {
                                        e = e;
                                        if (e.getCause() instanceof AuthFailureError) {
                                            i2 = i + 1;
                                        } else {
                                            throw e;
                                        }
                                    }
                                }
                                axnc.mo53263a(new GetTransactionDetailsResponse(j, str4, str, str2, a2.f110843m, a2.f110844n), Status.f30107a);
                                return;
                            } else {
                                Object[] objArr4 = new Object[1];
                                objArr4[0] = format;
                                str3 = context2.getString(C0126R.string.walletp2p_canceled_with_date, objArr4);
                            }
                            str2 = str3;
                            axnc.mo53263a(new GetTransactionDetailsResponse(j, str4, str, str2, a2.f110843m, a2.f110844n), Status.f30107a);
                            return;
                        } catch (ExecutionException e2) {
                            e = e2;
                            if (e.getCause() instanceof AuthFailureError) {
                            }
                        }
                    } else {
                        ((axnc) this.f95864c).mo53263a(new GetTransactionDetailsResponse(a2.f110834d, a2.f110835e, null, a2.f110842l, a2.f110843m, a2.f110844n), Status.f30107a);
                        return;
                    }
                }
            } catch (ExecutionException e3) {
                e = e3;
                i = i2;
                if (e.getCause() instanceof AuthFailureError) {
                }
            }
        }
        mo6503a(new Status(16500));
    }
}
