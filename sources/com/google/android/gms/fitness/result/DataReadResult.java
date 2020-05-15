package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.RawBucket;
import com.google.android.gms.fitness.data.RawDataSet;
import com.google.android.gms.fitness.data.Session;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DataReadResult extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new zfr();

    /* renamed from: a */
    public final List f32329a;

    /* renamed from: b */
    public final Status f32330b;

    /* renamed from: c */
    public final List f32331c;

    /* renamed from: d */
    public int f32332d;

    /* renamed from: e */
    public final List f32333e;

    public DataReadResult(List list, Status status, List list2, int i, List list3) {
        DataReadResult dataReadResult = this;
        List list4 = list3;
        dataReadResult.f32330b = status;
        dataReadResult.f32332d = i;
        dataReadResult.f32333e = list4;
        dataReadResult.f32329a = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            dataReadResult.f32329a.add(new DataSet((RawDataSet) list.get(i2), list4));
        }
        dataReadResult.f32331c = new ArrayList(list2.size());
        int size2 = list2.size();
        int i3 = 0;
        while (i3 < size2) {
            RawBucket rawBucket = (RawBucket) list2.get(i3);
            List list5 = dataReadResult.f32331c;
            long j = rawBucket.f32150a;
            long j2 = rawBucket.f32151b;
            Session session = rawBucket.f32152c;
            int i4 = rawBucket.f32153d;
            List list6 = rawBucket.f32154e;
            ArrayList arrayList = new ArrayList(list6.size());
            int i5 = size2;
            int i6 = 0;
            for (int size3 = list6.size(); i6 < size3; size3 = size3) {
                arrayList.add(new DataSet((RawDataSet) list6.get(i6), list4));
                i6++;
            }
            list5.add(new Bucket(j, j2, session, i4, arrayList, rawBucket.f32155f, rawBucket.f32156g));
            i3++;
            dataReadResult = this;
            size2 = i5;
        }
    }

    /* renamed from: a */
    public static DataReadResult m23714a(Status status, List list, List list2) {
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(DataSet.m23672a((DataSource) list2.get(i)).mo30800a());
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ywq ywq = new ywq();
            ywq.f54713b = 1;
            ywq.f54712a = (DataType) list.get(i2);
            ywq.mo30805a("Default");
            arrayList.add(DataSet.m23672a(ywq.mo30804a()).mo30800a());
        }
        return new DataReadResult(arrayList, Collections.emptyList(), status);
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f32330b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DataReadResult)) {
                return false;
            }
            DataReadResult dataReadResult = (DataReadResult) obj;
            if (!this.f32330b.equals(dataReadResult.f32330b) || !sdg.m34949a(this.f32329a, dataReadResult.f32329a) || !sdg.m34949a(this.f32331c, dataReadResult.f32331c)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32330b, this.f32329a, this.f32331c});
    }

    public final String toString() {
        Object obj;
        Object obj2;
        sdf a = sdg.m34948a(this);
        a.mo25396a("status", this.f32330b);
        if (this.f32329a.size() > 5) {
            int size = this.f32329a.size();
            StringBuilder sb = new StringBuilder(21);
            sb.append(size);
            sb.append(" data sets");
            obj = sb.toString();
        } else {
            obj = this.f32329a;
        }
        a.mo25396a("dataSets", obj);
        if (this.f32331c.size() > 5) {
            int size2 = this.f32331c.size();
            StringBuilder sb2 = new StringBuilder(19);
            sb2.append(size2);
            sb2.append(" buckets");
            obj2 = sb2.toString();
        } else {
            obj2 = this.f32331c;
        }
        a.mo25396a("buckets", obj2);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        ArrayList arrayList = new ArrayList(this.f32329a.size());
        for (DataSet dataSet : this.f32329a) {
            arrayList.add(new RawDataSet(dataSet, this.f32333e));
        }
        see.m35048a(parcel, 1, arrayList);
        see.m35040a(parcel, 2, this.f32330b, i, false);
        ArrayList arrayList2 = new ArrayList(this.f32331c.size());
        for (Bucket bucket : this.f32331c) {
            arrayList2.add(new RawBucket(bucket, this.f32333e));
        }
        see.m35048a(parcel, 3, arrayList2);
        see.m35063b(parcel, 5, this.f32332d);
        see.m35066c(parcel, 6, this.f32333e, false);
        see.m35062b(parcel, a);
    }

    public DataReadResult(List list, List list2, Status status) {
        this.f32329a = list;
        this.f32330b = status;
        this.f32331c = list2;
        this.f32332d = 1;
        this.f32333e = new ArrayList();
    }
}
