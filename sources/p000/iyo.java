package p000;

import android.app.PendingIntent;
import android.os.IInterface;
import com.google.android.gms.auth.firstparty.delegate.AccountRemovalAllowedWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.ConfirmCredentialsWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.FinishSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.SetupAccountWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.StartAddAccountSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.TokenWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.UpdateCredentialsWorkflowRequest;

/* renamed from: iyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface iyo extends IInterface {
    /* renamed from: a */
    PendingIntent mo11945a(AccountRemovalAllowedWorkflowRequest accountRemovalAllowedWorkflowRequest);

    /* renamed from: a */
    PendingIntent mo11946a(ConfirmCredentialsWorkflowRequest confirmCredentialsWorkflowRequest);

    /* renamed from: a */
    PendingIntent mo11947a(FinishSessionWorkflowRequest finishSessionWorkflowRequest);

    /* renamed from: a */
    PendingIntent mo11948a(SetupAccountWorkflowRequest setupAccountWorkflowRequest);

    /* renamed from: a */
    PendingIntent mo11949a(StartAddAccountSessionWorkflowRequest startAddAccountSessionWorkflowRequest);

    /* renamed from: a */
    PendingIntent mo11950a(TokenWorkflowRequest tokenWorkflowRequest);

    /* renamed from: a */
    PendingIntent mo11951a(UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest);

    /* renamed from: b */
    PendingIntent mo11954b(UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest);
}
