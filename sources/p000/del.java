package p000;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.chimera.IntentService;

/* renamed from: del */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class del extends Handler {

    /* renamed from: a */
    final /* synthetic */ IntentService f12978a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public del(IntentService intentService, Looper looper) {
        super(looper);
        this.f12978a = intentService;
    }

    public final void handleMessage(Message message) {
        this.f12978a.onHandleIntent((Intent) message.obj);
        this.f12978a.stopSelf(message.arg1);
    }
}
