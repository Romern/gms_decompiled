package p000;

import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.query.SortOrder;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.MatchAllFilter;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: vfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vfy {

    /* renamed from: a */
    public SortOrder f49209a;

    /* renamed from: b */
    public List f49210b = Collections.emptyList();

    /* renamed from: c */
    public boolean f49211c;

    /* renamed from: d */
    public Set f49212d = Collections.emptySet();

    /* renamed from: e */
    private final List f49213e = new ArrayList();

    /* renamed from: f */
    private String f49214f;

    /* renamed from: g */
    private boolean f49215g;

    public vfy() {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.drive.query.internal.LogicalFilter.<init>(com.google.android.gms.drive.query.internal.Operator, java.lang.Iterable):void
     arg types: [com.google.android.gms.drive.query.internal.Operator, java.util.List]
     candidates:
      com.google.android.gms.drive.query.internal.LogicalFilter.<init>(com.google.android.gms.drive.query.internal.Operator, java.util.List):void
      com.google.android.gms.drive.query.internal.LogicalFilter.<init>(com.google.android.gms.drive.query.internal.Operator, java.lang.Iterable):void */
    /* renamed from: a */
    public final Query mo28407a() {
        LogicalFilter logicalFilter = new LogicalFilter(Operator.f31127f, (Iterable) this.f49213e);
        String str = this.f49214f;
        SortOrder sortOrder = this.f49209a;
        List list = this.f49210b;
        boolean z = this.f49211c;
        Set set = this.f49212d;
        return new Query(logicalFilter, str, sortOrder, list, z, new ArrayList(set), this.f49215g);
    }

    /* renamed from: a */
    public final void mo28408a(Filter filter) {
        sdo.m34966a(filter, "Filter may not be null.");
        if (!(filter instanceof MatchAllFilter)) {
            this.f49213e.add(filter);
        }
    }

    public vfy(Query query) {
        this.f49213e.add(query.f31087a);
        this.f49214f = query.f31088b;
        this.f49209a = query.f31089c;
        this.f49210b = query.f31090d;
        this.f49211c = query.f31091e;
        query.mo18285a();
        this.f49212d = query.mo18285a();
        this.f49215g = query.f31093g;
    }
}
