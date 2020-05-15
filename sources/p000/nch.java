package p000;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.security.SecureRandom;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: nch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nch implements myt {

    /* renamed from: a */
    private static final lvn f35248a = new lvn("EncryptedFullBackupDataProcessor");

    /* renamed from: b */
    private final Context f35249b;

    /* renamed from: c */
    private final ExecutorService f35250c;

    /* renamed from: d */
    private final lwj f35251d;

    /* renamed from: e */
    private final SecureRandom f35252e;

    /* renamed from: f */
    private final lwp f35253f;

    /* renamed from: g */
    private final String f35254g;

    /* renamed from: h */
    private final mbx f35255h;

    /* renamed from: i */
    private InputStream f35256i;

    /* renamed from: j */
    private PipedOutputStream f35257j;

    /* renamed from: k */
    private nci f35258k;

    /* renamed from: l */
    private Future f35259l;

    /* renamed from: m */
    private mys f35260m;

    public nch(Context context, ExecutorService executorService, lwj lwj, SecureRandom secureRandom, lwp lwp, String str, mbx mbx) {
        bmxy.m108581a(context);
        this.f35249b = context;
        bmxy.m108581a(executorService);
        this.f35250c = executorService;
        bmxy.m108581a(lwj);
        this.f35251d = lwj;
        bmxy.m108581a(secureRandom);
        this.f35252e = secureRandom;
        bmxy.m108581a(lwp);
        this.f35253f = lwp;
        bmxy.m108581a(str);
        this.f35254g = str;
        bmxy.m108581a(mbx);
        this.f35255h = mbx;
    }

    /* renamed from: a */
    private final void m25923a(Exception exc) {
        if (exc.getCause() instanceof mbi) {
            return;
        }
        if (exc.getCause() instanceof mbp) {
            this.f35255h.mo19822a(27, 4);
        } else {
            mab.m24748a(this.f35249b, exc, cclp.m130475e());
        }
    }

    /* renamed from: b */
    private final void m25924b(Exception exc) {
        mys mys;
        if ((exc.getCause() instanceof mbi) && !(exc.getCause() instanceof mbo)) {
            if ((!(exc.getCause() instanceof mbm) || !ccog.m130999c()) && (mys = this.f35260m) != null) {
                mys.mo20331b();
            }
        }
    }

    /* renamed from: g */
    private final void m25925g() {
        srz.m36171a((Closeable) this.f35256i);
        srz.m36171a(this.f35257j);
    }

    /* renamed from: h */
    private final bmxv m25926h() {
        Future future = this.f35259l;
        if (future != null) {
            try {
                future.get();
            } catch (InterruptedException | ExecutionException e) {
                return bmxv.m108566b(e);
            }
        }
        return bmvz.f131120a;
    }

    /* renamed from: a */
    public final void mo20334a(mys mys) {
        this.f35260m = mys;
    }

    /* renamed from: c */
    public final int mo20337c() {
        boolean z;
        if (this.f35259l != null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "finish() before start()");
        m25925g();
        bmxv h = m25926h();
        if (h.mo66813a()) {
            f35248a.mo25417e("Exception during encrypted full backup", (Throwable) h.mo66814b(), new Object[0]);
            m25923a((Exception) h.mo66814b());
            m25924b((Exception) h.mo66814b());
            return (!ccog.m130999c() || !(((Exception) h.mo66814b()).getCause() instanceof mbm)) ? -1000 : -1005;
        }
        mys mys = this.f35260m;
        if (mys != null) {
            mys.mo20330a();
        }
        return 0;
    }

    /* renamed from: d */
    public final void mo20338d() {
        mo20336b();
    }

    /* renamed from: e */
    public final void mo20339e() {
        mo20336b();
    }

    /* renamed from: f */
    public final void mo20340f() {
        mo20336b();
    }

    /* renamed from: b */
    public final void mo20336b() {
        boolean z = false;
        if (!(this.f35259l == null || this.f35258k == null)) {
            z = true;
        }
        bmxy.m108601b(z, "cancel() before start()");
        this.f35258k.f35262a.f35243a.getAndSet(true);
        m25925g();
    }

    /* renamed from: a */
    public final int mo20332a(int i) {
        boolean z;
        if (this.f35259l == null || this.f35256i == null || this.f35257j == null) {
            z = false;
        } else {
            z = true;
        }
        bmxy.m108601b(z, "pushData() before start()");
        if (this.f35259l.isDone()) {
            bmxv h = m25926h();
            f35248a.mo25417e("Encrypted upload failed", (Throwable) h.mo66815c(), new Object[0]);
            if (h.mo66813a()) {
                m25923a((Exception) h.mo66814b());
                m25924b((Exception) h.mo66814b());
                if (!ccog.m130999c() || !(((Exception) h.mo66814b()).getCause() instanceof mbm)) {
                    return -1000;
                }
                return -1005;
            }
            return -1000;
        }
        try {
            boav.m111013a(boav.m111025b(this.f35256i, (long) i), this.f35257j);
            return 0;
        } catch (IOException e) {
            f35248a.mo25417e("IOException when processing backup", e, new Object[0]);
            return -1000;
        }
    }

    /* renamed from: a */
    public final void mo20333a() {
        bmxy.m108601b(this.f35258k != null, "start() before initiate()");
        this.f35259l = this.f35250c.submit(this.f35258k);
    }

    /* renamed from: a */
    public final boolean mo20335a(InputStream inputStream, bxvd bxvd) {
        boolean z;
        if (this.f35258k == null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "initiate() twice");
        this.f35256i = inputStream;
        this.f35257j = new PipedOutputStream();
        this.f35258k = nci.m25937a(this.f35249b, this.f35251d, this.f35252e, this.f35253f, this.f35254g, bxvd, new PipedInputStream(this.f35257j), this.f35255h);
        return true;
    }
}
