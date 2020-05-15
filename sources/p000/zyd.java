package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fonts.FontMatchSpec;

/* renamed from: zyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class zyd extends dck implements zye {
    public zyd() {
        super("com.google.android.gms.fonts.internal.IFontsService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        zyc zyc;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.fonts.internal.IFontsCallbacks");
            zyc = queryLocalInterface instanceof zyc ? (zyc) queryLocalInterface : new zyc(readStrongBinder);
        } else {
            zyc = null;
        }
        mo31585a(zyc, (FontMatchSpec) dcl.m8163a(parcel, FontMatchSpec.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
