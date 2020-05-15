package p000;

import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.Future;

/* renamed from: aeay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aeay extends adzt {

    /* renamed from: a */
    final /* synthetic */ aebc f63020a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aeay(aebc aebc, Looper looper) {
        super(looper);
        this.f63020a = aebc;
    }

    public final void handleMessage(Message message) {
        Messenger messenger;
        String string;
        StackTraceElement[] stackTraceElementArr;
        bqgg bqgg;
        int i = message.what;
        if (i == 1) {
            Bundle data = message.getData();
            if (!data.isEmpty() && (messenger = message.replyTo) != null && (string = data.getString("tag")) != null) {
                ArrayList parcelableArrayList = data.getParcelableArrayList("triggered_uris");
                data.getLong("max_exec_duration", 180);
                if (!this.f63020a.mo34000a(string)) {
                    this.f63020a.mo33999a(new aebb(this.f63020a, string, messenger, data.getBundle("extras"), parcelableArrayList, aeaf.m51513a(data.getBundle("engine_flags"))));
                }
            }
        } else if (i == 2) {
            Bundle data2 = message.getData();
            if (!data2.isEmpty()) {
                String string2 = data2.getString("tag");
                if (string2 == null) {
                    String valueOf = String.valueOf(message);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
                    sb.append("Empty tag: ");
                    sb.append(valueOf);
                    Log.w("GmsTaskChimeraService", sb.toString());
                    return;
                }
                if (cdnj.m134210f() && message.arg1 == aecb.m51624a(3)) {
                    aebc aebc = this.f63020a;
                    synchronized (aebc.f63042j) {
                        Thread thread = (Thread) aebc.f63042j.get(string2);
                        if (thread != null) {
                            stackTraceElementArr = thread.getStackTrace();
                        } else {
                            stackTraceElementArr = null;
                        }
                    }
                    if (stackTraceElementArr == null) {
                        Class<?> cls = aebc.mo34003c().getClass();
                        bqgg = ((aecg) aebc.f63044l.mo6606a()).mo34033a(aebc, cls, string2, new StackTraceElement[]{new StackTraceElement(cls.getName(), "onRunAsync", cls.getName(), 0)});
                    } else {
                        bqgg = ((aecg) aebc.f63044l.mo6606a()).mo34033a(aebc, aebc.mo34003c().getClass(), string2, stackTraceElementArr);
                    }
                    bqga.m112781a(bqgg, new aeax(), bqfb.INSTANCE);
                }
                if (((Boolean) this.f63020a.f63041i.mo6606a()).booleanValue()) {
                    synchronized (this.f63020a.f63043k) {
                        Future future = (Future) this.f63020a.f63043k.get(string2);
                        if (future != null) {
                            String valueOf2 = String.valueOf(message);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 29);
                            sb2.append("Interrupting timed out task: ");
                            sb2.append(valueOf2);
                            Log.w("GmsTaskChimeraService", sb2.toString());
                            future.cancel(true);
                        }
                    }
                }
            }
        } else if (i != 4) {
            String valueOf3 = String.valueOf(message);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 31);
            sb3.append("Unrecognized message received: ");
            sb3.append(valueOf3);
            Log.e("GmsTaskChimeraService", sb3.toString());
        } else {
            this.f63020a.mo34001b();
        }
    }
}
