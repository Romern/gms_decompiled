package p000;

import java.util.Map;

/* renamed from: bknh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bknh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f124930a;

    /* renamed from: b */
    final /* synthetic */ bkoj f124931b;

    /* renamed from: c */
    final /* synthetic */ Map f124932c;

    /* renamed from: d */
    final /* synthetic */ String f124933d;

    /* renamed from: e */
    final /* synthetic */ bknm f124934e;

    /* renamed from: f */
    final /* synthetic */ bkte f124935f;

    /* renamed from: g */
    final /* synthetic */ bkni f124936g;

    public bknh(bkni bkni, String str, bkoj bkoj, Map map, String str2, bknm bknm, bkte bkte) {
        this.f124936g = bkni;
        this.f124930a = str;
        this.f124931b = bkoj;
        this.f124932c = map;
        this.f124933d = str2;
        this.f124934e = bknm;
        this.f124935f = bkte;
    }

    public final void run() {
        this.f124936g.f124939a.mo66137a(this.f124930a, this.f124931b, this.f124932c, this.f124933d, new bkng(this), this.f124935f);
    }
}
