package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.asterism.GetAsterismConsentRequest;
import com.google.android.gms.asterism.SetAsterismConsentRequest;

/* renamed from: gbs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gbs extends dcj implements gbu {
    public gbs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.asterism.internal.IAsterismApiService");
    }

    /* renamed from: a */
    public final void mo11621a(gbx gbx, GetAsterismConsentRequest getAsterismConsentRequest) {
        throw null;
    }

    /* renamed from: a */
    public final void mo11622a(gbx gbx, SetAsterismConsentRequest setAsterismConsentRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, gbx);
        dcl.m8165a(bj, setAsterismConsentRequest);
        mo8528b(2, bj);
    }
}
