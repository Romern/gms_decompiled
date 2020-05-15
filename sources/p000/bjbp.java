package p000;

import android.content.Context;
import java.io.File;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: bjbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjbp {

    /* renamed from: a */
    public static final bjbu f122479a = new bjbu("LoggingStore");

    /* renamed from: e */
    private static bjbp f122480e;

    /* renamed from: b */
    public File f122481b = null;

    /* renamed from: c */
    public final File f122482c;

    /* renamed from: d */
    public final Context f122483d;

    /* renamed from: f */
    private final bqgj f122484f;

    protected bjbp(Context context, ExecutorService executorService) {
        this.f122483d = context;
        this.f122482c = new File(context.getFilesDir(), "metrics");
        this.f122484f = bqgs.m112811a(executorService);
        m103163a(this.f122482c);
    }

    /* renamed from: a */
    public static synchronized bjbp m103161a(Context context) {
        bjbp a;
        synchronized (bjbp.class) {
            a = m103162a(context, null);
        }
        return a;
    }

    /* renamed from: a */
    public static synchronized bjbp m103162a(Context context, ExecutorService executorService) {
        bjbp bjbp;
        synchronized (bjbp.class) {
            if (executorService == null) {
                executorService = new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS, new ArrayBlockingQueue(50), bjbn.f122476a);
            }
            if (f122480e == null) {
                f122480e = new bjbp(context.getApplicationContext(), executorService);
            }
            bjbp = f122480e;
        }
        return bjbp;
    }

    /* renamed from: a */
    public static void m103163a(File file) {
        if (!file.exists() && !file.mkdirs()) {
            bjbu bjbu = f122479a;
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
            sb.append("Failed to create internal storage directory: ");
            sb.append(valueOf);
            bjbu.mo64983b(sb.toString());
        }
    }

    /* renamed from: a */
    public final bqfl mo64976a(byte[] bArr) {
        try {
            return bqfl.m112747c(this.f122484f.mo25819b(new bjbo(this, bArr)));
        } catch (RejectedExecutionException e) {
            return bqfl.m112747c(bqga.m112777a((Throwable) e));
        }
    }

    /* renamed from: a */
    public final void mo64977a(String str) {
        File file;
        if (str != null) {
            file = new File(this.f122482c, str);
        } else {
            file = this.f122482c;
        }
        m103163a(file);
        bjbk.m103158b(file);
    }
}
