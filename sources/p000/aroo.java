package p000;

import android.content.Context;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;

/* renamed from: aroo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aroo extends arop {

    /* renamed from: b */
    private static final sek f88016b = ascp.m73787a("Setup", "UI", "GoogleSettingsInstructionFlow");

    /* renamed from: c */
    private final arok f88017c;

    /* renamed from: d */
    private final Context f88018d;

    /* renamed from: e */
    private int f88019e;

    /* renamed from: f */
    private String f88020f;

    public aroo(Context context, arok arok, FragmentManager fragmentManager, Bundle bundle) {
        super(fragmentManager);
        this.f88017c = arok;
        this.f88018d = context;
        this.f88019e = 1;
        if (bundle != null) {
            this.f88019e = bundle.getInt("state");
            this.f88020f = bundle.getString("deviceName");
        }
    }

    /* renamed from: a */
    private final Fragment m73222a(String str) {
        String format = String.format(this.f88018d.getString(C0126R.string.smartdevice_d2d_target_google_settings_mnc_description), this.f88018d.getString(C0126R.string.common_set_up_nearby_device_settings_title), str);
        arpg arpg = new arpg();
        arpg.f88057a = C0126R.C0127drawable.quantum_gm_ic_phone_android_gm_blue_36;
        arpg.f88058b = this.f88018d.getString(C0126R.string.smartdevice_d2d_target_choice_glif_title);
        arpg.f88061e = format;
        arpg.mo48735b(this.f88018d.getString(C0126R.string.smartdevice_d2d_target_google_settings_link), 1);
        return arpg.mo48731a();
    }

    /* renamed from: a */
    public final int mo48711a() {
        return 3;
    }

    /* renamed from: a */
    public final boolean mo48714a(int i) {
        return i == 116 || i == 1;
    }

    /* renamed from: b */
    public final void mo48715b() {
        super.mo48715b();
        if (this.f88019e == 2) {
            this.f88019e = 3;
        }
    }

    /* renamed from: c */
    public final boolean mo48716c() {
        return this.f88019e == 2;
    }

    /* renamed from: b */
    public final void mo48707b(int i, Bundle bundle) {
        if (i != 1) {
            if (i == 116) {
                String string = bundle.getString("deviceName");
                this.f88020f = string;
                f88016b.mo25414c("Got action after fragment add, device name: %s", string);
                if (this.f88019e == 1) {
                    f88016b.mo25414c("Building settings fragment", new Object[0]);
                    mo48718b(m73222a(this.f88020f));
                    this.f88019e = 3;
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder(26);
            sb.append("Invalid action ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        } else if (cgql.m146577b()) {
            this.f88017c.mo48707b(118, Bundle.EMPTY);
        } else if (this.f88019e == 3) {
            String str = this.f88020f;
            String format = String.format(this.f88018d.getString(C0126R.string.smartdevice_d2d_target_google_settings_description), this.f88018d.getString(C0126R.string.common_set_up_nearby_device_settings_title), stm.m36299a(str));
            arpg arpg = new arpg();
            arpg.f88057a = C0126R.C0127drawable.quantum_gm_ic_phone_android_gm_blue_36;
            arpg.f88058b = this.f88018d.getString(C0126R.string.smartdevice_d2d_target_choice_glif_title);
            arpg.f88061e = format;
            arpg.mo48735b(this.f88018d.getString(C0126R.string.smartdevice_d2d_target_google_settings_link), 1);
            mo48718b(arpg.mo48731a());
            this.f88019e = 2;
        } else {
            mo48715b();
        }
    }

    public aroo(Context context, arok arok, FragmentManager fragmentManager, String str) {
        super(fragmentManager);
        this.f88018d = context;
        this.f88017c = arok;
        this.f88019e = str == null ? 1 : 3;
        this.f88020f = str;
    }

    /* renamed from: a */
    public final void mo48712a(Bundle bundle) {
        bundle.putInt("state", this.f88019e);
        bundle.putString("deviceName", this.f88020f);
    }

    /* renamed from: a */
    public final void mo48713a(boolean z) {
        String str = this.f88020f;
        if (str == null) {
            Context context = this.f88018d;
            arpg arpg = new arpg();
            arpg.f88057a = C0126R.C0127drawable.quantum_gm_ic_phone_android_gm_blue_36;
            arpg.f88058b = context.getString(C0126R.string.smartdevice_d2d_target_choice_glif_title);
            arpg.mo48734b();
            mo48718b(arpg.mo48731a());
            f88016b.mo25412b("Initialized without device name", new Object[0]);
            return;
        }
        mo48718b(m73222a(str));
        f88016b.mo25412b("Initialized with device name", new Object[0]);
    }
}
