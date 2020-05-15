package p000;

import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: arbl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arbl extends ahin {

    /* renamed from: a */
    final /* synthetic */ arbr f87288a;

    public arbl(arbr arbr) {
        this.f87288a = arbr;
    }

    /* renamed from: a */
    public final void mo20146a(String str) {
        sek sek = arbr.f87299b;
        String valueOf = String.valueOf(str);
        sek.mo25418e(valueOf.length() == 0 ? new String("Nearby.Connections error: lost endpoint with ID ") : "Nearby.Connections error: lost endpoint with ID ".concat(valueOf), new Object[0]);
        arbr arbr = this.f87288a;
        ardt ardt = arbr.f87303f;
        D2DDevice d2DDevice = (D2DDevice) arbr.f87307j.remove(str);
        if (ardt != null && d2DDevice != null) {
            ardt.mo48220b(d2DDevice);
        }
    }

    /* renamed from: a */
    public final void mo20147a(String str, ahij ahij) {
        byte b;
        arbr.f87299b.mo25412b("Found endpoint: %s", str);
        arnt a = arns.m73193a(ahij.f67242b);
        arnq b2 = a.mo48699b();
        int d = b2.mo48695d();
        if (cgql.f187513a.mo6606a().mo84284d()) {
            int i = d - 1;
            if (d != 0) {
                switch (i) {
                    case 2:
                        b = 3;
                        break;
                    case 3:
                        b = 5;
                        break;
                    case 4:
                        b = 4;
                        break;
                    case 5:
                        break;
                    case 6:
                        b = 2;
                        break;
                    case 7:
                        b = 6;
                        break;
                    default:
                        b = 0;
                        break;
                }
                arbr.f87299b.mo25409a("Device name: %s", a.mo48698a());
                arbr.f87299b.mo25409a("Verification style: %s", b2.mo48692a());
                D2DDevice d2DDevice = new D2DDevice(2, a.mo48698a(), str, b, b2.mo48692a().f135131g);
                this.f87288a.f87307j.put(str, d2DDevice);
                bmxy.m108582a(this.f87288a.f87303f, "ScanController is null.");
                this.f87288a.f87303f.mo48219a(d2DDevice);
            }
            throw null;
        }
        b = 1;
        arbr.f87299b.mo25409a("Device name: %s", a.mo48698a());
        arbr.f87299b.mo25409a("Verification style: %s", b2.mo48692a());
        D2DDevice d2DDevice2 = new D2DDevice(2, a.mo48698a(), str, b, b2.mo48692a().f135131g);
        this.f87288a.f87307j.put(str, d2DDevice2);
        bmxy.m108582a(this.f87288a.f87303f, "ScanController is null.");
        this.f87288a.f87303f.mo48219a(d2DDevice2);
    }
}
