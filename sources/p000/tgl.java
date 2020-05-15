package p000;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: tgl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tgl implements C0038ax {

    /* renamed from: a */
    public int f45939a;

    /* renamed from: b */
    public final tim f45940b;

    /* renamed from: c */
    public final tie f45941c;

    /* renamed from: d */
    public final Activity f45942d;

    /* renamed from: e */
    public final String f45943e;

    /* renamed from: f */
    public final View f45944f;

    /* renamed from: g */
    private final ViewGroup f45945g;

    /* renamed from: h */
    private final ViewGroup f45946h;

    /* renamed from: i */
    private final List f45947i = new ArrayList();

    public tgl(View view, Activity activity, String str, tie tie, tim tim) {
        this.f45944f = view;
        this.f45945g = (ViewGroup) view.findViewById(C0126R.C0129id.row1);
        this.f45946h = (ViewGroup) view.findViewById(C0126R.C0129id.row2);
        this.f45942d = activity;
        this.f45943e = str;
        this.f45941c = tie;
        this.f45940b = tim;
        view.setVisibility(8);
        ViewGroup[] viewGroupArr = {this.f45945g, this.f45946h};
        for (int i = 0; i < 2; i++) {
            ViewGroup viewGroup = viewGroupArr[i];
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                this.f45947i.add(new tgk(this, viewGroup.getChildAt(i2)));
            }
        }
    }

    /* renamed from: a */
    public final void mo2511a(bmxv bmxv) {
        if (!bmxv.mo66813a() || ((bzjh) bmxv.mo66814b()).f170286a.isEmpty()) {
            this.f45944f.setVisibility(8);
            return;
        }
        this.f45939a = 300;
        bzjh bzjh = (bzjh) bmxv.mo66814b();
        Iterator it = bzjh.f170286a.iterator();
        List list = this.f45947i;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            tgk tgk = (tgk) list.get(i);
            if (it.hasNext()) {
                bzjj bzjj = (bzjj) it.next();
                tgl tgl = tgk.f45938c;
                String str = bzjj.f170297c;
                if (TextUtils.isEmpty(str)) {
                    str = bzjj.f170298d;
                }
                if (TextUtils.isEmpty(str)) {
                    str = cgnq.m146307b();
                }
                String a = rzi.m34705a(tey.m36894b(str), tgl.f45944f.getResources().getDimensionPixelSize(C0126R.dimen.gm_card_avatar_diameter));
                tgl tgl2 = tgk.f45938c;
                tie tie = tgl2.f45941c;
                int i2 = tgl2.f45939a;
                tgl2.f45939a = i2 + 1;
                tie.mo26557a(a, i2, new tgi(tgk));
                if (!bzjj.f170295a.isEmpty()) {
                    tgk.f45936a.setText(bzjj.f170295a);
                }
                if (!bzjj.f170296b.isEmpty()) {
                    String str2 = bzjj.f170296b;
                    if (tgk.f45938c.f45943e != null) {
                        tgk.f45937b.setOnClickListener(new tgj(tgk, str2));
                    }
                }
                tgk.mo26491a(0);
            } else {
                tgk.mo26491a(4);
            }
        }
        if (bzjh.f170286a.size() <= this.f45945g.getChildCount()) {
            this.f45946h.setVisibility(8);
        }
        this.f45944f.setVisibility(0);
    }
}
