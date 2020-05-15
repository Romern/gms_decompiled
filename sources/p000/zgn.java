package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.WorkSource;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: zgn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zgn implements zgm {
    /* renamed from: a */
    private static boolean m45393a(aucb aucb) {
        try {
            aucu.m76783a(aucb, 30, TimeUnit.SECONDS);
            return true;
        } catch (ExecutionException | TimeoutException e) {
            return false;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            return true;
        }
    }

    /* renamed from: a */
    public final bqgg mo31091a(Context context) {
        rjx a = aefo.m51797a(context);
        roz b = rpa.m34196b();
        b.f43472a = aefs.f63338a;
        return bqga.m112775a(m45393a(a.mo24732b(b.mo24977a())) ? Status.f30107a : Status.f30109c);
    }

    /* renamed from: a */
    public final boolean mo31092a(Context context, PendingIntent pendingIntent) {
        return m45393a(aefo.m51797a(context).mo24679a(pendingIntent));
    }

    /* renamed from: a */
    public final boolean mo31093a(Context context, String str, String str2, long j, long j2, boolean z, WorkSource workSource, PendingIntent pendingIntent) {
        rjx a = aefo.m51797a(context);
        aefy aefy = new aefy();
        aefy.mo34115a(j);
        aefy.mo34116b(j2);
        aefy.f63348e = str2;
        aefy.f63349f = z;
        aefy.f63347d = workSource;
        aefy.f63346c = false;
        if (str != null) {
            aefy.f63350g = str;
        }
        return m45393a(a.mo24682a(aefy.mo34113a(), pendingIntent));
    }
}
