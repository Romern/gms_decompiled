package com.google.android.gms.appinvite.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.people.model.AvatarReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ContactPerson extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new fvk();

    /* renamed from: a */
    public String f9749a;

    /* renamed from: b */
    public String f9750b;

    /* renamed from: c */
    public Long f9751c;

    /* renamed from: d */
    public AvatarReference f9752d;

    /* renamed from: e */
    public final ArrayList f9753e;

    /* renamed from: f */
    int f9754f;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class ContactMethod extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new fvj();

        /* renamed from: a */
        public final int f9755a;

        /* renamed from: b */
        public final String f9756b;

        /* renamed from: c */
        public final AvatarReference f9757c;

        public ContactMethod(int i, String str) {
            this(i, str, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                ContactMethod contactMethod = (ContactMethod) obj;
                return this.f9755a == contactMethod.f9755a && sdg.m34949a(this.f9756b, contactMethod.f9756b);
            }
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9755a), this.f9756b});
        }

        public ContactMethod(int i, String str, AvatarReference avatarReference) {
            this.f9755a = i;
            this.f9756b = str;
            this.f9757c = avatarReference;
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
            see.m35063b(parcel, 2, this.f9755a);
            see.m35046a(parcel, 3, this.f9756b, false);
            see.m35040a(parcel, 4, this.f9757c, i, false);
            see.m35062b(parcel, a);
        }
    }

    public ContactPerson(String str, String str2, AvatarReference avatarReference, List list) {
        this(str, str2, null, avatarReference, list);
    }

    /* renamed from: a */
    public final ContactMethod mo7263a() {
        if (this.f9754f < this.f9753e.size()) {
            return (ContactMethod) this.f9753e.get(this.f9754f);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ContactPerson contactPerson = (ContactPerson) obj;
            return sdg.m34949a(this.f9749a, contactPerson.f9749a) && sdg.m34949a(this.f9750b, contactPerson.f9750b) && sdg.m34949a(this.f9751c, contactPerson.f9751c) && sdg.m34949a(this.f9753e, contactPerson.f9753e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9749a, this.f9750b, this.f9751c, this.f9753e});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactPerson{");
        if (!TextUtils.isEmpty(this.f9749a)) {
            sb.append(" name=");
            sb.append(this.f9749a);
        }
        if (!TextUtils.isEmpty(this.f9750b)) {
            sb.append(" gaiaId=");
            sb.append(this.f9750b);
        }
        if (this.f9751c != null) {
            sb.append(" cp2Id=");
            sb.append(this.f9751c);
        }
        sb.append(" }");
        return sb.toString();
    }

    public ContactPerson(String str, String str2, Long l, AvatarReference avatarReference, List list) {
        this(str, str2, l, avatarReference, list, 0);
    }

    /* renamed from: a */
    public final void mo7264a(ContactMethod contactMethod) {
        if (contactMethod == null) {
            this.f9754f = this.f9753e.size();
        } else if (this.f9753e.contains(contactMethod)) {
            this.f9754f = this.f9753e.indexOf(contactMethod);
        }
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
        see.m35046a(parcel, 2, this.f9749a, false);
        see.m35046a(parcel, 3, this.f9750b, false);
        see.m35045a(parcel, 4, this.f9751c);
        see.m35040a(parcel, 5, this.f9752d, i, false);
        see.m35066c(parcel, 6, this.f9753e, false);
        see.m35063b(parcel, 7, this.f9754f);
        see.m35062b(parcel, a);
    }

    public ContactPerson(String str, String str2, Long l, AvatarReference avatarReference, List list, int i) {
        ArrayList arrayList = new ArrayList();
        this.f9753e = arrayList;
        this.f9749a = str;
        this.f9750b = str2;
        this.f9751c = l;
        this.f9752d = avatarReference;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.f9754f = i;
    }

    /* renamed from: a */
    public final void mo7265a(List list) {
        this.f9753e.addAll(list);
    }
}
