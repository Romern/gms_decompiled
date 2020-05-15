package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.notifications.ReadStateUpdate;

/* renamed from: akop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akop extends dcj implements akor {
    public akop(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.notifications.internal.IGunsService");
    }

    /* renamed from: a */
    public final void mo39613a(akoo akoo, String str, String str2, ReadStateUpdate readStateUpdate) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, akoo);
        bj.writeString(str);
        bj.writeString(str2);
        dcl.m8165a(bj, readStateUpdate);
        mo8528b(1, bj);
    }
}
