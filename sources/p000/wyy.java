package p000;

import android.content.Context;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: wyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wyy implements Runnable {

    /* renamed from: a */
    private final Context f51589a;

    /* renamed from: b */
    private final wvd f51590b;

    /* renamed from: c */
    private final long f51591c;

    public wyy(Context context, wvd wvd, long j) {
        this.f51589a = context;
        this.f51590b = wvd;
        this.f51591c = j;
    }

    public final void run() {
        List list;
        try {
            wzh wzh = new wzh();
            wzh.mo29584c();
            list = this.f51590b.mo29442b();
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
            Log.w("gF_GetAsyncFeedbackPsd", "Failed to get async Feedback psd.", e2);
            list = Collections.singletonList(Pair.create("gms:feedback:async_feedback_psd_failure", "exception"));
        }
        wwr a = wvu.m42361a(this.f51589a);
        sdl.m34954a(wvu.m42358a(a.f43165D, wzg.m42515a(list), this.f51591c));
    }
}
