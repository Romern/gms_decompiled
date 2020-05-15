package p000;

import java.util.Map;

/* renamed from: cso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cso {
    /* renamed from: a */
    public static void m7469a(Map map, csv csv, ctw ctw) {
        csy a = csv.mo8236a(csx.DEDICATED_FILE_NAME);
        if (a != null) {
            String b = czm.m8019b((byte[]) a.f12004b);
            map.put(b, new cty(b, csv, ctw));
        }
    }
}
