package p000;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;

/* renamed from: fn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0993fn extends Binder implements C0994fo {

    /* renamed from: a */
    public final /* synthetic */ ahc f16904a;

    /* renamed from: b */
    private Handler f16905b;

    public C0993fn() {
        attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1598968902) {
            switch (i) {
                case 2:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                        Bundle bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    if (this.f16904a != null) {
                        this.f16905b.post(new ahd(this));
                    }
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    if (this.f16904a != null) {
                        this.f16905b.post(new ahe());
                    }
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    if (parcel.readInt() != 0) {
                        Bundle bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    if (this.f16904a != null) {
                        this.f16905b.post(new ahf());
                    }
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle bundle4 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    if (this.f16904a != null) {
                        this.f16905b.post(new ahg());
                    }
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                        Uri uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                    }
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                        Bundle bundle5 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    if (this.f16904a != null) {
                        this.f16905b.post(new ahh());
                    }
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle bundle6 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        } else {
            parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
            return true;
        }
    }

    public C0993fn(ahc ahc) {
        this.f16904a = ahc;
        attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        this.f16905b = new Handler(Looper.getMainLooper());
    }
}
