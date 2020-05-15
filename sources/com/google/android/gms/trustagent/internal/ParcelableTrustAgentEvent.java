package com.google.android.gms.trustagent.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ParcelableTrustAgentEvent implements Parcelable {
    public static final Parcelable.Creator CREATOR = new auqx();

    /* renamed from: a */
    private bogj f109162a;

    /* renamed from: b */
    private byte[] f109163b;

    public ParcelableTrustAgentEvent(Parcel parcel) {
        parcel.readString();
        this.f109163b = parcel.createByteArray();
    }

    /* renamed from: a */
    public final bogj mo59554a() {
        if (this.f109162a == null && this.f109163b != null) {
            try {
                bogj bogj = (bogj) bohi.f133070z.mo74144da();
                bogj.mo73635b(this.f109163b, bxus.m123744c());
                this.f109162a = bogj;
                this.f109163b = null;
            } catch (bxwf e) {
                throw new IllegalStateException(e);
            }
        }
        return this.f109162a;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString("com.google.common.logging.nano.AndroidAuthLogsProto.TrustAgentEvent");
        parcel.writeByteArray(((bohi) this.f109162a.mo74062i()).mo73642k());
    }

    public ParcelableTrustAgentEvent(bogj bogj) {
        this.f109162a = bogj;
    }
}
