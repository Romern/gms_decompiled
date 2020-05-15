package p000;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.drive.p039ui.select.path.ViewPathElement;

/* renamed from: vni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vni extends abh {

    /* renamed from: a */
    public vmq f49580a;

    /* renamed from: a */
    public final int mo161a() {
        int length = vnr.f49589d.length;
        return 4;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        return new vnh(LayoutInflater.from(viewGroup.getContext()).inflate((int) C0126R.C0128layout.drive_top_level_view_item, viewGroup, false));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo168a(acm acm, int i) {
        vng vng;
        vnh vnh = (vnh) acm;
        ViewPathElement viewPathElement = vnr.f49589d[i];
        vmq vmq = this.f49580a;
        vnh.f49579s.setText(viewPathElement.mo18341a(vnh.f201a.getContext()));
        TextView textView = vnh.f49579s;
        int i2 = viewPathElement.f31217a;
        int i3 = Build.VERSION.SDK_INT;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, 0, 0, 0);
        View view = vnh.f201a;
        if (vmq != null) {
            vng = new vng(vmq, viewPathElement);
        } else {
            vng = null;
        }
        view.setOnClickListener(vng);
    }
}
