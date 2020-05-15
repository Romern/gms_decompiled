package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DocumentUploadActivityClosedEvent extends AnalyticsSessionStartEndEvent implements awqh {
    public static final Parcelable.Creator CREATOR = new awct();

    /* renamed from: c */
    public final int f109934c;

    public DocumentUploadActivityClosedEvent(int i, String str) {
        this.f110015m = str;
        this.f109934c = i;
    }

    /* renamed from: a */
    public final void mo52464a(Context context, awqi awqi, bxvd bxvd) {
        if (!awqi.mo52462a()) {
            int i = this.f109934c;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpht bpht = (bpht) bxvd.f164949b;
            int i2 = i - 1;
            bpht bpht2 = bpht.f137702h;
            if (i != 0) {
                bpht.f137710g = i2;
                bpht.f137704a |= 16;
                return;
            }
            throw null;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int i2 = this.f109934c;
        int i3 = i2 - 1;
        if (i2 != 0) {
            parcel.writeInt(i3);
            return;
        }
        throw null;
    }

    public DocumentUploadActivityClosedEvent(Parcel parcel) {
        super(parcel);
        this.f109934c = awfu.m79872a(parcel.readInt());
    }
}
