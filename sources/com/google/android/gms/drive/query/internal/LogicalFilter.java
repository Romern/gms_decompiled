package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.query.Filter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LogicalFilter extends AbstractFilter {
    public static final Parcelable.Creator CREATOR = new vgs();

    /* renamed from: a */
    final Operator f31118a;

    /* renamed from: b */
    final List f31119b;

    /* renamed from: c */
    private List f31120c;

    public LogicalFilter(Operator operator, Filter filter, Filter... filterArr) {
        this.f31118a = operator;
        ArrayList arrayList = new ArrayList(2);
        this.f31119b = arrayList;
        arrayList.add(new FilterHolder(filter));
        ArrayList arrayList2 = new ArrayList(2);
        this.f31120c = arrayList2;
        arrayList2.add(filter);
        Filter filter2 = filterArr[0];
        this.f31119b.add(new FilterHolder(filter2));
        this.f31120c.add(filter2);
    }

    /* renamed from: a */
    public final Object mo18284a(vgn vgn) {
        ArrayList arrayList = new ArrayList();
        List list = this.f31119b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((FilterHolder) list.get(i)).f31112j.mo18284a(vgn));
        }
        return vgn.mo28318a(this.f31118a, arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f31118a, i, false);
        see.m35066c(parcel, 2, this.f31119b, false);
        see.m35062b(parcel, a);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List, java.lang.Iterable], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    public LogicalFilter(Operator operator, Iterable r6) {
        this.f31118a = operator;
        this.f31120c = new ArrayList();
        this.f31119b = new ArrayList();
        int size = r6.size();
        for (int i = 0; i < size; i++) {
            Filter filter = (Filter) r6.get(i);
            this.f31120c.add(filter);
            this.f31119b.add(new FilterHolder(filter));
        }
    }

    public LogicalFilter(Operator operator, List list) {
        this.f31118a = operator;
        this.f31119b = list;
    }
}
