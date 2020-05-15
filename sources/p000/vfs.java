package p000;

import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.CustomProperty;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: vfs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vfs implements vgn {

    /* renamed from: a */
    private final twz f49202a;

    public vfs(twz twz) {
        this.f49202a = twz;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28317a() {
        return Boolean.valueOf("owner".equals((String) this.f49202a.mo26855a(uzm.f48731G)));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo28325b() {
        return true;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28318a(Operator operator, List list) {
        int i = 0;
        if (Operator.f31127f.equals(operator)) {
            int size = list.size();
            while (i < size) {
                int i2 = i + 1;
                if (!((Boolean) list.get(i)).booleanValue()) {
                    return false;
                }
                i = i2;
            }
            return 1;
        } else if (!Operator.f31128g.equals(operator)) {
            String valueOf = String.valueOf(operator.f31130i);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unsupported logical operator: ") : "Unsupported logical operator: ".concat(valueOf));
        } else if (list.isEmpty()) {
            return 1;
        } else {
            int size2 = list.size();
            while (i < size2) {
                int i3 = i + 1;
                if (((Boolean) list.get(i)).booleanValue()) {
                    return 1;
                }
                i = i3;
            }
            return false;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28319a(Operator operator, uvy uvy, Object obj) {
        if (Operator.f31122a.equals(operator)) {
            return Boolean.valueOf(this.f49202a.mo26855a(uvy).equals(obj));
        }
        if (Operator.f31129h.equals(operator) && (obj instanceof String)) {
            return Boolean.valueOf(((String) this.f49202a.mo26855a(uvy)).contains((String) obj));
        }
        boolean z = true;
        if (obj instanceof Comparable) {
            int compareTo = ((Comparable) this.f49202a.mo26855a(uvy)).compareTo(obj);
            if (Operator.f31122a.equals(operator)) {
                if (compareTo != 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } else if (Operator.f31123b.equals(operator)) {
                if (compareTo >= 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } else if (Operator.f31124c.equals(operator)) {
                if (compareTo > 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } else if (Operator.f31125d.equals(operator)) {
                if (compareTo <= 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } else if (Operator.f31126e.equals(operator)) {
                if (compareTo < 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        throw new IllegalArgumentException(String.format("Unsupported comparison operator %s for field %s", operator.f31130i, uvy.toString()));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28320a(Object obj) {
        return Boolean.valueOf(!((Boolean) obj).booleanValue());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28321a(String str) {
        throw new IllegalArgumentException("Unsupported Filter: fullTextSearch");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28322a(uvu uvu, Object obj) {
        return Boolean.valueOf(((Collection) this.f49202a.mo26855a(uvu)).contains(obj));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28323a(uvy uvy) {
        return Boolean.valueOf(this.f49202a.mo26855a(uvy) != null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28324a(uvy uvy, Object obj) {
        if (vgc.f49223g.equals(uvy)) {
            Iterator it = ((AppVisibleCustomProperties) obj).iterator();
            CustomProperty customProperty = (CustomProperty) it.next();
            sdo.m34975b(!it.hasNext(), "value should have only 1 element");
            if (customProperty.f31069b == null) {
                return false;
            }
            AppVisibleCustomProperties appVisibleCustomProperties = (AppVisibleCustomProperties) this.f49202a.mo26855a(uvy);
            if (appVisibleCustomProperties != null) {
                return Boolean.valueOf(sdg.m34949a(appVisibleCustomProperties.mo18261a().get(customProperty.f31068a), customProperty.f31069b));
            }
            return false;
        }
        String valueOf = String.valueOf(uvy);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
        sb.append("Unsupported field for has comparison: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }
}
