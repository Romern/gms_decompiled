package p000;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: adqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adqn {
    /* renamed from: a */
    public static bqgg m51000a(adqx adqx, adqv adqv, adqy adqy, adqw adqw, Executor executor) {
        return bqdx.m112673a(bqga.m112774a((Iterable) bngx.m109359a(adqx.mo33734a(), adqv.mo33734a(), adqw.mo33734a(), adqy.mo33734a())), new adqm(), executor);
    }

    /* renamed from: a */
    public static String m51001a(long j, long j2, Boolean bool) {
        return String.format("%d %d %s", Long.valueOf(j), Long.valueOf(j2), bool);
    }

    /* renamed from: a */
    public static void m51002a(adqx adqx, adqv adqv, adqw adqw, adqy adqy) {
        if (!ceqm.m137874e()) {
            adqx.mo33734a();
        }
        if (!ceqm.m137875f()) {
            adqv.mo33734a();
            adqw.mo33734a();
            adqy.mo33734a();
        }
    }

    /* renamed from: a */
    public static boolean m51003a(Context context) {
        return ceqm.m137878i() && C1133kh.m17835a(context, "android.permission.READ_EXTERNAL_STORAGE") == 0;
    }
}
