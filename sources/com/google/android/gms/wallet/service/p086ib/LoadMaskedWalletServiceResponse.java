package com.google.android.gms.wallet.service.p086ib;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.p081ib.LaunchPendingIntentChimeraActivity;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* renamed from: com.google.android.gms.wallet.service.ib.LoadMaskedWalletServiceResponse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LoadMaskedWalletServiceResponse implements Parcelable, awyg {
    public static final Parcelable.Creator CREATOR = new awsi();

    /* renamed from: a */
    public final Bundle f110353a;

    /* renamed from: b */
    public final MaskedWallet f110354b;

    /* renamed from: c */
    public final int f110355c;

    public LoadMaskedWalletServiceResponse(Bundle bundle, MaskedWallet maskedWallet, int i) {
        this.f110353a = bundle;
        this.f110354b = maskedWallet;
        this.f110355c = i;
    }

    /* renamed from: a */
    public static LoadMaskedWalletServiceResponse m94141a(Context context, BuyFlowConfig buyFlowConfig, String str, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        if (awrt.m80849a(buyFlowConfig)) {
            bundle.putParcelable("com.google.android.gms.wallet.INTENT", LaunchPendingIntentChimeraActivity.m93989a(context, buyFlowConfig, str, pendingIntent));
        } else {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT", pendingIntent);
        }
        return new LoadMaskedWalletServiceResponse(bundle, null, 6);
    }

    /* renamed from: a */
    public final boolean mo52756a() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f110353a, i);
        parcel.writeParcelable(this.f110354b, i);
        parcel.writeInt(this.f110355c);
    }
}
