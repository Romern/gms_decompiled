package com.google.android.libraries.walletp2p.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Contact implements Parcelable {
    public static final Parcelable.Creator CREATOR = new beqi();

    /* renamed from: a */
    public final Uri f150662a;

    /* renamed from: b */
    public final String f150663b;

    /* renamed from: c */
    public final String f150664c;

    /* renamed from: d */
    public final String f150665d;

    /* renamed from: e */
    public final String f150666e;

    static {
        new Contact(Uri.EMPTY, "", "", "", "");
        Contact.class.getSimpleName();
    }

    public Contact(Uri uri, String str, String str2, String str3, String str4) {
        bmxy.m108581a(str);
        bmxy.m108581a(uri);
        bmxy.m108581a(str4);
        bmxy.m108581a(str2);
        bmxy.m108581a(str3);
        this.f150662a = uri;
        this.f150664c = str2;
        this.f150665d = str3;
        this.f150663b = (str.equals(str2) || str.equals(str3)) ? "" : str;
        this.f150666e = str4;
    }

    /* renamed from: a */
    public static Contact m117178a(String str) {
        return new Contact(Uri.EMPTY, "", str, "", "");
    }

    /* renamed from: b */
    public static Contact m117179b(String str) {
        return new Contact(Uri.EMPTY, "", "", str, "");
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Contact contact = (Contact) obj;
            if (this.f150662a.equals(contact.f150662a) && this.f150663b.equals(contact.f150663b) && this.f150664c.equals(contact.f150664c) && this.f150665d.equals(contact.f150665d)) {
                return this.f150666e.equals(contact.f150666e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f150662a, this.f150663b, this.f150664c, this.f150665d, this.f150666e});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f150662a.toString());
        parcel.writeString(this.f150663b);
        parcel.writeString(this.f150664c);
        parcel.writeString(this.f150665d);
        parcel.writeString(this.f150666e);
    }
}
