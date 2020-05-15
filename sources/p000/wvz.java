package p000;

import android.os.Binder;
import android.os.Parcel;

/* renamed from: wvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wvz extends Binder {

    /* renamed from: a */
    final /* synthetic */ byte[] f51453a;

    public wvz(byte[] bArr) {
        this.f51453a = bArr;
    }

    /* access modifiers changed from: protected */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        parcel2.writeByteArray(this.f51453a);
        return true;
    }
}
