package p000;

import com.felicanetworks.mfc.C0126R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: vob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vob {

    /* renamed from: a */
    public static final voa f49613a = new vof("title");

    /* renamed from: b */
    public static final voa f49614b = new vnv("modifiedDate", C0126R.string.drive_menu_sort_last_modified, true, vgg.f49231b, vod.f49630a);

    /* renamed from: c */
    static final voa f49615c = new vnv("modifiedByMeDate", C0126R.string.drive_menu_sort_last_modified_by_me, true, vgg.f49232c, vod.f49631b);

    /* renamed from: d */
    static final voa f49616d = new vnv("openedByMeDate", C0126R.string.drive_menu_sort_last_opened_by_me, true, vgg.f49233d, vod.f49632c);

    /* renamed from: e */
    static final voa f49617e;

    /* renamed from: f */
    private static final voa[] f49618f;

    /* renamed from: g */
    private static final Map f49619g;

    static {
        vnv vnv = new vnv("sharedDate", C0126R.string.drive_menu_sort_share_date, false, vgg.f49234e, vod.f49633d);
        f49617e = vnv;
        f49618f = new voa[]{f49613a, f49614b, f49615c, f49616d, vnv};
        HashMap hashMap = new HashMap();
        voa[] voaArr = f49618f;
        int length = voaArr.length;
        for (int i = 0; i < 5; i++) {
            voa voa = voaArr[i];
            if (((voa) hashMap.put(voa.mo28672a(), voa)) != null) {
                String valueOf = String.valueOf(voa.mo28672a());
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Duplicate SortOption identifier: ") : "Duplicate SortOption identifier: ".concat(valueOf));
            }
        }
        f49619g = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public static voa m40913a(String str) {
        sdo.m34959a((Object) str);
        return (voa) f49619g.get(str);
    }
}
