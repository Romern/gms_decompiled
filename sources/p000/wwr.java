package p000;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.Log;
import android.view.View;
import com.google.android.gms.common.Feature;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: wwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wwr extends rjx {
    public wwr(Context context) {
        super(context, wvu.f51440b, (rjk) null, rjw.f43159a);
        aymt.m84282a(context.getApplicationContext());
    }

    /* renamed from: a */
    public static Bitmap m42392a(Activity activity) {
        try {
            return m42393a(activity.getWindow().getDecorView().getRootView());
        } catch (Exception e) {
            Log.w("fb_FeedbackClient", "Get screenshot failed!", e);
            return null;
        }
    }

    /* renamed from: b */
    public final aucb mo29488b(FeedbackOptions feedbackOptions) {
        try {
            if (((Boolean) wzi.f51595a.mo54082a()).booleanValue()) {
                return mo24732b(new wwq(feedbackOptions));
            }
        } catch (SecurityException e) {
            Log.e("fb_FeedbackClient", e.getMessage());
        }
        return sdl.m34954a(wvu.m42362b(this.f43165D, feedbackOptions));
    }

    /* renamed from: a */
    public static Bitmap m42393a(View view) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            return createBitmap;
        } catch (Error | Exception e) {
            Log.w("fb_FeedbackClient", "Get screenshot failed!", e);
            return null;
        }
    }

    /* renamed from: a */
    public final aucb mo29487a(FeedbackOptions feedbackOptions) {
        try {
            if (!((Boolean) wzi.f51596b.mo54082a()).booleanValue()) {
                return sdl.m34954a(wvu.m42359a(this.f43165D, feedbackOptions));
            }
            long nanoTime = System.nanoTime();
            Context b = this.f43165D.mo24794b();
            roz b2 = rpa.m34196b();
            b2.f43472a = new wwp(feedbackOptions, nanoTime, b);
            b2.f43473b = new Feature[]{wvn.f51428b};
            return mo24732b(b2.mo24977a());
        } catch (SecurityException e) {
            Log.e("fb_FeedbackClient", e.getMessage());
        }
    }
}
