package p000;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.fido.client.transport.NfcBroadcastReceiver;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;
import com.google.android.gms.fido.fido2.api.view.NfcEnableViewOptions;
import com.google.android.gms.fido.fido2.api.view.NfcViewOptions;
import com.google.android.gms.fido.fido2.api.view.ViewOptions;

/* renamed from: xha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xha extends xhb {

    /* renamed from: a */
    public static final NfcViewOptions f52257a = new NfcViewOptions();

    /* renamed from: b */
    public static final NfcViewOptions f52258b = new NfcViewOptions(true, false);

    /* renamed from: c */
    public static final boolean f52259c = true;

    /* renamed from: d */
    public static final int f52260d = 2;

    /* renamed from: e */
    public final xhi f52261e;

    /* renamed from: f */
    public final xoo f52262f;

    /* renamed from: g */
    public boolean f52263g;

    /* renamed from: h */
    private final Context f52264h;

    /* renamed from: i */
    private final xgz f52265i;

    /* renamed from: j */
    private final bqgy f52266j = bqgy.m112818c();

    /* renamed from: k */
    private final bqgj f52267k = snp.m35704b(9);

    /* renamed from: m */
    private final NfcBroadcastReceiver f52268m = new NfcBroadcastReceiver(this);

    /* renamed from: n */
    private final xhy f52269n;

    public xha(Context context, xhy xhy, xwj xwj, RequestOptions requestOptions, xoo xoo, String str, String str2, xhi xhi) {
        this.f52264h = context;
        this.f52269n = xhy;
        this.f52261e = xhi;
        this.f52262f = xoo;
        this.f52265i = new xgz(context, xwj, requestOptions, xoo, str, str2, xhi, this.f52266j, this.f52267k);
        this.f52263g = false;
    }

    /* renamed from: a */
    public static xha m42910a(Context context, xwj xwj, RequestOptions requestOptions, xoo xoo, String str, String str2, xhi xhi) {
        return new xha(context, xhy.m42973a(context), xwj, requestOptions, xoo, str, str2, xhi);
    }

    /* renamed from: b */
    public final void mo29730b() {
        this.f52262f.mo14257a(this.f52265i, (int) cdwr.m135182b());
    }

    /* renamed from: c */
    public final void mo29731c() {
        this.f52262f.mo14253a();
    }

    /* renamed from: d */
    public final void mo29732d() {
        this.f52267k.shutdown();
        if (!this.f52266j.isDone()) {
            this.f52266j.mo69136a((Throwable) adbe.m50106a(34004));
        }
        this.f52264h.unregisterReceiver(this.f52268m);
        if (this.f52263g) {
            this.f52269n.mo29776b();
        }
    }

    /* renamed from: e */
    public final Transport mo29733e() {
        return Transport.NFC;
    }

    /* renamed from: f */
    public final void mo29734f() {
    }

    /* renamed from: a */
    public final bqgg mo29726a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.nfc.action.ADAPTER_STATE_CHANGED");
        this.f52264h.registerReceiver(this.f52268m, intentFilter);
        return this.f52266j;
    }

    /* renamed from: a */
    public final void mo29727a(int i) {
        ViewOptions viewOptions;
        if (this.f52269n.mo29775a()) {
            viewOptions = new NfcViewOptions();
        } else {
            viewOptions = new NfcEnableViewOptions();
        }
        bmxv a = this.f52261e.mo29745a(i, viewOptions);
        if (a.mo66813a()) {
            this.f52262f.mo14261a(((ViewOptions) a.mo66814b()).toString());
        }
    }

    /* renamed from: a */
    public final void mo29728a(ViewOptions viewOptions) {
        sdo.m34970a(Transport.NFC.equals(viewOptions.mo18758b()));
        xrv xrv = xrv.MULTI_TRANSPORT;
        if (viewOptions.mo18759c().ordinal() != 1) {
            bmxv a = this.f52261e.mo29745a(3, viewOptions);
            if (a.mo66813a()) {
                this.f52262f.mo14261a(((ViewOptions) a.mo66814b()).toString());
                return;
            }
            return;
        }
        this.f52269n.mo29777c();
    }
}
