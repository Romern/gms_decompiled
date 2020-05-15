package p000;

import android.accounts.Account;
import com.google.android.gms.pay.GetSortOrderRequest;
import com.google.android.gms.pay.SortOrderInfo;

/* renamed from: alja */
public final /* synthetic */ class alja implements roo {

    /* renamed from: a */
    private final Account f73563a;

    public alja(Account account) {
        this.f73563a = account;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        Account account = this.f73563a;
        alef alef = new alef();
        alef.f73500a.f81509b = account;
        SortOrderInfo sortOrderInfo = new algn().f73510a;
        sortOrderInfo.f81609a = 2;
        GetSortOrderRequest getSortOrderRequest = alef.f73500a;
        getSortOrderRequest.f81508a = sortOrderInfo;
        ((aliu) ((alji) obj).mo25289B()).mo40396a(getSortOrderRequest, new aljf((aucf) obj2));
    }
}
