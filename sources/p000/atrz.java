package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: atrz */
final /* synthetic */ class atrz implements ayq {

    /* renamed from: a */
    private final atsc f90749a;

    public atrz(atsc atsc) {
        this.f90749a = atsc;
    }

    /* renamed from: a */
    public final void mo2853a(Object obj) {
        atsc atsc = this.f90749a;
        axw axw = (axw) obj;
        ayp ayp = (ayp) axw.f2508b.get("image_0");
        atsc.f90755e.mo4048a(axw);
        bnsl bnsl = (bnsl) atsc.f90752b.mo68390d();
        bnsl.mo68432a("atsc", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("The lottie animation has been loaded.");
        if (ayp != null && atsc.f90756f != null) {
            Bitmap createBitmap = Bitmap.createBitmap(ayp.f2566a, ayp.f2567b, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            atsc.f90756f.setBounds(0, 0, ayp.f2566a, ayp.f2567b);
            atsc.f90756f.draw(canvas);
            atsc.f90755e.f7171c.mo2877a("image_0", createBitmap);
        }
    }
}
