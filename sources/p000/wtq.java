package p000;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.support.p002v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: wtq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wtq implements burb {

    /* renamed from: a */
    final /* synthetic */ wts f51311a;

    public wtq(wts wts) {
        this.f51311a = wts;
    }

    /* renamed from: a */
    public final void mo29390a() {
        int i;
        String str;
        burc burc;
        bnsl bnsl = (bnsl) wtw.f51331a.mo68390d();
        bnsl.mo68432a("wtq", "a", 98, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("DeviceDetail: Service is connected");
        wts wts = this.f51311a;
        if (!wts.mo29402e() && (burc = wts.f51322i) != null) {
            try {
                wts.f51316c = burc.mo73021a(wts.f51315b);
            } catch (RemoteException e) {
                bnsl bnsl2 = (bnsl) wtw.f51331a.mo68388c();
                bnsl2.mo68437a(e);
                bnsl2.mo68432a("wts", "a", 195, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("DeviceDetail: Get address from account key fail.");
            }
        }
        if (wts.f51321h == null && wts.getView() != null) {
            RecyclerView recyclerView = (RecyclerView) wts.getView().findViewById(C0126R.C0129id.sliceDetailsLink);
            wts.getContext();
            recyclerView.setLayoutManager(new aah());
            Context context = wts.getContext();
            apr apr = wts.f51314a;
            Uri.Builder appendPath = new Uri.Builder().scheme("content").authority("com.google.android.gms.nearby.fastpair").appendPath("links");
            if (wts.mo29402e()) {
                appendPath.appendQueryParameter("address", wts.f51316c);
            } else if (wts.f51315b != null) {
                appendPath.appendQueryParameter("account_key", boan.f132472f.mo68794a(wts.f51315b));
            }
            wts.f51321h = new wrz(context, apr, appendPath.build());
            recyclerView.setAdapter(wts.f51321h);
        }
        MenuItem menuItem = wts.f51317d;
        if (menuItem != null) {
            menuItem.setVisible(wts.mo29402e());
        }
        wts.mo29399b();
        TextView textView = wts.f51320g;
        if (textView != null) {
            if (!wts.mo29402e()) {
                i = 8;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
            TextView textView2 = wts.f51320g;
            if (wts.mo29402e()) {
                str = wts.getString(C0126R.string.fast_pair_device_details_footer_address, wts.f51316c);
            } else {
                str = "";
            }
            textView2.setText(str);
        }
        wts.mo29400c();
    }

    /* renamed from: b */
    public final void mo29391b() {
        bnsl bnsl = (bnsl) wtw.f51331a.mo68390d();
        bnsl.mo68432a("wtq", "b", (int) ErrorInfo.TYPE_SDU_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("DeviceDetail: Service is disconnected");
    }
}
