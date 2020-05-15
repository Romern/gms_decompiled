package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: idf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class idf extends dcj implements idh {
    public idf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    /* renamed from: a */
    public final void mo12937a(ide ide, GoogleSignInOptions googleSignInOptions) {
        throw null;
    }

    /* renamed from: b */
    public final void mo12938b(ide ide, GoogleSignInOptions googleSignInOptions) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, ide);
        dcl.m8165a(bj, googleSignInOptions);
        mo8528b(102, bj);
    }

    /* renamed from: c */
    public final void mo12939c(ide ide, GoogleSignInOptions googleSignInOptions) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, ide);
        dcl.m8165a(bj, googleSignInOptions);
        mo8528b((int) ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, bj);
    }
}
