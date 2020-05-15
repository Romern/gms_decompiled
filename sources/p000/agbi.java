package p000;

import android.os.RemoteException;
import com.google.android.gms.mdns.MdnsOptions;
import com.google.android.gms.mdns.MdnsSearchOptions;

/* renamed from: agbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agbi extends agby implements aaai {

    /* renamed from: a */
    public static final agcm f65125a = new agcm("MdnsServiceStub");

    /* renamed from: b */
    public final String f65126b;

    /* renamed from: c */
    public final agak f65127c;

    /* renamed from: d */
    public final aaag f65128d;

    public agbi(MdnsOptions mdnsOptions, agak agak, aaag aaag) {
        this.f65126b = mdnsOptions.f80067a;
        this.f65127c = agak;
        this.f65128d = aaag;
    }

    /* renamed from: a */
    public final void mo35186a(agcc agcc) {
        if (agcc != null) {
            try {
                new agbh(this, agcc).binderDied();
            } catch (RemoteException e) {
            }
        }
    }

    /* renamed from: a */
    public final void mo35187a(agcc agcc, MdnsSearchOptions mdnsSearchOptions) {
        if (agcc != null && mdnsSearchOptions != null) {
            try {
                this.f65128d.mo16658a(new agbe(this, "startOrUpdateSearch", new agbh(this, agcc), mdnsSearchOptions));
            } catch (RemoteException e) {
            }
        }
    }
}
