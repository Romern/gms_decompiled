package p000;

import android.content.SharedPreferences;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.appusage.AppUsageResult;
import java.util.ArrayList;
import java.util.List;

/* renamed from: asgy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asgy {

    /* renamed from: a */
    public static long f88955a = -1;

    /* renamed from: b */
    private static SharedPreferences f88956b;

    /* renamed from: a */
    public static SharedPreferences m74105a() {
        if (f88956b == null) {
            f88956b = rpr.m34216b().getSharedPreferences("AppUsageUtilVersionHistory", 0);
        }
        return f88956b;
    }

    /* renamed from: a */
    public static List m74106a(long j, long j2, List list) {
        asgx asgx = new asgx(j, j2, list);
        asgx.mo49153a();
        ArrayList arrayList = new ArrayList();
        for (Pair pair : asgx.f88942a.keySet()) {
            arrayList.add(new AppUsageResult((String) pair.first, ((Integer) pair.second).intValue(), ((Long) asgx.f88942a.get(pair)).longValue()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List m74107a(String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : bmyx.m108643a("|").mo66918a((CharSequence) m74105a().getString(str, ""))) {
            if (!str2.isEmpty()) {
                String[] split = str2.split(",");
                if (split != null && split.length == 2) {
                    try {
                        arrayList.add(Pair.create(Integer.valueOf(Integer.parseInt(split[0])), Long.valueOf(Long.parseLong(split[1]))));
                    } catch (NumberFormatException e) {
                        String valueOf = String.valueOf(str2);
                        Log.e("AppUsageUtil", valueOf.length() == 0 ? new String("Unparsable versionTimestamp while parsing : ") : "Unparsable versionTimestamp while parsing : ".concat(valueOf));
                    }
                } else {
                    Log.e("AppUsageUtil", "Unpaired timestamp version in SharedPreferences ");
                }
            }
        }
        return arrayList;
    }
}
