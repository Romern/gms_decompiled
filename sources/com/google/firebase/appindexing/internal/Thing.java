package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Thing extends AbstractSafeParcelable implements ReflectedParcelable, brhy {
    public static final Parcelable.Creator CREATOR = new brjf();

    /* renamed from: a */
    public final int f152369a;

    /* renamed from: b */
    public final Bundle f152370b;

    /* renamed from: c */
    public final Metadata f152371c;

    /* renamed from: d */
    public final String f152372d;

    /* renamed from: e */
    public final String f152373e;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Metadata extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new briz();

        /* renamed from: a */
        public final boolean f152374a;

        /* renamed from: b */
        public final int f152375b;

        /* renamed from: c */
        public final String f152376c;

        /* renamed from: d */
        public final Bundle f152377d;

        /* renamed from: e */
        public final Bundle f152378e;

        public Metadata(boolean z, int i, String str, Bundle bundle, Bundle bundle2) {
            this.f152374a = z;
            this.f152375b = i;
            this.f152376c = str;
            this.f152377d = bundle == null ? new Bundle() : bundle;
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            this.f152378e = bundle2;
            bundle2.setClassLoader(getClass().getClassLoader());
        }

        /* renamed from: a */
        public final boolean mo72358a() {
            Metadata a = new brhx().mo69540a();
            if (!sdg.m34949a(Boolean.valueOf(this.f152374a), Boolean.valueOf(a.f152374a)) || !sdg.m34949a(Integer.valueOf(this.f152375b), Integer.valueOf(a.f152375b)) || !sdg.m34949a(this.f152376c, a.f152376c)) {
                return false;
            }
            Bundle bundle = this.f152377d;
            return (bundle == null || bundle.isEmpty()) && this.f152378e.isEmpty();
        }

        /* renamed from: b */
        public final long[] mo72360b(String str) {
            Bundle bundle = this.f152377d;
            if (bundle == null || !(bundle.get(str) instanceof long[])) {
                return null;
            }
            return this.f152377d.getLongArray(str);
        }

        /* renamed from: c */
        public final boolean[] mo72361c(String str) {
            Bundle bundle = this.f152377d;
            if (bundle == null || !(bundle.get(str) instanceof boolean[])) {
                return null;
            }
            return this.f152377d.getBooleanArray(str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Metadata) {
                Metadata metadata = (Metadata) obj;
                return sdg.m34949a(Boolean.valueOf(this.f152374a), Boolean.valueOf(metadata.f152374a)) && sdg.m34949a(Integer.valueOf(this.f152375b), Integer.valueOf(metadata.f152375b)) && sdg.m34949a(this.f152376c, metadata.f152376c) && Thing.m118872a(this.f152377d, metadata.f152377d) && Thing.m118872a(this.f152378e, metadata.f152378e);
            }
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f152374a), Integer.valueOf(this.f152375b), this.f152376c, Integer.valueOf(Thing.m118870a(this.f152377d)), Integer.valueOf(Thing.m118870a(this.f152378e))});
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("worksOffline: ");
            sb.append(this.f152374a);
            sb.append(", score: ");
            sb.append(this.f152375b);
            if (!this.f152376c.isEmpty()) {
                sb.append(", accountEmail: ");
                sb.append(this.f152376c);
            }
            Bundle bundle = this.f152377d;
            if (bundle != null && !bundle.isEmpty()) {
                sb.append(", Properties { ");
                Thing.m118871a(this.f152377d, sb);
                sb.append("}");
            }
            if (!this.f152378e.isEmpty()) {
                sb.append(", embeddingProperties { ");
                Thing.m118871a(this.f152378e, sb);
                sb.append("}");
            }
            return sb.toString();
        }

        /* renamed from: a */
        public final String[] mo72359a(String str) {
            Bundle bundle = this.f152377d;
            if (bundle == null || !(bundle.get(str) instanceof String[])) {
                return null;
            }
            return this.f152377d.getStringArray(str);
        }

        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
         arg types: [android.os.Parcel, int, java.lang.String, int]
         candidates:
          see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
          see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
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
          see.a(android.os.Parcel, int, java.lang.String, boolean):void */
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
            see.m35051a(parcel, 1, this.f152374a);
            see.m35063b(parcel, 2, this.f152375b);
            see.m35046a(parcel, 3, this.f152376c, false);
            see.m35037a(parcel, 4, this.f152377d, false);
            see.m35037a(parcel, 5, this.f152378e, false);
            see.m35062b(parcel, a);
        }
    }

    public Thing(int i, Bundle bundle, Metadata metadata, String str, String str2) {
        this.f152369a = i;
        this.f152370b = bundle;
        this.f152371c = metadata;
        this.f152372d = str;
        this.f152373e = str2;
        bundle.setClassLoader(getClass().getClassLoader());
    }

    /* renamed from: a */
    public static int m118870a(Bundle bundle) {
        ArrayList arrayList = new ArrayList(bundle.keySet());
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = bundle.get((String) arrayList.get(i));
            if (obj instanceof boolean[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((boolean[]) obj)));
            } else if (obj instanceof long[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((long[]) obj)));
            } else if (obj instanceof double[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((double[]) obj)));
            } else if (obj instanceof byte[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((byte[]) obj)));
            } else if (obj instanceof Object[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((Object[]) obj)));
            } else {
                arrayList2.add(Integer.valueOf(Arrays.hashCode(new Object[]{obj})));
            }
        }
        return Arrays.hashCode(arrayList2.toArray());
    }

    /* renamed from: b */
    public final String mo72350b() {
        return !this.f152373e.equals("Thing") ? this.f152373e : "Indexable";
    }

    /* renamed from: c */
    public final long[] mo72352c(String str) {
        if (this.f152370b.get(str) instanceof long[]) {
            return this.f152370b.getLongArray(str);
        }
        return null;
    }

    /* renamed from: d */
    public final double[] mo72353d(String str) {
        if (this.f152370b.get(str) instanceof double[]) {
            return this.f152370b.getDoubleArray(str);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Thing) {
            Thing thing = (Thing) obj;
            return sdg.m34949a(Integer.valueOf(this.f152369a), Integer.valueOf(thing.f152369a)) && sdg.m34949a(this.f152372d, thing.f152372d) && sdg.m34949a(this.f152373e, thing.f152373e) && sdg.m34949a(this.f152371c, thing.f152371c) && m118872a(this.f152370b, thing.f152370b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f152369a), this.f152372d, this.f152373e, Integer.valueOf(this.f152371c.hashCode()), Integer.valueOf(m118870a(this.f152370b))});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo72350b());
        sb.append(" { { id: ");
        if (this.f152372d == null) {
            sb.append("<null>");
        } else {
            sb.append("'");
            sb.append(this.f152372d);
            sb.append("'");
        }
        sb.append(" } Properties { ");
        m118871a(this.f152370b, sb);
        sb.append("} Metadata { ");
        sb.append(this.f152371c.toString());
        sb.append(" } }");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        brjf.m114100a(this, parcel, i);
    }

    /* renamed from: b */
    public final String[] mo72351b(String str) {
        if (this.f152370b.get(str) instanceof String[]) {
            return this.f152370b.getStringArray(str);
        }
        return null;
    }

    public Thing(Bundle bundle, Metadata metadata, String str, String str2) {
        this.f152369a = 10;
        this.f152370b = bundle;
        this.f152371c = metadata;
        this.f152372d = str;
        this.f152373e = str2;
    }

    /* renamed from: a */
    public static void m118871a(Bundle bundle, StringBuilder sb) {
        try {
            Set<String> keySet = bundle.keySet();
            String[] strArr = (String[]) keySet.toArray(new String[keySet.size()]);
            Arrays.sort(strArr, brje.f142894a);
            for (String str : strArr) {
                sb.append("{ key: '");
                sb.append(str);
                sb.append("' value: ");
                Object obj = bundle.get(str);
                if (obj == null) {
                    sb.append("<null>");
                } else if (!obj.getClass().isArray()) {
                    sb.append(obj.toString());
                } else {
                    sb.append("[ ");
                    for (int i = 0; i < Array.getLength(obj); i++) {
                        sb.append("'");
                        sb.append(Array.get(obj, i));
                        sb.append("' ");
                    }
                    sb.append("]");
                }
                sb.append(" } ");
            }
        } catch (RuntimeException e) {
            sb.append("<error>");
        }
    }

    /* renamed from: a */
    public static boolean m118872a(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !m118872a((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null && (obj2 != null || !bundle2.containsKey(str))) {
                return false;
            }
            if (obj instanceof boolean[]) {
                if (!(obj2 instanceof boolean[]) || !Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                    return false;
                }
            } else if (obj instanceof long[]) {
                if (!(obj2 instanceof long[]) || !Arrays.equals((long[]) obj, (long[]) obj2)) {
                    return false;
                }
            } else if (obj instanceof double[]) {
                if (!(obj2 instanceof double[]) || !Arrays.equals((double[]) obj, (double[]) obj2)) {
                    return false;
                }
            } else if (obj instanceof byte[]) {
                if (!(obj2 instanceof byte[]) || !Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                    return false;
                }
            } else if ((obj instanceof Object[]) && (!(obj2 instanceof Object[]) || !Arrays.equals((Object[]) obj, (Object[]) obj2))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final String mo72348a() {
        String[] b = mo72351b("name");
        if (b == null || b.length != 1) {
            return null;
        }
        return b[0];
    }

    /* renamed from: a */
    public final Thing[] mo72349a(String str) {
        Parcelable[] parcelableArray;
        if (!(this.f152370b.get(str) instanceof Parcelable[]) || (parcelableArray = this.f152370b.getParcelableArray(str)) == null) {
            return null;
        }
        return (Thing[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Thing[].class);
    }
}
