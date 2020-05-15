package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Request;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.firebase.appindexing.internal.ActionImpl;

/* renamed from: ftg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ftg extends dcj implements fti {
    public ftg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
    }

    /* renamed from: a */
    public final void mo11306a(GetRecentContextCall$Request getRecentContextCall$Request, ftl ftl) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getRecentContextCall$Request);
        dcl.m8164a(bj, ftl);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo11308a(ftl ftl, String str) {
        throw null;
    }

    /* renamed from: a */
    public final void mo11310a(ftl ftl, ActionImpl[] actionImplArr) {
        throw null;
    }

    /* renamed from: a */
    public final void mo11307a(ftl ftl) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, ftl);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo11309a(ftl ftl, UsageInfo[] usageInfoArr) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, ftl);
        bj.writeString(null);
        bj.writeTypedArray(usageInfoArr, 0);
        mo8528b(1, bj);
    }
}
