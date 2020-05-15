package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.gcm.GcmProxyIntentOperation;

/* renamed from: aalq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aalq extends adzt {

    /* renamed from: a */
    final /* synthetic */ aalt f28411a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aalq(aalt aalt, Looper looper) {
        super(looper);
        this.f28411a = aalt;
    }

    public final void handleMessage(Message message) {
        boolean z;
        aalt aalt = this.f28411a;
        int i = message.sendingUid;
        if (message.what == 0) {
            if (message.what == 0) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34974b(z);
            if (!(message.obj instanceof Intent)) {
                Log.w("GCM", "Legacy message object not an intent");
                message = null;
            } else {
                Intent intent = (Intent) message.obj;
                Message obtain = Message.obtain();
                obtain.what = message.what;
                obtain.arg1 = 0;
                obtain.replyTo = aara.m21849b(intent);
                Bundle bundle = new Bundle();
                bundle.putBoolean("oneWay", false);
                bundle.putString("pkg", aara.m21846a(intent));
                bundle.putBundle("data", intent.getExtras());
                obtain.setData(bundle);
                message = obtain;
            }
            if (message == null) {
                return;
            }
        }
        String string = message.getData().getString("pkg");
        if (TextUtils.isEmpty(string)) {
            Log.w("GCM", "Invalid request, missing package name");
        } else if (!svr.m36484b(rpr.m34216b()).mo26174a(i, string)) {
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 28);
            sb.append("Invalid caller: ");
            sb.append(string);
            sb.append(" ");
            sb.append(i);
            Log.w("GCM", sb.toString());
        } else if (aajg.m21344d() == 0) {
            aalt.mo16979a(message, 0);
        } else {
            Intent intent2 = new Intent("com.google.android.gms.gcm.MESSENGER_IPC_USER_FORWARD");
            intent2.putExtra("msg", message);
            GcmProxyIntentOperation.m24313a(rpr.m34216b(), intent2);
        }
    }
}
