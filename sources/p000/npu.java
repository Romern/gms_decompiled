package p000;

import android.location.Location;
import android.os.SystemClock;
import com.google.android.gms.car.CarSensorEvent;

/* renamed from: npu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class npu implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CarSensorEvent f36352a;

    /* renamed from: b */
    final /* synthetic */ npx f36353b;

    public npu(npx npx, CarSensorEvent carSensorEvent) {
        this.f36353b = npx;
        this.f36352a = carSensorEvent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:128:0x0348  */
    public final void run() {
        boolean z;
        long j;
        Location location;
        int i;
        int i2;
        boolean z2;
        boolean z3;
        CarSensorEvent carSensorEvent = this.f36352a;
        Location location2 = this.f36353b.f36367k;
        carSensorEvent.mo17332a(10);
        if (location2 == null) {
            location2 = new Location("Car-GPS");
        }
        byte[] bArr = carSensorEvent.f29367e;
        byte b = bArr[0];
        if ((b & 1) != 0) {
            if (carSensorEvent.f29363a < 2) {
                location2.setLatitude((double) carSensorEvent.f29366d[0]);
            } else {
                double a = (double) CarSensorEvent.m22069a(bArr, 1);
                Double.isNaN(a);
                location2.setLatitude(a * 1.0E-7d);
            }
        }
        if ((b & 2) != 0) {
            if (carSensorEvent.f29363a >= 2) {
                double a2 = (double) CarSensorEvent.m22069a(carSensorEvent.f29367e, 5);
                Double.isNaN(a2);
                location2.setLongitude(a2 * 1.0E-7d);
            } else {
                location2.setLongitude((double) carSensorEvent.f29366d[1]);
            }
        }
        if ((b & 4) != 0) {
            location2.setAccuracy(carSensorEvent.f29366d[2]);
        }
        if ((b & 8) != 0) {
            location2.setAltitude((double) carSensorEvent.f29366d[3]);
        }
        if ((b & 16) != 0) {
            location2.setSpeed(carSensorEvent.f29366d[4]);
        }
        if ((b & 32) != 0) {
            location2.setBearing(carSensorEvent.f29366d[5]);
        }
        location2.setElapsedRealtimeNanos(carSensorEvent.f29365c);
        location2.setTime(System.currentTimeMillis() - ((SystemClock.elapsedRealtimeNanos() - carSensorEvent.f29365c) / 1000000));
        npx npx = this.f36353b;
        Location location3 = npx.f36367k;
        if (location3.hasBearing() && (!location3.hasSpeed() || location3.getSpeed() <= 1.0f)) {
            location3.removeBearing();
        }
        if (location3.hasSpeed()) {
            if (npx.f36361e) {
                location3.removeSpeed();
            } else if (location3.getSpeed() >= 70.0f || location3.getSpeed() < 0.0f) {
                location3.removeSpeed();
                npx.f36361e = true;
            }
        }
        if (location3.hasAccuracy()) {
            if (npx.f36362f) {
                location3.removeAccuracy();
            } else if (location3.getAccuracy() <= 1.0f || location3.getAccuracy() >= 500.0f) {
                npx.f36362f = true;
                location3.removeAccuracy();
            }
        }
        if (!location3.hasAccuracy()) {
            location3.setAccuracy(5.67f);
        }
        if (npx.f36363g != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            j = location3.getTime() - npx.f36363g.getTime();
            if (j < 500 || j >= 2000) {
                z = false;
            } else {
                z = true;
            }
        } else {
            j = 0;
        }
        if (z) {
            float distanceTo = npx.f36363g.distanceTo(location3);
            float bearingTo = npx.f36363g.bearingTo(location3);
            if (!location3.hasSpeed() || location3.getSpeed() >= 1.0f) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!location3.hasBearing()) {
                if (!z3 && distanceTo > 2.0f) {
                    location3.setBearing(bearingTo);
                } else if (npx.f36363g.hasBearing()) {
                    location3.setBearing(npx.f36363g.getBearing());
                }
            }
            if (!location3.hasSpeed() && distanceTo > 2.0f) {
                location3.setSpeed((distanceTo / ((float) j)) * 1000.0f);
            }
        }
        Location location4 = npx.f36363g;
        npx.f36363g = location3;
        npx.f36367k = (Location) ooe.m29303a(location4).mo22382a(nps.f36350a);
        npx npx2 = this.f36353b;
        npx2.mo21435a(npx2.f36363g);
        if (this.f36353b.f36363g.hasSpeed() && this.f36353b.f36363g.getSpeed() > 0.5f) {
            this.f36353b.f36364h.set(false);
        }
        npx npx3 = this.f36353b;
        if ("auto".equals(npx3.mo21441b()) && ((location = npx3.f36370n) == null || Math.abs(location.getTime() - npx3.f36363g.getTime()) <= 120000 || Math.abs(npx3.f36370n.getLatitude() - npx3.f36363g.getLatitude()) >= 0.1d || Math.abs(npx3.f36370n.getLongitude() - npx3.f36363g.getLongitude()) >= 0.1d)) {
            oll oll = npx3.f36368l;
            Location location5 = npx3.f36363g;
            long time = location5.getTime();
            double latitude = location5.getLatitude();
            float longitude = (((float) location5.getLongitude()) * 6.2831855f) / 360.0f;
            double d = (double) ((((float) latitude) * 6.2831855f) / 360.0f);
            if (d > -3.141592653589793d && d < 3.141592653589793d && longitude >= -6.2831855f && longitude <= 6.2831855f && time >= 946728000000L) {
                float f = ((float) (time - 946728000000L)) / 8.64E7f;
                float f2 = ((f * 6.2831855f) / 365.25638f) + 6.24006f;
                double d2 = (double) f2;
                float sin = (((float) Math.sin(d2)) * 0.0334196f) + f2 + (((float) Math.sin((double) (f2 + f2))) * 3.49066E-4f) + (((float) Math.sin((double) (f2 * 3.0f))) * 5.236E-6f) + 1.7966f + 3.1415927f;
                double sin2 = Math.sin((double) sin);
                float f3 = sin;
                double d3 = (double) oll.f37913a;
                Double.isNaN(d3);
                double asin = (double) ((float) Math.asin(sin2 * d3));
                float sin3 = (oll.f37914b - ((float) (Math.sin(d) * Math.sin(asin)))) / ((float) (Math.cos(d) * Math.cos(asin)));
                if (sin3 < 1.0f) {
                    if (sin3 > -1.0f) {
                        float acos = (float) Math.acos((double) sin3);
                        float sin4 = f - (((((-longitude) / 6.2831855f) + 9.0E-4f) + (((float) Math.sin(d2)) * 0.0053f)) + (((float) Math.sin((double) (f3 + f3))) * -0.0069f));
                        float round = sin4 - ((float) Math.round(sin4));
                        if (round >= (-acos) / 6.2831855f) {
                            if (round > acos / 6.2831855f) {
                                i = 2;
                                i2 = npx3.f36369m;
                                npx3.f36369m = i;
                                npx3.f36370n = new Location(npx3.f36363g);
                                if (i2 != i) {
                                    if (npx3.f36369m == 2) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    npx3.mo21439a(z2, "SUN_CALCULATOR");
                                }
                            }
                        }
                    }
                }
                i = 2;
                i2 = npx3.f36369m;
                npx3.f36369m = i;
                npx3.f36370n = new Location(npx3.f36363g);
                if (i2 != i) {
                }
            }
            i = 1;
            i2 = npx3.f36369m;
            npx3.f36369m = i;
            npx3.f36370n = new Location(npx3.f36363g);
            if (i2 != i) {
            }
        }
        this.f36353b.f36365i = SystemClock.elapsedRealtime();
        npx npx4 = this.f36353b;
        npx4.mo21442c();
        npx4.mo21437a(npx4.f36371o, (long) (npx4.f36366j.nextInt(400) + 1800));
    }
}
