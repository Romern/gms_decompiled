package p000;

import com.google.android.gms.octarine.p057ui.OctarineWebviewChimeraActivity;
import java.io.IOException;

/* renamed from: akzh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akzh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f73158a;

    /* renamed from: b */
    final /* synthetic */ OctarineWebviewChimeraActivity f73159b;

    public akzh(OctarineWebviewChimeraActivity octarineWebviewChimeraActivity, String str) {
        this.f73159b = octarineWebviewChimeraActivity;
        this.f73158a = str;
    }

    public final void run() {
        try {
            if (!this.f73158a.equals(gie.m13198c(this.f73159b.getApplicationContext(), this.f73159b.mo44771h()))) {
                this.f73159b.mo44778o();
            }
        } catch (gid | IOException e) {
            this.f73159b.mo44778o();
        }
    }
}
