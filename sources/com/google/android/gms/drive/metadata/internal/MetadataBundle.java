package com.google.android.gms.drive.metadata.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class MetadataBundle extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new uyx();

    /* renamed from: b */
    private static final sbw f31070b = new sbw("MetadataBundle", "");

    /* renamed from: a */
    public final Bundle f31071a;

    public MetadataBundle(Bundle bundle) {
        int i;
        sdo.m34959a(bundle);
        this.f31071a = bundle;
        bundle.setClassLoader(getClass().getClassLoader());
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f31071a.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (uyu.m39796a(next) == null) {
                arrayList.add(next);
                f31070b.mo25375b("Ignored unknown metadata field in bundle: %s", next);
            }
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            this.f31071a.remove((String) arrayList.get(i));
        }
    }

    /* renamed from: a */
    public static MetadataBundle m23056a() {
        return new MetadataBundle(new Bundle());
    }

    /* renamed from: b */
    public final MetadataBundle mo18271b() {
        return new MetadataBundle(new Bundle(this.f31071a));
    }

    /* renamed from: c */
    public final Set mo18274c() {
        HashSet hashSet = new HashSet();
        for (String str : this.f31071a.keySet()) {
            hashSet.add(uyu.m39796a(str));
        }
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            MetadataBundle metadataBundle = (MetadataBundle) obj;
            Set<String> keySet = this.f31071a.keySet();
            if (keySet.equals(metadataBundle.f31071a.keySet())) {
                for (String str : keySet) {
                    if (!sdg.m34949a(this.f31071a.get(str), metadataBundle.f31071a.get(str))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (String str : this.f31071a.keySet()) {
            i = (i * 31) + this.f31071a.get(str).hashCode();
        }
        return i;
    }

    /* renamed from: a */
    public static MetadataBundle m23057a(uvy uvy, Object obj) {
        MetadataBundle a = m23056a();
        a.mo18273b(uvy, obj);
        return a;
    }

    /* renamed from: b */
    public final Object mo18272b(uvy uvy) {
        Object a = mo18269a(uvy);
        this.f31071a.remove(((uvt) uvy).f48653a);
        return a;
    }

    /* renamed from: c */
    public final boolean mo18275c(uvy uvy) {
        return this.f31071a.containsKey(uvy.mo28084a());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
     arg types: [android.os.Parcel, int, android.os.Bundle, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35037a(parcel, 2, this.f31071a, false);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final Object mo18269a(uvy uvy) {
        return uvy.mo28081a(this.f31071a);
    }

    /* renamed from: b */
    public final void mo18273b(uvy uvy, Object obj) {
        if (uyu.m39796a(uvy.mo28084a()) == null) {
            String valueOf = String.valueOf(uvy.mo28084a());
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unregistered field: ") : "Unregistered field: ".concat(valueOf));
        } else {
            uvy.mo28088a(obj, this.f31071a);
        }
    }

    /* renamed from: a */
    public final void mo18270a(Context context) {
        BitmapTeleporter bitmapTeleporter = (BitmapTeleporter) mo18269a(uzm.f48725A);
        if (bitmapTeleporter != null) {
            bitmapTeleporter.mo17760a(context.getCacheDir());
        }
    }
}
