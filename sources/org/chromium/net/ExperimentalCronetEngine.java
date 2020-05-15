package org.chromium.net;

import android.content.Context;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ExperimentalCronetEngine extends CronetEngine {
    public static final int CONNECTION_METRIC_UNKNOWN = -1;
    public static final int EFFECTIVE_CONNECTION_TYPE_2G = 3;
    public static final int EFFECTIVE_CONNECTION_TYPE_3G = 4;
    public static final int EFFECTIVE_CONNECTION_TYPE_4G = 5;
    public static final int EFFECTIVE_CONNECTION_TYPE_OFFLINE = 1;
    public static final int EFFECTIVE_CONNECTION_TYPE_SLOW_2G = 2;
    public static final int EFFECTIVE_CONNECTION_TYPE_UNKNOWN = 0;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Builder extends CronetEngine.Builder {
        public Builder(Context context) {
            super(context);
        }

        public Builder enableNetworkQualityEstimator(boolean z) {
            this.mBuilderDelegate.enableNetworkQualityEstimator(z);
            return this;
        }

        public Builder enableSdch(boolean z) {
            return this;
        }

        public ICronetEngineBuilder getBuilderDelegate() {
            return this.mBuilderDelegate;
        }

        public Builder setExperimentalOptions(String str) {
            this.mBuilderDelegate.setExperimentalOptions(str);
            return this;
        }

        public Builder setThreadPriority(int i) {
            this.mBuilderDelegate.setThreadPriority(i);
            return this;
        }

        public Builder(ICronetEngineBuilder iCronetEngineBuilder) {
            super(iCronetEngineBuilder);
        }

        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: org.chromium.net.CronetEngine.Builder.addPublicKeyPins(java.lang.String, java.util.Set, boolean, java.util.Date):org.chromium.net.CronetEngine$Builder
         arg types: [java.lang.String, java.util.Set, boolean, java.util.Date]
         candidates:
          org.chromium.net.ExperimentalCronetEngine.Builder.addPublicKeyPins(java.lang.String, java.util.Set, boolean, java.util.Date):org.chromium.net.ExperimentalCronetEngine$Builder
          org.chromium.net.CronetEngine.Builder.addPublicKeyPins(java.lang.String, java.util.Set, boolean, java.util.Date):org.chromium.net.CronetEngine$Builder */
        public Builder addPublicKeyPins(String str, Set set, boolean z, Date date) {
            super.addPublicKeyPins(str, set, z, date);
            return this;
        }

        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: org.chromium.net.CronetEngine.Builder.addQuicHint(java.lang.String, int, int):org.chromium.net.CronetEngine$Builder
         arg types: [java.lang.String, int, int]
         candidates:
          org.chromium.net.ExperimentalCronetEngine.Builder.addQuicHint(java.lang.String, int, int):org.chromium.net.ExperimentalCronetEngine$Builder
          org.chromium.net.CronetEngine.Builder.addQuicHint(java.lang.String, int, int):org.chromium.net.CronetEngine$Builder */
        public Builder addQuicHint(String str, int i, int i2) {
            super.addQuicHint(str, i, i2);
            return this;
        }

        public ExperimentalCronetEngine build() {
            return this.mBuilderDelegate.build();
        }

        public Builder enableHttp2(boolean z) {
            super.enableHttp2(z);
            return this;
        }

        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: org.chromium.net.CronetEngine.Builder.enableHttpCache(int, long):org.chromium.net.CronetEngine$Builder
         arg types: [int, long]
         candidates:
          org.chromium.net.ExperimentalCronetEngine.Builder.enableHttpCache(int, long):org.chromium.net.ExperimentalCronetEngine$Builder
          org.chromium.net.CronetEngine.Builder.enableHttpCache(int, long):org.chromium.net.CronetEngine$Builder */
        public Builder enableHttpCache(int i, long j) {
            super.enableHttpCache(i, j);
            return this;
        }

        public Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
            super.enablePublicKeyPinningBypassForLocalTrustAnchors(z);
            return this;
        }

        public Builder enableQuic(boolean z) {
            super.enableQuic(z);
            return this;
        }

        public Builder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
            super.setLibraryLoader(libraryLoader);
            return this;
        }

        public Builder setStoragePath(String str) {
            super.setStoragePath(str);
            return this;
        }

        public Builder setUserAgent(String str) {
            super.setUserAgent(str);
            return this;
        }
    }

    public void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public void configureNetworkQualityEstimatorForTesting(boolean z, boolean z2, boolean z3) {
    }

    public int getDownstreamThroughputKbps() {
        return -1;
    }

    public int getEffectiveConnectionType() {
        return 0;
    }

    public int getHttpRttMs() {
        return -1;
    }

    public int getTransportRttMs() {
        return -1;
    }

    public abstract ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor);

    public abstract ExperimentalUrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor);

    public URLConnection openConnection(URL url, Proxy proxy) {
        return url.openConnection(proxy);
    }

    public void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public void startNetLogToDisk(String str, boolean z, int i) {
    }
}
