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

/* renamed from: acun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acun extends Fragment {

    /* renamed from: a */
    public acui f60819a;

    /* renamed from: b */
    private List f60820b;

    /* renamed from: c */
    private ListView f60821c;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.generic_list_fragment, viewGroup, false);
        this.f60821c = (ListView) inflate.findViewById(C0126R.C0129id.generic_list_view);
        this.f60820b = new ArrayList();
        acui acui = new acui(getActivity(), this.f60820b);
        this.f60819a = acui;
        this.f60821c.setAdapter((ListAdapter) acui);
        this.f60821c.setEmptyView(inflate.findViewById(C0126R.C0129id.no_items_message));
        ((TextView) inflate.findViewById(C0126R.C0129id.no_items_message)).setText((int) C0126R.string.no_errors);
        this.f60821c.setOnItemClickListener(new acum(this));
        return inflate;
    }

    public final void onResume() {
        super.onResume();
        getActivity().setTitle((int) C0126R.string.errors_title);
        String string = getArguments().getString("callType");
        String string2 = getContext().getString(getArguments().getInt("errorCode"));
        C1341rz aW = ((deu) getActivity()).mo8628aW();
        if (aW != null) {
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2 + String.valueOf(string2).length());
            sb.append(string);
            sb.append(": ");
            sb.append(string2);
            aW.mo15852b(sb.toString());
        }
        this.f60820b.clear();
        this.f60820b.addAll(getArguments().getParcelableArrayList("errors"));
        this.f60819a.notifyDataSetChanged();
    }
}
