package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.constellation.VerifyPhoneNumberRequest;

/* renamed from: syt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class syt extends dcj implements syv {
    public syt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.constellation.internal.IConstellationApiService");
    }

    /* renamed from: a */
    public final void mo26244a(syy syy, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, syy);
        dcl.m8165a(bj, bundle);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo26245a(syy syy, VerifyPhoneNumberRequest verifyPhoneNumberRequest) {
        throw null;
    }

    /* renamed from: b */
    public final void mo26246b(syy syy, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, syy);
        dcl.m8165a(bj, bundle);
        mo8528b(2, bj);
    }
}
