package com.google.android.material.badge;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class BadgeDrawable$SavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bhel();

    /* renamed from: a */
    public int f151043a;

    /* renamed from: b */
    public int f151044b;

    /* renamed from: c */
    public int f151045c = 255;

    /* renamed from: d */
    public int f151046d = -1;

    /* renamed from: e */
    public int f151047e;

    /* renamed from: f */
    public CharSequence f151048f;

    /* renamed from: g */
    public int f151049g;

    /* renamed from: h */
    public int f151050h;

    /* renamed from: i */
    public int f151051i;

    /* renamed from: j */
    public int f151052j;

    public BadgeDrawable$SavedState(Context context) {
        this.f151044b = new bhlc(context, 2132018452).f118934b.getDefaultColor();
        this.f151048f = context.getString(C0126R.string.mtrl_badge_numberless_content_description);
        this.f151049g = C0126R.plurals.mtrl_badge_content_description;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f151043a);
        parcel.writeInt(this.f151044b);
        parcel.writeInt(this.f151045c);
        parcel.writeInt(this.f151046d);
        parcel.writeInt(this.f151047e);
        parcel.writeString(this.f151048f.toString());
        parcel.writeInt(this.f151049g);
        parcel.writeInt(this.f151050h);
        parcel.writeInt(this.f151051i);
        parcel.writeInt(this.f151052j);
    }

    public BadgeDrawable$SavedState(Parcel parcel) {
        this.f151043a = parcel.readInt();
        this.f151044b = parcel.readInt();
        this.f151045c = parcel.readInt();
        this.f151046d = parcel.readInt();
        this.f151047e = parcel.readInt();
        this.f151048f = parcel.readString();
        this.f151049g = parcel.readInt();
        this.f151050h = parcel.readInt();
        this.f151051i = parcel.readInt();
        this.f151052j = parcel.readInt();
    }
}
