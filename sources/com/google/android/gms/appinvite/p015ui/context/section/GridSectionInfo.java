package com.google.android.gms.appinvite.p015ui.context.section;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.gms.appinvite.ui.context.section.GridSectionInfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GridSectionInfo extends LoaderSectionInfo {
    public static final Parcelable.Creator CREATOR = new fyi();

    public GridSectionInfo(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: a */
    public final fxg mo7291a(fwo fwo, int i) {
        int i2 = this.f9796i;
        int i3 = Build.VERSION.SDK_INT;
        fxn fxn = new fxn(fwo, C0126R.C0128layout.appinvite_contextual_selection_grid_item, i, false, i2, false);
        fxn.mo11487a(this.f9794g, this.f9795h);
        return fxn;
    }

    public GridSectionInfo(String str) {
        super(str);
    }
}
