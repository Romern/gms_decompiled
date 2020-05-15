package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

/* renamed from: ddy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface ddy extends IInterface {
    /* renamed from: a */
    Bundle mo8546a(Account account, String str, Bundle bundle);

    /* renamed from: a */
    Bundle mo8547a(Bundle bundle);

    /* renamed from: a */
    Bundle mo8548a(String str, Bundle bundle);

    /* renamed from: a */
    AccountChangeEventsResponse mo8549a(AccountChangeEventsRequest accountChangeEventsRequest);
}
