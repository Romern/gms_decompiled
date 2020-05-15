package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.proximity.ConnectionInfo;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.WireMessageParams;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jsn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jsn extends dcj implements jsp {
    public jsn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.proximity.internal.IProximityAuthService");
    }

    /* renamed from: a */
    public final List mo13878a(Role role) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, role);
        Parcel a = mo8526a(5, bj);
        ArrayList createTypedArrayList = a.createTypedArrayList(ConnectionInfo.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final void mo13879a() {
        mo8528b(1, mo8529bj());
    }

    /* renamed from: a */
    public final void mo13880a(RemoteDevice remoteDevice, Role role) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, remoteDevice);
        dcl.m8165a(bj, role);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo13881a(WireMessageParams wireMessageParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, wireMessageParams);
        mo8528b(6, bj);
    }

    /* renamed from: a */
    public final void mo13882a(String str, Role role) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        dcl.m8165a(bj, role);
        mo8528b(4, bj);
    }

    /* renamed from: a */
    public final void mo13883a(jsm jsm) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, jsm);
        mo8528b(2, bj);
    }
}
