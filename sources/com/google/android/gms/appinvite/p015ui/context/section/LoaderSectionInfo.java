package com.google.android.gms.appinvite.p015ui.context.section;

import android.os.Parcel;
import android.telephony.PhoneNumberUtils;
import com.google.android.gms.appinvite.model.ContactPerson;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.appinvite.ui.context.section.LoaderSectionInfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class LoaderSectionInfo extends SectionInfo {

    /* renamed from: a */
    public final String f9788a;

    /* renamed from: b */
    public String[] f9789b;

    /* renamed from: c */
    public boolean f9790c;

    /* renamed from: d */
    public String f9791d;

    /* renamed from: e */
    public boolean f9792e;

    /* renamed from: f */
    protected boolean f9793f;

    /* renamed from: g */
    public String f9794g;

    /* renamed from: h */
    public String f9795h;

    /* renamed from: i */
    public int f9796i;

    /* renamed from: j */
    public int f9797j = Integer.MAX_VALUE;

    /* renamed from: k */
    public int f9798k = Integer.MAX_VALUE;

    /* renamed from: l */
    public ArrayList f9799l;

    /* renamed from: m */
    public ArrayList f9800m;

    /* renamed from: n */
    public ArrayList f9801n;

    /* renamed from: o */
    public ArrayList f9802o;

    public LoaderSectionInfo(Parcel parcel) {
        super(parcel);
        this.f9788a = parcel.readString();
        this.f9789b = parcel.createStringArray();
        boolean z = true;
        this.f9790c = parcel.readInt() != 0;
        this.f9791d = parcel.readString();
        this.f9792e = parcel.readInt() != 0;
        this.f9793f = parcel.readInt() == 0 ? false : z;
        this.f9794g = parcel.readString();
        this.f9795h = parcel.readString();
        this.f9796i = parcel.readInt();
        this.f9797j = parcel.readInt();
        this.f9798k = parcel.readInt();
        this.f9799l = parcel.readArrayList(ContactPerson.class.getClassLoader());
        this.f9800m = parcel.createStringArrayList();
        this.f9801n = parcel.createStringArrayList();
        this.f9802o = parcel.createStringArrayList();
    }

    /* renamed from: a */
    public final void mo7294a(ArrayList arrayList) {
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                String str = (String) arrayList.get(i);
                if (str != null) {
                    arrayList.set(i, str.toLowerCase());
                }
            }
        }
        this.f9801n = arrayList;
    }

    /* renamed from: b */
    public final void mo7295b(ArrayList arrayList) {
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                String str = (String) arrayList.get(i);
                if (str != null) {
                    arrayList.set(i, PhoneNumberUtils.stripSeparators(str));
                }
            }
        }
        this.f9802o = arrayList;
    }

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f9788a);
        parcel.writeStringArray(this.f9789b);
        parcel.writeInt(this.f9790c ? 1 : 0);
        parcel.writeString(this.f9791d);
        parcel.writeInt(this.f9792e ? 1 : 0);
        parcel.writeInt(this.f9793f ? 1 : 0);
        parcel.writeString(this.f9794g);
        parcel.writeString(this.f9795h);
        parcel.writeInt(this.f9796i);
        parcel.writeInt(this.f9797j);
        parcel.writeInt(this.f9798k);
        parcel.writeList(this.f9799l);
        parcel.writeStringList(this.f9800m);
        parcel.writeStringList(this.f9801n);
        parcel.writeStringList(this.f9802o);
    }

    public LoaderSectionInfo(String str) {
        this.f9788a = str;
    }
}
