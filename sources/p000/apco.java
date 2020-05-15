package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: apco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apco extends abh {

    /* renamed from: a */
    public final List f84139a = new ArrayList();

    /* renamed from: d */
    Context f84140d;

    public apco() {
        new ArrayList();
        new ArrayList();
    }

    /* renamed from: a */
    public final int mo161a() {
        return this.f84139a.size();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        this.f84140d = viewGroup.getContext();
        return new apcn(LayoutInflater.from(this.f84140d).inflate((int) C0126R.C0128layout.romanesco_contact_row, viewGroup, false));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo168a(acm acm, int i) {
        bmxv bmxv;
        bmxv bmxv2;
        apcn apcn = (apcn) acm;
        if (i >= 0 && i < mo161a()) {
            bmxv = bmxv.m108566b(((apcl) this.f84139a.get(i)).mo47104a());
        } else {
            bmxv = bmvz.f131120a;
        }
        if (i >= 0 && i < mo161a()) {
            bmxv2 = bmxv.m108566b(((apcl) this.f84139a.get(i)).mo47105b());
        } else {
            bmxv2 = bmvz.f131120a;
        }
        if (bmxv.mo66813a() && bmxv2.mo66813a()) {
            String string = this.f84140d.getResources().getString(C0126R.string.romanesco_avatar, bmxv.mo66814b());
            apcn.f84137s.setText((String) bmxv.mo66814b());
            apcn.f84138t.setImageDrawable((Drawable) bmxv2.mo66814b());
            apcn.f84138t.setContentDescription(string);
        }
    }
}
