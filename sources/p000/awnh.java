package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

/* renamed from: awnh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class awnh extends dck implements awni {
    public awnh() {
        super("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
    }

    public static awni asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
        if (queryLocalInterface instanceof awni) {
            return (awni) queryLocalInterface;
        }
        return new awng(iBinder);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        vzr vzr;
        vzo vzo;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        awmf awmf = null;
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            vzr = queryLocalInterface instanceof vzr ? (vzr) queryLocalInterface : new vzp(readStrongBinder);
        } else {
            vzr = null;
        }
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            vzo = queryLocalInterface2 instanceof vzo ? (vzo) queryLocalInterface2 : new vzn(readStrongBinder2);
        } else {
            vzo = null;
        }
        WalletFragmentOptions walletFragmentOptions = (WalletFragmentOptions) dcl.m8163a(parcel, WalletFragmentOptions.CREATOR);
        IBinder readStrongBinder3 = parcel.readStrongBinder();
        if (readStrongBinder3 != null) {
            IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
            if (queryLocalInterface3 instanceof awmf) {
                awmf = (awmf) queryLocalInterface3;
            } else {
                awmf = new awme(readStrongBinder3);
            }
        }
        awmd newWalletFragmentDelegate$ar$class_merging = newWalletFragmentDelegate$ar$class_merging(vzr, vzo, walletFragmentOptions, awmf);
        parcel2.writeNoException();
        dcl.m8164a(parcel2, newWalletFragmentDelegate$ar$class_merging);
        return true;
    }
}
