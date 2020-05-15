package p000;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: pmb */
final /* synthetic */ class pmb implements Runnable {

    /* renamed from: a */
    private final pmh f39661a;

    /* renamed from: b */
    private final Set f39662b;

    /* renamed from: c */
    private final int f39663c;

    /* renamed from: d */
    private final Map f39664d;

    public pmb(pmh pmh, Set set, int i, Map map) {
        this.f39661a = pmh;
        this.f39662b = set;
        this.f39663c = i;
        this.f39664d = map;
    }

    public final void run() {
        String str;
        pmh pmh = this.f39661a;
        Set set = this.f39662b;
        int i = this.f39663c;
        Map map = this.f39664d;
        qav qav = pmh.f39676a;
        Object[] objArr = new Object[2];
        if (set != null) {
            str = TextUtils.join(",", set);
        } else {
            str = null;
        }
        boolean z = false;
        objArr[0] = str;
        objArr[1] = Integer.valueOf(i);
        qav.mo23673b("Filter criteria(%s) scannerFlags(%d)", objArr);
        pmh.f39684l = i;
        pmh.f39682j.clear();
        pmh.f39682j.putAll(map);
        if (set == null && pmh.f39683k != null) {
            pmh.f39683k = null;
            pmh.mo23410a();
            z = true;
        } else if (set != null && pmh.f39683k == null) {
            pmh.f39683k = new HashSet(set);
            ScheduledExecutorService scheduledExecutorService = pmh.f39679g;
            pnl pnl = pmh.f39681i;
            pnl.getClass();
            pmh.f39686n = scheduledExecutorService.scheduleWithFixedDelay(new pmd(pnl), pmh.f39672b, pmh.f39672b, TimeUnit.MILLISECONDS);
            z = true;
        } else if (set != null && !set.equals(pmh.f39683k)) {
            pmh.f39683k.clear();
            pmh.f39683k.addAll(set);
            z = true;
        }
        pmh.mo23413a(z);
        if (!ccyz.m132249b()) {
            pma pma = pmh.f39680h;
            pma.f39647a.mo23856a("onUpdateFilterCriteria %s", set);
            pma.f39649c.clear();
            pma.f39649c.putAll(map);
            if (set == null) {
                pma.f39652f = null;
                pma.mo23401d();
                pma.mo23400c();
            } else {
                pma.f39652f = new HashSet(set);
                pma.mo23401d();
                pma.mo23400c();
                pma.mo23399b();
            }
            pma.mo23403f();
        }
    }
}
