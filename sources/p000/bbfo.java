package p000;

import android.content.Context;
import java.util.Random;

/* renamed from: bbfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbfo implements bawt {

    /* renamed from: a */
    private static final Random f102559a = new Random();

    /* renamed from: b */
    private final Context f102560b;

    public bbfo(Context context) {
        this.f102560b = context;
    }

    /* renamed from: a */
    public final void mo55999a(String str, Throwable th) {
        if (ceni.f183073a.mo6606a().mo79435l()) {
            int g = (int) cenp.f183105a.mo6606a().mo79459g();
            if (g > 0) {
                if (f102559a.nextInt(g) == 0) {
                    wwv wwv = new wwv(th);
                    wwv.f51512j = "com.google.android.gms.icing";
                    wwv.f51499d = "com.google.android.gms.icing.SILENT_FEEDBACK";
                    wwv.f51498c = str;
                    wwv.mo29496b();
                    wvu.m42361a(this.f102560b).mo29488b(wwv.mo29490a());
                }
            } else if (g < 0) {
                bbev.m87905a("Bad sample interval: %d", Integer.valueOf(g));
            }
        }
    }
}
