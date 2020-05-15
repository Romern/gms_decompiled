package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import java.util.function.BiConsumer;

/* renamed from: bjbr */
public final /* synthetic */ class bjbr implements BiConsumer {

    /* renamed from: a */
    private final Context f122488a;

    /* renamed from: b */
    private final BroadcastReceiver f122489b;

    public bjbr(Context context, BroadcastReceiver broadcastReceiver) {
        this.f122488a = context;
        this.f122489b = broadcastReceiver;
    }

    public final void accept(Object obj, Object obj2) {
        Void voidR = (Void) obj;
        Throwable th = (Throwable) obj2;
        this.f122488a.unregisterReceiver(this.f122489b);
    }
}
