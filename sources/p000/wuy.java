package p000;

import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import com.google.android.gms.feedback.AnnotateScreenshotChimeraActivity;
import com.google.android.gms.feedback.DrawableView;
import com.google.android.gms.feedback.FeedbackChimeraActivity;
import java.util.ArrayList;

/* renamed from: wuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wuy implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ AnnotateScreenshotChimeraActivity f51397a;

    public wuy(AnnotateScreenshotChimeraActivity annotateScreenshotChimeraActivity) {
        this.f51397a = annotateScreenshotChimeraActivity;
    }

    public void onClick(View view) {
        AnnotateScreenshotChimeraActivity annotateScreenshotChimeraActivity = this.f51397a;
        FeedbackChimeraActivity.m23364a(annotateScreenshotChimeraActivity.f31484a.f31499b);
        DrawableView drawableView = annotateScreenshotChimeraActivity.f31484a;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < drawableView.f31503f.size(); i++) {
            if (((long) ((Integer) drawableView.f31505h.get(i)).intValue()) < cdtr.m134941c()) {
                RectF rectF = new RectF();
                ((Path) drawableView.f31503f.get(i)).computeBounds(rectF, true);
                float f = ((float) drawableView.f31506i) / 2.0f;
                rectF.top -= f;
                rectF.bottom += f;
                rectF.left -= f;
                rectF.right += f;
                arrayList.add(rectF);
            }
        }
        if (FeedbackChimeraActivity.f31574e != null) {
            if (FeedbackChimeraActivity.f31576h == null) {
                FeedbackChimeraActivity.f31576h = new ArrayList();
            }
            FeedbackChimeraActivity.f31576h.addAll(arrayList);
            FeedbackChimeraActivity.f31574e.mo29517g().f31540ad = FeedbackChimeraActivity.f31576h;
        }
        annotateScreenshotChimeraActivity.finish();
    }
}
