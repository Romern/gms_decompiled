package p000;

import com.android.volley.RequestQueue;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.service.CastRemoteControlNotificationChimeraService;
import com.google.android.gms.common.Feature;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: pxh */
public final /* synthetic */ class pxh implements Runnable {

    /* renamed from: a */
    private final CastRemoteControlNotificationChimeraService f40565a;

    /* renamed from: b */
    private final String f40566b;

    /* renamed from: c */
    private final boolean f40567c;

    public pxh(CastRemoteControlNotificationChimeraService castRemoteControlNotificationChimeraService, String str, boolean z) {
        this.f40565a = castRemoteControlNotificationChimeraService;
        this.f40566b = str;
        this.f40567c = z;
    }

    public final void run() {
        CastDevice castDevice;
        CastRemoteControlNotificationChimeraService castRemoteControlNotificationChimeraService = this.f40565a;
        String str = this.f40566b;
        boolean z = this.f40567c;
        if (castRemoteControlNotificationChimeraService.f29913g && (castDevice = (CastDevice) castRemoteControlNotificationChimeraService.f29912f.f40525g.get(str)) != null) {
            if (z && !castRemoteControlNotificationChimeraService.f29909c) {
                CastRemoteControlNotificationChimeraService.f29907a.mo23856a("RCN is disabled on primary device for device: %s", str);
                castRemoteControlNotificationChimeraService.f29912f.mo23780a(str, false, bpfe.REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_SENDER_BECAME_PRIMARY);
                return;
            }
            pjs a = castRemoteControlNotificationChimeraService.f29912f.mo23779a(str);
            if (!(a == null || a.f39381i == z)) {
                a.f39381i = z;
                a.mo23281c();
            }
            int i = castDevice.f29724l;
            if (i == 0) {
                i = (int) cday.m132439c();
            }
            if (z || i != 2) {
                if (a != null) {
                    if (a.f39375c.equals(castDevice)) {
                        CastRemoteControlNotificationChimeraService.f29907a.mo23856a("Already connected to device: %s", castDevice);
                        return;
                    } else {
                        CastRemoteControlNotificationChimeraService.f29907a.mo23856a("Removing the existing controller and creating a new one for %s because the device is updated.", castDevice);
                        castRemoteControlNotificationChimeraService.f29912f.mo23780a(str, false, bpfe.REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_UNKNOWN);
                    }
                }
                RequestQueue requestQueue = rpr.m34216b().getRequestQueue();
                CastRemoteControlNotificationChimeraService.f29907a.mo23856a("Connecting to device: %s", castDevice);
                pwr pwr = castRemoteControlNotificationChimeraService.f29912f;
                CastDevice castDevice2 = (CastDevice) pwr.f40525g.get(str);
                String str2 = (String) pwr.f40526h.get(str);
                int incrementAndGet = pwr.f40518a.incrementAndGet();
                pjs pjs = new pjs(pwr.f40520b, pwr.f40522d, new pwq(pwr.f40521c, castDevice2, incrementAndGet), castDevice2, requestQueue, incrementAndGet, z, str2);
                pwr.f40524f.put(str, pjs);
                pzz pzz = pwr.f40522d;
                int i2 = pjs.f39376d;
                Set<String> stringSet = pzz.f40767a.getStringSet("googlecast-RCNIds", Collections.emptySet());
                HashSet hashSet = new HashSet(stringSet.size());
                hashSet.addAll(stringSet);
                hashSet.add(Integer.toString(i2));
                pzz.f40767a.edit().putStringSet("googlecast-RCNIds", hashSet).apply();
                pzz.f40773g.mo23856a("Added RCN ID: %d", Integer.valueOf(i2));
                pxi pxi = new pxi(castRemoteControlNotificationChimeraService, str);
                if (pjs.f39380h != null) {
                    pjs.f39388p = pxi;
                    pjs.f39373a.mo23856a("Connecting api client for device %s", pjs.f39375c);
                    pep pep = pjs.f39380h;
                    pfv pfv = (pfv) pep;
                    rjx rjx = (rjx) pep;
                    rod a2 = rjx.mo24714a(pfv.f39052b, "castDeviceControllerListenerKey");
                    rom a3 = ron.m34179a();
                    pfb pfb = new pfb(pfv);
                    roo roo = pff.f39024a;
                    a3.f43445c = a2;
                    a3.f43443a = pfb;
                    a3.f43444b = roo;
                    a3.f43446d = new Feature[]{pfa.f39009b};
                    rjx.mo24700a(a3.mo24973a());
                    return;
                }
                return;
            }
            CastRemoteControlNotificationChimeraService.f29907a.mo23856a("RCN is disabled for this device: %s.", str);
            castRemoteControlNotificationChimeraService.f29912f.mo23780a(str, false, bpfe.REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_RECEIVER_PRIVATE_MODE);
        }
    }
}
