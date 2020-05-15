package p000;

import com.google.android.gms.mdh.SyncStatus;
import com.google.android.gms.mdh.SyncSubPolicy;
import java.util.concurrent.TimeUnit;

/* renamed from: basj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class basj {
    /* renamed from: a */
    public static azzt m87490a(SyncStatus syncStatus) {
        return new azzm(syncStatus.f80003a, syncStatus.f80004b, syncStatus.f80005c);
    }

    /* renamed from: a */
    public static SyncSubPolicy m87491a(azzv azzv) {
        azzn azzn = (azzn) azzv;
        if (azzn.f100334a) {
            afld a = SyncSubPolicy.m67179a();
            int i = azzn.f100335b;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            a.f64321a = true;
            a.f64322b = (int) timeUnit.toSeconds((long) i);
            return a.mo34947a();
        }
        afld a2 = SyncSubPolicy.m67179a();
        a2.f64321a = false;
        a2.f64322b = 0;
        return a2.mo34947a();
    }
}
