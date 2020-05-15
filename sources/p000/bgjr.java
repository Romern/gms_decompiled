package p000;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.os.Handler;
import com.google.android.location.collectionlib.RealCollectorConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bgjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgjr implements bgnr {

    /* renamed from: a */
    public final Object f116645a = new Object();

    /* renamed from: b */
    public final bgns f116646b;

    /* renamed from: c */
    public final Map f116647c = new HashMap();

    /* renamed from: d */
    public final SensorManager f116648d;

    /* renamed from: e */
    public final Context f116649e;

    /* renamed from: f */
    public Handler f116650f;

    /* renamed from: g */
    private final bgml f116651g;

    /* renamed from: h */
    private final boolean f116652h;

    /* renamed from: i */
    private final LocationManager f116653i;

    public bgjr(Context context, bgns bgns, bgml bgml, boolean z) {
        this.f116649e = context;
        this.f116646b = bgns;
        this.f116648d = (SensorManager) context.getSystemService("sensor");
        this.f116653i = (LocationManager) context.getSystemService("location");
        this.f116651g = bgml;
        this.f116652h = z;
    }

    /* renamed from: a */
    public final bffq mo62794a(String str, bfec bfec, String str2) {
        String b = bgij.m99013b(this.f116649e.getApplicationContext());
        if (b != null) {
            return new bfdw(this.f116649e, this.f116646b, str, b, this.f116651g.mo63006b(), bfec, this.f116650f.getLooper(), new bhdb(str2));
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo62797b() {
        boolean z;
        boolean z2;
        List<String> allProviders;
        SensorManager sensorManager = this.f116648d;
        LocationManager locationManager = this.f116653i;
        if (sensorManager != null) {
            List<Sensor> sensorList = sensorManager.getSensorList(4);
            if (sensorList == null || sensorList.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            List<Sensor> sensorList2 = sensorManager.getSensorList(1);
            if (sensorList2 == null || sensorList2.isEmpty()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (locationManager == null || (allProviders = locationManager.getAllProviders()) == null || !allProviders.contains("gps") || !z || !z2) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final int mo62799c(bfgt bfgt) {
        Integer num = (Integer) RealCollectorConfig.f150689a.get(bfgt);
        if (num != null) {
            return bgkx.f116729g.mo62945a(this.f116648d, num.intValue());
        }
        return 0;
    }

    /* renamed from: a */
    public final boolean mo62795a() {
        List<Sensor> sensorList = this.f116648d.getSensorList(1);
        return sensorList != null && sensorList.size() > 0;
    }

    /* renamed from: b */
    public final boolean mo62798b(bfgt bfgt) {
        Integer num = (Integer) RealCollectorConfig.f150689a.get(bfgt);
        if (num == null) {
            return false;
        }
        if (this.f116652h) {
            if (!cese.f183399a.mo6606a().sensorBatchingOnWatchEnabled()) {
                return false;
            }
        } else if (!cese.f183399a.mo6606a().sensorBatchingEnabled()) {
            return false;
        }
        if (bgkx.f116729g.mo62945a(this.f116648d, num.intValue()) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo62796a(bfgt bfgt) {
        List<Sensor> sensorList;
        Integer num = (Integer) RealCollectorConfig.f150689a.get(bfgt);
        if (num != null) {
            SensorManager sensorManager = this.f116648d;
            int intValue = num.intValue();
            if (sensorManager == null || (sensorList = sensorManager.getSensorList(intValue)) == null || sensorList.size() <= 0) {
                return false;
            }
            return true;
        }
        return false;
    }
}
