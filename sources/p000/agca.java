package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.mdns.MdnsServiceInfo;
import java.util.List;

/* renamed from: agca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agca extends dcj implements agcc {
    public agca(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mdns.internal.IMdnsServiceBrowserListener");
    }

    /* renamed from: a */
    public final void mo35214a() {
        mo8530c(5, mo8529bj());
    }

    /* renamed from: b */
    public final void mo35220b(MdnsServiceInfo mdnsServiceInfo) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, mdnsServiceInfo);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo35215a(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8530c(4, bj);
    }

    /* renamed from: a */
    public final void mo35216a(int i, int i2) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        bj.writeInt(i2);
        mo8530c(7, bj);
    }

    /* renamed from: a */
    public final void mo35217a(MdnsServiceInfo mdnsServiceInfo) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, mdnsServiceInfo);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo35218a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo35219a(List list, int i) {
        Parcel bj = mo8529bj();
        bj.writeStringList(list);
        bj.writeInt(i);
        mo8530c(6, bj);
    }
}
