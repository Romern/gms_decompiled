package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.recaptcha.RecaptchaAction;
import com.google.android.gms.recaptcha.RecaptchaHandle;

/* renamed from: aorm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aorm extends dck implements aorn {
    public aorm() {
        super("com.google.android.gms.recaptcha.internal.IRecaptchaService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        aorj aorj = null;
        aorg aorg = null;
        aorj aorj2 = null;
        aork aork = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.recaptcha.internal.IExecuteCallback");
                if (queryLocalInterface instanceof aorj) {
                    aorj = (aorj) queryLocalInterface;
                } else {
                    aorj = new aorh(readStrongBinder);
                }
            }
            mo43158a(aorj, parcel.readString(), parcel.readString());
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.recaptcha.internal.IInitCallback");
                if (queryLocalInterface2 instanceof aork) {
                    aork = (aork) queryLocalInterface2;
                } else {
                    aork = new aork(readStrongBinder2);
                }
            }
            mo43159a(aork, parcel.readString());
        } else if (i == 3) {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.recaptcha.internal.IExecuteCallback");
                if (queryLocalInterface3 instanceof aorj) {
                    aorj2 = (aorj) queryLocalInterface3;
                } else {
                    aorj2 = new aorh(readStrongBinder3);
                }
            }
            mo43157a(aorj2, (RecaptchaHandle) dcl.m8163a(parcel, RecaptchaHandle.CREATOR), (RecaptchaAction) dcl.m8163a(parcel, RecaptchaAction.CREATOR));
        } else if (i != 4) {
            return false;
        } else {
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.recaptcha.internal.ICloseCallback");
                if (queryLocalInterface4 instanceof aorg) {
                    aorg = (aorg) queryLocalInterface4;
                } else {
                    aorg = new aorg(readStrongBinder4);
                }
            }
            RecaptchaHandle recaptchaHandle = (RecaptchaHandle) dcl.m8163a(parcel, RecaptchaHandle.CREATOR);
            mo43156a(aorg);
        }
        parcel2.writeNoException();
        return true;
    }
}
