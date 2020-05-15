package p000;

import com.google.android.gms.cast.CastDevice;

/* renamed from: pze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pze {

    /* renamed from: a */
    public static final boolean f40729a = cdbh.f180420a.mo6606a().mo77198a();

    /* renamed from: a */
    public static boolean m31706a(CastDevice castDevice) {
        return castDevice.mo17494a().contains("__cloud_device__");
    }

    /* renamed from: b */
    public static String m31707b(CastDevice castDevice) {
        return castDevice.mo17494a().substring(16);
    }
}
