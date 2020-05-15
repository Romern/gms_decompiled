package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.google.android.gms.app.net.NetworkUsageChimeraActivityAdvanced;

/* renamed from: foy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class foy implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ NetworkUsageChimeraActivityAdvanced f17050a;

    public foy(NetworkUsageChimeraActivityAdvanced networkUsageChimeraActivityAdvanced) {
        this.f17050a = networkUsageChimeraActivityAdvanced;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ((TextView) adapterView.getChildAt(0)).setTextColor(-1);
        if (i == 0) {
            this.f17050a.mo7149e();
        } else if (i == 1) {
            NetworkUsageChimeraActivityAdvanced networkUsageChimeraActivityAdvanced = this.f17050a;
            if (networkUsageChimeraActivityAdvanced.f9498b == null) {
                networkUsageChimeraActivityAdvanced.f9498b = new fpk();
            }
            networkUsageChimeraActivityAdvanced.mo7147a(networkUsageChimeraActivityAdvanced.f9498b);
        }
        this.f17050a.invalidateOptionsMenu();
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
