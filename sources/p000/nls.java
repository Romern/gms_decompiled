package p000;

import android.content.SharedPreferences;

/* renamed from: nls */
final /* synthetic */ class nls implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private final nlv f35969a;

    public nls(nlv nlv) {
        this.f35969a = nlv;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        char c;
        nlv nlv = this.f35969a;
        switch (str.hashCode()) {
            case 267290342:
                if (str.equals("touchpad_min_size_mm")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 739972694:
                if (str.equals("touchpad_multimove_penalty_mm")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1627160162:
                if (str.equals("touchpad_tuning_enabled")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 2024027045:
                if (str.equals("touchpad_base_fraction")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1 || c == 2 || c == 3) {
            nlv.mo21082g();
        }
    }
}
