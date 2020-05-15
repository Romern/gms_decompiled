package p000;

import com.google.android.gms.ads.identifier.C0272d;
import java.io.IOException;

/* renamed from: dbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dbx implements Runnable {

    /* renamed from: a */
    final /* synthetic */ dca f12756a;

    public dbx(dca dca) {
        this.f12756a = dca;
    }

    public final void run() {
        dca dca = this.f12756a;
        try {
            if (dca.f12770f == null && dca.f12773i) {
                C0272d dVar = new C0272d(dca.f12765a);
                dVar.mo6487a();
                dca.f12770f = dVar;
            }
        } catch (IOException | rfv | rfw e) {
            dca.f12770f = null;
        }
    }
}
