package p000;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* renamed from: ipk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ipk {
    /* renamed from: a */
    public static void m15815a(Context context, String str, String str2, aebo aebo, long j, long j2, Bundle bundle, boolean z) {
        aebi aebi = new aebi();
        aebi.mo34004a(TimeUnit.MILLISECONDS.toSeconds(j), TimeUnit.MILLISECONDS.toSeconds(j2));
        aebi.f63099k = str2;
        aebi.f63107s = bundle;
        aebi.f63097i = str;
        aebi.mo34024a(0, cdny.m134338c() ? 1 : 0);
        aebi.f63106r = aebo;
        aebi.f63102n = true;
        aebi.mo34023a(0);
        aebi.mo34029b(z);
        aeat.m51532a(context).mo33984a(aebi.mo33974b());
    }
}
