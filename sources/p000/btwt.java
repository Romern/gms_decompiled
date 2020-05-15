package p000;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: btwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btwt {
    static {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 9; i++) {
            arrayList.add(Integer.valueOf(i));
        }
        Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public static String m118962a(int i) {
        if (i == 16) {
            return "in_road_vehicle";
        }
        if (i == 17) {
            return "in_rail_vehicle";
        }
        switch (i) {
            case 0:
                return "in_vehicle";
            case 1:
                return "on_bicycle";
            case 2:
                return "on_foot";
            case 3:
                return "still";
            case 4:
                return "unknown";
            case 5:
                return "tilting";
            case 6:
                return "exiting_vehicle";
            case 7:
                return "walking";
            case 8:
                return "running";
            default:
                StringBuilder sb = new StringBuilder(34);
                sb.append("Unknown activity type: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
