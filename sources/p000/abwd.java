package p000;

import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;

/* renamed from: abwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abwd implements abwl {

    /* renamed from: a */
    final /* synthetic */ briw f58610a;

    /* renamed from: b */
    private final Deque f58611b;

    /* renamed from: c */
    private final Deque f58612c;

    /* renamed from: d */
    private int f58613d = 0;

    public abwd(briw briw, bngx bngx) {
        this.f58610a = briw;
        this.f58611b = new ArrayDeque(bngx);
        this.f58612c = new ArrayDeque();
    }

    /* renamed from: a */
    private static final void m48381a(String str, bpzq bpzq, Deque deque) {
        while (!deque.isEmpty()) {
            ((abwe) deque.removeFirst()).mo32381a(str, bpzq);
        }
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00bf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c0, code lost:
        r15.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x016e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        p000.absg.m48200c(r0, "AppIndexing batch request failed", new java.lang.Object[0]);
        r2 = p000.bpzq.INTERNAL_ERROR;
        r1.f58610a.f142887c.mo32456a("AppIndexingService INTERNAL_ERROR", r0, p000.cema.m137239f());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0186, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0187, code lost:
        p000.absg.m48200c(r0, "AppIndexing batch request failed", new java.lang.Object[0]);
        r2 = p000.bpzq.SEQUENCE_TABLE_FULL;
        r3 = r0.getMessage();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0186 A[Catch:{ abxw -> 0x0186 }, ExcHandler: abxw (r0v9 'e' abxw A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:5:0x0009] */
    /* renamed from: a */
    public final synchronized void mo32380a(abwn abwn) {
        Throwable th;
        boolean z;
        boolean z2;
        synchronized (this) {
            bpzq bpzq = bpzq.NO_ERROR;
            String str = null;
            str = null;
            try {
                absg.m48184a("Batch request initializing");
                briw briw = this.f58610a;
                abvo a = abvo.m48336a(briw.f142885a.f60609b, briw.f142889e);
                abrv b = this.f58610a.f142885a.mo33016b();
                abxt a2 = abxt.m48504a(this.f58610a.f142885a.f60609b);
                absg.m48185a("Batch request validating %d tasks", Integer.valueOf(this.f58611b.size()));
                while (!this.f58611b.isEmpty()) {
                    abwe abwe = (abwe) this.f58611b.getFirst();
                    abxd abxd = abwe.f58614a;
                    boolean z3 = true;
                    try {
                        abxd.mo32406a(this.f58610a.f142890f, b, a2);
                        this.f58613d += abxd.mo32399a();
                        abxd.mo32401a(this.f58610a.f142890f, b);
                        th = null;
                    } catch (abxq e) {
                        absg.m48200c(e, "AppIndexing batch request validation of task failed", new Object[0]);
                        Pair a3 = abwe.mo32408a(e);
                        abwe abwe2 = (abwe) this.f58611b.removeFirst();
                        sdo.m34970a(abwe2 == abwe);
                        abwe2.mo32381a((String) a3.first, (bpzq) a3.second);
                        th = e;
                    } catch (abxx e2) {
                        absg.m48200c(e2, "AppIndexing batch request validation of task failed", new Object[0]);
                        Pair a4 = abwe.mo32409a(e2);
                        abwe abwe3 = (abwe) this.f58611b.removeFirst();
                        if (abwe3 == abwe) {
                            z = true;
                        } else {
                            z = false;
                        }
                        sdo.m34970a(z);
                        abwe3.mo32381a((String) a4.first, (bpzq) a4.second);
                        th = e2;
                    } catch (Exception e3) {
                        absg.m48200c(e3, "AppIndexing batch request validation of task failed", new Object[0]);
                        abwe abwe4 = (abwe) this.f58611b.removeFirst();
                        if (abwe4 == abwe) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        sdo.m34970a(z2);
                        abwe4.mo32381a((String) null, bpzq.INTERNAL_ERROR);
                        th = e3;
                    }
                    if (th == null) {
                        abwe abwe5 = (abwe) this.f58611b.removeFirst();
                        if (abwe5 != abwe) {
                            z3 = false;
                        }
                        sdo.m34970a(z3);
                        this.f58612c.add(abwe5);
                    }
                }
                absg.m48185a("Batch request executing %d mutations", Integer.valueOf(this.f58612c.size()));
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                this.f58610a.mo69579a(a, a2);
                SQLiteDatabase writableDatabase = a.getWritableDatabase();
                writableDatabase.beginTransaction();
                int i = this.f58613d;
                if (i > 0) {
                    a.mo32360a(writableDatabase, this.f58610a.f142890f, b, a2, i);
                }
                for (abwe abwe6 : this.f58612c) {
                    abxb a5 = ((abxc) abwe6.f58614a).mo32404a(writableDatabase, a, this.f58610a.f142890f, a2);
                    hashSet.addAll(a5.f58667a);
                    hashSet2.addAll(a5.f58668b);
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                absg.m48184a("Batch request syncing corpora");
                hashSet.removeAll(hashSet2);
                a.mo32362a(hashSet2, this.f58610a.f142890f, b, 8);
                a.mo32364b(hashSet, this.f58610a.f142890f, b, 8);
            } catch (abxw e4) {
            }
            if (!rjs.m33678d(abxr.m48488a(bpzq)) || !abwn.mo32385b()) {
                absg.m48184a("Batch request sending results");
                abwn.mo32384a();
                m48381a(str, bpzq, this.f58611b);
                m48381a(str, bpzq, this.f58612c);
                absg.m48184a("Batch request finished");
            }
        }
    }
}
