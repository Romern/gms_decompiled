package p000;

import android.content.Context;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.leveldb.WriteBatch;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: aqei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqei extends aqas {

    /* renamed from: c */
    private static aqei f85873c = null;

    /* renamed from: d */
    private LevelDb f85874d = null;

    static {
        aqei.class.getSimpleName();
    }

    private aqei(Context context) {
        super(context);
        mo47791d();
        aqfx.m71551a(this.f85874d, 0);
    }

    /* renamed from: a */
    static synchronized aqei m71432a(Context context) {
        aqei aqei;
        synchronized (aqei.class) {
            if (f85873c == null) {
                f85873c = new aqei(context);
            }
            aqei = f85873c;
        }
        return aqei;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized long mo47790c() {
        return aqfx.m71550a(this.f85874d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo47791d() {
        LevelDb a = mo47720a(false, this.f85874d, "blocked_bal_logs");
        this.f85874d = a;
        return a != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo47792e() {
        try {
            this.f85874d.close();
            this.f85874d = null;
        } catch (Exception e) {
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0079, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0079 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x000d] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0080 A[SYNTHETIC, Splitter:B:30:0x0080] */
    /* renamed from: f */
    public final synchronized List mo47793f() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        LevelDb.Iterator iterator = null;
        try {
            iterator = this.f85874d.iterator();
            try {
                iterator.seekToFirst();
                while (iterator.isValid()) {
                    apyl apyl = apyl.f85146d;
                    bxvd da = apyl.f85146d.mo74144da();
                    byte[] key = iterator.key();
                    apym apym = apym.f85151d;
                    apym apym2 = (apym) bxvk.m124014a(apym.f85151d, key);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    apyl apyl2 = (apyl) da.f164949b;
                    apym2.getClass();
                    apyl2.f85149b = apym2;
                    apyl2.f85148a |= 1;
                    int a = bqcn.m112579a(iterator.value());
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    apyl apyl3 = (apyl) da.f164949b;
                    apyl3.f85148a |= 2;
                    apyl3.f85150c = a;
                    arrayList.add((apyl) da.mo74062i());
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
    /* renamed from: g */
    public final synchronized void mo47794g() {
        long c = mo47790c();
        boolean a = mo47789a();
        this.f85874d.deleteRange(null, null);
        mo47786a(c);
        mo47788a(a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo47786a(long j) {
        aqfx.m71551a(this.f85874d, j);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0058 A[SYNTHETIC, Splitter:B:33:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0063 A[SYNTHETIC, Splitter:B:40:0x0063] */
    /* renamed from: a */
    public final synchronized void mo47787a(List list) {
        int i;
        if (list != null) {
            if (!list.isEmpty()) {
                WriteBatch writeBatch = null;
                try {
                    writeBatch = WriteBatch.create();
                    try {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            apyl apyl = (apyl) it.next();
                            apym apym = apyl.f85149b;
                            if (apym == null) {
                                apym = apym.f85151d;
                            }
                            byte[] k = apym.mo73642k();
                            byte[] bArr = this.f85874d.get(k);
                            if (bArr != null) {
                                i = bqcn.m112579a(bArr);
                            } else {
                                i = 0;
                            }
                            writeBatch.put(k, bqcn.m112583a(i + apyl.f85150c));
                        }
                        this.f85874d.write(writeBatch);
                        try {
                            writeBatch.close();
                        } catch (Exception e) {
                        }
                    } catch (Exception | OutOfMemoryError e2) {
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
                            } catch (Exception e3) {
                            }
                        }
                        throw th;
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

    /* JADX WARN: Type inference failed for: r0v1, types: [byte[]], assign insn: 0x0002: NEW_ARRAY  (r0v1 ? I:byte[]) = (1 int) type: byte[] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final synchronized void mo47788a(boolean z) {
        this.f85874d.put(bqcn.m112583a(2), new byte[]{z ? (byte) 1 : 0});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean mo47789a() {
        boolean z;
        cgkr.m145927c();
        z = false;
        try {
            if (this.f85874d.get(bqcn.m112583a(2))[0] == 0) {
                return false;
            }
            z = true;
        } catch (LevelDbException | RuntimeException e) {
        }
        return z;
    }
}
