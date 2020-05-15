package p000;

import android.text.TextUtils;

/* renamed from: amux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class amux {

    /* renamed from: a */
    public final amuw f75978a;

    /* renamed from: b */
    public String f75979b;

    /* renamed from: c */
    public boolean f75980c;

    protected amux(amuw amuw, String str) {
        this.f75978a = amuw;
        this.f75979b = str;
    }

    /* renamed from: a */
    public abstract Object mo41360a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41361a(String str) {
        this.f75979b = str;
        this.f75980c = TextUtils.isEmpty(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo41362b() {
        sdo.m34970a(!this.f75980c);
    }
}
