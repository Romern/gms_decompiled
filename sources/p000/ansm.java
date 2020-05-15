package p000;

import com.google.android.gms.common.server.FavaDiagnosticsEntity;

/* renamed from: ansm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ansm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ansp f77592a;

    public ansm(ansp ansp) {
        this.f77592a = ansp;
    }

    public final void run() {
        ansp ansp = this.f77592a;
        if (!ansp.f77612p && ansp.f77600d != null) {
            ansp.f77612p = true;
            if (ansp.f77605i != null) {
                FavaDiagnosticsEntity favaDiagnosticsEntity = new FavaDiagnosticsEntity(ansp.f77610n, ansp.f77611o);
                int i = ansp.f77633s;
                if (i == 2 || i == 1) {
                    rjo rjo = ankt.f77031a;
                    anwn.m65473a(ansp.f77600d, ansp.f77605i, anls.f77085g, favaDiagnosticsEntity);
                } else if (i == 0) {
                    rjo rjo2 = ankt.f77031a;
                    anwn.m65473a(ansp.f77600d, ansp.f77605i, anls.f77084f, favaDiagnosticsEntity);
                }
            }
        }
    }
}
