package p000;

import android.os.Binder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: wvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wvw extends Binder {

    /* renamed from: a */
    final /* synthetic */ ParcelFileDescriptor f51446a;

    public wvw(ParcelFileDescriptor parcelFileDescriptor) {
        this.f51446a = parcelFileDescriptor;
    }

    /* access modifiers changed from: protected */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        this.f51446a.writeToParcel(parcel2, 0);
        return true;
    }
}
