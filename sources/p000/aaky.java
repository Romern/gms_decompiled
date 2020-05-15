package p000;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: aaky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aaky extends adzt {

    /* renamed from: a */
    final /* synthetic */ aakz f28395a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aaky(aakz aakz, Looper looper) {
        super(looper);
        this.f28395a = aakz;
    }

    public final void handleMessage(Message message) {
        Handler handler;
        if (message == null || !(message.obj instanceof Intent)) {
            Log.w("GCM", "Dropping invalid message");
        }
        Intent intent = (Intent) message.obj;
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(intent.getAction())) {
            aakz aakz = this.f28395a;
            aakz aakz2 = aakz.f28396a;
            aakz.f28400e.add(intent);
            return;
        }
        aakz aakz3 = this.f28395a;
        aakz aakz4 = aakz.f28396a;
        String stringExtra = intent.getStringExtra("In-Reply-To");
        if (stringExtra == null && intent.hasExtra("error")) {
            stringExtra = intent.getStringExtra("google.message_id");
        }
        if (!(stringExtra == null || (handler = (Handler) aakz3.f28399c.remove(stringExtra)) == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            if (handler.sendMessage(obtain)) {
                return;
            }
        }
        intent.setPackage(this.f28395a.f28398b.getPackageName());
        this.f28395a.f28398b.sendBroadcast(intent);
    }
}
