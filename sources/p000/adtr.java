package p000;

import android.app.Dialog;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;

/* renamed from: adtr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adtr extends DialogFragment {

    /* renamed from: a */
    private adtv f62723a;

    /* renamed from: a */
    public static adtr m51193a(aduf aduf) {
        adtr adtr = new adtr();
        Bundle bundle = new Bundle();
        bundle.putInt("state", aduf.ordinal());
        adtr.setArguments(bundle);
        return adtr;
    }

    /* renamed from: b */
    private final aduf m51194b() {
        return aduf.values()[getArguments().getInt("state", aduf.ERROR_FAILURE.ordinal())];
    }

    /* renamed from: c */
    private final int m51195c() {
        aduf aduf = aduf.NORMAL;
        int ordinal = m51194b().ordinal();
        if (ordinal == 3) {
            return C0126R.string.dialog_try_again_later;
        }
        if (ordinal == 4) {
            return 0;
        }
        if (ordinal == 5) {
            return C0126R.string.dialog_try_again_later;
        }
        String valueOf = String.valueOf(m51194b());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("Illegal error state: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f62723a = (adtv) aduo.m51219a(getActivity()).mo3444a(adtv.class);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        int i;
        int i2;
        bhia bhia = new bhia(getActivity(), 2132018632);
        aduf aduf = aduf.NORMAL;
        int ordinal = m51194b().ordinal();
        if (ordinal == 3 || ordinal == 4) {
            i = C0126R.string.common_something_went_wrong;
        } else if (ordinal == 5) {
            i = C0126R.string.common_network_unavailable;
        } else {
            String valueOf = String.valueOf(m51194b());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("Illegal error state: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        bhia.mo63791f(i);
        if (!mo9306a()) {
            i2 = C0126R.string.close_button_label;
        } else {
            i2 = C0126R.string.common_try_again;
        }
        bhia.mo63786d(i2, new adtp(this));
        if (m51195c() != 0) {
            bhia.mo63790e(m51195c());
        }
        return bhia.mo15904b();
    }

    public final void onStart() {
        btur btur;
        super.onStart();
        aduf aduf = aduf.NORMAL;
        int ordinal = m51194b().ordinal();
        if (ordinal == 3) {
            btur = btur.SETTINGS_ERROR_FEATURE_TIMEOUT;
        } else if (ordinal == 4) {
            btur = btur.SETTINGS_ERROR_FEATURE_FAILURE;
        } else if (ordinal == 5) {
            btur = btur.SETTINGS_ERROR_NO_NETWORK;
        } else if (ordinal == 6) {
            btur = btur.SETTINGS_ERROR_KM_FEATURE_REQUEST_FAILED;
        } else if (ordinal == 7) {
            btur = btur.SETTINGS_ERROR_KM_UNAVAILABLE_AFTER_DOWNLOAD;
        } else {
            String valueOf = String.valueOf(m51194b());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("Illegal error state: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        this.f62723a.mo33822a(btur);
    }

    /* renamed from: a */
    public final boolean mo9306a() {
        aduf aduf = aduf.NORMAL;
        int ordinal = m51194b().ordinal();
        return (ordinal == 3 || ordinal == 4) ? false : true;
    }
}
