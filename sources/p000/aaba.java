package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import java.util.Locale;

/* renamed from: aaba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aaba extends Binder {

    /* renamed from: a */
    private final IBinder f27867a;

    /* renamed from: b */
    private final aaay f27868b = aaay.m21039a();

    public aaba(String str, IBinder iBinder) {
        this.f27867a = iBinder;
        attachInterface(null, str);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            zzq b = aach.m21087b();
            if (b == null) {
                blkh.m107294b("OutgoingBinder");
            }
            int i3 = this.f27868b.f27866a;
            String str = null;
            if (!(b == null || (b.f56324a & 4) == 0)) {
                zzr zzr = b.f56327d;
                if (zzr == null) {
                    zzr = zzr.f56329d;
                }
                str = zzr.f56332b;
            }
            int dataSize = parcel.dataSize();
            parcel.setDataPosition(dataSize);
            parcel.writeString(str);
            int dataPosition = parcel.dataPosition();
            parcel.writeInt(dataPosition - dataSize);
            parcel.writeInt(-1205835348);
            int dataSize2 = parcel.dataSize();
            if (dataPosition != dataSize2 - 8) {
                Log.e("BinderPropagation", String.format(Locale.US, "Non-standard Parcel alignment. %d %d %d", Integer.valueOf(dataPosition), Integer.valueOf(dataSize2), Integer.valueOf(parcel.dataPosition())));
                for (int i4 = 0; i4 < 4; i4++) {
                    parcel.writeInt(0);
                }
            }
        }
        return this.f27867a.transact(i, parcel, parcel2, i2);
    }
}
