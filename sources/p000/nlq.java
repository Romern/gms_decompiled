package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.view.inputmethod.EditorInfo;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;

/* renamed from: nlq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nlq implements nln {

    /* renamed from: a */
    public static final bnsn f35955a = odk.m28481a("CAR.IME");

    /* renamed from: b */
    public final Handler f35956b = new adzt(Looper.getMainLooper());

    /* renamed from: c */
    public int f35957c = 0;

    /* renamed from: d */
    public EditorInfo f35958d;

    /* renamed from: e */
    public nij f35959e;

    /* renamed from: f */
    public final obt f35960f;

    /* renamed from: g */
    public obs f35961g;

    /* renamed from: h */
    public obu f35962h;

    /* renamed from: i */
    private final Context f35963i;

    /* renamed from: j */
    private final Intent f35964j;

    /* renamed from: k */
    private boolean f35965k;

    /* renamed from: l */
    private nij f35966l;

    /* renamed from: m */
    private final skh f35967m;

    /* renamed from: n */
    private final ServiceConnection f35968n = new nlo(this, "car");

    public nlq(Context context, ComponentName componentName, skh skh, Point point) {
        this.f35963i = context;
        this.f35967m = skh;
        Intent intent = new Intent("com.google.android.gms.car.BIND_CAR_INPUT");
        this.f35964j = intent;
        intent.setComponent(componentName);
        if (point != null) {
            this.f35964j.putExtra("touchpad_width", point.x);
            this.f35964j.putExtra("touchpad_height", point.y);
        }
        this.f35960f = new obt(this);
    }

    /* renamed from: a */
    public final void mo21047a() {
        bnsi d = f35955a.mo68390d();
        d.mo68432a("nlq", "a", 257, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Resetting input manager");
        mo21058e();
    }

    /* renamed from: b */
    public final void mo21051b(nij nij) {
        if (!this.f35965k) {
            return;
        }
        if (this.f35966l == nij || this.f35959e == nij) {
            mo21048a(nij);
        }
    }

    /* renamed from: b */
    public final boolean mo21052b() {
        return this.f35957c == 2;
    }

    /* renamed from: c */
    public final void mo21053c() {
    }

    /* renamed from: d */
    public final void mo21054d() {
    }

    /* renamed from: e */
    public final void mo21058e() {
        int i = this.f35957c;
        if (i != 0) {
            if (i == 2) {
                this.f35966l.mo20783i();
            }
            this.f35966l = null;
            if (this.f35957c == 1) {
                this.f35959e.mo20783i();
            }
            mo21059f();
            obs obs = this.f35961g;
            if (obs != null) {
                try {
                    obs.mo21951a();
                } catch (RemoteException e) {
                    bnsi b = f35955a.mo68387b();
                    b.mo68437a(e);
                    b.mo68432a("nlq", "e", 247, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68405a("Failed to notify input service of stop");
                }
            }
            this.f35961g = null;
            this.f35967m.mo25689a(this.f35963i, this.f35968n);
            this.f35957c = 0;
        }
    }

    /* renamed from: f */
    public final void mo21059f() {
        this.f35962h = null;
        this.f35958d = null;
        this.f35959e = null;
    }

    public final String toString() {
        return "CarImeManagerImpl " + Integer.toHexString(System.identityHashCode(this)) + "{mImeState=" + this.f35957c + ", mInputService=" + this.f35961g + ", mCurrentClient=" + this.f35966l + ", mPendingClient=" + this.f35959e + "}";
    }

    /* renamed from: a */
    public final void mo21056a(String str, RemoteException remoteException) {
        bnsi b = f35955a.mo68387b();
        b.mo68437a(remoteException);
        b.mo68432a("nlq", "a", (int) BaseMfiEventCallback.TYPE_EXPIRED_MFI, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b.mo68420a("%s", str);
        this.f35961g = null;
        mo21058e();
    }

    /* renamed from: b */
    public final void mo21057b(obu obu, EditorInfo editorInfo, nij nij) {
        nij nij2 = this.f35966l;
        if (!(nij2 == null || nij2 == nij)) {
            nij2.mo20783i();
        }
        this.f35966l = nij;
        this.f35961g.mo21952a(obu, editorInfo);
    }

    /* renamed from: a */
    public final void mo21048a(nij nij) {
        if (this.f35966l == nij || this.f35959e == nij) {
            mo21058e();
            return;
        }
        bnsi b = f35955a.mo68387b();
        b.mo68432a("nlq", "a", 226, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b.mo68405a("Client requested to stop input without starting input first.");
    }

    /* renamed from: a */
    public final void mo21049a(obu obu, EditorInfo editorInfo, nij nij) {
        if (this.f35965k) {
            this.f35956b.removeCallbacksAndMessages(null);
            int i = this.f35957c;
            if (i == 2) {
                try {
                    mo21057b(obu, editorInfo, nij);
                } catch (RemoteException e) {
                    mo21056a("Failed to notify input service of start", e);
                }
            } else if (i != 0 || this.f35967m.mo25690a(this.f35963i, this.f35964j, this.f35968n, 65)) {
                nij nij2 = this.f35959e;
                if (!(nij2 == null || nij2 == nij)) {
                    nij2.mo20783i();
                }
                this.f35962h = obu;
                this.f35958d = editorInfo;
                this.f35959e = nij;
                this.f35957c = 1;
            } else {
                bnsi b = f35955a.mo68387b();
                b.mo68432a("nlq", "a", 180, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Could not bind to input service");
                nij.mo20783i();
            }
        }
    }

    /* renamed from: a */
    public final void mo21050a(boolean z) {
        if (ccuc.f179928a.mo6606a().mo76783a() && !z) {
            mo21058e();
        }
        this.f35965k = z;
    }
}
