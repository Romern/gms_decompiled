package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: idc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class idc extends dcj implements ide {
    public idc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    /* renamed from: a */
    public final void mo12919a(GoogleSignInAccount googleSignInAccount, Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, googleSignInAccount);
        dcl.m8165a(bj, status);
        mo8528b(101, bj);
    }

    /* renamed from: b */
    public final void mo12921b(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8528b(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, bj);
    }

    /* renamed from: a */
    public final void mo12920a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8528b(102, bj);
    }
}
