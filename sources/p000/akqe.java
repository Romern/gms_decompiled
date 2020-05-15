package p000;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Looper;
import com.google.android.chimera.Activity;

/* renamed from: akqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class akqe {

    /* renamed from: a */
    protected final akpy f72422a = new akpy();

    /* renamed from: b */
    protected final akvl f72423b;

    /* renamed from: c */
    protected final akrj f72424c;

    /* renamed from: d */
    protected final cijl f72425d;

    /* renamed from: e */
    protected final cijl f72426e;

    /* renamed from: f */
    protected final akqm f72427f;

    /* renamed from: g */
    protected final akug f72428g;

    /* renamed from: h */
    public final aksc f72429h;

    /* renamed from: i */
    protected final akql f72430i;

    protected akqe(Activity activity, int i, akug akug, String str) {
        SensorManager sensorManager;
        Sensor defaultSensor;
        this.f72428g = akug;
        activity.getResources().getConfiguration();
        this.f72423b = new akvl(activity.getWindowManager().getDefaultDisplay());
        this.f72429h = new aksc(new aksb(activity, str), i);
        this.f72424c = new akrj(this.f72422a, this.f72423b, this.f72428g, this.f72429h);
        this.f72425d = new akqc(this);
        this.f72426e = new akqd(this);
        this.f72427f = new akqm(this.f72425d);
        akql akql = null;
        if (this.f72428g.mo39854d() && activity.getPackageManager().hasSystemFeature("android.hardware.camera.flash") && (sensorManager = (SensorManager) activity.getSystemService("sensor")) != null && (defaultSensor = sensorManager.getDefaultSensor(5)) != null) {
            akql = new akql(sensorManager, defaultSensor, new adzt(Looper.getMainLooper()), this.f72424c, bmvy.f131119a, this.f72428g.mo39855e(), this.f72428g.mo39856f(), this.f72429h);
        }
        this.f72430i = akql;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo39701a(akpv akpv) {
        akpv.f72402a = this.f72424c;
        akpv.f72406e = this.f72430i;
        akpv.f72407f = this.f72427f;
        akpv.f72405d = this.f72429h;
        akpv.f72403b = this.f72426e;
        akpv.f72404c = this.f72428g;
    }
}
