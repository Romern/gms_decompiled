package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: qfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qfm extends dcj implements qfo {
    public qfm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.checkin.internal.ICheckinService");
    }

    /* renamed from: a */
    public final String mo24013a() {
        Parcel a = mo8526a(1, mo8529bj());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: c */
    public final long mo24014c() {
        Parcel a = mo8526a(2, mo8529bj());
        long readLong = a.readLong();
        a.recycle();
        return readLong;
    }
}
