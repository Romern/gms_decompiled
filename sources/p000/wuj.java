package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.fastpair.slice.ServiceBindHelper$1;
import com.google.location.nearby.common.fastpair.slice.DeviceDetailsLinks;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: wuj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wuj {

    /* renamed from: g */
    private static final bngx f51363g = bngx.m109357a("device_status_list_item", "pair_header_suggestion");

    /* renamed from: h */
    private static final bngx f51364h = bngx.m109357a("links", "ota_contextual_cards");

    /* renamed from: a */
    public final buqh f51365a;

    /* renamed from: b */
    public final Map f51366b = new HashMap();

    /* renamed from: c */
    private burf f51367c;

    /* renamed from: d */
    private burc f51368d;

    /* renamed from: e */
    private final Context f51369e;

    /* renamed from: f */
    private final bure f51370f;

    /* renamed from: i */
    private boolean f51371i;

    /* renamed from: j */
    private boolean f51372j;

    /* renamed from: k */
    private final BroadcastReceiver f51373k = new ServiceBindHelper$1("nearby");

    public wuj(Context context, buqh buqh, bure bure) {
        this.f51369e = context;
        this.f51365a = buqh;
        this.f51370f = bure;
    }

    /* renamed from: a */
    private final synchronized boolean m42290a(List list) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            i++;
            if (this.f51366b.containsKey((String) list.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized bqgg mo29417b() {
        burc burc = this.f51368d;
        if (burc == null) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
            bnsl.mo68432a("wuj", "b", 278, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("ServiceBindHelper.getFirmwareUpdatableItems failed due to no service connection.");
            return null;
        }
        long x = cfog.m141296x();
        bqgy c = bqgy.m112818c();
        bqfb.INSTANCE.execute(new buqz(burc, x, c));
        return c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0086, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo29413a() {
        if (this.f51371i || m42290a(f51363g)) {
            if (this.f51367c == null) {
                this.f51367c = new burf(this.f51369e, "com.google.android.gms.nearby.discovery:ACTION_DEVICES_LIST_SLICE", this.f51370f);
            }
            this.f51367c.mo73028a();
            bnsl bnsl = (bnsl) wtw.f51331a.mo68390d();
            bnsl.mo68432a("wuj", "a", 179, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("ServiceBindHelper: Bind DiscoveryService for pair");
        } else {
            burf burf = this.f51367c;
            if (burf != null) {
                burf.mo73029b();
                bnsl bnsl2 = (bnsl) wtw.f51331a.mo68390d();
                bnsl2.mo68432a("wuj", "a", 184, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("ServiceBindHelper: Unbind DiscoveryService for pair");
            }
        }
        if (!m42290a(f51364h)) {
            burc burc = this.f51368d;
            if (burc != null) {
                burc.mo73025b();
                bnsl bnsl3 = (bnsl) wtw.f51331a.mo68390d();
                bnsl3.mo68432a("wuj", "a", (int) BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("ServiceBindHelper: Unbind DiscoveryChimeraService for battery and device details.");
            }
            if (this.f51372j) {
                this.f51372j = false;
                this.f51369e.unregisterReceiver(this.f51373k);
            }
        } else {
            if (this.f51368d == null) {
                this.f51368d = new burc(this.f51369e, new wui(this));
            }
            this.f51368d.mo73022a();
            if (!this.f51372j) {
                this.f51372j = true;
                IntentFilter intentFilter = new IntentFilter("android.bluetooth.device.action.ACL_CONNECTED");
                intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
                this.f51369e.registerReceiver(this.f51373k, intentFilter);
            }
            bnsl bnsl4 = (bnsl) wtw.f51331a.mo68390d();
            bnsl4.mo68432a("wuj", "a", 208, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("ServiceBindHelper: Bind DiscoveryChimeraService for battery and device details.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized DeviceDetailsLinks mo29418b(String str) {
        burc burc = this.f51368d;
        if (burc == null) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
            bnsl.mo68432a("wuj", "b", 267, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("ServiceBindHelper.getDeviceDetailsLinks failed due to no service connection.");
            return null;
        }
        return burc.mo73020a(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo29419b(Uri uri) {
        if (!mo29416a(uri.getLastPathSegment())) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68390d();
            bnsl.mo68432a("wuj", "b", (int) MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("ServiceBindHelper.onSliceUnpinned, slice not pinned, uri = %s", uri.toString());
            return;
        }
        bnsl bnsl2 = (bnsl) wtw.f51331a.mo68390d();
        bnsl2.mo68432a("wuj", "b", (int) MfiClientException.TYPE_NO_ACCOUNT_INFO, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68420a("ServiceBindHelper.onSliceUnpinned, unpin slice, uri = %s", uri.toString());
        mo29413a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo29420b(boolean z) {
        if (z) {
            bnre i = f51364h.listIterator();
            while (i.hasNext()) {
                wuc.m42263a(this.f51369e, (String) i.next());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29414a(Uri uri) {
        boolean a = mo29416a(uri.getLastPathSegment());
        wuh wuh = new wuh(this, "AutoUnpinRunnable", uri);
        synchronized (this) {
            this.f51366b.put(uri.getLastPathSegment(), wuh);
            this.f51365a.mo72983a(wuh, cfog.f184854a.mo6606a().mo81986aU());
        }
        if (!a) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68390d();
            bnsl.mo68432a("wuj", "a", 146, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("ServiceBindHelper.onSlicePinned, pin slice, uri = %s", uri.toString());
            mo29413a();
            return;
        }
        bnsl bnsl2 = (bnsl) wtw.f51331a.mo68390d();
        bnsl2.mo68432a("wuj", "a", 142, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68420a("ServiceBindHelper.onSlicePinned, slice already pinned, uri = %s", uri.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo29415a(boolean z) {
        if (this.f51371i != z) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68390d();
            bnsl.mo68432a("wuj", "a", 117, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("ServiceBindHelper.setBindServiceForDiscoveryItem, bindServiceForDiscoveryItem = %b", Boolean.valueOf(z));
            this.f51371i = z;
            mo29413a();
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo29416a(String str) {
        boolean z;
        if (this.f51366b.containsKey(str)) {
            this.f51365a.mo72989e((buqn) this.f51366b.get(str));
            this.f51366b.remove(str);
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
