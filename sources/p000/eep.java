package p000;

import java.util.Stack;

/* renamed from: eep */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eep {

    /* renamed from: a */
    public final StringBuilder f14788a = new StringBuilder();

    /* renamed from: b */
    private final Stack f14789b = new Stack();

    /* renamed from: c */
    private final Stack f14790c = new Stack();

    public eep() {
        this.f14790c.push(true);
        this.f14789b.push("AND");
    }

    /* renamed from: a */
    private static final String m10239a(Object obj) {
        String valueOf = String.valueOf(obj);
        if (valueOf.contains("'")) {
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2);
            sb.append("\"");
            sb.append(valueOf);
            sb.append("\"");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 2);
        sb2.append("'");
        sb2.append(valueOf);
        sb2.append("'");
        return sb2.toString();
    }

    /* renamed from: f */
    private final void m10240f() {
        this.f14790c.push(true);
        this.f14788a.append(" (");
    }

    /* renamed from: b */
    public final String mo10046b() {
        return this.f14788a.toString();
    }

    /* renamed from: c */
    public final void mo10048c() {
        this.f14788a.append(" )");
        this.f14789b.pop();
        this.f14790c.pop();
    }

    /* renamed from: d */
    public final void mo10049d() {
        if (!this.f14789b.isEmpty()) {
            mo10042a();
        }
        this.f14789b.push("AND");
        m10240f();
    }

    /* renamed from: e */
    public final void mo10050e() {
        if (!this.f14789b.isEmpty()) {
            mo10042a();
        }
        this.f14789b.push("OR");
        m10240f();
    }

    /* renamed from: b */
    public final void mo10047b(String str, Object obj) {
        mo10042a();
        StringBuilder sb = this.f14788a;
        sb.append(' ');
        sb.append(str);
        sb.append(" <= ");
        sb.append(obj);
    }

    /* renamed from: a */
    public final void mo10042a() {
        if (((Boolean) this.f14790c.peek()).booleanValue()) {
            this.f14790c.pop();
            this.f14790c.push(false);
            return;
        }
        StringBuilder sb = this.f14788a;
        String valueOf = String.valueOf((String) this.f14789b.peek());
        sb.append(valueOf.length() == 0 ? new String(" ") : " ".concat(valueOf));
    }

    /* renamed from: a */
    public final void mo10043a(String str, Object obj) {
        mo10042a();
        StringBuilder sb = this.f14788a;
        sb.append(' ');
        sb.append(str);
        sb.append(" >= ");
        sb.append(obj);
    }

    /* renamed from: a */
    public final void mo10044a(String str, Object obj, boolean z) {
        mo10042a();
        StringBuilder sb = this.f14788a;
        sb.append(' ');
        sb.append(str);
        sb.append('=');
        if (z) {
            this.f14788a.append(m10239a(obj));
        } else {
            this.f14788a.append(obj);
        }
    }

    /* renamed from: a */
    public final void mo10045a(String str, Object[] objArr) {
        mo10042a();
        StringBuilder sb = this.f14788a;
        sb.append(' ');
        sb.append(str);
        this.f14788a.append(" IN (");
        int length = objArr.length;
        boolean z = true;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            if (!z) {
                this.f14788a.append(',');
            }
            this.f14788a.append(m10239a(obj));
            i++;
            z = false;
        }
        this.f14788a.append(')');
    }
}
