package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ciiq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciiq {

    /* renamed from: a */
    public static final chqn f190419a = chqn.m149404a("internal-stub-type");

    /* renamed from: b */
    private static final Logger f190420b = Logger.getLogger(ciiq.class.getName());

    private ciiq() {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ciiq.a(chqs, java.lang.Object, chqr, boolean):void
     arg types: [chqs, java.lang.Object, ciip, int]
     candidates:
      ciiq.a(chqp, chtv, chqo, java.lang.Object):java.lang.Object
      ciiq.a(chqs, java.lang.Object, chqr, boolean):void */
    /* renamed from: a */
    public static bqgg m150392a(chqs chqs, Object obj) {
        ciil ciil = new ciil(chqs);
        m150397a(chqs, obj, (chqr) new ciip(ciil), false);
        return ciil;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ciiq.a(chqs, chqr, boolean):void
     arg types: [chqs, ciim, int]
     candidates:
      ciiq.a(chqs, java.lang.Object, ciiv):void
      ciiq.a(chqs, chqr, boolean):void */
    /* renamed from: a */
    public static ciiv m150393a(chqs chqs, ciiv ciiv) {
        ciik ciik = new ciik(chqs);
        m150396a(chqs, (chqr) new ciim(ciiv, ciik), true);
        return ciik;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ciiq.a(chqs, java.lang.Throwable):java.lang.RuntimeException
     arg types: [chqs, java.lang.Error]
     candidates:
      ciiq.a(chqs, java.lang.Object):bqgg
      ciiq.a(chqs, ciiv):ciiv
      ciiq.a(chqs, java.lang.Throwable):java.lang.RuntimeException */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ciiq.a(chqs, java.lang.Throwable):java.lang.RuntimeException
     arg types: [chqs, java.lang.RuntimeException]
     candidates:
      ciiq.a(chqs, java.lang.Object):bqgg
      ciiq.a(chqs, ciiv):ciiv
      ciiq.a(chqs, java.lang.Throwable):java.lang.RuntimeException */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f6  */
    /* renamed from: a */
    public static Object m150394a(chqp chqp, chtv chtv, chqo chqo, Object obj) {
        RuntimeException e;
        Error e2;
        ciio ciio = new ciio();
        chqo chqo2 = new chqo(chqo);
        chqo2.f189008c = ciio;
        chqs a = chqp.mo70053a(chtv, chqo2);
        boolean z = true;
        boolean z2 = false;
        try {
            bqgg a2 = m150392a(a, obj);
            while (!a2.isDone()) {
                try {
                    try {
                        ciio.m150388a();
                        Runnable runnable = (Runnable) ciio.poll();
                        if (runnable == null) {
                            ciio.f190416b = Thread.currentThread();
                            while (true) {
                                runnable = (Runnable) ciio.poll();
                                if (runnable != null) {
                                    break;
                                }
                                LockSupport.park(ciio);
                                ciio.m150388a();
                            }
                            ciio.f190416b = null;
                        }
                        do {
                            try {
                                runnable.run();
                            } catch (Throwable th) {
                                ciio.f190415a.logp(Level.WARNING, "io.grpc.stub.ClientCalls$ThreadlessExecutor", "waitAndDrain", "Runnable threw exception", th);
                            }
                            runnable = (Runnable) ciio.poll();
                        } while (runnable != null);
                    } catch (InterruptedException e3) {
                        try {
                            a.mo70031a("Thread interrupted", e3);
                            z2 = true;
                        } catch (RuntimeException e4) {
                            e = e4;
                            throw m150395a(a, (Throwable) e);
                        } catch (Error e5) {
                            e2 = e5;
                            throw m150395a(a, (Throwable) e2);
                        }
                    } catch (Throwable th2) {
                        ciio.f190416b = null;
                        throw th2;
                    }
                } catch (InterruptedException e6) {
                    Thread.currentThread().interrupt();
                    throw chuv.f189216c.mo85687a("Thread interrupted").mo85692c(e6).mo85691b();
                } catch (ExecutionException e7) {
                    Throwable cause = e7.getCause();
                    bmxy.m108582a(cause, "t");
                    Throwable th3 = cause;
                    while (th3 != null) {
                        if (th3 instanceof chuw) {
                            throw new chux(((chuw) th3).f189236a, null);
                        } else if (!(th3 instanceof chux)) {
                            th3 = th3.getCause();
                        } else {
                            chux chux = (chux) th3;
                            throw new chux(chux.f189238a, chux.f189239b);
                        }
                    }
                    throw chuv.f189217d.mo85687a("unexpected exception").mo85692c(cause).mo85691b();
                } catch (RuntimeException e8) {
                    e = e8;
                    throw m150395a(a, (Throwable) e);
                } catch (Error e9) {
                    e2 = e9;
                    z = z2;
                    throw m150395a(a, (Throwable) e2);
                } catch (Throwable th4) {
                    th = th4;
                    z = z2;
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            Object obj2 = a2.get();
            if (z2) {
                Thread.currentThread().interrupt();
            }
            return obj2;
        } catch (RuntimeException e10) {
            e = e10;
            throw m150395a(a, (Throwable) e);
        } catch (Error e11) {
            e2 = e11;
            z = false;
            throw m150395a(a, (Throwable) e2);
        } catch (Throwable th5) {
            th = th5;
            if (z) {
            }
            throw th;
        }
    }

    /* renamed from: a */
    private static RuntimeException m150395a(chqs chqs, Throwable th) {
        try {
            chqs.mo70031a((String) null, th);
        } catch (Throwable th2) {
            f190420b.logp(Level.SEVERE, "io.grpc.stub.ClientCalls", "cancelThrow", "RuntimeException encountered while closing call", th2);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        } else {
            throw new AssertionError(th);
        }
    }

    /* renamed from: a */
    private static void m150396a(chqs chqs, chqr chqr, boolean z) {
        chqs.mo56351a(chqr, new chtr());
        if (z) {
            chqs.mo70029a(1);
        } else {
            chqs.mo70029a(2);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ciiq.a(chqs, java.lang.Throwable):java.lang.RuntimeException
     arg types: [chqs, java.lang.Error]
     candidates:
      ciiq.a(chqs, java.lang.Object):bqgg
      ciiq.a(chqs, ciiv):ciiv
      ciiq.a(chqs, java.lang.Throwable):java.lang.RuntimeException */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ciiq.a(chqs, java.lang.Throwable):java.lang.RuntimeException
     arg types: [chqs, java.lang.RuntimeException]
     candidates:
      ciiq.a(chqs, java.lang.Object):bqgg
      ciiq.a(chqs, ciiv):ciiv
      ciiq.a(chqs, java.lang.Throwable):java.lang.RuntimeException */
    /* renamed from: a */
    private static void m150397a(chqs chqs, Object obj, chqr chqr, boolean z) {
        m150396a(chqs, chqr, z);
        try {
            chqs.mo70030a(obj);
            chqs.mo70032b();
        } catch (RuntimeException e) {
            throw m150395a(chqs, (Throwable) e);
        } catch (Error e2) {
            throw m150395a(chqs, (Throwable) e2);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ciiq.a(chqs, java.lang.Object, chqr, boolean):void
     arg types: [chqs, java.lang.Object, ciim, int]
     candidates:
      ciiq.a(chqp, chtv, chqo, java.lang.Object):java.lang.Object
      ciiq.a(chqs, java.lang.Object, chqr, boolean):void */
    /* renamed from: a */
    public static void m150398a(chqs chqs, Object obj, ciiv ciiv) {
        m150397a(chqs, obj, (chqr) new ciim(ciiv, new ciik(chqs)), true);
    }
}
