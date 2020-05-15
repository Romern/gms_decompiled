package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.List;

/* renamed from: aavh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aavh extends ArrayAdapter {

    /* renamed from: a */
    private final List f56648a;

    public aavh(Context context, List list, List list2) {
        super(context, 17367049, list);
        this.f56648a = list2;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        view2.setTag(this.f56648a.get(i));
        return view2;
    }
}
