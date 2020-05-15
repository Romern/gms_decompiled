package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: azex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azex extends dcj implements azez {
    public azex(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.matchstick.net.ILighterWebService");
    }

    /* renamed from: a */
    public final void mo54855a() {
        mo8530c(3, mo8529bj());
    }

    /* renamed from: a */
    public final void mo54856a(azew azew) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, azew);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo54857a(String str, String str2) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        bj.writeString(str2);
        mo8530c(2, bj);
    }
}
