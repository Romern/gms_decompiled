package p000;

import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.NetworkQualityRttListener;
import org.chromium.net.NetworkQualityThroughputListener;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;

/* renamed from: ciro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciro extends cirf {

    /* renamed from: b */
    private final String f191286b;

    /* renamed from: c */
    private final ExecutorService f191287c;

    public ciro(ciri ciri) {
        int i = ciri.f191276b;
        i = i == 20 ? 9 : i;
        this.f191286b = ciri.f191275a;
        this.f191287c = new ThreadPoolExecutor(10, 20, 50, TimeUnit.SECONDS, new LinkedBlockingQueue(), new cirm(i));
    }

    /* renamed from: a */
    public final citb mo86391a(String str, UrlRequest.Callback callback, Executor executor, boolean z, boolean z2, int i, boolean z3, int i2) {
        return new cisx(callback, this.f191287c, executor, str, this.f191286b, z, z2, i, z3, i2);
    }

    public final void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public final void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public final void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public final void configureNetworkQualityEstimatorForTesting(boolean z, boolean z2, boolean z3) {
    }

    public final URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return new cirn();
    }

    public final int getDownstreamThroughputKbps() {
        return -1;
    }

    public final int getEffectiveConnectionType() {
        return 0;
    }

    public final byte[] getGlobalMetricsDeltas() {
        return new byte[0];
    }

    public final int getHttpRttMs() {
        return -1;
    }

    public final int getTransportRttMs() {
        return -1;
    }

    public final String getVersionString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CronetHttpURLConnection/");
        sb.append("83.0.4099.5@" + "0f844ff8224045a44cd1cf88908a877710b916ec-refs/branch-heads/4099@{#8}".substring(0, 8));
        return sb.toString();
    }

    public final ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        throw new UnsupportedOperationException("The bidirectional stream API is not supported by the Java implementation of Cronet Engine");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cirf.newUrlRequestBuilder(java.lang.String, org.chromium.net.UrlRequest$Callback, java.util.concurrent.Executor):org.chromium.net.ExperimentalUrlRequest$Builder
     arg types: [java.lang.String, org.chromium.net.UrlRequest$Callback, java.util.concurrent.Executor]
     candidates:
      ciro.newUrlRequestBuilder(java.lang.String, org.chromium.net.UrlRequest$Callback, java.util.concurrent.Executor):org.chromium.net.UrlRequest$Builder
      cirf.newUrlRequestBuilder(java.lang.String, org.chromium.net.UrlRequest$Callback, java.util.concurrent.Executor):org.chromium.net.UrlRequest$Builder
      org.chromium.net.ExperimentalCronetEngine.newUrlRequestBuilder(java.lang.String, org.chromium.net.UrlRequest$Callback, java.util.concurrent.Executor):org.chromium.net.UrlRequest$Builder
      org.chromium.net.CronetEngine.newUrlRequestBuilder(java.lang.String, org.chromium.net.UrlRequest$Callback, java.util.concurrent.Executor):org.chromium.net.UrlRequest$Builder
      cirf.newUrlRequestBuilder(java.lang.String, org.chromium.net.UrlRequest$Callback, java.util.concurrent.Executor):org.chromium.net.ExperimentalUrlRequest$Builder */
    public final /* bridge */ /* synthetic */ UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return super.newUrlRequestBuilder(str, callback, executor);
    }

    public final URLConnection openConnection(URL url) {
        return url.openConnection();
    }

    public final void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public final void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public final void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public final void shutdown() {
        this.f191287c.shutdown();
    }

    public final void startNetLogToDisk(String str, boolean z, int i) {
    }

    public final void startNetLogToFile(String str, boolean z) {
    }

    public final void stopNetLog() {
    }

    public final URLConnection openConnection(URL url, Proxy proxy) {
        return url.openConnection(proxy);
    }
}
