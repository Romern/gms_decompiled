package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: bgll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgll implements bugo, bugl {

    /* renamed from: a */
    public final bugn f116765a;

    /* renamed from: b */
    public sns f116766b;

    /* renamed from: c */
    snr f116767c;

    /* renamed from: d */
    public bglk f116768d;

    /* renamed from: e */
    public bglk f116769e;

    /* renamed from: f */
    private final ReadWriteLock f116770f = new ReentrantReadWriteLock();

    /* renamed from: g */
    private final bgns f116771g;

    /* renamed from: h */
    private final bfor f116772h;

    /* renamed from: i */
    private bugr f116773i;

    public bgll(bugn bugn, bgns bgns, bfor bfor) {
        this.f116765a = bugn;
        this.f116771g = bgns;
        this.f116772h = bfor;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo61880a(int i) {
        try {
            this.f116770f.writeLock().lock();
            bugr bugr = this.f116773i;
            if (bugr != null) {
                bugr.mo72645b(this);
                this.f116773i = null;
            }
            this.f116770f.writeLock().unlock();
            bglk bglk = this.f116769e;
            if (bglk != null && i == 2) {
                ((bgle) bglk).mo62976d();
            }
            if (this.f116768d != null) {
                this.f116771g.mo62921a((Runnable) new bglj(this, i));
            }
        } catch (Throwable th) {
            this.f116770f.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public final int mo62983b() {
        try {
            this.f116770f.readLock().lock();
            bugr bugr = this.f116773i;
            if (bugr != null) {
                return bugr.mo72647c();
            }
            this.f116770f.readLock().unlock();
            return -1;
        } finally {
            this.f116770f.readLock().unlock();
        }
    }

    /* renamed from: b */
    public final void mo61884b(int i) {
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: cr */
    public final void mo61886cr() {
        try {
            this.f116770f.writeLock().lock();
            bugr a = this.f116765a.mo72627a(5147455389092024331L);
            this.f116773i = a;
            if (a != null) {
                a.mo72643a(this, this.f116767c);
                this.f116770f.writeLock().unlock();
                bglk bglk = this.f116769e;
                if (bglk != null) {
                    bgle bgle = (bgle) bglk;
                    bgle.mo62976d();
                    bgle.mo62975c();
                }
                if (this.f116768d != null) {
                    this.f116771g.mo62921a((Runnable) new bgli(this));
                    return;
                }
                return;
            }
            this.f116770f.writeLock().unlock();
        } catch (Throwable th) {
            this.f116770f.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo61878a(bugn bugn, bugr bugr, buhd buhd) {
        try {
            this.f116770f.readLock().lock();
            if (bugr != null) {
                if (bugr.mo72639a() == 5147455389092024331L) {
                    this.f116770f.readLock().unlock();
                    bglk bglk = this.f116769e;
                    if (bglk != null && bufp.m119413a(buhd.f153831a) == 114) {
                        bgle bgle = (bgle) bglk;
                        bgle.f116750a.lock();
                        try {
                            if (((bgle) bglk).f116752c == null) {
                                bxvv bxvv = new bxvv(((bubv) buhd.mo72661a((bxxk) bubv.f153284f.mo74142c(7))).f153287b, bubv.f153283c);
                                int[] e = ((bgle) bglk).mo62977e();
                                int length = e.length;
                                boolean z = false;
                                int i = 0;
                                while (true) {
                                    if (i < length) {
                                        if (!bxvv.contains(bglg.m99238a(e[i]))) {
                                            break;
                                        }
                                        i++;
                                    } else {
                                        z = true;
                                        break;
                                    }
                                }
                                ((bgle) bglk).f116752c = Boolean.valueOf(z);
                                ((bgle) bglk).f116753d = bxvv;
                                ((bgle) bglk).f116751b.signalAll();
                            }
                        } finally {
                            bgle.f116750a.unlock();
                        }
                    }
                    if (this.f116768d != null) {
                        this.f116771g.mo62921a((Runnable) new bglh(this, buhd));
                    }
                }
            }
        } finally {
            this.f116770f.readLock().unlock();
        }
    }

    /* renamed from: a */
    public final boolean mo62982a(bubt bubt) {
        ReadWriteLock readWriteLock;
        try {
            this.f116770f.readLock().lock();
            bugr bugr = this.f116773i;
            if (bugr != null) {
                bugu a = bugr.mo72640a((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, 1, bubt);
                if (a != null) {
                    int intValue = ((Integer) a.get(1, TimeUnit.SECONDS)).intValue();
                    if (intValue != 0) {
                        StringBuilder sb = new StringBuilder(61);
                        sb.append("Failed to send message to nanoapp: request result=");
                        sb.append(intValue);
                        sb.toString();
                    } else {
                        this.f116770f.readLock().unlock();
                        return true;
                    }
                }
                this.f116772h.mo62048a(bfos.CHRE_AR_MSG_FAILURE);
                readWriteLock = this.f116770f;
            } else {
                readWriteLock = this.f116770f;
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() == 0) {
                new String("Failed to send message to nanoapp: ");
            } else {
                "Failed to send message to nanoapp: ".concat(valueOf);
            }
        } catch (Throwable th) {
            this.f116770f.readLock().unlock();
            throw th;
        }
        readWriteLock.readLock().unlock();
        return false;
    }
}
