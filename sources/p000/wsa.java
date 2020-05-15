package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.location.nearby.common.fastpair.DiscoveryListItem;
import java.util.ArrayList;

/* renamed from: wsa */
final /* synthetic */ class wsa implements View.OnClickListener {

    /* renamed from: a */
    private final wsc f51226a;

    /* renamed from: b */
    private final DiscoveryListItem f51227b;

    public wsa(wsc wsc, DiscoveryListItem discoveryListItem) {
        this.f51226a = wsc;
        this.f51227b = discoveryListItem;
    }

    public void onClick(View view) {
        wsc wsc = this.f51226a;
        DiscoveryListItem discoveryListItem = this.f51227b;
        if (discoveryListItem.f191745k) {
            Context context = wsc.f51231a;
            bnic a = bnic.m109489a(discoveryListItem.f191735a);
            Intent action = butb.m120417b(context).setAction("com.google.android.gms.nearby.discovery.ACTION_LIST_ITEM_ENABLE");
            ArrayList arrayList = new ArrayList(1);
            arrayList.addAll(a);
            context.startService(action.putStringArrayListExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_IDS", arrayList));
        }
        if (!new burh(wsc.f51231a).mo73041e()) {
            new AlertDialog.Builder(wsc.f51231a).setMessage((int) C0126R.string.devices_notifications_turn_on_description).setPositiveButton(17039370, (DialogInterface.OnClickListener) null).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).show();
        } else {
            wsc.f51231a.startService(discoveryListItem.f191743i);
        }
    }
}
