package com.google.android.gms.people.identity.models;

import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface Person extends Parcelable, alzh {

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface Emails extends MetadataHolder, Parcelable, alza {
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface Images extends MetadataHolder, Parcelable, alzb {
        /* renamed from: g */
        ImageReference mo46312g();
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface Memberships extends MetadataHolder, Parcelable, alzc {
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface Metadata extends Parcelable, alzd {
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface MetadataHolder extends Parcelable, alze {
        /* renamed from: b */
        Metadata mo46297b();
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface Names extends MetadataHolder, Parcelable, alzf {
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface PhoneNumbers extends MetadataHolder, Parcelable, alzg {
    }
}
