package p000;

import android.location.Location;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.location.LocationAvailability;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: bfzi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfzi extends bfzc {

    /* renamed from: d */
    final /* synthetic */ bfzt f115769d;

    /* renamed from: e */
    private int f115770e;

    /* renamed from: f */
    private boolean f115771f = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfzi(bfzt bfzt, bfyy bfyy) {
        super(bfzt, bfyy);
        this.f115769d = bfzt;
    }

    /* renamed from: a */
    public final bpms mo62472a() {
        return bpms.FAST_MOVING_ACTIVITY;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo62473b() {
        return !this.f115763b.mo62463b(150000.0d / mo62479h()) ? 300 : -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo62474c() {
        if (this.f115771f && this.f115770e == 2) {
            return -1;
        }
        if (this.f115763b.mo62460a()) {
            return 60;
        }
        if (!this.f115763b.mo62463b(150000.0d / mo62479h())) {
            return Math.max(20, Math.min(1800, this.f115763b.f115743a));
        }
        return 1800;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo62475d() {
        int i = this.f115763b.f115744b;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i;
    }

    /* renamed from: g */
    public final String mo62478g() {
        return "FastMovingActivityState";
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final double mo62479h() {
        double d;
        boolean a = this.f115763b.f115745c.mo62389a(SystemClock.elapsedRealtime(), 360000, 180000, 3);
        if (!a) {
            bfwo bfwo = this.f115763b.f115745c;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int size = bfwo.f115521a.size() - 1;
            Pair pair = null;
            Pair pair2 = null;
            while (true) {
                if (size < 0) {
                    break;
                }
                Pair pair3 = (Pair) bfwo.f115521a.get(size);
                if (((Location) pair3.second).getAccuracy() <= 80.0f) {
                    if (pair2 == null) {
                        pair2 = pair3;
                    } else if (((Long) pair2.first).longValue() - ((Long) pair3.first).longValue() >= 10000) {
                        pair = pair3;
                        break;
                    }
                }
                size--;
            }
            d = 22.22d;
            if (pair2 != null && pair != null && elapsedRealtime - ((Long) pair2.first).longValue() <= 150000 && ((Long) pair2.first).longValue() - ((Long) pair.first).longValue() <= 150000) {
                double b = ayuo.m84846b(((Location) pair2.second).getLatitude(), ((Location) pair2.second).getLongitude(), ((Location) pair.second).getLatitude(), ((Location) pair.second).getLongitude());
                double longValue = (double) (((Long) pair2.first).longValue() - ((Long) pair.first).longValue());
                Double.isNaN(longValue);
                double d2 = longValue / 1000.0d;
                if (d2 >= 10.0d) {
                    d = Math.min(22.22d, Math.max(9.72d, b / d2));
                    boolean z = bfxc.f115575a;
                }
            }
        } else {
            d = 1.5d;
        }
        if (a) {
            boolean z2 = bfxc.f115575a;
        }
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo62493i() {
        if (!this.f115771f || this.f115770e != 2) {
            this.f115770e = 3;
            return;
        }
        this.f115770e = 3;
        this.f115763b.f115755m.mo62443a();
        bxvd bxvd = this.f115769d.f115791D;
        if (bxvd != null) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpmn bpmn = (bpmn) bxvd.f164949b;
            bpmn bpmn2 = bpmn.f138303g;
            bpmn.f138305a |= 8;
            bpmn.f138309e = false;
        }
        mo62492d(true);
    }

    /* renamed from: k */
    public final void mo62503k() {
        super.mo62503k();
        boolean b = cexq.m138396b();
        this.f115771f = b;
        if (b) {
            this.f115770e = !this.f115769d.f115819x.mo62523b() ? 3 : 1;
        }
    }

    /* renamed from: l */
    public final void mo62504l() {
        if (this.f115771f) {
            this.f115763b.f115755m.mo62443a();
            bxvd bxvd = this.f115769d.f115791D;
            if (bxvd != null) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpmn bpmn = (bpmn) bxvd.f164949b;
                bpmn bpmn2 = bpmn.f138303g;
                bpmn.f138305a |= 8;
                bpmn.f138309e = false;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62482a(LocationAvailability locationAvailability) {
        if (this.f115770e != 2) {
            super.mo62482a(locationAvailability);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo62492d(boolean z) {
        if (this.f115771f) {
            int i = 3;
            if (this.f115770e != 3) {
                bfyy bfyy = this.f115763b;
                bfyr bfyr = bfyy.f115755m;
                List b = bfyy.mo62462b(50);
                Pair pair = this.f115763b.f115745c.f115522b;
                if (b == null || pair == null) {
                    this.f115770e = 1;
                } else {
                    boolean a = bfyr.mo62444a(b, (Location) pair.second, z);
                    bxvd bxvd = this.f115769d.f115791D;
                    if (bxvd != null) {
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        bpmn bpmn = (bpmn) bxvd.f164949b;
                        bpmn bpmn2 = bpmn.f138303g;
                        bpmn.f138305a |= 8;
                        bpmn.f138309e = true;
                    }
                    if (a) {
                        i = 2;
                    }
                    this.f115770e = i;
                }
            }
        }
        super.mo62492d(z);
    }

    /* renamed from: a */
    public final void mo62498a(PrintWriter printWriter) {
        super.mo62498a(printWriter);
        int i = this.f115770e;
        String str = i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "HARDWARE_GEOFENCE_STATE_NOT_AVAILABLE" : "HARDWARE_GEOFENCE_STATE_IN_USE" : "HARDWARE_GEOFENCE_STATE_NOT_ATTEMPTED";
        printWriter.print(str.length() == 0 ? new String("\n    Using hardware geofencing=") : "\n    Using hardware geofencing=".concat(str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo62488a(boolean z) {
        if (!this.f115771f || cexq.f183497a.mo6606a().useHardwareGeofenceWhenUnavailable()) {
            return false;
        }
        if (!z) {
            if (this.f115770e == 2) {
                this.f115770e = 3;
                this.f115763b.f115755m.mo62443a();
                bxvd bxvd = this.f115769d.f115791D;
                if (bxvd != null) {
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bpmn bpmn = (bpmn) bxvd.f164949b;
                    bpmn bpmn2 = bpmn.f138303g;
                    bpmn.f138305a |= 8;
                    bpmn.f138309e = false;
                }
                mo62492d(true);
            }
        } else if (this.f115770e != 2) {
            this.f115770e = 1;
            mo62492d(true);
        }
        return true;
    }
}
