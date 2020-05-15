package p000;

import android.app.AlertDialog;
import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import com.google.android.gms.fido.u2f.api.view.BleSelectViewOptions;
import com.google.android.gms.fido.u2f.api.view.BleViewOptions;
import com.google.android.gms.fido.u2f.api.view.NfcViewOptions;
import com.google.android.gms.fido.u2f.api.view.ViewOptions;

/* renamed from: ycc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ycc implements yas {

    /* renamed from: j */
    private static final Logger f53581j = new Logger(new String[]{"ViewPresenter"}, (short[]) null);

    /* renamed from: a */
    public final xic f53582a;

    /* renamed from: b */
    public AlertDialog f53583b;

    /* renamed from: c */
    public BluetoothAdapter f53584c;

    /* renamed from: d */
    boolean f53585d = true;

    /* renamed from: e */
    public ViewOptions f53586e;

    /* renamed from: f */
    public boolean f53587f = true;

    /* renamed from: g */
    public xhy f53588g;

    /* renamed from: h */
    private final String f53589h;

    /* renamed from: i */
    private boolean f53590i;

    public ycc(xic xic, String str, boolean z) {
        this.f53582a = xic;
        this.f53589h = str;
        this.f53590i = z;
    }

    /* renamed from: a */
    public final void mo14325a() {
        f53581j.mo25412b("hideFingerprintOption", new Object[0]);
        this.f53590i = false;
    }

    /* renamed from: a */
    public final void mo14326a(ViewOptions viewOptions) {
        f53581j.mo25414c("viewSelected(...) %s", viewOptions.mo18855c());
        if (!this.f53585d) {
            yav yav = yav.MULTI_TRANSPORT;
            switch (viewOptions.mo18855c().ordinal()) {
                case 0:
                    this.f53582a.mo29791a(ydb.m43831a(viewOptions, this.f53590i));
                    return;
                case 1:
                    if (!((Boolean) xmn.f52771u.mo58455c()).booleanValue() || !((NfcViewOptions) viewOptions).f31968b) {
                        this.f53582a.mo29791a(yda.m43827a(viewOptions, this.f53590i));
                        return;
                    } else if (this.f53582a.isFinishing() || this.f53582a.isDestroyed()) {
                        f53581j.mo25418e("Dialog is not shown, as ChimeraActivity is or will be destroyed!", new Object[0]);
                        return;
                    } else {
                        this.f53582a.runOnUiThread(new ybw(this));
                        return;
                    }
                case 2:
                    this.f53582a.mo29791a(ycw.m43821a(viewOptions));
                    return;
                case 3:
                    this.f53582a.mo29791a(yci.m43797a(viewOptions, this.f53590i));
                    return;
                case 4:
                    this.f53582a.mo29791a(ycd.m43792a(viewOptions));
                    return;
                case 5:
                    xic xic = this.f53582a;
                    sdo.m34970a(viewOptions.mo18855c().equals(yav.BLE_PAIR));
                    yck yck = new yck();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("VIEW_OPTIONS", viewOptions);
                    yck.setArguments(bundle);
                    xic.mo29791a(yck);
                    return;
                case 6:
                    xic xic2 = this.f53582a;
                    sdo.m34970a(viewOptions.mo18855c().equals(yav.BLE_PROCESS_REQUEST));
                    ycm ycm = new ycm();
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("VIEW_OPTIONS", viewOptions);
                    ycm.setArguments(bundle2);
                    xic2.mo29791a(ycm);
                    return;
                case 7:
                    if (!((BleSelectViewOptions) viewOptions).f31962a) {
                        this.f53582a.mo29791a(ycs.m43814a(viewOptions));
                        return;
                    } else if (this.f53582a.isFinishing() || this.f53582a.isDestroyed()) {
                        f53581j.mo25418e("Dialog is not shown, as ChimeraActivity is or will be destroyed!", new Object[0]);
                        return;
                    } else {
                        this.f53582a.runOnUiThread(new ybx(this));
                        return;
                    }
                case 8:
                    this.f53582a.mo29791a(ydf.m43838a(viewOptions, this.f53590i));
                    return;
                default:
                    f53581j.mo25418e("View %s is not supported", viewOptions.mo18855c());
                    return;
            }
        } else {
            this.f53585d = false;
            yav c = viewOptions.mo18855c();
            if (c.equals(yav.NFC)) {
                f53581j.mo25414c("The first screen is NFC view and it is augmented with welcome info.", new Object[0]);
                this.f53582a.mo29791a(yda.m43825a(viewOptions, this.f53589h, this.f53590i));
            } else if (c.equals(yav.BLE) && ((BleViewOptions) viewOptions).f31964a) {
                f53581j.mo25414c("The first screen is BLE auth intro and it is augmented with welcome info.", new Object[0]);
                this.f53582a.mo29791a(yci.m43796a(viewOptions, this.f53589h, this.f53590i));
            } else if (c.equals(yav.USB)) {
                f53581j.mo25414c("The first screen is USB instructions and it is augmented with welcome info.", new Object[0]);
                this.f53582a.mo29791a(ydf.m43836a(viewOptions, this.f53589h, this.f53590i));
            } else if (c.equals(yav.MULTI_TRANSPORT) || c.equals(yav.NFC_ENABLE) || c.equals(yav.BLE_ENABLE) || c.equals(yav.BLE)) {
                f53581j.mo25414c("The first selected screen is %s and it is replaced with welcome screen", c.f53544k);
                this.f53586e = viewOptions;
                xic xic3 = this.f53582a;
                String str = this.f53589h;
                ydg ydg = new ydg();
                Bundle bundle3 = new Bundle();
                bundle3.putCharSequence("APP_NAME", str);
                ydg.setArguments(bundle3);
                xic3.mo29791a(ydg);
            }
        }
    }
}
