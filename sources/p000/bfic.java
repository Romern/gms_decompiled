package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.List;

/* renamed from: bfic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfic extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ bfid f113999a;

    public bfic(bfid bfid) {
        this.f113999a = bfid;
    }

    public final void onReceive(Context context, Intent intent) {
        synchronized (this) {
            if (!this.f113999a.mo61674i()) {
                this.f113999a.mo61721a((List) null);
            }
        }
    }
}
