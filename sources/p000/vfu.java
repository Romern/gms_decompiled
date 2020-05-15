package p000;

import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.internal.ComparisonFilter;
import com.google.android.gms.drive.query.internal.FilterHolder;
import com.google.android.gms.drive.query.internal.InFilter;
import com.google.android.gms.drive.query.internal.NotFilter;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.Collections;

/* renamed from: vfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vfu {
    /* renamed from: a */
    public static Filter m40350a(Filter filter) {
        sdo.m34966a(filter, "Filter may not be null");
        return new NotFilter(new FilterHolder(filter));
    }

    /* renamed from: a */
    public static Filter m40351a(uwa uwa, Object obj) {
        sdo.m34966a(uwa, "Field may not be null.");
        sdo.m34966a(obj, "Value may not be null.");
        return new InFilter(MetadataBundle.m23057a(uwa, Collections.singleton(obj)));
    }

    /* renamed from: a */
    public static Filter m40352a(uwb uwb, Object obj) {
        sdo.m34966a(uwb, "Field may not be null.");
        sdo.m34966a(obj, "Value may not be null.");
        return new ComparisonFilter(Operator.f31122a, MetadataBundle.m23057a(uwb, obj));
    }
}
