package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.WireMessageParams;
import java.util.List;

/* renamed from: jso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class jso extends dck implements jsp {
    public jso() {
        super("com.google.android.gms.auth.proximity.internal.IProximityAuthService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        jsm jsm;
        switch (i) {
            case 1:
                mo13879a();
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.auth.proximity.internal.IProximityAuthCallbacks");
                    jsm = queryLocalInterface instanceof jsm ? (jsm) queryLocalInterface : new jsk(readStrongBinder);
                } else {
                    jsm = null;
                }
                mo13883a(jsm);
                parcel2.writeNoException();
                return true;
            case 3:
                mo13880a((RemoteDevice) dcl.m8163a(parcel, RemoteDevice.CREATOR), (Role) dcl.m8163a(parcel, Role.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                mo13882a(parcel.readString(), (Role) dcl.m8163a(parcel, Role.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                List a = mo13878a((Role) dcl.m8163a(parcel, Role.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a);
                return true;
            case 6:
                mo13881a((WireMessageParams) dcl.m8163a(parcel, WireMessageParams.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
