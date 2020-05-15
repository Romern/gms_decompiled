package p000;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.List;

/* renamed from: bfpp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfpp extends adzt {

    /* renamed from: a */
    final /* synthetic */ bfpq f114801a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfpp(bfpq bfpq, Looper looper) {
        super(looper);
        this.f114801a = bfpq;
    }

    public final void handleMessage(Message message) {
        boolean z = true;
        if (message.what == 1) {
            List<LocationRequestInternal> list = (List) message.obj;
            long j = Long.MAX_VALUE;
            for (LocationRequestInternal locationRequestInternal : list) {
                long j2 = locationRequestInternal.f79420b.f79350b;
                if (j2 < j) {
                    j = j2;
                }
            }
            bfpq bfpq = this.f114801a;
            int i = bfpq.f114802f;
            if (j <= bfpq.f114808e) {
                z = false;
            }
            bfpq.f114808e = j;
            this.f114801a.f114805b.mo34511a(list, bfpq.f114807d.mo63541a(j, z));
        }
    }
}
