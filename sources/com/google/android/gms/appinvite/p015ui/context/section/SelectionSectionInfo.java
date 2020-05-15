package com.google.android.gms.appinvite.p015ui.context.section;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.gms.appinvite.ui.context.section.SelectionSectionInfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SelectionSectionInfo extends SectionInfo {
    public static final Parcelable.Creator CREATOR = new fyk();

    /* renamed from: a */
    public CharSequence f9804a;

    /* renamed from: b */
    public boolean f9805b;

    public SelectionSectionInfo() {
    }

    /* renamed from: a */
    public final fxg mo7291a(fwo fwo, int i) {
        int i2 = Build.VERSION.SDK_INT;
        return new fxu(fwo, i, fwo.f17462a.getString(C0126R.string.appinvite_recipients), this.f9804a, this.f9805b, false);
    }

    /* renamed from: b */
    public final fxg mo7296b(fwo fwo, int i) {
        int i2 = Build.VERSION.SDK_INT;
        return new fxu(fwo, i, fwo.f17462a.getString(C0126R.string.appinvite_recipients), this.f9804a, this.f9805b, true);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f9804a, parcel, i);
        parcel.writeInt(this.f9805b ? 1 : 0);
    }

    public SelectionSectionInfo(Parcel parcel) {
        super(parcel);
        this.f9804a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f9805b = parcel.readInt() != 0;
    }
}
