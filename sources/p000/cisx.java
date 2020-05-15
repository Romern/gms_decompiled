package p000;

import android.net.TrafficStats;
import android.util.Log;
import com.android.volley.toolbox.HttpClientStack;
import com.felicanetworks.cmnctrl.net.DataParser;
import com.felicanetworks.mfc.FelicaException;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.CronetException;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* renamed from: cisx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cisx extends citb {

    /* renamed from: a */
    public static final String f191359a = cisx.class.getSimpleName();

    /* renamed from: b */
    public final cisu f191360b;

    /* renamed from: c */
    public final Executor f191361c;

    /* renamed from: d */
    public final String f191362d;

    /* renamed from: e */
    public final Map f191363e = new TreeMap(String.CASE_INSENSITIVE_ORDER);

    /* renamed from: f */
    public final List f191364f = new ArrayList();

    /* renamed from: g */
    public final AtomicReference f191365g = new AtomicReference(0);

    /* renamed from: h */
    public final boolean f191366h;

    /* renamed from: i */
    public String f191367i;

    /* renamed from: j */
    public citg f191368j;

    /* renamed from: k */
    public Executor f191369k;

    /* renamed from: l */
    public volatile int f191370l = -1;

    /* renamed from: m */
    public String f191371m;

    /* renamed from: n */
    public ReadableByteChannel f191372n;

    /* renamed from: o */
    public cite f191373o;

    /* renamed from: p */
    public String f191374p;

    /* renamed from: q */
    public HttpURLConnection f191375q;

    /* renamed from: r */
    public cirw f191376r;

    /* renamed from: s */
    private final AtomicBoolean f191377s = new AtomicBoolean(false);

    public cisx(UrlRequest.Callback callback, Executor executor, Executor executor2, String str, String str2, boolean z, boolean z2, int i, boolean z3, int i2) {
        if (str == null) {
            throw new NullPointerException("URL is required");
        } else if (callback == null) {
            throw new NullPointerException("Listener is required");
        } else if (executor == null) {
            throw new NullPointerException("Executor is required");
        } else if (executor2 != null) {
            this.f191366h = z;
            this.f191360b = new cisu(this, callback, executor2);
            this.f191361c = new cisw(new cisd(executor, !z2 ? TrafficStats.getThreadStatsTag() : i, z3, i2));
            this.f191371m = str;
            this.f191362d = str2;
        } else {
            throw new NullPointerException("userExecutor is required");
        }
    }

    /* renamed from: f */
    private final void m150944f() {
        int intValue = ((Integer) this.f191365g.get()).intValue();
        if (intValue != 0) {
            throw new IllegalStateException("Request is already started. State is: " + intValue);
        }
    }

    /* renamed from: a */
    public final Runnable mo86473a(cisy cisy) {
        return new cisl(this, cisy);
    }

    /* renamed from: b */
    public final Runnable mo86481b(cisy cisy) {
        return new ciry(this, cisy);
    }

    /* renamed from: c */
    public final void mo86483c() {
        this.f191361c.execute(mo86473a(new cisk(this)));
    }

    public final void cancel() {
        int intValue = ((Integer) this.f191365g.getAndSet(8)).intValue();
        if (intValue == 1 || intValue == 2 || intValue == 3 || intValue == 4 || intValue == 5) {
            mo86485d();
            mo86482b();
            cisu cisu = this.f191360b;
            cite cite = this.f191373o;
            cisu.f191353d.mo86486e();
            cisu.f191351b.execute(new cisr(cisu, cite));
        }
    }

    /* renamed from: d */
    public final void mo86485d() {
        this.f191361c.execute(new cisb(this));
    }

    /* renamed from: e */
    public final void mo86486e() {
        this.f191361c.execute(new cisc(this));
    }

    public final void followRedirect() {
        mo86475a(3, 1, new cisf(this));
    }

    public final void getStatus(UrlRequest.StatusListener statusListener) {
        int intValue = ((Integer) this.f191365g.get()).intValue();
        int i = this.f191370l;
        switch (intValue) {
            case 0:
            case 6:
            case 7:
            case 8:
                i = -1;
                break;
            case 1:
                break;
            case 2:
            case 3:
            case 4:
                i = 0;
                break;
            case 5:
                i = 14;
                break;
            default:
                throw new IllegalStateException("Switch is exhaustive: " + intValue);
        }
        this.f191360b.f191351b.execute(new cisn(new citi(statusListener), i));
    }

    public final boolean isDone() {
        int intValue = ((Integer) this.f191365g.get()).intValue();
        return intValue == 7 || intValue == 6 || intValue == 8;
    }

    public final void start() {
        this.f191370l = 10;
        mo86475a(0, 1, new cise(this));
    }

    /* renamed from: a */
    public final void mo86474a() {
        this.f191370l = 13;
        this.f191361c.execute(mo86473a(new cisg(this)));
    }

    /* renamed from: b */
    public final void mo86482b() {
        if (this.f191368j != null && this.f191377s.compareAndSet(false, true)) {
            try {
                this.f191369k.execute(mo86481b(new cish(this)));
            } catch (RejectedExecutionException e) {
                Log.e(f191359a, "Exception when closing uploadDataProvider", e);
            }
        }
    }

    public final void read(ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
        } else if (byteBuffer.hasRemaining()) {
            mo86475a(4, 5, new cisa(this, byteBuffer));
        } else {
            throw new IllegalArgumentException("ByteBuffer is already full.");
        }
    }

    /* renamed from: a */
    public final void mo86475a(int i, int i2, Runnable runnable) {
        if (!this.f191365g.compareAndSet(Integer.valueOf(i), Integer.valueOf(i2))) {
            int intValue = ((Integer) this.f191365g.get()).intValue();
            if (intValue != 8 && intValue != 6) {
                throw new IllegalStateException("Invalid state transition - expected " + i + " but was " + intValue);
            }
            return;
        }
        runnable.run();
    }

    /* renamed from: a */
    public final void mo86476a(String str) {
        m150944f();
        if ("OPTIONS".equalsIgnoreCase(str) || "GET".equalsIgnoreCase(str) || "HEAD".equalsIgnoreCase(str) || DataParser.CONNECT_TYPE_POST.equalsIgnoreCase(str) || "PUT".equalsIgnoreCase(str) || "DELETE".equalsIgnoreCase(str) || "TRACE".equalsIgnoreCase(str) || HttpClientStack.HttpPatch.METHOD_NAME.equalsIgnoreCase(str)) {
            this.f191367i = str;
            return;
        }
        throw new IllegalArgumentException("Invalid http method " + str);
    }

    /* renamed from: a */
    public final void mo86477a(String str, String str2) {
        m150944f();
        int i = 0;
        while (true) {
            if (i < str.length()) {
                char charAt = str.charAt(i);
                if (!(charAt == ',' || charAt == '/' || charAt == '{' || charAt == '}')) {
                    switch (charAt) {
                        case FelicaException.TYPE_USED_BY_OTHER_APP:
                        case FelicaException.TYPE_PUSH_FAILED:
                        case ')':
                            break;
                        default:
                            switch (charAt) {
                                case FelicaException.TYPE_OFFLINE_CANCELED:
                                case FelicaException.TYPE_NOW_EXECUTING_FALP:
                                case FelicaException.TYPE_MFC_NOT_FOUND:
                                case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                                case '>':
                                case '?':
                                case '@':
                                    break;
                                default:
                                    switch (charAt) {
                                        case '[':
                                        case '\\':
                                        case ']':
                                            break;
                                        default:
                                            if (!Character.isISOControl(charAt) && !Character.isWhitespace(charAt)) {
                                                i++;
                                            }
                                    }
                            }
                    }
                }
            } else if (!str2.contains("\r\n")) {
                if (this.f191363e.containsKey(str)) {
                    this.f191363e.remove(str);
                }
                this.f191363e.put(str, str2);
                return;
            }
        }
        throw new IllegalArgumentException("Invalid header " + str + "=" + str2);
    }

    /* renamed from: a */
    public final void mo86478a(Throwable th) {
        mo86479a((CronetException) new cire("Exception received from UploadDataProvider", th));
    }

    /* renamed from: a */
    public final void mo86479a(CronetException cronetException) {
        int intValue;
        do {
            intValue = ((Integer) this.f191365g.get()).intValue();
            if (intValue == 0) {
                throw new IllegalStateException("Can't enter error state before start");
            } else if (intValue == 6 || intValue == 7 || intValue == 8) {
                return;
            }
        } while (!this.f191365g.compareAndSet(Integer.valueOf(intValue), 6));
        mo86485d();
        mo86482b();
        cisu cisu = this.f191360b;
        cite cite = this.f191373o;
        cisu.f191353d.mo86486e();
        cist cist = new cist(cisu, cite, cronetException);
        try {
            cisu.f191351b.execute(cist);
        } catch (InlineExecutionProhibitedException e) {
            Executor executor = cisu.f191352c;
            if (executor != null) {
                executor.execute(cist);
            }
        }
    }

    /* renamed from: a */
    public final void mo86480a(UploadDataProvider uploadDataProvider, Executor executor) {
        if (this.f191363e.containsKey("Content-Type")) {
            m150944f();
            if (this.f191367i == null) {
                this.f191367i = DataParser.CONNECT_TYPE_POST;
            }
            this.f191368j = new citg(uploadDataProvider);
            if (!this.f191366h) {
                this.f191369k = new cita(executor);
            } else {
                this.f191369k = executor;
            }
        } else {
            throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
        }
    }
}
