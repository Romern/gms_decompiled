package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: agqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agqu {

    /* renamed from: a */
    public static final Set f66286a = new HashSet();

    /* renamed from: d */
    public static final srn f66287d = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: b */
    public final Map f66288b;

    /* renamed from: c */
    public final Context f66289c;

    /* renamed from: e */
    public final agqt f66290e = agqt.f66285a;

    /* renamed from: f */
    private final SharedPreferences f66291f;

    static {
        int[] a = agnt.m54673a();
        int length = a.length;
        int i = 0;
        while (i < length) {
            int i2 = a[i];
            String a2 = agnt.m54672a(i2);
            Set set = f66286a;
            if (i2 != 0) {
                set.add(a2);
                i++;
            } else {
                throw null;
            }
        }
    }

    public agqu() {
        rpr b = rpr.m34216b();
        this.f66289c = b;
        this.f66291f = b.getSharedPreferences("com.googles.android.gms.mobiledataplan", 0);
        this.f66288b = new HashMap();
        mo35955a();
    }

    /* renamed from: a */
    public final void mo35955a() {
        for (String str : f66286a) {
            this.f66288b.put(str, this.f66291f.getStringSet(str, new HashSet()));
        }
    }

    /* renamed from: b */
    public final Status mo35956b() {
        SharedPreferences.Editor edit = this.f66291f.edit();
        for (String str : f66286a) {
            edit.putStringSet(str, (Set) this.f66288b.get(str));
        }
        if (edit.commit()) {
            return Status.f30107a;
        }
        ((bnsl) f66287d.mo68388c()).mo68405a("Commit MobileDataPlan event listener packages failed");
        return new Status(27016, "Save MobileDataPlan event listener failed");
    }
}
