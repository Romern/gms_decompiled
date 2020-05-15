package p000;

import android.view.View;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: bjky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjky {

    /* renamed from: a */
    public bjkw f122910a;

    /* renamed from: b */
    bjkz f122911b;

    /* renamed from: c */
    public final ArrayList f122912c = new ArrayList();

    /* renamed from: d */
    private final ArrayList f122913d = new ArrayList(2);

    /* renamed from: a */
    public final void mo65351a() {
        ArrayList arrayList = this.f122913d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bjkx bjkx = (bjkx) arrayList.get(i);
            ArrayList arrayList2 = bjkx.f122907a;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                bjkx.f122907a.clear();
                bjkx.f122909c.mo65356a(bjkx);
            }
        }
    }

    /* renamed from: b */
    public final void mo65357b(View.OnClickListener onClickListener) {
        bjkz bjkz = this.f122911b;
        if (bjkz != null) {
            bjkz.mo65349a(onClickListener);
        }
    }

    /* renamed from: b */
    public final void mo65358b(View view) {
        ArrayList arrayList = this.f122913d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bjkx) arrayList.get(i)).mo65345a(view, (Object) null);
        }
        this.f122912c.remove(view);
    }

    /* renamed from: a */
    public final void mo65352a(View.OnClickListener onClickListener) {
        mo65353a(onClickListener, false);
    }

    /* renamed from: a */
    public final void mo65353a(View.OnClickListener onClickListener, boolean z) {
        if (this.f122911b == null) {
            bjkz bjkz = new bjkz(this);
            this.f122911b = bjkz;
            this.f122913d.add(bjkz);
        }
        this.f122911b.mo65350a(onClickListener, z);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bjkx.a(java.lang.Object, boolean):void
     arg types: [android.view.View$OnFocusChangeListener, int]
     candidates:
      bjkw.a(android.view.View, java.lang.Object):void
      bjkx.a(android.view.View, java.lang.Object):void
      bjkx.a(java.lang.Object, boolean):void */
    /* renamed from: a */
    public final void mo65354a(View.OnFocusChangeListener onFocusChangeListener) {
        if (this.f122910a == null) {
            bjkw bjkw = new bjkw(this);
            this.f122910a = bjkw;
            this.f122913d.add(bjkw);
        }
        this.f122910a.mo65350a((Object) onFocusChangeListener, false);
    }

    /* renamed from: a */
    public final void mo65355a(View view) {
        boolean z;
        bmxy.m108589a(!view.hasOnClickListeners(), String.format(Locale.US, "Can not add a view with click listeners to ViewObserver. View: %s", view));
        if (view.getOnFocusChangeListener() == null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, String.format(Locale.US, "Can not add a view with focus listener to ViewObserver. View: %s", view));
        ArrayList arrayList = this.f122913d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bjkx) arrayList.get(i)).mo65348a(view);
        }
        this.f122912c.add(view);
    }

    /* renamed from: a */
    public final void mo65356a(bjkx bjkx) {
        ArrayList arrayList = this.f122912c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bjkx.mo65348a((View) arrayList.get(i));
        }
    }
}
