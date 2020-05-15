package com.google.android.gms.nearby.discovery.fastpair.battery;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.libraries.bluetooth.fastpair.HeadsetPiece;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BatteryAdvertisement extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ahwh();

    /* renamed from: t */
    private static final int[] f80502t = {10, 11, 12};

    /* renamed from: u */
    private static final int[] f80503u = {13, 14, 15};

    /* renamed from: a */
    public String f80504a;

    /* renamed from: b */
    public byte[] f80505b;

    /* renamed from: c */
    public boolean f80506c;

    /* renamed from: d */
    public double f80507d;

    /* renamed from: e */
    public long f80508e;

    /* renamed from: f */
    public bxtx f80509f;

    /* renamed from: g */
    public String f80510g;

    /* renamed from: h */
    String f80511h;

    /* renamed from: i */
    String f80512i;

    /* renamed from: j */
    String f80513j;

    /* renamed from: k */
    public Uri f80514k;

    /* renamed from: l */
    public Uri f80515l;

    /* renamed from: m */
    public Uri f80516m;

    /* renamed from: n */
    public Uri f80517n;

    /* renamed from: o */
    public long f80518o;

    /* renamed from: p */
    String f80519p;

    /* renamed from: q */
    public boolean f80520q = false;

    /* renamed from: r */
    public boolean f80521r = false;

    /* renamed from: s */
    public int f80522s = 3;

    public BatteryAdvertisement() {
    }

    /* renamed from: a */
    public static int m67328a(byte b) {
        byte b2 = b & Byte.MAX_VALUE;
        if (b2 > 100) {
            return -1;
        }
        return b2;
    }

    /* renamed from: b */
    public static boolean m67330b(byte b) {
        return (b & 128) != 0;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f80505b.length; i++) {
            sb.append(String.format(Locale.ENGLISH, " [%d](%s, %d)", Integer.valueOf(i), Boolean.valueOf(m67330b(this.f80505b[i])), Integer.valueOf(m67328a(this.f80505b[i]))));
        }
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[8];
        objArr[0] = this.f80504a;
        objArr[1] = Double.valueOf(this.f80507d);
        objArr[2] = Long.valueOf(this.f80508e);
        if (!this.f80506c) {
            str = "show";
        } else {
            str = "hide";
        }
        objArr[3] = str;
        objArr[4] = sb;
        String str4 = this.f80510g;
        if (str4 == null) {
            str4 = "<null>";
        }
        objArr[5] = str4;
        if (!this.f80520q) {
            str2 = "no";
        } else {
            str2 = "yes";
        }
        objArr[6] = str2;
        int i2 = this.f80522s;
        if (i2 != 1) {
            str3 = i2 != 2 ? i2 != 3 ? "null" : "UNKNOWN" : "RFCOMM";
        } else {
            str3 = "BLE";
        }
        objArr[7] = str3;
        return String.format(locale, "BatteryAdvertisement, address:%s, distance:%.3fm, timestamp:%d, %s battery:%s, name:%s, shown:%s, type:%s", objArr);
    }

    public BatteryAdvertisement(String str, byte[] bArr, boolean z, double d, long j, String str2, String str3, String str4, String str5, Uri uri, Uri uri2, Uri uri3, Uri uri4, long j2, String str6) {
        this.f80504a = str;
        this.f80505b = bArr;
        this.f80506c = z;
        this.f80507d = d;
        this.f80508e = j;
        this.f80510g = str2;
        this.f80511h = str3;
        this.f80512i = str4;
        this.f80513j = str5;
        this.f80514k = uri;
        this.f80515l = uri2;
        this.f80516m = uri3;
        this.f80517n = uri4;
        this.f80518o = j2;
        this.f80519p = str6;
    }

    /* renamed from: a */
    public static void m67329a(String str, byte[] bArr, byte[] bArr2) {
        if ((bArr == null || bArr.length == 3) && bArr2.length == 3 && cfoj.m141551af()) {
            int i = Build.VERSION.SDK_INT;
            srn srn = ahsd.f67925a;
            BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str);
            for (int i2 = 0; i2 < 3; i2++) {
                int a = m67328a(bArr2[i2]);
                if (bArr == null || a != m67328a(bArr[i2])) {
                    buqx.m120258a(remoteDevice, f80502t[i2], Integer.toString(a));
                }
                boolean b = m67330b(bArr2[i2]);
                if (bArr == null || b != m67330b(bArr[i2])) {
                    buqx.m120258a(remoteDevice, f80503u[i2], Boolean.toString(b));
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 1, this.f80504a, false);
        see.m35052a(parcel, 2, this.f80505b, false);
        see.m35051a(parcel, 3, this.f80506c);
        see.m35033a(parcel, 4, this.f80507d);
        see.m35036a(parcel, 5, this.f80508e);
        see.m35046a(parcel, 6, this.f80510g, false);
        see.m35046a(parcel, 7, this.f80511h, false);
        see.m35046a(parcel, 8, this.f80512i, false);
        see.m35046a(parcel, 9, this.f80513j, false);
        see.m35040a(parcel, 10, this.f80514k, i, false);
        see.m35040a(parcel, 11, this.f80515l, i, false);
        see.m35040a(parcel, 12, this.f80516m, i, false);
        see.m35040a(parcel, 13, this.f80517n, i, false);
        see.m35036a(parcel, 14, this.f80518o);
        see.m35046a(parcel, 15, this.f80519p, false);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final TrueWirelessHeadset mo44195a() {
        if (this.f80505b.length < 3) {
            return null;
        }
        ayqw i = TrueWirelessHeadset.m94500i();
        i.mo54298b(this.f80510g);
        i.f98304a = this.f80514k;
        aypz f = HeadsetPiece.m94492f();
        f.mo54217b((int) cfog.m141277e());
        f.mo54214a(m67328a(this.f80505b[0]));
        f.mo54216a(m67330b(this.f80505b[0]));
        f.mo54215a(this.f80511h);
        f.f98222a = this.f80515l;
        i.mo54297b(f.mo54213a());
        aypz f2 = HeadsetPiece.m94492f();
        f2.mo54217b((int) cfog.m141277e());
        f2.mo54214a(m67328a(this.f80505b[1]));
        f2.mo54216a(m67330b(this.f80505b[1]));
        f2.mo54215a(this.f80512i);
        f2.f98222a = this.f80516m;
        i.mo54299c(f2.mo54213a());
        aypz f3 = HeadsetPiece.m94492f();
        f3.mo54217b((int) cfog.m141276d());
        f3.mo54214a(m67328a(this.f80505b[2]));
        f3.mo54216a(m67330b(this.f80505b[2]));
        f3.mo54215a(this.f80513j);
        f3.f98222a = this.f80517n;
        i.mo54294a(f3.mo54213a());
        i.mo54296b(this.f80508e);
        i.mo54295a(this.f80519p);
        i.mo54293a(this.f80518o);
        return i.mo54292a();
    }

    /* renamed from: a */
    public final void mo44196a(aiaa aiaa) {
        String str;
        this.f80510g = aiaa.f68520h;
        this.f80519p = aiaa.f68537y;
        byzb byzb = aiaa.f68511I;
        if (byzb == null) {
            byzb = byzb.f169045j;
        }
        if ((byzb.f169047a & 4) != 0) {
            byzb byzb2 = aiaa.f68511I;
            if (byzb2 == null) {
                byzb2 = byzb.f169045j;
            }
            bzaa bzaa = byzb2.f169050d;
            if (bzaa == null) {
                bzaa = bzaa.f169202d;
            }
            this.f80511h = bzaa.f169204a;
            byzb byzb3 = aiaa.f68511I;
            if (byzb3 == null) {
                byzb3 = byzb.f169045j;
            }
            bzaa bzaa2 = byzb3.f169050d;
            if (bzaa2 == null) {
                bzaa2 = bzaa.f169202d;
            }
            this.f80512i = bzaa2.f169205b;
            byzb byzb4 = aiaa.f68511I;
            if (byzb4 == null) {
                byzb4 = byzb.f169045j;
            }
            bzaa bzaa3 = byzb4.f169050d;
            if (bzaa3 == null) {
                bzaa3 = bzaa.f169202d;
            }
            str = bzaa3.f169206c;
        } else {
            str = "";
            this.f80511h = str;
            this.f80512i = str;
        }
        this.f80513j = str;
    }

    /* renamed from: a */
    public final void mo44197a(byte[] bArr) {
        this.f80505b = bArr;
        this.f80508e = SystemClock.elapsedRealtime();
    }
}
