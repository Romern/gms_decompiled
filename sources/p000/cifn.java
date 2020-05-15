package p000;

import java.io.IOException;

/* renamed from: cifn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class cifn implements Runnable {

    /* renamed from: b */
    final /* synthetic */ cifo f190011b;

    public cifn(cifo cifo) {
        this.f190011b = cifo;
    }

    /* renamed from: a */
    public abstract void mo86028a();

    public final void run() {
        try {
            if (this.f190011b.f190017f != null) {
                mo86028a();
                return;
            }
            throw new IOException("Unable to perform write due to unavailable sink.");
        } catch (Exception e) {
            this.f190011b.f190014c.mo86031a(e);
        }
    }
}
