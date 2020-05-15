package p000;

import com.google.android.gms.auth.UserRecoverableAuthException;
import java.util.concurrent.ExecutionException;

/* renamed from: aeew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aeew {

    /* renamed from: a */
    private final aeev f63297a;

    private aeew(aeev aeev) {
        this.f63297a = aeev;
    }

    /* renamed from: a */
    static aeew m51774a(aeev aeev) {
        return new aeew(aeev);
    }

    /* renamed from: a */
    static bbix m51775a(Exception exc) {
        if (exc instanceof InterruptedException) {
            return bbix.m88067a(bylb.INTERRUPTED_EXCEPTION);
        }
        if (((InterruptedException) m51778a(exc, InterruptedException.class)) != null) {
            return bbix.m88067a(bylb.TASK_INTERRUPTED_EXCEPTION);
        }
        if (((bbjh) m51778a(exc, bbjh.class)) != null) {
            return bbix.m88067a(bylb.SYNC_CONSTRAINTS_NOT_MET_EXCEPTION);
        }
        chuw chuw = (chuw) m51778a(exc, chuw.class);
        if (chuw != null) {
            return bbix.m88068a(bylb.GRPC_STATUS_EXCEPTION, chuw.f189236a);
        }
        chux chux = (chux) m51778a(exc, chux.class);
        if (chux != null) {
            return bbix.m88068a(bylb.GRPC_STATUS_EXCEPTION, chux.f189238a);
        }
        gid gid = (gid) m51778a(exc, gid.class);
        if (gid == null) {
            return bbix.m88067a(bylb.UNCLASSIFIED_EXCEPTION);
        }
        if (gid instanceof gil) {
            return bbix.m88067a(bylb.GOOGLE_PLAY_SERVICES_AVAILABILITY_EXCEPTION);
        }
        if (gid instanceof UserRecoverableAuthException) {
            return bbix.m88067a(bylb.USER_RECOVERABLE_AUTH_EXCEPTION);
        }
        if (gid instanceof C1020gis) {
            return bbix.m88067a(bylb.USER_RECOVERABLE_NOTIFIED_EXCEPTION);
        }
        return bbix.m88067a(bylb.GOOGLE_AUTH_EXCEPTION);
    }

    /* renamed from: a */
    private static final Integer m51776a(bykp bykp, Exception exc) {
        bykp bykp2 = bykp.RESULT_UNKNOWN;
        int ordinal = bykp.ordinal();
        if (ordinal == 1) {
            return 0;
        }
        if (ordinal == 2) {
            return 1;
        }
        if (ordinal == 3) {
            return 2;
        }
        if (ordinal != 4 || !cfhk.f184104a.mo6606a().mo81259h()) {
            return null;
        }
        throw new aeex(exc);
    }

    /* renamed from: a */
    private static final Integer m51777a(byks byks, Exception exc) {
        bykr bykr;
        Integer b;
        bykp bykp = null;
        if (byks != null) {
            bbix a = m51775a(exc);
            int i = ((bylb) a.mo56154a()).f166822l;
            bxww bxww = byks.f166788a;
            Integer valueOf = Integer.valueOf(i);
            if (bxww.containsKey(valueOf)) {
                bykr = (bykr) bxww.get(valueOf);
            } else {
                bykr = null;
            }
            if (bykr != null) {
                if (a.mo56154a() == bylb.GRPC_STATUS_EXCEPTION && (b = a.mo56155b()) != null) {
                    int intValue = b.intValue();
                    bxww bxww2 = bykr.f166784b;
                    Integer valueOf2 = Integer.valueOf(intValue);
                    if (bxww2.containsKey(valueOf2)) {
                        bykp = (bykp) bykr.f166781d.mo74163a(bxww2.get(valueOf2));
                    }
                    if (bykp != null) {
                        return m51776a(bykp, exc);
                    }
                }
                bykp a2 = bykp.m124908a(bykr.f166783a);
                if (a2 == null) {
                    a2 = bykp.RESULT_UNKNOWN;
                }
                return m51776a(a2, exc);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static Object m51778a(Throwable th, Class cls) {
        boolean z = false;
        Throwable th2 = th;
        while (th != null) {
            if (cls.isInstance(th)) {
                return cls.cast(th);
            }
            th = th.getCause();
            if (th == th2) {
                return null;
            }
            if (z) {
                bmxy.m108581a(th2);
                th2 = th2.getCause();
            }
            z = !z;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo34108a(byks byks, bqgg bqgg, bmxj bmxj) {
        Integer num;
        if (this.f63297a.mo14852a()) {
            try {
                Object obj = bqgg.get();
                if (bmxj == null) {
                    return 0;
                }
                Integer num2 = (Integer) bmxj.apply(obj);
                bmxy.m108581a(num2);
                return num2.intValue();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                num = m51777a(byks, e);
                if (num == null) {
                    return 1;
                }
                return num.intValue();
            } catch (ExecutionException e2) {
                num = m51777a(byks, e2);
                if (num == null) {
                    return 2;
                }
                return num.intValue();
            }
        } else {
            try {
                bqgg.get();
                return 0;
            } catch (InterruptedException e3) {
                Thread.currentThread().interrupt();
                return 1;
            } catch (ExecutionException e4) {
                return !(e4.getCause() instanceof bbjh) ? 2 : 1;
            }
        }
    }
}
