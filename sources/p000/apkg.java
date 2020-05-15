package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.format.DateUtils;
import com.google.android.gms.scheduler.reachability.ReachabilityObserver$AlarmReceiver;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: apkg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apkg {

    /* renamed from: d */
    public static final /* synthetic */ int f84590d = 0;

    /* renamed from: e */
    private static final bnic f84591e = bnon.f131923a;

    /* renamed from: a */
    public final bqgj f84592a;

    /* renamed from: b */
    public final Map f84593b;

    /* renamed from: c */
    public Long f84594c = null;

    /* renamed from: f */
    private final skc f84595f;

    /* renamed from: g */
    private final aakr f84596g;

    /* renamed from: h */
    private final PendingIntent f84597h;

    /* renamed from: i */
    private final apkl f84598i;

    /* renamed from: j */
    private final qxq f84599j;

    /* renamed from: k */
    private final AtomicReference f84600k = new AtomicReference(f84591e);

    public apkg(Context context, skc skc, aakr aakr, bqgj bqgj, apkl apkl, aphr aphr) {
        this.f84595f = skc;
        this.f84596g = aakr;
        this.f84592a = bqgj;
        this.f84598i = apkl;
        this.f84599j = aphr.f84398a;
        this.f84593b = new C1223np();
        this.f84597h = PendingIntent.getBroadcast(context, 0, new Intent("com.google.android.gms.gcm.nts.reachability.WAKE_UP"), 0);
        context.registerReceiver(new ReachabilityObserver$AlarmReceiver(this), new IntentFilter("com.google.android.gms.gcm.nts.reachability.WAKE_UP"), "com.google.android.gms.permission.INTERNAL_BROADCAST", null);
    }

    /* renamed from: a */
    private final void m70515a(Uri uri, Set set) {
        C1225nr nrVar = new C1225nr((Collection) this.f84600k.get());
        if (uri != null) {
            nrVar.add(uri);
        }
        if (set != null) {
            nrVar.removeAll(set);
        }
        bnic a = bnic.m109495a((Collection) nrVar);
        if (!((bnic) this.f84600k.getAndSet(a)).equals(a)) {
            m70517b();
        }
    }

    /* renamed from: c */
    private final void m70518c(long j) {
        if (cedu.m136333b()) {
            Long l = this.f84594c;
            if (l == null || l.longValue() > j) {
                this.f84595f.mo25675a("Reachability", 2, j, this.f84597h, "com.google.android.gms");
                this.f84594c = Long.valueOf(j);
            }
        }
    }

    /* renamed from: b */
    static String m70516b(long j) {
        String str;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String formatElapsedTime = DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j));
        long j2 = j - elapsedRealtime;
        if (j2 >= 1000 || j2 == 0) {
            str = DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j2));
        } else if (j2 > 0) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("00:00.");
            sb.append(j2);
            str = sb.toString();
        } else if (j2 > -1000) {
            StringBuilder sb2 = new StringBuilder(27);
            sb2.append("-00:00.");
            sb2.append(-j2);
            str = sb2.toString();
        } else {
            String valueOf = String.valueOf(DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(-j2)));
            str = valueOf.length() == 0 ? new String("-") : "-".concat(valueOf);
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(formatElapsedTime).length() + 3 + String.valueOf(str).length());
        sb3.append(formatElapsedTime);
        sb3.append(" (");
        sb3.append(str);
        sb3.append(")");
        return sb3.toString();
    }

    /* renamed from: a */
    public final bnic mo47357a() {
        return cedu.m136333b() ? (bnic) this.f84600k.get() : f84591e;
    }

    /* renamed from: a */
    public final synchronized void mo47358a(long j) {
        if (cedu.m136333b()) {
            m70518c(j);
        }
    }

    /* renamed from: b */
    private final void m70517b() {
        if (cedu.f182415a.mo6606a().mo78906b()) {
            this.f84599j.mo24383c("REACHABILITY_CHANGED_BROADCAST").mo24359a();
        }
        this.f84596g.mo16948b(6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo47359a(Uri uri, boolean z) {
        if (cedu.m136333b() && this.f84593b.containsKey(uri)) {
            boolean contains = ((bnic) this.f84600k.get()).contains(uri);
            if (z) {
                if (contains) {
                    m70515a((Uri) null, bnic.m109489a(uri));
                }
            }
            if (!z && !contains) {
                m70515a(uri, (Set) null);
            }
        }
    }

    /* renamed from: a */
    public final void mo47360a(PrintWriter printWriter) {
        if (cedu.m136333b()) {
            printWriter.println("ReachabilityObserver:");
            synchronized (this) {
                for (apkk apkk : this.f84593b.values()) {
                    apkk.mo47365a(printWriter);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x012f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo47361a(Collection collection) {
        apkk apkk;
        String host;
        if (!cedu.m136333b()) {
            this.f84593b.clear();
            if (!((bnic) this.f84600k.getAndSet(f84591e)).isEmpty()) {
                m70517b();
            }
        } else {
            bnia j = bnic.m109500j();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                j.mo67752b((Iterable) ((apid) it.next()).f84444n.f63118k);
            }
            bnic a = j.mo67751a();
            Set keySet = this.f84593b.keySet();
            bnpd c = bnpf.m110057c(a, keySet);
            bnpd c2 = bnpf.m110057c(keySet, a);
            m70515a((Uri) null, c2);
            this.f84593b.keySet().removeAll(c2);
            bnrd a2 = ((bnoz) c).iterator();
            boolean z = false;
            while (a2.hasNext()) {
                Uri uri = (Uri) a2.next();
                apke apke = new apke(this, uri);
                apkl apkl = this.f84598i;
                bqgj bqgj = this.f84592a;
                if (uri != null && !TextUtils.isEmpty(uri.getScheme()) && !TextUtils.isEmpty(uri.getHost())) {
                    String scheme = uri.getScheme();
                    bnpd b = bnpf.m110055b(bnic.m109490a("tcp", "ping"), bnic.m109488a(bmyx.m108640a(',').mo66920b().mo66918a((CharSequence) cedu.f182415a.mo6606a().mo78910f())));
                    if (scheme != null && b.contains(scheme) && (host = uri.getHost()) != null) {
                        Iterator it2 = bmyx.m108640a(',').mo66920b().mo66918a((CharSequence) cedu.f182415a.mo6606a().mo78909e()).iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            } else if (host.endsWith((String) it2.next())) {
                                if (!scheme.equals("tcp") || uri.getPort() > 0) {
                                    apkd apkd = (apkd) apkl.f84613a.get(uri.getScheme());
                                    if (apkd != null) {
                                        apkk = new apkk(uri, apkd, apke, bqgj);
                                    } else {
                                        apkk = null;
                                    }
                                }
                            }
                        }
                    }
                }
                apkk = null;
                if (apkk != null) {
                    this.f84593b.put(uri, apkk);
                    z = true;
                }
            }
            if (z) {
                m70518c(SystemClock.elapsedRealtime());
            }
        }
    }
}
