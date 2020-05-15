package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.ExternalApplicationLink;
import com.google.android.gms.reminders.model.ExternalApplicationLinkEntity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ExternalApplicationLinkRef extends aotf implements ExternalApplicationLink {
    public ExternalApplicationLinkRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return new ExternalApplicationLinkEntity(this);
    }

    /* renamed from: c */
    public final Integer mo58641c() {
        return mo46856i(mo46858k("link_application"));
    }

    /* renamed from: d */
    public final String mo58642d() {
        return mo25151d(mo46858k("link_id"));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ExternalApplicationLink)) {
            return false;
        }
        if (this != obj) {
            return ExternalApplicationLinkEntity.m92058a(this, (ExternalApplicationLink) obj);
        }
        return true;
    }

    public final int hashCode() {
        return ExternalApplicationLinkEntity.m92057a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aoto.m69506a(new ExternalApplicationLinkEntity(this), parcel);
    }
}
