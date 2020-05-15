package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.beacon.BleSighting;
import java.util.List;

/* renamed from: nft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nft extends dcj implements nfv {
    public nft(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.beacon.internal.IBleListener");
    }

    /* renamed from: a */
    public final void mo20572a(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8530c(5, bj);
    }

    /* renamed from: a */
    public final void mo20573a(int i, BleSighting bleSighting) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, bleSighting);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo20574a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        mo8530c(4, bj);
    }

    /* renamed from: a */
    public final void mo20575a(List list) {
        Parcel bj = mo8529bj();
        bj.writeTypedList(list);
        mo8530c(3, bj);
    }
}
