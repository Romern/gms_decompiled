package com.google.android.gms.family.p042v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.family.v2.model.PageData */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PageData implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new wqs();

    /* renamed from: a */
    public HashMap f31453a;

    /* renamed from: b */
    public HashMap f31454b;

    /* renamed from: c */
    public ArrayList f31455c;

    /* renamed from: d */
    public int f31456d;

    public PageData(Parcel parcel) {
        int i = 1;
        this.f31456d = 1;
        this.f31453a = new HashMap();
        this.f31454b = new HashMap();
        this.f31455c = new ArrayList();
        int a = bred.m113924a(parcel.readInt());
        this.f31456d = a != 0 ? a : i;
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f31453a.put(Integer.valueOf(parcel.readInt()), parcel.readString());
        }
        int readInt2 = parcel.readInt();
        for (int i3 = 0; i3 < readInt2; i3++) {
            this.f31454b.put(parcel.readString(), (HelpData) HelpData.CREATOR.createFromParcel(parcel));
        }
        int readInt3 = parcel.readInt();
        for (int i4 = 0; i4 < readInt3; i4++) {
            this.f31455c.add((BulletPoint) BulletPoint.CREATOR.createFromParcel(parcel));
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PageData)) {
            return false;
        }
        PageData pageData = (PageData) obj;
        return pageData.f31456d == this.f31456d && pageData.f31453a.equals(this.f31453a) && pageData.f31454b.equals(this.f31454b) && pageData.f31455c.equals(this.f31455c);
    }

    public final int hashCode() {
        Object[] objArr = new Object[4];
        int i = this.f31456d;
        int i2 = i - 1;
        if (i != 0) {
            objArr[0] = Integer.valueOf(i2);
            objArr[1] = this.f31453a;
            objArr[2] = this.f31454b;
            objArr[3] = this.f31455c;
            return Arrays.hashCode(objArr);
        }
        throw null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.f31456d;
        int i3 = i2 - 1;
        if (i2 != 0) {
            parcel.writeInt(i3);
            parcel.writeInt(this.f31453a.size());
            for (Map.Entry entry : this.f31453a.entrySet()) {
                parcel.writeInt(((Integer) entry.getKey()).intValue());
                parcel.writeString((String) entry.getValue());
            }
            parcel.writeInt(this.f31454b.size());
            for (Map.Entry entry2 : this.f31454b.entrySet()) {
                parcel.writeString((String) entry2.getKey());
                ((HelpData) entry2.getValue()).writeToParcel(parcel, i);
            }
            parcel.writeInt(this.f31455c.size());
            ArrayList arrayList = this.f31455c;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((BulletPoint) arrayList.get(i4)).writeToParcel(parcel, i);
            }
            return;
        }
        throw null;
    }

    public PageData(bree bree) {
        this.f31456d = 1;
        int a = bred.m113924a(bree.f142592a);
        this.f31456d = a == 0 ? 1 : a;
        this.f31453a = new HashMap();
        this.f31454b = new HashMap();
        this.f31455c = new ArrayList();
        if (bree.f142593b.size() != 0) {
            bxwc bxwc = bree.f142593b;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                brdy brdy = (brdy) bxwc.get(i);
                HashMap hashMap = this.f31453a;
                int a2 = brea.m113921a(brdy.f142579a);
                if (a2 == 0) {
                    a2 = 1;
                }
                hashMap.put(Integer.valueOf(a2 - 1), brdy.f142580b);
            }
        }
        if (bree.f142594c.size() != 0) {
            bxwc bxwc2 = bree.f142594c;
            int size2 = bxwc2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                breb breb = (breb) bxwc2.get(i2);
                this.f31454b.put(breb.f142585a, new HelpData(breb));
            }
        }
        if (bree.f142595d.size() != 0) {
            bxwc bxwc3 = bree.f142595d;
            int size3 = bxwc3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                this.f31455c.add(new BulletPoint((brdx) bxwc3.get(i3)));
            }
        }
    }
}
