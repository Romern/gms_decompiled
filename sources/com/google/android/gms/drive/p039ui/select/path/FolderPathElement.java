package com.google.android.gms.drive.p039ui.select.path;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.query.Filter;

/* renamed from: com.google.android.gms.drive.ui.select.path.FolderPathElement */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FolderPathElement implements DriveIdPathElement {
    public static final Parcelable.Creator CREATOR = new vnj();

    /* renamed from: a */
    public final DriveId f31204a;

    /* renamed from: b */
    public final boolean f31205b;

    /* renamed from: c */
    public final boolean f31206c;

    /* renamed from: d */
    private final int f31207d;

    /* renamed from: e */
    private final String f31208e;

    public FolderPathElement(Parcel parcel) {
        this.f31207d = parcel.readInt();
        this.f31208e = parcel.readString();
        this.f31204a = (DriveId) parcel.readParcelable(DriveId.class.getClassLoader());
        boolean z = true;
        this.f31205b = parcel.readInt() > 0;
        this.f31206c = parcel.readInt() <= 0 ? false : z;
    }

    /* renamed from: a */
    public final DriveId mo18340a() {
        return this.f31204a;
    }

    /* renamed from: a */
    public final String mo18341a(Context context) {
        return this.f31208e;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: vfu.a(uwa, java.lang.Object):com.google.android.gms.drive.query.Filter
     arg types: [uwa, com.google.android.gms.drive.DriveId]
     candidates:
      vfu.a(uwb, java.lang.Object):com.google.android.gms.drive.query.Filter
      vfu.a(uwa, java.lang.Object):com.google.android.gms.drive.query.Filter */
    /* renamed from: b */
    public final Filter mo18342b() {
        return vfu.m40351a(vgc.f49220d, (Object) this.f31204a);
    }

    /* renamed from: c */
    public final voc mo18343c() {
        return voc.f49620a;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f31207d);
        parcel.writeString(this.f31208e);
        parcel.writeParcelable(this.f31204a, i);
        parcel.writeInt(this.f31205b ? 1 : 0);
        parcel.writeInt(this.f31206c ? 1 : 0);
    }

    public FolderPathElement(twz twz) {
        this.f31207d = vlm.m40828a(twz.mo26857c()).mo28615a(twz.mo26860g());
        this.f31208e = twz.mo26858d();
        this.f31204a = twz.mo26854a();
        this.f31205b = twz.mo26861h();
        this.f31206c = twz.mo26860g();
    }
}
