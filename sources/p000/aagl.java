package p000;

import android.content.Context;
import com.google.ads.afma.proto2api.C0152c;
import java.util.concurrent.TimeUnit;

/* renamed from: aagl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aagl {
    /* renamed from: a */
    public static C0152c m21220a(Context context, String str, String str2) {
        C0152c cVar;
        try {
            cVar = (C0152c) new aagk(context, str, str2).f28068b.poll(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            cVar = null;
        }
        return cVar == null ? aagk.m21214c() : cVar;
    }
}
