package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: begi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class begi {

    /* renamed from: a */
    public final String f111534a;

    /* renamed from: b */
    public final List f111535b = new ArrayList();

    public begi(String str, List list) {
        behg.m95044a(!list.isEmpty(), "Missing param values", new Object[0]);
        this.f111534a = str;
        this.f111535b.addAll(list);
    }

    /* renamed from: a */
    public static begh m95013a(String str) {
        return new begh(str, null);
    }

    public final String toString() {
        return begm.m95022b(this.f111534a) + "=" + TextUtils.join("+", this.f111535b);
    }

    /* renamed from: a */
    public final begh mo60686a() {
        begh a = m95013a(this.f111534a);
        List list = this.f111535b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a.mo60685a(((begk) list.get(i)).mo60691a());
        }
        return a;
    }
}
