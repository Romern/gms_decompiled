package p000;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: aasg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aasg {

    /* renamed from: a */
    public aasm f56426a;

    /* renamed from: b */
    public int f56427b;

    /* renamed from: c */
    public String f56428c;

    /* renamed from: d */
    public float f56429d;

    /* renamed from: e */
    public String f56430e;

    /* renamed from: f */
    public boolean f56431f;

    /* renamed from: g */
    public wzh f56432g;

    /* renamed from: h */
    public int f56433h = 1;

    /* renamed from: i */
    public int f56434i;

    /* renamed from: j */
    private int f56435j;

    private aasg() {
    }

    /* renamed from: a */
    public static aasg m46855a(int i, int i2, String str, float f, int i3, wzh wzh, int i4) {
        aasg aasg = new aasg();
        aasg.f56426a = null;
        aasg.f56430e = null;
        aasg.f56433h = i;
        aasg.f56427b = i2;
        aasg.f56428c = str;
        aasg.f56429d = f;
        aasg.f56431f = false;
        aasg.f56434i = i3;
        aasg.f56432g = wzh;
        aasg.f56435j = i4;
        return aasg;
    }

    /* renamed from: a */
    public final boolean mo31704a() {
        return this.f56435j == 2;
    }

    /* renamed from: b */
    public final boolean mo31705b() {
        return this.f56435j == 3;
    }

    /* renamed from: c */
    public final boolean mo31706c() {
        aasm aasm = this.f56426a;
        return aasm != null && aasm.f56515y == 34;
    }

    /* renamed from: d */
    public final String mo31707d() {
        aasm aasm = this.f56426a;
        if (aasm != null && aasm.mo31737t()) {
            String queryParameter = Uri.parse(this.f56426a.f56497g).getQueryParameter("hl");
            if (!TextUtils.isEmpty(queryParameter)) {
                return queryParameter;
            }
        }
        return aasw.m46952a();
    }

    /* renamed from: a */
    public static aasg m46856a(int i, int i2, String str, float f, boolean z, int i3, wzh wzh) {
        return m46855a(i, i2, str, f, i3, wzh, !z ? 1 : 2);
    }

    /* renamed from: a */
    public static aasg m46857a(aasm aasm, int i, int i2, String str, float f) {
        aasg aasg = new aasg();
        aasg.mo31703a(aasm);
        aasg.f56433h = i;
        aasg.f56427b = i2;
        aasg.f56428c = str;
        aasg.f56429d = f;
        aasg.f56431f = false;
        aasg.f56434i = 1;
        aasg.f56432g = null;
        aasg.f56435j = 1;
        return aasg;
    }

    /* renamed from: a */
    public final void mo31703a(aasm aasm) {
        this.f56426a = aasm;
        String b = aasm != null ? aasm.mo31717b() : null;
        if (TextUtils.isEmpty(b) || "http".equals(b)) {
            b = "https://www.google.com";
        }
        this.f56430e = b;
    }
}
