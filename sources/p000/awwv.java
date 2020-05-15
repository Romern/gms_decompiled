package p000;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.wallet.service.p087ow.CreateWalletObjectsServiceRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awwv extends awwz {

    /* renamed from: a */
    private final awwz f95206a;

    /* renamed from: b */
    private final Context f95207b;

    public awwv(Context context, awwz awwz) {
        this.f95207b = context.getApplicationContext();
        this.f95206a = awwz;
    }

    /* renamed from: a */
    public final ServerResponse mo52695a(BuyFlowConfig buyFlowConfig, CreateWalletObjectsServiceRequest createWalletObjectsServiceRequest) {
        return this.f95206a.mo52695a(buyFlowConfig, createWalletObjectsServiceRequest);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        try {
            return super.onTransact(i, parcel, parcel2, i2);
        } catch (Throwable th) {
            awye.m81493a(this.f95207b, th);
            return true;
        }
    }
}
