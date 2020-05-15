package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.nfc.FormatException;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.Tag;
import android.nfc.tech.Ndef;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.controller.NfcBroadcastReceiver;
import com.google.android.gms.fido.u2f.api.view.NfcEnableViewOptions;
import com.google.android.gms.fido.u2f.api.view.NfcViewOptions;
import com.google.android.gms.fido.u2f.api.view.ViewOptions;
import java.util.concurrent.ExecutorService;

/* renamed from: xzg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xzg extends xhw implements xhq {

    /* renamed from: a */
    public static final NfcViewOptions f53427a = new NfcViewOptions();

    /* renamed from: b */
    public static final NfcViewOptions f53428b = new NfcViewOptions(true, false);

    /* renamed from: n */
    public static final sek f53429n = new sek(new String[]{"NfcSKRequestController"}, (short[]) null);

    /* renamed from: c */
    public final Context f53430c;

    /* renamed from: d */
    public final xwj f53431d;

    /* renamed from: e */
    public final xzq f53432e;

    /* renamed from: f */
    public final xzz f53433f;

    /* renamed from: g */
    public final xfo f53434g;

    /* renamed from: h */
    public final xzf f53435h;

    /* renamed from: i */
    public final xws f53436i;

    /* renamed from: j */
    public int f53437j;

    /* renamed from: k */
    NfcBroadcastReceiver f53438k;

    /* renamed from: l */
    public volatile boolean f53439l = false;

    /* renamed from: m */
    volatile boolean f53440m = false;

    /* renamed from: o */
    private final xhz f53441o;

    /* renamed from: p */
    private final ExecutorService f53442p;

    /* renamed from: q */
    private boolean f53443q;

    /* renamed from: r */
    private final xhy f53444r;

    /* renamed from: a */
    public final void mo29763a() {
        xhy xhy = this.f53444r;
        if (xhy == null) {
            f53429n.mo25418e("NfcAdapter is null", new Object[0]);
        } else if (!xhy.mo29775a()) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.nfc.action.ADAPTER_STATE_CHANGED");
            NfcBroadcastReceiver nfcBroadcastReceiver = new NfcBroadcastReceiver(this);
            this.f53438k = nfcBroadcastReceiver;
            this.f53430c.registerReceiver(nfcBroadcastReceiver, intentFilter);
        } else {
            mo29766b();
        }
    }

    /* renamed from: b */
    public final void mo29766b() {
        xhz xhz = this.f53441o;
        if (xhz != null) {
            xhz.mo14257a(this, (int) cdwr.m135182b());
        }
        this.f53443q = true;
    }

    /* renamed from: c */
    public final void mo29767c() {
        xhz xhz = this.f53441o;
        if (xhz != null && this.f53443q) {
            xhz.mo14253a();
            this.f53443q = false;
        }
    }

    /* renamed from: d */
    public final void mo29768d() {
        mo29767c();
        this.f53442p.shutdown();
        NfcBroadcastReceiver nfcBroadcastReceiver = this.f53438k;
        if (nfcBroadcastReceiver != null) {
            this.f53430c.unregisterReceiver(nfcBroadcastReceiver);
            this.f53438k = null;
        }
        if (this.f53439l) {
            this.f53444r.mo29776b();
            this.f53436i.mo30186a(this.f53431d, xag.TYPE_NFC_ADAPTER_PROGRAMMATICALLY_DISABLED);
        }
    }

    /* renamed from: e */
    public final void mo29769e() {
    }

    public xzg(Context context, xwj xwj, xzq xzq, xfo xfo, xzz xzz, xhz xhz, xhy xhy, xzc xzc, xws xws) {
        bmxy.m108581a(context);
        this.f53430c = context;
        bmxy.m108581a(xwj);
        this.f53431d = xwj;
        bmxy.m108581a(xzq);
        this.f53432e = xzq;
        bmxy.m108581a(xfo);
        this.f53434g = xfo;
        bmxy.m108581a(xzz);
        this.f53433f = xzz;
        this.f53441o = xhz;
        this.f53442p = snp.m35704b(9);
        this.f53435h = new xzf(this);
        bmxy.m108581a(xhy);
        this.f53444r = xhy;
        bmxy.m108581a(xzc);
        this.f53436i = xws;
        this.f53437j = 0;
    }

    /* renamed from: a */
    public final void mo29764a(int i) {
        ViewOptions viewOptions;
        if (this.f53444r.mo29775a()) {
            viewOptions = new NfcViewOptions();
        } else {
            viewOptions = new NfcEnableViewOptions();
        }
        this.f53433f.mo30295a(i, viewOptions);
    }

    /* renamed from: a */
    public final void mo29740a(Tag tag) {
        this.f53442p.execute(new xzd(this, tag));
    }

    /* renamed from: a */
    public final void mo29765a(ViewOptions viewOptions) {
        bmxy.m108600b(Transport.NFC.equals(viewOptions.mo18854b()));
        yav yav = yav.MULTI_TRANSPORT;
        if (viewOptions.mo18855c().ordinal() != 1) {
            this.f53433f.mo30295a(3, viewOptions);
        } else {
            this.f53444r.mo29777c();
        }
    }

    /* renamed from: a */
    public final boolean mo30283a(com.google.android.gms.fido.communication.channel.nfc.Tag tag) {
        bxtx bxtx;
        xky xky;
        if (((Boolean) xmn.f52767q.mo58455c()).booleanValue()) {
            xfo xfo = this.f53434g;
            if (xfo.f52132d == 1) {
                bxtx = xfo.mo29694a();
            } else {
                bxtx = xfo.mo29694a();
            }
            if (xft.f52144d.equals(bxtx)) {
                Ndef ndef = Ndef.get(tag.f31681a);
                if (ndef != null) {
                    xky = new xky(ndef);
                } else {
                    xky = null;
                }
                if (xky != null) {
                    try {
                        xky.f52638a.connect();
                        NdefMessage ndefMessage = xky.f52638a.getNdefMessage();
                        if (ndefMessage == null) {
                            f53429n.mo25414c("No NDEF message detected", new Object[0]);
                            xky.mo29886a();
                            return false;
                        }
                        if (bnkn.m109665a(ndefMessage.getRecords()).contains(NdefRecord.createApplicationRecord("com.google.android.apps.authenticator2"))) {
                            f53429n.mo25412b("NDEF records contains authenticator. Remove NDEF tag", new Object[0]);
                            xky.mo29886a();
                            return true;
                        }
                        xky.mo29886a();
                    } catch (FormatException e) {
                        f53429n.mo25417e("Fail to write NDEF message for format error", e, new Object[0]);
                    } catch (Throwable th) {
                        xky.mo29886a();
                        throw th;
                    }
                } else {
                    f53429n.mo25414c("No NDEF tag touch detected", new Object[0]);
                }
            }
        }
        return false;
    }
}
