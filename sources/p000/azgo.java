package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.matchstick.net.MessagingService;

/* renamed from: azgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azgo implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f99285a;

    public azgo(Context context) {
        this.f99285a = context;
    }

    public final void run() {
        azcm a = azcm.m85300a(this.f99285a);
        a.f98996b.beginTransaction();
        try {
            a.f98996b.delete("messages", null, null);
            Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.RUN_SYNC_CHECKER");
            intent.putExtra("sync_ops", 16);
            MessagingService.m94557b(intent, a.f98995a);
            a.f98996b.setTransactionSuccessful();
        } finally {
            a.f98996b.endTransaction();
        }
    }
}
