package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;

/* renamed from: aagh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aagh extends BroadcastReceiver {
    static {
        aagh.class.getSimpleName();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo16856a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract byte[] mo16857a(Intent intent, Context context);

    public final void onReceive(Context context, Intent intent) {
        byte[] a = mo16857a(intent, context);
        if (a != null) {
            aagu.m21242a(context, aagu.m21240a(mo16856a(), a));
        }
    }
}
