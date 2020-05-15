package p000;

import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: zqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zqg extends Fragment implements View.OnClickListener {

    /* renamed from: a */
    private zqd f55692a;

    /* renamed from: b */
    private ImageView f55693b;

    /* renamed from: c */
    private TextView f55694c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final zqf mo31322a() {
        return (zqf) getActivity();
    }

    public void onClick(View view) {
        mo31322a().mo19191h();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f55692a = new zqd(this);
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.fitness_manage_data_sources_types_fragment, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0126R.C0129id.fitness_manage_data_source_detail_list);
        getActivity();
        recyclerView.setLayoutManager(new aah());
        recyclerView.setAdapter(this.f55692a);
        this.f55693b = (ImageView) inflate.findViewById(C0126R.C0129id.fitness_manage_data_sources_origin_icon);
        this.f55694c = (TextView) inflate.findViewById(C0126R.C0129id.fitness_manage_data_sources_origin_name);
        inflate.findViewById(C0126R.C0129id.fitness_manage_data_sources_type_delete_all_button).setOnClickListener(this);
        return inflate;
    }

    public final void onResume() {
        super.onResume();
        this.f55694c.setText("");
        this.f55693b.setVisibility(8);
        this.f55693b.setImageDrawable(null);
        ArrayList arrayList = new ArrayList();
        bnrd a = mo31322a().mo19190g().iterator();
        while (a.hasNext()) {
            zqj zqj = (zqj) a.next();
            arrayList.add(new zqe(zqj, zqj.mo31324a(getActivity())));
        }
        Collections.sort(arrayList);
        zqd zqd = this.f55692a;
        zqd.f55688a = arrayList;
        zqd.mo171aJ();
    }
}
