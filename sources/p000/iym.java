package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.delegate.AccountRemovalAllowedWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.ConfirmCredentialsWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.FinishSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.SetupAccountWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.StartAddAccountSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.TokenWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.UpdateCredentialsWorkflowRequest;

/* renamed from: iym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iym extends dcj implements iyo {
    public iym(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService");
    }

    /* renamed from: a */
    public final PendingIntent mo11945a(AccountRemovalAllowedWorkflowRequest accountRemovalAllowedWorkflowRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, accountRemovalAllowedWorkflowRequest);
        Parcel a = mo8526a(8, bj);
        PendingIntent pendingIntent = (PendingIntent) dcl.m8163a(a, PendingIntent.CREATOR);
        a.recycle();
        return pendingIntent;
    }

    /* renamed from: b */
    public final PendingIntent mo11954b(UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, updateCredentialsWorkflowRequest);
        Parcel a = mo8526a(3, bj);
        PendingIntent pendingIntent = (PendingIntent) dcl.m8163a(a, PendingIntent.CREATOR);
        a.recycle();
        return pendingIntent;
    }

    /* renamed from: a */
    public final PendingIntent mo11946a(ConfirmCredentialsWorkflowRequest confirmCredentialsWorkflowRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, confirmCredentialsWorkflowRequest);
        Parcel a = mo8526a(4, bj);
        PendingIntent pendingIntent = (PendingIntent) dcl.m8163a(a, PendingIntent.CREATOR);
        a.recycle();
        return pendingIntent;
    }

    /* renamed from: a */
    public final PendingIntent mo11947a(FinishSessionWorkflowRequest finishSessionWorkflowRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, finishSessionWorkflowRequest);
        Parcel a = mo8526a(7, bj);
        PendingIntent pendingIntent = (PendingIntent) dcl.m8163a(a, PendingIntent.CREATOR);
        a.recycle();
        return pendingIntent;
    }

    /* renamed from: a */
    public final PendingIntent mo11948a(SetupAccountWorkflowRequest setupAccountWorkflowRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, setupAccountWorkflowRequest);
        Parcel a = mo8526a(1, bj);
        PendingIntent pendingIntent = (PendingIntent) dcl.m8163a(a, PendingIntent.CREATOR);
        a.recycle();
        return pendingIntent;
    }

    /* renamed from: a */
    public final PendingIntent mo11949a(StartAddAccountSessionWorkflowRequest startAddAccountSessionWorkflowRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, startAddAccountSessionWorkflowRequest);
        Parcel a = mo8526a(5, bj);
        PendingIntent pendingIntent = (PendingIntent) dcl.m8163a(a, PendingIntent.CREATOR);
        a.recycle();
        return pendingIntent;
    }

    /* renamed from: a */
    public final PendingIntent mo11950a(TokenWorkflowRequest tokenWorkflowRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, tokenWorkflowRequest);
        Parcel a = mo8526a(2, bj);
        PendingIntent pendingIntent = (PendingIntent) dcl.m8163a(a, PendingIntent.CREATOR);
        a.recycle();
        return pendingIntent;
    }

    /* renamed from: a */
    public final PendingIntent mo11951a(UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, updateCredentialsWorkflowRequest);
        Parcel a = mo8526a(6, bj);
        PendingIntent pendingIntent = (PendingIntent) dcl.m8163a(a, PendingIntent.CREATOR);
        a.recycle();
        return pendingIntent;
    }
}
