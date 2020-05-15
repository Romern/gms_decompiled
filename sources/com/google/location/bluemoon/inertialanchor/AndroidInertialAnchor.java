package com.google.location.bluemoon.inertialanchor;

import android.hardware.GeomagneticField;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.io.PrintWriter;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AndroidInertialAnchor extends InertialAnchorBase {

    /* renamed from: a */
    Handler f191716a = null;

    /* renamed from: b */
    Handler f191717b = null;

    /* renamed from: c */
    Pose f191718c = Pose.m151141a();

    /* renamed from: d */
    public ThreeAxisCalibrationData f191719d = new ThreeAxisCalibrationData(btwl.SENSOR_TYPE_UNSPECIFIED, bsdw.f144226a);

    /* renamed from: e */
    public boolean f191720e = false;

    /* renamed from: f */
    public Location f191721f = null;

    /* renamed from: n */
    private final String f191722n;

    /* renamed from: o */
    private btvm f191723o = null;

    /* renamed from: p */
    private boolean f191724p = false;

    /* renamed from: q */
    private final bmzi f191725q = bmzn.m108681a(btva.f152591a);

    /* renamed from: r */
    private final ReentrantLock f191726r = new ReentrantLock();

    /* renamed from: s */
    private final btvj f191727s = new btvj(this.f191729h);

    public AndroidInertialAnchor(btvi btvi) {
        super(btvi.f152608a, btvi.f152612e);
        Handler handler = btvi.f152609b;
        this.f191717b = handler == null ? new adzt(Looper.getMainLooper()) : handler;
        this.f191722n = btvi.f152610c;
        this.f191724p = btvi.f152611d;
        if (cexz.f183503a.mo6606a().useMagFieldTracker()) {
            this.f191723o = new btvm();
        }
        if (cexz.m138405d()) {
            this.f191734m = btvi.f152614g;
        }
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static btvi m151130a() {
        return new btvi();
    }

    /* renamed from: b */
    public final boolean mo86636b() {
        return this.f191728g.isSupported(mo86647e());
    }

    /* renamed from: c */
    public final void mo86637c() {
        btvp btvp;
        byte[] clientLog;
        if (cexz.m138405d() && (btvp = this.f191734m) != null && btvp.mo72444a() && (clientLog = this.f191728g.getClientLog(mo86647e())) != null) {
            try {
                bxvd da = bplj.f138100c.mo74144da();
                da.mo73635b(clientLog, bxus.m123744c());
                btvp btvp2 = this.f191734m;
                bplj bplj = (bplj) da.mo74062i();
                if (cexz.m138405d() && btvp2.mo72444a() && ((double) btvp2.f152631c.nextFloat()) < cexz.f183503a.mo6606a().clearcutLogSamplingRate()) {
                    btvp2.f152633e.mo24673E().mo50373a(new btvo(btvp2, bplj));
                }
            } catch (bxwf e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() == 0) {
                    new String("Inertial Anchor Clearcut not uploaded, log bytes parse error.");
                } else {
                    "Inertial Anchor Clearcut not uploaded, log bytes parse error.".concat(valueOf);
                }
            }
        }
        if (this.f191729h.isEmpty()) {
            throw new IllegalStateException("Listener list is empty.");
        } else if (mo86636b()) {
            this.f191726r.lock();
            try {
                this.f191728g.setMainThreadJniEnv(mo86647e());
                this.f191720e = true;
                this.f191717b.post(new btvb(this));
            } finally {
                this.f191726r.unlock();
            }
        } else {
            throw new IllegalStateException("Device is not supported.");
        }
    }

    /* renamed from: d */
    public final void mo86638d() {
        this.f191726r.lock();
        try {
            synchronized (this.f191733l) {
                this.f191717b.post(new btvc(this, this.f191732k));
            }
            this.f191726r.unlock();
        } catch (Throwable th) {
            this.f191726r.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public void onBearingUpdate(float f, float f2, long j) {
        if (this.f191726r.tryLock()) {
            this.f191716a.post(new btvh(this, f, f2, j));
            this.f191726r.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public void onCalibrationUpdate() {
        if (this.f191726r.tryLock()) {
            this.f191716a.post(new btvf(this));
            this.f191726r.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public void onCarryChangeUpdate(long j, long j2, long j3, float f) {
        if (this.f191726r.tryLock()) {
            this.f191716a.post(new btvg(this, j3, f));
            this.f191726r.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public void onFilterReInit(long j) {
        if (this.f191726r.tryLock()) {
            this.f191716a.post(new btvd(this, j));
            this.f191726r.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public void onPoseRateChange(float f) {
        if (this.f191726r.tryLock()) {
            this.f191716a.post(new btve(this, f));
            this.f191726r.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public void onPoseUpdate() {
        ReentrantLock reentrantLock;
        if (this.f191726r.tryLock()) {
            try {
                Pose pose = this.f191718c;
                if (pose == null) {
                    throw new IllegalArgumentException("outPose cannot be null.");
                } else if (this.f191728g.getLatestPose(mo86647e(), pose)) {
                    ((Boolean) this.f191725q.mo6606a()).booleanValue();
                    Pose pose2 = this.f191718c;
                    if (pose2 != null) {
                        btvj btvj = this.f191727s;
                        btvj.f152616a = pose2;
                        this.f191716a.post(btvj);
                    }
                    reentrantLock = this.f191726r;
                    reentrantLock.unlock();
                } else {
                    throw new IllegalStateException("Error occurred when querying pose from native.");
                }
            } catch (IllegalArgumentException | IllegalStateException e) {
                e.getMessage();
                reentrantLock = this.f191726r;
            } catch (Throwable th) {
                this.f191726r.unlock();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void mo86633a(Location location) {
        if (location != null) {
            btvm btvm = this.f191723o;
            if (btvm == null) {
                Location location2 = this.f191721f;
                if (location2 == null || location2.distanceTo(location) >= 100000.0f) {
                    GeomagneticField geomagneticField = new GeomagneticField((float) location.getLatitude(), (float) location.getLongitude(), (float) location.getAltitude(), location.getTime());
                    bxvd da = btwc.f152687b.mo74144da();
                    bxvd da2 = btwf.f152696d.mo74144da();
                    double radians = Math.toRadians((double) geomagneticField.getDeclination());
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    ((btwf) da2.f164949b).f152700c = radians;
                    double radians2 = Math.toRadians((double) geomagneticField.getInclination());
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    ((btwf) da2.f164949b).f152699b = radians2;
                    double fieldStrength = (double) geomagneticField.getFieldStrength();
                    Double.isNaN(fieldStrength);
                    double d = fieldStrength * 0.001d;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    ((btwf) da2.f164949b).f152698a = d;
                    btwf btwf = (btwf) da2.mo74062i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    btwf.getClass();
                    ((btwc) da.f164949b).f152689a = btwf;
                    mo86646a((btwc) da.mo74062i());
                    this.f191721f = location;
                    return;
                }
                return;
            }
            btwc a = btvm.mo72443a(location);
            if (a != null) {
                mo86646a(a);
            }
        }
    }

    /* renamed from: a */
    public final void mo86634a(btvl btvl, Handler handler) {
        if (btvl != null) {
            synchronized (this.f191729h) {
                this.f191729h.add(btvl);
            }
            if (handler == null) {
                handler = new adzt(Looper.getMainLooper());
            }
            this.f191716a = handler;
            return;
        }
        throw new IllegalArgumentException("listener cannot be null.");
    }

    /* renamed from: a */
    public final void mo86635a(PrintWriter printWriter) {
        if (this.f191724p) {
            printWriter.println(String.format("### %s START ###", this.f191722n));
            try {
                byte[] debugLog = this.f191728g.getDebugLog(mo86647e());
                if (debugLog != null) {
                    btvt btvt = (btvt) GeneratedMessageLite.m124014a(btvt.f152640a, debugLog);
                    printWriter.println("IA_LOG: OK");
                    printWriter.println(boan.f132470d.mo68794a(debugLog));
                } else {
                    printWriter.println("IA_LOG: PROTO_NULL");
                }
            } catch (bxwf e) {
                e.getMessage();
                printWriter.println("IA_LOG: PROTO_ERROR");
            }
            printWriter.println(String.format("### %s STOP ###", this.f191722n));
            printWriter.println("");
        }
    }
}
