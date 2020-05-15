package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import com.google.android.cast.JGCastService;
import java.util.Iterator;
import java.util.List;

/* renamed from: diw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class diw {
    private diw() {
    }

    /* renamed from: a */
    public static Intent m8598a(Context context, Intent intent, div div, String... strArr) {
        String action;
        List<ResolveInfo> queryBroadcastReceivers;
        if (div.f13284a && (action = intent.getAction()) != null && (intent.getFlags() & JGCastService.FLAG_PRIVATE_DISPLAY) == 0 && context.getPackageName().equals(intent.getPackage()) && intent.getComponent() == null && (!div.f13285b ? div.f13286c.contains(action) : !div.f13287d.contains(action)) && (queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 128)) != null && !queryBroadcastReceivers.isEmpty()) {
            Iterator<ResolveInfo> it = queryBroadcastReceivers.iterator();
            while (true) {
                if (it.hasNext()) {
                    Bundle bundle = it.next().activityInfo.metaData;
                    if (bundle != null) {
                        if (!bundle.getBoolean("chimera.intentOperationReceiver")) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            String str = strArr[i];
                            if (str != null && context.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
                                break;
                            }
                            i++;
                        } else {
                            try {
                                if (context.startService(new Intent("com.google.android.chimera.BROADCAST_SERVICE").setPackage(context.getPackageName()).putExtra("broadcast", intent)) != null) {
                                    return new Intent(intent).addFlags(JGCastService.FLAG_PRIVATE_DISPLAY);
                                }
                            } catch (IllegalArgumentException | IllegalStateException | SecurityException e) {
                                String valueOf = String.valueOf(e);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                                sb.append("Unable to start broadcast service: ");
                                sb.append(valueOf);
                                Log.w("ChimeraBSUtils", sb.toString());
                            }
                        }
                    }
                }
            }
        }
        return intent;
    }
}
