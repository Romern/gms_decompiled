package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.identity.intents.UserAddressRequest;

/* renamed from: adcy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adcy extends dck implements IInterface {

    /* renamed from: a */
    public final Context f61426a;

    /* renamed from: b */
    public final awvy f61427b;

    /* renamed from: c */
    public final String f61428c;

    public adcy() {
        super("com.google.android.gms.identity.intents.internal.IAddressService");
    }

    public adcy(Context context, awvy awvy, String str) {
        super("com.google.android.gms.identity.intents.internal.IAddressService");
        this.f61426a = context;
        this.f61427b = awvy;
        this.f61428c = str;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        adcx adcx;
        if (i != 2) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.identity.intents.internal.IAddressCallbacks");
            adcx = queryLocalInterface instanceof adcx ? (adcx) queryLocalInterface : new adcx(readStrongBinder);
        } else {
            adcx = null;
        }
        new awpy(this, (Bundle) dcl.m8163a(parcel, Bundle.CREATOR), (UserAddressRequest) dcl.m8163a(parcel, UserAddressRequest.CREATOR), adcx).execute(new Void[0]);
        parcel2.writeNoException();
        return true;
    }
}
