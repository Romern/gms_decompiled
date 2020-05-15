package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoalsReadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zev();

    /* renamed from: a */
    public final List f32260a;

    /* renamed from: b */
    public final List f32261b;

    /* renamed from: c */
    public final List f32262c;

    /* renamed from: d */
    public final zbe f32263d;

    public GoalsReadRequest(IBinder iBinder, List list, List list2, List list3) {
        zbe zbe;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoalsReadCallback");
            zbe = queryLocalInterface instanceof zbe ? (zbe) queryLocalInterface : new zbe(iBinder);
        } else {
            zbe = null;
        }
        this.f32263d = zbe;
        this.f32260a = list;
        this.f32261b = list2;
        this.f32262c = list3;
    }

    /* renamed from: a */
    public final List mo19050a() {
        if (this.f32262c.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List list = this.f32262c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(bzzh.m126348a(((Integer) list.get(i)).intValue()));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof GoalsReadRequest)) {
                return false;
            }
            GoalsReadRequest goalsReadRequest = (GoalsReadRequest) obj;
            if (!sdg.m34949a(this.f32260a, goalsReadRequest.f32260a) || !sdg.m34949a(this.f32261b, goalsReadRequest.f32261b) || !sdg.m34949a(this.f32262c, goalsReadRequest.f32262c)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32260a, this.f32261b, mo19050a()});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("dataTypes", this.f32260a);
        a.mo25396a("objectiveTypes", this.f32261b);
        a.mo25396a("activities", mo19050a());
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35038a(parcel, 1, this.f32263d.f12819a);
        see.m35048a(parcel, 2, this.f32260a);
        see.m35048a(parcel, 3, this.f32261b);
        see.m35048a(parcel, 4, this.f32262c);
        see.m35062b(parcel, a);
    }
}
