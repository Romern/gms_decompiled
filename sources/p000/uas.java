package p000;

import com.google.android.gms.auth.UserRecoverableAuthException;
import java.util.concurrent.TimeUnit;

/* renamed from: uas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uas implements Runnable {

    /* renamed from: b */
    private static final sbw f47050b = new sbw("ApplyOnServerRunnable", "");

    /* renamed from: a */
    public final ube f47051a;

    /* renamed from: c */
    private final vpu f47052c;

    /* renamed from: d */
    private final uhn f47053d;

    /* renamed from: e */
    private final uav f47054e;

    /* renamed from: f */
    private final ufe f47055f;

    /* renamed from: g */
    private final ubd f47056g;

    /* renamed from: h */
    private final vcy f47057h;

    /* renamed from: i */
    private final veg f47058i;

    public uas(vpu vpu, uhn uhn, veg veg, uav uav, ufe ufe, ubd ubd, ube ube, vcy vcy, sqv sqv) {
        sdo.m34959a(vpu);
        this.f47052c = vpu;
        sdo.m34959a(uhn);
        this.f47053d = uhn;
        sdo.m34959a(veg);
        this.f47058i = veg;
        sdo.m34959a(uav);
        this.f47054e = uav;
        sdo.m34959a(ufe);
        this.f47055f = ufe;
        sdo.m34959a(ubd);
        this.f47056g = ubd;
        sdo.m34959a(ube);
        this.f47051a = ube;
        sdo.m34959a(vcy);
        this.f47057h = vcy;
        sdo.m34959a(sqv);
    }

    /* renamed from: a */
    private final void m37847a(tzv tzv, vcs vcs) {
        if (tzv.f47009a) {
            uln uln = this.f47051a.f47108a;
            uln.f48134c++;
            uln.mo27725t();
            if (uln.f48134c >= ((Integer) twy.f46877d.mo58455c()).intValue()) {
                f47050b.mo25373b("ApplyOnServerRunnable", "Too many retries for action. Undoing.", tzv);
            } else {
                throw new uar("Applying action on server failed (Increased attempts)");
            }
        } else {
            f47050b.mo25373b("ApplyOnServerRunnable", "Got non-retryable error on server. Undoing.", tzv);
        }
        vcs.mo28232a(tzv);
        m37848a(true);
    }

    public final void run() {
        vee b;
        vcs e;
        int i;
        uaq uaq;
        vei vei;
        try {
            vcy vcy = this.f47057h;
            vcy.mo28308i();
            vcy.mo28300c(1, 54);
            b = this.f47058i.mo28344b();
            e = this.f47057h.mo28303e();
            e.mo28233a(b);
            txp b2 = this.f47051a.mo27057b();
            vcy vcy2 = this.f47057h;
            vcy2.mo28284a(b2.mo26877a().f47682a);
            vcy2.mo28286a(b2.mo26902k());
            uln uln = this.f47051a.f47108a;
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - uln.f48136e);
            e.mo28235b(uln.f48134c);
            e.mo28231a(seconds);
            if (this.f47051a.mo27061e()) {
                uaq = new uaq(this);
            } else {
                uaq = null;
            }
            vpu vpu = this.f47052c;
            long j = uln.f48366m;
            vfb vfb = this.f47051a.f47110c;
            if (vfb != null) {
                vei = ((veq) vfb).f49134c;
            } else {
                vei = new vei(vez.f49153a);
            }
            txv txv = new txv(vpu, j, uaq, vei, this.f47057h);
            b2.mo26879a(txv);
            e.mo28237d();
            ubd.m37867a(this.f47051a, false, 0, this.f47053d, this.f47055f, this.f47054e);
            this.f47051a.mo27057b().mo26893c(txv);
            e.mo28230a();
            i = 7;
        } catch (tzx e2) {
            e.mo28236c();
            ubd.m37867a(this.f47051a, false, 2, this.f47053d, this.f47055f, this.f47054e);
            e.mo28230a();
            i = 10;
        } catch (vex e3) {
            if (this.f47051a.mo27066j()) {
                e.mo28234b();
            } else {
                e.mo28239f();
            }
            if (this.f47051a.mo27066j()) {
                ubd.m37867a(this.f47051a, true, 3, this.f47053d, this.f47055f, this.f47054e);
                e.mo28230a();
                i = 8;
            } else {
                throw new uar("Applying action on server interrupted (Retryable)");
            }
        } catch (vpy e4) {
            e.mo28232a(e4);
            m37848a(true);
        } catch (uag e5) {
            uag uag = e5;
            if (uag.f47009a) {
                vee b3 = this.f47058i.mo28344b();
                if (vee.DISCONNECTED.equals(b3)) {
                    throw new uap("Applying action on server failed (Disconnect).");
                } else if (!b3.equals(b)) {
                    throw new uar("Applying action on server failed (Connection changed)");
                }
            }
            m37847a(uag, e);
        } catch (tzv e6) {
            m37847a(e6, e);
        } catch (uab e7) {
            f47050b.mo25378c("ApplyOnServerRunnable", "Action is not yet ready to apply on server.", e7);
            e.mo28232a(e7);
            m37848a(false);
        } catch (uaa e8) {
            f47050b.mo25378c("ApplyOnServerRunnable", "Dropped action locally because its entry was deleted.", e8);
            e.mo28232a(e8);
            m37848a(false);
        } catch (uac e9) {
            f47050b.mo25378c("ApplyOnServerRunnable", "Dropped action locally because its parent entry was deleted.", e9);
            e.mo28232a(e9);
            m37848a(true);
        } catch (tzu e10) {
            f47050b.mo25378c("ApplyOnServerRunnable", "Undoing action because the app is no longer authorized.", e10);
            e.mo28232a(e10);
            m37848a(true);
        } catch (uad e11) {
            f47050b.mo25378c("ApplyOnServerRunnable", "Undoing action because the permission was deleted.", e11);
            e.mo28232a(e11);
            m37848a(true);
        } catch (uae e12) {
            uae uae = e12;
            f47050b.mo25378c("ApplyOnServerRunnable", "Undoing action because the permission is not yet ready to apply on server.", uae);
            e.mo28232a(uae);
            m37848a(true);
        } catch (RuntimeException e13) {
            f47050b.mo25378c("ApplyOnServerRunnable", "Unchecked exception while applying action. Undoing.", e13);
            e.mo28238e();
            m37848a(true);
        } catch (UserRecoverableAuthException e14) {
            UserRecoverableAuthException userRecoverableAuthException = e14;
            f47050b.mo25378c("ApplyOnServerRunnable", "Undoing action because there was a user auth error.", userRecoverableAuthException);
            e.mo28232a(userRecoverableAuthException);
            m37848a(true);
        } catch (uar e15) {
            if (this.f47051a.mo27065i()) {
                this.f47056g.mo27042b(this.f47051a, 5);
                return;
            } else {
                this.f47056g.mo27042b(this.f47051a, 4);
                return;
            }
        } catch (uap e16) {
            this.f47056g.mo27042b(this.f47051a, 1);
            return;
        } catch (Exception e17) {
            this.f47056g.mo27039a(this.f47051a, 9);
            vcy vcy3 = this.f47057h;
            vcy3.mo28307h();
            vcy3.mo28274a();
            return;
        } catch (Throwable th) {
            Throwable th2 = th;
            e.mo28230a();
            throw th2;
        }
        this.f47056g.mo27039a(this.f47051a, i);
        vcy vcy4 = this.f47057h;
        vcy4.mo28307h();
        vcy4.mo28274a();
        e.mo28230a();
        i = 9;
        this.f47056g.mo27039a(this.f47051a, i);
        vcy vcy42 = this.f47057h;
        vcy42.mo28307h();
        vcy42.mo28274a();
    }

    /* renamed from: a */
    private final void m37848a(boolean z) {
        ubd.m37867a(this.f47051a, z, 1, this.f47053d, this.f47055f, this.f47054e);
    }
}
