package p000;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.view.WindowManager;
import com.google.android.gms.update.SystemUpdateStatus;
import java.io.File;
import java.util.ArrayList;

/* renamed from: avnt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avnt extends avnn {

    /* renamed from: e */
    public static final sek f93546e = avpq.m79018e("AbRebootAction");

    /* renamed from: f */
    public static final avto f93547f = new avto("file_path", "");

    /* renamed from: g */
    public static final avto f93548g = new avto("payload_metadata_file_path", "");

    /* renamed from: k */
    private static final avto f93549k = new avto("installation_success_message", "");

    /* renamed from: l */
    private static final avto f93550l = new avto("installation_failure_message", "");

    /* renamed from: m */
    private static final avtk f93551m = new avtk("boot_token", -1L);

    /* renamed from: n */
    private static final avta f93552n = new avta("reboot_prepared", false);

    /* renamed from: h */
    public final Context f93553h;

    /* renamed from: i */
    public final PowerManager f93554i;

    /* renamed from: j */
    public final avmx f93555j = ((avmx) avmx.f93453h.mo51589b());

    /* renamed from: o */
    private final WindowManager f93556o = ((WindowManager) this.f93553h.getSystemService("window"));

    /* renamed from: p */
    private final avtn f93557p = ((avtn) avtn.f93892a.mo51589b());

    /* renamed from: q */
    private final avmq f93558q = ((avmq) avmq.f93413e.mo51589b());

    public avnt(Context context, avte avte) {
        super("ab-reboot", avte);
        this.f93553h = context;
        this.f93554i = (PowerManager) context.getSystemService("power");
    }

    /* renamed from: a */
    private final void m78885a(boolean z) {
        avsp avsp;
        bmxv bmxv = (bmxv) this.f93557p.mo51607b(avnp.f93533h);
        if (bmxv.mo66813a()) {
            if (bmxx.m108577a((String) mo51433a(f93548g))) {
                avsp = (avsp) bmxv.mo66814b();
            } else {
                avsp avsp2 = (avsp) bmxv.mo66814b();
                File file = new File((String) mo51433a(f93548g));
                bxvd bxvd = (bxvd) avsp2.mo74142c(5);
                bxvd.mo73625a((bxvk) avsp2);
                avso avso = (avso) bxvd;
                String valueOf = String.valueOf(file.getAbsolutePath());
                String str = valueOf.length() == 0 ? new String("file://") : "file://".concat(valueOf);
                if (avso.f164950c) {
                    avso.mo74035c();
                    avso.f164950c = false;
                }
                avsp avsp3 = avsp.f93843d;
                str.getClass();
                ((avsp) avso.f164949b).f93845a = str;
                avsq avsq = avsp2.f93847c;
                if (avsq == null) {
                    avsq = avsq.f93848d;
                }
                bxvd bxvd2 = (bxvd) avsq.mo74142c(5);
                bxvd2.mo73625a((bxvk) avsq);
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                ((avsq) bxvd2.f164949b).f93851b = 0;
                if (avso.f164950c) {
                    avso.mo74035c();
                    avso.f164950c = false;
                }
                avsq avsq2 = (avsq) bxvd2.mo74062i();
                avsq2.getClass();
                ((avsp) avso.f164949b).f93847c = avsq2;
                avsp = (avsp) avso.mo74062i();
            }
            avpk a = avpk.m78987a();
            try {
                a.mo51466b();
                ArrayList arrayList = new ArrayList();
                bnre i = avou.m78960a(this.f93553h).listIterator();
                while (i.hasNext()) {
                    C1240of ofVar = (C1240of) i.next();
                    String str2 = (String) ofVar.f26798a;
                    String str3 = (String) ofVar.f26799b;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str3).length());
                    sb.append(str2);
                    sb.append("=");
                    sb.append(str3);
                    arrayList.add(sb.toString());
                }
                if (((Boolean) a.f93704c.mo51607b(avnp.f93538m)).booleanValue() != z) {
                    if (z) {
                        bngs j = bngx.m109377j();
                        j.mo67668c("RUN_POST_INSTALL=0");
                        j.mo67666b((Iterable) arrayList);
                        a.mo51464a(avsp, j.mo67664a());
                    } else {
                        a.mo51469e();
                    }
                }
            } catch (InterruptedException e) {
                f93546e.mo25413c("Error when calling SynchronizedUpdateEngine.setSwitchSlotOnReboot().", e, new Object[0]);
            } catch (Throwable th) {
                a.mo51467c();
                throw th;
            }
            a.mo51467c();
        }
    }

    /* renamed from: e */
    private final boolean m78886e() {
        return ((Boolean) mo51433a(f93552n)).booleanValue() && ((Long) mo51433a(f93551m)).longValue() != this.f93558q.mo51394d();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avmx.a(int, double):void
     arg types: [int, int]
     candidates:
      avmx.a(int, int):void
      avmx.a(int, double):void */
    /* renamed from: c */
    public final avni mo51435c() {
        avsw a = avou.m78959a();
        if (cfsg.m142815b() && avlx.m78768b(a) && !m78886e()) {
            f93546e.mo25414c("Bypassing the self-update check.", new Object[0]);
        } else if (avlx.m78768b(a)) {
            if (!((String) mo51433a(f93549k)).isEmpty()) {
                this.f93553h.startActivity(avmg.m78796a((String) mo51433a(f93549k)));
            }
            this.f93555j.mo51402a(5, -1.0d);
            return new avni("finished-execution", avte.m79305a(new avtc[0]));
        }
        if (m78886e() && !avlx.m78768b(a)) {
            this.f93555j.mo51402a(1298, -1.0d);
            if (!((String) mo51433a(f93550l)).isEmpty()) {
                this.f93553h.startActivity(avmg.m78796a((String) mo51433a(f93550l)));
            }
            return new avni("finished-execution", avte.m79305a(new avtc[0]));
        } else if (!avlx.m78767a(a)) {
            SystemUpdateStatus d = this.f93555j.mo51414d();
            if (!bmxx.m108577a(d.f109459a)) {
                if (!d.f109468j) {
                    if (avme.m78791a(this.f93553h, d, true)) {
                        this.f93555j.mo51402a(528, -1.0d);
                        m78885a(true);
                        avtd b = mo51432a().mo51598b();
                        b.mo51594a(f93551m, Long.valueOf(this.f93558q.mo51394d()));
                        b.mo51594a(f93549k, (String) avma.f93359e.mo51364a());
                        b.mo51594a(f93550l, (String) avma.f93360f.mo51364a());
                        b.mo51594a(f93552n, true);
                        return new avni("ab-reboot", b.mo51593a(), null);
                    } else if (avme.m78794b(this.f93553h, d, true)) {
                        this.f93555j.mo51402a(272, -1.0d);
                        m78885a(false);
                        avtd b2 = mo51432a().mo51598b();
                        b2.mo51594a(f93551m, Long.valueOf(this.f93558q.mo51394d()));
                        b2.mo51594a(f93552n, false);
                        return new avni("ab-reboot", b2.mo51593a(), null);
                    }
                }
                StringBuilder sb = new StringBuilder("reboot-ab-update");
                if (cfsg.f185570a.mo6606a().mo82640l() && this.f93556o.getDefaultDisplay().getState() != 2) {
                    sb.append(",quiescent");
                }
                int i = this.f93555j.mo51414d().f109461c;
                this.f93555j.mo51402a(784, -1.0d);
                m78885a(true);
                if (!avlw.m78759b(this.f93553h) || !avls.m78742h(this.f93553h) || !this.f93558q.mo51397g()) {
                    avtd b3 = mo51432a().mo51598b();
                    b3.mo51594a(f93551m, Long.valueOf(this.f93558q.mo51394d()));
                    b3.mo51594a(f93549k, (String) avma.f93359e.mo51364a());
                    b3.mo51594a(f93550l, (String) avma.f93360f.mo51364a());
                    b3.mo51594a(f93552n, true);
                    return new avni("ab-reboot", b3.mo51593a(), true, new avnr(this, sb));
                }
                avtd b4 = mo51432a().mo51598b();
                b4.mo51594a(f93551m, Long.valueOf(this.f93558q.mo51394d()));
                b4.mo51594a(f93549k, (String) avma.f93359e.mo51364a());
                b4.mo51594a(f93550l, (String) avma.f93360f.mo51364a());
                b4.mo51594a(f93552n, true);
                return new avni("ab-reboot", b4.mo51593a(), true, new avnq(this, sb, i));
            }
            this.f93555j.mo51402a(0, -1.0d);
            return new avni("finished-execution", avte.m79305a(new avtc[0]));
        } else {
            int i2 = Build.VERSION.SDK_INT;
            this.f93555j.mo51402a(784, -1.0d);
            avtd b5 = mo51432a().mo51598b();
            b5.mo51594a(f93551m, Long.valueOf(this.f93558q.mo51394d()));
            b5.mo51594a(f93552n, false);
            return new avni("ab-reboot", b5.mo51593a(), true, new avns(this));
        }
    }
}
