package p000;

import android.os.Build;
import android.view.View;
import android.widget.AdapterView;
import java.util.List;

/* renamed from: bjrf */
final /* synthetic */ class bjrf implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    private final bjrh f123172a;

    /* renamed from: b */
    private final List f123173b;

    public bjrf(bjrh bjrh, List list) {
        this.f123172a = bjrh;
        this.f123173b = list;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ((bjqy) ((bjhy) ((bjqr) ((bjjm) this.f123172a).f122830n)).f122754m).mo65463a(((bwxl) this.f123173b.get(i)).f161388d);
        int i2 = Build.VERSION.SDK_INT;
    }
}
