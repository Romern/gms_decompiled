package p000;

import android.view.View;
import java.util.ArrayList;

/* renamed from: bjkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bjkx {

    /* renamed from: a */
    ArrayList f122907a;

    /* renamed from: b */
    public Object f122908b;

    /* renamed from: c */
    public final bjky f122909c;

    public bjkx(bjky bjky) {
        this.f122909c = bjky;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Iterable mo65347a() {
        ArrayList arrayList = this.f122907a;
        return arrayList == null ? bngx.m109376e() : arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo65345a(View view, Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo65348a(View view) {
        ArrayList arrayList = this.f122907a;
        Object obj = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            obj = this.f122908b;
        }
        mo65345a(view, obj);
    }

    /* renamed from: a */
    public final void mo65349a(Object obj) {
        ArrayList arrayList = this.f122907a;
        if (arrayList != null && arrayList.remove(obj) && this.f122907a.isEmpty()) {
            this.f122909c.mo65356a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo65350a(Object obj, boolean z) {
        if (this.f122907a == null) {
            this.f122907a = new ArrayList();
        }
        if (!z) {
            this.f122907a.add(obj);
        } else {
            this.f122907a.add(0, obj);
        }
        if (this.f122907a.size() == 1) {
            this.f122909c.mo65356a(this);
        }
    }
}
