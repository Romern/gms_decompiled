package com.google.android.gms.common.people.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Audience extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new sfe();

    /* renamed from: a */
    public final int f30286a;

    /* renamed from: b */
    public final List f30287b;

    /* renamed from: c */
    public final int f30288c;
    @Deprecated

    /* renamed from: d */
    public final boolean f30289d;

    /* renamed from: e */
    public final boolean f30290e;

    public Audience(int i, List list, int i2, boolean z, boolean z2) {
        List list2;
        if (i == 1 && list == null) {
            list = Collections.emptyList();
        }
        this.f30286a = i;
        if (i2 == 1) {
            list2 = m22637a(list);
        } else {
            list2 = Collections.unmodifiableList(list);
        }
        this.f30287b = list2;
        this.f30288c = i2;
        if (i == 1) {
            this.f30289d = z;
            this.f30290e = !z;
            return;
        }
        this.f30290e = z2;
        this.f30289d = !z2;
    }

    /* renamed from: a */
    private static List m22637a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudienceMember audienceMember = (AudienceMember) it.next();
            if (audienceMember.f30292b != 1 || audienceMember.f30293c != 1) {
                arrayList.add(audienceMember);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Audience) {
            Audience audience = (Audience) obj;
            if (this.f30286a == audience.f30286a && sdg.m34949a(this.f30287b, audience.f30287b) && this.f30288c == audience.f30288c && this.f30290e == audience.f30290e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f30286a), this.f30287b, Integer.valueOf(this.f30288c), Boolean.valueOf(this.f30290e)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 1, this.f30287b, false);
        see.m35063b(parcel, 2, this.f30288c);
        see.m35051a(parcel, 3, this.f30289d);
        see.m35051a(parcel, 4, this.f30290e);
        see.m35063b(parcel, 1000, this.f30286a);
        see.m35062b(parcel, a);
    }

    public Audience(List list, int i, boolean z) {
        this.f30286a = 2;
        this.f30287b = i == 1 ? m22637a(list) : list;
        this.f30288c = i;
        this.f30290e = z;
        this.f30289d = !z;
    }
}
