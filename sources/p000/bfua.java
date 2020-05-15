package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.hardware.GeomagneticField;
import android.hardware.SensorManager;
import android.location.Location;
import java.io.PrintWriter;

/* renamed from: bfua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfua extends bfuo {

    /* renamed from: a */
    final bfty f115305a;

    public bfua(Context context, bfpk bfpk, bfuf bfuf) {
        super(context);
        this.f115305a = new bfty(context, (SensorManager) context.getSystemService("sensor"), bfpk.f118291c, bfuf);
    }

    /* renamed from: a */
    public final float mo62268a() {
        bfty bfty = this.f115305a;
        if (!bfty.f115290k) {
            return Float.MAX_VALUE;
        }
        return bfty.f115287h;
    }

    /* renamed from: b */
    public final boolean mo62271b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo62272c() {
        if (!this.f115363f.isEmpty()) {
            bfty bfty = this.f115305a;
            if (!bfty.f115281b) {
                synchronized (bfty.f115289j) {
                    bfty.f115288i = bfty.f115286g.isScreenOn();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    bfty.f115284e.registerReceiver(bfty.f115285f, intentFilter);
                    bfty.f115280a = new bunk();
                    bfty.mo62264a();
                    bfty.f115281b = true;
                }
            }
            aucb l = this.f115364g.mo24756l();
            if (l != null) {
                l.mo50373a(new bftz(this));
                return;
            }
            return;
        }
        bfty bfty2 = this.f115305a;
        if (bfty2.f115281b) {
            bfty2.f115284e.unregisterReceiver(bfty2.f115285f);
            bfty2.mo62266b();
            bfty2.f115281b = false;
            bfty2.f115283d = null;
            bfty2.f115282c = 0.0f;
        }
        bfty2.mo62267c();
        bfty2.f115280a = null;
    }

    /* renamed from: a */
    public final void mo62269a(Location location) {
        bfty bfty = this.f115305a;
        if (location != null) {
            Location location2 = bfty.f115283d;
            if (location2 == null || location2.distanceTo(location) >= 100000.0f) {
                GeomagneticField geomagneticField = new GeomagneticField((float) location.getLatitude(), (float) location.getLongitude(), (float) location.getAltitude(), System.currentTimeMillis());
                bfty.f115282c = bfuq.m97944b((float) Math.toRadians((double) geomagneticField.getDeclination()));
                bunk bunk = bfty.f115280a;
                if (bunk != null) {
                    float fieldStrength = geomagneticField.getFieldStrength() / 1000.0f;
                    bunk.f154367c.f154355h = fieldStrength;
                    bunk.f154374j.f154382b = fieldStrength;
                }
                bfty.f115283d = location;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62270a(PrintWriter printWriter) {
        printWriter.println("Active OrientationEngine Instance: DeviceOrientationDetectorOrientationEngine");
    }
}
