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

/* renamed from: bfuk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfuk extends bfuo implements btvl {

    /* renamed from: a */
    public final adzt f115335a;

    /* renamed from: b */
    public btvl f115336b;

    /* renamed from: c */
    final float[] f115337c;

    /* renamed from: d */
    AndroidInertialAnchor f115338d;

    /* renamed from: e */
    boolean f115339e;

    /* renamed from: h */
    private final Context f115340h;

    /* renamed from: i */
    private final Display f115341i;

    /* renamed from: j */
    private final DeviceOrientation f115342j;

    /* renamed from: k */
    private final float[] f115343k;

    /* renamed from: l */
    private final float[] f115344l;

    /* renamed from: m */
    private final bftk f115345m;

    /* renamed from: n */
    private final int f115346n;

    /* renamed from: o */
    private final bfuf f115347o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfuk(Context context, bfpk bfpk, bfuf bfuf) {
        super(context);
        bftk a = bftk.m97822a(context);
        bftk a2 = bftk.m97822a(context);
        int i = 1;
        if (cest.m138206l() && (a2 instanceof bftm)) {
            i = 2;
        }
        this.f115340h = context;
        this.f115335a = new adzt(bfpk.mo63548a());
        this.f115347o = bfuf;
        this.f115345m = a;
        this.f115346n = i;
        this.f115342j = new DeviceOrientation();
        this.f115343k = new float[4];
        this.f115337c = new float[9];
        this.f115344l = new float[9];
        this.f115339e = false;
        this.f115341i = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        a.mo62242a(this);
    }

    /* renamed from: a */
    private static final void m97903a(btvi btvi) {
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
    public final boolean mo62271b() {
        boolean z = true;
        if (this.f115346n != 1) {
            return true;
        }
        btvi a = AndroidInertialAnchor.m151130a();
        int i = Build.VERSION.SDK_INT;
        boolean z2 = false;
        if (this.f115338d == null) {
            m97903a(a);
            this.f115338d = a.mo72439a();
        } else {
            z = false;
        }
        AndroidInertialAnchor androidInertialAnchor = this.f115338d;
        if (androidInertialAnchor != null) {
            z2 = androidInertialAnchor.mo86636b();
            if (z) {
                this.f115338d = null;
                return z2;
            }
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo62272c() {
        btvy btvy;
        if (this.f115346n == 1) {
            btvi a = AndroidInertialAnchor.m151130a();
            if (this.f115338d == null) {
                m97903a(a);
                a.f152609b = this.f115335a;
                a.mo72441a(cewg.m138349g());
                a.f152610c = "FOP Inertial Anchor";
                a.mo72440a((int) cevt.m138311c());
                if (cexz.m138405d() && cewg.m138349g()) {
                    a.f152614g = new btvp(this.f115340h, 2);
                }
                if (cexz.m138406e()) {
                    btvy = cexz.m138403b();
                } else {
                    try {
                        btvy = btvk.m118920a(this.f115340h, Integer.valueOf((int) cewg.m138345c()));
                    } catch (IOException e) {
                        Log.e("GCoreFlp", "Error while loading InertialAnchor config for FOP (InertialAnchorOrientationEngine), using default.");
                        btvy = null;
                    }
                }
                a.f152608a = btvy;
                try {
                    if (cewg.m138347e()) {
                        a.f152613f = btvk.m118921b(this.f115340h, Integer.valueOf((int) cewg.m138346d()));
                    }
                } catch (IOException e2) {
                    Log.e("GCoreFlp", "Error while loading heading uncertainty model, using default.");
                }
                AndroidInertialAnchor a2 = a.mo72439a();
                this.f115338d = a2;
                if (a2 == null) {
                    Log.e("GCoreFlp", "Error while initializing Inertial Anchor. Inertial Anchor is not started");
                    return;
                }
            }
            if (this.f115363f.isEmpty() && this.f115339e) {
                this.f115338d.mo86645a(this);
                btvl btvl = this.f115336b;
                if (btvl != null) {
                    this.f115338d.mo86645a(btvl);
                }
                this.f115339e = false;
                this.f115338d.mo86638d();
            } else if (!this.f115363f.isEmpty()) {
                if (!this.f115339e && mo62271b()) {
                    this.f115338d.mo86634a(this, this.f115335a);
                    btvl btvl2 = this.f115336b;
                    if (btvl2 != null) {
                        this.f115338d.mo86634a(btvl2, this.f115335a);
                    }
                    this.f115338d.mo86637c();
                    this.f115339e = true;
                } else {
                    Log.e("GCoreFlp", "Inertial Anchor is not supported on this device.");
                }
                if (this.f115339e) {
                    this.f115364g.mo24756l().mo50373a(new bfui(this));
                }
            }
        } else {
            if (!this.f115363f.isEmpty() || !this.f115339e) {
                if (this.f115339e || !this.f115345m.mo62246c(3)) {
                    return;
                }
            } else if (!this.f115345m.mo62247d(3)) {
                return;
            }
            this.f115339e = !this.f115339e;
        }
    }

    /* renamed from: d */
    public final void mo62286d() {
    }

    /* renamed from: a */
    public final float mo62268a() {
        float a = bfuq.m97942a(this.f115341i.getRotation(), this.f115337c, this.f115344l);
        if (!bfup.m97941a(this.f115344l)) {
            return Float.MAX_VALUE;
        }
        return a;
    }

    /* renamed from: a */
    public final void mo62269a(Location location) {
        AndroidInertialAnchor androidInertialAnchor;
        if (this.f115346n == 1 && location != null && (androidInertialAnchor = this.f115338d) != null) {
            androidInertialAnchor.mo86633a(location);
        }
    }

    /* renamed from: a */
    public final void mo62285a(Pose pose) {
        bfuf bfuf = this.f115347o;
        if (bfuf != null) {
            this.f115342j.mo43532j();
            pose.mo86664a(this.f115343k);
            this.f115342j.mo43520a(this.f115343k);
            bsdt.m115366a(this.f115337c, this.f115343k);
            this.f115342j.mo43521b((float) Math.toDegrees((double) pose.headingErrorRad));
            this.f115342j.mo43519a((float) Math.toDegrees((double) bfuq.m97942a(this.f115341i.getRotation(), this.f115337c, this.f115344l)));
            bfuf.mo62278a(this.f115342j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62270a(PrintWriter printWriter) {
        String str;
        printWriter.println("Active OrientationEngine Instance: InertialAnchorOrientationEngine");
        int i = this.f115346n;
        if (i != 1) {
            str = i != 2 ? "null" : "CHRE";
        } else {
            str = "AP";
        }
        StringBuilder sb = new StringBuilder(str.length() + 14);
        sb.append("Running Mode: ");
        sb.append(str);
        printWriter.println(sb.toString());
        AndroidInertialAnchor androidInertialAnchor = this.f115338d;
        if (androidInertialAnchor != null) {
            boolean b = androidInertialAnchor.mo86636b();
            StringBuilder sb2 = new StringBuilder(35);
            sb2.append("Is Inertial Anchor supported: ");
            sb2.append(b);
            printWriter.println(sb2.toString());
            this.f115338d.mo86635a(printWriter);
        }
    }
}
