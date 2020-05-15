package p000;

import android.view.KeyEvent;

/* renamed from: ool */
public final /* synthetic */ class ool implements Runnable {

    /* renamed from: a */
    private final oop f38069a;

    /* renamed from: b */
    private final boolean f38070b;

    public ool(oop oop, boolean z) {
        this.f38069a = oop;
        this.f38070b = z;
    }

    public final void run() {
        oop oop = this.f38069a;
        boolean z = this.f38070b;
        KeyEvent keyEvent = (KeyEvent) oop.f38078e.mo22394a();
        if (keyEvent != null) {
            if (!z) {
                oop.f38077d.mo21669a(oop.f38081h, keyEvent);
            } else {
                oop.f38077d.mo21674b(oop.f38081h, keyEvent);
            }
        }
        oop.mo22402e();
    }
}
