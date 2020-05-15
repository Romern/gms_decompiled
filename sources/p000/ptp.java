package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.cast.JoinOptions;
import com.google.android.gms.cast.LaunchOptions;

/* renamed from: ptp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ptp extends dck implements ptq {
    public ptp() {
        super("com.google.android.gms.cast.internal.ICastDeviceController");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        ptt ptt;
        switch (i) {
            case 1:
                mo23645a();
                return true;
            case 2:
                mo23653a(parcel.readString(), dcl.m8167a(parcel));
                return true;
            case 3:
                mo23663g(parcel.readString(), parcel.readString());
                return true;
            case 4:
                mo23658c();
                return true;
            case 5:
                mo23648a(parcel.readString());
                return true;
            case 6:
                mo23660d();
                return true;
            case 7:
                mo23646a(parcel.readDouble(), parcel.readDouble(), dcl.m8167a(parcel));
                return true;
            case 8:
                mo23656a(dcl.m8167a(parcel), parcel.readDouble(), dcl.m8167a(parcel));
                return true;
            case 9:
                mo23650a(parcel.readString(), parcel.readString(), parcel.readLong());
                return true;
            case 10:
                mo23654a(parcel.readString(), parcel.createByteArray(), parcel.readLong());
                return true;
            case 11:
                mo23657b(parcel.readString());
                return true;
            case 12:
                mo23659c(parcel.readString());
                return true;
            case 13:
                mo23649a(parcel.readString(), (LaunchOptions) dcl.m8163a(parcel, LaunchOptions.CREATOR));
                return true;
            case 14:
                mo23652a(parcel.readString(), parcel.readString(), (JoinOptions) dcl.m8163a(parcel, JoinOptions.CREATOR));
                return true;
            case 15:
                mo23651a(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString());
                return true;
            case 16:
                mo23647a((EqualizerSettings) dcl.m8163a(parcel, EqualizerSettings.CREATOR));
                return true;
            case 17:
                mo23661e();
                return true;
            case 18:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                    ptt = queryLocalInterface instanceof ptt ? (ptt) queryLocalInterface : new ptr(readStrongBinder);
                } else {
                    ptt = null;
                }
                mo23655a(ptt);
                return true;
            case 19:
                mo23662f();
                return true;
            default:
                return false;
        }
    }
}
