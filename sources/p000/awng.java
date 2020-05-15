package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

/* renamed from: awng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awng extends dcj implements awni {
    public awng(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
    }

    public final awmd newWalletFragmentDelegate$ar$class_merging(vzr vzr, vzo vzo, WalletFragmentOptions walletFragmentOptions, awmf awmf) {
        awmd awmd;
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        dcl.m8164a(bj, vzo);
        dcl.m8165a(bj, walletFragmentOptions);
        dcl.m8164a(bj, awmf);
        Parcel a = mo8526a(1, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            awmd = queryLocalInterface instanceof awmd ? (awmd) queryLocalInterface : new awmd(readStrongBinder);
        } else {
            awmd = null;
        }
        a.recycle();
        return awmd;
    }
}
