package p000;

import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.android.volley.toolbox.NetworkImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.family.p042v2.model.PageData;
import java.util.ArrayList;

/* renamed from: wmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wmi extends Fragment implements wgr, rka {

    /* renamed from: a */
    public wmh f50873a;

    /* renamed from: b */
    private String f50874b;

    /* renamed from: c */
    private PageData f50875c;

    /* renamed from: d */
    private ArrayList f50876d;

    /* renamed from: e */
    private boolean f50877e;

    /* renamed from: a */
    public static wmi m42033a(String str, PageData pageData, ArrayList arrayList) {
        wmi wmi = new wmi();
        Bundle bundle = new Bundle(3);
        bundle.putString("accountName", str);
        bundle.putParcelable("pageData", pageData);
        bundle.putParcelableArrayList("contacts", arrayList);
        wmi.setArguments(bundle);
        return wmi;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f50873a = (wmh) wgq.m41934a(wmh.class, activity);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f50874b = getArguments().getString("accountName");
        this.f50875c = (PageData) getArguments().getParcelable("pageData");
        ArrayList parcelableArrayList = getArguments().getParcelableArrayList("contacts");
        this.f50876d = parcelableArrayList;
        this.f50877e = parcelableArrayList != null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.fm_fragment_success, viewGroup, false);
        NetworkImageView networkImageView = (NetworkImageView) inflate.findViewById(C0126R.C0129id.fm_success_header_image);
        networkImageView.setDefaultImageResId(C0126R.C0127drawable.fm_img_bookend_header_loading);
        networkImageView.setErrorImageResId(C0126R.C0127drawable.fm_img_bookend_header_default);
        this.f50873a.mo18443b().mo29116b(20);
        if (this.f50875c.f31453a.containsKey(1)) {
            if (this.f50877e) {
                m42034a(networkImageView, C0126R.dimen.fm_product_intro_image_size);
            } else {
                m42034a(networkImageView, C0126R.dimen.fm_bookend_image_size);
            }
            networkImageView.setImageUrl((String) this.f50875c.f31453a.get(1), wgv.m41935a());
        }
        if (this.f50875c.f31453a.containsKey(2)) {
            wgz.m41940a((TextView) inflate.findViewById(C0126R.C0129id.fm_success_title_text), (String) this.f50875c.f31453a.get(2), new wgt(this.f50875c, this, this.f50874b));
        }
        if (this.f50875c.f31453a.containsKey(3)) {
            wgz.m41940a((TextView) inflate.findViewById(C0126R.C0129id.fm_success_body_text), (String) this.f50875c.f31453a.get(3), new wgt(this.f50875c, this, this.f50874b));
        }
        if (this.f50877e && !this.f50876d.isEmpty()) {
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0126R.C0129id.fm_success_members_list);
            recyclerView.setVisibility(0);
            inflate.findViewById(C0126R.C0129id.fm_success_members_list_divider_start).setVisibility(0);
            getContext();
            recyclerView.setLayoutManager(new aah());
            recyclerView.setAdapter(new whk(this.f50876d, this.f50873a.mo18465v(), null, false, getContext()));
        } else {
            ((RecyclerView) inflate.findViewById(C0126R.C0129id.fm_success_members_list)).setVisibility(4);
            inflate.findViewById(C0126R.C0129id.fm_success_members_list_divider_start).setVisibility(4);
        }
        Button button = (Button) inflate.findViewById(C0126R.C0129id.fm_success_continue_button);
        if (this.f50875c.f31453a.containsKey(4)) {
            button.setText((CharSequence) this.f50875c.f31453a.get(4));
        }
        button.setOnClickListener(new wmg(this));
        return inflate;
    }

    public final void onDetach() {
        super.onDetach();
        this.f50873a = null;
    }

    /* renamed from: a */
    private final void m42034a(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) getResources().getDimension(i);
        layoutParams.width = (int) getResources().getDimension(i);
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        this.f50877e = false;
        sbw sbw = wgn.f50624a;
        this.f50873a.mo18443b().mo29110a(2, 9);
    }
}
