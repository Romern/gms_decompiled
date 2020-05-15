package p000;

import android.content.Context;
import java.util.Date;
import java.util.Set;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* renamed from: cirp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cirp extends ciri {
    public cirp(Context context) {
        super(context);
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        super.mo86395a(str, set, date);
        return this;
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        super.mo86399b(str);
        return this;
    }

    public final ExperimentalCronetEngine build() {
        if (this.f191275a == null) {
            this.f191275a = getDefaultUserAgent();
        }
        return new ciro(this);
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enableBrotli(boolean z) {
        return this;
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enableHttp2(boolean z) {
        return this;
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enableHttpCache(int i, long j) {
        super.mo86393a(i);
        return this;
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        return this;
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        return this;
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enableQuic(boolean z) {
        return this;
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setExperimentalOptions(String str) {
        return this;
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        return this;
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setStoragePath(String str) {
        super.mo86394a(str);
        return this;
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setThreadPriority(int i) {
        super.mo86398b(i);
        return this;
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setUserAgent(String str) {
        this.f191275a = str;
        return this;
    }
}
