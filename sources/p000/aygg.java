package p000;

import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.wearable.service.WearableChimeraService;
import java.util.List;

/* renamed from: aygg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aygg extends adzt {

    /* renamed from: a */
    public volatile boolean f97521a = false;

    /* renamed from: b */
    public final /* synthetic */ WearableChimeraService f97522b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aygg(WearableChimeraService wearableChimeraService, Looper looper) {
        super(looper);
        this.f97522b = wearableChimeraService;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0159  */
    /* renamed from: a */
    private final void m83956a(aygk aygk, boolean z) {
        if (aygk.mo54008a() == null) {
            if (Log.isLoggable("WearableService", 2)) {
                String valueOf = String.valueOf(aygk);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
                sb.append("processEvents: skipping empty service queue: ");
                sb.append(valueOf);
                Log.v("WearableService", sb.toString());
            }
            if (!z) {
                sendMessageDelayed(mo54002a(aygk, 4), chnj.m149040p());
            } else {
                aygk.mo54009a(this.f97522b);
            }
        } else {
            int i = 1;
            if (aygk.f97536f == null) {
                if (!aygk.f97537g) {
                    if (this.f97522b.mo60323a(aygk.f97532b) != null) {
                        try {
                            if (Log.isLoggable("WearableService", 2)) {
                                String valueOf2 = String.valueOf(aygk.f97533c);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 18);
                                sb2.append("bind: binding to: ");
                                sb2.append(valueOf2);
                                Log.v("WearableService", sb2.toString());
                            }
                            WearableChimeraService wearableChimeraService = this.f97522b;
                            String str = aygk.f97532b.f96377a;
                            if (aygk.f97535e.f97529g || !sqr.m36000c(wearableChimeraService, str)) {
                                int i2 = Build.VERSION.SDK_INT;
                                if (!chmc.f188772a.mo6606a().mo85346a()) {
                                    i = 1048577;
                                }
                                boolean bindService = wearableChimeraService.bindService(aygk.f97533c, aygk, i);
                                aygk.f97537g = bindService;
                                if (bindService) {
                                    aygk.f97535e.f97529g = false;
                                }
                                if (aygk.f97537g) {
                                    if (Log.isLoggable("WearableService", 3)) {
                                        String valueOf3 = String.valueOf(aygk);
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 15);
                                        sb3.append("bind: started: ");
                                        sb3.append(valueOf3);
                                        Log.d("WearableService", sb3.toString());
                                    }
                                }
                                if (Log.isLoggable("WearableService", 3)) {
                                    String valueOf4 = String.valueOf(aygk);
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 41);
                                    sb4.append("bind: bind failed, app no longer exists: ");
                                    sb4.append(valueOf4);
                                    Log.d("WearableService", sb4.toString());
                                }
                                aygk.mo54009a(this.f97522b);
                            } else {
                                if (Log.isLoggable("WearableService", 3)) {
                                    String valueOf5 = String.valueOf(str);
                                    Log.d("WearableService", valueOf5.length() == 0 ? new String("bindService: not binding to stopped application: ") : "bindService: not binding to stopped application: ".concat(valueOf5));
                                }
                                aygk.f97535e.f97529g = true;
                                aygk.f97537g = false;
                                if (Log.isLoggable("WearableService", 3)) {
                                }
                                aygk.mo54009a(this.f97522b);
                            }
                        } catch (SecurityException e) {
                            String valueOf6 = String.valueOf(aygk);
                            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf6).length() + 38);
                            sb5.append("bind: Permission denied connecting to ");
                            sb5.append(valueOf6);
                            Log.w("WearableService", sb5.toString(), e);
                        }
                    } else if (Log.isLoggable("WearableService", 3)) {
                        Log.d("WearableService", "bind: unrecognized app in package record.");
                    }
                    synchronized (aygk.f97534d) {
                        aygk.f97534d.clear();
                    }
                    aygk.mo54009a(this.f97522b);
                    return;
                }
                if (Log.isLoggable("WearableService", 3)) {
                    String valueOf7 = String.valueOf(aygk);
                    StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf7).length() + 47);
                    sb6.append("processEvents: waiting for service to connect: ");
                    sb6.append(valueOf7);
                    Log.d("WearableService", sb6.toString());
                    return;
                }
                return;
            }
            if (Log.isLoggable("WearableService", 2)) {
                String valueOf8 = String.valueOf(aygk);
                StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf8).length() + 28);
                sb7.append("ServiceRecord.flush: ready: ");
                sb7.append(valueOf8);
                Log.v("WearableService", sb7.toString());
            }
            axrv axrv = aygk.f97536f;
            aygz a = aygk.mo54008a();
            while (a != null) {
                try {
                    WearableChimeraService wearableChimeraService2 = this.f97522b;
                    List list = WearableChimeraService.f110998a;
                    wearableChimeraService2.f111029w.mo53990a(aygk.f97532b.f96377a);
                    a.mo53989a(aygk, axrv);
                    synchronized (aygk.f97534d) {
                        aygz aygz = (aygz) aygk.f97534d.remove();
                    }
                    if (Log.isLoggable("WearableService", 3)) {
                        String valueOf9 = String.valueOf(aygk);
                        String valueOf10 = String.valueOf(a);
                        StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf9).length() + 33 + String.valueOf(valueOf10).length());
                        sb8.append("ServiceRecord.flush: published: ");
                        sb8.append(valueOf9);
                        sb8.append(" ");
                        sb8.append(valueOf10);
                        Log.d("WearableService", sb8.toString());
                    }
                    a = aygk.mo54008a();
                } catch (RemoteException e2) {
                    if (Log.isLoggable("WearableService", 3)) {
                        String valueOf11 = String.valueOf(a);
                        StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf11).length() + 45);
                        sb9.append("publishEvent: Failure from remote exception: ");
                        sb9.append(valueOf11);
                        Log.d("WearableService", sb9.toString(), e2);
                    }
                    aygk.mo54009a(this.f97522b);
                    sendMessageDelayed(mo54002a(aygk, 1), chnj.f188812a.mo6606a().mo85417ap());
                    return;
                }
            }
            sendMessageDelayed(mo54002a(aygk, 4), chnj.m149040p());
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aygg.a(aygk, boolean):void
     arg types: [aygk, int]
     candidates:
      aygg.a(aygk, int):android.os.Message
      adzt.a(android.os.Message, long):void
      aygg.a(aygk, boolean):void */
    public final void handleMessage(Message message) {
        axrv axrv;
        if (Log.isLoggable("WearableService", 3)) {
            String valueOf = String.valueOf(message);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("handleMessage: ");
            sb.append(valueOf);
            Log.d("WearableService", sb.toString());
        }
        int i = Build.VERSION.SDK_INT;
        if (!this.f97521a) {
            aygk aygk = (aygk) message.obj;
            removeMessages(4, aygk);
            if (message.what == 1) {
                removeMessages(1, aygk);
                m83956a(aygk, false);
            } else if (message.what == 2) {
                IBinder binder = message.getData().getBinder("binder");
                if (binder != null) {
                    IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    axrv = queryLocalInterface instanceof axrv ? (axrv) queryLocalInterface : new axrt(binder);
                } else {
                    axrv = null;
                }
                axrv axrv2 = aygk.f97536f;
                if (!(axrv2 == null || binder == axrv2.asBinder())) {
                    String valueOf2 = String.valueOf(aygk);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
                    sb2.append("Service already exists for: ");
                    sb2.append(valueOf2);
                    Log.w("WearableService", sb2.toString());
                }
                aygk.f97536f = axrv;
                m83956a(aygk, false);
            } else if (message.what == 3) {
                if (Log.isLoggable("WearableService", 3)) {
                    String valueOf3 = String.valueOf(aygk);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 28);
                    sb3.append("handleMessage: disconnected ");
                    sb3.append(valueOf3);
                    Log.d("WearableService", sb3.toString());
                }
                if (aygk.mo54008a() != null) {
                    String valueOf4 = String.valueOf(aygk);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 51);
                    sb4.append("Service disconnected before delivering all events: ");
                    sb4.append(valueOf4);
                    Log.w("WearableService", sb4.toString());
                }
                aygk.mo54009a(this.f97522b);
            } else if (message.what == 4) {
                if (Log.isLoggable("WearableService", 3)) {
                    String valueOf5 = String.valueOf(aygk);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 22);
                    sb5.append("handleMessage: unbind ");
                    sb5.append(valueOf5);
                    Log.d("WearableService", sb5.toString());
                }
                m83956a(aygk, true);
            }
        } else if (Log.isLoggable("WearableService", 3)) {
            Log.d("WearableService", "handleMessage: shutdown.");
        }
    }

    /* renamed from: a */
    public final Message mo54002a(aygk aygk, int i) {
        Message obtainMessage = obtainMessage(i);
        obtainMessage.obj = aygk;
        return obtainMessage;
    }
}
