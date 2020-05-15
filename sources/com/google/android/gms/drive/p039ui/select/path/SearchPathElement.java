package com.google.android.gms.drive.p039ui.select.path;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.internal.FullTextSearchFilter;
import com.google.android.gms.drive.query.internal.MatchAllFilter;

/* renamed from: com.google.android.gms.drive.ui.select.path.SearchPathElement */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SearchPathElement implements PathElement {
    public static final Parcelable.Creator CREATOR = new vnp();

    /* renamed from: a */
    public final String f31215a;

    /* renamed from: b */
    private final Filter f31216b;

    public SearchPathElement(String str) {
        sdo.m34959a((Object) str);
        this.f31215a = str;
        if (!str.isEmpty()) {
            sdo.m34959a((Object) str);
            this.f31216b = new FullTextSearchFilter(str);
            return;
        }
        this.f31216b = vfu.m40350a(new MatchAllFilter());
    }

    /* renamed from: a */
    public final String mo18341a(Context context) {
        return context.getString(C0126R.string.drive_menu_search_with_query, this.f31215a);
    }

    /* renamed from: b */
    public final Filter mo18342b() {
        return this.f31216b;
    }

    /* renamed from: c */
    public final voc mo18343c() {
        return voc.f49624e;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f31215a);
    }
}
