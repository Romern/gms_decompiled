package p000;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.view.Surface;

/* renamed from: oqb */
final /* synthetic */ class oqb implements Runnable {

    /* renamed from: a */
    private final oos f38228a;

    /* renamed from: b */
    private final int f38229b;

    /* renamed from: c */
    private final int f38230c;

    /* renamed from: d */
    private final oqa f38231d;

    public oqb(oos oos, int i, int i2, oqa oqa) {
        this.f38228a = oos;
        this.f38229b = i;
        this.f38230c = i2;
        this.f38231d = oqa;
    }

    public final void run() {
        oos oos = this.f38228a;
        int i = this.f38229b;
        int i2 = this.f38230c;
        oqa oqa = this.f38231d;
        int i3 = oqd.f38233a;
        Surface E = oos.mo22409E();
        if (E != null) {
            Paint paint = new Paint();
            paint.setTextSize(36.0f);
            paint.setColor(-1);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setAntiAlias(true);
            Canvas lockCanvas = E.lockCanvas(null);
            lockCanvas.drawColor(Color.argb(0, 0, 0, 0), PorterDuff.Mode.SRC);
            float f = (float) (i / 2);
            float f2 = (float) (i2 / 2);
            lockCanvas.drawText("PRE-PRODUCTION HARDWARE", f, f2, paint);
            lockCanvas.drawText("NOT FOR RESALE", f, (f2 + paint.descent()) - paint.ascent(), paint);
            E.unlockCanvasAndPost(lockCanvas);
        }
        oqa.mo21685e(oos);
    }
}
