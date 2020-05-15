package p000;

import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.CustomProperty;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: vdj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vdj implements vgn {

    /* renamed from: a */
    final /* synthetic */ vdk f49075a;

    public vdj(vdk vdk) {
        this.f49075a = vdk;
    }

    /* renamed from: b */
    private final bkzt m40130b(uvy uvy, Object obj) {
        if (uvy == vgc.f49217a) {
            return bkzt.FIELD_TITLE;
        }
        if (uvy == vgc.f49218b) {
            return bkzt.FIELD_MIME_TYPE;
        }
        if (uvy == vgc.f49219c) {
            return bkzt.FIELD_TRASHED;
        }
        if (uvy == vgc.f49220d) {
            return bkzt.FIELD_PARENTS;
        }
        if (uvy == vgc.f49224h) {
            return bkzt.FIELD_SHARED_WITH_ME_DATE;
        }
        if (uvy == vgc.f49221e) {
            return bkzt.FIELD_STARRED;
        }
        if (uvy == vgc.f49225i) {
            return bkzt.FIELD_MODIFIED_DATE;
        }
        if (uvy == vgc.f49226j) {
            return bkzt.FIELD_LAST_VIEWED_BY_ME;
        }
        if (uvy == vgc.f49222f) {
            return bkzt.FIELD_IS_PINNED;
        }
        if (uvy != vgc.f49223g) {
            vdk.f49076a.mo25374b("ImpressionLogEvent", "Unknown field name: %s", uvy.mo28084a());
            return bkzt.UNKNOWN_METADATA_FIELD;
        } else if (obj == null) {
            vdk.f49076a.mo25374b("ImpressionLogEvent", "FieldOnly() with CUSTOM_FILE_PROPERTIES in %s", this.f49075a.f49078c);
            return bkzt.UNKNOWN_METADATA_FIELD;
        } else if (((CustomProperty) ((AppVisibleCustomProperties) obj).iterator().next()).f31068a.f31065b == 0) {
            return bkzt.FIELD_CUSTOM_PROPERTY_PUBLIC;
        } else {
            return bkzt.FIELD_CUSTOM_PROPERTY_PRIVATE;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28317a() {
        return Collections.singleton(bkzt.FIELD_OWNED_BY_ME);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28318a(Operator operator, List list) {
        C1225nr nrVar = new C1225nr();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            nrVar.addAll((Set) list.get(i));
        }
        return nrVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28319a(Operator operator, uvy uvy, Object obj) {
        return Collections.singleton(m40130b(uvy, null));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28320a(Object obj) {
        return (Set) obj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28321a(String str) {
        return Collections.singleton(bkzt.FIELD_FULL_TEXT);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28322a(uvu uvu, Object obj) {
        return Collections.singleton(m40130b(uvu, null));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28323a(uvy uvy) {
        return Collections.singleton(m40130b(uvy, null));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28324a(uvy uvy, Object obj) {
        return Collections.singleton(m40130b(uvy, obj));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo28325b() {
        return Collections.EMPTY_SET;
    }
}
