package p000;

import android.content.ComponentName;
import android.content.Context;
import java.io.FilenameFilter;
import java.util.List;

/* renamed from: ske */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ske extends sli {

    /* renamed from: a */
    private static final FilenameFilter f44609a = new skd();

    /* renamed from: a */
    public final String mo25683a() {
        return "alarms";
    }

    /* renamed from: b */
    public final boolean mo25686b() {
        ComponentName componentName = skr.f44644a;
        return ((Integer) ski.f44617a.mo58455c()).intValue() != 0;
    }

    /* renamed from: c */
    public final long mo25687c() {
        return ((Long) skm.f44633b.mo58455c()).longValue() / 1000;
    }

    /* renamed from: d */
    public final int mo25688d() {
        return 6;
    }

    /* renamed from: a */
    public final List mo25684a(Context context) {
        return sli.m35573a(context, f44609a, "stats.alarms");
    }

    /* renamed from: a */
    public final boolean mo25685a(bxvd bxvd) {
        return ((bpvf) bxvd.f164949b).f139329g.size() > 0;
    }
}
