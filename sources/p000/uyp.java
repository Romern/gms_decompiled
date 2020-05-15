package p000;

import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.CustomProperty;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: uyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uyp {

    /* renamed from: a */
    private final Map f48720a = new HashMap();

    /* renamed from: a */
    public final AppVisibleCustomProperties mo28111a() {
        return new AppVisibleCustomProperties(this.f48720a.values());
    }

    /* renamed from: a */
    public final void mo28112a(CustomPropertyKey customPropertyKey, String str) {
        sdo.checkIfNull(customPropertyKey, "key");
        this.f48720a.put(customPropertyKey, new CustomProperty(customPropertyKey, str));
    }

    /* renamed from: a */
    public final void mo28113a(AppVisibleCustomProperties appVisibleCustomProperties) {
        sdo.m34959a(appVisibleCustomProperties);
        Iterator it = appVisibleCustomProperties.iterator();
        while (it.hasNext()) {
            mo28114a((CustomProperty) it.next());
        }
    }

    /* renamed from: a */
    public final void mo28114a(CustomProperty customProperty) {
        sdo.checkIfNull(customProperty, "property");
        this.f48720a.put(customProperty.f31068a, customProperty);
    }
}
