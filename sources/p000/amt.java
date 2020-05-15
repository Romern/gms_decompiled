package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: amt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amt extends akz implements ServiceConnection {

    /* renamed from: i */
    public final ComponentName f937i;

    /* renamed from: j */
    final amo f938j;

    /* renamed from: k */
    public final ArrayList f939k = new ArrayList();

    /* renamed from: l */
    public boolean f940l;

    /* renamed from: m */
    public amm f941m;

    /* renamed from: n */
    public boolean f942n;

    /* renamed from: o */
    private boolean f943o;

    public amt(Context context, ComponentName componentName) {
        super(context, new akx(componentName));
        this.f937i = componentName;
        this.f938j = new amo();
    }

    /* renamed from: b */
    private final aky m1120b(String str, String str2) {
        alb alb = this.f808g;
        if (alb == null) {
            return null;
        }
        List list = alb.f815b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((ako) list.get(i)).mo896a().equals(str)) {
                ams ams = new ams(this, str, str2);
                this.f939k.add(ams);
                if (this.f942n) {
                    ams.mo1044a(this.f941m);
                }
                mo1051b();
                return ams;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final aky mo945a(String str) {
        if (str != null) {
            return m1120b(str, null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    /* renamed from: c */
    public final boolean mo1052c() {
        if (this.f940l) {
            return this.f806e != null || !this.f939k.isEmpty();
        }
        return false;
    }

    /* renamed from: d */
    public final void mo1053d() {
        if (!this.f943o) {
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.f937i);
            try {
                this.f943o = this.f802a.bindService(intent, this, 1);
            } catch (SecurityException e) {
            }
        }
    }

    /* renamed from: e */
    public final void mo1054e() {
        if (this.f943o) {
            this.f943o = false;
            mo1055f();
            try {
                this.f802a.unbindService(this);
            } catch (IllegalArgumentException e) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e);
            }
        }
    }

    /* renamed from: f */
    public final void mo1055f() {
        if (this.f941m != null) {
            mo949a((alb) null);
            this.f942n = false;
            int size = this.f939k.size();
            for (int i = 0; i < size; i++) {
                ((amn) this.f939k.get(i)).mo1046g();
            }
            amm amm = this.f941m;
            amm.mo1038a(2, 0, 0, null, null);
            amm.f910b.f918a.clear();
            amm.f909a.getBinder().unlinkToDeath(amm, 0);
            amm.f916h.f938j.post(new amk(amm));
            this.f941m = null;
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Messenger messenger;
        if (this.f943o) {
            mo1055f();
            if (iBinder != null) {
                messenger = new Messenger(iBinder);
            } else {
                messenger = null;
            }
            if (alc.m998a(messenger)) {
                amm amm = new amm(this, messenger);
                int i = amm.f911c;
                amm.f911c = i + 1;
                amm.f914f = i;
                if (amm.mo1038a(1, i, 3, null, null)) {
                    try {
                        amm.f909a.getBinder().linkToDeath(amm, 0);
                        this.f941m = amm;
                    } catch (RemoteException e) {
                        amm.binderDied();
                    }
                }
            } else {
                Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        mo1055f();
    }

    public final String toString() {
        return "Service connection " + this.f937i.flattenToShortString();
    }

    /* renamed from: a */
    public final aky mo946a(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        } else if (str2 != null) {
            return m1120b(str, str2);
        } else {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
    }

    /* renamed from: a */
    public final void mo1048a() {
        if (!this.f940l) {
            this.f940l = true;
            mo1051b();
        }
    }

    /* renamed from: b */
    public final akv mo950b(String str) {
        if (str != null) {
            alb alb = this.f808g;
            amr amr = null;
            if (alb != null) {
                List list = alb.f815b;
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    } else if (((ako) list.get(i)).mo896a().equals(str)) {
                        amr = new amr(this, str);
                        this.f939k.add(amr);
                        if (this.f942n) {
                            amr.mo1044a(this.f941m);
                        }
                        mo1051b();
                    } else {
                        i++;
                    }
                }
            }
            return amr;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1049a(amm amm, alb alb) {
        if (this.f941m == amm) {
            mo949a(alb);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1050a(amn amn) {
        this.f939k.remove(amn);
        amn.mo1046g();
        mo1051b();
    }

    /* renamed from: b */
    public final void mo1051b() {
        if (mo1052c()) {
            mo1053d();
        } else {
            mo1054e();
        }
    }

    /* renamed from: b */
    public final void mo951b(akp akp) {
        if (this.f942n) {
            this.f941m.mo1037a(akp);
        }
        mo1051b();
    }
}
