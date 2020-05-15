package p000;

import android.content.Context;
import android.os.Bundle;
import com.felicanetworks.mfc.mfi.MfiClientException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: zuq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zuq {

    /* renamed from: a */
    private static final srn f55951a = zvt.m46581a();

    /* renamed from: b */
    private static final Set f55952b = new HashSet();

    /* renamed from: a */
    public static bngx m46511a(List list, zra zra, bmxz bmxz) {
        bngs j = bngx.m109377j();
        bngs b = bngx.m109371b(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cabc cabc = (cabc) it.next();
            int a = cabf.m126442a(cabc.f172414b);
            if (a != 0 && a == 4) {
                b.mo67668c(cabc);
            } else if (bmxz.mo6527a(cabc)) {
                j.mo67668c(Long.valueOf(cabc.f172418f));
            } else {
                b.mo67668c(cabc);
            }
        }
        bngx a2 = j.mo67664a();
        try {
            if (!a2.isEmpty()) {
                zra.mo31344a(a2);
            }
        } catch (IOException e) {
            bnsl bnsl = (bnsl) f55951a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("zuq", "a", (int) MfiClientException.TYPE_ILLEGAL_CARD_OPERATION, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to delete blacklisted changes");
        }
        return b.mo67664a();
    }

    /* renamed from: b */
    public static String m46518b(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("FitGcmTask_PeriodicSync_") : "FitGcmTask_PeriodicSync_".concat(valueOf);
    }

    /* renamed from: c */
    public static boolean m46520c(String str) {
        boolean contains;
        synchronized (f55952b) {
            contains = f55952b.contains(str);
        }
        return contains;
    }

    /* renamed from: b */
    public static void m46519b(Context context, String str) {
        aeat.m51532a(context).mo33986a(m46518b(str), "com.google.android.gms.fitness.sync.SyncGcmTaskService");
        synchronized (f55952b) {
            f55952b.remove(str);
        }
    }

    /* renamed from: d */
    public static long m46521d(String str) {
        try {
            if (!bmxx.m108577a(str)) {
                return Long.parseLong(str);
            }
            return 0;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    /* renamed from: a */
    public static String m46512a(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("FitGcmTask_AfterAppCallback_") : "FitGcmTask_AfterAppCallback_".concat(valueOf);
    }

    /* renamed from: a */
    public static void m46513a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("account", str);
        bundle.putInt("sync_source", cadu.PERIODIC.f172744k);
        aeat a = aeat.m51532a(context);
        aebl aebl = new aebl();
        aebl.f63097i = "com.google.android.gms.fitness.sync.SyncGcmTaskService";
        aebl.f63099k = m46518b(str);
        aebl.mo34023a(0);
        aebl.mo34027b(1);
        aebl.f63107s = bundle;
        aebl.f63070a = (long) yvq.m44908a(context);
        a.mo33984a(aebl.mo33974b());
        synchronized (f55952b) {
            f55952b.add(str);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aebi.a(long, long):void
     arg types: [int, int]
     candidates:
      aebz.a(int, int):void
      aebi.a(long, long):void */
    /* renamed from: a */
    public static void m46514a(Context context, String str, cadu cadu) {
        Bundle bundle = new Bundle();
        bundle.putString("account", str);
        bundle.putInt("sync_source", cadu.f172744k);
        aeat a = aeat.m51532a(context);
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.fitness.sync.SyncGcmTaskService";
        String valueOf = String.valueOf(str);
        aebi.f63099k = valueOf.length() == 0 ? new String("FitGcmTask_OneOffSync_") : "FitGcmTask_OneOffSync_".concat(valueOf);
        aebi.mo34027b(1);
        aebi.mo34023a(0);
        aebi.f63107s = bundle;
        aebi.mo34004a(0L, 5L);
        a.mo33984a(aebi.mo33974b());
    }

    /* renamed from: a */
    private static void m46515a(List list, zra zra) {
        try {
            if (!list.isEmpty()) {
                zra.mo31344a(list);
            }
        } catch (IOException e) {
            bnsl bnsl = (bnsl) f55951a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("zuq", "a", (int) MfiClientException.TYPE_ILLEGAL_CARD_OPERATION, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to delete blacklisted changes");
        }
    }

    /* renamed from: a */
    public static boolean m46516a(caae caae, caaq caaq) {
        if (yhj.m44108a(caae)) {
            return false;
        }
        if ((caae.f172325a & 32) == 0) {
            return true;
        }
        caaq caaq2 = caae.f172331g;
        if (caaq2 == null) {
            caaq2 = caaq.f172356h;
        }
        if (!caaq2.f172359b.equals(caaq.f172359b)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m46517a(cabc cabc) {
        int a = cabf.m126442a(cabc.f172414b);
        return a != 0 && a == 4 && cabc.f172416d.isEmpty();
    }
}
