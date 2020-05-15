package p000;

import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.List;

/* renamed from: vgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vgo implements vgn {

    /* renamed from: a */
    private Boolean f49235a = false;

    private vgo() {
    }

    /* renamed from: a */
    public static boolean m40399a(Filter filter) {
        if (filter != null) {
            return ((Boolean) filter.mo18284a(new vgo())).booleanValue();
        }
        return false;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28317a() {
        return this.f49235a;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28318a(Operator operator, List list) {
        return this.f49235a;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28319a(Operator operator, uvy uvy, Object obj) {
        return this.f49235a;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28322a(uvu uvu, Object obj) {
        return this.f49235a;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28323a(uvy uvy) {
        return this.f49235a;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28324a(uvy uvy, Object obj) {
        return this.f49235a;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo28325b() {
        return this.f49235a;
    }

    /* renamed from: a */
    public static boolean m40400a(Query query) {
        sdo.m34959a(query);
        return m40399a((Filter) query.f31087a);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28320a(Object obj) {
        Boolean bool = (Boolean) obj;
        return this.f49235a;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28321a(String str) {
        if (!str.isEmpty()) {
            this.f49235a = true;
        }
        return this.f49235a;
    }
}
