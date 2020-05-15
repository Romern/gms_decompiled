package p000;

import android.net.Uri;
import android.text.TextUtils;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: azdw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azdw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ azda f99125a;

    /* renamed from: b */
    final /* synthetic */ azdx f99126b;

    public azdw(azdx azdx, azda azda) {
        this.f99126b = azdx;
        this.f99125a = azda;
    }

    public final void run() {
        boolean z;
        String str;
        azdx azdx = this.f99126b;
        azda azda = this.f99125a;
        if (azda == null || TextUtils.isEmpty(azda.f99026d) || azda.f99021c != 2) {
            z = false;
        } else {
            z = true;
        }
        if (azda != null && !TextUtils.isEmpty(azda.f99026d)) {
            azeb azeb = azdx.f99128b;
            Uri uri = azeb.f99133a;
            if (azeb.f99142g.containsKey(azda.f99026d)) {
                azdx.f99128b.f99142g.remove(azda.f99026d);
            }
        }
        if (azdx.f99128b.f99140e.containsKey(Long.valueOf(azdx.f99127a))) {
            azea azea = (azea) azdx.f99128b.f99140e.get(Long.valueOf(azdx.f99127a));
            if (azda != null) {
                str = azda.f99026d;
            } else {
                str = null;
            }
            if (!z) {
                new Object[1][0] = Long.valueOf(azdx.f99127a);
                azea.mo54817d();
                azeb azeb2 = azdx.f99128b;
                Uri uri2 = azeb.f99133a;
                azph.m85998a(azeb2.f99137b).mo55131a((int) ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, 3, str, (aznz) null);
            } else {
                new Object[1][0] = Long.valueOf(azdx.f99127a);
                azea.mo54816a(azda);
                azeb azeb3 = azdx.f99128b;
                Uri uri3 = azeb.f99133a;
                azph.m85998a(azeb3.f99137b).mo55131a(102, 3, str, (aznz) null);
            }
            azeb azeb4 = azdx.f99128b;
            azeb4.f99140e.remove(Long.valueOf(azdx.f99127a));
            if (azeb4.f99140e.isEmpty()) {
                azeb4.f99137b.getContentResolver().unregisterContentObserver(azeb4.f99143h);
                return;
            }
            return;
        }
        new Object[1][0] = Long.valueOf(azdx.f99127a);
    }
}
