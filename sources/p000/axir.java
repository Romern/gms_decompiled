package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.android.volley.AuthFailureError;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.walletp2p.internal.zeroparty.GetTransactionRequest;
import com.google.android.gms.walletp2p.internal.zeroparty.GetTransactionResponse;
import com.google.android.gms.walletp2p.internal.zeroparty.Transaction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

/* renamed from: axir */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axir extends axeq {

    /* renamed from: e */
    private final GetTransactionRequest f96022e;

    public axir(GetTransactionRequest getTransactionRequest, Account account, Bundle bundle, axnw axnw) {
        super("GetTransactionOperation", getTransactionRequest, account, bundle, axnw);
        this.f96022e = getTransactionRequest;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        ((axnw) this.f95864c).mo53066a((GetTransactionResponse) null, status);
    }

    /* renamed from: b */
    public final void mo53072b(Context context) {
        Context context2 = context;
        if (!((GetTransactionRequest) this.f95865d).f110815b) {
            try {
                bzwb bzwb = (bzwb) axis.m82653a(this.f95862a, this.f96022e.f110814a, mo53071a(), 1).get();
                int i = bzwb.f171596a;
                if ((i & 1) != 0) {
                    axnw axnw = (axnw) this.f95864c;
                    bzvu bzvu = bzwb.f171597b;
                    if (bzvu == null) {
                        bzvu = bzvu.f171552g;
                    }
                    axnw.mo53066a(new GetTransactionResponse(axep.m82424a(context2, bzvu)), new Status(-16500));
                } else if ((i & 2) == 0) {
                    mo6503a(new Status(16500));
                } else {
                    ((axnw) this.f95864c).mo53066a(new GetTransactionResponse(axis.m82654a(bzwb), null), Status.f30107a);
                }
            } catch (ExecutionException e) {
                if (e.getCause() instanceof AuthFailureError) {
                    mo6503a(new Status(16501));
                    return;
                }
                throw e;
            }
        } else {
            try {
                Account[] d = gie.m13199d(context2, "com.google");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = new HashMap();
                for (Account account : d) {
                    RequestFuture a = axis.m82653a(account, this.f96022e.f110814a, mo53071a(), 1);
                    arrayList2.add(a);
                    hashMap.put(a, account);
                }
                int size = arrayList2.size();
                bzvu bzvu2 = null;
                Transaction transaction = null;
                for (int i2 = 0; i2 < size; i2++) {
                    RequestFuture requestFuture = (RequestFuture) arrayList2.get(i2);
                    Account account2 = (Account) hashMap.get(requestFuture);
                    try {
                        bzwb bzwb2 = (bzwb) requestFuture.get();
                        int i3 = bzwb2.f171596a;
                        if ((i3 & 1) != 0) {
                            arrayList.add(account2);
                            bzvu bzvu3 = bzwb2.f171597b;
                            if (bzvu3 == null) {
                                bzvu3 = bzvu.f171552g;
                            }
                            bzvu2 = bzvu3;
                        } else if ((i3 & 2) != 0) {
                            transaction = axis.m82654a(bzwb2);
                            try {
                                arrayList.add(account2);
                            } catch (ExecutionException e2) {
                            }
                        }
                    } catch (ExecutionException e3) {
                        arrayList.add(account2);
                    }
                }
                if (arrayList.size() == 1 && bzvu2 != null) {
                    ((axnw) this.f95864c).mo53066a(new GetTransactionResponse(axep.m82424a(context2, bzvu2)), new Status(-16500));
                } else if (arrayList.size() == 1 && transaction != null) {
                    ((axnw) this.f95864c).mo53066a(new GetTransactionResponse(transaction, arrayList), Status.f30107a);
                } else if (arrayList.size() == 1) {
                    mo6503a(new Status(13));
                } else if (arrayList.size() > 1) {
                    ((axnw) this.f95864c).mo53066a(new GetTransactionResponse(null, arrayList), Status.f30107a);
                } else {
                    mo6503a(new Status(16500));
                }
            } catch (rfv | rfw e4) {
                mo6503a(new Status(16500));
            }
        }
    }
}
