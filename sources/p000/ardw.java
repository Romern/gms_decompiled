package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.smartdevice.d2d.TargetAccountImportController$ImportReceiver;

/* renamed from: ardw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ardw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Intent f87476a;

    /* renamed from: b */
    final /* synthetic */ TargetAccountImportController$ImportReceiver f87477b;

    public ardw(TargetAccountImportController$ImportReceiver targetAccountImportController$ImportReceiver, Intent intent) {
        this.f87477b = targetAccountImportController$ImportReceiver;
        this.f87476a = intent;
    }

    public final void run() {
        ardy ardy = this.f87477b.f107935a;
        Bundle extras = this.f87476a.getExtras();
        sek sek = ardy.f87480a;
        ardy.f87483d.mo48458a(extras.getString("restoreAccount"), extras.getString("restoreToken"));
        ResultReceiver resultReceiver = (ResultReceiver) extras.getParcelable("resultReceiver");
        if (resultReceiver == null) {
            ardy.f87480a.mo25418e("ResultReceiver was null", new Object[0]);
        } else {
            resultReceiver.send(0, null);
        }
    }
}
