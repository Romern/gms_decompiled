package p000;

import android.content.Context;
import java.util.Random;

/* renamed from: mab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mab {

    /* renamed from: a */
    private static final Random f33321a = new Random();

    /* renamed from: b */
    private static final lvn f33322b = new lvn("SilentFeedback");

    /* renamed from: a */
    public static void m24748a(Context context, Throwable th, double d) {
        if (!cckt.f179251a.mo6606a().mo76200h()) {
            f33322b.mo25409a("Disabled", new Object[0]);
        } else if (f33321a.nextDouble() >= d) {
            f33322b.mo25409a("Not sampled", new Object[0]);
        } else {
            f33322b.mo25409a("Sending silent feedback", new Object[0]);
            wwv wwv = new wwv(th);
            wwv.f51512j = "com.google.android.gms.backup";
            wwv.f51499d = "com.google.android.gms.backup.SILENT_FEEDBACK";
            wwv.mo29496b();
            new wwr(context).mo29488b(wwv.mo29490a());
        }
    }
}
