package p000;

import android.content.Context;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.cast.CastDevice;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Locale;
import java.util.UUID;

/* renamed from: qaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qaf {

    /* renamed from: a */
    private static final String f40780a = cdaa.f180362a.mo6606a().mo77152a();

    /* renamed from: b */
    private static final double f40781b = ((double) cdaa.f180362a.mo6606a().mo77154c());

    /* renamed from: c */
    private static final double f40782c = ((double) cdaa.f180362a.mo6606a().mo77155d());

    /* renamed from: d */
    private static final byte[] f40783d = {Byte.MAX_VALUE, 0, 0, 1};

    /* renamed from: e */
    private static final Inet4Address f40784e = m31748a();

    /* renamed from: a */
    public static int m31745a(CastDevice castDevice) {
        if (castDevice.mo17496a(4)) {
            return !castDevice.mo17496a(1) ? 2 : 1;
        }
        return 0;
    }

    /* renamed from: b */
    public static double m31749b(CastDevice castDevice) {
        if (castDevice.mo17496a(2048)) {
            return f40782c;
        }
        if (!castDevice.mo17496a(4) || castDevice.mo17496a(1)) {
            return f40781b;
        }
        return f40780a.equals(castDevice.f29717e) ? f40781b : f40782c;
    }

    /* renamed from: a */
    public static CastDevice m31746a(Context context) {
        pet a = CastDevice.m22256a(String.format(Locale.ROOT, "%s_V_%s", "__cast_nearby__", UUID.randomUUID().toString()), f40784e);
        a.f38994b = context.getString(C0126R.string.cast_nearby_friendly_name);
        a.f38995c = context.getString(C0126R.string.cast_nearby_model_name);
        a.f38996d = "04";
        a.f38999g = 0;
        return a.mo22985a();
    }

    /* renamed from: a */
    public static CastDevice m31747a(Context context, String str, String str2, String str3, int i) {
        pet a = CastDevice.m22256a(String.format(Locale.ROOT, "%s_%s", "__cast_nearby__", str), f40784e);
        a.f38994b = str2;
        if (str3 == null) {
            str3 = context.getString(C0126R.string.cast_nearby_model_name);
        }
        a.f38995c = str3;
        a.f38996d = "04";
        if (i == 0) {
            i = 0;
        }
        a.f38999g = i;
        return a.mo22985a();
    }

    /* renamed from: a */
    private static Inet4Address m31748a() {
        try {
            InetAddress byAddress = InetAddress.getByAddress("", f40783d);
            if (byAddress instanceof Inet4Address) {
                return (Inet4Address) byAddress;
            }
            return null;
        } catch (UnknownHostException e) {
            return null;
        }
    }
}
