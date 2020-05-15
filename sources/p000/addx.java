package p000;

import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;

/* renamed from: addx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class addx extends adzt {

    /* renamed from: a */
    final /* synthetic */ addz f61463a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public addx(addz addz, Looper looper) {
        super(looper);
        this.f61463a = addz;
    }

    public final void handleMessage(Message message) {
        addz addz = this.f61463a;
        if (message == null) {
            return;
        }
        if (message.obj instanceof Intent) {
            Intent intent = (Intent) message.obj;
            intent.setExtrasClassLoader(MessengerCompat.class.getClassLoader());
            if (intent.hasExtra("google.messenger")) {
                Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                if (parcelableExtra instanceof MessengerCompat) {
                    addz.f61473i = (MessengerCompat) parcelableExtra;
                }
                if (parcelableExtra instanceof Messenger) {
                    addz.f61472h = (Messenger) parcelableExtra;
                }
            }
            addz.mo33376b((Intent) message.obj);
            return;
        }
        Log.w("InstanceID", "Dropping invalid message");
    }
}
