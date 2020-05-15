package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: abbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abbm implements Runnable {

    /* renamed from: a */
    private final Context f56998a;

    /* renamed from: b */
    private final GoogleHelp f56999b;

    /* renamed from: c */
    private final aard f57000c;

    /* renamed from: d */
    private final long f57001d;

    public abbm(Context context, GoogleHelp googleHelp, aard aard, long j) {
        this.f56998a = context;
        this.f56999b = googleHelp;
        this.f57000c = aard;
        this.f57001d = j;
    }

    public final void run() {
        List list;
        try {
            wzh wzh = new wzh();
            wzh.mo29584c();
            list = this.f57000c.mo31632a();
            if (list == null) {
                list = new ArrayList(1);
            }
            try {
                list.add(Pair.create("gms:googlehelp:async_help_psd_collection_time_ms", String.valueOf(wzh.mo29582a())));
            } catch (UnsupportedOperationException e) {
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(Pair.create("gms:googlehelp:async_help_psd_collection_time_ms", String.valueOf(wzh.mo29582a())));
                list = arrayList;
            }
        } catch (Exception e2) {
            Log.w("gH_GetAsyncHelpPsd", "Failed to get async help psd.", e2);
            list = Collections.singletonList(Pair.create("gms:googlehelp:async_help_psd_failure", "exception"));
        }
        abcb a = aarj.m46792a(this.f56998a);
        GoogleHelp googleHelp = this.f56999b;
        Bundle a2 = wzg.m42515a(list);
        long j = this.f57001d;
        rkb rkb = a.f43165D;
        abbx abbx = new abbx(rkb, a2, j, googleHelp);
        rkb.mo24787a((rle) abbx);
        sdl.m34954a(abbx);
    }
}
