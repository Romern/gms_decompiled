package p000;

import java.util.Comparator;
import java.util.Map;

/* renamed from: abzd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abzd implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = (Map.Entry) obj2;
        absy absy = ((abss) entry.getValue()).f58158c;
        if (absy == null) {
            absy = absy.f58176h;
        }
        int a = absx.m48236a(absy.f58180c);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        absy absy2 = ((abss) entry2.getValue()).f58158c;
        if (absy2 == null) {
            absy2 = absy.f58176h;
        }
        int a2 = absx.m48236a(absy2.f58180c);
        if (a2 != 0) {
            i = a2;
        }
        int i3 = i2 - (i - 1);
        if (i3 != 0) {
            return i3;
        }
        absr absr = ((abss) entry.getValue()).f58157b;
        if (absr == null) {
            absr = absr.f58134s;
        }
        String str = absr.f58140e;
        absr absr2 = ((abss) entry2.getValue()).f58157b;
        if (absr2 == null) {
            absr2 = absr.f58134s;
        }
        int compareTo = str.compareTo(absr2.f58140e);
        if (compareTo != 0) {
            return compareTo;
        }
        absr absr3 = ((abss) entry.getValue()).f58157b;
        if (absr3 == null) {
            absr3 = absr.f58134s;
        }
        String str2 = absr3.f58138c;
        absr absr4 = ((abss) entry2.getValue()).f58157b;
        if (absr4 == null) {
            absr4 = absr.f58134s;
        }
        int compareTo2 = str2.compareTo(absr4.f58138c);
        if (compareTo2 != 0) {
            return compareTo2;
        }
        absr absr5 = ((abss) entry.getValue()).f58157b;
        if (absr5 == null) {
            absr5 = absr.f58134s;
        }
        Long valueOf = Long.valueOf(absr5.f58149n);
        absr absr6 = ((abss) entry2.getValue()).f58157b;
        if (absr6 == null) {
            absr6 = absr.f58134s;
        }
        return valueOf.compareTo(Long.valueOf(absr6.f58149n));
    }
}
