package p000;

import android.os.Parcel;
import com.google.android.gms.fitness.request.GoalsReadRequest;

/* renamed from: zbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zbm extends dck implements zbn {

    /* renamed from: a */
    private final ytu f54904a;

    public zbm() {
        super("com.google.android.gms.fitness.internal.IGoogleFitGoalsApi");
    }

    public zbm(ytu ytu) {
        super("com.google.android.gms.fitness.internal.IGoogleFitGoalsApi");
        this.f54904a = ytu;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        this.f54904a.mo30771a(0, (GoalsReadRequest) dcl.m8163a(parcel, GoalsReadRequest.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
