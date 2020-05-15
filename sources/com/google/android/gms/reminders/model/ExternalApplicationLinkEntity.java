package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ExternalApplicationLinkEntity extends AbstractSafeParcelable implements ExternalApplicationLink {
    public static final Parcelable.Creator CREATOR = new aoto();

    /* renamed from: a */
    public final Integer f107134a;

    /* renamed from: b */
    public final String f107135b;

    public ExternalApplicationLinkEntity(ExternalApplicationLink externalApplicationLink) {
        this(externalApplicationLink.mo58641c(), externalApplicationLink.mo58642d());
    }

    /* renamed from: a */
    public static int m92057a(ExternalApplicationLink externalApplicationLink) {
        return Arrays.hashCode(new Object[]{externalApplicationLink.mo58641c(), externalApplicationLink.mo58642d()});
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final Integer mo58641c() {
        return this.f107134a;
    }

    /* renamed from: d */
    public final String mo58642d() {
        return this.f107135b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ExternalApplicationLink)) {
            return false;
        }
        if (this != obj) {
            return m92058a(this, (ExternalApplicationLink) obj);
        }
        return true;
    }

    public final int hashCode() {
        return m92057a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aoto.m69506a(this, parcel);
    }

    public ExternalApplicationLinkEntity(Integer num, String str) {
        this.f107134a = num;
        this.f107135b = str;
    }

    /* renamed from: a */
    public static boolean m92058a(ExternalApplicationLink externalApplicationLink, ExternalApplicationLink externalApplicationLink2) {
        return sdg.m34949a(externalApplicationLink.mo58641c(), externalApplicationLink2.mo58641c()) && sdg.m34949a(externalApplicationLink.mo58642d(), externalApplicationLink2.mo58642d());
    }
}
