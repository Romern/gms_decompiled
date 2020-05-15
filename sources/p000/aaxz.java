package p000;

import android.content.Context;
import java.io.File;

/* renamed from: aaxz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaxz {

    /* renamed from: a */
    public final Context f56809a;

    public aaxz(Context context) {
        this.f56809a = context;
    }

    /* renamed from: a */
    private static final Long m47224a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length > 0) {
            return Long.valueOf(str.substring(0, length));
        }
        return null;
    }

    /* renamed from: a */
    public static void m47225a(bqgj bqgj, Context context) {
        bqgj.execute(new aaxy(new aaxz(context)));
    }

    /* renamed from: a */
    public static final void m47226a(File[] fileArr, long j) {
        Long l;
        for (File file : fileArr) {
            String name = file.getName();
            if (name.endsWith("_gH_async_help_psd")) {
                l = m47224a(name, "_gH_async_help_psd");
            } else if (name.endsWith("_gH_async_feedback_psd")) {
                l = m47224a(name, "_gH_async_feedback_psd");
            } else if (name.endsWith("_gH_async_feedback_psbd")) {
                l = m47224a(name, "_gH_async_feedback_psbd");
            } else {
                l = name.endsWith("_gH_async_feedback_psbd_metrics") ? m47224a(name, "_gH_async_feedback_psbd_metrics") : null;
            }
            if (l == null || j - l.longValue() > ceeg.f182447a.mo6606a().mo79008c() * 1000000) {
                file.delete();
            }
        }
    }
}
