package p000;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.Base64;
import com.google.android.gms.feedback.AnnotateScreenshotChimeraActivity;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackChimeraActivity;
import com.google.android.gms.googlehelp.feedback.Screenshot;
import java.lang.ref.WeakReference;

/* renamed from: wvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wvb extends AsyncTask {

    /* renamed from: a */
    private final WeakReference f51400a;

    /* renamed from: b */
    private final int f51401b;

    /* renamed from: c */
    private final int f51402c;

    public wvb(AnnotateScreenshotChimeraActivity annotateScreenshotChimeraActivity, int i, int i2) {
        this.f51400a = new WeakReference(annotateScreenshotChimeraActivity);
        this.f51401b = i2;
        this.f51402c = i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.googlehelp.feedback.Screenshot.a(byte[], boolean):android.graphics.Bitmap
     arg types: [byte[], int]
     candidates:
      com.google.android.gms.googlehelp.feedback.Screenshot.a(com.google.android.gms.feedback.ErrorReport, com.google.android.gms.googlehelp.feedback.Screenshot):void
      com.google.android.gms.googlehelp.feedback.Screenshot.a(byte[], boolean):android.graphics.Bitmap */
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        if (((AnnotateScreenshotChimeraActivity) this.f51400a.get()) == null) {
            return null;
        }
        wwy wwy = FeedbackChimeraActivity.f31574e;
        ErrorReport g = wwy.mo29517g();
        Screenshot screenshot = wwy.f51515b;
        byte[] bArr = g.f31566v;
        if (bArr == null) {
            bArr = Base64.decode(screenshot.f78924c, 0);
        }
        return Bitmap.createScaledBitmap(Screenshot.m66500a(bArr, false), this.f51402c, this.f51401b, true);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        AnnotateScreenshotChimeraActivity annotateScreenshotChimeraActivity = (AnnotateScreenshotChimeraActivity) this.f51400a.get();
        if (annotateScreenshotChimeraActivity != null && bitmap != null) {
            FeedbackChimeraActivity.f31579m = true;
            FeedbackChimeraActivity.m23364a(bitmap.copy(bitmap.getConfig(), true));
            annotateScreenshotChimeraActivity.mo18579a(FeedbackChimeraActivity.f31575f);
            annotateScreenshotChimeraActivity.f31484a.invalidate();
        }
    }
}
