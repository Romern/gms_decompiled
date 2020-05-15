package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wrz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wrz extends abh {

    /* renamed from: a */
    public final apr f51222a;

    /* renamed from: d */
    public final Uri f51223d;

    /* renamed from: e */
    public final List f51224e = new ArrayList();

    /* renamed from: f */
    private final Context f51225f;

    public wrz(Context context, apr apr, Uri uri) {
        this.f51225f = context;
        this.f51222a = apr;
        this.f51223d = uri;
    }

    /* renamed from: a */
    public final int mo161a() {
        return this.f51224e.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo29339c() {
        this.f51224e.clear();
        try {
            this.f51222a.mo2273a(this.f51223d);
            this.f51224e.addAll(wup.m42310a(this.f51222a.mo2277c(this.f51223d)));
        } catch (IllegalArgumentException e) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("wrz", "c", 48, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("DeviceDetailsSliceItemAdapter.updateSliceItem meet exception, optional module might not be installed.");
        }
        bnsl bnsl2 = (bnsl) wtw.f51331a.mo68390d();
        bnsl2.mo68432a("wrz", "c", 52, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68409a("updateSliceItem called, Get slice items %d", this.f51224e.size());
        mo171aJ();
    }

    /* renamed from: d */
    public final void mo29340d() {
        try {
            this.f51222a.mo2275b(this.f51223d);
        } catch (IllegalStateException | NullPointerException e) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("wrz", "d", 65, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("DeviceDetailsSliceItemAdapter.unpinSlice meet exception!");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        return new wry(LayoutInflater.from(this.f51225f).inflate((int) C0126R.C0128layout.fast_pair_device_details_slice_item, viewGroup, false));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo168a(acm acm, int i) {
        wry wry = (wry) acm;
        wuo wuo = (wuo) this.f51224e.get(i);
        wry.f51219s.setText(wuo.mo29421a());
        wry.f51220t.setText(wuo.mo29422b());
        wry.f51221u.setImageIcon(wuo.mo29423c().mo1113e());
        wry.f201a.setOnClickListener(new wrx(this, wuo));
    }

    /* renamed from: a */
    public final void mo29338a(wuo wuo) {
        try {
            wuo.mo29424d().send(this.f51225f, 0, (Intent) null);
        } catch (PendingIntent.CanceledException e) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("wrz", "a", 93, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("DeviceDetailsSliceItemAdapter.onItemClicked failed with item:%s", wuo.mo29421a());
        }
    }
}
