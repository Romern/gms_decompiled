package p000;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: alj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class alj extends Service {

    /* renamed from: a */
    public final ArrayList f830a = new ArrayList();

    /* renamed from: b */
    final alg f831b = new alg(this);

    /* renamed from: c */
    akz f832c;

    /* renamed from: d */
    public akp f833d;

    /* renamed from: e */
    private final ali f834e = new ali(this);

    /* renamed from: f */
    private final Messenger f835f = new Messenger(this.f834e);

    /* renamed from: g */
    private final alh f836g = new alh(this);

    /* renamed from: a */
    static Bundle m1006a(alb alb, int i) {
        if (alb == null) {
            return null;
        }
        ala ala = new ala(alb);
        ala.f812a = null;
        for (ako ako : alb.f815b) {
            if (i >= ako.mo915t() && i <= ako.mo917u()) {
                ala.mo954a(ako);
            }
        }
        alb a = ala.mo953a();
        Bundle bundle = a.f814a;
        if (bundle != null) {
            return bundle;
        }
        a.f814a = new Bundle();
        List list = a.f815b;
        if (list != null && !list.isEmpty()) {
            int size = a.f815b.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((ako) a.f815b.get(i2)).f779a);
            }
            a.f814a.putParcelableArrayList("routes", arrayList);
        }
        a.f814a.putBoolean("supportsDynamicGroupRoute", a.f816c);
        return a.f814a;
    }

    /* renamed from: c */
    static String m1009c(Messenger messenger) {
        return "Client connection " + messenger.getBinder().toString();
    }

    /* renamed from: a */
    public abstract akz mo966a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo968b(Messenger messenger) {
        int size = this.f830a.size();
        for (int i = 0; i < size; i++) {
            if (((alf) this.f830a.get(i)).f821a.getBinder() == messenger.getBinder()) {
                return i;
            }
        }
        return -1;
    }

    public final IBinder onBind(Intent intent) {
        akz a;
        if (!intent.getAction().equals("android.media.MediaRouteProviderService")) {
            return null;
        }
        if (this.f832c == null && (a = mo966a()) != null) {
            String a2 = a.f803b.mo936a();
            if (a2.equals(getPackageName())) {
                this.f832c = a;
                a.mo948a(this.f836g);
            } else {
                throw new IllegalStateException("onCreateMediaRouteProvider() returned a provider whose package name does not match the package name of the service.  A media route provider service can only export its own media route providers.  Provider package name: " + a2 + ".  Service package name: " + getPackageName() + ".");
            }
        }
        if (this.f832c != null) {
            return this.f835f.getBinder();
        }
        return null;
    }

    public final boolean onUnbind(Intent intent) {
        akz akz = this.f832c;
        if (akz != null) {
            akz.mo948a((akq) null);
        }
        return super.onUnbind(intent);
    }

    /* renamed from: a */
    public static void m1007a(Messenger messenger, int i) {
        if (i != 0) {
            m1008a(messenger, 1, i, 0, null, null);
        }
    }

    /* renamed from: a */
    static void m1008a(Messenger messenger, int i, int i2, int i3, Object obj, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = i2;
        obtain.arg2 = i3;
        obtain.obj = obj;
        obtain.setData(bundle);
        try {
            messenger.send(obtain);
        } catch (DeadObjectException e) {
        } catch (RemoteException e2) {
            Log.e("MediaRouteProviderSrv", "Could not send message to " + m1009c(messenger), e2);
        }
    }

    /* renamed from: a */
    public final alf mo967a(Messenger messenger) {
        int b = mo968b(messenger);
        if (b >= 0) {
            return (alf) this.f830a.get(b);
        }
        return null;
    }
}
