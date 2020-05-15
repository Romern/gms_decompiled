package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: bnba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnba extends bnbb implements bnae {
    private static final long serialVersionUID = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bnba(bmzz bmzz, bnac bnac) {
        super(new bncb(bmzz, bnac));
        bmxy.m108581a(bnac);
    }

    /* JADX INFO: additional move instructions added (2) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: bnaz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: bnaz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: bnaz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: bnaz} */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0085, code lost:
        r12 = r11.mo66988a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        if (r12.mo66974c() != false) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        r14 = r12.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        if (r14 == null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        if (r5.f131349a.mo67092a(r11, r6) != false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        r5.mo67056b(r11, r6);
        r0 = r5.f131362n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r5.unlock();
        r5.mo67062f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a8, code lost:
        r8 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r5.mo67049a(r15, r14, r12.mo66970a(), p000.bncd.f131439d);
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b5, code lost:
        r13 = null;
        r5.mo67049a(r15, (java.lang.Object) null, r12.mo66970a(), p000.bncd.f131438c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bf, code lost:
        r5.f131360l.remove(r11);
        r5.f131361m.remove(r11);
        r5.f131350b = r0;
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cd, code lost:
        r13 = null;
        r0 = false;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    public final Object mo66969a(Object obj) {
        bnbe a;
        Object obj2;
        bnbn bnbn;
        boolean z;
        bnaz bnaz;
        Future future;
        Object obj3;
        Future future2;
        bncc b;
        Object obj4 = obj;
        try {
            bncb bncb = this.f131333a;
            bnac bnac = bncb.f131432r;
            bmxy.m108581a(obj);
            int a2 = bncb.mo67088a(obj4);
            a = bncb.mo67089a(a2);
            bmxy.m108581a(obj);
            bmxy.m108581a(bnac);
            if (!(a.f131350b == 0 || (b = a.mo67052b(obj4, a2)) == null)) {
                long a3 = a.f131349a.f131430p.mo15379a();
                obj3 = a.mo67057c(b, a3);
                if (obj3 == null) {
                    bnbn a4 = b.mo66988a();
                    if (a4.mo66974c()) {
                        obj3 = a.mo67041a(b, obj4, a4);
                    }
                } else {
                    a.mo67047a(b, a3);
                    bmzv bmzv = a.f131362n;
                }
                a.mo67061e();
                return obj3;
            }
            try {
                a.lock();
                long a5 = a.f131349a.f131430p.mo15379a();
                a.mo67059c(a5);
                int i = a.f131350b - 1;
                AtomicReferenceArray atomicReferenceArray = a.f131354f;
                int length = (atomicReferenceArray.length() - 1) & a2;
                bncc bncc = (bncc) atomicReferenceArray.get(length);
                bncc bncc2 = bncc;
                while (true) {
                    if (bncc2 == null) {
                        obj2 = null;
                        bnbn = null;
                        z = true;
                        break;
                    }
                    Object d = bncc2.mo66997d();
                    if (bncc2.mo66995c() == a2) {
                        if (d != null && a.f131349a.f131420f.mo66864b(obj4, d)) {
                            break;
                        }
                    }
                    bncc2 = bncc2.mo66992b();
                }
                if (z) {
                    bnaz bnaz2 = new bnaz();
                    if (bncc2 == null) {
                        bncc2 = a.mo67040a(obj4, a2, bncc);
                        bncc2.mo66990a(bnaz2);
                        atomicReferenceArray.set(length, bncc2);
                        bnaz = bnaz2;
                    } else {
                        bncc2.mo66990a(bnaz2);
                        bnaz = bnaz2;
                    }
                } else {
                    bnaz = obj2;
                }
                a.unlock();
                a.mo67062f();
                if (!z) {
                    obj3 = a.mo67041a(bncc2, obj4, bnbn);
                } else {
                    try {
                        synchronized (bncc2) {
                            try {
                                bnaz.f131332c.mo66930d();
                                bnbn bnbn2 = bnaz.f131330a;
                                Object a6 = bnac.mo66965a(obj4);
                                future = !bnaz.mo67033b(a6) ? bqga.m112775a(a6) : bnaz.f131331b;
                            } catch (Throwable th) {
                                if (!bnaz.f131331b.mo69136a(th)) {
                                    future2 = bqga.m112777a(th);
                                } else {
                                    future2 = bnaz.f131331b;
                                }
                                if (th instanceof InterruptedException) {
                                    Thread.currentThread().interrupt();
                                }
                                future = future2;
                            }
                            try {
                                obj2 = bqhi.m112838a(future);
                                if (obj2 != null) {
                                    try {
                                        bnaz.mo67034f();
                                        a.lock();
                                        long a7 = a.f131349a.f131430p.mo15379a();
                                        a.mo67059c(a7);
                                        int i2 = a.f131350b + 1;
                                        if (i2 > a.f131353e) {
                                            a.mo67060d();
                                            i2 = a.f131350b + 1;
                                        }
                                        AtomicReferenceArray atomicReferenceArray2 = a.f131354f;
                                        int length2 = (atomicReferenceArray2.length() - 1) & a2;
                                        bncc bncc3 = (bncc) atomicReferenceArray2.get(length2);
                                        for (bncc bncc4 = bncc3; bncc4 != null; bncc4 = bncc4.mo66992b()) {
                                            Object d2 = bncc4.mo66997d();
                                            if (bncc4.mo66995c() == a2) {
                                                if (d2 != null) {
                                                    if (a.f131349a.f131420f.mo66864b(obj4, d2)) {
                                                        bnbn a8 = bncc4.mo66988a();
                                                        Object obj5 = a8.get();
                                                        if (bnaz != a8) {
                                                            if (obj5 == null) {
                                                                if (a8 == bncb.f131414s) {
                                                                }
                                                            }
                                                            a.mo67049a(obj4, obj2, 0, bncd.REPLACED);
                                                            a.unlock();
                                                            a.mo67062f();
                                                        }
                                                        a.f131352d++;
                                                        bnaz.mo66975d();
                                                        a.mo67048a(bncc4, obj2, a7);
                                                        a.f131350b = i2;
                                                        a.mo67046a(bncc4);
                                                        a.unlock();
                                                        a.mo67062f();
                                                    }
                                                }
                                            }
                                        }
                                        a.f131352d++;
                                        bncc a9 = a.mo67040a(obj4, a2, bncc3);
                                        a.mo67048a(a9, obj2, a7);
                                        atomicReferenceArray2.set(length2, a9);
                                        a.f131350b = i2;
                                        a.mo67046a(a9);
                                        a.unlock();
                                        a.mo67062f();
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } else {
                                    String valueOf = String.valueOf(obj);
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                                    sb.append("CacheLoader returned null for key ");
                                    sb.append(valueOf);
                                    sb.append(".");
                                    throw new bnab(sb.toString());
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (obj2 == null) {
                                    bnaz.mo67034f();
                                    a.lock();
                                    AtomicReferenceArray atomicReferenceArray3 = a.f131354f;
                                    int length3 = (atomicReferenceArray3.length() - 1) & a2;
                                    bncc bncc5 = (bncc) atomicReferenceArray3.get(length3);
                                    for (bncc bncc6 = bncc5; bncc6 != null; bncc6 = bncc6.mo66992b()) {
                                        Object d3 = bncc6.mo66997d();
                                        if (bncc6.mo66995c() == a2) {
                                            if (d3 != null && a.f131349a.f131420f.mo66864b(obj4, d3)) {
                                                if (bncc6.mo66988a() == bnaz) {
                                                    bnaz.mo66975d();
                                                    atomicReferenceArray3.set(length3, a.mo67051b(bncc5, bncc6));
                                                    a.unlock();
                                                } else {
                                                    a.unlock();
                                                }
                                                a.mo67062f();
                                            }
                                        }
                                    }
                                    a.unlock();
                                    a.mo67062f();
                                }
                                throw th;
                            }
                        }
                        obj3 = obj2;
                    } finally {
                        bmzv bmzv2 = a.f131362n;
                    }
                }
                a.mo67061e();
                return obj3;
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof Error) {
                    throw new bqfc((Error) cause);
                } else if (cause instanceof RuntimeException) {
                    throw new bqhh(cause);
                } else {
                    throw e;
                }
            } catch (Throwable th4) {
                a.unlock();
                a.mo67062f();
                throw th4;
            }
        } catch (ExecutionException e2) {
            throw new bqhh(e2.getCause());
        } catch (Throwable th5) {
            a.mo67061e();
            throw th5;
        }
    }

    public final Object apply(Object obj) {
        return mo66969a(obj);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new bnay(this.f131333a);
    }
}
