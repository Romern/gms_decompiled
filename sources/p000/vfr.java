package p000;

import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.List;
import java.util.Locale;

/* renamed from: vfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vfr implements vgn {

    /* renamed from: a */
    private final String f49201a;

    public vfr(String str) {
        this.f49201a = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28317a() {
        return uzs.m39848a("owners", "'me'");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo28325b() {
        return uzs.f48778a;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28318a(Operator operator, List list) {
        if (Operator.f31127f.equals(operator)) {
            return uzs.m39852a(list);
        }
        if (Operator.f31128g.equals(operator)) {
            return uzs.m39850a("or", list);
        }
        String valueOf = String.valueOf(operator.f31130i);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unsupported logical operator: ") : "Unsupported logical operator: ".concat(valueOf));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28319a(Operator operator, uvy uvy, Object obj) {
        uyk a = uxx.m39710a(uvy);
        vad vad = a.f48717c;
        if (vad == null || !vad.f48804b) {
            return uzs.f48778a;
        }
        String str = vad.f48803a;
        String b = a.mo28105b(obj, this.f49201a);
        if (Operator.f31122a.equals(operator)) {
            return uzs.m39854c(str, b);
        }
        if (Operator.f31123b.equals(operator)) {
            return uzs.m39855d(str, b);
        }
        if (Operator.f31124c.equals(operator)) {
            return uzs.m39849a(str, b, "<=");
        }
        if (Operator.f31125d.equals(operator)) {
            return uzs.m39849a(str, b, ">");
        }
        if (Operator.f31126e.equals(operator)) {
            return uzs.m39849a(str, b, ">=");
        }
        if (Operator.f31129h.equals(operator)) {
            return uzs.m39853b(str, b);
        }
        String valueOf = String.valueOf(operator.f31130i);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unsupported comparison operator: ") : "Unsupported comparison operator: ".concat(valueOf));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28320a(Object obj) {
        return new uzs(String.format(Locale.US, "(not %s)", ((uzs) obj).f48779b));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28321a(String str) {
        return uzs.m39847a(str);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28322a(uvu uvu, Object obj) {
        uxw uxw = (uxw) uxx.f48706a.get(uvu);
        vad vad = uxw.f48717c;
        if (vad != null && vad.f48804b) {
            return uzs.m39848a(vad.f48803a, uxw.mo28103a(obj, this.f49201a));
        }
        return uzs.f48778a;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28323a(uvy uvy) {
        if (vgc.f49224h.equals(uvy)) {
            return uzs.m39846a();
        }
        return uzs.f48778a;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28324a(uvy uvy, Object obj) {
        uyk a = uxx.m39710a(uvy);
        vad vad = a.f48717c;
        if (vad == null || !vad.f48804b) {
            return uzs.f48778a;
        }
        String str = vad.f48803a;
        String b = a.mo28105b(obj, this.f49201a);
        return new uzs(String.format(Locale.US, "%s has { %s }", str, b));
    }

    /* renamed from: a */
    public final uzs mo28403a(Query query) {
        LogicalFilter logicalFilter = query.f31087a;
        return logicalFilter != null ? (uzs) logicalFilter.mo18284a(this) : uzs.f48778a;
    }
}
