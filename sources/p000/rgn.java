package p000;

import android.accounts.Account;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: rgn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class rgn extends ArrayAdapter {

    /* renamed from: a */
    protected final LayoutInflater f42926a;

    /* renamed from: b */
    public final Map f42927b;

    /* renamed from: c */
    public int f42928c = -1;

    /* renamed from: d */
    public int f42929d;

    /* renamed from: e */
    private final List f42930e;

    /* renamed from: f */
    private bdej f42931f;

    /* renamed from: g */
    private rgg f42932g;

    /* renamed from: h */
    private rjx f42933h;

    /* renamed from: i */
    private rjx f42934i;

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return getView(i, view, viewGroup);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public View getView(int i, View view, ViewGroup viewGroup) {
        rgm rgm;
        if (view == null) {
            view = this.f42926a.inflate((int) C0126R.C0128layout.common_account_chip_with_disc_row, viewGroup, false);
            rgm = new rgm();
            rgm.f42922a = (TextView) view.findViewById(C0126R.C0129id.account_name);
            rgm.f42923b = (TextView) view.findViewById(C0126R.C0129id.account_display_name);
            rgm.f42924c = (AccountParticleDisc) view.findViewById(C0126R.C0129id.account_particle_disc);
            rgm.f42924c.mo60576a(this.f42931f, rgl.class);
            view.setTag(rgm);
        } else {
            rgm = (rgm) view.getTag();
        }
        Account account = (Account) this.f42930e.get(i);
        rgm.f42922a.setText(account.name);
        rgj rgj = (rgj) this.f42927b.get(account.name);
        if (rgj != null) {
            rgm.f42923b.setText(rgj.f42918a);
            Bitmap bitmap = rgj.f42919b;
            if (bitmap == null) {
                rgm.f42924c.mo60577a(new rgl(this, account.name));
            } else if (bitmap != rgm.f42925d) {
                rgm.f42925d = bitmap;
                rgm.f42924c.mo60577a(new rgl(this, account.name));
            }
        }
        if (i == this.f42928c) {
            view.setBackgroundColor(-7829368);
        }
        return view;
    }

    public rgn(Context context, List list) {
        super(context, 17367055, list);
        this.f42932g = new rgg(context);
        this.f42929d = context.getResources().getDimensionPixelSize(ric.m33628a(this.f42932g.f42914a, C0126R.attr.common_account_chip_avatar_image_size, C0126R.dimen.common_account_chip_avatar_size));
        this.f42927b = Collections.synchronizedMap(new HashMap());
        sdo.m34974b(!list.contains(null));
        this.f42930e = list;
        this.f42926a = LayoutInflater.from(context);
        allp allp = new allp();
        allp.f73626a = 80;
        allq a = allp.mo40491a();
        rjx d = allr.m61237d(context, a);
        rjx a2 = allr.m61234a(context, a);
        this.f42934i = d;
        this.f42933h = a2;
        adap adap = new adap(new adzt(Looper.getMainLooper()));
        bqgj a3 = snp.m35702a(9);
        this.f42931f = new bdej(adap);
        rgk rgk = new rgk();
        AccountParticleDisc.m94876a(getContext(), this.f42931f, a3, rgk, rgk, rgl.class);
        ArrayList arrayList = new ArrayList(this.f42930e.size() + 1);
        rjx rjx = this.f42934i;
        alkx alkx = new alkx();
        alkx.f73613b = false;
        bqgg a4 = adbb.m50102a(rjx.mo24710a(alkx));
        bqga.m112781a(a4, new rgh(this), adap);
        arrayList.add(a4);
        List list2 = this.f42930e;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Account account = (Account) list2.get(i);
            bqgg a5 = adbb.m50102a(this.f42933h.mo24713a(account.name, 1, 1));
            bqga.m112781a(a5, new rgi(this, account), adap);
            arrayList.add(a5);
        }
        bqga.m112782b(arrayList).mo69215a(new rgf(this), adap);
    }
}
