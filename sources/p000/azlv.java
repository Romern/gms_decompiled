package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

/* renamed from: azlv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azlv implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ azlx f99597a;

    public azlv(azlx azlx) {
        this.f99597a = azlx;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        new Object[1][0] = Integer.valueOf(i);
        azlx azlx = this.f99597a;
        azlx.f99598a = i;
        Button button = azlx.f99603f;
        if (button != null) {
            button.setEnabled(true);
        }
    }
}
