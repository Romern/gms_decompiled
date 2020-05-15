package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: acwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acwj extends Fragment {

    /* renamed from: a */
    public acwc f60963a;

    /* renamed from: b */
    private List f60964b;

    /* renamed from: c */
    private ListView f60965c;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.generic_list_fragment, viewGroup, false);
        this.f60965c = (ListView) inflate.findViewById(C0126R.C0129id.generic_list_view);
        this.f60964b = new ArrayList();
        acwc acwc = new acwc(getActivity(), this.f60964b);
        this.f60963a = acwc;
        this.f60965c.setAdapter((ListAdapter) acwc);
        this.f60965c.setEmptyView(inflate.findViewById(C0126R.C0129id.no_items_message));
        ((TextView) inflate.findViewById(C0126R.C0129id.no_items_message)).setText(getActivity().getString(C0126R.string.no_user_actions, new Object[]{"User Actions"}));
        this.f60965c.setOnItemClickListener(new acwi(this));
        return inflate;
    }

    public final void onResume() {
        super.onResume();
        getActivity().setTitle("User Actions");
        String string = getArguments().getString("actionType");
        C1341rz aW = ((deu) getActivity()).mo8628aW();
        if (aW != null) {
            aW.mo15852b(string);
        }
        this.f60964b.clear();
        this.f60964b.addAll(getArguments().getParcelableArrayList("userActions"));
        this.f60963a.notifyDataSetChanged();
    }
}
