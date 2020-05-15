package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import java.io.File;
import java.util.List;

/* renamed from: wyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wyx implements Runnable {

    /* renamed from: a */
    private final Context f51586a;

    /* renamed from: b */
    private final wvd f51587b;

    /* renamed from: c */
    private final long f51588c;

    public wyx(Context context, wvd wvd, long j) {
        this.f51586a = context;
        this.f51587b = wvd;
        this.f51588c = j;
    }

    public final void run() {
        List<FileTeleporter> list;
        Bundle bundle = new Bundle(1);
        try {
            wzh wzh = new wzh();
            wzh.mo29584c();
            list = this.f51587b.mo14944a();
            File cacheDir = this.f51586a.getCacheDir();
            if (list != null) {
                if (!list.isEmpty() && cacheDir != null) {
                    for (FileTeleporter fileTeleporter : list) {
                        fileTeleporter.mo18618a(cacheDir);
                    }
                }
            }
            bundle.putString("gms:feedback:async_feedback_psbd_collection_time_ms", String.valueOf(wzh.mo29582a()));
        } catch (Exception e) {
            Log.w("gF_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", e);
            bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
            list = null;
        }
        long j = this.f51588c;
        sdl.m34954a(wvu.m42360a(wvu.m42361a(this.f51586a).f43165D, FeedbackOptions.m23394a(list), bundle, j));
    }
}
