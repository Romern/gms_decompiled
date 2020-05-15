package p000;

import android.util.Log;
import android.view.View;

/* renamed from: biyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class biyx implements Runnable {

    /* renamed from: a */
    final /* synthetic */ biyy f122350a;

    public biyx(biyy biyy) {
        this.f122350a = biyy;
    }

    public final void run() {
        View peekDecorView = this.f122350a.f122352b.peekDecorView();
        if (peekDecorView == null) {
            biyy biyy = this.f122350a;
            int i = biyy.f122353c - 1;
            biyy.f122353c = i;
            if (i < 0) {
                String valueOf = String.valueOf(biyy.f122352b);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                sb.append("Cannot get decor view of window: ");
                sb.append(valueOf);
                Log.w("SystemBarHelper", sb.toString());
                return;
            }
            biyy.f122351a.post(biyy.f122355e);
            return;
        }
        this.f122350a.f122354d.mo64893a(peekDecorView);
    }
}
