package p000;

import android.util.Pair;
import com.felicanetworks.cmnctrl.net.DataParser;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* renamed from: citq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class citq extends HttpURLConnection {

    /* renamed from: h */
    public static final /* synthetic */ int f191428h = 0;

    /* renamed from: a */
    public final citt f191429a = new citt();

    /* renamed from: b */
    public UrlRequest f191430b;

    /* renamed from: c */
    public final citr f191431c = new citr(this);

    /* renamed from: d */
    public cits f191432d;

    /* renamed from: e */
    public UrlResponseInfo f191433e;

    /* renamed from: f */
    public IOException f191434f;

    /* renamed from: g */
    public boolean f191435g;

    /* renamed from: i */
    private final CronetEngine f191436i;

    /* renamed from: j */
    private final List f191437j = new ArrayList();

    /* renamed from: k */
    private boolean f191438k;

    /* renamed from: l */
    private int f191439l;

    /* renamed from: m */
    private boolean f191440m;

    /* renamed from: n */
    private int f191441n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f191442o;

    /* renamed from: p */
    private List f191443p;

    /* renamed from: q */
    private Map f191444q;

    static {
        citq.class.getSimpleName();
    }

    public citq(URL url, CronetEngine cronetEngine) {
        super(url);
        this.f191436i = cronetEngine;
    }

    /* renamed from: a */
    private final int m150982a(String str) {
        for (int i = 0; i < this.f191437j.size(); i++) {
            if (((String) ((Pair) this.f191437j.get(i)).first).equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: org.chromium.net.ExperimentalUrlRequest.Builder.setUploadDataProvider(org.chromium.net.UploadDataProvider, java.util.concurrent.Executor):org.chromium.net.ExperimentalUrlRequest$Builder
     arg types: [org.chromium.net.UploadDataProvider, citt]
     candidates:
      org.chromium.net.ExperimentalUrlRequest.Builder.setUploadDataProvider(org.chromium.net.UploadDataProvider, java.util.concurrent.Executor):org.chromium.net.UrlRequest$Builder
      org.chromium.net.UrlRequest.Builder.setUploadDataProvider(org.chromium.net.UploadDataProvider, java.util.concurrent.Executor):org.chromium.net.UrlRequest$Builder
      org.chromium.net.ExperimentalUrlRequest.Builder.setUploadDataProvider(org.chromium.net.UploadDataProvider, java.util.concurrent.Executor):org.chromium.net.ExperimentalUrlRequest$Builder */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: org.chromium.net.ExperimentalUrlRequest.Builder.addHeader(java.lang.String, java.lang.String):org.chromium.net.ExperimentalUrlRequest$Builder
     arg types: [java.lang.String, java.lang.String]
     candidates:
      org.chromium.net.ExperimentalUrlRequest.Builder.addHeader(java.lang.String, java.lang.String):org.chromium.net.UrlRequest$Builder
      org.chromium.net.UrlRequest.Builder.addHeader(java.lang.String, java.lang.String):org.chromium.net.UrlRequest$Builder
      org.chromium.net.ExperimentalUrlRequest.Builder.addHeader(java.lang.String, java.lang.String):org.chromium.net.ExperimentalUrlRequest$Builder */
    /* renamed from: b */
    private final void m150987b() {
        if (!this.connected) {
            ExperimentalUrlRequest.Builder builder = (ExperimentalUrlRequest.Builder) this.f191436i.newUrlRequestBuilder(getURL().toString(), new citp(this), this.f191429a);
            if (this.doOutput) {
                if (this.method.equals("GET")) {
                    this.method = DataParser.CONNECT_TYPE_POST;
                }
                cits cits = this.f191432d;
                if (cits != null) {
                    builder.setUploadDataProvider(cits.mo86526c(), (Executor) this.f191429a);
                    if (getRequestProperty("Content-Length") == null && !m150993d()) {
                        addRequestProperty("Content-Length", Long.toString(this.f191432d.mo86526c().getLength()));
                    }
                    this.f191432d.mo86524a();
                } else if (getRequestProperty("Content-Length") == null) {
                    addRequestProperty("Content-Length", "0");
                }
                if (getRequestProperty("Content-Type") == null) {
                    addRequestProperty("Content-Type", DataParser.CONTENT_TYPE_VALUE);
                }
            }
            List list = this.f191437j;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Pair pair = (Pair) list.get(i);
                builder.addHeader((String) pair.first, (String) pair.second);
            }
            if (!getUseCaches()) {
                builder.disableCache();
            }
            builder.setHttpMethod(this.method);
            if (this.f191438k) {
                builder.setTrafficStatsTag(this.f191439l);
            }
            if (this.f191440m) {
                builder.setTrafficStatsUid(this.f191441n);
            }
            ExperimentalUrlRequest build = builder.build();
            this.f191430b = build;
            build.start();
            this.connected = true;
        }
    }

    /* renamed from: c */
    private final Map.Entry m150989c(int i) {
        try {
            m150990c();
            List f = m150995f();
            if (i < f.size()) {
                return (Map.Entry) f.get(i);
            }
            return null;
        } catch (IOException e) {
            return null;
        }
    }

    /* renamed from: e */
    private final Map m150994e() {
        Map map = this.f191444q;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry entry : m150995f()) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add((String) entry.getValue());
            treeMap.put((String) entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        Map unmodifiableMap = Collections.unmodifiableMap(treeMap);
        this.f191444q = unmodifiableMap;
        return unmodifiableMap;
    }

    /* renamed from: f */
    private final List m150995f() {
        List list = this.f191443p;
        if (list != null) {
            return list;
        }
        this.f191443p = new ArrayList();
        for (Map.Entry entry : this.f191433e.getAllHeadersAsList()) {
            if (!((String) entry.getKey()).equalsIgnoreCase("Content-Encoding")) {
                this.f191443p.add(new AbstractMap.SimpleImmutableEntry(entry));
            }
        }
        List unmodifiableList = Collections.unmodifiableList(this.f191443p);
        this.f191443p = unmodifiableList;
        return unmodifiableList;
    }

    public final void addRequestProperty(String str, String str2) {
        m150986a(str, str2, false);
    }

    public final void connect() {
        getOutputStream();
        m150987b();
    }

    public final void disconnect() {
        if (this.connected) {
            this.f191430b.cancel();
        }
    }

    public final InputStream getErrorStream() {
        try {
            m150990c();
            if (this.f191433e.getHttpStatusCode() >= 400) {
                return this.f191431c;
            }
            return null;
        } catch (IOException e) {
            return null;
        }
    }

    public final String getHeaderField(int i) {
        Map.Entry c = m150989c(i);
        if (c != null) {
            return (String) c.getValue();
        }
        return null;
    }

    public final String getHeaderFieldKey(int i) {
        Map.Entry c = m150989c(i);
        if (c != null) {
            return (String) c.getKey();
        }
        return null;
    }

    public final Map getHeaderFields() {
        try {
            m150990c();
            return m150994e();
        } catch (IOException e) {
            return Collections.emptyMap();
        }
    }

    public final InputStream getInputStream() {
        m150990c();
        if (!this.instanceFollowRedirects && this.f191435g) {
            throw new IOException("Cannot read response body of a redirect.");
        } else if (this.f191433e.getHttpStatusCode() < 400) {
            return this.f191431c;
        } else {
            throw new FileNotFoundException(this.url.toString());
        }
    }

    public final OutputStream getOutputStream() {
        if (this.f191432d == null && this.doOutput) {
            if (this.connected) {
                throw new ProtocolException("Cannot write to OutputStream after receiving response.");
            } else if (m150993d()) {
                this.f191432d = new citm(this.chunkLength, this.f191429a);
                m150987b();
            } else {
                long a = m150983a();
                if (a != -1) {
                    this.f191432d = new cito(a, this.f191429a);
                    m150987b();
                } else {
                    String requestProperty = getRequestProperty("Content-Length");
                    if (requestProperty == null) {
                        this.f191432d = new citk();
                    } else {
                        this.f191432d = new citk(Long.parseLong(requestProperty));
                    }
                }
            }
        }
        return this.f191432d;
    }

    public final Map getRequestProperties() {
        if (!this.connected) {
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            List list = this.f191437j;
            int size = list.size();
            int i = 0;
            while (i < size) {
                Pair pair = (Pair) list.get(i);
                if (!treeMap.containsKey(pair.first)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add((String) pair.second);
                    treeMap.put((String) pair.first, Collections.unmodifiableList(arrayList));
                    i++;
                } else {
                    throw new IllegalStateException("Should not have multiple values.");
                }
            }
            return Collections.unmodifiableMap(treeMap);
        }
        throw new IllegalStateException("Cannot access request headers after connection is set.");
    }

    public final String getRequestProperty(String str) {
        int a = m150982a(str);
        if (a >= 0) {
            return (String) ((Pair) this.f191437j.get(a)).second;
        }
        return null;
    }

    public final int getResponseCode() {
        m150990c();
        return this.f191433e.getHttpStatusCode();
    }

    public final String getResponseMessage() {
        m150990c();
        return this.f191433e.getHttpStatusText();
    }

    public final void setConnectTimeout(int i) {
    }

    public final void setRequestProperty(String str, String str2) {
        m150986a(str, str2, true);
    }

    public final boolean usingProxy() {
        return false;
    }

    /* renamed from: a */
    private final long m150983a() {
        long j = (long) this.fixedContentLength;
        try {
            long j2 = getClass().getField("fixedContentLengthLong").getLong(this);
            return j2 != -1 ? j2 : j;
        } catch (IllegalAccessException | NoSuchFieldException e) {
            return j;
        }
    }

    /* renamed from: d */
    private final boolean m150993d() {
        return this.chunkLength > 0;
    }

    public final String getHeaderField(String str) {
        try {
            m150990c();
            Map e = m150994e();
            if (!e.containsKey(str)) {
                return null;
            }
            List list = (List) e.get(str);
            return (String) list.get(list.size() - 1);
        } catch (IOException e2) {
            return null;
        }
    }

    /* renamed from: c */
    private final void m150990c() {
        cits cits = this.f191432d;
        if (cits != null) {
            cits.mo86525b();
            if (m150993d()) {
                this.f191432d.close();
            }
        }
        if (!this.f191442o) {
            m150987b();
            this.f191429a.mo86557a();
        }
        if (this.f191442o) {
            IOException iOException = this.f191434f;
            if (iOException != null) {
                throw iOException;
            } else if (this.f191433e == null) {
                throw new NullPointerException("Response info is null when there is no exception.");
            }
        } else {
            throw new IllegalStateException("No response.");
        }
    }

    /* renamed from: a */
    private final void m150986a(String str, String str2, boolean z) {
        if (!this.connected) {
            int a = m150982a(str);
            if (a >= 0) {
                if (z) {
                    this.f191437j.remove(a);
                } else {
                    throw new UnsupportedOperationException("Cannot add multiple headers of the same key, " + str + ". crbug.com/432719.");
                }
            }
            this.f191437j.add(Pair.create(str, str2));
            return;
        }
        throw new IllegalStateException("Cannot modify request property after connection is made.");
    }

    /* renamed from: a */
    public final void mo86534a(int i) {
        if (!this.connected) {
            this.f191438k = true;
            this.f191439l = i;
            return;
        }
        throw new IllegalStateException("Cannot modify traffic stats tag after connection is made.");
    }

    /* renamed from: b */
    public final void mo86536b(int i) {
        if (!this.connected) {
            this.f191440m = true;
            this.f191441n = i;
            return;
        }
        throw new IllegalStateException("Cannot modify traffic stats UID after connection is made.");
    }
}
