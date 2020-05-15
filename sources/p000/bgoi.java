package p000;

import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: bgoi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgoi implements bugo, bgmz, bugl, bugs {

    /* renamed from: a */
    public List f116915a;

    /* renamed from: b */
    private final bgns f116916b;

    /* renamed from: c */
    private final bugn f116917c;

    /* renamed from: d */
    private bugr f116918d;

    /* renamed from: e */
    private int f116919e = -1;

    public bgoi(bugn bugn, bgns bgns) {
        this.f116917c = bugn;
        this.f116916b = bgns;
    }

    /* renamed from: a */
    private final boolean m99499a(buer buer) {
        bmxy.m108581a(this.f116918d);
        bugu a = this.f116918d.mo72640a(64, 1, buer);
        if (a == null) {
            return false;
        }
        try {
            int intValue = ((Integer) a.get(2, TimeUnit.SECONDS)).intValue();
            if (intValue == 0) {
                return true;
            }
            StringBuilder sb = new StringBuilder(61);
            sb.append("Failed to send request to nanoapp: request result=");
            sb.append(intValue);
            sb.toString();
            return false;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() == 0) {
                new String("Failed to send request to nanoapp: ");
                return false;
            }
            "Failed to send request to nanoapp: ".concat(valueOf);
            return false;
        }
    }

    /* renamed from: f */
    private final bugr m99500f() {
        return this.f116917c.mo72627a(5147455389092024327L);
    }

    /* renamed from: a */
    public final void mo61880a(int i) {
        if (i != 1) {
            this.f116918d = null;
        }
    }

    /* renamed from: b */
    public final void mo61884b(int i) {
    }

    /* renamed from: c */
    public final boolean mo63015c() {
        return this.f116918d != null;
    }

    /* renamed from: cr */
    public final void mo61886cr() {
        int i = this.f116919e;
        if (i != -1) {
            boolean c = mo63016c(i);
            StringBuilder sb = new StringBuilder(53);
            sb.append("Re-enable because contexthub restarted, success=");
            sb.append(c);
            sb.toString();
        }
    }

    /* renamed from: d */
    public final void mo63017d() {
        if (this.f116918d != null) {
            bxvd da = buer.f153626d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            buer buer = (buer) da.f164949b;
            buer.f153629b = 0;
            buer.f153628a |= 1;
            if (m99499a((buer) da.mo74062i())) {
                bmxy.m108581a(this.f116918d);
                this.f116918d.mo72645b(this);
                this.f116917c.mo72637b((bugs) this);
                this.f116917c.mo72630a((bugl) this);
                this.f116919e = -1;
                this.f116918d = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("enable() must be called first.");
    }

    /* renamed from: e */
    public final void mo63018e() {
        if (this.f116918d != null) {
            bxvd da = buer.f153626d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            buer buer = (buer) da.f164949b;
            buer.f153629b = 2;
            buer.f153628a |= 1;
            m99499a((buer) da.mo74062i());
            return;
        }
        throw new IllegalStateException("enable() must be called first.");
    }

    /* renamed from: b */
    public final void mo63013b(bgmy bgmy) {
        this.f116915a.remove(bgmy);
    }

    /* renamed from: c */
    public final boolean mo63016c(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        bugr f = m99500f();
        this.f116918d = f;
        if (f != null) {
            bxvd da = buer.f153626d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            buer buer = (buer) da.f164949b;
            buer.f153629b = 1;
            int i2 = buer.f153628a | 1;
            buer.f153628a = i2;
            buer.f153628a = i2 | 2;
            buer.f153630c = i;
            if (m99499a((buer) da.mo74062i())) {
                f.mo72642a(this);
                if (cezb.f183522a.mo6606a().bugFixUseLifecycleCallbacksInFloorChange()) {
                    Looper myLooper = Looper.myLooper();
                    bmxy.m108581a(myLooper);
                    this.f116917c.mo72629a(5147455389092024327L, this, new adzt(myLooper));
                } else {
                    this.f116917c.mo72633a((bugs) this);
                }
                this.f116919e = i;
                return true;
            }
        }
        this.f116918d = null;
        return false;
    }

    /* renamed from: b */
    public final boolean mo63014b() {
        return m99500f() != null;
    }

    /* renamed from: a */
    public final void mo63012a(bgmy bgmy) {
        if (this.f116915a == null) {
            this.f116915a = new ArrayList();
        }
        this.f116915a.add(bgmy);
    }

    /* renamed from: a */
    public final void mo61878a(bugn bugn, bugr bugr, buhd buhd) {
        if (bugr != null && bugr.mo72639a() == 5147455389092024327L) {
            this.f116916b.mo62921a((Runnable) new bgoh(this, buhd));
        }
    }
}
