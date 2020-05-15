package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ocr.CreditCardOcrResult;

/* renamed from: akpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akpe extends dcj implements akpg {
    public akpe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ocr.ICreditCardOcrFragmentCallback");
    }

    /* renamed from: a */
    public final void mo39642a(CreditCardOcrResult creditCardOcrResult, int i, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, creditCardOcrResult);
        bj.writeInt(i);
        dcl.m8165a(bj, bundle);
        mo8528b(1, bj);
    }
}
