package com.google.android.gms.family.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ViewerDataModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new wig();

    /* renamed from: a */
    public C1225nr f31360a;

    /* renamed from: b */
    public C1225nr f31361b;

    /* renamed from: c */
    public C1225nr f31362c;

    /* renamed from: d */
    private final SparseBooleanArray f31363d;

    public ViewerDataModel() {
        this.f31360a = new C1225nr();
        this.f31361b = new C1225nr();
        this.f31362c = new C1225nr();
        this.f31363d = new SparseBooleanArray();
    }

    /* renamed from: a */
    public final boolean mo18431a(int i) {
        return this.f31363d.get(i, false);
    }

    /* renamed from: b */
    public final void mo18432b(int i) {
        this.f31363d.put(i, true);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ViewerDataModel) {
            ViewerDataModel viewerDataModel = (ViewerDataModel) obj;
            return this.f31363d.equals(viewerDataModel.f31363d) && this.f31361b.equals(viewerDataModel.f31361b) && this.f31360a.equals(viewerDataModel.f31360a) && this.f31362c.equals(viewerDataModel.f31362c);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSparseBooleanArray(this.f31363d);
        parcel.writeInt(this.f31360a.f26758b);
        Iterator it = this.f31360a.iterator();
        while (it.hasNext()) {
            parcel.writeString((String) it.next());
        }
        parcel.writeInt(this.f31361b.f26758b);
        Iterator it2 = this.f31361b.iterator();
        while (it2.hasNext()) {
            parcel.writeString((String) it2.next());
        }
        parcel.writeInt(this.f31362c.f26758b);
        Iterator it3 = this.f31362c.iterator();
        while (it3.hasNext()) {
            parcel.writeString((String) it3.next());
        }
    }

    public ViewerDataModel(Parcel parcel) {
        this.f31363d = parcel.readSparseBooleanArray();
        this.f31360a = new C1225nr();
        this.f31361b = new C1225nr();
        this.f31362c = new C1225nr();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.f31360a.add(parcel.readString());
        }
        int readInt2 = parcel.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            this.f31361b.add(parcel.readString());
        }
        int readInt3 = parcel.readInt();
        for (int i3 = 0; i3 < readInt3; i3++) {
            this.f31362c.add(parcel.readString());
        }
    }
}
