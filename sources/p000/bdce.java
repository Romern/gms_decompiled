package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: bdce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdce {

    /* renamed from: a */
    public static final String f105314a = bdce.class.getSimpleName();

    /* renamed from: d */
    private static final bmyl f105315d = new bdbw();

    /* renamed from: e */
    private static final bmyl f105316e = new bdbx();

    /* renamed from: f */
    private static final bmyl f105317f = new bdby();

    /* renamed from: b */
    public final bdca f105318b;

    /* renamed from: c */
    protected final List f105319c = new ArrayList();

    /* renamed from: g */
    private final Context f105320g;

    /* renamed from: h */
    private final Executor f105321h;

    /* renamed from: i */
    private final bdcf f105322i;

    /* renamed from: j */
    private final ConnectivityManager f105323j;

    /* renamed from: k */
    private final Map f105324k = new HashMap();

    /* renamed from: l */
    private final Map f105325l = new HashMap();

    /* renamed from: m */
    private final Queue f105326m = new ConcurrentLinkedQueue();

    /* renamed from: n */
    private boolean f105327n = false;

    /* renamed from: o */
    private final BroadcastReceiver f105328o = new bdbz(this);

    public bdce(bdcf bdcf, Context context, Executor executor) {
        bdca bdca = new bdca();
        this.f105320g = context;
        this.f105322i = bdcf;
        this.f105321h = executor;
        this.f105318b = bdca;
        this.f105323j = (ConnectivityManager) context.getSystemService("connectivity");
    }

    /* renamed from: a */
    public static void m90562a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (IllegalStateException e) {
            } catch (NullPointerException e2) {
            }
        }
    }

    /* renamed from: b */
    public static String m90565b(File file, String str) {
        String absolutePath = file.getAbsolutePath();
        StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 1 + String.valueOf(str).length());
        sb.append(absolutePath);
        sb.append("/");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: c */
    public final void mo57875c(bdbv bdbv) {
        List list;
        synchronized (this) {
            boolean isEmpty = this.f105326m.isEmpty();
            this.f105326m.add(bdbv);
            if (isEmpty) {
                this.f105320g.registerReceiver(this.f105328o, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f105327n = true;
                mo57867a();
            }
            if (this.f105326m.containsAll(this.f105324k.values())) {
                list = mo57873b();
            } else {
                list = null;
            }
        }
        if (list != null) {
            m90563a(list, f105315d);
        }
    }

    /* renamed from: a */
    private static final void m90563a(List list, bmyl bmyl) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bmyl.mo12292a((bdcc) list.get(i));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final synchronized List mo57873b() {
        bngs j;
        j = bngx.m109377j();
        Iterator it = this.f105319c.iterator();
        while (it.hasNext()) {
            bdcc bdcc = (bdcc) ((WeakReference) it.next()).get();
            if (bdcc == null) {
                it.remove();
            } else {
                j.mo67668c(bdcc);
            }
        }
        return j.mo67664a();
    }

    /* renamed from: a */
    private static boolean m90564a(Context context, String str) {
        return C1133kh.m17835a(context, str) == 0;
    }

    /* renamed from: a */
    public final synchronized HttpURLConnection mo57866a(String str, String str2) {
        HttpURLConnection a;
        if (m90564a(this.f105320g, "android.permission.INTERNET")) {
            a = this.f105322i.mo57851a(str2);
            String str3 = this.f105318b.f105310b;
            this.f105325l.put(str, a);
        } else {
            throw new IllegalStateException("Missing INTERNET permission, can't start download");
        }
        return a;
    }

    /* renamed from: b */
    public final void mo57874b(bdbv bdbv) {
        m90563a(mo57873b(), f105316e);
        this.f105321h.execute(new bdcb(this, bdbv));
    }

    /* renamed from: a */
    public final synchronized void mo57867a() {
        int size = this.f105326m.size();
        StringBuilder sb = new StringBuilder(49);
        sb.append("Running ");
        sb.append(size);
        sb.append(" requests pending connectivity");
        sb.toString();
        Iterator it = this.f105326m.iterator();
        while (it.hasNext()) {
            bdbv bdbv = (bdbv) it.next();
            if (mo57872a(bdbv.mo57854a()) || bdbv.mo57856b()) {
                it.remove();
                mo57874b(bdbv);
            }
        }
        if (this.f105326m.isEmpty() && this.f105327n) {
            this.f105320g.unregisterReceiver(this.f105328o);
            this.f105327n = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo57868a(bdbv bdbv) {
        String b = m90565b(bdbv.f105295b, bdbv.f105296c);
        if (this.f105324k.containsKey(b)) {
            String str = f105314a;
            String valueOf = String.valueOf(b);
            Log.i(str, valueOf.length() == 0 ? new String("Request is already being executed for key: ") : "Request is already being executed for key: ".concat(valueOf));
            return;
        }
        this.f105324k.put(b, bdbv);
        mo57874b(bdbv);
    }

    /* renamed from: a */
    public final synchronized void mo57869a(bdcc bdcc) {
        this.f105319c.add(new WeakReference(bdcc));
    }

    /* renamed from: a */
    public final synchronized void mo57870a(File file, String str) {
        String b = m90565b(file, str);
        bdbv bdbv = (bdbv) this.f105324k.get(b);
        if (bdbv != null) {
            bdbv.mo57858d();
        } else {
            String valueOf = String.valueOf(b);
            if (valueOf.length() == 0) {
                new String("Attempted to setCanceled unknown request: ");
            } else {
                "Attempted to setCanceled unknown request: ".concat(valueOf);
            }
        }
        m90562a((HttpURLConnection) this.f105325l.get(b));
        if (bdbv != null) {
            mo57867a();
        }
    }

    /* renamed from: a */
    public final void mo57871a(File file, String str, bdbt bdbt, bdbs bdbs, File file2, long j) {
        List list;
        List list2;
        String b = m90565b(file, str);
        synchronized (this) {
            this.f105324k.remove(b);
            this.f105325l.remove(b);
            list = null;
            if (this.f105324k.isEmpty()) {
                list = mo57873b();
                list2 = null;
            } else if (this.f105326m.containsAll(this.f105324k.values())) {
                list2 = mo57873b();
            } else {
                list2 = null;
            }
        }
        if (bdbs != null) {
            bdbt.mo24152a(file2, bdbs);
        } else {
            bdbt.mo24151a(file2, j);
        }
        if (list != null) {
            m90563a(list, f105317f);
        } else if (list2 != null) {
            m90563a(list2, f105315d);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a0, code lost:
        return false;
     */
    /* renamed from: a */
    public final synchronized boolean mo57872a(bdbu bdbu) {
        if (bdbu != bdbu.NONE) {
            if (m90564a(this.f105320g, "android.permission.ACCESS_NETWORK_STATE")) {
                NetworkInfo activeNetworkInfo = this.f105323j.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    int ordinal = bdbu.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            String str = f105314a;
                            String valueOf = String.valueOf(bdbu.name());
                            Log.e(str, valueOf.length() == 0 ? new String("Unknown connectivity type checked: ") : "Unknown connectivity type checked: ".concat(valueOf));
                            return true;
                        } else if (!(activeNetworkInfo.getType() == 0 || activeNetworkInfo.getType() == 4 || activeNetworkInfo.getType() == 6 || activeNetworkInfo.getType() == 7 || activeNetworkInfo.getType() == 1 || activeNetworkInfo.getType() == 9)) {
                            int i = Build.VERSION.SDK_INT;
                            if (activeNetworkInfo.getType() != 17) {
                                return false;
                            }
                        }
                    } else if (!(!C1185me.m19630a(this.f105323j) || activeNetworkInfo.getType() == 1 || activeNetworkInfo.getType() == 9)) {
                        int i2 = Build.VERSION.SDK_INT;
                        if (activeNetworkInfo.getType() != 17) {
                            return false;
                        }
                    }
                }
            } else {
                throw new IllegalStateException("Attempting to determine connectivity without the ACCESS_NETWORK_STATE permission.");
            }
        }
    }
}
