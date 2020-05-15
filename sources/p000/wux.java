package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
import com.google.android.gms.feedback.AnnotateScreenshotChimeraActivity;
import com.google.android.gms.feedback.DrawableView;
import java.util.ArrayList;

/* renamed from: wux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wux implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ AnnotateScreenshotChimeraActivity f51396a;

    public wux(AnnotateScreenshotChimeraActivity annotateScreenshotChimeraActivity) {
        this.f51396a = annotateScreenshotChimeraActivity;
    }

    public void onClick(View view) {
        AnnotateScreenshotChimeraActivity annotateScreenshotChimeraActivity = this.f51396a;
        DrawableView drawableView = annotateScreenshotChimeraActivity.f31484a;
        Canvas canvas = new Canvas(drawableView.f31502e);
        if (!drawableView.f31503f.isEmpty()) {
            ArrayList arrayList = drawableView.f31503f;
            arrayList.remove(arrayList.size() - 1);
            ArrayList arrayList2 = drawableView.f31504g;
            arrayList2.remove(arrayList2.size() - 1);
            ArrayList arrayList3 = drawableView.f31505h;
            arrayList3.remove(arrayList3.size() - 1);
            Bitmap bitmap = drawableView.f31502e;
            drawableView.f31499b = bitmap;
            drawableView.f31502e = bitmap.copy(bitmap.getConfig(), true);
            drawableView.f31500c = canvas;
            drawableView.f31500c.drawBitmap(drawableView.f31499b, 0.0f, 0.0f, drawableView.f31498a);
            for (int i = 0; i < drawableView.f31503f.size(); i++) {
                drawableView.mo18583a(((Integer) drawableView.f31504g.get(i)).intValue(), ((Integer) drawableView.f31505h.get(i)).intValue());
                drawableView.f31500c.drawPath((Path) drawableView.f31503f.get(i), drawableView.f31501d);
            }
            drawableView.invalidate();
        }
        if (drawableView.f31501d.getAlpha() < ((int) cdtr.m134941c())) {
            annotateScreenshotChimeraActivity.mo18580b();
        } else {
            annotateScreenshotChimeraActivity.mo18578a();
        }
    }
}
