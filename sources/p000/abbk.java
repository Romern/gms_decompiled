package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.io.File;
import java.util.List;

/* renamed from: abbk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abbk implements Runnable {

    /* renamed from: a */
    private final Context f56990a;

    /* renamed from: b */
    private final GoogleHelp f56991b;

    /* renamed from: c */
    private final wvd f56992c;

    /* renamed from: d */
    private final long f56993d;

    public abbk(Context context, GoogleHelp googleHelp, wvd wvd, long j) {
        this.f56990a = context;
        this.f56991b = googleHelp;
        this.f56992c = wvd;
        this.f56993d = j;
    }

    public final void run() {
        List<FileTeleporter> list;
        Bundle bundle = new Bundle(1);
        try {
            wzh wzh = new wzh();
            wzh.mo29584c();
            list = this.f56992c.mo14944a();
            File cacheDir = this.f56990a.getCacheDir();
            if (list != null) {
                if (!list.isEmpty() && cacheDir != null) {
                    for (FileTeleporter fileTeleporter : list) {
                        fileTeleporter.mo18618a(cacheDir);
                    }
                }
            }
            bundle.putString("gms:feedback:async_feedback_psbd_collection_time_ms", String.valueOf(wzh.mo29582a()));
        } catch (Exception e) {
            Log.w("gH_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", e);
            bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
            list = null;
        }
        FeedbackOptions a = FeedbackOptions.m23394a(list);
        abcb a2 = aarj.m46792a(this.f56990a);
        GoogleHelp googleHelp = this.f56991b;
        long j = this.f56993d;
        rkb rkb = a2.f43165D;
        abbt abbt = new abbt(rkb, a, bundle, j, googleHelp);
        rkb.mo24787a((rle) abbt);
        sdl.m34954a(abbt);
    }
}
