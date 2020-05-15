package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: cgg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgg {

    /* renamed from: a */
    public final C1241og f6787a;

    /* renamed from: b */
    public final List f6788b;

    /* renamed from: c */
    public final String f6789c;

    public cgg(Class cls, Class cls2, Class cls3, List list, C1241og ogVar) {
        this.f6787a = ogVar;
        crb.m7385a((Collection) list);
        this.f6788b = list;
        String simpleName = cls.getSimpleName();
        String simpleName2 = cls2.getSimpleName();
        String simpleName3 = cls3.getSimpleName();
        int length = String.valueOf(simpleName).length();
        StringBuilder sb = new StringBuilder(length + 21 + String.valueOf(simpleName2).length() + String.valueOf(simpleName3).length());
        sb.append("Failed LoadPath{");
        sb.append(simpleName);
        sb.append("->");
        sb.append(simpleName2);
        sb.append("->");
        sb.append(simpleName3);
        sb.append("}");
        this.f6789c = sb.toString();
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f6788b.toArray());
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 22);
        sb.append("LoadPath{decodePaths=");
        sb.append(arrays);
        sb.append('}');
        return sb.toString();
    }
}
