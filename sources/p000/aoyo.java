package p000;

import android.content.Context;
import java.util.Random;

/* renamed from: aoyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoyo {

    /* renamed from: a */
    private static final Random f83856a = new Random();

    /* renamed from: b */
    private final Context f83857b;

    static {
        aoyh.m69805a("SilentFeedback");
    }

    public aoyo(Context context) {
        this.f83857b = context;
    }

    /* renamed from: a */
    public final void mo47009a(Throwable th, double d) {
        if (cgjy.m145761h() && f83856a.nextDouble() < d) {
            wwr wwr = new wwr(this.f83857b);
            wwv wwv = new wwv(th);
            wwv.f51512j = "com.google.android.gms.romanesco";
            wwv.f51499d = "com.google.android.gms.romanesco.SILENT_FEEDBACK";
            wwv.mo29496b();
            wwr.mo29488b(wwv.mo29490a());
        }
    }
}
