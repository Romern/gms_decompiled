package p000;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.location.DeviceOrientation;
import com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor;
import com.google.location.bluemoon.inertialanchor.Pose;
import java.io.IOException;
import java.io.PrintWriter;

/* renamed from: bfun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfun extends bfuo implements btvl, bfth {

    /* renamed from: a */
    public final adzt f115351a;

    /* renamed from: b */
    final float[] f115352b = new float[9];

    /* renamed from: c */
    AndroidInertialAnchor f115353c;

    /* renamed from: d */
    boolean f115354d = false;

    /* renamed from: e */
    final bfur f115355e;

    /* renamed from: h */
    private final Context f115356h;

    /* renamed from: i */
    private final Display f115357i;

    /* renamed from: j */
    private final DeviceOrientation f115358j = new DeviceOrientation();

    /* renamed from: k */
    private final float[] f115359k = new float[4];

    /* renamed from: l */
    private final float[] f115360l = new float[9];

    /* renamed from: m */
    private final bftk f115361m;

    /* renamed from: n */
    private final bfuf f115362n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfun(Context context, bfpk bfpk, bfuf bfuf) {
        super(context);
        bftk a = bftk.m97822a(context);
        this.f115356h = context;
        this.f115351a = new adzt(bfpk.mo63548a());
        this.f115362n = bfuf;
        this.f115361m = a;
        this.f115357i = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        this.f115355e = new bfur(this);
        if (cest.m138206l()) {
            a.mo62242a(this.f115355e.mo62292b(2));
            a.mo62239a((bfth) this);
        }
    }

    /* renamed from: a */
    private static final void m97916a(btvi btvi) {
        bxvd da = btvx.f152648k.mo74144da();
        boolean f = cewg.m138348f();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btvx) da.f164949b).f152650a = f;
        boolean k = cexz.m138412k();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btvx) da.f164949b).f152651b = k;
        boolean g = cexz.m138408g();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btvx) da.f164949b).f152652c = g;
        boolean i = cexz.m138410i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btvx) da.f164949b).f152653d = i;
        boolean f2 = cexz.m138407f();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btvx) da.f164949b).f152654e = f2;
        boolean m = cexz.m138414m();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btvx) da.f164949b).f152655f = m;
        boolean l = cexz.m138413l();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btvx) da.f164949b).f152656g = l;
        boolean j = cexz.m138411j();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btvx) da.f164949b).f152657h = j;
        boolean c = cexz.m138404c();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btvx) da.f164949b).f152658i = c;
        boolean h = cexz.m138409h();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btvx) da.f164949b).f152659j = h;
        btvi.f152612e = (btvx) da.mo74062i();
    }

    /* renamed from: b */
    private final void m97917b(boolean z) {
        btvy btvy;
        btvi a = AndroidInertialAnchor.m151130a();
        AndroidInertialAnchor androidInertialAnchor = this.f115353c;
        if (androidInertialAnchor == null) {
            m97916a(a);
            a.f152609b = this.f115351a;
            a.mo72441a(cewg.m138349g());
            a.f152610c = "FOP Inertial Anchor";
            a.mo72440a((int) cevt.m138311c());
            if (cexz.m138405d() && cewg.m138349g()) {
                a.f152614g = new btvp(this.f115356h, 2);
            }
            if (cexz.m138406e()) {
                btvy = cexz.m138403b();
            } else {
                try {
                    btvy = btvk.m118920a(this.f115356h, Integer.valueOf((int) cewg.m138345c()));
                } catch (IOException e) {
                    Log.e("GCoreFlp", "Error while loading InertialAnchor config for FOP (InertialAnchorOrientationEngineV2), using default.");
                    btvy = null;
                }
            }
            a.f152608a = btvy;
            try {
                if (cewg.m138347e()) {
                    a.f152613f = btvk.m118921b(this.f115356h, Integer.valueOf((int) cewg.m138346d()));
                }
            } catch (IOException e2) {
                Log.e("GCoreFlp", "Error while loading heading uncertainty model, using default.");
            }
            androidInertialAnchor = a.mo72439a();
            this.f115353c = androidInertialAnchor;
            if (androidInertialAnchor == null) {
                Log.e("GCoreFlp", "Error while initializing Inertial Anchor. Inertial Anchor is not started");
                return;
            }
        }
        if (z) {
            androidInertialAnchor.mo86634a(this.f115355e.mo62292b(1), this.f115351a);
            this.f115353c.mo86637c();
            return;
        }
        androidInertialAnchor.mo86645a(this.f115355e.mo62292b(1));
        this.f115353c.mo86638d();
    }

    /* renamed from: c */
    private final void m97918c(boolean z) {
        if (!z) {
            this.f115361m.mo62247d(3);
        } else if (cest.m138206l()) {
            this.f115361m.mo62246c(3);
        }
    }

    /* renamed from: a */
    public final void mo62281a(float f) {
    }

    /* renamed from: a */
    public final void mo62282a(float f, float f2, long j) {
    }

    /* renamed from: a */
    public final void mo62283a(long j) {
    }

    /* renamed from: a */
    public final void mo62284a(long j, float f) {
    }

    /* renamed from: b */
    public final void mo61884b(int i) {
    }

    /* renamed from: cr */
    public final void mo61886cr() {
    }

    /* renamed from: d */
    public final void mo62286d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo62272c() {
        if (this.f115363f.isEmpty() && this.f115354d) {
            m97917b(false);
            m97918c(false);
            this.f115355e.mo62291a(1, false);
            this.f115354d = false;
        } else if (!this.f115354d && mo62271b()) {
            m97917b(true);
            m97918c(true);
            this.f115354d = true;
        }
        if (this.f115354d) {
            this.f115364g.mo24756l().mo50373a(new bful(this));
        }
    }

    /* renamed from: b */
    public final boolean mo62271b() {
        boolean z;
        btvi a = AndroidInertialAnchor.m151130a();
        int i = Build.VERSION.SDK_INT;
        boolean z2 = false;
        if (this.f115353c == null) {
            m97916a(a);
            this.f115353c = a.mo72439a();
            z = true;
        } else {
            z = false;
        }
        AndroidInertialAnchor androidInertialAnchor = this.f115353c;
        if (androidInertialAnchor != null) {
            z2 = androidInertialAnchor.mo86636b();
            if (z) {
                this.f115353c = null;
                return z2;
            }
        }
        return z2;
    }

    /* renamed from: a */
    public final float mo62268a() {
        float a = bfuq.m97942a(this.f115357i.getRotation(), this.f115352b, this.f115360l);
        if (!bfup.m97941a(this.f115360l)) {
            return Float.MAX_VALUE;
        }
        return a;
    }

    /* renamed from: a */
    public final void mo61880a(int i) {
        this.f115355e.mo62290a(1);
    }

    /* renamed from: a */
    public final void mo62269a(Location location) {
        if (location != null) {
            AndroidInertialAnchor androidInertialAnchor = this.f115353c;
            if (androidInertialAnchor != null) {
                androidInertialAnchor.mo86633a(location);
            }
            if (cest.m138206l() && cest.m138208n()) {
                this.f115361m.mo62238a(location);
            }
        }
    }

    /* renamed from: a */
    public final void mo62285a(Pose pose) {
        bfuf bfuf = this.f115362n;
        if (bfuf != null) {
            this.f115358j.mo43532j();
            pose.mo86664a(this.f115359k);
            this.f115358j.mo43520a(this.f115359k);
            bsdt.m115366a(this.f115352b, this.f115359k);
            this.f115358j.mo43521b((float) Math.toDegrees((double) pose.headingErrorRad));
            this.f115358j.mo43519a((float) Math.toDegrees((double) bfuq.m97942a(this.f115357i.getRotation(), this.f115352b, this.f115360l)));
            bfuf.mo62278a(this.f115358j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62270a(PrintWriter printWriter) {
        String str;
        printWriter.println("Active OrientationEngine Instance: InertialAnchorOrientationEngineV2");
        int i = this.f115355e.f115367c;
        if (i != 1) {
            str = i != 2 ? "null" : "CHRE";
        } else {
            str = "AP";
        }
        StringBuilder sb = new StringBuilder(str.length() + 14);
        sb.append("Running Mode: ");
        sb.append(str);
        printWriter.println(sb.toString());
        AndroidInertialAnchor androidInertialAnchor = this.f115353c;
        if (androidInertialAnchor != null) {
            boolean b = androidInertialAnchor.mo86636b();
            StringBuilder sb2 = new StringBuilder(35);
            sb2.append("Is Inertial Anchor supported: ");
            sb2.append(b);
            printWriter.println(sb2.toString());
            this.f115353c.mo86635a(printWriter);
        }
    }

    /* renamed from: a */
    public final void mo62237a(boolean z) {
        if (z && cest.m138206l()) {
            this.f115355e.mo62290a(2);
        } else {
            this.f115355e.mo62290a(1);
        }
    }
}
