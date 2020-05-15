package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: abbl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abbl implements Runnable {

    /* renamed from: a */
    private final Context f56994a;

    /* renamed from: b */
    private final GoogleHelp f56995b;

    /* renamed from: c */
    private final wvd f56996c;

    /* renamed from: d */
    private final long f56997d;

    public abbl(Context context, GoogleHelp googleHelp, wvd wvd, long j) {
        this.f56994a = context;
        this.f56995b = googleHelp;
        this.f56996c = wvd;
        this.f56997d = j;
    }

    public final void run() {
        List list;
        try {
            wzh wzh = new wzh();
            wzh.mo29584c();
            list = this.f56996c.mo29442b();
            if (list == null) {
                list = new ArrayList(1);
            }
            try {
                list.add(Pair.create("gms:feedback:async_feedback_psd_collection_time_ms", String.valueOf(wzh.mo29582a())));
            } catch (UnsupportedOperationException e) {
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(Pair.create("gms:feedback:async_feedback_psd_collection_time_ms", String.valueOf(wzh.mo29582a())));
                list = arrayList;
            }
        } catch (Exception e2) {
            Log.w("gH_GetAsyncFeedbackPsd", "Failed to get async Feedback psd.", e2);
            list = Collections.singletonList(Pair.create("gms:feedback:async_feedback_psd_failure", "exception"));
        }
        abcb a = aarj.m46792a(this.f56994a);
        GoogleHelp googleHelp = this.f56995b;
        Bundle a2 = wzg.m42515a(list);
        long j = this.f56997d;
        rkb rkb = a.f43165D;
        abbr abbr = new abbr(rkb, a2, j, googleHelp);
        rkb.mo24787a((rle) abbr);
        sdl.m34954a(abbr);
    }
}
