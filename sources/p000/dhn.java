package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.felicanetworks.mfc.Felica;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.InvalidConfigException;
import java.util.Arrays;
import java.util.List;

/* renamed from: dhn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class dhn extends BroadcastReceiver {

    /* renamed from: b */
    private final boolean f13152b;

    /* renamed from: c */
    private final String[] f13153c;

    /* renamed from: d */
    private final dii f13154d;

    public dhn(boolean z, String[] strArr, dii dii) {
        this.f13152b = z;
        this.f13153c = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
        this.f13154d = dii;
    }

    /* renamed from: a */
    private final boolean m8504a(Context context, Intent intent) {
        ComponentName startService;
        String action = intent.getAction();
        if (action == null || !action.equals("com.google.android.chimera.container.IntentOperationService.WAKEFUL_INTENT")) {
            context.startService(intent);
            return false;
        }
        dii dii = this.f13154d;
        synchronized (dii.f13224c) {
            int i = dii.f13222a;
            dii.f13222a = i + 1;
            intent.putExtra("wakelockId", i);
            intent.putExtra("uniqueId", dii.f13223b);
            startService = context.startService(intent);
            if (startService != null) {
                dii.f13224c.put(i, dii.mo9095a(context, startService.flattenToShortString(), 60000));
            } else {
                startService = null;
            }
        }
        return startService != null;
    }

    public final void onReceive(Context context, Intent intent) {
        boolean z;
        String action = intent.getAction();
        if (action != null) {
            String[] strArr = this.f13153c;
            if (strArr != null && Arrays.binarySearch(strArr, action) < 0) {
                String name = getClass().getName();
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 31 + action.length());
                sb.append(name);
                sb.append(" dropping unexpected broadcast ");
                sb.append(action);
                Log.w("IntentOpRcvr", sb.toString());
                return;
            }
            if (!action.equals(IntentOperation.ACTION_TARGETED_INTENT)) {
                List startIntentsForBroadcast = IntentOperation.getStartIntentsForBroadcast(context, intent, this.f13152b, !aytw.m84815b(context), true);
                if (startIntentsForBroadcast != null) {
                    int size = startIntentsForBroadcast.size();
                    z = false;
                    for (int i = 0; i < size; i++) {
                        z |= m8504a(context, (Intent) startIntentsForBroadcast.get(i));
                    }
                } else {
                    String name2 = getClass().getName();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(name2).length() + 39 + action.length());
                    sb2.append(name2);
                    sb2.append(" failed to resolve broadcast ");
                    sb2.append(action);
                    sb2.append(", dropping");
                    Log.w("IntentOpRcvr", sb2.toString());
                    return;
                }
            } else {
                Intent intent2 = (Intent) intent.getParcelableExtra(IntentOperation.EXTRA_TARGETED_INTENT);
                if (intent2 == null) {
                    Log.w("IntentOpRcvr", "Dropping com.google.android.chimera.IntentOperation.TARGETED_INTENT without inner intent extra");
                    intent2 = null;
                } else if (this.f13152b) {
                    Log.w("IntentOpRcvr", "Exported receiver dropping com.google.android.chimera.IntentOperation.TARGETED_INTENT");
                    intent2 = null;
                } else {
                    try {
                        brtm f = dfy.m8329a(context).mo8898f().mo9181f();
                        ComponentName component = intent2.getComponent();
                        bmzs.m108696a(component);
                        String className = component.getClassName();
                        if (f.mo69922c(dmv.m8834a(f.mo69896E(), className)) == null) {
                            String valueOf = String.valueOf(className);
                            Log.w("IntentOpRcvr", valueOf.length() == 0 ? new String("Dropping com.google.android.chimera.IntentOperation.TARGETED_INTENT targeting invalid class ") : "Dropping com.google.android.chimera.IntentOperation.TARGETED_INTENT targeting invalid class ".concat(valueOf));
                            intent2 = null;
                        } else {
                            intent2.setPackage(context.getPackageName());
                        }
                    } catch (InvalidConfigException e) {
                        String valueOf2 = String.valueOf(e);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 30);
                        sb3.append("Failed to get Chimera config: ");
                        sb3.append(valueOf2);
                        Log.e("IntentOpRcvr", sb3.toString());
                        intent2 = null;
                    }
                }
                if (intent2 != null) {
                    z = m8504a(context, intent2);
                } else {
                    return;
                }
            }
            if (z) {
                dii dii = this.f13154d;
                synchronized (dii.f13224c) {
                    dii.f13226e++;
                }
                Intent intent3 = new Intent("com.google.android.chimera.container.IntentOperationService.KEEPALIVE");
                intent3.putExtra("keepAliveDuration", (int) Felica.MAX_TIMEOUT);
                intent3.setComponent(this.f13154d.f13225d);
                context.startService(intent3);
            }
        }
    }
}
