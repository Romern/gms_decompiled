package p000;

import android.hardware.location.ContextHubManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: bgcz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgcz implements bugm {

    /* renamed from: e */
    private static bgcz f116083e;

    /* renamed from: f */
    private static Boolean f116084f = null;

    /* renamed from: a */
    public final bnmu f116085a = bnge.m109299s();

    /* renamed from: b */
    public final Map f116086b = new HashMap();

    /* renamed from: c */
    public final ExecutorService f116087c;

    /* renamed from: d */
    public boolean f116088d;

    public bgcz(ExecutorService executorService) {
        this.f116087c = executorService;
    }

    /* renamed from: a */
    public static synchronized bgcz m98588a() {
        bgcz bgcz;
        synchronized (bgcz.class) {
            if (f116083e == null) {
                f116083e = new bgcz(snp.m35704b(9));
            }
            bgcz = f116083e;
        }
        return bgcz;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r1.getContextHubHandles().length != 0) goto L_0x0058;
     */
    /* renamed from: b */
    public static synchronized boolean m98589b() {
        boolean booleanValue;
        synchronized (bgcz.class) {
            if (f116084f == null) {
                int i = Build.VERSION.SDK_INT;
                boolean z = true;
                if (soz.m35811h(rpr.m34216b()) && (r1 = (ContextHubManager) rpr.m34216b().getSystemService("contexthub")) != null) {
                    try {
                    } catch (Exception e) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
                        sb.append("getHandles: ");
                        sb.append(valueOf);
                        bgbq.m98540a(rpr.m34216b()).mo62623a(sb.toString());
                    }
                }
                z = false;
                f116084f = Boolean.valueOf(z);
            }
            booleanValue = f116084f.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: c */
    public static boolean m98590c() {
        return cezb.f183522a.mo6606a().nanoAppUploadEnabled() && m98589b();
    }

    /* renamed from: a */
    public final List mo62657a(Long l) {
        ArrayList arrayList;
        Set a = ((bndq) this.f116085a).mo67127c(l);
        if (a != null) {
            arrayList = bnkn.m109663a(a);
        } else {
            arrayList = bnkn.m109661a();
        }
        Locale locale = Locale.US;
        Object[] objArr = {"Manager:", l, Integer.valueOf(arrayList.size())};
        return arrayList;
    }

    /* renamed from: a */
    public final void mo62658a(long j) {
        Long valueOf = Long.valueOf(j);
        Object[] objArr = {"Manager:", valueOf};
        List a = mo62657a(valueOf);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            bgcy bgcy = (bgcy) a.get(i);
            bgcy.f116082c.post(new bgcv(bgcy));
        }
    }

    /* renamed from: a */
    public final void mo62659a(long j, int i) {
        try {
            this.f116087c.submit(new bgcs(this, j, i)).get(11, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Object[] objArr = {"Manager:", e};
        }
        Object[] objArr2 = {"Manager:", Long.valueOf(j)};
    }

    /* renamed from: b */
    public final void mo62661b(long j, int i) {
        Long valueOf = Long.valueOf(j);
        Object[] objArr = {"Manager:", valueOf};
        List a = mo62657a(valueOf);
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            bgcy bgcy = (bgcy) a.get(i2);
            bgcy.f116082c.post(new bgcw(bgcy, i));
        }
    }

    /* renamed from: a */
    public final void mo62660a(Set set) {
        new Object[1][0] = "Manager:";
        for (Long l : this.f116085a.mo67316o()) {
            if (set.contains(l)) {
                mo62658a(l.longValue());
            } else {
                mo62661b(l.longValue(), 2);
            }
        }
    }
}
