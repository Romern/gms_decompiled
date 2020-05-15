package p000;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: atbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atbi extends alic {

    /* renamed from: b */
    public View f90001b;

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        TextView textView = (TextView) this.f90001b.findViewById(C0126R.C0129id.ResultText);
        if (i == 36912) {
            TextView textView2 = (TextView) this.f90001b.findViewById(C0126R.C0129id.SettingsStatus);
            int i3 = Settings.Secure.getInt(getActivity().getContentResolver(), "com.google.android.gms.tapandpay.oobe.OOBE_RESULT_STATUS", -1);
            if (i3 == 0) {
                textView2.setText("SUW would not show a notification");
            } else if (i3 != 1) {
                textView2.setText("Could not read settings state");
            } else {
                textView2.setText("SUW would show its notification");
            }
            if (i2 == 101) {
                textView.setText("RESULT_SKIP_PAYMENTS");
            } else if (i2 != 102) {
                switch (i2) {
                    case -1:
                        textView.setText("RESULT_OK");
                        return;
                    case 0:
                        textView.setText("RESULT_CANCELLED");
                        return;
                    case 1:
                        textView.setText("RESULT_SKIP");
                        return;
                    case 2:
                        textView.setText("RESULT_RETRY");
                        return;
                    case 3:
                        textView.setText("RESULT_ACTIVITY_NOT_FOUND");
                        return;
                    case 4:
                        textView.setText("RESULT_LIFECYCLE_NOT_MATCHED");
                        return;
                    case 5:
                        textView.setText("RESULT_FLOW_NOT_MATCHED");
                        return;
                    default:
                        StringBuilder sb = new StringBuilder(32);
                        sb.append("Non-standard result: ");
                        sb.append(i2);
                        textView.setText(sb.toString());
                        return;
                }
            } else {
                textView.setText("RESULT_ERROR");
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.tp_oobe_test, viewGroup, false);
        this.f90001b = inflate;
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.GCoreVersion);
        try {
            textView.setText(String.format("GMSCore Version: %s", getActivity().getPackageManager().getPackageInfo("com.google.android.gms", 0).versionName));
        } catch (PackageManager.NameNotFoundException e) {
            Button button = (Button) this.f90001b.findViewById(C0126R.C0129id.StartSuwButton);
            button.setEnabled(false);
            button.setText("Cannot start, no GMSCore Version");
            textView.setText("Could not get GMSCore version.");
        }
        ((Button) this.f90001b.findViewById(C0126R.C0129id.StartSuwButton)).setOnClickListener(new atbh(this));
        return this.f90001b;
    }
}
