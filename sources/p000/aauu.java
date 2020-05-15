package p000;

import android.content.Context;
import android.view.View;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aauu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aauu extends Spinner implements aavk, aatx, aatq {

    /* renamed from: a */
    public aave f56625a = null;

    /* renamed from: b */
    private final boolean f56626b;

    /* renamed from: c */
    private aatr f56627c;

    /* renamed from: d */
    private List f56628d = null;

    public aauu(Context context, aatr aatr, bzqi bzqi) {
        super(context);
        this.f56627c = aatr;
        boolean z = bzqi.f170998d;
        this.f56626b = z;
        if (z) {
            setOnItemSelectedListener(new aaus(this));
        }
        setTag(bzqi.f170996b);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        bxwc bxwc = bzqi.f171000f;
        int size = bxwc.size();
        int i = -1;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            bzqk bzqk = (bzqk) bxwc.get(i3);
            arrayList.add(bzqk.f171018b);
            arrayList2.add(stm.m36299a(bzqk.f171019c));
            if (bzqk.f171020d) {
                i = i2;
            }
            i2++;
        }
        setAdapter((SpinnerAdapter) new aavh(context, arrayList2, arrayList));
        if (i >= 0) {
            setSelection(i);
        }
        this.f56627c.mo31783a(this);
    }

    /* renamed from: a */
    public final void mo31780a(aave aave) {
        this.f56625a = aave;
    }

    /* renamed from: b */
    public final boolean mo31782b() {
        return this.f56627c.getVisibility() == 0;
    }

    /* renamed from: bz */
    public final List mo31788bz() {
        if (this.f56626b) {
            return Collections.singletonList(this);
        }
        return Collections.emptyList();
    }

    /* renamed from: c */
    public final List mo31789c() {
        String d = mo31794d();
        if (d == null) {
            return Collections.emptyList();
        }
        return Collections.singletonList(aatb.m46961a((String) getTag(), d));
    }

    /* renamed from: d */
    public final String mo31794d() {
        View selectedView = getSelectedView();
        if (selectedView != null) {
            return (String) selectedView.getTag();
        }
        return null;
    }

    /* renamed from: e */
    public final void mo31795e() {
        List list = this.f56628d;
        if (list != null) {
            aavg.m47063a(list);
            aave aave = this.f56625a;
            if (aave != null) {
                aave.mo31824a();
            }
        }
    }

    /* renamed from: a */
    public final void mo31792a(List list) {
        this.f56628d = list;
        setOnItemSelectedListener(new aaut(this));
    }

    /* renamed from: a */
    public final boolean mo31781a() {
        return getSelectedView() != null;
    }
}
