package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: anan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anan {

    /* renamed from: b */
    private static final bnic f76495b = bnic.m109492a(6L, 13L, 14L, 15L);

    /* renamed from: c */
    private static final bngx f76496c = bngx.m109358a("family", "coworkers", "friends");

    /* renamed from: a */
    public final Set f76497a = new HashSet();

    public anan() {
        amig.m62939a();
        if (((Boolean) amfw.f74873a.mo41191a()).booleanValue()) {
            try {
                String c = cfvk.m143177c();
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(c)) {
                    for (String str : bmyx.m108640a(',').mo66918a((CharSequence) c)) {
                        long parseLong = Long.parseLong(str, 16);
                        bnic bnic = f76495b;
                        Long valueOf = Long.valueOf(parseLong);
                        if (!bnic.contains(valueOf)) {
                            arrayList.add(valueOf);
                        }
                    }
                }
                this.f76497a.addAll(arrayList);
            } catch (NumberFormatException e) {
                amdk.m62659b("FSA2_GroupSourceIdValidator", "Unable to parse group source ID black list %s", cfvk.m143177c());
            }
        }
    }

    /* renamed from: a */
    public static boolean m63841a(String str) {
        try {
            Long.parseLong(str, 16);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m63842b(String str) {
        return f76496c.contains(str);
    }

    /* renamed from: c */
    public static boolean m63843c(String str) {
        try {
            Long.parseLong(str, 16);
            return true;
        } catch (NumberFormatException e) {
            amdk.m62658a("FSA2_GroupSourceIdValidator", "Unable to parse groupSourceId, treat as invalid: %s", str);
            return false;
        }
    }
}
