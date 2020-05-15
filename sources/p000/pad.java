package p000;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: pad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pad extends aeaa {

    /* renamed from: a */
    public final pal f38693a = new pal(this.f38703k);

    /* renamed from: b */
    public final pah f38694b = new pah(this.f38703k);

    /* renamed from: c */
    public final long f38695c;

    /* renamed from: d */
    public final ComponentName f38696d;

    /* renamed from: e */
    public final oha f38697e;

    /* renamed from: f */
    public final List f38698f = new ArrayList();

    /* renamed from: g */
    public final oml f38699g;

    /* renamed from: h */
    public ParcelFileDescriptor f38700h;

    /* renamed from: i */
    public ojq f38701i;

    /* renamed from: j */
    public omi f38702j;

    /* renamed from: k */
    final /* synthetic */ pam f38703k;

    /* renamed from: l */
    public int f38704l = 3;

    /* renamed from: m */
    public omm f38705m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pad(pam pam, long j, ComponentName componentName, oha oha, oml oml) {
        super("car");
        this.f38703k = pam;
        this.f38695c = j;
        this.f38696d = componentName;
        this.f38697e = oha;
        this.f38699g = oml;
    }

    /* renamed from: a */
    public final void mo22824a() {
        int i;
        bnsn bnsn = pam.f38717a;
        Intent intent = new Intent();
        intent.setComponent(this.f38696d);
        if (ccsq.m131457b()) {
            int i2 = Build.VERSION.SDK_INT;
            i = 4161;
        } else {
            i = 65;
        }
        if (this.f38703k.f38718b.bindService(intent, this, i)) {
            this.f38704l = 1;
        }
        if (this.f38704l != 1) {
            this.f38703k.f38724h.mo21364a();
        }
    }

    /* renamed from: c */
    public final void mo22830c() {
        bnsi d = pam.f38717a.mo68390d();
        d.mo68432a("pad", "c", 340, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Tearing down connection");
        if (this.f38704l == 1) {
            this.f38704l = 2;
            try {
                this.f38705m.mo22304b(this.f38695c);
            } catch (RemoteException e) {
                bnsi d2 = pam.f38717a.mo68390d();
                d2.mo68437a(e);
                d2.mo68432a("pad", "c", 346, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d2.mo68420a("Couldn't stop %s, but it could be fine.", this.f38696d);
            }
        }
        if (this.f38704l == 2) {
            this.f38704l = 3;
            this.f38703k.f38718b.unbindService(this);
        }
    }

    /* renamed from: b */
    public final void mo22828b() {
        try {
            this.f38705m.mo22300a(this.f38695c, this.f38693a);
        } catch (RemoteException e) {
            bnsi b = pam.f38717a.mo68387b();
            b.mo68437a(e);
            b.mo68432a("pad", "b", 286, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Should never get a RemoteException when resuming a connection.");
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public final void mo22829b(List list, List list2) {
        bnsi d = pam.f38717a.mo68390d();
        d.mo68432a("pad", "b", 379, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Connection start additional services in conman");
        try {
            bngs j = bngx.m109377j();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                j.mo67668c(Integer.valueOf(((oer) it.next()).mo3214a()));
            }
            this.f38705m.mo22299a(this.f38695c, list, j.mo67664a(), this.f38694b);
        } catch (RemoteException e) {
            bnsi d2 = pam.f38717a.mo68390d();
            d2.mo68437a(e);
            d2.mo68432a("pad", "b", 388, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68405a("Start additional services had exception.");
            pam pam = this.f38703k;
            Handler handler = pam.f38720d;
            nov nov = pam.f38724h;
            nov.getClass();
            handler.post(new pab(nov));
        }
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        pam pam = this.f38703k;
        bnsn bnsn = pam.f38717a;
        pam.f38719c.post(new ozx(this));
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        pam pam = this.f38703k;
        bnsn bnsn = pam.f38717a;
        pam.f38719c.post(new ozw(this, iBinder));
    }

    /* renamed from: a */
    public final void mo22825a(bipi bipi) {
        try {
            this.f38705m.mo22294a(this.f38695c, bipi.f121169f);
        } catch (RemoteException e) {
            bnsi d = pam.f38717a.mo68390d();
            d.mo68437a(e);
            d.mo68432a("pad", "a", 333, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68420a("Couldn't send bye-bye request to %s, but it could be fine.", this.f38696d);
        }
    }

    /* renamed from: a */
    public final void mo22826a(List list, List list2) {
        bnsi d = pam.f38717a.mo68390d();
        d.mo68432a("pad", "a", 359, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Connection start services in conman");
        try {
            ParcelFileDescriptor[] createReliableSocketPair = ParcelFileDescriptor.createReliableSocketPair();
            ParcelFileDescriptor parcelFileDescriptor = createReliableSocketPair[0];
            this.f38700h = parcelFileDescriptor;
            this.f38701i.f37794d.f37598v.mo22256a(parcelFileDescriptor);
            ArrayList arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((oer) it.next()).mo3214a()));
            }
            this.f38705m.mo22298a(this.f38695c, list, arrayList, createReliableSocketPair[1], this.f38694b);
        } catch (RemoteException | IOException | IllegalArgumentException e) {
            bnsi d2 = pam.f38717a.mo68390d();
            d2.mo68437a(e);
            d2.mo68432a("pad", "a", 371, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68405a("Start required services had exception");
            this.f38703k.f38720d.post(new paa(this));
        }
    }

    /* renamed from: a */
    public final void mo22827a(boolean z, List list) {
        bnsn bnsn = pam.f38717a;
        if (z) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    List list2 = this.f38698f;
                    bxus c = bxus.m123744c();
                    list2.add((bivb) bxvk.m124016a(bivb.f121921l, (byte[]) it.next(), c));
                }
                if (this.f38699g != null) {
                    try {
                        bnsi d = pam.f38717a.mo68390d();
                        d.mo68432a("pad", "a", 303, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        d.mo68405a("Fetching sensor service proxy from Gearhead.");
                        this.f38702j = this.f38705m.mo22293a(this.f38699g);
                        bnsi d2 = pam.f38717a.mo68390d();
                        d2.mo68432a("pad", "a", 305, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        d2.mo68420a("Sensor service proxy: %s", this.f38702j);
                    } catch (RemoteException e) {
                        bnsi c2 = pam.f38717a.mo68388c();
                        c2.mo68437a(e);
                        c2.mo68432a("pad", "a", 308, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c2.mo68405a("Proxy sensors not available");
                    }
                }
                list.size();
                this.f38703k.f38720d.post(new ozy(this));
                return;
            } catch (bxwf e2) {
            }
        }
        pam pam = this.f38703k;
        Handler handler = pam.f38720d;
        nov nov = pam.f38724h;
        nov.getClass();
        handler.post(new ozz(nov));
    }
}
