package p000;

import android.os.Handler;
import android.os.Message;

/* renamed from: avqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class avqh implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ avqi f93782a;

    public avqh(avqi avqi) {
        this.f93782a = avqi;
    }

    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            avqi.f93783a.mo25416d("Unhandled message: %d.", Integer.valueOf(message.what));
        } else {
            this.f93782a.mo51502a();
        }
        return true;
    }
}
