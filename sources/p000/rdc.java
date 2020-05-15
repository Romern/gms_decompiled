package p000;

import android.util.Log;
import android.util.LruCache;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.concurrent.ExecutionException;

/* renamed from: rdc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rdc implements rdi {

    /* renamed from: a */
    final /* synthetic */ rde f42695a;

    public rdc(rde rde) {
        this.f42695a = rde;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r14.close();
        r0 = new p000.rdg(r3, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0132, code lost:
        return r0;
     */
    /* renamed from: a */
    public final rdg mo24476a(long j, rdt rdt) {
        rdd rdd;
        cafw cafw;
        long j2;
        long j3;
        int i;
        int i2;
        rdt rdt2 = rdt;
        synchronized (this.f42695a.f42704b) {
            int i3 = (int) rdt2.f42763b;
            caik caik = rdt2.f42762a;
            LruCache lruCache = this.f42695a.f42708f;
            Integer valueOf = Integer.valueOf(i3);
            lruCache.remove(valueOf);
            this.f42695a.f42709g.remove(valueOf);
            File file = new File(this.f42695a.f42707e.getAbsolutePath().concat("/").concat(String.valueOf(caik.f174723k)).concat("/").concat(rer.m33480a(caik)).concat("/").concat(String.valueOf(i3)));
            if (file.isDirectory()) {
                ArrayList arrayList = new ArrayList();
                String[] a = rde.m33365a(file.list());
                PriorityQueue priorityQueue = new PriorityQueue();
                long l = rde.m33372l();
                rdd rdd2 = new rdd(this.f42695a);
                try {
                    int length = a.length;
                    int i4 = 0;
                    while (i4 < length) {
                        String str = a[i4];
                        if ("play_logger_context.pb".equals(str)) {
                            i2 = i4;
                            i = length;
                            j3 = l;
                            rdd = rdd2;
                        } else {
                            long j4 = l;
                            String str2 = str;
                            i2 = i4;
                            i = length;
                            j3 = l;
                            rdd = rdd2;
                            try {
                                if (rde.m33358a(rdd2, j4, file, str2, true, null) == -1) {
                                    priorityQueue.add(rde.m33361a(new File(file, str2)));
                                }
                            } catch (ExecutionException e) {
                                Log.e("FlatFileLogStore", "Failed to get data from ClearcutInternalEvents proto data store.", e);
                                cafw = null;
                                j2 = j;
                            } catch (Throwable th) {
                                th = th;
                            }
                        }
                        i4 = i2 + 1;
                        rdd2 = rdd;
                        length = i;
                        l = j3;
                    }
                    rdd = rdd2;
                    if (!cddx.m132741e()) {
                        j2 = j;
                        cafw = (cafw) bqhi.m112838a(this.f42695a.f42710h.mo60776a());
                    } else {
                        cafw = null;
                        j2 = j;
                    }
                    while (true) {
                        rdb rdb = (rdb) priorityQueue.poll();
                        if (rdb == null || j2 <= 0) {
                            break;
                        }
                        File file2 = new File(file, rdb.f42692a);
                        try {
                            rdf a2 = rde.m33362a(cafw, rdb, file2);
                            j2 -= (long) a2.f42721b.mo73744a();
                            try {
                                arrayList.add(a2);
                            } catch (IOException e2) {
                                e = e2;
                            }
                        } catch (IOException e3) {
                            e = e3;
                            rdd.mo24478a(file2, rer.m33480a(caik), rcv.CORRUPTED_LOG_FILE_CONTENTS.mo24468a(e), 1);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    rdd = rdd2;
                    Throwable th3 = th;
                    try {
                        rdd.close();
                    } catch (Throwable th4) {
                        bqye.m113761a(th3, th4);
                    }
                    throw th3;
                }
            } else {
                rdg rdg = rdg.f42723a;
                return rdg;
            }
        }
    }
}
