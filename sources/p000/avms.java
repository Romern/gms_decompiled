package p000;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.update.SystemUpdateStatus;
import com.google.android.gms.update.control.ReceiverIntentOperation;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Locale;
import java.util.regex.Matcher;

/* renamed from: avms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avms {

    /* renamed from: a */
    public static final avth f93421a = new avth("control.event.pending_events");

    /* renamed from: b */
    public static final avsz f93422b = new avmr();

    /* renamed from: c */
    public final avtn f93423c = ((avtn) avtn.f93892a.mo51589b());

    /* renamed from: d */
    public final Object f93424d = new Object();

    /* renamed from: e */
    public final Deque f93425e = new ArrayDeque((Collection) this.f93423c.mo51607b(f93421a));

    /* renamed from: f */
    private final Context f93426f;

    public avms(Context context) {
        this.f93426f = context;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.c(java.lang.Iterable, java.lang.Object):java.lang.Object
     arg types: [bngx, long]
     candidates:
      bnjd.c(java.lang.Iterable, int):java.lang.Iterable
      bnjd.c(java.lang.Iterable, bmxz):boolean
      bnjd.c(java.lang.Iterable, java.lang.Object):java.lang.Object */
    /* renamed from: a */
    public final void mo51399a(int i) {
        bngx bngx;
        String str;
        boolean z;
        int i2 = i;
        synchronized (this.f93424d) {
            this.f93425e.add(Integer.valueOf(i));
            this.f93423c.mo51605a(f93421a.mo51602b(bngx.m109368a((Collection) this.f93425e)));
        }
        if (i2 == 1) {
            avmq avmq = (avmq) avmq.f93413e.mo51589b();
            avmq.mo51398h();
            avmq.f93420g.mo51606a(avmq.f93411c);
            avmz avmz = (avmz) avmz.f93475a.mo51589b();
            avmz.mo51419a();
            avmz.mo51423d();
            ((avmv) avmv.f93428a.mo51589b()).mo51400a();
            avmx avmx = (avmx) avmx.f93453h.mo51589b();
            if (!avmx.mo51417g()) {
                if (!((String) avmx.f93472k.mo51607b(avmx.f93447b)).isEmpty() && ((Integer) avmx.f93472k.mo51607b(avmx.f93450e)).intValue() == 0) {
                    avmx.f93446a.mo25414c("Detected no update status with pending OTA. Reset.", new Object[0]);
                    avmx.mo51401a();
                    avmx.mo51413c(!bmxx.m108577a((String) avma.f93358d.mo51364a()));
                } else if (!((String) avmx.f93472k.mo51607b(avmx.f93447b)).isEmpty() && avmx.mo51418h() && !avmx.f93473l.mo51396f()) {
                    try {
                        ((avmq) avmq.f93413e.mo51589b()).mo51391a(ReceiverIntentOperation.m93722b(avmx.f93471j));
                    } catch (IOException e) {
                        avmx.f93446a.mo25415d("Unable to prepare resume on reboot.", e, new Object[0]);
                    }
                }
            }
            if (cfrx.m142746b()) {
                avmn avmn = (avmn) avmn.f93396b.mo51589b();
                avmn.mo51386c();
                avmn.mo51385b();
            }
        } else if (i2 == 2) {
            ((avmv) avmv.f93428a.mo51589b()).mo51400a();
            ((avmx) avmx.f93453h.mo51589b()).mo51417g();
            if (cfrx.m142746b()) {
                avmn avmn2 = (avmn) avmn.f93396b.mo51589b();
                avmn2.mo51386c();
                avmn2.f93402c.execute(new avml(avmn2));
            }
            ((avmz) avmz.f93475a.mo51589b()).mo51423d();
        } else if (i2 == 5) {
            ((avmq) avmq.f93413e.mo51589b()).f93420g.mo51605a(avmq.f93411c.mo51602b(Long.valueOf(SystemClock.elapsedRealtime())));
        } else if (i2 == 6) {
            avmx avmx2 = (avmx) avmx.f93453h.mo51589b();
            if (((Long) avmx2.f93472k.mo51607b(avmx.f93448c)).longValue() == -1) {
                avmx2.f93472k.mo51605a(avmx.f93448c.mo51602b(Long.valueOf(System.currentTimeMillis())));
            }
        } else if (i2 == 7) {
            ((avmq) avmq.f93413e.mo51589b()).f93420g.mo51606a(avmq.f93411c);
        } else if (i2 == 10) {
            ((avmx) avmx.f93453h.mo51589b()).mo51417g();
        } else if (i2 == 12) {
            avmq avmq2 = (avmq) avmq.f93413e.mo51589b();
            avmq2.f93420g.mo51605a(avmq.f93412d.mo51602b(Long.valueOf(avmq2.mo51394d())));
        } else if (i2 != 112) {
            if (i2 == 100) {
                avmx avmx3 = (avmx) avmx.f93453h.mo51589b();
                try {
                    avmx3.mo51411b(false);
                } catch (IOException e2) {
                    avmx.f93446a.mo25417e("Unable to handle install night.", e2, new Object[0]);
                }
                int d = spn.m35876d(avmx3.f93471j, "com.google.android.gms.update.OtaSuggestionActivity");
                if (cfte.f185678a.mo6606a().mo82698a()) {
                    if (!((Integer) avmx3.f93472k.mo51607b(avmx.f93450e)).equals(0) && d != 1) {
                        spn.m35856a(avmx3.f93471j, "com.google.android.gms.update.OtaSuggestionActivity", true);
                    } else if (((Integer) avmx3.f93472k.mo51607b(avmx.f93450e)).equals(0) && d == 1) {
                        spn.m35856a(avmx3.f93471j, "com.google.android.gms.update.OtaSuggestionActivity", false);
                    }
                } else if (d == 1) {
                    spn.m35856a(avmx3.f93471j, "com.google.android.gms.update.OtaSuggestionActivity", false);
                }
                ((avmz) avmz.f93475a.mo51589b()).mo51422c();
            } else if (i2 == 101) {
                avmz avmz2 = (avmz) avmz.f93475a.mo51589b();
                SystemUpdateStatus d2 = ((avmx) avmx.f93453h.mo51589b()).mo51414d();
                bxvd da = bohv.f133160d.mo74144da();
                int i3 = d2.f109462d;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bohv bohv = (bohv) da.f164949b;
                int i4 = bohv.f133162a | 2;
                bohv.f133162a = i4;
                bohv.f133163b = i3;
                int i5 = d2.f109463e;
                bohv.f133162a = i4 | 4;
                bohv.f133164c = i5;
                bohv bohv2 = (bohv) da.mo74062i();
                avpp avpp = avmz2.f93482b;
                bxvd a = avpp.mo51476a(4);
                if (a.f164950c) {
                    a.mo74035c();
                    a.f164950c = false;
                }
                bohn bohn = (bohn) a.f164949b;
                bohn bohn2 = bohn.f133102n;
                bohv2.getClass();
                bohn.f133110g = bohv2;
                bohn.f133104a |= 32;
                avpp.mo51478a((bohn) a.mo74062i());
            }
        } else if (cfrx.m142746b()) {
            ((avmn) avmn.f93396b.mo51589b()).mo51385b();
        } else {
            ((avmv) avmv.f93428a.mo51589b()).mo51400a();
            ((avmx) avmx.f93453h.mo51589b()).mo51417g();
        }
        Context context = this.f93426f;
        context.startService(IntentOperation.getStartIntent(context, "com.google.android.gms.update.execution.InstallationEventIntentOperation", "com.google.android.gms.update.INSTALLATION_EVENT"));
        avnf avnf = (avnf) avnf.f93499e.mo51589b();
        SystemUpdateStatus d3 = ((avmx) avmx.f93453h.mo51589b()).mo51414d();
        if (((Integer) avnf.f93503h.mo51607b(avnf.f93498d)).intValue() == d3.f109461c) {
            bngx = (bngx) avnf.f93503h.mo51607b(avnf.f93497c);
        } else {
            bngx e3 = bngx.m109376e();
            avnf.f93503h.mo51606a(avnf.f93498d, avnf.f93497c);
            bngx = e3;
        }
        if (avmb.m78775a(avnf.f93501f, d3.f109472n).f93369a != 0) {
            avnf.f93496b.mo25409a("OTA is managed by policy. No need to show the notification.", new Object[0]);
            avnf.mo51428a();
        } else if (!d3.f109476r.f109420a) {
            long j = Long.MAX_VALUE;
            j = Long.MAX_VALUE;
            j = Long.MAX_VALUE;
            j = Long.MAX_VALUE;
            switch (d3.f109461c) {
                case 2:
                    if (cfsm.f185644a.mo6606a().mo82679j()) {
                        j = d3.f109472n;
                        break;
                    }
                    break;
                case 263:
                case 274:
                case 775:
                case 1031:
                case 1042:
                case 1298:
                    j = d3.f109472n + cfsg.f185570a.mo6606a().mo82647s();
                    break;
                case 272:
                case 1803:
                    if (!((avmx) avmx.f93453h.mo51589b()).mo51415e()) {
                        j = d3.f109472n + cfsg.f185570a.mo6606a().mo82644p();
                        break;
                    }
                    break;
                case 275:
                case 1040:
                case 2315:
                    j = d3.f109472n + cfsg.f185570a.mo6606a().mo82649u();
                    break;
                case 518:
                    j = d3.f109472n + cfsg.f185570a.mo6606a().mo82648t();
                    break;
                case 528:
                    if (!((avmx) avmx.f93453h.mo51589b()).mo51415e()) {
                        if (!((Boolean) avma.f93362h.mo51364a()).booleanValue()) {
                            j = d3.f109472n + cfsg.f185570a.mo6606a().mo82650v();
                            break;
                        } else {
                            j = avls.m78737c() + cfsg.f185570a.mo6606a().mo82651w();
                            break;
                        }
                    }
                    break;
                case 1043:
                    j = d3.f109472n + cfsg.f185570a.mo6606a().mo82645q();
                    break;
                case 1296:
                    j = d3.f109472n + cfsm.f185644a.mo6606a().mo82676g();
                    break;
                case 1547:
                    j = d3.f109472n + cfsg.f185570a.mo6606a().mo82646r();
                    break;
                case 2059:
                    j = d3.f109472n + cfsg.f185570a.mo6606a().mo82652x();
                    break;
            }
            if (j <= System.currentTimeMillis()) {
                long currentTimeMillis = System.currentTimeMillis();
                switch (d3.f109461c) {
                    case 2:
                        str = "0";
                        break;
                    case 263:
                    case 274:
                    case 775:
                    case 1031:
                    case 1042:
                    case 1298:
                        str = cfsm.f185644a.mo6606a().mo82673d();
                        break;
                    case 272:
                    case 1803:
                        str = cfsm.f185644a.mo6606a().mo82670a();
                        break;
                    case 275:
                    case 1040:
                    case 2315:
                        str = cfsm.f185644a.mo6606a().mo82675f();
                        break;
                    case 518:
                        str = cfsm.f185644a.mo6606a().mo82674e();
                        break;
                    case 528:
                        str = cfsm.f185644a.mo6606a().mo82678i();
                        break;
                    case 1043:
                        str = cfsm.f185644a.mo6606a().mo82671b();
                        break;
                    case 1296:
                        str = cfsm.f185644a.mo6606a().mo82677h();
                        break;
                    case 1547:
                        str = cfsm.f185644a.mo6606a().mo82672c();
                        break;
                    case 2059:
                        str = cfsm.f185644a.mo6606a().mo82680k();
                        break;
                    default:
                        throw new IllegalStateException(String.format(Locale.US, "Unable to handle the status: %d.", Integer.valueOf(d3.f109461c)));
                }
                if (avmd.f93377b.matcher(str).matches()) {
                    z = true;
                } else if (avmd.f93378c.matcher(str).matches()) {
                    Matcher matcher = avmd.f93378c.matcher(str);
                    matcher.find();
                    long parseLong = Long.parseLong(matcher.group(1));
                    long longValue = ((Long) bnjd.m109591c((Iterable) bngx, (Object) 0L)).longValue() + parseLong;
                    if (longValue > currentTimeMillis) {
                        avnf.f93496b.mo25409a("The notification shouldn't be shown or cancelled right now for status 0x%03X at the current moment (%d ms) for update received at %d. Earliest re-notify time is %d. ", Integer.valueOf(d3.f109461c), Long.valueOf(currentTimeMillis), Long.valueOf(d3.f109472n), Long.valueOf(longValue));
                        avnf.mo51429a(longValue);
                        return;
                    }
                    avnf.mo51429a(parseLong + currentTimeMillis);
                    z = false;
                } else {
                    avnf.f93496b.mo25418e("Unable to handle the notification strategy: %s.", str);
                    return;
                }
                avtn avtn = avnf.f93503h;
                avtc[] avtcArr = new avtc[2];
                avtcArr[0] = avnf.f93498d.mo51602b(Integer.valueOf(d3.f109461c));
                avtl avtl = avnf.f93497c;
                bngs j2 = bngx.m109377j();
                int i6 = (((long) bngx.size()) > 10 ? 1 : (((long) bngx.size()) == 10 ? 0 : -1));
                Iterable iterable = bngx;
                if (i6 >= 0) {
                    iterable = bnjd.m109590c(bngx, 1);
                }
                j2.mo67666b(iterable);
                j2.mo67668c(Long.valueOf(currentTimeMillis));
                avtcArr[1] = avtl.mo51602b(j2.mo67664a());
                avtn.mo51605a(avtcArr);
                sex sex = avnf.f93502g;
                Context context2 = avnf.f93501f;
                int i7 = Build.VERSION.SDK_INT;
                sex.mo25440a(qkj.m32287a(context2, C0126R.C0127drawable.quantum_ic_system_update_white_24));
                sex sex2 = avnf.f93502g;
                Context context3 = avnf.f93501f;
                int i8 = Build.VERSION.SDK_INT;
                sex2.mo25440a(qkj.m32287a(context3, C0126R.C0127drawable.ic_space_error));
                Notification a2 = avnf.mo51388a(d3, z);
                avng avng = avnf.f93504i;
                int i9 = Build.VERSION.SDK_INT;
                String channelId = a2.getChannelId();
                if (channelId != null && avng.f93505a.mo25437a(channelId) == null) {
                    String string = avng.f93506b.getString(C0126R.string.system_update_module_name);
                    avls.m78744j(avng.f93506b);
                    avng.f93505a.mo25442a(new NotificationChannel(channelId, string, 2));
                }
                avng.f93505a.mo25445a("com.google.android.gms.update.control.NotificationControl", 1, a2);
                return;
            }
            avnf.f93496b.mo25409a("The notification shouldn't be shown for status 0x%03X at the current moment (%d ms) for update received at %d ms. Earliest show notify time is %d ms.", Integer.valueOf(d3.f109461c), Long.valueOf(System.currentTimeMillis()), Long.valueOf(d3.f109472n), Long.valueOf(j));
            avnf.mo51428a();
            avnf.mo51429a(j);
        } else {
            avnf.f93496b.mo25409a("The activity is running. No need to show the notification.", new Object[0]);
            avnf.mo51428a();
        }
    }
}
