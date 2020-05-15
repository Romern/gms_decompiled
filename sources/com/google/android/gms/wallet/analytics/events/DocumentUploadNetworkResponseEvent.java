package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DocumentUploadNetworkResponseEvent extends WalletAnalyticsEvent implements awqh {
    public static final Parcelable.Creator CREATOR = new awcv();

    /* renamed from: a */
    public final long f109938a;

    /* renamed from: b */
    public final int f109939b;

    public DocumentUploadNetworkResponseEvent(int i, long j, String str) {
        this.f110015m = str;
        this.f109939b = i;
        this.f109938a = j;
    }

    /* renamed from: a */
    public final void mo52464a(Context context, awqi awqi, bxvd bxvd) {
        long[] b = bjyu.m104931b(Collections.unmodifiableList(((bpht) bxvd.f164949b).f137709f));
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpht bpht = bpht.f137702h;
        ((bpht) bxvd.f164949b).f137709f = GeneratedMessageLite.m124029dd();
        long j = this.f109938a;
        long[] copyOf = b != null ? Arrays.copyOf(b, b.length + 1) : new long[1];
        copyOf[copyOf.length - 1] = j;
        ArrayList a = bjyu.m104929a(copyOf);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpht bpht2 = (bpht) bxvd.f164949b;
        if (!bpht2.f137709f.mo73666a()) {
            bpht2.f137709f = GeneratedMessageLite.m124020a(bpht2.f137709f);
        }
        bxsy.m123078a(a, bpht2.f137709f);
        int i = this.f109939b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpht bpht3 = (bpht) bxvd.f164949b;
        int i2 = i - 1;
        if (i != 0) {
            bpht3.f137710g = i2;
            bpht3.f137704a |= 16;
            return;
        }
        throw null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int i2 = this.f109939b;
        int i3 = i2 - 1;
        if (i2 != 0) {
            parcel.writeInt(i3);
            parcel.writeLong(this.f109938a);
            return;
        }
        throw null;
    }

    public DocumentUploadNetworkResponseEvent(Parcel parcel) {
        super(parcel);
        this.f109939b = awfu.m79872a(parcel.readInt());
        this.f109938a = parcel.readLong();
    }
}
