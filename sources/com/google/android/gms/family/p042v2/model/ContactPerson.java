package com.google.android.gms.family.p042v2.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.people.model.AvatarReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.gms.family.v2.model.ContactPerson */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ContactPerson extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new wqp();

    /* renamed from: a */
    public final String f31433a;

    /* renamed from: b */
    public final Long f31434b;

    /* renamed from: c */
    public final AvatarReference f31435c;

    /* renamed from: d */
    public final ArrayList f31436d;

    /* renamed from: e */
    public final Uri f31437e;

    /* renamed from: com.google.android.gms.family.v2.model.ContactPerson$ContactMethod */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class ContactMethod extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new wqo();

        /* renamed from: a */
        public final int f31438a;

        /* renamed from: b */
        public final String f31439b;

        public ContactMethod(int i, String str) {
            this.f31438a = i;
            this.f31439b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ContactMethod) {
                ContactMethod contactMethod = (ContactMethod) obj;
                return this.f31438a == contactMethod.f31438a && sdg.m34949a(this.f31439b, contactMethod.f31439b);
            }
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f31438a), this.f31439b});
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
        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            see.m35063b(parcel, 1, this.f31438a);
            see.m35046a(parcel, 2, this.f31439b, false);
            see.m35062b(parcel, a);
        }
    }

    public ContactPerson(String str, Long l, AvatarReference avatarReference, Uri uri) {
        this.f31436d = new ArrayList();
        this.f31433a = str;
        this.f31434b = l;
        this.f31435c = avatarReference;
        this.f31437e = uri;
    }

    /* renamed from: a */
    public final void mo18541a(List list) {
        this.f31436d.addAll(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ContactPerson contactPerson = (ContactPerson) obj;
            return sdg.m34949a(this.f31433a, contactPerson.f31433a) && sdg.m34949a(this.f31434b, contactPerson.f31434b) && sdg.m34949a(new HashSet(this.f31436d), new HashSet(contactPerson.f31436d));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31433a, this.f31434b, this.f31436d});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactPerson{");
        if (!TextUtils.isEmpty(this.f31433a)) {
            sb.append(" name=");
            sb.append(this.f31433a);
        }
        if (this.f31434b != null) {
            sb.append(" cp2Id=");
            sb.append(this.f31434b);
        }
        sb.append(" }");
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
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 1, this.f31433a, false);
        see.m35045a(parcel, 2, this.f31434b);
        see.m35040a(parcel, 3, this.f31435c, i, false);
        see.m35066c(parcel, 4, this.f31436d, false);
        see.m35040a(parcel, 5, this.f31437e, i, false);
        see.m35062b(parcel, a);
    }

    public ContactPerson(String str, Long l, AvatarReference avatarReference, List list, Uri uri) {
        ArrayList arrayList = new ArrayList();
        this.f31436d = arrayList;
        this.f31433a = str;
        this.f31434b = l;
        this.f31435c = avatarReference;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.f31437e = uri;
    }
}
