package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: sjo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sjo extends dcj implements sjq {
    public sjo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.service.IAccountService");
    }

    /* renamed from: a */
    public final String mo25650a(String str, String str2) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        bj.writeString(str2);
        Parcel a = mo8526a(1, bj);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo25651a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        mo8528b(2, bj);
    }
}
