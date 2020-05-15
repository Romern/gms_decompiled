package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OrchestrationApiEvent extends WalletAnalyticsEvent implements awqn {
    public static final Parcelable.Creator CREATOR = new awde();

    /* renamed from: a */
    public int f109958a = 1;

    /* renamed from: b */
    private String f109959b;

    /* renamed from: c */
    private long f109960c;

    /* renamed from: d */
    private byte[] f109961d;

    public OrchestrationApiEvent(Parcel parcel) {
        super(parcel);
        this.f109958a = bphg.m111927a(parcel.readInt());
        this.f109959b = parcel.readString();
        this.f109960c = parcel.readLong();
        this.f109961d = parcel.createByteArray();
    }

    /* renamed from: a */
    public static void m93817a(Context context, int i, bmaq bmaq, bmav bmav, String str) {
        OrchestrationApiEvent orchestrationApiEvent = new OrchestrationApiEvent(str);
        orchestrationApiEvent.f109958a = i;
        if (bmaq != null) {
            orchestrationApiEvent.f109960c = bmaq.f128482b;
            orchestrationApiEvent.f109961d = bmaq.f128484d.mo73780k();
        }
        if (bmav != null) {
            orchestrationApiEvent.f109959b = bmav.f128506e;
        }
        awqc.m80662a(context, orchestrationApiEvent);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int i2 = this.f109958a;
        int i3 = i2 - 1;
        if (i2 != 0) {
            parcel.writeInt(i3);
            String str = this.f109959b;
            if (str == null) {
                str = "";
            }
            parcel.writeString(str);
            parcel.writeLong(this.f109960c);
            byte[] bArr = this.f109961d;
            if (bArr == null) {
                bArr = new byte[0];
            }
            parcel.writeByteArray(bArr);
            return;
        }
        throw null;
    }

    public OrchestrationApiEvent(String str) {
        this.f110015m = str;
    }

    /* renamed from: a */
    public final void mo52465a(Context context, awqo awqo, bxvd bxvd) {
        bxvd da = bphh.f137646f.mo74144da();
        int i = this.f109958a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bphh bphh = (bphh) da.f164949b;
        int i2 = i - 1;
        if (i != 0) {
            bphh.f137649b = i2;
            int i3 = bphh.f137648a | 1;
            bphh.f137648a = i3;
            long j = this.f109960c;
            int i4 = i3 | 4;
            bphh.f137648a = i4;
            bphh.f137651d = j;
            String str = this.f109959b;
            if (str != null) {
                str.getClass();
                bphh.f137648a = i4 | 2;
                bphh.f137650c = str;
            }
            byte[] bArr = this.f109961d;
            if (bArr != null) {
                bxtx a = bxtx.m123261a(bArr);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bphh bphh2 = (bphh) da.f164949b;
                a.getClass();
                bphh2.f137648a |= 8;
                bphh2.f137652e = a;
            }
            awqo.f94859a.add((bphh) da.mo74062i());
            return;
        }
        throw null;
    }
}
