package p000;

import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: akrj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akrj {

    /* renamed from: a */
    static final List f72484a = Collections.singletonList(new Camera.Area(new Rect(-100, -100, 100, 100), 1000));

    /* renamed from: t */
    public static final /* synthetic */ int f72485t = 0;

    /* renamed from: b */
    public final akpy f72486b;

    /* renamed from: c */
    public HandlerThread f72487c;

    /* renamed from: d */
    public Handler f72488d;

    /* renamed from: e */
    public final Handler f72489e = new adzt(Looper.getMainLooper());

    /* renamed from: f */
    public final akvl f72490f;

    /* renamed from: g */
    public final akug f72491g;

    /* renamed from: h */
    public final aksc f72492h;

    /* renamed from: i */
    public boolean f72493i;

    /* renamed from: j */
    public boolean f72494j;

    /* renamed from: k */
    final int f72495k = Build.VERSION.SDK_INT;

    /* renamed from: l */
    public akpx f72496l;

    /* renamed from: m */
    public Camera f72497m;

    /* renamed from: n */
    public Camera.CameraInfo f72498n;

    /* renamed from: o */
    public final ArrayList f72499o = new ArrayList(2);

    /* renamed from: p */
    public akpn f72500p = new akrf();

    /* renamed from: q */
    public akpm f72501q = new akre();

    /* renamed from: r */
    public int f72502r = 0;

    /* renamed from: s */
    public akrq f72503s;

    public akrj(akpy akpy, akvl akvl, akug akug, aksc aksc) {
        this.f72486b = akpy;
        this.f72490f = akvl;
        this.f72491g = akug;
        this.f72492h = aksc;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: d */
    public static void m60269d() {
        sdo.m34971a(Looper.myLooper() == Looper.getMainLooper(), (Object) "Not on main thread");
    }

    /* renamed from: a */
    public final void mo39719a() {
        m60269d();
        this.f72488d.post(new akqq(this));
    }

    /* renamed from: a */
    public final boolean mo39724a(int i) {
        int i2 = this.f72502r;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i == 4 || i == 0 : i == 5 : i == 0 : i == 4 || i == 0 : i == 2 || i == 3 : i == 1;
    }

    /* renamed from: b */
    public final void mo39725b() {
        mo39721a((akrd) null);
    }

    /* renamed from: c */
    public final void mo39727c() {
        m60269d();
        mo39725b();
        this.f72488d.post(new akqt(this));
    }

    /* renamed from: a */
    public final void mo39720a(akrb akrb, String str) {
        this.f72492h.mo39789r();
        this.f72489e.post(new akqp(akrb, str));
    }

    /* renamed from: b */
    public final void mo39726b(int i) {
        sdo.m34972a(mo39724a(i), "Can't advance from %s to %s", akrc.f72478a.get(this.f72502r), akrc.f72478a.get(i));
    }

    /* renamed from: a */
    public final void mo39721a(akrd akrd) {
        m60269d();
        this.f72488d.post(new akqs(this, akrd));
    }

    /* renamed from: c */
    public final void mo39728c(int i) {
        mo39726b(i);
        this.f72502r = i;
        new Object[1][0] = akrc.f72478a.get(this.f72502r);
    }

    /* renamed from: a */
    public final void mo39722a(akri akri) {
        m60269d();
        this.f72499o.add(akri);
    }

    /* renamed from: a */
    public final void mo39723a(boolean z) {
        akqv akqv = new akqv(z);
        m60269d();
        Handler handler = this.f72488d;
        if (handler != null) {
            handler.post(new akqu(this, akqv));
        }
    }
}
