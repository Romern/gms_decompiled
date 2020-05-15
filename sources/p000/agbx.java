package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.mdns.MdnsSearchOptions;

/* renamed from: agbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agbx extends dcj implements agbz {
    public agbx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mdns.internal.IMdnsApiService");
    }

    /* renamed from: a */
    public final void mo35186a(agcc agcc) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, agcc);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo35187a(agcc agcc, MdnsSearchOptions mdnsSearchOptions) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, agcc);
        dcl.m8165a(bj, mdnsSearchOptions);
        mo8528b(1, bj);
    }
}
