package p000;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;
import java.util.Map;

/* renamed from: fnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fnm extends dcj implements fno {
    public fnm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.analytics.internal.IAnalyticsService");
    }

    /* renamed from: a */
    public final void mo11024a(Map map, long j, String str, List list) {
        Parcel bj = mo8529bj();
        bj.writeMap(map);
        bj.writeLong(j);
        bj.writeString(str);
        bj.writeTypedList(list);
        mo8528b(1, bj);
    }
}
