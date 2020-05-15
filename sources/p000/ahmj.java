package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ahmj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahmj {

    /* renamed from: a */
    public final ahkv f67528a;

    /* renamed from: b */
    public final byte[] f67529b;

    /* renamed from: c */
    public final ahna f67530c;

    /* renamed from: d */
    public final int f67531d;

    /* renamed from: e */
    public final boolean f67532e;

    /* renamed from: f */
    public final long f67533f;

    /* renamed from: g */
    public final aify f67534g;

    /* renamed from: h */
    public final boolean f67535h;

    /* renamed from: i */
    public final byte[] f67536i;

    /* renamed from: j */
    public final List f67537j;

    /* renamed from: k */
    public final bqgy f67538k;

    /* renamed from: l */
    public byse f67539l;

    public ahmj(ahkv ahkv, byte[] bArr, ahna ahna, int i, boolean z, long j, byte[] bArr2, aify aify, bqgy bqgy, buub[] buubArr, boolean z2) {
        ArrayList arrayList;
        bvif bvif;
        this.f67528a = ahkv;
        this.f67529b = bArr;
        this.f67530c = ahna;
        this.f67531d = i;
        this.f67532e = z;
        this.f67533f = j;
        this.f67536i = bArr2;
        this.f67534g = aify;
        this.f67538k = bqgy;
        if (buubArr != null) {
            arrayList = new ArrayList(buubArr.length);
            for (buub buub : buubArr) {
                buub buub2 = buub.UNKNOWN_MEDIUM;
                bvif bvif2 = bvif.UNKNOWN_MEDIUM;
                buuw buuw = buuw.UNKNOWN_FRAME_TYPE;
                switch (buub.ordinal()) {
                    case 1:
                        bvif = bvif.MDNS;
                        break;
                    case 2:
                        bvif = bvif.BLUETOOTH;
                        break;
                    case 3:
                        bvif = bvif.WIFI_HOTSPOT;
                        break;
                    case 4:
                        bvif = bvif.BLE;
                        break;
                    case 5:
                        bvif = bvif.WIFI_LAN;
                        break;
                    case 6:
                        bvif = bvif.WIFI_AWARE;
                        break;
                    case 7:
                        bvif = bvif.NFC;
                        break;
                    case 8:
                        bvif = bvif.WIFI_DIRECT;
                        break;
                    case 9:
                        bvif = bvif.WEB_RTC;
                        break;
                    default:
                        bvif = bvif.UNKNOWN_MEDIUM;
                        break;
                }
                arrayList.add(bvif);
            }
        } else {
            arrayList = null;
        }
        this.f67537j = arrayList;
        this.f67535h = z2;
    }
}
