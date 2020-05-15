package p000;

import android.app.usage.UsageStatsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.os.UserHandle;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.broadcast.BackgroundBroadcastReceiverSupport$GmsReceiverIntentOperation;
import com.google.android.gms.common.broadcast.BackgroundBroadcastReceiverSupport$UiReceiverIntentOperation;
import com.google.android.gms.common.broadcast.C1565x2961e3ee;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: rrv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rrv extends BroadcastReceiver {

    /* renamed from: a */
    private final rsc f43562a;

    /* renamed from: b */
    private final rru f43563b = new rru();

    public rrv(rsc rsc) {
        this.f43562a = rsc;
    }

    /* renamed from: a */
    private static final void m34319a(Context context, Intent intent, SparseArray sparseArray, int i) {
        Class cls;
        if (sparseArray.get(i) != null) {
            if (i == 1) {
                cls = BackgroundBroadcastReceiverSupport$GmsReceiverIntentOperation.class;
            } else if (i == 2) {
                cls = C1565x2961e3ee.class;
            } else if (i == 4) {
                cls = BackgroundBroadcastReceiverSupport$UiReceiverIntentOperation.class;
            } else {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Process ");
                sb.append(i);
                sb.append(" has no IntentOperationService.");
                throw new IllegalArgumentException(sb.toString());
            }
            Intent startIntent = IntentOperation.getStartIntent(context, cls, "com.google.android.gms.common.broadcast.DELIVER_BROADCAST");
            if (startIntent == null) {
                String valueOf = String.valueOf(intent.getAction());
                Log.e("GmsReceiverSupport", valueOf.length() == 0 ? new String("Failure to create IntentOperation for broadcast: ") : "Failure to create IntentOperation for broadcast: ".concat(valueOf));
                return;
            }
            startIntent.putExtra("broadcast_intent", intent);
            List<sgl> list = (List) sparseArray.get(i);
            String[] strArr = new String[list.size()];
            int i2 = 0;
            for (sgl sgl : list) {
                strArr[i2] = sgl.f44416a;
                i2++;
            }
            startIntent.putExtra("broadcast_targets", strArr);
            try {
                context.startService(startIntent);
            } catch (IllegalStateException e) {
                try {
                    ((UsageStatsManager) context.getSystemService("usagestats")).whitelistAppTemporarily("com.google.android.gms", 60000, UserHandle.getUserHandleForUid(Process.myUid()));
                    try {
                        context.startService(startIntent);
                    } catch (IllegalStateException e2) {
                        Log.e("GmsReceiverSupport", "com.google.android.gms requires <allow-in-power-save> exemption in /system/etc/sysconfig/google.xml for core device features to function.", e2);
                    }
                } catch (SecurityException e3) {
                    Log.e("GmsReceiverSupport", "com.google.android.gms requires <allow-in-power-save> exemption in /system/etc/sysconfig/google.xml for core device features to function.", e3);
                }
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        if (intent != null && intent.getPackage() == null && intent.getComponent() == null) {
            if ("android.intent.action.DROPBOX_ENTRY_ADDED".equals(intent.getAction())) {
                rru rru = this.f43563b;
                if ("android.intent.action.DROPBOX_ENTRY_ADDED".equals(intent.getAction()) && cdjb.f180967a.mo6606a().mo77661a()) {
                    String stringExtra = intent.getStringExtra("tag");
                    if ((cdjb.f180967a.mo6606a().mo77663c() || !rru.f43560a.contains(stringExtra)) && !rru.f43561b.mo25492a()) {
                        String valueOf = String.valueOf(intent);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                        sb.append("intent throttled: ");
                        sb.append(valueOf);
                        Log.w("GmsReceiverSupport", sb.toString());
                        return;
                    }
                }
            }
            rsc rsc = this.f43562a;
            ArrayList arrayList = new ArrayList();
            Map map = rsc.f43573a;
            if (map != null) {
                for (rsb rsb : map.values()) {
                    int match = rsb.f43570a.match(null, intent, false, "ReceiverRegistry");
                    if (match > 0 && (match & 268435455) > 0) {
                        arrayList.addAll(rsb.f43572c);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                sgl sgl = (sgl) arrayList.get(i2);
                int i3 = sgl.f44417b;
                if (i3 != 0) {
                    i = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? 0 : 6 : 5 : 4 : 3;
                } else {
                    i = 2;
                }
                if (i == 0) {
                    i = 1;
                }
                int i4 = i - 2;
                if (i4 == 1) {
                    arrayList2.add(sgl);
                } else if (i4 == 2 || i4 == 3) {
                    arrayList3.add(sgl);
                } else if (i4 != 4) {
                    String valueOf2 = String.valueOf(sgl.f44416a);
                    throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("Unknown process used for: ") : "Unknown process used for: ".concat(valueOf2));
                } else {
                    arrayList4.add(sgl);
                }
            }
            SparseArray sparseArray = new SparseArray(3);
            rsc.m34325a(sparseArray, 1, arrayList2);
            rsc.m34325a(sparseArray, 2, arrayList3);
            rsc.m34325a(sparseArray, 4, arrayList4);
            m34319a(context, intent, sparseArray, 1);
            m34319a(context, intent, sparseArray, 2);
            m34319a(context, intent, sparseArray, 4);
        }
    }
}
