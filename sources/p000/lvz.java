package p000;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* renamed from: lvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class lvz extends IntentOperation {

    /* renamed from: a */
    private static final lvn f33091a = new lvn("UserAwareIntentOperation");

    /* renamed from: a */
    public abstract void mo17242a(Intent intent);

    public final void onHandleIntent(Intent intent) {
        if (!cckt.m130240c() || mcl.m24877a()) {
            mo17242a(intent);
            return;
        }
        lvn lvn = f33091a;
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("User not 0, ignoring intent ");
        sb.append(valueOf);
        lvn.mo25412b(sb.toString(), new Object[0]);
    }
}
