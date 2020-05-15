package p000;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: twx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class twx {

    /* renamed from: a */
    private static final sbw f46789a = new sbw("FeatureChecker", "");

    /* renamed from: a */
    public static boolean m37577a(tww tww) {
        HashSet hashSet = new HashSet();
        for (String str : ((String) twy.f46798I.mo58455c()).split(",")) {
            String trim = str.trim();
            if (!TextUtils.isEmpty(trim)) {
                try {
                    hashSet.add(tww.m37576a(trim.toUpperCase(Locale.US)));
                } catch (IllegalArgumentException e) {
                    f46789a.mo25375b("Can't disable feature, not found: %s", trim);
                }
            }
        }
        return !hashSet.contains(tww);
    }
}
