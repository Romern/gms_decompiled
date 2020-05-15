package p000;

import android.util.Log;
import com.google.android.gms.net.PlayServicesCronetProvider;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.impl.JavaCronetProvider;

/* renamed from: aayr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aayr implements bmzi {

    /* renamed from: a */
    private static final bmzi f56839a = bmzn.m108681a((bmzi) new aayr());

    /* renamed from: b */
    private final CronetProvider f56840b = new PlayServicesCronetProvider(rpr.m34216b());

    /* renamed from: c */
    private final CronetProvider f56841c = new JavaCronetProvider(rpr.m34216b());

    /* renamed from: a */
    private static CronetEngine m47294a(CronetProvider cronetProvider) {
        CronetEngine.Builder enableQuic = cronetProvider.createBuilder().enableHttp2(ceev.f182568a.mo6606a().mo79059k()).enableQuic(ceev.f182568a.mo6606a().mo79060l());
        for (String str : aayh.m47256a(ceev.f182568a.mo6606a().mo79053e())) {
            enableQuic.addQuicHint(str, 443, 443);
        }
        return enableQuic.build();
    }

    /* renamed from: b */
    public static bmzi m47295b() {
        sdo.m34973b("Must be called from a worker thread.");
        return f56839a;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6606a() {
        try {
            return m47294a(this.f56840b);
        } catch (RuntimeException e) {
            Log.w("gH_cronetEngSup", "Falling back to Java Cronet engine provider due to error: s", e);
            return m47294a(this.f56841c);
        }
    }
}
