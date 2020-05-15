package com.google.android.chimera;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import com.google.android.chimera.config.InvalidConfigException;
import java.util.ArrayList;
import java.util.List;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class IntentOperation extends ContextWrapper {
    public static final String ACTION_NEW_MODULE = "com.google.android.chimera.IntentOperation.NEW_MODULE";
    public static final String ACTION_TARGETED_INTENT = "com.google.android.chimera.IntentOperation.TARGETED_INTENT";

    /* renamed from: CL */
    private static ComponentName f7633CL = null;
    public static final String EXTRA_CONTAINER_UPDATED = "containerUpdated";
    public static final String EXTRA_PREVIOUS_VERSION = "oldversion";
    public static final String EXTRA_TARGETED_INTENT = "targetedIntent";

    public IntentOperation() {
        super(null);
    }

    /* renamed from: a */
    private static dnb m4856a(Context context, Intent intent, String str) {
        Intent intent2 = intent;
        String action = intent.getAction();
        bmxy.m108581a(action);
        try {
            brtm f = dfy.m8329a(context).mo8898f().mo9181f();
            String E = f.mo69896E();
            String a = dmv.m8834a(E, str);
            String a2 = dmv.m8834a(E, action);
            int D = f.mo69895D();
            dmz dmz = new dmz();
            for (int i = 0; i < D; i++) {
                f.mo69918a(dmz, i);
                dmw a3 = dmz.mo9293a(a2);
                if (a3 != null) {
                    int b = a3.mo9289b();
                    dnb dnb = new dnb();
                    for (int i2 = 0; i2 < b; i2++) {
                        a3.mo9288a(dnb, i2);
                        if (dnb.mo9296e().equals(a)) {
                            intent2.setClassName(context, dmv.m8840b(E, dmz.mo9294c()));
                            String valueOf = String.valueOf(a);
                            intent2.addCategory(valueOf.length() == 0 ? new String("targeted_intent_op_prefix:") : "targeted_intent_op_prefix:".concat(valueOf));
                            return dnb;
                        }
                    }
                    continue;
                }
            }
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 46 + String.valueOf(a2).length());
            sb.append("No such module intent operation: ");
            sb.append(a);
            sb.append(" for action: ");
            sb.append(a2);
            Log.e("IntentOperation", sb.toString());
            return null;
        } catch (InvalidConfigException e) {
            String valueOf2 = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 29);
            sb2.append("Failed to get Chimera config:");
            sb2.append(valueOf2);
            Log.w("IntentOperation", sb2.toString());
            return null;
        }
    }

    public static Intent getExternalIntent(Intent intent) {
        return new Intent("com.google.android.chimera.container.IntentOperationService.EXTERNAL_INTENT").putExtra("intent", intent);
    }

    public static Intent getModuleSpecificIntent(String str, Intent intent) {
        return new Intent("com.google.android.chimera.container.IntentOperationService.MODULE_SPECIFIC").putExtra("moduleid", str).putExtra("intent", intent);
    }

    public static PendingIntent getPendingIntent(Context context, Class cls, Intent intent, int i, int i2) {
        return getPendingIntent(context, cls.getName(), intent, i, i2);
    }

    public static Intent getStartIntent(Context context, Class cls, String str) {
        return getStartIntent(context, cls.getName(), str);
    }

    public static List getStartIntentsForBroadcast(Context context, Intent intent, boolean z, boolean z2, boolean z3) {
        String action = intent.getAction();
        bmzs.m108696a(action);
        try {
            brtm f = dfy.m8329a(context).mo8898f().mo9181f();
            String E = f.mo69896E();
            String a = dmv.m8834a(E, action);
            int D = f.mo69895D();
            ArrayList arrayList = new ArrayList(D);
            dmz dmz = new dmz();
            for (int i = 0; i < D; i++) {
                f.mo69918a(dmz, i);
                dmw a2 = dmz.mo9293a(a);
                if (a2 != null) {
                    String b = dmv.m8840b(E, dmz.mo9294c());
                    boolean z4 = !z;
                    boolean z5 = !z3;
                    int b2 = a2.mo9289b();
                    dnb dnb = new dnb();
                    int i2 = 0;
                    boolean z6 = false;
                    while (true) {
                        if (i2 >= b2) {
                            break;
                        }
                        a2.mo9288a(dnb, i2);
                        if (!z2 || dnb.mo9300i()) {
                            z4 |= dnb.mo9299h();
                            z5 |= dnb.mo9298g();
                            if (z4 && z5) {
                                z6 = true;
                                break;
                            }
                            z6 = true;
                        }
                        i2++;
                    }
                    if (z6) {
                        if (!z || z4) {
                            Intent intent2 = new Intent(intent);
                            if (z) {
                                intent2 = getExternalIntent(intent2);
                            }
                            if (z3 && z5) {
                                intent2 = getWakefulIntent(intent2);
                            }
                            intent2.setClassName(context, b);
                            arrayList.add(intent2);
                        }
                    }
                }
            }
            return arrayList;
        } catch (InvalidConfigException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append("Failed to get Chimera config: ");
            sb.append(valueOf);
            Log.w("IntentOperation", sb.toString());
            return null;
        }
    }

    public static Intent getWakefulIntent(Intent intent) {
        return new Intent("com.google.android.chimera.container.IntentOperationService.WAKEFUL_INTENT").putExtra("intent", intent);
    }

    public static boolean startModuleIntentOperation(Context context, String str, Intent intent) {
        Intent moduleSpecificIntent = getModuleSpecificIntent(str, intent);
        ComponentName componentName = f7633CL;
        if (componentName != null) {
            moduleSpecificIntent.setComponent(componentName);
        } else {
            moduleSpecificIntent.setPackage(context.getPackageName());
        }
        ComponentName startService = context.startService(moduleSpecificIntent);
        f7633CL = startService;
        return startService != null;
    }

    public void init(Context context) {
        attachBaseContext(context);
        onCreate();
    }

    public void onCreate() {
    }

    public void onDestroy() {
    }

    public void onHandleIntent(Intent intent) {
    }

    public static PendingIntent getPendingIntent(Context context, String str, Intent intent, int i, int i2) {
        dnb a = m4856a(context, intent, str);
        String str2 = null;
        if (a == null) {
            return null;
        }
        if (!a.mo9298g()) {
            return PendingIntent.getService(context, i, intent, i2);
        }
        Intent wakefulIntent = getWakefulIntent(intent);
        wakefulIntent.setComponent(intent.getComponent());
        Intent intent2 = new Intent(ACTION_TARGETED_INTENT);
        intent2.putExtra(EXTRA_TARGETED_INTENT, wakefulIntent);
        String action = intent.getAction();
        if (action == null) {
            action = "null";
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            str2 = component.getClassName();
        }
        bmzs.m108696a(str2);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("chimeraio").appendPath(str2).appendPath(action);
        intent2.setData(builder.build());
        intent2.setPackage(context.getPackageName());
        return PendingIntent.getBroadcast(context, i, intent2, i2);
    }

    public static Intent getStartIntent(Context context, String str, String str2) {
        Intent intent = new Intent(str2);
        if (m4856a(context, intent, str) != null) {
            return intent;
        }
        return null;
    }

    public void onHandleIntent(Intent intent, boolean z) {
        onHandleIntent(intent);
    }
}
