package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.people.data.AudienceMember;

/* renamed from: rqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rqk extends dcj implements rqm {
    public rqk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.audience.dynamite.IAudienceViewCallbacks");
    }

    /* renamed from: a */
    public final void mo25031a() {
        mo8528b(4, mo8529bj());
    }

    /* renamed from: a */
    public final void mo25032a(AudienceMember audienceMember) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, audienceMember);
        mo8528b(3, bj);
    }
}
