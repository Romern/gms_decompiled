package p000;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: aygh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aygh extends adzt {
    public aygh(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        if (Log.isLoggable("WearableService", 3)) {
            String valueOf = String.valueOf(message);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append("handleMessage live listener: ");
            sb.append(valueOf);
            Log.d("WearableService", sb.toString());
        }
        ayja ayja = (ayja) message.obj;
        if (message.what == 1) {
            while (true) {
                aygz aygz = (aygz) ayja.f97724c.poll();
                if (aygz != null) {
                    boolean z = false;
                    for (ayiz ayiz : ayja.f97723b.values()) {
                        if (aygz.mo53997a(ayiz.f97717b, ayiz.f97719d, ayiz.f97718c, ayiz.f97720e)) {
                            try {
                                ayja.f97743v.mo53990a(ayja.f97726e.f96377a);
                                aygz.mo53989a(null, ayiz.f97716a);
                                z = true;
                            } catch (RemoteException e) {
                                ayja.f97724c.clear();
                                ayiz.binderDied();
                                z = true;
                            }
                        }
                    }
                    if (!z && Log.isLoggable("WearableService", 2)) {
                        String str = aygz.f97557g;
                        String valueOf2 = String.valueOf(aygz.f97558h.getData());
                        StringBuilder sb2 = new StringBuilder(str.length() + 27 + String.valueOf(valueOf2).length());
                        sb2.append("no live listeners matched ");
                        sb2.append(str);
                        sb2.append(" ");
                        sb2.append(valueOf2);
                        Log.v("WearableService", sb2.toString());
                    }
                    if (Log.isLoggable("WearableService", 3)) {
                        String valueOf3 = String.valueOf(ayja);
                        String valueOf4 = String.valueOf(aygz);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 41 + String.valueOf(valueOf4).length());
                        sb3.append("processEvents live listener: published: ");
                        sb3.append(valueOf3);
                        sb3.append(" ");
                        sb3.append(valueOf4);
                        Log.d("WearableService", sb3.toString());
                    }
                } else {
                    return;
                }
            }
        }
    }
}
