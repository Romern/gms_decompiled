package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;

/* renamed from: rgw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rgw extends ArrayAdapter {

    /* renamed from: a */
    private final LayoutInflater f42943a;

    /* renamed from: b */
    private final ArrayList f42944b;

    public rgw(Context context, ArrayList arrayList) {
        super(context, 17367043, arrayList);
        this.f42944b = arrayList;
        this.f42943a = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        rgy rgy;
        if (view == null) {
            view = this.f42943a.inflate((int) C0126R.C0128layout.common_account_type_picker_row, (ViewGroup) null);
            rgy = new rgy();
            rgy.f42949b = (TextView) view.findViewById(C0126R.C0129id.account_row_text);
            rgy.f42948a = (ImageView) view.findViewById(C0126R.C0129id.account_row_icon);
            view.setTag(rgy);
        } else {
            rgy = (rgy) view.getTag();
        }
        rgy.f42949b.setText(((rgx) this.f42944b.get(i)).f42946b);
        rgy.f42948a.setImageDrawable(((rgx) this.f42944b.get(i)).f42947c);
        return view;
    }
}
