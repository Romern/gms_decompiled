package p000;

import java.util.ArrayList;

/* renamed from: aglq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aglq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ agmn f65900a;

    /* renamed from: b */
    final /* synthetic */ Runnable f65901b;

    public aglq(agmn agmn, Runnable runnable) {
        this.f65900a = agmn;
        this.f65901b = runnable;
    }

    public final void run() {
        this.f65900a.mo35701y();
        agmn agmn = this.f65900a;
        Runnable runnable = this.f65901b;
        agmn.mo35694r();
        if (agmn.f65956j == null) {
            agmn.f65956j = new ArrayList();
        }
        agmn.f65956j.add(runnable);
        this.f65900a.mo35697u();
    }
}
