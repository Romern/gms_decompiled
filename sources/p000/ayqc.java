package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.libraries.bluetooth.fastpair.Event;

/* renamed from: ayqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayqc extends dcj implements ayqe {
    public ayqc(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.bluetooth.fastpair.IFastPairLoggingService");
    }

    /* renamed from: a */
    public final void mo54219a(Event event) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, event);
        mo8530c(2, bj);
    }

    /* renamed from: b */
    public final void mo54221b(Event event) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, event);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo54220a(String str, String str2) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        bj.writeString(str2);
        mo8530c(1, bj);
    }
}
