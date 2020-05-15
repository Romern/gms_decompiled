package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ChannelEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axqf();

    /* renamed from: a */
    public final ChannelImpl f110902a;

    /* renamed from: b */
    final int f110903b;

    /* renamed from: c */
    final int f110904c;

    /* renamed from: d */
    final int f110905d;

    public ChannelEventParcelable(ChannelImpl channelImpl, int i, int i2, int i3) {
        this.f110902a = channelImpl;
        this.f110903b = i;
        this.f110904c = i2;
        this.f110905d = i3;
    }

    /* renamed from: a */
    public final void mo60269a(axok axok) {
        int i = this.f110903b;
        if (i == 1) {
            axok.mo53308a(this.f110902a);
        } else if (i == 2) {
            axok.mo53309b(this.f110902a);
        } else if (i == 3) {
            axok.mo53310c(this.f110902a);
        } else if (i != 4) {
            StringBuilder sb = new StringBuilder(25);
            sb.append("Unknown type: ");
            sb.append(i);
            Log.w("ChannelEventParcelable", sb.toString());
        } else {
            axok.mo53311d(this.f110902a);
        }
    }

    public final String toString() {
        String str;
        String str2;
        String valueOf = String.valueOf(this.f110902a);
        int i = this.f110903b;
        if (i != 1) {
            str = i != 2 ? i != 3 ? i != 4 ? Integer.toString(i) : "OUTPUT_CLOSED" : "INPUT_CLOSED" : "CHANNEL_CLOSED";
        } else {
            str = "CHANNEL_OPENED";
        }
        int i2 = this.f110904c;
        if (i2 != 0) {
            str2 = i2 != 1 ? i2 != 2 ? i2 != 3 ? Integer.toString(i2) : "CLOSE_REASON_LOCAL_CLOSE" : "CLOSE_REASON_REMOTE_CLOSE" : "CLOSE_REASON_DISCONNECTED";
        } else {
            str2 = "CLOSE_REASON_NORMAL";
        }
        int i3 = this.f110905d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append("ChannelEventParcelable[, channel=");
        sb.append(valueOf);
        sb.append(", type=");
        sb.append(str);
        sb.append(", closeReason=");
        sb.append(str2);
        sb.append(", appErrorCode=");
        sb.append(i3);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f110902a, i, false);
        see.m35063b(parcel, 3, this.f110903b);
        see.m35063b(parcel, 4, this.f110904c);
        see.m35063b(parcel, 5, this.f110905d);
        see.m35062b(parcel, a);
    }
}
