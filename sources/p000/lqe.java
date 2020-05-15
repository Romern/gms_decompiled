package p000;

import android.content.Context;
import android.graphics.drawable.Icon;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: lqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lqe extends abh {

    /* renamed from: a */
    private final List f26589a = new ArrayList();

    /* renamed from: a */
    private static void m19513a(bmxv bmxv, View view, ImageView imageView, Switch switchR, Button button) {
        view.setVisibility(0);
        imageView.setVisibility(8);
        switchR.setVisibility(8);
        button.setVisibility(8);
        if (bmxv.mo66815c() instanceof lqj) {
            imageView.setVisibility(0);
            imageView.setImageResource(((lqj) bmxv.mo66814b()).f26598a);
        } else if (bmxv.mo66815c() instanceof lqk) {
            lqk lqk = (lqk) bmxv.mo66814b();
            switchR.setVisibility(0);
            switchR.setOnCheckedChangeListener(null);
            switchR.setChecked(Boolean.valueOf(lqk.f26600b).booleanValue());
            switchR.setOnCheckedChangeListener(new lqb(lqk));
        } else if (bmxv.mo66815c() instanceof lqh) {
            lqh lqh = (lqh) bmxv.mo66814b();
            button.setText(lqh.f26595a);
            button.setVisibility(0);
            button.setOnClickListener(new lqc(lqh));
        } else if (bmxv.mo66815c() instanceof lqi) {
            lqi lqi = (lqi) bmxv.mo66814b();
            imageView.setVisibility(0);
            Context context = imageView.getContext();
            int b = lqi.f26597a.mo14380b();
            String a = lqi.f26597a.mo14379a();
            if (a.equals("com.google.android.gms")) {
                b = qkj.m32287a(context, b);
            }
            imageView.setImageIcon(Icon.createWithResource(a, b));
            imageView.setContentDescription(lqi.f26597a.mo14381c());
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setAdjustViewBounds(true);
            int dimensionPixelSize = imageView.getResources().getDimensionPixelSize(C0126R.dimen.autofill_list_start_icon_max_size);
            imageView.setMaxHeight(dimensionPixelSize);
            imageView.setMaxWidth(dimensionPixelSize);
        } else {
            view.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final int mo161a() {
        return this.f26589a.size();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        return new lqd(LayoutInflater.from(viewGroup.getContext()).inflate((int) C0126R.C0128layout.autofill_dynamic_list_item, viewGroup, false));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo168a(acm acm, int i) {
        lqd lqd = (lqd) acm;
        lql lql = (lql) this.f26589a.get(i);
        if (lql.mo15360a().mo66813a()) {
            lqd.f26585w.setText((CharSequence) lql.mo15360a().mo66814b());
            lqd.f26585w.setVisibility(0);
        } else {
            lqd.f26585w.setVisibility(8);
        }
        if (lql.mo15361b().mo66813a()) {
            lqd.f26586x.setText((CharSequence) lql.mo15361b().mo66814b());
            lqd.f26586x.setVisibility(0);
        } else {
            lqd.f26586x.setVisibility(8);
        }
        if (lql.mo15362c().mo66813a()) {
            lqd.f201a.setOnClickListener(new lqa(lql));
            lqd.f201a.setAlpha(1.0f);
            lqd.f201a.setEnabled(true);
        } else {
            lqd.f201a.setEnabled(false);
        }
        m19513a(lql.mo15363d(), lqd.f26581s, lqd.f26582t, lqd.f26583u, lqd.f26584v);
        m19513a(lql.mo15364e(), lqd.f26587y, lqd.f26588z, lqd.f26579A, lqd.f26580B);
    }

    /* renamed from: a */
    public final void mo15371a(Collection collection) {
        this.f26589a.clear();
        this.f26589a.addAll(collection);
        mo171aJ();
    }
}
