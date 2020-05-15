package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: zst */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zst {

    /* renamed from: a */
    public static final /* synthetic */ int f55832a = 0;

    /* renamed from: b */
    private static final srn f55833b = zvt.m46581a();

    /* renamed from: c */
    private static final long f55834c = TimeUnit.DAYS.toMillis(1);

    /* renamed from: d */
    private final SharedPreferences f55835d;

    public zst(Context context, String str) {
        String valueOf = String.valueOf(str);
        this.f55835d = context.getSharedPreferences(valueOf.length() == 0 ? new String("SYNC_STATS_STORE") : "SYNC_STATS_STORE".concat(valueOf), 0);
    }

    /* renamed from: a */
    private static long m46253a(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bngx.a(java.util.Comparator, java.lang.Iterable):bngx
     arg types: [bnny, bngx]
     candidates:
      bngx.a(java.lang.Object, java.lang.Object):bngx
      bngx.a(java.lang.Object[], int):int
      bngx.a(int, int):bngx
      bngm.a(java.lang.Object[], int):int
      bngx.a(java.util.Comparator, java.lang.Iterable):bngx */
    /* renamed from: a */
    public final bngx mo31467a(long j) {
        bngs j2 = bngx.m109377j();
        for (String str : this.f55835d.getAll().keySet()) {
            long a = m46253a(str);
            bpgw bpgw = null;
            String string = this.f55835d.getString(str, null);
            if (string != null) {
                try {
                    bpgw = (bpgw) bxvk.m124016a(bpgw.f137569C, Base64.decode(string, 0), bxus.m123744c());
                } catch (bxwf e) {
                    ((bnsl) f55833b.mo68388c()).mo68420a("Failed to decode SyncDetails proto with key %s", str);
                }
            }
            if (j - a <= f55834c && bpgw != null) {
                j2.mo67668c(bpgw);
            }
        }
        return bngx.m109369a((Comparator) bnnt.f131877a.mo68159a(zss.f55831a), (Iterable) j2.mo67664a());
    }

    /* renamed from: a */
    public final void mo31468a(bpgw bpgw) {
        this.f55835d.edit().putString(Long.toString(bpgw.f137574b), Base64.encodeToString(bpgw.mo73642k(), 0)).apply();
        long j = bpgw.f137574b;
        SharedPreferences.Editor edit = this.f55835d.edit();
        for (String str : this.f55835d.getAll().keySet()) {
            if (j - m46253a(str) > f55834c) {
                edit.remove(str);
            }
        }
        edit.apply();
    }
}
