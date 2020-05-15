package p000;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;

/* renamed from: aalh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aalh extends dck implements aali {

    /* renamed from: a */
    private final Messenger f28406a;

    /* renamed from: b */
    private final apim f28407b;

    public aalh() {
        super("com.google.android.gms.gcm.IMessengerConnection");
    }

    /* renamed from: a */
    public final void mo16968a() {
        this.f28407b.close();
    }

    /* renamed from: a */
    public final void mo16969a(Message message) {
        this.f28406a.send(message);
    }

    public aalh(IBinder iBinder, apim apim) {
        super("com.google.android.gms.gcm.IMessengerConnection");
        this.f28406a = new Messenger(iBinder);
        this.f28407b = apim;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo16969a((Message) dcl.m8163a(parcel, Message.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo16968a();
        }
        return true;
    }
}
