package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: dug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dug {

    /* renamed from: a */
    public final int f14037a;

    /* renamed from: b */
    public final Object f14038b;

    private dug(Object obj, int i) {
        this.f14038b = obj;
        this.f14037a = i;
    }

    /* renamed from: a */
    public static dug m9365a(int i) {
        return new dug(Integer.valueOf(i), 3);
    }

    /* renamed from: b */
    public static dug m9368b(String str) {
        return new dug(str, 2);
    }

    public final boolean equals(Object obj) {
        dug dug;
        int i;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dug) || (dug = (dug) obj).f14037a != (i = this.f14037a)) {
            return false;
        }
        if (i == 1 || i == 2) {
            return TextUtils.equals((String) this.f14038b, (String) dug.f14038b);
        }
        return ((Integer) this.f14038b).intValue() == ((Integer) dug.f14038b).intValue();
    }

    public final int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(this.f14037a);
        objArr[1] = this.f14037a == 3 ? Integer.valueOf(((Integer) this.f14038b).intValue()) : (String) this.f14038b;
        return Arrays.hashCode(objArr);
    }

    public final String toString() {
        int i = this.f14037a;
        StringBuilder sb = new StringBuilder(12);
        sb.append(i);
        sb.append(":");
        String sb2 = sb.toString();
        int i2 = this.f14037a;
        if (i2 == 1 || i2 == 2) {
            String valueOf = String.valueOf(this.f14038b);
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + String.valueOf(valueOf).length());
            sb3.append(sb2);
            sb3.append(valueOf);
            return sb3.toString();
        }
        int intValue = ((Integer) this.f14038b).intValue();
        StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 11);
        sb4.append(sb2);
        sb4.append(intValue);
        return sb4.toString();
    }

    /* renamed from: a */
    public static dug m9366a(String str) {
        return new dug(str, 1);
    }

    /* renamed from: a */
    public static List m9367a(dvd dvd) {
        ArrayList arrayList = new ArrayList();
        String n = dvd.mo9701n();
        if (!TextUtils.isEmpty(n)) {
            arrayList.add(m9366a(n));
        }
        List j = dvd.mo9697j();
        int size = j.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(m9368b((String) j.get(i)));
        }
        List a = dvd.mo9695a();
        int size2 = a.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList.add(m9365a(((Integer) a.get(i2)).intValue()));
        }
        return arrayList;
    }
}
