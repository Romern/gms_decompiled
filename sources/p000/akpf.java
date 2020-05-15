package p000;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ocr.CreditCardOcrResult;

/* renamed from: akpf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class akpf extends dck implements akpg {
    public akpf() {
        super("com.google.android.gms.ocr.ICreditCardOcrFragmentCallback");
    }

    /* renamed from: a */
    public void mo39642a(CreditCardOcrResult creditCardOcrResult, int i, Bundle bundle) {
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo39642a((CreditCardOcrResult) dcl.m8163a(parcel, CreditCardOcrResult.CREATOR), parcel.readInt(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
