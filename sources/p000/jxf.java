package p000;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;

/* renamed from: jxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class jxf extends jxx {

    /* renamed from: h */
    protected static final imr f23442h = imr.m15727a("title_res_id");

    /* renamed from: a */
    private img f23443a;

    /* renamed from: a */
    protected static ims m17460a(rrq rrq, boolean z, int i) {
        Bundle bundle;
        ims ims = new ims();
        imr imr = jwz.f23428i;
        if (rrq != null) {
            bundle = rrq.mo25045a();
        } else {
            bundle = null;
        }
        ims.mo13148b(imr, bundle);
        ims.mo13148b(jwz.f23429j, Boolean.valueOf(z));
        ims.mo13148b(f23442h, Integer.valueOf(i));
        return ims;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: c */
    private final void mo7860c() {
        int i;
        boolean a = rrp.m34306a(mo14203f().f43552a);
        LayoutInflater from = LayoutInflater.from(this);
        if (!a) {
            i = C0126R.C0128layout.auth_generic_suw_activity;
        } else {
            i = C0126R.C0128layout.auth_generic_suw_glif_activity;
        }
        this.f23443a = (img) from.inflate(i, (ViewGroup) null, false);
        cbyu.m128929c();
        this.f23443a.mo7885b();
        this.f23443a.mo7884a(srk.m36121a(cbxe.m128828b()));
        this.f23443a.mo7880a();
        if (cbzk.m128961c()) {
            this.f23435m = (imj) this.f23443a;
        } else if (((Boolean) mo14202g().mo13147a(jwz.f23429j, false)).booleanValue()) {
            this.f23443a.mo7881a(getWindow());
        } else {
            this.f23443a.mo7882a(getWindow(), this);
        }
        rrp.m34302a((ViewGroup) this.f23443a);
        Integer num = (Integer) mo14202g().mo13146a(f23442h);
        if (!(num == null || num.intValue() == 0)) {
            this.f23443a.mo13137a(getText(num.intValue()));
        }
        setContentView((View) this.f23443a);
        bizb.m103020a(getWindow(), gnv.m13520aB());
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo7860c();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo7860c();
    }
}
