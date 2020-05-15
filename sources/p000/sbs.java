package p000;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* renamed from: sbs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sbs implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ sbq f44036a;

    public sbs(sbq sbq) {
        this.f44036a = sbq;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f44036a.f44023a) {
                sbp sbp = (sbp) message.obj;
                sbr sbr = (sbr) this.f44036a.f44023a.get(sbp);
                if (sbr != null && sbr.mo25360a()) {
                    if (sbr.f44031c) {
                        sbr.f44035g.f44025c.removeMessages(1, sbr.f44033e);
                        sbq sbq = sbr.f44035g;
                        sbq.f44026d.mo25689a(sbq.f44024b, sbr);
                        sbr.f44031c = false;
                        sbr.f44030b = 2;
                    }
                    this.f44036a.f44023a.remove(sbp);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f44036a.f44023a) {
                sbp sbp2 = (sbp) message.obj;
                sbr sbr2 = (sbr) this.f44036a.f44023a.get(sbp2);
                if (sbr2 != null && sbr2.f44030b == 3) {
                    String valueOf = String.valueOf(sbp2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = sbr2.f44034f;
                    if (componentName == null) {
                        componentName = sbp2.f44018c;
                    }
                    if (componentName == null) {
                        String str = sbp2.f44017b;
                        sdo.m34959a((Object) str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    sbr2.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }
}
