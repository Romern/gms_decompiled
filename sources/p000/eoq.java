package p000;

import android.accounts.Account;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: eoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class eoq extends ArrayAdapter {

    /* renamed from: d */
    private static final eoo f15423d = new eok();

    /* renamed from: a */
    protected final LayoutInflater f15424a;

    /* renamed from: b */
    public final Map f15425b;

    /* renamed from: c */
    public int f15426c;

    /* renamed from: e */
    private final List f15427e;

    /* renamed from: f */
    private int f15428f = -1;

    /* renamed from: g */
    private eoo f15429g;

    /* renamed from: h */
    private rjx f15430h;

    /* renamed from: i */
    private rjx f15431i;

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return getView(i, view, viewGroup);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public View getView(int i, View view, ViewGroup viewGroup) {
        eop eop;
        if (view == null) {
            view = this.f15424a.inflate(this.f15429g.mo10359a(), viewGroup, false);
            eop = new eop();
            eop.f15419a = (TextView) view.findViewById(this.f15429g.mo10360b());
            eop.f15420b = (TextView) view.findViewById(this.f15429g.mo10361c());
            eop.f15421c = (ImageView) view.findViewById(this.f15429g.mo10362d());
            view.setTag(eop);
        } else {
            eop = (eop) view.getTag();
        }
        Account account = (Account) this.f15427e.get(i);
        eop.f15419a.setText(account.name);
        eon eon = (eon) this.f15425b.get(account.name);
        if (eon != null) {
            eop.f15420b.setText(eon.f15417a);
            Bitmap bitmap = eon.f15418b;
            if (bitmap == null) {
                eop.f15421c.setImageBitmap(null);
            } else if (bitmap != eop.f15422d) {
                eop.f15422d = bitmap;
                eop.f15421c.setImageBitmap(bitmap);
            }
        }
        if (i == this.f15428f) {
            view.setBackgroundColor(-7829368);
        }
        return view;
    }

    public eoq(Context context, int i, eoo eoo, List list) {
        super(context, i, list);
        this.f15429g = eoo == null ? f15423d : eoo;
        this.f15426c = context.getResources().getDimensionPixelSize(this.f15429g.mo10363e());
        this.f15425b = Collections.synchronizedMap(new HashMap());
        sdo.m34974b(!list.contains(null));
        this.f15427e = list;
        this.f15424a = LayoutInflater.from(context);
        allp allp = new allp();
        allp.f73626a = 80;
        allq a = allp.mo40491a();
        rjx d = allr.m61237d(context, a);
        rjx a2 = allr.m61234a(context, a);
        this.f15431i = d;
        this.f15430h = a2;
        adap adap = new adap(new adzt(Looper.getMainLooper()));
        ArrayList arrayList = new ArrayList(this.f15427e.size() + 1);
        rjx rjx = this.f15431i;
        alkx alkx = new alkx();
        alkx.f73613b = false;
        bqgg a3 = adbb.m50102a(rjx.mo24710a(alkx));
        bqga.m112781a(a3, new eol(this), adap);
        arrayList.add(a3);
        for (Account account : this.f15427e) {
            bqgg a4 = adbb.m50102a(this.f15430h.mo24713a(account.name, 1, 0));
            bqga.m112781a(a4, new eom(this, account), adap);
            arrayList.add(a4);
        }
        bqga.m112782b(arrayList).mo69214a(new eoj(this), adap);
    }
}
