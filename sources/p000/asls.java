package p000;

import android.content.Context;
import com.google.android.gms.tapandpay.diagnostics.data.NfcStatusItemLiveData$1;

/* renamed from: asls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asls extends C0034at {
    public asls(C0008af afVar, Context context, atya atya) {
        super(aslx.LOADING);
        aslx aslx;
        if (atya == null) {
            mo2450b(aslx.INCORRECT);
            return;
        }
        if (!atya.mo50312a()) {
            aslx = aslx.INCORRECT;
        } else {
            aslx = aslx.CORRECT;
        }
        mo2450b(aslx);
        afVar.mo557a(new aslr(this, atya, context, new NfcStatusItemLiveData$1(this, "tapandpay")));
    }
}
