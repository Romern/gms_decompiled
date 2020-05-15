package com.google.android.gms.ocr;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GiftCardOcrResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new akpc();

    /* renamed from: a */
    public final List f81245a;

    /* renamed from: b */
    public final String f81246b;

    /* renamed from: c */
    public final int f81247c;

    /* renamed from: d */
    public final int f81248d;

    /* renamed from: e */
    public final int f81249e;

    /* renamed from: f */
    public final int f81250f;

    /* renamed from: g */
    public final int f81251g;

    /* renamed from: h */
    public final int f81252h;

    /* renamed from: i */
    public final int f81253i;

    /* renamed from: j */
    public final int f81254j;

    public GiftCardOcrResult(akpd akpd) {
        this.f81245a = akpd.f72381a;
        this.f81246b = akpd.f72382b;
        this.f81247c = akpd.f72383c;
        this.f81248d = akpd.f72384d;
        this.f81249e = akpd.f72385e;
        this.f81250f = akpd.f72386f;
        this.f81251g = akpd.f72387g;
        this.f81252h = akpd.f72388h;
        this.f81253i = akpd.f72389i;
        this.f81254j = akpd.f72390j;
    }

    /* renamed from: a */
    public static akpd m67678a() {
        return new akpd();
    }

    /* renamed from: b */
    public final akpd mo44705b() {
        akpd akpd = new akpd();
        akpd.f72381a = this.f81245a;
        akpd.f72382b = this.f81246b;
        akpd.f72383c = this.f81247c;
        akpd.f72384d = this.f81248d;
        akpd.f72385e = this.f81249e;
        akpd.f72386f = this.f81250f;
        akpd.f72387g = this.f81251g;
        akpd.f72388h = this.f81252h;
        akpd.f72389i = this.f81253i;
        akpd.f72390j = this.f81254j;
        return akpd;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f81245a);
        parcel.writeString(this.f81246b);
        parcel.writeInt(this.f81247c);
        parcel.writeInt(this.f81248d);
        parcel.writeInt(this.f81249e);
        parcel.writeInt(this.f81250f);
        parcel.writeInt(this.f81251g);
        parcel.writeInt(this.f81252h);
        parcel.writeInt(this.f81253i);
        parcel.writeInt(this.f81254j);
    }

    public GiftCardOcrResult(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.f81245a = arrayList;
        parcel.readStringList(arrayList);
        this.f81246b = parcel.readString();
        this.f81247c = parcel.readInt();
        this.f81248d = parcel.readInt();
        this.f81249e = parcel.readInt();
        this.f81250f = parcel.readInt();
        this.f81251g = parcel.readInt();
        this.f81252h = parcel.readInt();
        this.f81253i = parcel.readInt();
        this.f81254j = parcel.readInt();
    }
}
