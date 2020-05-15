package p000;

import android.os.Bundle;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.gms.smartdevice.d2d.p065ui.SourceDirectTransferChimeraActivity;
import java.util.ArrayList;

/* renamed from: aroy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aroy implements arom {

    /* renamed from: a */
    private final SourceDirectTransferChimeraActivity f88042a;

    /* renamed from: b */
    private final String f88043b;

    /* renamed from: c */
    private final String f88044c;

    /* renamed from: d */
    private final String f88045d;

    /* renamed from: e */
    private final int f88046e;

    /* renamed from: f */
    private String f88047f;

    public aroy(SourceDirectTransferChimeraActivity sourceDirectTransferChimeraActivity, String str, String str2, String str3, String str4, String str5) {
        int i;
        this.f88042a = sourceDirectTransferChimeraActivity;
        this.f88043b = str;
        this.f88044c = str2;
        this.f88047f = str5;
        this.f88045d = str4;
        if ("deviceIconPhone".equals(str3)) {
            i = C0126R.C0127drawable.quantum_gm_ic_phone_android_gm_blue_36;
        } else if ("deviceIconWatch".equals(str3)) {
            i = C0126R.C0127drawable.quantum_ic_watch_googblue_36;
        } else if (!"deviceIconTv".equals(str3)) {
            String valueOf = String.valueOf(str3);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unknown device icon type (should be one of BootstrapConfigurations.DeviceIcon: ") : "Unknown device icon type (should be one of BootstrapConfigurations.DeviceIcon: ".concat(valueOf));
        } else {
            i = C0126R.C0127drawable.quantum_gm_ic_tv_gm_blue_36;
        }
        this.f88046e = i;
    }

    /* renamed from: a */
    private final String m73254a(int i) {
        return this.f88042a.getString(i);
    }

    /* renamed from: a */
    public final Fragment mo48708a(int i, Bundle bundle) {
        ArrayList arrayList;
        Fragment fragment;
        String str;
        if (bundle != null) {
            arrayList = bundle.getParcelableArrayList("extraAccountChallengeData");
        } else {
            arrayList = new ArrayList();
        }
        if (i == 2) {
            fragment = arzf.m73710a(this.f88044c, this.f88043b, null, this.f88045d, this.f88046e, false);
        } else if (i == 3) {
            arpg arpg = new arpg();
            arpg.f88057a = this.f88046e;
            arpg.f88058b = this.f88044c;
            arpg.f88059c = this.f88043b;
            arpg.mo48735b(m73254a(C0126R.string.common_cancel), 2002);
            arpg.mo48733a(m73254a(C0126R.string.smartdevice_action_copy), 2001);
            fragment = arpg.mo48731a();
        } else if (i == 4) {
            if (TextUtils.isEmpty(this.f88047f)) {
                if (cgrq.m146758c()) {
                    str = this.f88042a.getResources().getQuantityString(C0126R.plurals.smartdevice_d2d_copying_accounts, arrayList.size());
                } else {
                    str = m73254a(C0126R.string.smartdevice_d2d_target_copying_accounts);
                }
                this.f88047f = str;
            }
            arpg arpg2 = new arpg();
            arpg2.f88057a = this.f88046e;
            arpg2.f88058b = this.f88047f;
            fragment = arpg2.mo48731a();
        } else if (i == 5) {
            String string = bundle.getString("extraRestoreAccount");
            bundle.remove("extraAccountChallengeData");
            bundle.remove("extraRestoreAccount");
            fragment = arws.m73628a(arrayList, string);
        } else if (i == 7) {
            return asbz.m73764a(this.f88042a.getContainerActivity(), 1);
        } else {
            StringBuilder sb = new StringBuilder(59);
            sb.append("Illegal state: an unknown fragment was started: ");
            sb.append(i);
            throw new RuntimeException(sb.toString());
        }
        if (bundle != null) {
            Bundle arguments = fragment.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putAll(bundle);
            fragment.setArguments(arguments);
        }
        return fragment;
    }
}
