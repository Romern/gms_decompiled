package p000;

import com.google.android.gms.drive.query.internal.Operator;
import java.util.List;

/* renamed from: vgh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vgh implements vgn {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28317a() {
        return "ownedByMe()";
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo28325b() {
        return "all()";
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28318a(Operator operator, List list) {
        StringBuilder sb = new StringBuilder(String.valueOf(operator.f31130i).concat("("));
        int size = list.size();
        String str = "";
        int i = 0;
        while (i < size) {
            sb.append(str);
            sb.append((String) list.get(i));
            i++;
            str = ",";
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28319a(Operator operator, uvy uvy, Object obj) {
        return String.format("cmp(%s,%s,%s)", operator.f31130i, uvy.mo28084a(), obj);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28320a(Object obj) {
        return String.format("not(%s)", (String) obj);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28321a(String str) {
        return String.format("fullTextSearch(%s)", str);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28322a(uvu uvu, Object obj) {
        return String.format("contains(%s,%s)", uvu.f48653a, obj);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28323a(uvy uvy) {
        return String.format("fieldOnly(%s)", uvy.mo28084a());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28324a(uvy uvy, Object obj) {
        return String.format("has(%s,%s)", uvy.mo28084a(), obj);
    }
}
