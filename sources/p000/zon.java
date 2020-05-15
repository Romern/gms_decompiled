package p000;

import android.content.Context;
import android.os.Binder;
import android.os.Handler;
import com.google.android.gms.fitness.service.sensors.FitSensorsChimeraBroker;
import java.io.PrintWriter;

/* renamed from: zon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zon extends zmd {

    /* renamed from: d */
    public static final srn f55609d = zvt.m46581a();

    /* renamed from: e */
    public final ysl f55610e;

    /* renamed from: f */
    public final zqx f55611f;

    /* renamed from: g */
    public final zgf f55612g;

    /* renamed from: h */
    public final yvk f55613h;

    /* renamed from: i */
    public final Handler f55614i;

    /* renamed from: j */
    public final zdc f55615j;

    /* renamed from: k */
    public final zol f55616k = new zol(this);

    public zon(FitSensorsChimeraBroker fitSensorsChimeraBroker, String str, Handler handler, yzs yzs) {
        super(fitSensorsChimeraBroker, str, yzs);
        this.f55610e = yzs.mo30874b().mo30741b(this.f55429b);
        this.f55611f = yzs.mo30890j(this.f55429b);
        this.f55612g = yzs.mo30888i(this.f55429b);
        Context context = this.f55428a;
        this.f55613h = new yvk(zvn.m46574a(context), context.getPackageManager().hasSystemFeature("android.hardware.sensor.heartrate.ecg"), 0, 1);
        this.f55614i = handler;
        this.f55615j = new zdc(this.f55428a, handler, this.f55612g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Binder mo31233a(ytu ytu) {
        return new zby(this, ytu);
    }

    /* renamed from: b */
    public final void mo31242b(String str) {
    }

    /* renamed from: b */
    public final boolean mo31243b() {
        return false;
    }

    /* renamed from: d */
    public final boolean mo31245d() {
        return !this.f55615j.f54934c.mo30954a();
    }

    /* renamed from: g */
    public final void mo31248g() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ytv mo31234a() {
        return new zom(this);
    }

    /* renamed from: a */
    public final yxh mo31296a(int i) {
        return (yxh) this.f55616k.getBroadcastItem(i);
    }

    /* renamed from: a */
    public final void mo31235a(PrintWriter printWriter) {
        this.f55612g.mo19156a(printWriter);
    }

    /* renamed from: a */
    public final void mo31236a(String str) {
        int beginBroadcast = this.f55616k.beginBroadcast();
        while (beginBroadcast > 0) {
            beginBroadcast--;
            if (str.equals((String) this.f55616k.getBroadcastCookie(beginBroadcast))) {
                yxh a = mo31296a(beginBroadcast);
                mo31297a(a);
                this.f55616k.unregister(a);
            }
        }
        this.f55616k.finishBroadcast();
    }

    /* renamed from: a */
    public final void mo31297a(yxh yxh) {
        for (zgg zgg : this.f55615j.mo30944a(yxh)) {
            this.f55612g.mo19160a(zgg);
        }
    }
}
