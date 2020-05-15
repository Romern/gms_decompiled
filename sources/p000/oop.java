package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.gms.car.CarWindowManagerLayoutParams;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.InputFocusChangedEvent;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: oop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oop implements oog {

    /* renamed from: a */
    public static final bnsn f38074a = odk.m28481a("CAR.WM.CW");

    /* renamed from: b */
    public final String f38075b;

    /* renamed from: c */
    public final String f38076c;

    /* renamed from: d */
    public final oqa f38077d;

    /* renamed from: e */
    public final ooo f38078e;

    /* renamed from: f */
    public final ooo f38079f;

    /* renamed from: g */
    public CarWindowLayoutParams f38080g;

    /* renamed from: h */
    public oos f38081h;

    /* renamed from: i */
    public Animation f38082i;

    /* renamed from: j */
    public Animation f38083j;

    /* renamed from: k */
    public final nsx f38084k;

    /* renamed from: l */
    private final int f38085l;

    /* renamed from: m */
    private final boolean f38086m;

    /* renamed from: n */
    private InputFocusChangedEvent f38087n;

    /* renamed from: o */
    private final AtomicBoolean f38088o = new AtomicBoolean(false);

    /* renamed from: p */
    private final IBinder.DeathRecipient f38089p = new ooh(this);

    /* renamed from: q */
    private final nsz f38090q;

    public oop(String str, String str2, CarWindowLayoutParams carWindowLayoutParams, oqa oqa, nsz nsz, int i, npd npd) {
        this.f38075b = str;
        this.f38076c = str2;
        this.f38080g = carWindowLayoutParams;
        this.f38077d = oqa;
        this.f38090q = nsz;
        nsz.f12819a.linkToDeath(this.f38089p, 0);
        this.f38085l = i;
        this.f38086m = npd.mo21393d();
        this.f38078e = new ooo(this);
        this.f38079f = new ooo(this);
        this.f38084k = new nsx(this);
    }

    /* renamed from: b */
    private final void m29312b(InputFocusChangedEvent inputFocusChangedEvent) {
        try {
            if (this.f38085l < 7) {
                nsz nsz = this.f38090q;
                boolean z = inputFocusChangedEvent.f29409a;
                Parcel bj = nsz.mo8529bj();
                dcl.m8166a(bj, z);
                dcl.m8166a(bj, !inputFocusChangedEvent.f29410b);
                nsz.mo8530c(3, bj);
                return;
            }
            nsz nsz2 = this.f38090q;
            Parcel bj2 = nsz2.mo8529bj();
            dcl.m8165a(bj2, inputFocusChangedEvent);
            nsz2.mo8530c(8, bj2);
        } catch (RemoteException e) {
            bnsi b = f38074a.mo68387b();
            b.mo68437a(e);
            b.mo68432a("oop", "b", 339, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68420a("%s.onInputFocusChange RemoteException", this.f38075b);
        }
    }

    /* renamed from: a */
    public final String mo21456a() {
        String str = this.f38076c;
        String str2 = this.f38075b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: c */
    public final oos mo22386c() {
        return this.f38081h;
    }

    /* renamed from: d */
    public final void mo21465d(oos oos) {
        bnsi b = f38074a.mo68387b();
        b.mo68432a("oop", "d", 243, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b.mo68420a("%s.onWindowSurfaceInitFailed", this.f38075b);
    }

    /* renamed from: e */
    public final void mo22402e() {
        InputFocusChangedEvent inputFocusChangedEvent;
        if (this.f38078e.mo22398c() && this.f38079f.mo22398c() && (inputFocusChangedEvent = this.f38087n) != null) {
            m29312b(inputFocusChangedEvent);
            this.f38087n = null;
        }
    }

    /* renamed from: f */
    public final void mo22403f() {
        if (this.f38088o.compareAndSet(false, true)) {
            this.f38090q.f12819a.unlinkToDeath(this.f38089p, 0);
        }
        this.f38077d.mo21660a(this);
        this.f38078e.mo22397b();
        this.f38079f.mo22397b();
    }

    /* renamed from: g */
    public final void mo22404g() {
        if (this.f38086m) {
            bnsi c = f38074a.mo68388c();
            c.mo68432a("oop", "g", 446, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68420a("%s Ignoring ANR because ANR monitoring is disabled.", this.f38075b);
            return;
        }
        try {
            nsz nsz = this.f38090q;
            nsz.mo8530c(7, nsz.mo8529bj());
        } catch (RemoteException e) {
        }
        mo22403f();
    }

    /* renamed from: y */
    public final void mo21467y() {
    }

    /* renamed from: a */
    public final void mo21457a(int i) {
        try {
            nsz nsz = this.f38090q;
            Parcel bj = nsz.mo8529bj();
            bj.writeInt(i);
            nsz.mo8530c(6, bj);
        } catch (RemoteException e) {
            bnsi b = f38074a.mo68387b();
            b.mo68437a(e);
            b.mo68432a("oop", "a", 385, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68420a("%s.onFrameRateChange RemoteException", this.f38075b);
        }
    }

    /* renamed from: c */
    public final void mo21464c(oos oos) {
        if (this.f38085l >= 7) {
            oos.mo22440e();
            try {
                nsz nsz = this.f38090q;
                CarWindowManagerLayoutParams e = oos.mo22440e();
                Parcel bj = nsz.mo8529bj();
                dcl.m8165a(bj, e);
                nsz.mo8530c(9, bj);
            } catch (RemoteException e2) {
                bnsi b = f38074a.mo68387b();
                b.mo68437a(e2);
                b.mo68432a("oop", "c", 302, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68420a("%s.onWindowAttributesChanged RemoteException", this.f38075b);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo22401d() {
        CarWindowLayoutParams carWindowLayoutParams = this.f38080g;
        if (carWindowLayoutParams.f29388j == -1 && carWindowLayoutParams.f29389k == -1) {
            return true;
        }
        try {
            Context createPackageContext = this.f38077d.mo21648a().createPackageContext(this.f38076c, 0);
            if (this.f38080g.f29388j != -1) {
                this.f38082i = this.f38077d.mo21671b().mo22480a(createPackageContext, this.f38080g.f29388j);
            }
            if (this.f38080g.f29389k == -1) {
                return true;
            }
            this.f38083j = this.f38077d.mo21671b().mo22480a(createPackageContext, this.f38080g.f29389k);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            bnsi b = f38074a.mo68387b();
            b.mo68437a(e);
            b.mo68432a("oop", "d", 113, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68420a("%s Failed to find package", this.f38075b);
            return false;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* renamed from: e */
    public final void mo21466e(oos oos) {
        bnsi b = f38074a.mo68387b();
        b.mo68432a("oop", "e", 272, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b.mo68422a("%s.onWindowAttachFailed state=%d", (Object) this.f38075b, this.f38081h.mo22436c());
    }

    /* renamed from: a */
    public final void mo21458a(InputFocusChangedEvent inputFocusChangedEvent) {
        if (!this.f38078e.mo22398c() || !this.f38079f.mo22398c()) {
            StringBuilder sb = new StringBuilder();
            if (!this.f38079f.mo22398c()) {
                sb.append("touchQueue:\n");
                this.f38079f.mo22396a(sb);
            }
            if (!this.f38078e.mo22398c()) {
                sb.append("keyQueue:\n");
                this.f38078e.mo22396a(sb);
            }
            sb.toString();
            this.f38087n = inputFocusChangedEvent;
            return;
        }
        m29312b(inputFocusChangedEvent);
    }

    /* renamed from: b */
    public final Rect mo22400b(ooq ooq) {
        FrameLayout frameLayout = new FrameLayout(this.f38077d.mo21648a());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        View view = new View(this.f38077d.mo21648a());
        CarWindowLayoutParams carWindowLayoutParams = this.f38080g;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(carWindowLayoutParams.f29380b, carWindowLayoutParams.f29381c, carWindowLayoutParams.f29386h);
        layoutParams.leftMargin = this.f38080g.f29382d;
        layoutParams.topMargin = this.f38080g.f29383e;
        layoutParams.rightMargin = this.f38080g.f29384f;
        layoutParams.bottomMargin = this.f38080g.f29385g;
        layoutParams.gravity = this.f38080g.f29386h;
        frameLayout.addView(view, layoutParams);
        frameLayout.measure(View.MeasureSpec.makeMeasureSpec(ooq.f38099i, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(ooq.f38097g, Integer.MIN_VALUE));
        frameLayout.layout(0, 0, ooq.f38099i, ooq.f38097g);
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* renamed from: b */
    public final void mo21463b(oos oos) {
        try {
            nsz nsz = this.f38090q;
            nsz.mo8530c(2, nsz.mo8529bj());
        } catch (RemoteException e) {
            bnsi b = f38074a.mo68387b();
            b.mo68437a(e);
            b.mo68432a("oop", "b", 288, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68420a("%s.onWindowDetached RemoteException", this.f38075b);
        }
    }

    /* renamed from: a */
    public final void mo22385a(ooq ooq) {
        oos oos;
        boolean z;
        int i = this.f38080g.f29390l;
        if (i == 0) {
            oos = new oou(this.f38077d, 4, this, null);
        } else {
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            if (ccpp.m131164b()) {
                oos = new oov(this.f38077d, 4, this, z, this.f38080g.f29394p);
            } else {
                oos = new oov(this.f38077d, 4, this, z);
            }
        }
        if (this.f38080g.f29391m) {
            oos.mo22457v();
        }
        Rect b = mo22400b(ooq);
        int i2 = b.left;
        int i3 = ooq.f38097g;
        int i4 = b.bottom;
        int width = b.width();
        int height = b.height();
        Integer num = (Integer) oqa.f38227ad.get(4);
        bmxy.m108581a(num);
        int intValue = num.intValue();
        CarWindowLayoutParams carWindowLayoutParams = this.f38080g;
        oos.mo22416a(i2, i3 - i4, width, height, intValue, carWindowLayoutParams.f29387i, null, this.f38082i, this.f38083j, carWindowLayoutParams.f29392n);
        this.f38081h = oos;
    }

    /* renamed from: a */
    public final void mo21459a(oos oos) {
        try {
            DrawingSpec w = this.f38081h.mo22458w();
            if (w != null) {
                nsz nsz = this.f38090q;
                Parcel bj = nsz.mo8529bj();
                dcl.m8165a(bj, w);
                nsz.mo8530c(1, bj);
            }
        } catch (RemoteException e) {
            bnsi b = f38074a.mo68387b();
            b.mo68437a(e);
            b.mo68432a("oop", "a", 264, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68420a("%s.onWindowAttached RemoteException", this.f38075b);
        }
    }

    /* renamed from: a */
    public final void mo21460a(oos oos, int i, int i2) {
        this.f38077d.mo21685e(this.f38081h);
    }

    /* renamed from: a */
    public final void mo21461a(oos oos, KeyEvent keyEvent) {
        this.f38078e.mo22395a(keyEvent);
        try {
            nsz nsz = this.f38090q;
            Parcel bj = nsz.mo8529bj();
            dcl.m8165a(bj, keyEvent);
            nsz.mo8530c(5, bj);
        } catch (RemoteException e) {
            bnsi b = f38074a.mo68387b();
            b.mo68437a(e);
            b.mo68432a("oop", "a", 367, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68424a("%s.onKeyEvent(%s) RemoteException", this.f38075b, keyEvent);
        }
    }

    /* renamed from: a */
    public final void mo21462a(oos oos, MotionEvent motionEvent) {
        this.f38079f.mo22395a(motionEvent);
        try {
            nsz nsz = this.f38090q;
            Parcel bj = nsz.mo8529bj();
            dcl.m8165a(bj, motionEvent);
            nsz.mo8530c(4, bj);
        } catch (RemoteException e) {
            bnsi b = f38074a.mo68387b();
            b.mo68437a(e);
            b.mo68432a("oop", "a", 353, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68424a("%s.onTouchEvent(%s) RemoteException", this.f38075b, motionEvent);
        }
    }
}
