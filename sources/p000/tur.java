package p000;

import com.google.android.gms.net.PlayServicesCronetProvider;
import java.io.File;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;

/* renamed from: tur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tur implements bmzi {

    /* renamed from: a */
    public static final bmzi f46699a = bmzn.m108681a((bmzi) new tur());

    /* renamed from: b */
    private static final String[] f46700b = {"www.gstatic.com", "ssl.gstatic.com", "lh1.googleusercontent.com", "lh2.googleusercontent.com", "lh3.googleusercontent.com", "lh4.googleusercontent.com", "lh5.googleusercontent.com", "lh6.googleusercontent.com", "s2.googleusercontent.com"};

    /* renamed from: c */
    private final CronetProvider f46701c = new PlayServicesCronetProvider(rpr.m34216b());

    private tur() {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: org.chromium.net.ExperimentalCronetEngine.Builder.enableHttpCache(int, long):org.chromium.net.ExperimentalCronetEngine$Builder
     arg types: [int, int]
     candidates:
      org.chromium.net.ExperimentalCronetEngine.Builder.enableHttpCache(int, long):org.chromium.net.CronetEngine$Builder
      org.chromium.net.CronetEngine.Builder.enableHttpCache(int, long):org.chromium.net.CronetEngine$Builder
      org.chromium.net.ExperimentalCronetEngine.Builder.enableHttpCache(int, long):org.chromium.net.ExperimentalCronetEngine$Builder */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: org.chromium.net.ExperimentalCronetEngine.Builder.addQuicHint(java.lang.String, int, int):org.chromium.net.ExperimentalCronetEngine$Builder
     arg types: [java.lang.String, int, int]
     candidates:
      org.chromium.net.ExperimentalCronetEngine.Builder.addQuicHint(java.lang.String, int, int):org.chromium.net.CronetEngine$Builder
      org.chromium.net.CronetEngine.Builder.addQuicHint(java.lang.String, int, int):org.chromium.net.CronetEngine$Builder
      org.chromium.net.ExperimentalCronetEngine.Builder.addQuicHint(java.lang.String, int, int):org.chromium.net.ExperimentalCronetEngine$Builder */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6606a() {
        ExperimentalCronetEngine.Builder builder = (ExperimentalCronetEngine.Builder) this.f46701c.createBuilder();
        builder.enableBrotli(true);
        builder.enableQuic(true);
        builder.setThreadPriority(-2);
        File file = new File(rpr.m34216b().getCacheDir(), "id_pwm_cronet_cache");
        file.mkdirs();
        builder.setStoragePath(file.getAbsolutePath());
        builder.enableHttpCache(2, 1000L);
        for (String str : f46700b) {
            builder.addQuicHint(str, 443, 443);
        }
        return builder.build();
    }
}
