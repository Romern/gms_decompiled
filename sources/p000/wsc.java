package p000;

import android.content.Context;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.location.nearby.common.fastpair.DiscoveryListItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wsc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wsc extends abh {

    /* renamed from: a */
    public final Context f51231a;

    /* renamed from: d */
    public final List f51232d = new ArrayList();

    /* renamed from: e */
    public View f51233e;

    /* renamed from: f */
    private RecyclerView f51234f;

    public wsc(Context context) {
        this.f51231a = context;
        mo170a(true);
    }

    /* renamed from: a */
    private static void m42200a(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* renamed from: f */
    private final DiscoveryListItem m42201f(int i) {
        return (DiscoveryListItem) this.f51232d.get(i);
    }

    /* renamed from: L */
    public final long mo157L(int i) {
        return (long) m42201f(i).f191735a.hashCode();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: wsc.a(android.view.View, int):void
     arg types: [android.support.v7.widget.RecyclerView, int]
     candidates:
      wsc.a(android.view.ViewGroup, int):acm
      wsc.a(acm, int):void
      abh.a(android.view.ViewGroup, int):acm
      abh.a(int, java.lang.Object):void
      abh.a(acm, int):void
      wsc.a(android.view.View, int):void */
    /* renamed from: c */
    public final void mo29347c() {
        if (this.f51233e != null) {
            int i = 0;
            m42200a((View) this.f51234f, !this.f51232d.isEmpty() ? 0 : 8);
            View view = this.f51233e;
            if (!this.f51232d.isEmpty()) {
                i = 8;
            }
            m42200a(view, i);
        }
    }

    /* renamed from: d */
    public final void mo179d(RecyclerView recyclerView) {
        this.f51234f = recyclerView;
        mo29347c();
    }

    /* renamed from: a */
    public final int mo161a() {
        return this.f51232d.size();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        return new wsb(LayoutInflater.from(this.f51231a).inflate((int) C0126R.C0128layout.devices_list_item_device, viewGroup, false));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo168a(acm acm, int i) {
        wsb wsb = (wsb) acm;
        DiscoveryListItem f = m42201f(i);
        if (wsb.mo29344a(f)) {
            wsb.mo29343a(f.f191736b);
        } else {
            wsb.mo29343a(f.f191739e);
        }
        if (wsb.mo29344a(f)) {
            wsb.mo29345b(wsb.mo29342a((int) C0126R.string.common_tap_to_pair, new Object[0]));
        } else if (!burl.m120295a(wsb.mo29346v(), f.f191740f)) {
            wsb.mo29345b(wsb.mo29342a((int) C0126R.string.common_tap_to_install_app, f.f191739e));
        } else {
            wsb.mo29345b(wsb.mo29342a((int) C0126R.string.common_tap_to_open_app, f.f191739e));
        }
        wsb.f51228s.setImageBitmap(f.f191744j);
        wsb.f201a.setOnClickListener(new wsa(this, f));
    }
}
