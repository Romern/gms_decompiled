package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: iyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iyt extends dcj implements iyv {
    public iyt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.firstparty.devicesignals.IDeviceSignalsService");
    }

    /* renamed from: a */
    public final long mo13498a() {
        Parcel a = mo8526a(1, mo8529bj());
        long readLong = a.readLong();
        a.recycle();
        return readLong;
    }

    /* renamed from: c */
    public final long mo13499c() {
        Parcel a = mo8526a(2, mo8529bj());
        long readLong = a.readLong();
        a.recycle();
        return readLong;
    }
}
