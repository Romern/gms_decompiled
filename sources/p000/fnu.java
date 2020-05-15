package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: fnu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fnu extends BroadcastReceiver {

    /* renamed from: a */
    static final String f16976a = fnu.class.getName();

    /* renamed from: b */
    public final fkm f16977b;

    /* renamed from: c */
    public boolean f16978c;

    /* renamed from: d */
    public boolean f16979d;

    public fnu(fkm fkm) {
        sdo.m34959a(fkm);
        this.f16977b = fkm;
    }

    /* renamed from: f */
    private final fnt m12031f() {
        return this.f16977b.mo10957a();
    }

    /* renamed from: g */
    private final fkh m12032g() {
        return this.f16977b.mo10959c();
    }

    /* renamed from: a */
    public final void mo11031a() {
        m12031f();
        m12032g();
    }

    /* renamed from: b */
    public final void mo11032b() {
        if (this.f16978c) {
            this.f16977b.mo10957a().mo10933d("Unregistering connectivity change receiver");
            this.f16978c = false;
            this.f16979d = false;
            try {
                mo11035e().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                m12031f().mo10938e("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: c */
    public final void mo11033c() {
        Context e = mo11035e();
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(e.getPackageName());
        intent.putExtra(f16976a, true);
        e.sendOrderedBroadcast(intent, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo11034d() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) mo11035e().getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (SecurityException e) {
            return false;
        }
    }

    /* renamed from: e */
    public final Context mo11035e() {
        return this.f16977b.f16785a;
    }

    public final void onReceive(Context context, Intent intent) {
        mo11031a();
        String action = intent.getAction();
        this.f16977b.mo10957a().mo10926a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean d = mo11034d();
            if (this.f16979d != d) {
                this.f16979d = d;
                fkh g = m12032g();
                g.mo10926a("Network connectivity status changed", Boolean.valueOf(d));
                g.mo10944i().mo10886a(new fkb(g));
            }
        } else if (!"com.google.analytics.RADIO_POWERED".equals(action)) {
            this.f16977b.mo10957a().mo10934d("NetworkBroadcastReceiver received unknown action", action);
        } else if (!intent.hasExtra(f16976a)) {
            fkh g2 = m12032g();
            g2.mo10933d("Radio powered up");
            g2.mo10922b();
        }
    }
}
