package p000;

import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: ozj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ozj implements C1504y {

    /* renamed from: f */
    public static final /* synthetic */ int f38653f = 0;

    /* renamed from: g */
    private static final bnsn f38654g = odk.m28481a("CAR.SETUP.FRX");

    /* renamed from: a */
    public final ozi f38655a;

    /* renamed from: b */
    public final oyz f38656b;

    /* renamed from: c */
    public boolean f38657c = false;

    /* renamed from: d */
    final int f38658d;

    /* renamed from: e */
    final int f38659e;

    /* renamed from: h */
    private final int f38660h;

    /* renamed from: i */
    private final C1504y f38661i = new ozh(this);

    public ozj(ozi ozi, int i, oyz oyz, int i2, int i3) {
        this.f38655a = ozi;
        this.f38660h = i;
        this.f38656b = oyz;
        this.f38658d = i2;
        this.f38659e = i3;
        ((C0013ak) ozi).getLifecycle().mo557a(this.f38661i);
    }

    /* renamed from: a */
    public final void mo2a() {
    }

    /* renamed from: a */
    public final void mo3a(C0013ak akVar) {
    }

    /* renamed from: b */
    public final void mo4b() {
    }

    /* renamed from: c */
    public final void mo5c() {
    }

    /* renamed from: d */
    public final void mo6d() {
    }

    /* renamed from: e */
    public final void mo7e() {
    }

    /* renamed from: f */
    public final void mo22805f() {
        this.f38657c = true;
        this.f38655a.mo17474j();
        this.f38655a.mo17469a(false);
    }

    /* renamed from: a */
    public final void mo22804a(int i) {
        String str;
        bnsi d = f38654g.mo68390d();
        d.mo68432a("ozj", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        switch (i) {
            case 1:
                str = "ENTRY";
                break;
            case 2:
                str = "DEVICE_INCOMPATIBLE";
                break;
            case 3:
                str = "INTRO_LOCKED";
                break;
            case 4:
                str = "INTRO";
                break;
            case 5:
                str = "INTRO_RETRY";
                break;
            case 6:
                str = "DOWNLOAD_GH";
                break;
            case 7:
                str = "RESET_USB";
                break;
            case 8:
                str = "NETWORK_ERROR";
                break;
            case 9:
                str = "EXIT";
                break;
            case 10:
                str = "EXIT_FAILURE";
                break;
            case 11:
                str = "EXIT_AND_CONTINUE";
                break;
            case 12:
                str = "UNPLUG_REPLUG";
                break;
            default:
                str = "null";
                break;
        }
        if (i != 0) {
            d.mo68420a("moveTo %s", str);
            if (this.f38657c) {
                bnsi c = f38654g.mo68388c();
                c.mo68432a("ozj", "a", 226, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("moveTo exit early, no state changes should happen after an exit condition");
                return;
            }
            int i2 = i - 1;
            if (i != 0) {
                switch (i2) {
                    case 0:
                        int i3 = 2;
                        this.f38656b.mo22797a(bpeb.FRX_PRESETUP_GENERAL, this.f38658d == 2 ? bpea.FRX_PRESETUP_START_WIFI : bpea.FRX_PRESETUP_START_USB);
                        int i4 = this.f38660h;
                        if (i4 == 0 || i4 == 1) {
                            i3 = this.f38655a.mo17472h() ? 3 : 4;
                        } else if (!(i4 == 3 || i4 == 4 || i4 == 5)) {
                            i3 = 10;
                        }
                        mo22804a(i3);
                        return;
                    case 1:
                        this.f38655a.mo17468a(new oyt());
                        return;
                    case 2:
                        this.f38655a.mo17473i();
                        this.f38655a.mo17468a(oyy.m30025a(true, false));
                        return;
                    case 3:
                        this.f38655a.mo17474j();
                        this.f38655a.mo17468a(oyy.m30025a(false, false));
                        return;
                    case 4:
                        this.f38655a.mo17468a(oyy.m30025a(false, true));
                        return;
                    case 5:
                        if (this.f38655a.mo17471g()) {
                            this.f38655a.mo17468a(new oyp());
                            return;
                        } else {
                            mo22804a(8);
                            return;
                        }
                    case 6:
                        ozi ozi = this.f38655a;
                        ozd ozd = new ozd();
                        ozd.setArguments(new Bundle());
                        ozi.mo17468a(ozd);
                        return;
                    case 7:
                        this.f38656b.mo22797a(bpeb.FRX_INSTALL_APPS, bpea.FRX_DOWNLOAD_FAILED_NETWORK);
                        ozi ozi2 = this.f38655a;
                        oyr oyr = new oyr();
                        Bundle bundle = new Bundle();
                        bundle.putInt("com.google.android.gms.carsetup.setup.ErrorFragment.ERROR_TITLE", C0126R.string.car_frx_no_connection_title);
                        bundle.putInt("com.google.android.gms.carsetup.setup.ErrorFragment.ERROR_MESSAGE", C0126R.string.car_frx_no_connection_message);
                        oyr.setArguments(bundle);
                        ozi2.mo17468a(oyr);
                        return;
                    case 8:
                    case 9:
                        mo22805f();
                        return;
                    case 10:
                        this.f38657c = true;
                        this.f38655a.mo17474j();
                        this.f38655a.mo17469a(true);
                        return;
                    case 11:
                        ozi ozi3 = this.f38655a;
                        ozk ozk = new ozk();
                        ozk.setArguments(new Bundle());
                        ozi3.mo17468a(ozk);
                        return;
                    default:
                        return;
                }
            } else {
                throw null;
            }
        } else {
            throw null;
        }
    }
}
