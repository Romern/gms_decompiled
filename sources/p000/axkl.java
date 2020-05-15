package p000;

import android.widget.Toast;
import com.google.android.gms.walletp2p.feature.transfer.TransferMoneyChimeraActivity;
import java.io.UnsupportedEncodingException;

/* renamed from: axkl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axkl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean[] f96079a;

    /* renamed from: b */
    final /* synthetic */ TransferMoneyChimeraActivity f96080b;

    public axkl(TransferMoneyChimeraActivity transferMoneyChimeraActivity, boolean[] zArr) {
        this.f96080b = transferMoneyChimeraActivity;
        this.f96079a = zArr;
    }

    public final void run() {
        if (!this.f96080b.isDestroyed() && this.f96079a[0]) {
            try {
                Toast.makeText(this.f96080b, new String(sqd.m35966a("TWFkZSB3aXRoIGxvdmUgaW4gU0ZPIGJ5IHRoZSBHTW9uZXkgVGVhbSE="), "UTF-8"), 0).show();
            } catch (UnsupportedEncodingException e) {
            }
            this.f96079a[0] = false;
        }
    }
}
