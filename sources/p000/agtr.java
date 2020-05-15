package p000;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.gms.mobiledataplan.p055ui.MobileDataPlanSettingsChimeraActivity;

/* renamed from: agtr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agtr extends Fragment {

    /* renamed from: a */
    public bszh f66512a;

    /* renamed from: b */
    public agug f66513b;

    /* renamed from: c */
    public float f66514c;

    static {
        srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f66512a == null) {
            try {
                this.f66512a = (bszh) bxvk.m124016a(bszh.f147822d, bundle.getByteArray("support_info_obj"), bxus.m123744c());
            } catch (bxwf e) {
                this.f66512a = MobileDataPlanSettingsChimeraActivity.m67304a(getActivity());
            }
        }
        return layoutInflater.inflate((int) C0126R.C0128layout.carrier_support_fragment, viewGroup, false);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        if (!cfnm.m140635f() || agvh.m55172b() != null) {
            agrl.m54942a().mo35987a(36, (String) null, (String) null, bygd.EXIT_CARRIER_SUPPORT, System.currentTimeMillis(), agvh.m55172b());
        }
        if (getActivity() != null) {
            getActivity().setTitle((int) C0126R.string.mobile_data_plan);
            getActivity().findViewById(C0126R.C0129id.content_layout).setVisibility(0);
            getActivity().invalidateOptionsMenu();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putByteArray("support_info_obj", this.f66512a.mo73642k());
    }

    public final void onStart() {
        super.onStart();
        agrl.m54942a().mo35987a(34, (String) null, (String) null, bygd.CARRIER_SUPPORT_LOADED, System.currentTimeMillis(), agvh.m55172b());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C1341rz aW = ((deu) getActivity()).mo8628aW();
        aW.mo15841a(4, 4);
        aW.mo15853b(true);
        int i = Build.VERSION.SDK_INT;
        if (cfnm.m140639j()) {
            aW.mo15851b(new ColorDrawable(getResources().getColor(C0126R.color.action_bar_background)));
        } else {
            aW.mo15851b(new ColorDrawable(getResources().getColor(C0126R.color.top_entry_grey)));
        }
        this.f66514c = aW.mo15869h();
        aW.mo15839a(0.0f);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C0126R.C0129id.support_page_recyclerview);
        getContext();
        recyclerView.setLayoutManager(new aah());
        recyclerView.addOnScrollListener(new agtq(this, aW));
        this.f66512a.toString();
        this.f66513b.mo36116a(new agyj(this.f66512a.f147824a));
        for (int i2 = 0; i2 < this.f66512a.f147826c.size(); i2++) {
            this.f66513b.mo36116a(new agyk((bszg) this.f66512a.f147826c.get(i2)));
        }
        recyclerView.setAdapter(this.f66513b);
    }
}
