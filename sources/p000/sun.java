package p000;

import android.content.Context;
import android.widget.AdapterView;

/* renamed from: sun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sun {

    /* renamed from: a */
    public AdapterView.OnItemSelectedListener f45175a;

    /* renamed from: b */
    public String f45176b;

    /* renamed from: c */
    public String[] f45177c;

    /* renamed from: d */
    private final Context f45178d;

    /* renamed from: e */
    private final C1341rz f45179e;

    /* renamed from: f */
    private String f45180f;

    /* renamed from: g */
    private CharSequence f45181g;

    public sun(C1341rz rzVar) {
        this.f45179e = rzVar;
        Context g = rzVar.mo15868g();
        this.f45178d = g;
        this.f45180f = g.getPackageName();
    }

    /* renamed from: a */
    public final suo mo26111a() {
        if (this.f45177c == null) {
            this.f45177c = soz.m35797b(soz.m35801d(this.f45178d, this.f45180f));
        }
        suo suo = new suo(this.f45178d, this.f45180f, this.f45181g, this.f45177c);
        int a = suo.mo26113a(this.f45176b);
        if (a != -1) {
            suo.mo26115a(a);
        }
        suo.f45184c = this.f45175a;
        suo.mo26116a(this.f45179e);
        return suo;
    }

    public sun(C1341rz rzVar, CharSequence charSequence) {
        this(rzVar);
        this.f45181g = charSequence;
    }

    /* renamed from: a */
    public final void mo26112a(int i) {
        this.f45181g = this.f45178d.getText(i);
    }
}
