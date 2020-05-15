package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.payse.internal.ExecuteSdkOperationRequest;
import com.google.android.gms.payse.internal.ExecuteSdkOperationResponse;
import com.google.android.gms.payse.internal.GetSeCardsRequest;
import com.google.android.gms.payse.internal.GetSeCardsResponse;

/* renamed from: bjyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface bjyg {
    /* renamed from: a */
    ExecuteSdkOperationResponse mo65623a(Context context, ExecuteSdkOperationRequest executeSdkOperationRequest);

    /* renamed from: a */
    GetSeCardsResponse mo65624a(Context context, Account account, GetSeCardsRequest getSeCardsRequest);

    /* renamed from: a */
    boolean mo65626a(Context context);
}
