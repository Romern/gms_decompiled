package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.constellation.VerifyPhoneNumberResponse;
import java.util.List;

/* renamed from: syw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class syw extends dcj implements syy {
    public syw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.constellation.internal.IConstellationCallbacks");
    }

    /* renamed from: a */
    public final void mo26248a(Status status, VerifyPhoneNumberResponse verifyPhoneNumberResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, verifyPhoneNumberResponse);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo26221a(Status status, List list) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeTypedList(list);
        mo8530c(1, bj);
    }
}
