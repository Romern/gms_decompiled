package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.gass.internal.GassRequestParcel;
import com.google.android.gms.gass.internal.GassResponseParcel;
import com.google.android.gms.gass.internal.ProgramRequest;
import com.google.android.gms.gass.internal.ProgramResponse;

/* renamed from: aahw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aahw extends dcj implements aahy {
    public aahw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    /* renamed from: a */
    public final GassResponseParcel mo16883a(GassRequestParcel gassRequestParcel) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, gassRequestParcel);
        Parcel a = mo8526a(1, bj);
        GassResponseParcel gassResponseParcel = (GassResponseParcel) dcl.m8163a(a, GassResponseParcel.CREATOR);
        a.recycle();
        return gassResponseParcel;
    }

    /* renamed from: a */
    public final ProgramResponse mo16884a(ProgramRequest programRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, programRequest);
        Parcel a = mo8526a(3, bj);
        ProgramResponse programResponse = (ProgramResponse) dcl.m8163a(a, ProgramResponse.CREATOR);
        a.recycle();
        return programResponse;
    }
}
