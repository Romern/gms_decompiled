package p000;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.Base64;
import android.util.Pair;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackChimeraActivity;
import com.google.android.gms.googlehelp.feedback.Screenshot;

/* renamed from: wwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wwm extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ ErrorReport f51481a;

    /* renamed from: b */
    final /* synthetic */ Pair f51482b;

    /* renamed from: c */
    final /* synthetic */ Screenshot f51483c;

    /* renamed from: d */
    final /* synthetic */ Pair f51484d;

    /* renamed from: e */
    final /* synthetic */ FeedbackChimeraActivity f51485e;

    public wwm(FeedbackChimeraActivity feedbackChimeraActivity, ErrorReport errorReport, Pair pair, Screenshot screenshot, Pair pair2) {
        this.f51485e = feedbackChimeraActivity;
        this.f51481a = errorReport;
        this.f51482b = pair;
        this.f51483c = screenshot;
        this.f51484d = pair2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.googlehelp.feedback.Screenshot.a(byte[], boolean):android.graphics.Bitmap
     arg types: [byte[], int]
     candidates:
      com.google.android.gms.googlehelp.feedback.Screenshot.a(com.google.android.gms.feedback.ErrorReport, com.google.android.gms.googlehelp.feedback.Screenshot):void
      com.google.android.gms.googlehelp.feedback.Screenshot.a(byte[], boolean):android.graphics.Bitmap */
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        boolean z;
        byte[] bArr;
        boolean z2;
        Void[] voidArr = (Void[]) objArr;
        FeedbackChimeraActivity feedbackChimeraActivity = this.f51485e;
        wwy wwy = FeedbackChimeraActivity.f31574e;
        feedbackChimeraActivity.f31585j = false;
        if (this.f51481a.f31566v == null) {
            if (wxb.m42442a(this.f51482b, this.f51483c)) {
                this.f51485e.f31585j = true;
                z = true;
            } else {
                z = false;
            }
            bArr = Base64.decode(this.f51483c.f78924c, 0);
        } else {
            if (wxb.m42442a(this.f51482b, this.f51483c)) {
                this.f51485e.f31585j = true;
                z2 = true;
            } else {
                z2 = false;
            }
            bArr = this.f51481a.f31566v;
        }
        if (this.f51485e.mo18612k()) {
            if (!FeedbackChimeraActivity.m23369m()) {
                FeedbackChimeraActivity.f31575f = Bitmap.createScaledBitmap(Screenshot.m66500a(bArr, false), ((Integer) this.f51484d.first).intValue(), ((Integer) this.f51484d.second).intValue(), true);
            }
            this.f51485e.f31583g = Bitmap.createScaledBitmap(FeedbackChimeraActivity.f31575f, FeedbackChimeraActivity.f31575f.getWidth() / 2, FeedbackChimeraActivity.f31575f.getHeight() / 2, true);
        } else {
            FeedbackChimeraActivity.f31575f = Screenshot.m66500a(bArr, z);
            this.f51485e.f31583g = FeedbackChimeraActivity.f31575f;
        }
        return this.f51485e.f31583g;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        FeedbackChimeraActivity feedbackChimeraActivity = this.f51485e;
        wwt wwt = feedbackChimeraActivity.f31581c;
        if (!wwt.isDetached() && !wwt.isRemoving() && wwt.isResumed()) {
            feedbackChimeraActivity.f31581c.mo29489a(bitmap, feedbackChimeraActivity.mo18612k());
        } else {
            feedbackChimeraActivity.f31582d = true;
        }
    }
}
