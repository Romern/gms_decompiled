package p000;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import java.util.List;

/* renamed from: zqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zqd extends abh {

    /* renamed from: a */
    public List f55688a = bngx.m109376e();

    /* renamed from: d */
    final /* synthetic */ zqg f55689d;

    public zqd(zqg zqg) {
        this.f55689d = zqg;
    }

    /* renamed from: a */
    public final int mo161a() {
        return this.f55688a.size();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        return new zqc(this.f55689d, LayoutInflater.from(viewGroup.getContext()).inflate((int) C0126R.C0128layout.fitness_manage_data_sources_type, viewGroup, false));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo168a(acm acm, int i) {
        zqc zqc = (zqc) acm;
        zqe zqe = (zqe) this.f55688a.get(i);
        zqc.f55686t = zqe;
        zqc.f55685s.setText(zqe.f55691b);
    }
}
