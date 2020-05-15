package p000;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: sd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1346sd extends Handler {

    /* renamed from: a */
    private final WeakReference f26986a;

    public C1346sd(DialogInterface dialogInterface) {
        this.f26986a = new WeakReference(dialogInterface);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == -3 || i == -2 || i == -1) {
            ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f26986a.get(), message.what);
        } else if (i == 1) {
            ((DialogInterface) message.obj).dismiss();
        }
    }
}
