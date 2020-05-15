package p000;

import com.google.android.gms.smartdevice.magicwand.MagicWandChimeraActivity;

/* renamed from: arsc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arsc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ MagicWandChimeraActivity f88222a;

    public arsc(MagicWandChimeraActivity magicWandChimeraActivity) {
        this.f88222a = magicWandChimeraActivity;
    }

    public final void run() {
        this.f88222a.finish();
    }
}
