package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.speech.VoiceUnlockScoreInfo;

/* renamed from: aseb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aseb extends dck implements asec {
    public aseb() {
        super("com.google.android.gms.speech.internal.IVoiceUnlockService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        asea asea = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.speech.internal.IVoiceUnlockCallbacks");
                if (queryLocalInterface instanceof asea) {
                    asea = (asea) queryLocalInterface;
                } else {
                    asea = new asea(readStrongBinder);
                }
            }
            mo49082a(asea);
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.speech.internal.IVoiceUnlockCallbacks");
                if (queryLocalInterface2 instanceof asea) {
                    asea = (asea) queryLocalInterface2;
                } else {
                    asea = new asea(readStrongBinder2);
                }
            }
            mo49083a(asea, (VoiceUnlockScoreInfo) dcl.m8163a(parcel, VoiceUnlockScoreInfo.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.speech.internal.IVoiceUnlockCallbacks");
                if (queryLocalInterface3 instanceof asea) {
                    asea = (asea) queryLocalInterface3;
                } else {
                    asea = new asea(readStrongBinder3);
                }
            }
            mo49084a(asea, dcl.m8167a(parcel));
        }
        parcel2.writeNoException();
        return true;
    }
}
