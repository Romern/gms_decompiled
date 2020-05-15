package p000;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: apiz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apiz extends aeaa implements Handler.Callback, IBinder.DeathRecipient, apim {

    /* renamed from: i */
    public static final /* synthetic */ int f84506i = 0;

    /* renamed from: a */
    public final List f84507a = new ArrayList();

    /* renamed from: b */
    public final apja f84508b;

    /* renamed from: c */
    public final int f84509c;

    /* renamed from: d */
    public aali f84510d;

    /* renamed from: e */
    public boolean f84511e = false;

    /* renamed from: f */
    public boolean f84512f = false;

    /* renamed from: g */
    public IBinder f84513g = null;

    /* renamed from: h */
    public final /* synthetic */ apjc f84514h;

    /* renamed from: j */
    private final Messenger f84515j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public apiz(apjc apjc, apja apja, Looper looper, int i) {
        super("scheduler");
        this.f84514h = apjc;
        this.f84508b = apja;
        this.f84509c = i;
        this.f84515j = new Messenger(new adzt(looper, this));
    }

    /* renamed from: a */
    public static final Bundle m70429a(apjb apjb) {
        Bundle bundle = new Bundle();
        apid apid = apjb.f84521b.f84459a;
        bundle.putString("tag", apid.mo47266e());
        bundle.putParcelable("component", apid.mo47268f());
        bundle.putParcelable("extras", apid.f84444n.f63120m);
        if (cedr.m136297e()) {
            bundle.putLong("max_exec_duration", apjb.f84521b.mo47306l());
        }
        if (apid.mo47280q()) {
            bundle.putParcelableArrayList("triggered_uris", new ArrayList(apid.mo47265d()));
        }
        Bundle a = apjb.f84521b.f84466h.mo33978a();
        if (!a.isEmpty()) {
            bundle.putBundle("engine_flags", a);
        }
        return bundle;
    }

    /* renamed from: b */
    public final void mo47331b() {
        synchronized (this.f84514h.f84522a) {
            String valueOf = String.valueOf(this.f84508b.f84518c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER);
            sb.append("Dropping task as app's play services SDK version does not support Android O. Either update the SDK or lower your app's target SDK version. Canceling all tasks for the service: ");
            sb.append(valueOf);
            Log.e("NetworkScheduler.TED", sb.toString());
            aphm aphm = apht.m70315a().f84401a;
            if (aphm != null) {
                apja apja = this.f84508b;
                aphm.mo47219a(aeco.m51640a(apja.f84516a, apja.f84518c));
            }
        }
    }

    public final void binderDied() {
        close();
    }

    /* renamed from: c */
    public final void mo47333c() {
        synchronized (this.f84514h.f84522a) {
            if (this.f84510d != null) {
                for (apjb apjb : this.f84507a) {
                    if (!apjb.f84520a.f91388a.mo50381a()) {
                        try {
                            aali aali = this.f84510d;
                            if (aali != null) {
                                aali.mo16969a(mo47325a(m70429a(apjb), 1));
                            }
                            apjb.f84520a.mo50393b((Object) 1);
                        } catch (RemoteException e) {
                            apjb.f84520a.mo50393b((Object) 2048);
                            onServiceDisconnected(this.f84508b.f84518c);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void close() {
        if (cedr.m136295c()) {
            this.f84514h.f84526e.execute(new apiy(this));
        } else {
            this.f84514h.mo47339a(this);
        }
    }

    /* renamed from: d */
    public final void mo47334d() {
        synchronized (this.f84514h.f84522a) {
            if (this.f84510d != null) {
                this.f84514h.mo47339a(this);
                this.f84510d = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        return false;
     */
    public final boolean handleMessage(Message message) {
        synchronized (this.f84514h.f84522a) {
            apja apja = this.f84508b;
            int i = Build.VERSION.SDK_INT;
            if (message.sendingUid == apja.f84517b && message.what == 3) {
                apjb a = mo47326a(message.getData().getString("tag"));
                if (this.f84507a.isEmpty()) {
                    close();
                }
                if (a == null) {
                    return false;
                }
                a.f84521b.mo47293a(message.arg1);
                return true;
            }
        }
    }

    /* renamed from: a */
    public final Message mo47325a(Bundle bundle, int i) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.replyTo = this.f84515j;
        obtain.setData(bundle);
        return obtain;
    }

    /* renamed from: a */
    public final apjb mo47326a(String str) {
        synchronized (this.f84514h.f84522a) {
            Iterator it = this.f84507a.iterator();
            while (it.hasNext()) {
                apjb apjb = (apjb) it.next();
                if (sdg.m34949a(str, apjb.f84521b.f84459a.mo47266e())) {
                    it.remove();
                    return apjb;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void mo47327a() {
        if (!cedr.m136295c()) {
            mo47331b();
        } else {
            this.f84514h.f84526e.execute(new apix(this));
        }
    }

    /* renamed from: a */
    public final void mo47328a(aali aali) {
        this.f84511e = true;
        this.f84510d = aali;
        if (!this.f84512f || this.f84509c != 3 || !cdnj.f181319a.mo6606a().mo78015s()) {
            mo47333c();
            return;
        }
        Context b = this.f84514h.f84524c.mo17012b(0);
        if (b == null) {
            String valueOf = String.valueOf(this.f84508b.f84518c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("Unable to get context for ");
            sb.append(valueOf);
            Log.e("NetworkScheduler.TED", sb.toString());
            return;
        }
        mo47329a(b);
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        if (!cedr.m136295c()) {
            mo47334d();
        } else {
            this.f84514h.f84526e.execute(new apiw(this));
        }
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        if (!cedr.m136295c()) {
            mo47330a(iBinder);
        } else {
            this.f84514h.f84526e.execute(new apiv(this, iBinder));
        }
    }

    /* renamed from: a */
    public final void mo47329a(Context context) {
        int i = this.f84509c;
        if (i == 1) {
            try {
                this.f84514h.f84527f.mo25689a(context, this);
            } catch (IllegalArgumentException | IllegalStateException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                sb.append("Error while unbinding: ");
                sb.append(valueOf);
                Log.w("NetworkScheduler.TED", sb.toString());
            }
        } else if (i == 2) {
            try {
                context.unbindService(this);
            } catch (IllegalArgumentException | IllegalStateException e2) {
                String valueOf2 = String.valueOf(e2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 23);
                sb2.append("Error while unbinding: ");
                sb2.append(valueOf2);
                Log.w("NetworkScheduler.TED", sb2.toString());
            }
        } else if (i != 3) {
            StringBuilder sb3 = new StringBuilder(42);
            sb3.append("Unexpected execution strategy: ");
            sb3.append(i);
            Log.e("NetworkScheduler.TED", sb3.toString());
        } else {
            IBinder iBinder = this.f84513g;
            if (iBinder != null) {
                try {
                    iBinder.unlinkToDeath(this, 0);
                } catch (NoSuchElementException e3) {
                    Log.e("NetworkScheduler.TED", "Binder unlinkToDeath failed", e3);
                }
            }
            aali aali = this.f84510d;
            if (aali == null) {
                Log.w("NetworkScheduler.TED", "Couldn't unbind from the task service in remote user");
                return;
            }
            try {
                aali.mo16968a();
            } catch (RemoteException e4) {
                String valueOf3 = String.valueOf(e4);
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 40);
                sb4.append("Failed to close remote binder connection");
                sb4.append(valueOf3);
                Log.e("NetworkScheduler.TED", sb4.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo47330a(IBinder iBinder) {
        synchronized (this.f84514h.f84522a) {
            if (apil.m70420a(iBinder)) {
                mo47328a((aali) new aalh(iBinder, this));
            } else {
                mo47327a();
            }
        }
    }
}
