package p000;

import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: adlc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adlc {
    /* renamed from: a */
    public static final ApplicationInfo m50786a(String str, int i, adhd adhd, Integer num) {
        if (adhd.f61669d == null) {
            return null;
        }
        ApplicationInfo applicationInfo = new ApplicationInfo();
        adhj adhj = adhd.f61668c;
        if (adhj != null) {
            int i2 = adhj.f61713b;
            if (i2 == 0) {
                applicationInfo.targetSdkVersion = adhj.f61712a;
            } else {
                applicationInfo.targetSdkVersion = i2;
            }
        }
        applicationInfo.flags = 4;
        adhc adhc = adhd.f61669d;
        if (adhc == null) {
            adhc = adhc.f61655h;
        }
        if (!adhc.f61663g.isEmpty()) {
            adhc adhc2 = adhd.f61669d;
            if (adhc2 == null) {
                adhc2 = adhc.f61655h;
            }
            applicationInfo.name = adhc2.f61663g;
            adhc adhc3 = adhd.f61669d;
            if (adhc3 == null) {
                adhc3 = adhc.f61655h;
            }
            applicationInfo.className = adhc3.f61663g;
        }
        applicationInfo.packageName = str;
        applicationInfo.enabled = true;
        adhc adhc4 = adhd.f61669d;
        if (adhc4 == null) {
            adhc4 = adhc.f61655h;
        }
        applicationInfo.icon = adhc4.f61657a;
        adhc adhc5 = adhd.f61669d;
        if (adhc5 == null) {
            adhc5 = adhc.f61655h;
        }
        applicationInfo.labelRes = adhc5.f61658b;
        adhc adhc6 = adhd.f61669d;
        if (adhc6 == null) {
            adhc6 = adhc.f61655h;
        }
        if (!adhc6.f61659c.isEmpty()) {
            adhc adhc7 = adhd.f61669d;
            if (adhc7 == null) {
                adhc7 = adhc.f61655h;
            }
            applicationInfo.nonLocalizedLabel = adhc7.f61659c;
        }
        adhc adhc8 = adhd.f61669d;
        if (adhc8 == null) {
            adhc8 = adhc.f61655h;
        }
        applicationInfo.logo = adhc8.f61660d;
        adhc adhc9 = adhd.f61669d;
        if (adhc9 == null) {
            adhc9 = adhc.f61655h;
        }
        applicationInfo.theme = adhc9.f61661e;
        if (num != null) {
            applicationInfo.uid = num.intValue();
        }
        if ((i & 128) != 0) {
            adhc adhc10 = adhd.f61669d;
            if (adhc10 == null) {
                adhc10 = adhc.f61655h;
            }
            applicationInfo.metaData = m50787a(adhc10.f61662f);
        }
        return applicationInfo;
    }

    /* renamed from: b */
    public static final String[] m50788b(List list) {
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                adhi adhi = (adhi) list.get(i);
                int i2 = adhi.f61709b;
                if (i2 <= 0 || i2 >= Build.VERSION.SDK_INT) {
                    arrayList.add(adhi.f61708a);
                }
            }
            if (!arrayList.isEmpty()) {
                return (String[]) arrayList.toArray(new String[0]);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Bundle m50787a(List list) {
        int i;
        if (list == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            adhf adhf = (adhf) list.get(i2);
            int i3 = adhf.f61688b;
            if (i3 != 0) {
                i = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? 0 : 6 : 5 : 4 : 3;
            } else {
                i = 2;
            }
            if (i == 0) {
                i = 1;
            }
            int i4 = i - 2;
            if (i4 == 1) {
                bundle.putString(adhf.f61687a, adhf.f61689c);
            } else if (i4 == 2) {
                bundle.putInt(adhf.f61687a, adhf.f61690d);
            } else if (i4 == 3) {
                bundle.putBoolean(adhf.f61687a, adhf.f61691e);
            } else if (i4 == 4) {
                bundle.putFloat(adhf.f61687a, adhf.f61692f);
            }
        }
        return bundle;
    }
}
