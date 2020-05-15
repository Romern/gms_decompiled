package p000;

import android.content.Context;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.WriteBatch;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: aqeo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqeo extends aqas {

    /* renamed from: c */
    private static aqeo f85890c = null;

    /* renamed from: d */
    private LevelDb f85891d = null;

    static {
        aqeo.class.getSimpleName();
    }

    private aqeo(Context context) {
        super(context);
        mo47798c();
        aqfx.m71551a(this.f85891d, 0);
    }

    /* renamed from: a */
    static synchronized aqeo m71448a(Context context) {
        aqeo aqeo;
        synchronized (aqeo.class) {
            if (f85890c == null) {
                f85890c = new aqeo(context);
            }
            aqeo = f85890c;
        }
        return aqeo;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized boolean mo47798c() {
        LevelDb a = mo47720a(false, this.f85891d, "snet_cached_events");
        this.f85891d = a;
        return a != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo47799d() {
        try {
            this.f85891d.close();
            this.f85891d = null;
        } catch (Exception e) {
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x000d] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003a A[SYNTHETIC, Splitter:B:22:0x003a] */
    /* renamed from: e */
    public final synchronized List mo47800e() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        LevelDb.Iterator iterator = null;
        try {
            iterator = this.f85891d.iterator();
            try {
                iterator.seekToFirst();
                while (iterator.isValid()) {
                    byte[] value = iterator.value();
                    apyn apyn = apyn.f85156g;
                    arrayList.add((apyn) GeneratedMessageLite.m124014a(apyn.f85156g, value));
                    iterator.next();
                }
                if (iterator != null) {
                    try {
                        iterator.close();
                    } catch (Exception e) {
                    }
                }
            } catch (Exception e2) {
            } catch (Throwable th) {
            }
        } catch (Exception e3) {
            if (iterator != null) {
                iterator.close();
            }
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            if (iterator != null) {
                try {
                    iterator.close();
                } catch (Exception e4) {
                }
            }
            throw th;
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: f */
    public final synchronized void mo47801f() {
        long a = mo47795a();
        this.f85891d.deleteRange(null, null);
        mo47796a(a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized long mo47795a() {
        return aqfx.m71550a(this.f85891d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo47796a(long j) {
        aqfx.m71551a(this.f85891d, j);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0042 A[SYNTHETIC, Splitter:B:25:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004d A[SYNTHETIC, Splitter:B:32:0x004d] */
    /* renamed from: a */
    public final synchronized void mo47797a(List list) {
        if (list != null) {
            if (!list.isEmpty()) {
                WriteBatch writeBatch = null;
                try {
                    writeBatch = WriteBatch.create();
                    try {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            apyn apyn = (apyn) it.next();
                            writeBatch.put(bqcr.m112599b(apyn.f85161d), apyn.serializeToBytes());
                        }
                        this.f85891d.write(writeBatch);
                    } catch (Exception | OutOfMemoryError e) {
                        if (writeBatch != null) {
                            writeBatch.close();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        if (writeBatch != null) {
                            try {
                                writeBatch.close();
                            } catch (Exception e2) {
                            }
                        }
                        throw th;
                    }
                    try {
                        writeBatch.close();
                    } catch (Exception e3) {
                    }
                } catch (Exception | OutOfMemoryError e4) {
                    if (writeBatch != null) {
                    }
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    if (writeBatch != null) {
                    }
                    throw th;
                }
            }
        }
    }
}
