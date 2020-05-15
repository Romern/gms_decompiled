package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bfwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfwj extends squ {

    /* renamed from: a */
    static final String[] f115501a = {"android:monitor_location"};

    /* renamed from: b */
    public boolean f115502b = false;

    /* renamed from: g */
    public final bfwe f115503g;

    /* renamed from: h */
    public final bfwh f115504h;

    /* renamed from: i */
    public final bfww f115505i;

    /* renamed from: j */
    public final C1223np f115506j = new C1223np();

    /* renamed from: k */
    private final bfwi f115507k;

    /* renamed from: l */
    private final Context f115508l;

    /* renamed from: m */
    private final ArrayList f115509m = new ArrayList();

    public bfwj(Context context, Handler handler, bfwi bfwi, bfwh bfwh, bfww bfww) {
        super(f115501a, context, handler);
        this.f115503g = new bfwp(bfww);
        this.f115507k = bfwi;
        this.f115508l = context;
        this.f115504h = bfwh;
        this.f115505i = bfww;
    }

    /* renamed from: a */
    public final bfwn mo62369a(bfwk bfwk) {
        bfwn bfwn = (bfwn) mo25989b(bfwk);
        if (bfwn != null) {
            return bfwn;
        }
        try {
            int i = svr.m36484b(this.f115508l).mo26172a(bfwk.f115510a, 0).uid;
            bfwn bfwn2 = new bfwn(i, bfwk, new ArrayList(), this.f115504h);
            mo25985a(bfwk, bfwn2);
            return bfwn2;
        } catch (PackageManager.NameNotFoundException e) {
            if (!Log.isLoggable("GeofenceStateStore", 6)) {
                return null;
            }
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Package not found: \n");
            sb.append(valueOf);
            bfxc.m98133b("GeofenceStateStore", sb.toString());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo9718b(sqt sqt) {
        bfwn bfwn = (bfwn) sqt;
    }

    /* renamed from: g */
    public final void mo62371g() {
        int i;
        this.f115502b = true;
        for (bfwn bfwn : mo25994e()) {
            bfwn.mo62385b();
        }
        mo25986a();
        ArrayList arrayList = this.f115509m;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            bfwn bfwn2 = (bfwn) arrayList.get(i2);
            mo25985a(bfwn2.f115518b, bfwn2);
            ArrayList arrayList2 = bfwn2.f115519c;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (true) {
                i = i2 + 1;
                if (i3 >= size2) {
                    break;
                }
                bfwf bfwf = (bfwf) arrayList2.get(i3);
                bfwn2.f115517a.mo62368a(bfwf.f115492j, bfwf);
                i3++;
            }
            i2 = i;
        }
        this.f115509m.clear();
        this.f115502b = false;
        mo9714a(1);
    }

    /* renamed from: h */
    public final void mo62372h() {
        this.f115509m.clear();
    }

    /* renamed from: i */
    public final void mo62373i() {
        for (bfwn bfwn : mo25994e()) {
            this.f115509m.add(bfwn.clone());
        }
    }

    /* renamed from: j */
    public final int mo62374j() {
        int i = 0;
        for (bfwn bfwn : mo25992c()) {
            i += bfwn.mo62380a();
        }
        return i;
    }

    /* renamed from: a */
    public final List mo62370a(bfwk bfwk, List list) {
        this.f115502b = true;
        bfwn bfwn = (bfwn) mo25989b(bfwk);
        List list2 = null;
        if (!(bfwn == null || list == null || list.size() <= 0)) {
            list2 = bfwn.mo62382a(list);
            if (bfwn.mo62380a() == 0) {
                mo25984a((Object) bfwk);
            }
        }
        this.f115502b = false;
        if (list2 != null && !list2.isEmpty()) {
            mo9714a(2);
        }
        return list2;
    }

    /* renamed from: a */
    public final void mo9714a(int i) {
        if (!this.f115502b) {
            if ((i & 2) != 0) {
                this.f115503g.mo62342a(mo25992c(), mo62374j());
            }
            bgan bgan = (bgan) this.f115507k;
            bgan.mo62546b(Message.obtain(bgan.f115905K, 16, i & 1, 0));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9717a(sqt sqt) {
        bfwn bfwn = (bfwn) sqt;
    }
}
