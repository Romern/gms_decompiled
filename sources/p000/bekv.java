package p000;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: bekv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bekv implements beli {

    /* renamed from: a */
    public final String f111736a;

    /* renamed from: b */
    public final bqgg f111737b;

    /* renamed from: c */
    public final bejw f111738c;

    /* renamed from: d */
    public final Executor f111739d;

    /* renamed from: e */
    public final befa f111740e;

    /* renamed from: f */
    public final Object f111741f = new Object();

    /* renamed from: g */
    public bqgg f111742g = null;

    /* renamed from: h */
    private final bqfj f111743h = bqfj.m112745a();

    public bekv(String str, bqgg bqgg, bejw bejw, Executor executor, befa befa) {
        this.f111736a = str;
        this.f111737b = bqga.m112772a(bqgg);
        this.f111738c = bejw;
        this.f111739d = bqgs.m112813a(executor);
        this.f111740e = befa;
    }

    /* renamed from: d */
    private final bqgg m95234d() {
        bqgg bqgg;
        synchronized (this.f111741f) {
            bqgg bqgg2 = this.f111742g;
            if (bqgg2 != null && bqgg2.isDone()) {
                try {
                    bqga.m112780a((Future) this.f111742g);
                } catch (ExecutionException e) {
                    this.f111742g = null;
                }
            }
            if (this.f111742g == null) {
                this.f111742g = bqga.m112772a(this.f111743h.mo69205a(bljx.m107265a(new bekp(this)), this.f111739d));
            }
            bqgg = this.f111742g;
        }
        return bqgg;
    }

    /* renamed from: a */
    public final bqeg mo60755a() {
        return new bekm(this);
    }

    /* renamed from: b */
    public final String mo60759b() {
        return this.f111736a;
    }

    /* renamed from: c */
    public final bqgg mo60760c() {
        return m95234d();
    }

    /* renamed from: a */
    public final bqgg mo60756a(bqeh bqeh, Executor executor) {
        return this.f111743h.mo69205a(bljx.m107265a(new bekn(this, m95234d(), bqeh, executor)), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final Object mo60774a(Uri uri) {
        InputStream inputStream;
        try {
            String valueOf = String.valueOf(this.f111736a);
            bljb a = blkh.m107282a(valueOf.length() == 0 ? new String("Read ") : "Read ".concat(valueOf), blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
            try {
                inputStream = (InputStream) this.f111740e.mo60643a(uri, behs.m95063a(), new beer[0]);
                bxxc a2 = ((belv) this.f111738c).mo60791a(inputStream);
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
            if (!this.f111740e.mo60647c(uri)) {
                return ((belu) this.f111738c).f111803a;
            }
            throw e;
        } catch (IOException e2) {
            throw belk.m95257a(this.f111740e, uri, e2);
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
    }
}
