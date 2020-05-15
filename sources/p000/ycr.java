package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.fido.u2f.api.view.BleDeviceIdentifier;
import java.util.List;

/* renamed from: ycr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ycr extends BaseAdapter {

    /* renamed from: a */
    public final List f53609a;

    /* renamed from: b */
    public final xic f53610b;

    /* renamed from: c */
    private final LayoutInflater f53611c;

    public ycr(LayoutInflater layoutInflater, List list, xic xic) {
        sdo.m34959a(layoutInflater);
        this.f53611c = layoutInflater;
        sdo.m34959a(list);
        this.f53609a = list;
        this.f53610b = xic;
    }

    public final int getCount() {
        return this.f53609a.size();
    }

    public final Object getItem(int i) {
        if (this.f53609a.isEmpty() || i >= this.f53609a.size()) {
            return null;
        }
        return this.f53609a.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f53611c.inflate((int) C0126R.C0128layout.list_item_device, (ViewGroup) null);
        }
        view.setOnClickListener(new ycq(this, i));
        ((TextView) view.findViewById(C0126R.C0129id.device_name)).setText(((BleDeviceIdentifier) this.f53609a.get(i)).f31954a);
        return view;
    }
}
