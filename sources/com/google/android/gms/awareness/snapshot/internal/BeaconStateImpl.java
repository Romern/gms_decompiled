package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.awareness.state.BeaconState$TypeFilter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class BeaconStateImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lrr();

    /* renamed from: a */
    public final ArrayList f11707a;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class BeaconInfoImpl extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new lrq();

        /* renamed from: a */
        public final String f11708a;

        /* renamed from: b */
        public final String f11709b;

        /* renamed from: c */
        public final byte[] f11710c;

        public BeaconInfoImpl(String str, String str2, byte[] bArr) {
            sdo.m34977c(str);
            this.f11708a = str;
            sdo.m34977c(str2);
            this.f11709b = str2;
            this.f11710c = bArr;
        }

        public final String toString() {
            byte[] bArr = this.f11710c;
            String str = bArr != null ? new String(bArr) : "<null>";
            String str2 = this.f11708a;
            String str3 = this.f11709b;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 6 + String.valueOf(str3).length() + str.length());
            sb.append("(");
            sb.append(str2);
            sb.append(", ");
            sb.append(str3);
            sb.append(", ");
            sb.append(str);
            sb.append(")");
            return sb.toString();
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
         method: see.a(android.os.Parcel, int, byte[], boolean):void
         arg types: [android.os.Parcel, int, byte[], int]
         candidates:
          see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
          see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
          see.a(android.os.Parcel, int, java.lang.String, boolean):void
          see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
          see.a(android.os.Parcel, int, java.util.List, boolean):void
          see.a(android.os.Parcel, int, double[], boolean):void
          see.a(android.os.Parcel, int, float[], boolean):void
          see.a(android.os.Parcel, int, int[], boolean):void
          see.a(android.os.Parcel, int, long[], boolean):void
          see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
          see.a(android.os.Parcel, int, java.lang.String[], boolean):void
          see.a(android.os.Parcel, int, boolean[], boolean):void
          see.a(android.os.Parcel, int, byte[], boolean):void */
        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            see.m35046a(parcel, 2, this.f11708a, false);
            see.m35046a(parcel, 3, this.f11709b, false);
            see.m35052a(parcel, 4, this.f11710c, false);
            see.m35062b(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class TypeFilterImpl extends BeaconState$TypeFilter {
        public static final Parcelable.Creator CREATOR = new lsd();

        /* renamed from: a */
        private final bxby f11711a;

        public TypeFilterImpl(String str, String str2) {
            bxvd da = bxby.f162752e.mo74144da();
            sdo.m34977c(str);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxby bxby = (bxby) da.f164949b;
            str.getClass();
            bxby.f162754a |= 1;
            bxby.f162755b = str;
            sdo.m34977c(str2);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxby bxby2 = (bxby) da.f164949b;
            str2.getClass();
            bxby2.f162754a |= 2;
            bxby2.f162756c = str2;
            this.f11711a = (bxby) da.mo74062i();
        }

        /* renamed from: a */
        public final String mo8038a() {
            bxby bxby = this.f11711a;
            if (bxby != null) {
                return bxby.f162755b;
            }
            return null;
        }

        /* renamed from: b */
        public final String mo8040b() {
            bxby bxby = this.f11711a;
            if (bxby != null) {
                return bxby.f162756c;
            }
            return null;
        }

        /* renamed from: c */
        public final byte[] mo8041c() {
            bxby bxby = this.f11711a;
            if (bxby == null || bxby.f162757d.mo73744a() == 0) {
                return null;
            }
            return this.f11711a.f162757d.mo73780k();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TypeFilterImpl) {
                TypeFilterImpl typeFilterImpl = (TypeFilterImpl) obj;
                return TextUtils.equals(mo8038a(), typeFilterImpl.mo8038a()) && TextUtils.equals(mo8040b(), typeFilterImpl.mo8040b()) && Arrays.equals(mo8041c(), typeFilterImpl.mo8041c());
            }
        }

        public final int hashCode() {
            Object[] objArr = new Object[3];
            int i = 0;
            objArr[0] = mo8038a();
            objArr[1] = mo8040b();
            if (mo8041c() != null) {
                i = Arrays.hashCode(mo8041c());
            }
            objArr[2] = Integer.valueOf(i);
            return Arrays.hashCode(objArr);
        }

        public final String toString() {
            String a = mo8038a();
            String b = mo8040b();
            String str = mo8041c() != null ? new String(mo8041c()) : "null";
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 4 + String.valueOf(b).length() + str.length());
            sb.append("(");
            sb.append(a);
            sb.append(",");
            sb.append(b);
            sb.append(",");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: a */
        public final boolean mo8039a(String str, String str2, byte[] bArr) {
            if (!TextUtils.equals(str, mo8038a()) || !TextUtils.equals(str2, mo8040b())) {
                return false;
            }
            return mo8041c() == null || Arrays.equals(bArr, mo8041c());
        }

        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: see.a(android.os.Parcel, int, byte[], boolean):void
         arg types: [android.os.Parcel, int, byte[], int]
         candidates:
          see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
          see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
          see.a(android.os.Parcel, int, java.lang.String, boolean):void
          see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
          see.a(android.os.Parcel, int, java.util.List, boolean):void
          see.a(android.os.Parcel, int, double[], boolean):void
          see.a(android.os.Parcel, int, float[], boolean):void
          see.a(android.os.Parcel, int, int[], boolean):void
          see.a(android.os.Parcel, int, long[], boolean):void
          see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
          see.a(android.os.Parcel, int, java.lang.String[], boolean):void
          see.a(android.os.Parcel, int, boolean[], boolean):void
          see.a(android.os.Parcel, int, byte[], boolean):void */
        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            see.m35052a(parcel, 2, this.f11711a.mo73642k(), false);
            see.m35062b(parcel, a);
        }

        public TypeFilterImpl(byte[] bArr) {
            bxby bxby;
            try {
                bxby = (bxby) bxvk.m124016a(bxby.f162752e, bArr, bxus.m123744c());
            } catch (bxwf e) {
                dst.m9253a("BeaconStateImpl", "Could not deserialize BeaconFence.BeaconTypeFilter");
                bxby = null;
            }
            this.f11711a = bxby;
        }
    }

    public BeaconStateImpl(ArrayList arrayList) {
        this.f11707a = arrayList;
    }

    public final String toString() {
        ArrayList arrayList = this.f11707a;
        if (arrayList == null || arrayList.isEmpty()) {
            return "BeaconState: empty";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("BeaconState: ");
        ArrayList arrayList2 = this.f11707a;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            sb.append((BeaconInfoImpl) arrayList2.get(i));
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 2, this.f11707a, false);
        see.m35062b(parcel, a);
    }
}
