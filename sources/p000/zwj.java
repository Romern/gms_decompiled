package p000;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: zwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zwj {

    /* renamed from: a */
    public final Collection f56055a = new ArrayList();

    public zwj() {
        new ArrayList();
        new ArrayList();
    }

    /* renamed from: a */
    public static void m46610a(Context context) {
        zwk zwk = zwp.m46613a().f56059a;
        synchronized (zwk) {
            if (!zwk.f56056a) {
                try {
                    zwk.f56057b = zwn.asInterface(waq.m41676a(context, waq.f50355c, ModuleDescriptor.MODULE_ID).mo29007a("com.google.android.gms.flags.impl.FlagProviderImpl"));
                    zwk.f56057b.init(vzs.m41642a(context));
                    zwk.f56056a = true;
                } catch (RemoteException | wam e) {
                    Log.w("FlagValueProvider", "Failed to initialize flags module.", e);
                }
            }
        }
    }
}
