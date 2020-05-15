package p000;

import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: abbc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abbc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f56975a;

    /* renamed from: b */
    final /* synthetic */ HelpChimeraActivity f56976b;

    public abbc(HelpChimeraActivity helpChimeraActivity, boolean z) {
        this.f56976b = helpChimeraActivity;
        this.f56975a = z;
    }

    public final void run() {
        this.f56976b.mo43343b(this.f56975a);
    }
}
