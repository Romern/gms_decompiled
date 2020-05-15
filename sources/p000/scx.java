package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.SignInButtonConfig;

/* renamed from: scx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class scx extends dcj implements scz {
    public scx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final vzr newSignInButton(vzr vzr, int i, int i2) {
        vzr vzr2;
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        bj.writeInt(i);
        bj.writeInt(i2);
        Parcel a = mo8526a(1, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            vzr2 = queryLocalInterface instanceof vzr ? (vzr) queryLocalInterface : new vzp(readStrongBinder);
        } else {
            vzr2 = null;
        }
        a.recycle();
        return vzr2;
    }

    public final vzr newSignInButtonFromConfig(vzr vzr, SignInButtonConfig signInButtonConfig) {
        vzr vzr2;
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        dcl.m8165a(bj, signInButtonConfig);
        Parcel a = mo8526a(2, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            vzr2 = queryLocalInterface instanceof vzr ? (vzr) queryLocalInterface : new vzp(readStrongBinder);
        } else {
            vzr2 = null;
        }
        a.recycle();
        return vzr2;
    }
}
