package com.google.android.gms.instantapps.routing;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.BoundService;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.ListIterator;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InstantAppResolverBoundService extends BoundService {
    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        adfv a = adfv.m50332a(this);
        printWriter.println();
        printWriter.printf("\nInstant Apps enabled: %s\n", Boolean.valueOf(aykr.m84203a()));
        printWriter.printf("Instant App resolver enabled: %s\n", Boolean.valueOf(cepl.m137722c()));
        printWriter.printf("Accounts: %s\n", Arrays.toString(a.f61578c.mo33604d()));
        printWriter.printf("Opt-in account: %s\n", a.f61578c.mo33600a());
        printWriter.printf("Opt-in state: %s\n", Integer.valueOf(a.f61579d.mo33606a()));
        printWriter.println("\nEvent Log:");
        ListIterator b = a.f61591p.iterator();
        while (b.hasNext()) {
            printWriter.println((String) b.next());
        }
        printWriter.println();
    }

    public final IBinder onBind(Intent intent) {
        int i = Build.VERSION.SDK_INT;
        if ("android.intent.action.RESOLVE_EPHEMERAL_PACKAGE".equals(intent.getAction()) || "android.intent.action.RESOLVE_INSTANT_APP_PACKAGE".equals(intent.getAction())) {
            adfv a = adfv.m50332a(this);
            adjr adjr = new adjr(a.f61592q, a.f61595t, a.f61593r, a.f61579d, a.f61586k);
            try {
                ContextWrapper.class.getDeclaredMethod("attachBaseContext", Context.class).invoke(adjr, this);
                return adjr.onBind(intent);
            } catch (Exception e) {
                Log.e("InstantAppResolver", "Failed to call attachBaseContext", e);
                return null;
            }
        } else {
            String valueOf = String.valueOf(intent.getAction());
            Log.e("InstantAppResolver", valueOf.length() == 0 ? new String("Unexpected action: ") : "Unexpected action: ".concat(valueOf));
            return null;
        }
    }
}
