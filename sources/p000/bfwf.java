package p000;

import android.app.PendingIntent;
import android.location.Location;
import com.google.android.gms.location.internal.ParcelableGeofence;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Locale;

/* renamed from: bfwf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfwf {

    /* renamed from: a */
    public final ParcelableGeofence f115483a;

    /* renamed from: b */
    public final PendingIntent f115484b;

    /* renamed from: c */
    public final String f115485c;

    /* renamed from: d */
    public final int f115486d;

    /* renamed from: e */
    public byte f115487e;

    /* renamed from: f */
    public boolean f115488f = true;

    /* renamed from: g */
    public long f115489g = -1;

    /* renamed from: h */
    public boolean f115490h;

    /* renamed from: i */
    public boolean f115491i;

    /* renamed from: j */
    public final int f115492j;

    /* renamed from: k */
    public final bfwl f115493k;

    /* renamed from: l */
    private double f115494l;

    public bfwf(ParcelableGeofence parcelableGeofence, int i, PendingIntent pendingIntent, int i2, String str) {
        float f;
        int i3;
        ParcelableGeofence parcelableGeofence2;
        ParcelableGeofence parcelableGeofence3 = parcelableGeofence;
        boolean z = true;
        boolean z2 = false;
        this.f115490h = false;
        this.f115491i = false;
        this.f115494l = -1.0d;
        this.f115487e = 0;
        if (cesn.m138187b()) {
            float f2 = parcelableGeofence3.f79443f;
            float geofenceMinimumRadiusMeters = (float) ((int) cesn.f183405a.mo6606a().geofenceMinimumRadiusMeters());
            z2 = f2 < geofenceMinimumRadiusMeters ? true : z2;
            if (f2 >= geofenceMinimumRadiusMeters) {
                f = f2;
            } else {
                f = geofenceMinimumRadiusMeters;
            }
            int i4 = parcelableGeofence3.f79445h;
            int geofenceMinimumResponsivenessMillis = (int) cesn.f183405a.mo6606a().geofenceMinimumResponsivenessMillis();
            if (i4 >= geofenceMinimumResponsivenessMillis) {
                z = z2;
                i3 = i4;
            } else {
                i3 = geofenceMinimumResponsivenessMillis;
            }
            if (z) {
                parcelableGeofence2 = new ParcelableGeofence(parcelableGeofence3.f79438a, parcelableGeofence3.f79444g, parcelableGeofence3.f79440c, parcelableGeofence3.f79441d, parcelableGeofence3.f79442e, f, parcelableGeofence3.f79439b, i3, parcelableGeofence3.f79446i);
            } else {
                parcelableGeofence2 = parcelableGeofence3;
            }
            this.f115483a = parcelableGeofence2;
        } else {
            this.f115483a = parcelableGeofence3;
        }
        this.f115484b = pendingIntent;
        this.f115486d = i;
        this.f115493k = new bfwl(parcelableGeofence3);
        this.f115492j = i2;
        this.f115485c = str;
    }

    /* renamed from: b */
    public static byte m98039b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return 0;
        }
        byte b = 1;
        if (i2 != 1) {
            b = 2;
            if (i2 != 2) {
                b = 3;
                if (i2 != 3) {
                    return 4;
                }
            }
        }
        return b;
    }

    /* renamed from: b */
    static int m98040b(byte b) {
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return 2;
        }
        if (b != 2) {
            return b != 3 ? 5 : 4;
        }
        return 3;
    }

    /* renamed from: g */
    private final String m98041g() {
        String a;
        PendingIntent pendingIntent = this.f115484b;
        return (pendingIntent == null || (a = bhcb.m100621a(pendingIntent)) == null) ? "<null>" : a;
    }

    /* renamed from: a */
    public final byte mo62348a(byte b) {
        return b != 1 ? b != 2 ? (b == 4 && (this.f115483a.f79444g & 4) != 0) ? (byte) 4 : 0 : (this.f115483a.f79444g & 2) != 0 ? (byte) 2 : 0 : (this.f115483a.f79444g & 1) != 0 ? (byte) 1 : 0;
    }

    /* renamed from: a */
    public final short mo62353a() {
        return this.f115493k.f115513b;
    }

    /* renamed from: c */
    public final boolean mo62355c() {
        return ((this.f115483a.f79444g & 4) == 0 || this.f115489g == -1 || this.f115490h) ? false : true;
    }

    /* renamed from: d */
    public final int mo62356d() {
        return !mo62355c() ? Integer.MAX_VALUE : 60;
    }

    /* renamed from: e */
    public final bfyf mo62357e() {
        bxvd f = mo62358f();
        String g = m98041g();
        if (f.f164950c) {
            f.mo74035c();
            f.f164950c = false;
        }
        bfyf bfyf = (bfyf) f.f164949b;
        bfyf bfyf2 = bfyf.f115676l;
        g.getClass();
        bfyf.f115678a |= 512;
        bfyf.f115688k = g;
        return (bfyf) f.mo74062i();
    }

    /* renamed from: f */
    public final bxvd mo62358f() {
        bxvd da = bfyf.f115676l.mo74144da();
        bxvd da2 = bfye.f115663l.mo74144da();
        String str = this.f115483a.f79438a;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bfye bfye = (bfye) da2.f164949b;
        str.getClass();
        int i = bfye.f115665a | 32;
        bfye.f115665a = i;
        bfye.f115671g = str;
        ParcelableGeofence parcelableGeofence = this.f115483a;
        double d = parcelableGeofence.f79441d;
        int i2 = i | 2;
        bfye.f115665a = i2;
        bfye.f115667c = d;
        double d2 = parcelableGeofence.f79442e;
        int i3 = i2 | 4;
        bfye.f115665a = i3;
        bfye.f115668d = d2;
        float f = parcelableGeofence.f79443f;
        int i4 = i3 | 8;
        bfye.f115665a = i4;
        bfye.f115669e = f;
        short s = parcelableGeofence.f79440c;
        if (s == 1) {
            bfye.f115666b = 1;
            int i5 = i4 | 1;
            bfye.f115665a = i5;
            long j = parcelableGeofence.f79439b;
            int i6 = i5 | 16;
            bfye.f115665a = i6;
            bfye.f115670f = j;
            int i7 = parcelableGeofence.f79444g;
            int i8 = i6 | 64;
            bfye.f115665a = i8;
            bfye.f115672h = i7;
            int i9 = parcelableGeofence.f79445h;
            int i10 = i8 | 128;
            bfye.f115665a = i10;
            bfye.f115673i = i9;
            int i11 = parcelableGeofence.f79446i;
            int i12 = i10 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bfye.f115665a = i12;
            bfye.f115674j = i11;
            int i13 = this.f115486d;
            bfye.f115665a = i12 | 512;
            bfye.f115675k = i13;
            bfye bfye2 = (bfye) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bfyf bfyf = (bfyf) da.f164949b;
            bfye2.getClass();
            bfyf.f115679b = bfye2;
            bfyf.f115678a |= 1;
            int b = m98040b(this.f115493k.f115513b);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bfyf bfyf2 = (bfyf) da.f164949b;
            bfyf2.f115681d = b - 1;
            bfyf2.f115678a |= 4;
            int b2 = m98040b(this.f115487e);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bfyf bfyf3 = (bfyf) da.f164949b;
            bfyf3.f115682e = b2 - 1;
            int i14 = bfyf3.f115678a | 8;
            bfyf3.f115678a = i14;
            long j2 = this.f115489g;
            int i15 = i14 | 16;
            bfyf3.f115678a = i15;
            bfyf3.f115683f = j2;
            boolean z = this.f115490h;
            int i16 = i15 | 32;
            bfyf3.f115678a = i16;
            bfyf3.f115684g = z;
            boolean z2 = this.f115491i;
            int i17 = i16 | 64;
            bfyf3.f115678a = i17;
            bfyf3.f115685h = z2;
            int i18 = this.f115492j;
            int i19 = i17 | 128;
            bfyf3.f115678a = i19;
            bfyf3.f115686i = i18;
            String str2 = this.f115485c;
            str2.getClass();
            bfyf3.f115678a = i19 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bfyf3.f115687j = str2;
            return da;
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("Type ");
        sb.append((int) s);
        sb.append(" not supported.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        bfwl bfwl = this.f115493k;
        byte b = bfwl.f115513b;
        if (b != 1) {
            str = b != 2 ? b != 3 ? b != 4 ? "?" : "STATE_OUTSIDE_LOW_CONFIDENCE" : "STATE_INSIDE_LOW_CONFIDENCE" : "OUT";
        } else {
            str = "IN";
        }
        if (bfwl.f115514c != Double.MAX_VALUE) {
            str2 = String.format(Locale.US, "%.0f", Double.valueOf(this.f115493k.f115514c));
        } else {
            str2 = "UNKNOWN";
        }
        if (!this.f115490h) {
            str3 = "";
        } else {
            str3 = " dwelled";
        }
        return String.format(Locale.US, "%s it=%d, d=%s %s%s %s", this.f115483a.toString(), Integer.valueOf(this.f115486d), str2, str, str3, m98041g());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        if ((r8.f115486d & 2) != 0) goto L_0x0063;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0077  */
    /* renamed from: a */
    public final byte mo62349a(long j, Location location) {
        boolean z;
        this.f115488f = true;
        this.f115493k.mo62378a(location);
        byte b = this.f115493k.f115513b;
        byte b2 = 0;
        if (b == 1 || b == 2) {
            if (b != 1) {
                this.f115489g = -1;
                this.f115490h = false;
                z = false;
            } else {
                if (!this.f115490h) {
                    long j2 = this.f115489g;
                    if (j2 == -1) {
                        this.f115489g = j;
                    } else if (j - j2 < ((long) this.f115483a.f79446i)) {
                        boolean z2 = bfxc.f115575a;
                        z = false;
                    } else {
                        this.f115490h = true;
                        this.f115489g = -1;
                        boolean z3 = bfxc.f115575a;
                        z = true;
                    }
                }
                z = false;
            }
            byte b3 = this.f115487e;
            if (b3 == 0) {
                this.f115487e = b;
                if (b != 1 || (this.f115486d & 1) == 0) {
                    if (b == 2) {
                    }
                    if (z) {
                        if (this.f115491i) {
                            b2 = 4;
                        } else if ((this.f115486d & 4) != 0) {
                            b2 = 4;
                        }
                    }
                    if (b == 2) {
                        this.f115491i = true;
                    }
                } else {
                    b2 = 1;
                    if (z) {
                    }
                    if (b == 2) {
                    }
                }
            } else {
                if (b3 != b) {
                    this.f115487e = b;
                    if (b == 1) {
                        b2 = 1;
                    }
                }
                if (z) {
                }
                if (b == 2) {
                }
            }
            b2 = 2;
            if (z) {
            }
            if (b == 2) {
            }
        }
        return mo62348a(b2);
    }

    /* renamed from: b */
    public final double mo62354b() {
        if (Double.compare(this.f115493k.f115514c, Double.MAX_VALUE) == 0) {
            return Double.MAX_VALUE;
        }
        double d = (double) this.f115483a.f79443f;
        double d2 = this.f115493k.f115514c;
        Double.isNaN(d);
        return Math.abs(d - d2);
    }

    /* renamed from: a */
    public final double mo62350a(Location location) {
        if (location == null) {
            return this.f115494l;
        }
        ParcelableGeofence parcelableGeofence = this.f115483a;
        double b = ayuo.m84846b(parcelableGeofence.f79441d, parcelableGeofence.f79442e, location.getLatitude(), location.getLongitude());
        double d = (double) this.f115483a.f79443f;
        Double.isNaN(d);
        double abs = Math.abs(d - b);
        this.f115494l = abs;
        return abs;
    }

    /* renamed from: a */
    public final int mo62351a(double d) {
        double b = mo62354b();
        if (b == Double.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (d == 0.0d) {
            d = 1.0E-20d;
        }
        double d2 = b / d;
        double d3 = (double) (this.f115483a.f79445h / 1000);
        Double.isNaN(d3);
        double d4 = d2 + d3;
        if (d4 < 2.147483646E9d) {
            return (int) d4;
        }
        return 2147483646;
    }

    /* renamed from: a */
    public final bues mo62352a(int i) {
        ParcelableGeofence parcelableGeofence = this.f115483a;
        bxvd da = bues.f153631l.mo74144da();
        int i2 = (int) (parcelableGeofence.f79441d * 1.0E7d);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bues bues = (bues) da.f164949b;
        int i3 = bues.f153633a | 1;
        bues.f153633a = i3;
        bues.f153634b = i2;
        double d = parcelableGeofence.f79442e;
        int i4 = i3 | 2;
        bues.f153633a = i4;
        bues.f153635c = (int) (d * 1.0E7d);
        float f = parcelableGeofence.f79443f;
        int i5 = i4 | 4;
        bues.f153633a = i5;
        bues.f153636d = (int) f;
        int i6 = parcelableGeofence.f79445h;
        int i7 = i5 | 8;
        bues.f153633a = i7;
        bues.f153637e = (int) (((long) i6) / 1000);
        int i8 = parcelableGeofence.f79446i;
        int i9 = i7 | 16;
        bues.f153633a = i9;
        bues.f153638f = (int) (((long) i8) / 1000);
        int i10 = parcelableGeofence.f79444g;
        int i11 = i9 | 32;
        bues.f153633a = i11;
        bues.f153639g = i10;
        int i12 = this.f115486d;
        int i13 = i11 | 128;
        bues.f153633a = i13;
        bues.f153641i = i10 & i12;
        int i14 = i13 | 64;
        bues.f153633a = i14;
        bues.f153640h = i;
        int i15 = this.f115492j;
        bues.f153633a = i14 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        bues.f153642j = i15;
        bxvd da2 = bufe.f153679f.mo74144da();
        byte b = this.f115493k.f115513b;
        if (b == 0) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bufe bufe = (bufe) da2.f164949b;
            bufe.f153682b = 0;
            bufe.f153681a |= 1;
        } else if (b == 1) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bufe bufe2 = (bufe) da2.f164949b;
            bufe2.f153682b = 1;
            bufe2.f153681a |= 1;
        } else if (b != 2) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bufe bufe3 = (bufe) da2.f164949b;
            bufe3.f153682b = 3;
            bufe3.f153681a |= 1;
        } else {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bufe bufe4 = (bufe) da2.f164949b;
            bufe4.f153682b = 2;
            bufe4.f153681a |= 1;
        }
        byte b2 = this.f115487e;
        if (b2 == 0) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bufe bufe5 = (bufe) da2.f164949b;
            bufe5.f153683c = 0;
            bufe5.f153681a = 2 | bufe5.f153681a;
        } else if (b2 != 1) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bufe bufe6 = (bufe) da2.f164949b;
            bufe6.f153683c = 2;
            bufe6.f153681a = 2 | bufe6.f153681a;
        } else if (this.f115490h) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bufe bufe7 = (bufe) da2.f164949b;
            bufe7.f153683c = 3;
            bufe7.f153681a = 2 | bufe7.f153681a;
        } else {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bufe bufe8 = (bufe) da2.f164949b;
            bufe8.f153683c = 1;
            bufe8.f153681a = 2 | bufe8.f153681a;
        }
        if (mo62355c()) {
            int i16 = (int) (this.f115489g / 1000);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bufe bufe9 = (bufe) da2.f164949b;
            bufe9.f153681a |= 4;
            bufe9.f153684d = i16;
        } else {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bufe bufe10 = (bufe) da2.f164949b;
            bufe10.f153681a |= 4;
            bufe10.f153684d = -1;
        }
        boolean z = this.f115491i;
        bufe bufe11 = (bufe) da2.f164949b;
        bufe11.f153681a |= 8;
        bufe11.f153685e = z;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bues bues2 = (bues) da.f164949b;
        bufe bufe12 = (bufe) da2.mo74062i();
        bufe12.getClass();
        bues2.f153643k = bufe12;
        bues2.f153633a |= 512;
        return (bues) da.mo74062i();
    }
}
