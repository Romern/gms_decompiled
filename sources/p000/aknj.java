package p000;

import android.content.Context;
import java.util.Random;

/* renamed from: aknj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aknj {

    /* renamed from: a */
    private final Context f72306a;

    /* renamed from: b */
    private final Random f72307b = new Random(138);

    public aknj(Context context) {
        this.f72306a = context;
    }

    /* renamed from: a */
    public static aknj m60083a(Context context) {
        return new aknj(context);
    }

    /* renamed from: a */
    public final void mo39585a(String str, Throwable th) {
        if (cfpa.f185327a.mo6606a().mo82405b() && this.f72307b.nextDouble() < cfpa.f185327a.mo6606a().mo82406c()) {
            wwr wwr = new wwr(this.f72306a);
            wwv wwv = new wwv(th);
            wwv.f51512j = "com.google.android.gms.netrec";
            wwv.f51499d = "com.google.android.gms.netrec.SILENT_FEEDBACK";
            wwv.mo29496b();
            if (str != null) {
                wwv.f51498c = str;
            }
            wwr.mo29488b(wwv.mo29490a());
        }
    }

    /* renamed from: a */
    public final void mo39586a(Throwable th) {
        mo39585a(th.getMessage(), th);
    }
}
