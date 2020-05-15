package p000;

import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: sfc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sfc implements sfb {

    /* renamed from: a */
    private final List f44108a;

    private sfc(List list) {
        this.f44108a = list != null ? Collections.unmodifiableList(list) : null;
    }

    /* renamed from: a */
    public static sfb m35143a(Context context, boolean z) {
        return m35144a(context, z, false);
    }

    /* renamed from: c */
    private static boolean m35145c(Context context) {
        if (soz.m35804e(context) != null) {
            return true;
        }
        try {
            return ((rkj) aucu.m76783a(avtz.m79338b(context).mo24673E(), 5, TimeUnit.SECONDS)).mo24824r();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.w("OptedInLoggerCreator", "Could not retrieve Usage & Diagnostics setting. Giving up.");
            return false;
        }
    }

    /* renamed from: b */
    public final qws mo25463b(Context context) {
        throw null;
    }

    /* renamed from: b */
    public final boolean mo25464b() {
        return this.f44108a != null;
    }

    /* renamed from: a */
    public static sfb m35144a(Context context, boolean z, boolean z2) {
        List list;
        List list2 = null;
        if (!z) {
            if (soz.m35804e(context) != null) {
                list2 = Collections.emptyList();
            }
            return new sfc(list2);
        }
        if (!z2) {
            List d = soz.m35801d(context, "com.google.android.gms");
            if (d.isEmpty()) {
                list = Collections.emptyList();
            } else {
                try {
                    auzx auzx = new auzx();
                    auzx.f92843a = (Account) d.get(0);
                    list = ((avdi) ((rkj) aucu.m76782a(auzz.m78131a(context, auzx.mo51097a()).mo24672D())).f43190a).mo51103a();
                } catch (InterruptedException | ExecutionException e) {
                    Log.w("OptedInLoggerCreator", "Failed to get opt-in status");
                    list = Collections.emptyList();
                }
            }
            if (!list.isEmpty()) {
                return new sfc(list);
            }
        }
        if (m35145c(context)) {
            return new sfc(Collections.emptyList());
        }
        return new sfc(null);
    }

    /* renamed from: a */
    public final List mo25461a(Context context) {
        return mo25462a(context, "GMS_CORE");
    }

    /* renamed from: a */
    public final List mo25462a(Context context, String str) {
        if (this.f44108a != null) {
            sdo.m34977c(str);
            ArrayList arrayList = new ArrayList();
            if (!this.f44108a.isEmpty()) {
                for (String str2 : this.f44108a) {
                    arrayList.add(new qws(context, str, str2));
                }
            } else {
                arrayList.add(new qws(context, str, null));
            }
            if (!cdjz.f181084a.mo6606a().mo77780i() || arrayList.size() <= 1) {
                return arrayList;
            }
            return Arrays.asList((qws) arrayList.get(0));
        }
        throw new IllegalStateException("Upload is not allowed.");
    }
}
