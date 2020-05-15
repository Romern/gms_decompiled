package p000;

import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;

/* renamed from: bgtg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgtg extends adzt {

    /* renamed from: a */
    public final bgth f117483a;

    public bgtg(bgth bgth, Looper looper) {
        super(looper);
        this.f117483a = bgth;
    }

    /* renamed from: b */
    public static final Parcelable m99902b(Message message) {
        return message.getData().getParcelable("d");
    }

    /* renamed from: a */
    public final void mo63146a(int i) {
        int i2 = bgth.f117484d;
        String str = this.f117483a.f117485a;
        sendMessage(obtainMessage(i));
    }

    public final void handleMessage(Message message) {
        int i = bgth.f117484d;
        String str = this.f117483a.f117485a;
        int i2 = message.what;
        boolean z = false;
        for (bgtf bgtf = this.f117483a.f117487c; bgtf != null && !z; bgtf = bgtf.f117481g) {
            z = bgtf.mo63112a(message);
            String str2 = this.f117483a.f117485a;
            int i3 = message.what;
        }
    }

    /* renamed from: a */
    public final void mo63147a(int i, long j) {
        if (!this.f117483a.f117486b.hasMessages(i)) {
            mo63149a(i, null, j);
        }
    }

    /* renamed from: a */
    public final void mo63148a(int i, Bundle bundle) {
        int i2 = bgth.f117484d;
        String str = this.f117483a.f117485a;
        Message obtainMessage = obtainMessage(i);
        obtainMessage.setData(bundle);
        sendMessage(obtainMessage);
    }

    /* renamed from: a */
    public final void mo63149a(int i, Bundle bundle, long j) {
        int i2 = bgth.f117484d;
        String str = this.f117483a.f117485a;
        Message obtainMessage = obtainMessage(i);
        if (bundle != null) {
            obtainMessage.setData(bundle);
        }
        sendMessageDelayed(obtainMessage, j);
    }
}
