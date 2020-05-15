package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.chimera.ModuleContext;
import java.util.ArrayList;
import java.util.List;

/* renamed from: deq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class deq extends BroadcastReceiver {

    /* renamed from: a */
    private static boolean f12981a = false;

    /* renamed from: b */
    private static final List f12982b = new ArrayList();

    /* renamed from: a */
    public static synchronized void m8255a(Context context, ModuleContext moduleContext) {
        synchronized (deq.class) {
            if (moduleContext.f7657f != null) {
                f12982b.add(moduleContext);
                if (!f12981a) {
                    context.registerReceiver(ModuleContext.f7649k, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
                    f12981a = true;
                }
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        synchronized (deq.class) {
            for (int i = 0; i < f12982b.size(); i++) {
                ModuleContext moduleContext = (ModuleContext) f12982b.get(i);
                moduleContext.updateModuleConfiguration(moduleContext.getBaseContext().getResources().getConfiguration());
            }
        }
    }
}
