package com.google.android.wallet.clientlog;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Session implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bjta();

    /* renamed from: a */
    public final String f151801a;

    /* renamed from: b */
    public final int f151802b;

    /* renamed from: c */
    public boolean f151803c;

    /* renamed from: d */
    public List f151804d;

    /* renamed from: e */
    public boolean f151805e;

    /* renamed from: f */
    public int f151806f = 1;

    public Session(Parcel parcel) {
        boolean z;
        ArrayList arrayList;
        boolean z2 = true;
        this.f151801a = parcel.readString();
        this.f151802b = parcel.readInt();
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f151803c = z;
        int a = bman.m107838a(parcel.readInt());
        if (a != 0) {
            this.f151806f = a;
        }
        int[] createIntArray = parcel.createIntArray();
        if (createIntArray != null) {
            int length = createIntArray.length;
            arrayList = new ArrayList(length);
            for (int i : createIntArray) {
                bwfe a2 = bwfe.m121902a(i);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        } else {
            arrayList = null;
        }
        this.f151804d = arrayList;
        this.f151805e = parcel.readInt() != 1 ? false : z2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f151801a);
        parcel.writeInt(this.f151802b);
        parcel.writeInt(this.f151803c ? 1 : 0);
        int i2 = this.f151806f;
        int i3 = i2 - 1;
        int[] iArr = null;
        if (i2 != 0) {
            parcel.writeInt(i3);
            List list = this.f151804d;
            if (list != null) {
                int size = list.size();
                iArr = new int[size];
                for (int i4 = 0; i4 < size; i4++) {
                    iArr[i4] = ((bwfe) list.get(i4)).f159083I;
                }
            }
            parcel.writeIntArray(iArr);
            parcel.writeInt(this.f151805e ? 1 : 0);
            return;
        }
        throw null;
    }

    public Session(String str, int i) {
        this.f151801a = str;
        this.f151802b = i;
    }
}
