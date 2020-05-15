package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.List;

/* renamed from: atqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atqn extends ArrayAdapter {

    /* renamed from: a */
    private final LayoutInflater f90677a;

    public atqn(Context context, List list) {
        super(context, 0, list);
        this.f90677a = LayoutInflater.from(context);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        atqm atqm = (atqm) getItem(i);
        if (view == null) {
            view = this.f90677a.inflate((int) C0126R.C0128layout.tp_select_other_payment_option_item, (ViewGroup) null);
            view.setOnClickListener(atqm.f90676e);
        }
        view.setTag(atqm);
        ((ImageView) view.findViewById(C0126R.C0129id.left_icon)).setImageDrawable(atqm.f90674c);
        ((TextView) view.findViewById(C0126R.C0129id.payment_option_title)).setText(atqm.f90672a);
        ((TextView) view.findViewById(C0126R.C0129id.payment_option_subheader)).setText(atqm.f90673b);
        boolean z = atqm.f90675d;
        ((ImageView) view.findViewById(C0126R.C0129id.checkmark)).setVisibility(8);
        return view;
    }
}
