package p000;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* renamed from: raq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class raq extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if ("android.intent.action.CLEARCUT_MODULE_UPDATE".equals(intent.getAction())) {
            rem.m33465a(this);
        }
    }
}
