package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.ipa.mediastoreindexer.InstantIndexingIntentOperation;

/* renamed from: adpl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adpl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f62451a;

    /* renamed from: b */
    final /* synthetic */ adpm f62452b;

    public adpl(adpm adpm, Context context) {
        this.f62452b = adpm;
        this.f62451a = context;
    }

    public final void run() {
        Intent startIntent = IntentOperation.getStartIntent(this.f62451a, InstantIndexingIntentOperation.class, "com.google.android.gms.ipa.mediastoreindexer.INSTANT_INDEX");
        if (startIntent != null) {
            this.f62451a.startService(startIntent);
            this.f62452b.f62455b.set(false);
        }
    }
}
