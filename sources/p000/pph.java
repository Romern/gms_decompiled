package p000;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;

/* renamed from: pph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pph implements ppd {

    /* renamed from: a */
    private final C0953ec f40015a;

    /* renamed from: b */
    private final C0942ds f40016b;

    /* renamed from: c */
    private final C0958eh f40017c;

    public pph(C0953ec ecVar) {
        this.f40015a = ecVar;
        this.f40016b = new ppe(ecVar);
        new ppf(ecVar);
        this.f40017c = new ppg(ecVar);
    }

    /* renamed from: a */
    public final List mo23530a() {
        int i;
        boolean z;
        C0956ef a = C0956ef.m10280a("SELECT * FROM cloud_device_info", 0);
        this.f40015a.mo9943e();
        Cursor a2 = this.f40015a.mo9937a(a);
        try {
            int a3 = C0962el.m10613a(a2, "cloud_device_id");
            int a4 = C0962el.m10613a(a2, "device_type");
            int a5 = C0962el.m10613a(a2, "friendly_name");
            int a6 = C0962el.m10613a(a2, "device_ssid_suffix");
            int a7 = C0962el.m10613a(a2, "capabilities");
            int a8 = C0962el.m10613a(a2, "truncated_lnid");
            int a9 = C0962el.m10613a(a2, "last_updated_timestamp_ms");
            int a10 = C0962el.m10613a(a2, "ipv4_fragment");
            int a11 = C0962el.m10613a(a2, "is_last_seen_online");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                ppc ppc = new ppc(a2.getString(a3));
                ppc.f40007c = a2.getString(a4);
                ppc.f40008d = a2.getString(a5);
                ppc.f40009e = a2.getString(a6);
                byte[] blob = a2.getBlob(a7);
                ppb[] values = ppb.values();
                int i2 = a3;
                EnumSet noneOf = EnumSet.noneOf(ppb.class);
                int i3 = 0;
                while (true) {
                    i = a4;
                    if (i3 >= (blob.length << 3)) {
                        break;
                    }
                    if ((blob[qax.m31775a(i3)] & (1 << qax.m31776b(i3))) != 0) {
                        if (i3 < values.length) {
                            noneOf.add(values[i3]);
                        }
                    }
                    i3++;
                    a4 = i;
                }
                ppc.f40010f = noneOf;
                ppc.f40011g = a2.getString(a8);
                ppc.f40012h = a2.getLong(a9);
                ppc.f40013i = a2.getInt(a10);
                if (a2.getInt(a11) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                ppc.f40014j = z;
                arrayList.add(ppc);
                a4 = i;
                a3 = i2;
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo10064b();
        }
    }

    /* renamed from: b */
    public final void mo23532b() {
        this.f40015a.mo9943e();
        C0939dp b = this.f40017c.mo10124b();
        this.f40015a.mo9944f();
        try {
            b.mo9363b();
            this.f40015a.mo9946h();
        } finally {
            this.f40015a.mo9945g();
            this.f40017c.mo10123a(b);
        }
    }

    /* renamed from: a */
    public final void mo23531a(Collection collection) {
        this.f40015a.mo9943e();
        this.f40015a.mo9944f();
        try {
            this.f40016b.mo9523a(collection);
            this.f40015a.mo9946h();
        } finally {
            this.f40015a.mo9945g();
        }
    }
}
