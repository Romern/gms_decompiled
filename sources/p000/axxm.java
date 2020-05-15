package p000;

import android.database.sqlite.SQLiteDatabase;
import android.os.Process;
import android.util.Log;
import android.util.TimingLogger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: axxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axxm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ axxv f96655a;

    /* renamed from: b */
    private final axze f96656b;

    /* renamed from: c */
    private final LinkedBlockingQueue f96657c;

    /* renamed from: d */
    private final AtomicInteger f96658d;

    /* renamed from: e */
    private final boolean f96659e;

    /* renamed from: f */
    private final SQLiteDatabase f96660f = this.f96656b.getWritableDatabase();

    public axxm(axxv axxv, axze axze, LinkedBlockingQueue linkedBlockingQueue, AtomicInteger atomicInteger, boolean z) {
        this.f96655a = axxv;
        sdo.m34959a(axze);
        this.f96656b = axze;
        sdo.m34959a(linkedBlockingQueue);
        this.f96657c = linkedBlockingQueue;
        this.f96658d = atomicInteger;
        this.f96659e = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ed A[Catch:{ all -> 0x004e, all -> 0x00fb }] */
    public final void run() {
        long j;
        boolean z;
        boolean z2;
        axxl axxl;
        try {
            TimingLogger timingLogger = new TimingLogger("DataItemsTiming", "setDataItemsRunner");
            axxl axxl2 = null;
            while (true) {
                timingLogger.reset();
                ArrayList<axxl> arrayList = new ArrayList();
                if (!this.f96659e) {
                    j = chnj.f188812a.mo6606a().mo85387M();
                } else {
                    j = chnj.f188812a.mo6606a().mo85388N();
                }
                z = true;
                z2 = false;
                while (true) {
                    if (z2) {
                        if (((long) arrayList.size()) >= j) {
                            break;
                        }
                        axxl = (axxl) this.f96657c.poll();
                        timingLogger.addSplit("got next item to process");
                        if (axxl == null) {
                            break;
                        }
                    } else {
                        if (axxl2 == null) {
                            axxl = (axxl) this.f96657c.take();
                        } else {
                            axxl = axxl2;
                        }
                        timingLogger.reset();
                        this.f96660f.beginTransaction();
                        try {
                            timingLogger.addSplit("beginTransaction");
                        } catch (Throwable th) {
                            th = th;
                            if (z) {
                                this.f96660f.endTransaction();
                                timingLogger.addSplit("endTransaction");
                            }
                            this.f96658d.incrementAndGet();
                            throw th;
                        }
                    }
                    arrayList.add(axxl);
                    if (!axxl.mo53718a(timingLogger, this.f96660f)) {
                        z2 = true;
                    }
                    break;
                }
                z = false;
                break;
                this.f96660f.setTransactionSuccessful();
                this.f96660f.endTransaction();
                timingLogger.addSplit("endTransaction");
                this.f96658d.incrementAndGet();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (axxl axxl3 : arrayList) {
                    axxl3.mo53717a(timingLogger, this.f96660f, linkedHashMap);
                }
                if (!linkedHashMap.isEmpty()) {
                    this.f96655a.mo53735a(timingLogger, bnkn.m109663a(linkedHashMap.values()));
                }
                int size = arrayList.size();
                StringBuilder sb = new StringBuilder(21);
                sb.append("completed:");
                sb.append(size);
                timingLogger.addSplit(sb.toString());
                if (z) {
                    axxl2 = (axxl) arrayList.get(arrayList.size() - 1);
                } else {
                    axxl2 = null;
                }
                timingLogger.dumpToLog();
            }
        } catch (Throwable th2) {
            String name = Thread.currentThread().getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 88);
            sb2.append("the DataItem Processor Thread, ");
            sb2.append(name);
            sb2.append(", caught the following unknown throwable, killing process");
            Log.w("DataItems", sb2.toString(), th2);
            Process.killProcess(Process.myPid());
        }
    }
}
