package p000;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Point;
import android.os.RemoteException;
import android.view.inputmethod.EditorInfo;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;

/* renamed from: ntn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ntn implements nln {

    /* renamed from: a */
    public static final bnsn f36435a = odk.m28481a("CAR.IME");

    /* renamed from: b */
    public obs f36436b;

    /* renamed from: c */
    private final nip f36437c;

    /* renamed from: d */
    private final ComponentName f36438d;

    /* renamed from: e */
    private final Intent f36439e;

    /* renamed from: f */
    private boolean f36440f;

    /* renamed from: g */
    private int f36441g = 0;

    /* renamed from: h */
    private boolean f36442h;

    /* renamed from: i */
    private boolean f36443i;

    /* renamed from: j */
    private nij f36444j;

    /* renamed from: k */
    private nij f36445k;

    /* renamed from: l */
    private EditorInfo f36446l;

    /* renamed from: m */
    private final skh f36447m;

    /* renamed from: n */
    private final ServiceConnection f36448n = new ntm(this, "car");

    /* renamed from: o */
    private obu f36449o;

    public ntn(nip nip, ComponentName componentName, skh skh, Point point) {
        this.f36437c = nip;
        this.f36438d = componentName;
        this.f36447m = skh;
        Intent intent = new Intent("com.google.android.gms.car.BIND_CAR_INPUT");
        this.f36439e = intent;
        intent.setComponent(componentName);
        if (point != null) {
            this.f36439e.putExtra("touchpad_width", point.x);
            this.f36439e.putExtra("touchpad_height", point.y);
        }
    }

    /* renamed from: b */
    private final void m27656b(obu obu, EditorInfo editorInfo, nij nij) {
        nij nij2 = this.f36444j;
        if (!(nij2 == null || nij2 == nij)) {
            nij2.mo20783i();
        }
        try {
            this.f36436b.mo21952a(obu, editorInfo);
        } catch (RemoteException e) {
            bnsi b = f36435a.mo68387b();
            b.mo68437a(e);
            b.mo68432a("ntn", "b", 188, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("startInput() failed");
        }
        this.f36444j = nij;
    }

    /* renamed from: f */
    private final void m27657f() {
        if (this.f36442h) {
            int i = this.f36441g;
            if (i == 0) {
                return;
            }
            if (i == 1) {
                this.f36441g = 2;
            } else if (i != 2) {
                this.f36441g = 2;
                m27658g();
                this.f36437c.mo20824c(this.f36438d);
            }
        } else {
            if (this.f36441g == 3) {
                m27658g();
            }
            this.f36441g = 0;
            this.f36443i = false;
            if (this.f36440f) {
                this.f36447m.mo25689a(this.f36437c.mo20797a(), this.f36448n);
                this.f36440f = false;
            }
        }
    }

    /* renamed from: g */
    private final void m27658g() {
        nij nij = this.f36444j;
        if (nij != null) {
            nij.mo20783i();
            this.f36444j = null;
        }
        obs obs = this.f36436b;
        if (obs != null) {
            try {
                obs.mo21951a();
            } catch (RemoteException e) {
                bnsi b = f36435a.mo68387b();
                b.mo68437a(e);
                b.mo68432a("ntn", "g", 282, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("stopInput() failed");
            }
        }
    }

    /* renamed from: a */
    public final void mo21047a() {
        bnsi d = f36435a.mo68390d();
        d.mo68432a("ntn", "a", 289, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Resetting input manager");
        int i = this.f36441g;
        if (!(i == 0 || i == 2)) {
            m27658g();
        }
        this.f36442h = true;
        this.f36443i = false;
        this.f36441g = 0;
        nij nij = this.f36445k;
        if (nij != null) {
            nij.mo20783i();
            this.f36446l = null;
            this.f36445k = null;
            this.f36449o = null;
        }
        this.f36437c.mo20824c(this.f36438d);
        if (this.f36440f) {
            this.f36447m.mo25689a(this.f36437c.mo20797a(), this.f36448n);
            this.f36440f = false;
        }
    }

    /* renamed from: b */
    public final boolean mo21052b() {
        return this.f36441g == 3;
    }

    /* renamed from: c */
    public final void mo21053c() {
        if (!this.f36443i) {
            nij nij = this.f36445k;
            EditorInfo editorInfo = this.f36446l;
            obu obu = this.f36449o;
            this.f36446l = null;
            this.f36445k = null;
            this.f36449o = null;
            int i = this.f36441g;
            if (i == 3 || i == 0) {
                bnsi b = f36435a.mo68387b();
                b.mo68432a("ntn", "c", (int) MfiClientException.TYPE_ILLEGAL_CARD_OPERATION, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("IME unexpectedly resumed");
                mo21047a();
            } else if (i == 1) {
                this.f36441g = 3;
                if (obu != null) {
                    m27656b(obu, editorInfo, nij);
                }
            } else {
                m27658g();
                if (nij != null) {
                    nij.mo20783i();
                }
                this.f36437c.mo20824c(this.f36438d);
            }
        } else {
            this.f36443i = false;
        }
    }

    /* renamed from: d */
    public final void mo21054d() {
        if (this.f36442h) {
            int i = this.f36441g;
            if (i == 3 || i == 0) {
                bnsi b = f36435a.mo68387b();
                b.mo68432a("ntn", "d", 258, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("IME unexpectedly stopped");
                mo21047a();
            } else if (i != 1) {
                this.f36441g = 0;
                this.f36447m.mo25689a(this.f36437c.mo20797a(), this.f36448n);
                this.f36440f = false;
            } else {
                mo21564e();
            }
        }
    }

    /* renamed from: e */
    public final void mo21564e() {
        m27656b(this.f36449o, this.f36446l, this.f36445k);
        this.f36449o = null;
        this.f36446l = null;
        this.f36445k = null;
        Intent intent = new Intent();
        intent.setComponent(this.f36438d);
        if (!this.f36437c.mo20816a(intent)) {
            bnsi b = f36435a.mo68387b();
            b.mo68432a("ntn", "e", 203, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Failed to start IME");
            mo21047a();
        }
    }

    public final String toString() {
        return "LegacyCarImeManagerImpl " + Integer.toHexString(System.identityHashCode(this)) + "{mImeState=" + this.f36441g + ", mInputService=" + this.f36436b + ", mCurrentImeActivityManager=" + this.f36444j + ", mPendingImeActivityManager=" + this.f36445k + "}";
    }

    /* renamed from: b */
    public final void mo21051b(nij nij) {
        if (!this.f36442h) {
            return;
        }
        if (this.f36444j == nij || this.f36445k == nij) {
            m27657f();
        }
    }

    /* renamed from: a */
    public final void mo21048a(nij nij) {
        if (nij == null) {
            bnsi c = f36435a.mo68388c();
            c.mo68432a("ntn", "a", (int) BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("stopInput passed null argument");
        } else if (nij == this.f36444j || nij == this.f36445k || nij.f35707d.equals(this.f36438d)) {
            m27657f();
        } else {
            bnsi b = f36435a.mo68387b();
            b.mo68432a("ntn", "a", (int) BaseMfiEventCallback.TYPE_OPSRV_REQUIRED_LIB_UNAVAILABLE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Can't stop input, this client didn't request input in the first place.");
        }
    }

    /* renamed from: a */
    public final void mo21049a(obu obu, EditorInfo editorInfo, nij nij) {
        if (this.f36442h) {
            int i = this.f36441g;
            if (i == 0) {
                boolean a = this.f36447m.mo25690a(this.f36437c.mo20797a(), this.f36439e, this.f36448n, 65);
                this.f36440f = a;
                if (!a) {
                    bnsi b = f36435a.mo68387b();
                    b.mo68432a("ntn", "a", 124, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68405a("Could not bind to IME service");
                    mo21047a();
                    return;
                }
            } else if (!(i == 1 || i == 2)) {
                m27656b(obu, editorInfo, nij);
                return;
            }
            nij nij2 = this.f36445k;
            if (!(nij2 == null || nij2 == nij)) {
                nij2.mo20783i();
            }
            this.f36445k = nij;
            this.f36449o = obu;
            this.f36446l = editorInfo;
            this.f36441g = 1;
        }
    }

    /* renamed from: a */
    public final void mo21050a(boolean z) {
        this.f36442h = z;
        if (mo21052b() && !z) {
            this.f36443i = true;
        }
    }
}
