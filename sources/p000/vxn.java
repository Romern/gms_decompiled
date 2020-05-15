package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import com.google.android.gms.droidguard.internal.DroidGuardInitReply;
import java.util.Map;

/* renamed from: vxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vxn extends dcj implements vxp {
    public vxn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.droidguard.internal.IDroidGuardHandle");
    }

    /* renamed from: a */
    public final DroidGuardInitReply mo28937a(String str, DroidGuardResultsRequest droidGuardResultsRequest) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        dcl.m8165a(bj, droidGuardResultsRequest);
        Parcel a = mo8526a(5, bj);
        DroidGuardInitReply droidGuardInitReply = (DroidGuardInitReply) dcl.m8163a(a, DroidGuardInitReply.CREATOR);
        a.recycle();
        return droidGuardInitReply;
    }

    /* renamed from: a */
    public final void mo28938a() {
        mo8530c(3, mo8529bj());
    }

    /* renamed from: a */
    public final void mo28939a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final byte[] mo28940a(Map map) {
        Parcel bj = mo8529bj();
        bj.writeMap(map);
        Parcel a = mo8526a(2, bj);
        byte[] createByteArray = a.createByteArray();
        a.recycle();
        return createByteArray;
    }
}
