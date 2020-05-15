package p000;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: uvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class uvt implements uvy {

    /* renamed from: a */
    public final String f48653a;

    /* renamed from: b */
    public final Set f48654b;

    /* renamed from: c */
    private final Set f48655c;

    /* renamed from: d */
    private final int f48656d;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    protected uvt(String str, int i) {
        sdo.m34966a((Object) str, (Object) "fieldName");
        this.f48653a = str;
        this.f48654b = Collections.singleton(str);
        this.f48655c = Collections.emptySet();
        this.f48656d = i;
    }

    /* renamed from: a */
    public final Object mo28081a(Bundle bundle) {
        sdo.m34966a(bundle, "bundle");
        if (bundle.get(this.f48653a) != null) {
            return mo28089b(bundle);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo28083a(Object obj, Object obj2) {
        return obj;
    }

    /* renamed from: a */
    public final String mo28084a() {
        return this.f48653a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo28085a(Bundle bundle, Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo28089b(Bundle bundle);

    /* renamed from: b */
    public final Collection mo28090b() {
        return this.f48654b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Object mo28092c(DataHolder dataHolder, int i, int i2);

    /* renamed from: c */
    public final Collection mo28093c() {
        return this.f48655c;
    }

    /* renamed from: d */
    public final int mo28094d() {
        return this.f48656d;
    }

    public final String toString() {
        return this.f48653a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    protected uvt(String str, Collection collection, Collection collection2, int i) {
        sdo.m34966a((Object) str, (Object) "fieldName");
        this.f48653a = str;
        this.f48654b = Collections.unmodifiableSet(new HashSet(collection));
        this.f48655c = Collections.unmodifiableSet(new HashSet(collection2));
        this.f48656d = i;
    }

    /* renamed from: a */
    public final Object mo28082a(DataHolder dataHolder, int i, int i2) {
        if (mo28091b(dataHolder, i, i2)) {
            return mo28092c(dataHolder, i, i2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c  */
    /* renamed from: b */
    public boolean mo28091b(DataHolder dataHolder, int i, int i2) {
        for (String str : this.f48654b) {
            if (dataHolder.mo17768b() || !dataHolder.mo17766a(str) || dataHolder.mo17773f(str, i, i2)) {
                return false;
            }
            while (r0.hasNext()) {
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo28086a(DataHolder dataHolder, MetadataBundle metadataBundle, int i, int i2) {
        sdo.m34966a(dataHolder, "dataHolder");
        sdo.m34966a(metadataBundle, "bundle");
        if (mo28091b(dataHolder, i, i2)) {
            metadataBundle.mo18273b(this, mo28092c(dataHolder, i, i2));
        }
    }

    /* renamed from: a */
    public final void mo28087a(MetadataBundle metadataBundle, MetadataBundle metadataBundle2) {
        sdo.m34966a(metadataBundle, "bottom");
        sdo.m34966a(metadataBundle2, "top");
        if (metadataBundle2.mo18275c(this)) {
            Object a = metadataBundle2.mo18269a(this);
            Object a2 = metadataBundle.mo18269a(this);
            if (a2 == null) {
                metadataBundle.mo18273b(this, a);
            } else {
                metadataBundle.mo18273b(this, mo28083a(a, a2));
            }
        }
    }

    /* renamed from: a */
    public final void mo28088a(Object obj, Bundle bundle) {
        sdo.m34966a(bundle, "bundle");
        if (obj == null) {
            bundle.putString(this.f48653a, null);
        } else {
            mo28085a(bundle, obj);
        }
    }
}
