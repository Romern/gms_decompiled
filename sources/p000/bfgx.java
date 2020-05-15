package p000;

import android.content.Context;
import android.hardware.Sensor;
import android.os.Looper;
import com.google.android.location.collectionlib.RealCollectorConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bfgx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfgx extends bfgs {

    /* renamed from: a */
    public final bfgy f113846a;

    /* renamed from: b */
    private final Map f113847b;

    /* renamed from: c */
    private final bfho f113848c;

    /* renamed from: d */
    private final bfgw f113849d = new bfgw(this);

    /* renamed from: e */
    private final bffr f113850e;

    public bfgx(Context context, bfho bfho, Map map, bfgy bfgy, bfev bfev, bfew bfew, bhdb bhdb) {
        super(bfev, bfew, bhdb);
        bmxy.m108581a(context);
        bmxy.m108581a(map);
        this.f113848c = bfho;
        this.f113847b = new HashMap(map);
        this.f113850e = new bffr(context);
        this.f113846a = bfgy;
    }

    /* renamed from: a */
    public static bfgt m96741a(int i) {
        bfgt bfgt = (bfgt) RealCollectorConfig.f150690b.get(Integer.valueOf(i));
        return bfgt == null ? bfgt.f113833w : bfgt;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo61529b() {
        if (this.f113848c == null) {
            try {
                this.f113850e.mo61625a(this.f113849d);
            } catch (IllegalArgumentException e) {
            }
        }
        bfew bfew = this.f113806i;
        if (bfew != null) {
            bfew.mo61499e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61527a() {
        if (this.f113850e != null) {
            for (Map.Entry entry : this.f113847b.entrySet()) {
                bffr bffr = this.f113850e;
                List<Sensor> sensorList = bffr.f113711a.getSensorList(((Integer) entry.getKey()).intValue());
                if (sensorList != null && sensorList.size() > 0) {
                    Sensor sensor = sensorList.get(0);
                    bfho bfho = this.f113848c;
                    if (bfho != null) {
                        bfgw bfgw = this.f113849d;
                        Object obj = this.f113805h;
                        if (bfgw != null) {
                            synchronized (bfho.f113937a) {
                                if (obj == null) {
                                    obj = new adzt(Looper.getMainLooper());
                                }
                                bfho.f113941e.put(Integer.valueOf(sensor.getType()), bfne.m97311a(bfgw, obj));
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.f113850e.mo61626a(this.f113849d, sensor, ((Integer) entry.getValue()).intValue(), this.f113805h)) {
                        String valueOf = String.valueOf(entry.getKey());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
                        sb.append("Failed to listen to sensor ");
                        sb.append(valueOf);
                        sb.toString();
                    }
                }
            }
        }
        bfew bfew = this.f113806i;
        if (bfew != null) {
            bfew.mo61500f();
        }
    }
}
