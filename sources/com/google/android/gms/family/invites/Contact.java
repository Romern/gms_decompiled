package com.google.android.gms.family.invites;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.people.model.AvatarReference;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Contact implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new whf();

    /* renamed from: a */
    public String f31282a;

    /* renamed from: b */
    public String f31283b;

    /* renamed from: c */
    public String f31284c;

    /* renamed from: d */
    public int f31285d;

    /* renamed from: e */
    public String f31286e;

    /* renamed from: f */
    public String f31287f;

    /* renamed from: g */
    public AvatarReference f31288g;

    /* renamed from: h */
    public int f31289h = 1;

    /* renamed from: i */
    public Uri f31290i;

    /* renamed from: j */
    public int f31291j;

    public Contact() {
    }

    /* renamed from: a */
    public final boolean mo18398a() {
        return (this.f31282a == null && this.f31284c == null) ? false : true;
    }

    /* renamed from: b */
    public final boolean mo18399b() {
        return this.f31282a != null;
    }

    /* renamed from: c */
    public final int mo18400c() {
        return this.f31282a != null ? 3 : 2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Contact) || this.f31285d != ((Contact) obj).f31285d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return stm.m36299a(this.f31282a).hashCode() + stm.m36299a(this.f31284c).hashCode() + stm.m36299a(this.f31283b).hashCode();
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[10];
        objArr[0] = this.f31283b;
        objArr[1] = this.f31282a;
        objArr[2] = this.f31284c;
        objArr[3] = this.f31286e;
        objArr[4] = Integer.valueOf(this.f31285d);
        objArr[5] = this.f31287f;
        objArr[6] = Integer.valueOf(this.f31291j);
        AvatarReference avatarReference = this.f31288g;
        String str2 = "";
        if (avatarReference != null) {
            str = avatarReference.toString();
        } else {
            str = str2;
        }
        objArr[7] = str;
        objArr[8] = Integer.valueOf(this.f31289h);
        Uri uri = this.f31290i;
        if (uri != null) {
            str2 = uri.toString();
        }
        objArr[9] = str2;
        return String.format("DisplayName:%s, PhoneNumber:%s, EmailAddress:%s, InvitationMessage:%s, contactId:%s invitationId:%s, state:%s, avatar:%s, numSmsParts:%s, avatarUri:%s", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f31283b);
        parcel.writeString(this.f31282a);
        parcel.writeString(this.f31286e);
        parcel.writeString(this.f31287f);
        parcel.writeString(this.f31284c);
        parcel.writeInt(this.f31285d);
        parcel.writeInt(this.f31291j);
        parcel.writeParcelable(this.f31288g, i);
        parcel.writeInt(this.f31289h);
        parcel.writeParcelable(this.f31290i, i);
    }

    public Contact(Parcel parcel) {
        this.f31283b = parcel.readString();
        this.f31282a = parcel.readString();
        this.f31286e = parcel.readString();
        this.f31287f = parcel.readString();
        this.f31284c = parcel.readString();
        this.f31285d = parcel.readInt();
        this.f31291j = parcel.readInt();
        this.f31288g = (AvatarReference) parcel.readParcelable(AvatarReference.class.getClassLoader());
        this.f31289h = parcel.readInt();
        this.f31290i = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    public Contact(Contact contact) {
        this.f31283b = contact.f31283b;
        this.f31282a = contact.f31282a;
        this.f31291j = contact.f31291j;
        this.f31284c = contact.f31284c;
        this.f31286e = contact.f31286e;
        this.f31287f = contact.f31287f;
        this.f31285d = contact.f31285d;
        this.f31288g = contact.f31288g;
        this.f31290i = contact.f31290i;
    }
}
