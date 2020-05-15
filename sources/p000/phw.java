package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: phw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class phw {

    /* renamed from: d */
    private static final long f39142d = ccxv.f180201a.mo6606a().mo77017c();

    /* renamed from: e */
    private static final int f39143e = ((int) ccxv.f180201a.mo6606a().mo77018d());

    /* renamed from: f */
    private static final int f39144f = ((int) ccxv.f180201a.mo6606a().mo77019e());

    /* renamed from: a */
    public final Context f39145a;

    /* renamed from: b */
    public final long f39146b;

    /* renamed from: c */
    public int f39147c;

    /* renamed from: g */
    private final int f39148g;

    /* renamed from: h */
    private final int f39149h;

    public phw(Context context) {
        Long valueOf = Long.valueOf(f39142d);
        int i = f39143e;
        int i2 = f39144f;
        this.f39145a = context;
        this.f39146b = valueOf.longValue();
        this.f39148g = i;
        this.f39149h = i2;
    }

    /* renamed from: a */
    public final void mo23098a() {
        int i = this.f39147c;
        if (i <= 0 || i >= this.f39148g + this.f39149h) {
            synchronized (phw.class) {
                SharedPreferences b = qay.m31785b(this.f39145a);
                Map<String, ?> all = b.getAll();
                int size = all.size();
                this.f39147c = size;
                if (size >= this.f39148g + this.f39149h) {
                    TreeMap treeMap = new TreeMap();
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        if (entry.getValue() instanceof Long) {
                            treeMap.put((Long) entry.getValue(), entry.getKey());
                        }
                    }
                    SharedPreferences.Editor edit = b.edit();
                    for (Map.Entry entry2 : treeMap.entrySet()) {
                        edit.remove((String) entry2.getValue());
                        int i2 = this.f39147c;
                        if (i2 > 0) {
                            i2--;
                            this.f39147c = i2;
                        }
                        if (i2 <= this.f39148g) {
                            break;
                        }
                    }
                    edit.apply();
                }
            }
        }
    }
}
