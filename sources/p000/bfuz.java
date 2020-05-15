package p000;

import android.location.Location;
import android.location.LocationProvider;
import android.os.Handler;
import android.os.Looper;

/* renamed from: bfuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bfuz extends bfve {

    /* renamed from: a */
    public final bhbr f115376a;

    /* renamed from: b */
    public final bhbi f115377b;

    /* renamed from: c */
    protected final bfqw f115378c;

    /* renamed from: d */
    protected final Handler f115379d;

    /* renamed from: e */
    protected final bfpj f115380e;

    /* renamed from: f */
    protected final bfuv f115381f;

    /* renamed from: g */
    protected final bfuv f115382g;

    /* renamed from: h */
    public bfuv f115383h;

    /* renamed from: i */
    public aehy f115384i;

    public bfuz(bhbr bhbr, Looper looper, bfpj bfpj) {
        bhbi bhbi;
        if (!cevw.m138331p()) {
            bhbi = new bhbi(bhbr.f118271a);
        } else {
            bhbi = null;
        }
        this.f115376a = bhbr;
        this.f115377b = bhbi;
        if (cevw.m138331p()) {
            this.f115378c = new bfqw(bhbr);
        } else {
            this.f115378c = new bfqw(bhbi);
        }
        this.f115379d = new adzt(looper);
        this.f115380e = bfpj;
        this.f115384i = null;
        this.f115381f = new bfuw(this);
        this.f115382g = new bfuy(this);
        this.f115383h = this.f115381f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62293a() {
        LocationProvider locationProvider;
        if (this.f115428u && this.f115429v && this.f115402r < Long.MAX_VALUE) {
            bhbr bhbr = this.f115376a;
            if (cevw.m138319d()) {
                try {
                    locationProvider = bhbr.f118271a.getProvider("gps");
                } catch (SecurityException e) {
                    locationProvider = null;
                }
            } else {
                locationProvider = bhbr.f118271a.getProvider("gps");
            }
            if (locationProvider != null) {
                this.f115380e.mo26010a(18, bfpj.m97500a(this.f115402r));
                bhbi bhbi = this.f115377b;
                if (bhbi != null && !bhbi.f118239c) {
                    bhbi.f118239c = true;
                    bhbi.mo63519a();
                }
                bfqw bfqw = this.f115378c;
                bfqw.f114954d = 0;
                bfqw.f114955e = false;
                bfqw.f114956f = false;
                bfqw.f114957g = false;
                bhbr bhbr2 = bfqw.f114952b;
                if (bhbr2 != null) {
                    bhbr2.mo63532a(bfqw, bqfb.INSTANCE);
                }
                bhbi bhbi2 = bfqw.f114951a;
                if (bhbi2 != null) {
                    bhbi2.mo63520a(bfqw);
                }
                mo62305a(this.f115382g);
            }
        } else if (mo62305a(this.f115381f)) {
            bfqw bfqw2 = this.f115378c;
            bhbr bhbr3 = bfqw2.f114952b;
            if (bhbr3 != null) {
                bhbr3.mo63531a(bfqw2);
            }
            bhbi bhbi3 = bfqw2.f114951a;
            if (bhbi3 != null) {
                synchronized (bhbi3.f118237a) {
                    if (bhbi3.f118238b.remove(bfqw2) && bhbi3.f118238b.isEmpty()) {
                        bhbi3.mo63519a();
                    }
                }
            }
            bhbi bhbi4 = this.f115377b;
            if (bhbi4 != null && bhbi4.f118239c) {
                bhbi4.f118239c = false;
                synchronized (bhbi4.f118237a) {
                    bhbi4.mo63519a();
                }
            }
            this.f115380e.mo26009a(19);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Gps[");
        mo62307a(sb);
        sb.append(']');
        return sb.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(float, float):float} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x014d, code lost:
        p000.aeim.m51886a(r10, 1);
        r9.f115384i.mo9910a(com.google.android.gms.location.LocationResult.m66865a(java.util.Collections.singletonList(r10)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x015d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo62303a(Location location) {
        int i;
        if (this.f115384i != null) {
            bfqw bfqw = this.f115378c;
            synchronized (bfqw.f114953c) {
                if (!bfkm.m97133a(location)) {
                    location.setExtras(null);
                    double latitude = location.getLatitude();
                    double longitude = location.getLongitude();
                    if (latitude == 0.0d) {
                        if (longitude == 0.0d) {
                        }
                    }
                    if (latitude >= -90.0d && latitude <= 90.0d && longitude >= -180.0d && longitude <= 180.0d) {
                        if (location.hasAccuracy()) {
                            if (location.getAccuracy() > 1000.0f || location.getAccuracy() < 0.0f) {
                            }
                        }
                        if (bfqw.f114954d >= 3) {
                            bfqw.f114957g = true;
                        }
                        if (!bfqw.f114955e && location.hasAccuracy()) {
                            if (location.getAccuracy() > 0.0f) {
                                bfqw.f114955e = true;
                            }
                        }
                        if (!bfqw.f114955e && (i = bfqw.f114954d) > 0) {
                            int i2 = i - 3;
                            if (i2 >= 0) {
                                location.setAccuracy((float) ((int) (((i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? 0.0f : 0.125f : 0.25f : 0.5f : 0.75f : 1.0f) * 88.0f) + 8.0f)));
                            }
                        }
                        if (location.hasAccuracy()) {
                            location.setAccuracy(Math.max(3.9f, location.getAccuracy()));
                        }
                        if (!bfqw.f114956f && location.hasBearing()) {
                            if (location.getBearing() != 0.0f) {
                                bfqw.f114956f = true;
                            }
                        }
                        if (!bfqw.f114956f) {
                            location.removeBearing();
                        }
                        if (bfqw.f114957g) {
                            int i3 = bfqw.f114954d;
                            if (i3 != 0) {
                                if (i3 < 5 && location.getAccuracy() < 96.0f) {
                                    location.setAccuracy(96.0f);
                                }
                            }
                        }
                        if (location.hasSpeed() && location.getSpeed() > 100.0f) {
                            location.removeSpeed();
                        }
                        if (cevw.f183465a.mo6606a().g2kRolloverCorrection() && Math.abs((System.currentTimeMillis() - location.getTime()) - 619315200000L) < 86400000) {
                            location.setTime(location.getTime() + 619315200000L);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo62304a(bhbh bhbh) {
        bhbi bhbi = this.f115377b;
        if (bhbi != null) {
            bhbi.mo63520a(bhbh);
        }
    }

    /* renamed from: a */
    public boolean mo62305a(bfuv bfuv) {
        bfuv bfuv2 = this.f115383h;
        if (bfuv != bfuv2) {
            bfuv2.mo62297b();
            this.f115383h = bfuv;
            bfuv.mo62296a();
            return true;
        }
        bfuv2.mo62298c();
        return false;
    }
}
