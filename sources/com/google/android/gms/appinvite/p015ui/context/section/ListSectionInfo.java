package com.google.android.gms.appinvite.p015ui.context.section;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.gms.appinvite.ui.context.section.ListSectionInfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ListSectionInfo extends LoaderSectionInfo {
    public static final Parcelable.Creator CREATOR = new fyj();

    /* renamed from: q */
    private boolean f9787q;

    public ListSectionInfo(Parcel parcel) {
        super(parcel);
        this.f9787q = parcel.readInt() != 0;
    }

    /* renamed from: a */
    public final fxg mo7291a(fwo fwo, int i) {
        int i2 = this.f9796i;
        int i3 = Build.VERSION.SDK_INT;
        fxn fxn = new fxn(fwo, C0126R.C0128layout.appinvite_contextual_selection_list_item, i, true, i2, true);
        fxn.mo11487a(this.f9794g, this.f9795h);
        return fxn;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f9787q ? 1 : 0);
    }

    public ListSectionInfo(String str) {
        super(str);
    }
}
