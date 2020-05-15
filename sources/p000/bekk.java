package p000;

import android.net.Uri;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: bekk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bekk implements beli {

    /* renamed from: a */
    public final String f111709a;

    /* renamed from: b */
    public final bqgg f111710b;

    /* renamed from: c */
    public final bejw f111711c;

    /* renamed from: d */
    public final Executor f111712d;

    /* renamed from: e */
    public final befa f111713e;

    /* renamed from: f */
    public final bejx f111714f;

    /* renamed from: g */
    public final Object f111715g = new Object();

    /* renamed from: h */
    public Object f111716h = null;

    /* renamed from: i */
    public boolean f111717i;

    /* renamed from: j */
    private final bqfj f111718j = bqfj.m112745a();

    /* renamed from: k */
    private final bqfj f111719k = bqfj.m112745a();

    public bekk(String str, bqgg bqgg, bejw bejw, Executor executor, befa befa, bejx bejx) {
        this.f111709a = str;
        this.f111710b = bqga.m112772a(bqgg);
        this.f111711c = bejw;
        this.f111712d = executor;
        this.f111713e = befa;
        this.f111714f = bejx;
    }

    /* renamed from: a */
    public static final bqgg m95215a(IOException iOException) {
        if ((iOException instanceof begf) || (iOException.getCause() instanceof begf)) {
            return bqga.m112777a((Throwable) iOException);
        }
        return bqga.m112777a((Throwable) iOException);
    }

    /* renamed from: c */
    private final Closeable m95216c(Uri uri) {
        try {
            befa befa = this.f111713e;
            beho beho = new beho(true);
            beho.f111568a = true;
            return (Closeable) befa.mo60643a(uri, beho, new beer[0]);
        } catch (begy e) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0010, code lost:
        r0 = mo60772a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
        monitor-enter(r3.f111715g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0019, code lost:
        if (r3.f111717i == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001b, code lost:
        r3.f111716h = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0020, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0021, code lost:
        if (r0 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0023, code lost:
        r0 = m95216c(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r4 = mo60772a(r4);
        r1 = r3.f111715g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002d, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x002e, code lost:
        if (r0 == null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r3.f111716h = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0032, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0033, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0038, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x003c, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x003d, code lost:
        if (r0 != null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0043, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0044, code lost:
        p000.bqye.m113761a(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0047, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0048, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r0 = m95216c(r4);
     */
    /* renamed from: b */
    public final Object mo60773b(Uri uri) {
        synchronized (this.f111715g) {
            Object obj = this.f111716h;
            if (obj != null) {
                return obj;
            }
        }
    }

    /* renamed from: b */
    public final String mo60759b() {
        return this.f111709a;
    }

    /* renamed from: a */
    public final bqeg mo60755a() {
        return new bejz(this);
    }

    /* renamed from: c */
    public final bqgg mo60760c() {
        synchronized (this.f111715g) {
            Object obj = this.f111716h;
            if (obj == null) {
                return bqga.m112772a(this.f111719k.mo69205a(bljx.m107265a(new bekb(this)), this.f111712d));
            }
            bqgg a = bqga.m112775a(obj);
            return a;
        }
    }

    /* renamed from: a */
    public final bqgg mo60756a(bqeh bqeh, Executor executor) {
        return this.f111718j.mo69205a(bljx.m107265a(new bekc(this, bqeh, executor)), this.f111712d);
    }

    /* renamed from: a */
    public final Object mo60772a(Uri uri) {
        InputStream inputStream;
        try {
            String valueOf = String.valueOf(this.f111709a);
            bljb a = blkh.m107282a(valueOf.length() == 0 ? new String("Read ") : "Read ".concat(valueOf), blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
            try {
                inputStream = (InputStream) this.f111713e.mo60643a(uri, behs.m95063a(), new beer[0]);
                bxxc a2 = ((belv) this.f111711c).mo60791a(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
                if (a != null) {
                    a.close();
                }
                return a2;
            } catch (Throwable th) {
                if (a != null) {
                    a.close();
                }
                throw th;
            }
            throw th;
        } catch (FileNotFoundException e) {
            if (!this.f111713e.mo60647c(uri)) {
                return ((belu) this.f111711c).f111803a;
            }
            throw e;
        } catch (IOException e2) {
            throw belk.m95257a(this.f111713e, uri, e2);
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
    }
}
