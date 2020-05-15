package p000;

import android.graphics.Bitmap;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import java.util.List;

/* renamed from: wsp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wsp extends abh {

    /* renamed from: a */
    public final wse f51257a;

    /* renamed from: d */
    public List f51258d;

    /* renamed from: e */
    private final View.OnClickListener f51259e;

    public wsp(Activity activity, RecyclerView recyclerView) {
        this.f51257a = (wse) activity;
        this.f51259e = new wsn(this, recyclerView);
    }

    /* renamed from: a */
    public final int mo161a() {
        List list = this.f51258d;
        if (list == null) {
            return 0;
        }
        if (list.isEmpty()) {
            return 1;
        }
        return this.f51258d.size();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        int i2;
        LayoutInflater from = LayoutInflater.from(this.f51257a);
        if (!cfoj.m141543X()) {
            i2 = C0126R.C0128layout.fast_pair_devices_list_item;
        } else {
            i2 = C0126R.C0128layout.devices_list_item_device;
        }
        View inflate = from.inflate(i2, viewGroup, false);
        inflate.setOnClickListener(this.f51259e);
        return new wso(inflate);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo168a(acm acm, int i) {
        wso wso = (wso) acm;
        bmxy.m108582a(this.f51258d, "Devices list should not be null - getItemCount() returns 0 for that case.");
        if (this.f51258d.isEmpty()) {
            wso.mo29358a(this.f51257a.getString(C0126R.string.fast_pair_no_devices));
            wso.mo29357a((Bitmap) null);
            wso.f201a.setClickable(false);
            return;
        }
        wso.f201a.setClickable(cfoj.m141543X());
        try {
            aiaa aiaa = (aiaa) bxvk.m124016a(aiaa.f68501K, ((ahza) this.f51258d.get(i)).f68445c.mo73780k(), bxus.m123744c());
            wso.mo29358a(aiaa.f68520h);
            wso.mo29357a(wsm.m42216a(aiaa));
        } catch (bxwf e) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("wsp", "a", 65, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to parse discovery item.");
            wso.mo29358a((String) null);
        }
    }

    /* renamed from: a */
    public final void mo29359a(List list) {
        this.f51258d = list;
        mo171aJ();
    }

    /* renamed from: a */
    public final void mo29360a(wso wso, int i) {
        bmxy.m108582a(this.f51258d, "Devices list should not be null - getItemCount() returns 0 for that case.");
        if (this.f51258d.isEmpty()) {
            wso.mo29358a(this.f51257a.getString(C0126R.string.fast_pair_no_devices));
            wso.mo29357a((Bitmap) null);
            wso.f201a.setClickable(false);
            return;
        }
        wso.f201a.setClickable(cfoj.m141543X());
        try {
            aiaa aiaa = (aiaa) bxvk.m124016a(aiaa.f68501K, ((ahza) this.f51258d.get(i)).f68445c.mo73780k(), bxus.m123744c());
            wso.mo29358a(aiaa.f68520h);
            wso.mo29357a(wsm.m42216a(aiaa));
        } catch (bxwf e) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("wsp", "a", 65, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to parse discovery item.");
            wso.mo29358a((String) null);
        }
    }
}
