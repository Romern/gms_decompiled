package p000;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.car.CarInfo;
import java.util.List;

/* renamed from: oac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oac {

    /* renamed from: a */
    public static final bnsn f37034a = odk.m28481a("CAR.VIDEO");

    /* renamed from: d */
    private static final bnhe f37035d = bnhe.m109410a("480p", biwf.VIDEO_800x480, "720p", biwf.VIDEO_1280x720, "1080p", biwf.VIDEO_1920x1080);

    /* renamed from: b */
    private final List f37036b;

    /* renamed from: c */
    private final List f37037c;

    public oac(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        point = point.x < point.y ? new Point(point.y, point.x) : point;
        int i = point.x;
        int i2 = point.y;
        this.f37036b = npe.m27154a(cctz.f179921a.mo6606a().mo76781e());
        this.f37037c = npe.m27154a(cctz.f179921a.mo6606a().mo76780d());
    }

    /* renamed from: a */
    public static biwf m28248a(biwf biwf, biwf biwf2, boolean z) {
        if (biwf == biwf.VIDEO_800x480 || biwf2 == biwf.VIDEO_800x480) {
            return biwf.VIDEO_800x480;
        }
        if (!z) {
            if (biwf == biwf.VIDEO_1280x720 || biwf2 == biwf.VIDEO_1280x720) {
                return biwf.VIDEO_1280x720;
            }
            if (biwf == biwf.VIDEO_1920x1080 || biwf2 == biwf.VIDEO_1920x1080) {
                return biwf.VIDEO_1920x1080;
            }
        } else if (biwf == biwf.VIDEO_720x1280 || biwf2 == biwf.VIDEO_720x1280) {
            return biwf.VIDEO_720x1280;
        } else {
            if (biwf == biwf.VIDEO_1080x1920 || biwf2 == biwf.VIDEO_1080x1920) {
                return biwf.VIDEO_1080x1920;
            }
        }
        int i = biwf.f122090j;
        int i2 = biwf2.f122090j;
        StringBuilder sb = new StringBuilder(45);
        sb.append("Unknown resolutions: ");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r1 >= 921600) goto L_0x0032;
     */
    /* renamed from: b */
    public final biwf mo21890b(int i, boolean z) {
        long j;
        int i2;
        odv f = odp.m28499f();
        if (f != null) {
            i2 = f.f37309a;
            j = ((long) i2) * ((long) f.f37310b);
        } else {
            i2 = 384000;
            j = 11520000;
        }
        if (i2 >= 2073600) {
            if (j / 2073600 >= ((long) i)) {
                return !z ? biwf.VIDEO_1920x1080 : biwf.VIDEO_1080x1920;
            }
        }
        if (j / 921600 >= ((long) i)) {
            return !z ? biwf.VIDEO_1280x720 : biwf.VIDEO_720x1280;
        }
        return biwf.VIDEO_800x480;
    }

    /* renamed from: a */
    public static String m28249a(biwf biwf) {
        if (biwf == null) {
            return "Unknown";
        }
        switch (biwf.ordinal()) {
            case 0:
                return "800x480";
            case 1:
                return "1280x720";
            case 2:
                return "1920x1080";
            case 3:
                return "2560x1440";
            case 4:
                return "3840x2160";
            case 5:
                return "720x1280";
            case 6:
                return "1080x1920";
            case 7:
                return "1440x2560";
            case 8:
                return "2160x3840";
            default:
                return "Unknown";
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* renamed from: a */
    public final biwf mo21886a(int i, CarInfo carInfo, npd npd, boolean z) {
        biwf b = mo21890b(i, z);
        biwf a = mo21889a(carInfo, npd, z);
        m28249a(b);
        m28249a(a);
        biwf a2 = m28248a(a, b, z);
        bnsi d = f37034a.mo68390d();
        d.mo68432a("oac", "a", 81, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68422a("getMaxAllowedResolutionForUsb: %s at fps %d", (Object) m28249a(a2), i);
        return a2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* renamed from: a */
    public final biwf mo21887a(int i, CarInfo carInfo, npd npd, boolean z, int i2) {
        biwf biwf;
        biwf b = mo21890b(i, z);
        biwf a = mo21889a(carInfo, npd, z);
        if (cctz.f179921a.mo6606a().mo76778b() && (i2 >= 4900 || i2 <= 0 || i2 > 2500 || cctz.f179921a.mo6606a().mo76777a())) {
            biwf = !z ? biwf.VIDEO_1920x1080 : biwf.VIDEO_1080x1920;
        } else if (!cctz.f179921a.mo6606a().mo76779c()) {
            biwf = biwf.VIDEO_800x480;
        } else {
            biwf = !z ? biwf.VIDEO_1280x720 : biwf.VIDEO_720x1280;
        }
        m28249a(b);
        m28249a(a);
        m28249a(biwf);
        biwf a2 = m28248a(m28248a(a, b, z), biwf, z);
        bnsi d = f37034a.mo68390d();
        d.mo68432a("oac", "a", 110, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68422a("getMaxAllowedResolutionForWifi: %s at fps %d", (Object) m28249a(a2), i);
        return a2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* renamed from: a */
    public final biwf mo21888a(int i, boolean z) {
        biwf b = mo21890b(i, z);
        bnsi d = f37034a.mo68390d();
        d.mo68432a("oac", "a", 61, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68422a("getMaxAllowedResolutionForEmulator: %s at fps %d", (Object) m28249a(b), i);
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final biwf mo21889a(CarInfo carInfo, npd npd, boolean z) {
        String b = npd.mo21387b();
        biwf biwf = (biwf) f37035d.get(b);
        if (biwf == null) {
            if (!"none".equals(b)) {
                bnsi b2 = f37034a.mo68387b();
                b2.mo68432a("oac", "a", (int) MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b2.mo68420a("Unexpected video resolution car setting: %s", b);
            }
            if (z) {
                return biwf.VIDEO_1080x1920;
            }
            if (npe.m27158a(this.f37036b, carInfo)) {
                return biwf.VIDEO_800x480;
            }
            if (npe.m27158a(this.f37037c, carInfo)) {
                return biwf.VIDEO_1280x720;
            }
            return biwf.VIDEO_1920x1080;
        } else if (!z) {
            return biwf;
        } else {
            int ordinal = biwf.ordinal();
            if (ordinal == 0) {
                return biwf.VIDEO_800x480;
            }
            if (ordinal == 1) {
                return biwf.VIDEO_720x1280;
            }
            if (ordinal == 2) {
                return biwf.VIDEO_1080x1920;
            }
            int i = biwf.f122090j;
            StringBuilder sb = new StringBuilder(32);
            sb.append("Unknown resolutions: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }
}
