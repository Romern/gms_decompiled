package p000;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* renamed from: asjx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class asjx extends IntentOperation {
    /* renamed from: a */
    public abstract void mo49205a(Intent intent);

    public final void onHandleIntent(Intent intent) {
        if (asjw.m74259d(this)) {
            mo49205a(intent);
        }
    }
}
