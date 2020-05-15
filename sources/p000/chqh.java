package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* renamed from: chqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chqh {

    /* renamed from: b */
    public static final chqh f188999b = new chqh(Collections.emptyMap());

    /* renamed from: a */
    public final Map f189000a;

    public chqh(Map map) {
        this.f189000a = map;
    }

    /* renamed from: a */
    public static chqf m149395a() {
        return new chqf(f188999b);
    }

    /* renamed from: b */
    public final chqf mo85535b() {
        return new chqf(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            chqh chqh = (chqh) obj;
            if (this.f189000a.size() == chqh.f189000a.size()) {
                for (Map.Entry entry : this.f189000a.entrySet()) {
                    if (!chqh.f189000a.containsKey(entry.getKey()) || !bmxi.m108538a(entry.getValue(), chqh.f189000a.get(entry.getKey()))) {
                        return false;
                    }
                    while (r2.hasNext()) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : this.f189000a.entrySet()) {
            i += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return i;
    }

    public final String toString() {
        return this.f189000a.toString();
    }

    /* renamed from: a */
    public final Object mo85534a(chqg chqg) {
        return this.f189000a.get(chqg);
    }
}
