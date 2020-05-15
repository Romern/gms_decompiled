package p000;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: aalr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aalr {

    /* renamed from: a */
    public final int f28412a;

    /* renamed from: b */
    public final boolean f28413b;

    /* renamed from: c */
    public final aamh f28414c;

    /* renamed from: d */
    public final Bundle f28415d;

    /* renamed from: e */
    public final Messenger f28416e;

    /* renamed from: f */
    private final int f28417f;

    public aalr(Message message, int i) {
        Bundle data = message.getData();
        this.f28412a = message.what;
        this.f28413b = data.getBoolean("oneWay", false);
        this.f28414c = aamh.m21513a(data.getString("pkg"), i);
        this.f28417f = message.arg1;
        this.f28415d = data.getBundle("data");
        this.f28416e = message.replyTo;
    }

    /* renamed from: a */
    public final void mo16977a(Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = this.f28412a;
        obtain.arg1 = this.f28417f;
        obtain.setData(bundle);
        try {
            this.f28416e.send(obtain);
        } catch (RemoteException e) {
            int i = this.f28417f;
            StringBuilder sb = new StringBuilder(47);
            sb.append("Failed sending response to request: ");
            sb.append(i);
            Log.w("GCM", sb.toString());
        }
    }
}
