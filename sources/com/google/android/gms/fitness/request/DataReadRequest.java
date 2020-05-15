package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DataReadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zeh();

    /* renamed from: a */
    public final List f32215a;

    /* renamed from: b */
    public final List f32216b;

    /* renamed from: c */
    public final long f32217c;

    /* renamed from: d */
    public final long f32218d;

    /* renamed from: e */
    public final List f32219e;

    /* renamed from: f */
    public final List f32220f;

    /* renamed from: g */
    public final int f32221g;

    /* renamed from: h */
    public final long f32222h;

    /* renamed from: i */
    public final DataSource f32223i;

    /* renamed from: j */
    public final int f32224j;

    /* renamed from: k */
    public final boolean f32225k;

    /* renamed from: l */
    public final boolean f32226l;

    /* renamed from: m */
    public final List f32227m;

    /* renamed from: n */
    public final List f32228n;

    /* renamed from: o */
    public final zax f32229o;

    public DataReadRequest(List list, List list2, long j, long j2, List list3, List list4, int i, long j3, DataSource dataSource, int i2, boolean z, boolean z2, IBinder iBinder, List list5, List list6) {
        zax zax;
        List list7;
        List list8;
        boolean z3;
        IBinder iBinder2 = iBinder;
        this.f32215a = list;
        this.f32216b = list2;
        this.f32217c = j;
        this.f32218d = j2;
        this.f32219e = list3;
        this.f32220f = list4;
        this.f32221g = i;
        this.f32222h = j3;
        this.f32223i = dataSource;
        this.f32224j = i2;
        this.f32225k = z;
        this.f32226l = z2;
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.fitness.internal.IDataReadCallback");
            zax = queryLocalInterface instanceof zax ? (zax) queryLocalInterface : new zax(iBinder2);
        } else {
            zax = null;
        }
        this.f32229o = zax;
        if (list5 == null) {
            list7 = Collections.emptyList();
        } else {
            list7 = list5;
        }
        this.f32227m = list7;
        if (list6 == null) {
            list8 = Collections.emptyList();
        } else {
            list8 = list6;
        }
        this.f32228n = list8;
        if (this.f32227m.size() == this.f32228n.size()) {
            z3 = true;
        } else {
            z3 = false;
        }
        sdo.m34975b(z3, "Unequal number of interval start and end times.");
    }

    /* renamed from: a */
    public final long mo19008a(TimeUnit timeUnit) {
        return timeUnit.convert(this.f32217c, TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    public final long mo19009b(TimeUnit timeUnit) {
        return timeUnit.convert(this.f32218d, TimeUnit.MILLISECONDS);
    }

    /* renamed from: c */
    public final long mo19010c(TimeUnit timeUnit) {
        return timeUnit.convert(this.f32222h, TimeUnit.MILLISECONDS);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DataReadRequest)) {
                return false;
            }
            DataReadRequest dataReadRequest = (DataReadRequest) obj;
            if (!(this.f32215a.equals(dataReadRequest.f32215a) && this.f32216b.equals(dataReadRequest.f32216b) && this.f32217c == dataReadRequest.f32217c && this.f32218d == dataReadRequest.f32218d && this.f32221g == dataReadRequest.f32221g && this.f32220f.equals(dataReadRequest.f32220f) && this.f32219e.equals(dataReadRequest.f32219e) && sdg.m34949a(this.f32223i, dataReadRequest.f32223i) && this.f32222h == dataReadRequest.f32222h && this.f32226l == dataReadRequest.f32226l && this.f32224j == dataReadRequest.f32224j && this.f32225k == dataReadRequest.f32225k && sdg.m34949a(this.f32229o, dataReadRequest.f32229o))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f32221g), Long.valueOf(this.f32217c), Long.valueOf(this.f32218d)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataReadRequest{");
        if (!this.f32215a.isEmpty()) {
            List list = this.f32215a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append(((DataType) list.get(i)).mo18916a());
                sb.append(" ");
            }
        }
        if (!this.f32216b.isEmpty()) {
            List list2 = this.f32216b;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                sb.append(((DataSource) list2.get(i2)).mo18911a());
                sb.append(" ");
            }
        }
        if (this.f32221g != 0) {
            sb.append("bucket by ");
            sb.append(Bucket.m23662a(this.f32221g));
            if (this.f32222h > 0) {
                sb.append(" >");
                sb.append(this.f32222h);
                sb.append("ms");
            }
            sb.append(": ");
        }
        if (!this.f32219e.isEmpty()) {
            List list3 = this.f32219e;
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                sb.append(((DataType) list3.get(i3)).mo18916a());
                sb.append(" ");
            }
        }
        if (!this.f32220f.isEmpty()) {
            List list4 = this.f32220f;
            int size4 = list4.size();
            for (int i4 = 0; i4 < size4; i4++) {
                sb.append(((DataSource) list4.get(i4)).mo18911a());
                sb.append(" ");
            }
        }
        sb.append(String.format(Locale.US, "(%tF %tT - %tF %tT)", Long.valueOf(this.f32217c), Long.valueOf(this.f32217c), Long.valueOf(this.f32218d), Long.valueOf(this.f32218d)));
        if (this.f32223i != null) {
            sb.append("activities: ");
            sb.append(this.f32223i.mo18911a());
        }
        if (this.f32226l) {
            sb.append(" +server");
        }
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 1, this.f32215a, false);
        see.m35066c(parcel, 2, this.f32216b, false);
        see.m35036a(parcel, 3, this.f32217c);
        see.m35036a(parcel, 4, this.f32218d);
        see.m35066c(parcel, 5, this.f32219e, false);
        see.m35066c(parcel, 6, this.f32220f, false);
        see.m35063b(parcel, 7, this.f32221g);
        see.m35036a(parcel, 8, this.f32222h);
        see.m35040a(parcel, 9, this.f32223i, i, false);
        see.m35063b(parcel, 10, this.f32224j);
        see.m35051a(parcel, 12, this.f32225k);
        see.m35051a(parcel, 13, this.f32226l);
        zax zax = this.f32229o;
        if (zax != null) {
            iBinder = zax.f12819a;
        } else {
            iBinder = null;
        }
        see.m35038a(parcel, 14, iBinder);
        see.m35064b(parcel, 18, this.f32227m);
        see.m35064b(parcel, 19, this.f32228n);
        see.m35062b(parcel, a);
    }
}
