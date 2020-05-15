package p000;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: cayg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class cayg extends HttpsURLConnection {

    /* renamed from: a */
    private final HttpURLConnection f176397a;

    public cayg(HttpURLConnection httpURLConnection) {
        super(httpURLConnection.getURL());
        this.f176397a = httpURLConnection;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract caua mo75080a();

    public final void addRequestProperty(String str, String str2) {
        this.f176397a.addRequestProperty(str, str2);
    }

    public final void connect() {
        this.connected = true;
        this.f176397a.connect();
    }

    public final void disconnect() {
        this.f176397a.disconnect();
    }

    public final boolean getAllowUserInteraction() {
        return this.f176397a.getAllowUserInteraction();
    }

    public final String getCipherSuite() {
        caua a = mo75080a();
        if (a != null) {
            return a.f175976a;
        }
        return null;
    }

    public final int getConnectTimeout() {
        return this.f176397a.getConnectTimeout();
    }

    public final Object getContent() {
        return this.f176397a.getContent();
    }

    public final String getContentEncoding() {
        return this.f176397a.getContentEncoding();
    }

    public final int getContentLength() {
        return this.f176397a.getContentLength();
    }

    public final String getContentType() {
        return this.f176397a.getContentType();
    }

    public final long getDate() {
        return this.f176397a.getDate();
    }

    public final boolean getDefaultUseCaches() {
        return this.f176397a.getDefaultUseCaches();
    }

    public final boolean getDoInput() {
        return this.f176397a.getDoInput();
    }

    public final boolean getDoOutput() {
        return this.f176397a.getDoOutput();
    }

    public final InputStream getErrorStream() {
        return this.f176397a.getErrorStream();
    }

    public final long getExpiration() {
        return this.f176397a.getExpiration();
    }

    public final String getHeaderField(int i) {
        return this.f176397a.getHeaderField(i);
    }

    public final long getHeaderFieldDate(String str, long j) {
        return this.f176397a.getHeaderFieldDate(str, j);
    }

    public final int getHeaderFieldInt(String str, int i) {
        return this.f176397a.getHeaderFieldInt(str, i);
    }

    public final String getHeaderFieldKey(int i) {
        return this.f176397a.getHeaderFieldKey(i);
    }

    public final Map getHeaderFields() {
        return this.f176397a.getHeaderFields();
    }

    public final long getIfModifiedSince() {
        return this.f176397a.getIfModifiedSince();
    }

    public final InputStream getInputStream() {
        return this.f176397a.getInputStream();
    }

    public final boolean getInstanceFollowRedirects() {
        return this.f176397a.getInstanceFollowRedirects();
    }

    public final long getLastModified() {
        return this.f176397a.getLastModified();
    }

    public final Certificate[] getLocalCertificates() {
        caua a = mo75080a();
        if (a != null) {
            List list = a.f175978c;
            if (!list.isEmpty()) {
                return (Certificate[]) list.toArray(new Certificate[list.size()]);
            }
        }
        return null;
    }

    public final Principal getLocalPrincipal() {
        caua a = mo75080a();
        if (a == null || a.f175978c.isEmpty()) {
            return null;
        }
        return ((X509Certificate) a.f175978c.get(0)).getSubjectX500Principal();
    }

    public final OutputStream getOutputStream() {
        return this.f176397a.getOutputStream();
    }

    public final Principal getPeerPrincipal() {
        caua a = mo75080a();
        if (a == null || a.f175977b.isEmpty()) {
            return null;
        }
        return ((X509Certificate) a.f175977b.get(0)).getSubjectX500Principal();
    }

    public final Permission getPermission() {
        return this.f176397a.getPermission();
    }

    public final int getReadTimeout() {
        return this.f176397a.getReadTimeout();
    }

    public final String getRequestMethod() {
        return this.f176397a.getRequestMethod();
    }

    public final Map getRequestProperties() {
        return this.f176397a.getRequestProperties();
    }

    public final String getRequestProperty(String str) {
        return this.f176397a.getRequestProperty(str);
    }

    public final int getResponseCode() {
        return this.f176397a.getResponseCode();
    }

    public final String getResponseMessage() {
        return this.f176397a.getResponseMessage();
    }

    public final Certificate[] getServerCertificates() {
        caua a = mo75080a();
        if (a != null) {
            List list = a.f175977b;
            if (!list.isEmpty()) {
                return (Certificate[]) list.toArray(new Certificate[list.size()]);
            }
        }
        return null;
    }

    public final URL getURL() {
        return this.f176397a.getURL();
    }

    public final boolean getUseCaches() {
        return this.f176397a.getUseCaches();
    }

    public final void setAllowUserInteraction(boolean z) {
        this.f176397a.setAllowUserInteraction(z);
    }

    public final void setChunkedStreamingMode(int i) {
        this.f176397a.setChunkedStreamingMode(i);
    }

    public final void setConnectTimeout(int i) {
        this.f176397a.setConnectTimeout(i);
    }

    public final void setDefaultUseCaches(boolean z) {
        this.f176397a.setDefaultUseCaches(z);
    }

    public final void setDoInput(boolean z) {
        this.f176397a.setDoInput(z);
    }

    public final void setDoOutput(boolean z) {
        this.f176397a.setDoOutput(z);
    }

    public final void setFixedLengthStreamingMode(int i) {
        this.f176397a.setFixedLengthStreamingMode(i);
    }

    public final void setIfModifiedSince(long j) {
        this.f176397a.setIfModifiedSince(j);
    }

    public final void setInstanceFollowRedirects(boolean z) {
        this.f176397a.setInstanceFollowRedirects(z);
    }

    public final void setReadTimeout(int i) {
        this.f176397a.setReadTimeout(i);
    }

    public final void setRequestMethod(String str) {
        this.f176397a.setRequestMethod(str);
    }

    public final void setRequestProperty(String str, String str2) {
        this.f176397a.setRequestProperty(str, str2);
    }

    public final void setUseCaches(boolean z) {
        this.f176397a.setUseCaches(z);
    }

    public final String toString() {
        return this.f176397a.toString();
    }

    public final boolean usingProxy() {
        return this.f176397a.usingProxy();
    }

    public final Object getContent(Class[] clsArr) {
        return this.f176397a.getContent(clsArr);
    }

    public final String getHeaderField(String str) {
        return this.f176397a.getHeaderField(str);
    }
}
