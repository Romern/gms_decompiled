package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;

/* renamed from: aalk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aalk extends dck implements aall {

    /* renamed from: a */
    final /* synthetic */ apiz f28408a;

    /* renamed from: b */
    private final apiz f28409b;

    public aalk() {
        super("com.google.android.gms.gcm.IMessengerProxyCallback");
    }

    /* renamed from: a */
    public final void mo16970a() {
        this.f28408a.close();
    }

    /* renamed from: c */
    public final void mo16973c() {
        apiz apiz = this.f28409b;
        int i = apiz.f84506i;
        apiz.mo47327a();
    }

    /* renamed from: d */
    public final void mo16974d() {
        apiz apiz = this.f28409b;
        int i = apiz.f84506i;
        apiz.mo47327a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aalk(apiz apiz, apiz apiz2) {
        super("com.google.android.gms.gcm.IMessengerProxyCallback");
        this.f28408a = apiz;
        this.f28409b = apiz2;
    }

    /* renamed from: a */
    public final void mo16971a(ComponentName componentName) {
        apiz apiz = this.f28409b;
        int i = apiz.f84506i;
        apiz.mo47327a();
    }

    /* renamed from: a */
    public final void mo16972a(ComponentName componentName, aali aali) {
        synchronized (this.f28408a.f84514h.f84522a) {
            this.f28409b.mo47328a(aali);
        }
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        aali aali;
        switch (i) {
            case 1:
                mo16970a();
                return true;
            case 2:
                mo16973c();
                return true;
            case 3:
                mo16971a((ComponentName) dcl.m8163a(parcel, ComponentName.CREATOR));
                return true;
            case 4:
                mo16974d();
                return true;
            case 5:
                this.f28408a.close();
                return true;
            case 6:
                ComponentName componentName = (ComponentName) dcl.m8163a(parcel, ComponentName.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.gcm.IMessengerConnection");
                    aali = queryLocalInterface instanceof aali ? (aali) queryLocalInterface : new aalg(readStrongBinder);
                } else {
                    aali = null;
                }
                mo16972a(componentName, aali);
                return true;
            case 7:
                this.f28409b.handleMessage((Message) dcl.m8163a(parcel, Message.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
