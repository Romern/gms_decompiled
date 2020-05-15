package p000;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import java.util.List;

/* renamed from: bkeh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkeh extends ArrayAdapter {

    /* renamed from: b */
    public static final /* synthetic */ int f124080b = 0;

    /* renamed from: a */
    public final List f124081a;

    /* renamed from: c */
    private final Filter f124082c = new bkeg(this);

    public bkeh(Context context, List list) {
        super(context, 17367050, m105433a(list));
        this.f124081a = m105433a(list);
    }

    /* renamed from: a */
    private static List m105433a(List list) {
        return list.size() > 3 ? list.subList(0, 3) : list;
    }

    public final Filter getFilter() {
        return this.f124082c;
    }
}
