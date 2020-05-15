package p000;

import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: ayav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayav extends adzt {

    /* renamed from: a */
    final /* synthetic */ ayaw f96987a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayav(ayaw ayaw, Looper looper) {
        super(looper);
        this.f96987a = ayaw;
    }

    public final void handleMessage(Message message) {
        ayaw.m83718a("Checking if write is stuck.");
        ayas ayas = (ayas) message.obj;
        if (ayas.mo53845a()) {
            Intent intent = new Intent();
            intent.setAction("com.google.android.gms.wearable.ACTION_WRITE_STUCK");
            this.f96987a.f96989b.sendBroadcast(intent);
            axty.m83201a(6);
            axty.m83204a(6, ayha.m84001g(), ayas.f96964b.mo60245a());
            this.f96987a.f96995h.mo24359a();
            long id = ayas.f96963a.getId();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Write is stuck. Killing thread: ");
            sb.append(id);
            Log.w("Wear_Transport", sb.toString());
            ayas.mo53842a("stuck while writing");
            ayas.f96963a.interrupt();
            return;
        }
        ayaw.m83718a("Write is not stuck. No action needed.");
    }
}
