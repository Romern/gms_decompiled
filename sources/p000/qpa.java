package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* renamed from: qpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qpa extends ArrayAdapter {

    /* renamed from: a */
    private final LayoutInflater f41907a;

    public qpa(Context context) {
        super(context, 0);
        this.f41907a = LayoutInflater.from(context);
    }

    public final int getItemViewType(int i) {
        qoz qoz = (qoz) getItem(i);
        if (qoz != null) {
            return qoz.mo24188b();
        }
        return -1;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        qoz qoz = (qoz) getItem(i);
        if (qoz != null) {
            return qoz.mo24186a(this.f41907a, view, viewGroup);
        }
        return new View(getContext());
    }

    public final int getViewTypeCount() {
        return 4;
    }
}
