package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: begk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class begk {

    /* renamed from: a */
    public final String f111538a;

    /* renamed from: b */
    private final List f111539b;

    public begk(String str, List list) {
        ArrayList arrayList = new ArrayList();
        this.f111539b = arrayList;
        this.f111538a = str;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    /* renamed from: a */
    public final begj mo60691a() {
        begj begj = new begj(this.f111538a, null);
        List list = this.f111539b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            begj.mo60689a((begl) list.get(i));
        }
        return begj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(begm.m95022b(this.f111538a));
        if (this.f111539b.isEmpty()) {
            return sb.toString();
        }
        sb.append("(");
        sb.append(TextUtils.join(",", this.f111539b));
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo60692a(String str) {
        begl begl;
        List list = this.f111539b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                begl = null;
                break;
            }
            begl = (begl) list.get(i);
            i++;
            if (begl.f111540a.equals(str)) {
                break;
            }
        }
        if (begl != null) {
            return begl.f111541b;
        }
        return null;
    }
}
