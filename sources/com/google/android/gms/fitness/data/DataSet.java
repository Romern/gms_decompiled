package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class DataSet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ywp();

    /* renamed from: a */
    public final int f31998a;

    /* renamed from: b */
    public final DataSource f31999b;

    /* renamed from: c */
    public final List f32000c;

    /* renamed from: d */
    public boolean f32001d;

    /* renamed from: e */
    private final List f32002e;

    public DataSet(int i, DataSource dataSource, List list, List list2, boolean z) {
        this.f31998a = i;
        this.f31999b = dataSource;
        this.f32001d = z;
        this.f32002e = new ArrayList(list.size());
        this.f32000c = i < 2 ? Collections.singletonList(dataSource) : list2;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f32002e.add(new DataPoint(this.f32000c, (RawDataPoint) list.get(i2)));
        }
    }

    /* renamed from: a */
    public static ywo m23672a(DataSource dataSource) {
        sdo.m34966a(dataSource, "DataSource should be specified");
        return new ywo(dataSource);
    }

    /* renamed from: a */
    public final DataType mo18901a() {
        return this.f31999b.f32005a;
    }

    /* renamed from: b */
    public final List mo18904b() {
        return Collections.unmodifiableList(this.f32002e);
    }

    /* renamed from: c */
    public final int mo18905c() {
        if (!this.f32002e.isEmpty()) {
            return (((DataPoint) this.f32002e.get(0)).f31995d.length * 24) + 76;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final List mo18906d() {
        return mo18902a(this.f32000c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DataSet) {
            DataSet dataSet = (DataSet) obj;
            return sdg.m34949a(this.f31999b, dataSet.f31999b) && sdg.m34949a(this.f32002e, dataSet.f32002e) && this.f32001d == dataSet.f32001d;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31999b});
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    public final String toString() {
        List d = mo18906d();
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        objArr[0] = this.f31999b.mo18911a();
        Object obj = d;
        if (this.f32002e.size() >= 10) {
            obj = String.format(Locale.US, "%d data points, first 5: %s", Integer.valueOf(this.f32002e.size()), d.subList(0, 5));
        }
        objArr[1] = obj;
        return String.format(locale, "DataSet{%s %s}", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f31999b, i, false);
        see.m35048a(parcel, 3, mo18906d());
        see.m35066c(parcel, 4, this.f32000c, false);
        see.m35051a(parcel, 5, this.f32001d);
        see.m35063b(parcel, 1000, this.f31998a);
        see.m35062b(parcel, a);
    }

    public DataSet(DataSource dataSource) {
        this.f31998a = 3;
        sdo.m34959a(dataSource);
        this.f31999b = dataSource;
        this.f32002e = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f32000c = arrayList;
        arrayList.add(this.f31999b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo18902a(List list) {
        ArrayList arrayList = new ArrayList(this.f32002e.size());
        List list2 = this.f32002e;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new RawDataPoint((DataPoint) list2.get(i), list));
        }
        return arrayList;
    }

    @Deprecated
    /* renamed from: a */
    public final void mo18903a(DataPoint dataPoint) {
        this.f32002e.add(dataPoint);
        DataSource a = dataPoint.mo18895a();
        if (a != null && !this.f32000c.contains(a)) {
            this.f32000c.add(a);
        }
    }

    public DataSet(RawDataSet rawDataSet, List list) {
        this.f31998a = 3;
        this.f31999b = (DataSource) list.get(rawDataSet.f32163a);
        this.f32000c = list;
        this.f32001d = rawDataSet.f32165c;
        List list2 = rawDataSet.f32164b;
        this.f32002e = new ArrayList(list2.size());
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            this.f32002e.add(new DataPoint(this.f32000c, (RawDataPoint) list2.get(i)));
        }
    }
}
