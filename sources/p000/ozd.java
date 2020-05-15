package p000;

import android.content.Context;
import android.hardware.usb.UsbManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: ozd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ozd extends ozg {

    /* renamed from: a */
    public static final bnsn f38647a = odk.m28481a("CAR.SETUP.FRX");

    /* renamed from: b */
    final Handler f38648b = new adzt(Looper.getMainLooper());

    /* renamed from: c */
    final Runnable f38649c = new ozc(this);

    /* renamed from: a */
    private final void m30030a(Context context) {
        if (ccps.f179712a.mo6606a().mo76610d()) {
            bnsi d = f38647a.mo68390d();
            d.mo68432a("ozd", "a", 118, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Attempting usb connection reset");
            mo22803b().f38656b.mo22797a(bpeb.FRX_PRESETUP_RESET_USB, bpea.FRX_USB_RESET_ATTEMPT);
            ony.m29286a(context, (UsbManager) context.getSystemService("usb")).mo22359c();
            return;
        }
        bnsi d2 = f38647a.mo68390d();
        d2.mo68432a("ozd", "a", 124, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d2.mo68405a("Skipping usb connection reset attempt");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Activity activity = getActivity();
        sdo.m34959a(activity);
        View a = mo22802a(activity, layoutInflater, viewGroup, false);
        m30034a(activity, a, (int) C0126R.C0127drawable.car_bottom_sheet_apps_illustration, (int) C0126R.string.car_setup_bottom_sheet_welcome_download_title, (int) C0126R.string.car_setup_bottom_sheet_welcome_download_body);
        a.findViewById(C0126R.C0129id.installing_progress_layout).setVisibility(0);
        ozb.m30029a(getResources(), (ViewGroup) a).setIndeterminate(true);
        ((ImageView) a.findViewById(C0126R.C0129id.app_icon)).setVisibility(8);
        TextView textView = (TextView) a.findViewById(C0126R.C0129id.caption);
        textView.setVisibility(0);
        textView.setText((int) C0126R.string.car_setup_starting_progress);
        this.f38648b.postDelayed(this.f38649c, ccps.f179712a.mo6606a().mo76611e());
        return a;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f38648b.removeCallbacksAndMessages(null);
    }

    public final void onStart() {
        super.onStart();
        Activity activity = getActivity();
        sdo.m34959a(activity);
        if (ccps.f179712a.mo6606a().mo76610d()) {
            bnsi d = f38647a.mo68390d();
            d.mo68432a("ozd", "a", 118, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Attempting usb connection reset");
            mo22803b().f38656b.mo22797a(bpeb.FRX_PRESETUP_RESET_USB, bpea.FRX_USB_RESET_ATTEMPT);
            ony.m29286a(activity, (UsbManager) activity.getSystemService("usb")).mo22359c();
            return;
        }
        bnsi d2 = f38647a.mo68390d();
        d2.mo68432a("ozd", "a", 124, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d2.mo68405a("Skipping usb connection reset attempt");
    }

    /* renamed from: a */
    public final bpeb mo22789a() {
        return bpeb.FRX_PRESETUP_RESET_USB;
    }
}
