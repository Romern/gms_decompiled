package p000;

import android.content.Context;
import com.google.android.gms.mdm.LockscreenChimeraActivity;
import com.google.android.gms.mdm.LockscreenChimeraActivityPermissionTrampoline;
import com.google.android.gms.mdm.receivers.GoogleAccountsAddedChimeraReceiver;
import com.google.android.gms.mdm.receivers.MdmDeviceAdminChimeraReceiver;
import com.google.android.gms.mdm.receivers.RetryAfterAlarmChimeraReceiver;
import com.google.android.gms.mdm.services.DeviceManagerApiChimeraService;
import com.google.android.gms.mdm.services.GcmReceiverChimeraService;
import com.google.android.gms.mdm.services.LockscreenMessageChimeraService;
import com.google.android.gms.mdm.services.MdmPhoneWearableListenerChimeraService;
import com.google.android.gms.mdm.services.RingChimeraService;
import java.util.ArrayList;

/* renamed from: afyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afyt {

    /* renamed from: a */
    static final Class[] f64984a = {LockscreenChimeraActivity.class, LockscreenChimeraActivityPermissionTrampoline.class, MdmDeviceAdminChimeraReceiver.class, RetryAfterAlarmChimeraReceiver.class, DeviceManagerApiChimeraService.class, GcmReceiverChimeraService.class, LockscreenMessageChimeraService.class, MdmPhoneWearableListenerChimeraService.class, RingChimeraService.class};

    /* renamed from: a */
    public static void m53683a(Context context) {
        Class[] clsArr = f64984a;
        ArrayList arrayList = new ArrayList();
        for (Class cls : clsArr) {
            boolean z = true;
            if (sre.m36080a(context) && !arrayList.contains(cls)) {
                z = false;
            }
            spn.m35856a(context, cls.getCanonicalName().replace("Chimera", ""), z);
        }
        if (!sre.m36080a(context)) {
            int i = eoa.f15378a;
            GoogleAccountsAddedChimeraReceiver.m67197b();
        }
    }
}
