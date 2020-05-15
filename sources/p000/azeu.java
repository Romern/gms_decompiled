package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: azeu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azeu extends dcj implements azew {
    public azeu(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.matchstick.net.ILighterWebListener");
    }

    /* renamed from: a */
    public final void mo54852a(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, parcelFileDescriptor);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo54853a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo54854a(String[] strArr) {
        Parcel bj = mo8529bj();
        bj.writeStringArray(strArr);
        mo8530c(1, bj);
    }
}
