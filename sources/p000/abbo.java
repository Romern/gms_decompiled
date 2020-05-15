package p000;

import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abbo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abbo implements Runnable {

    /* renamed from: a */
    public final GoogleHelp f57003a;

    /* renamed from: b */
    public final abbp f57004b;

    /* renamed from: c */
    private final aard f57005c;

    /* renamed from: d */
    private boolean f57006d;

    public abbo(GoogleHelp googleHelp, aard aard, abbp abbp) {
        this.f57003a = googleHelp;
        this.f57005c = aard;
        this.f57004b = abbp;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean mo31993a() {
        if (this.f57006d) {
            return false;
        }
        this.f57006d = true;
        return true;
    }

    public final void run() {
        List list;
        this.f57006d = false;
        adzt adzt = new adzt(Looper.getMainLooper());
        abbn abbn = new abbn(this);
        adzt.postDelayed(abbn, (long) new aare(this.f57003a).f56363a.f78752C);
        try {
            wzh wzh = new wzh();
            wzh.mo29584c();
            list = this.f57005c.mo31632a();
            if (list == null) {
                list = new ArrayList(1);
            }
            try {
                list.add(Pair.create("gms:googlehelp:sync_help_psd_collection_time_ms", String.valueOf(wzh.mo29582a())));
            } catch (UnsupportedOperationException e) {
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(Pair.create("gms:googlehelp:sync_help_psd_collection_time_ms", String.valueOf(wzh.mo29582a())));
                list = arrayList;
            }
        } catch (Exception e2) {
            Log.w("gH_GetSyncHelpPsd", "Failed to get sync help psd.", e2);
            list = sqw.m36033a(Pair.create("gms:googlehelp:sync_help_psd_failure", "exception"));
        }
        if (mo31993a()) {
            adzt.removeCallbacks(abbn);
            new aare(this.f57003a).mo31635a(list);
            this.f57004b.mo31995a(this.f57003a);
        }
    }
}
