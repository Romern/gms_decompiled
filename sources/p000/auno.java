package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: auno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auno extends aund {

    /* renamed from: c */
    private static WeakReference f92160c = new WeakReference(null);

    public auno(Context context) {
        super(context, auns.f92168b);
    }

    /* renamed from: a */
    public static synchronized auno m77398a(Context context) {
        auno auno;
        synchronized (auno.class) {
            auno = (auno) f92160c.get();
            if (auno == null) {
                auno = new auno(context.getApplicationContext());
                f92160c = new WeakReference(auno);
            }
        }
        return auno;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final List mo50699b(Map map) {
        SharedPreferences a = mo50695a();
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("all")) {
            HashSet<String> hashSet = new HashSet();
            for (String str : a.getAll().keySet()) {
                String str2 = auns.f92169c.f92120a;
                if (str.startsWith(str2.length() == 0 ? new String("test_model_") : "test_model_".concat(str2))) {
                    hashSet.add(str.substring(auns.f92169c.f92120a.length() + 12, str.length() - 7));
                }
            }
            for (String str3 : hashSet) {
                auns auns = (auns) mo50700c(str3);
                if (auns != null) {
                    arrayList.add(auns);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final SharedPreferences mo50695a() {
        return this.f92124a.getSharedPreferences("test_shared_preferences", 0);
    }

    /* renamed from: a */
    public final String mo50696a(aumy aumy, String str) {
        return "test_model_" + aumy.f92120a + '_' + str + "_suffix";
    }
}
