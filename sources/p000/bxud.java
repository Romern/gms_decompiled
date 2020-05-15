package p000;

import java.util.List;
import java.util.Map;

/* renamed from: bxud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxud implements bxxp {

    /* renamed from: a */
    private final bxuc f164829a;

    /* renamed from: b */
    private int f164830b;

    /* renamed from: c */
    private int f164831c;

    /* renamed from: d */
    private int f164832d = 0;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bxwd.a(java.lang.Object, java.lang.String):void
     arg types: [bxuc, java.lang.String]
     candidates:
      bxwd.a(java.lang.Object, java.lang.Object):java.lang.Object
      bxwd.a(java.lang.Object, java.lang.String):void */
    private bxud(bxuc bxuc) {
        bxwd.m124084a((Object) bxuc, "input");
        this.f164829a = bxuc;
        bxuc.f164828d = this;
    }

    /* renamed from: a */
    public static bxud m123454a(bxuc bxuc) {
        bxud bxud = bxuc.f164828d;
        return bxud == null ? new bxud(bxuc) : bxud;
    }

    /* renamed from: b */
    private final void m123457b(int i) {
        if (this.f164829a.mo73784B() != i) {
            throw bxwf.m124088a();
        }
    }

    /* renamed from: c */
    private final Object m123458c(bxxv bxxv, bxus bxus) {
        int n = this.f164829a.mo73805n();
        bxuc bxuc = this.f164829a;
        int i = bxuc.f164825a;
        int i2 = bxuc.f164826b;
        if (i < 100) {
            int c = bxuc.mo73791c(n);
            Object a = bxxv.mo74218a();
            this.f164829a.f164825a++;
            bxxv.mo74220a(a, this, bxus);
            bxxv.mo74225d(a);
            this.f164829a.mo73787a(0);
            bxuc bxuc2 = this.f164829a;
            bxuc2.f164825a--;
            bxuc2.mo73793d(c);
            return a;
        }
        throw new bxwf("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: d */
    private final Object m123460d(bxxv bxxv, bxus bxus) {
        int i = this.f164831c;
        this.f164831c = bxzh.m124562a(bxzh.m124563b(this.f164830b), 4);
        try {
            Object a = bxxv.mo74218a();
            bxxv.mo74220a(a, this, bxus);
            bxxv.mo74225d(a);
            if (this.f164830b == this.f164831c) {
                return a;
            }
            throw bxwf.m124095h();
        } finally {
            this.f164831c = i;
        }
    }

    /* renamed from: b */
    public final int mo73689b() {
        return this.f164830b;
    }

    /* renamed from: e */
    public final float mo73698e() {
        m123456a(5);
        return this.f164829a.mo73790c();
    }

    /* renamed from: f */
    public final long mo73700f() {
        m123456a(0);
        return this.f164829a.mo73792d();
    }

    /* renamed from: g */
    public final long mo73702g() {
        m123456a(0);
        return this.f164829a.mo73794e();
    }

    /* renamed from: h */
    public final int mo73704h() {
        m123456a(0);
        return this.f164829a.mo73796f();
    }

    /* renamed from: i */
    public final long mo73706i() {
        m123456a(1);
        return this.f164829a.mo73798g();
    }

    /* renamed from: j */
    public final int mo73708j() {
        m123456a(5);
        return this.f164829a.mo73799h();
    }

    /* renamed from: k */
    public final void mo73710k(List list) {
        int a;
        if (bxzh.m124561a(this.f164830b) == 2) {
            do {
                list.add(mo73716n());
                if (!this.f164829a.mo73783A()) {
                    a = this.f164829a.mo73786a();
                } else {
                    return;
                }
            } while (a == this.f164830b);
            this.f164832d = a;
            return;
        }
        throw bxwf.m124093f();
    }

    /* renamed from: l */
    public final String mo73712l() {
        m123456a(2);
        return this.f164829a.mo73801j();
    }

    /* renamed from: m */
    public final String mo73714m() {
        m123456a(2);
        return this.f164829a.mo73802k();
    }

    /* renamed from: n */
    public final bxtx mo73716n() {
        m123456a(2);
        return this.f164829a.mo73803l();
    }

    /* renamed from: o */
    public final int mo73718o() {
        m123456a(0);
        return this.f164829a.mo73805n();
    }

    /* renamed from: p */
    public final int mo73720p() {
        m123456a(0);
        return this.f164829a.mo73806o();
    }

    /* renamed from: q */
    public final int mo73722q() {
        m123456a(5);
        return this.f164829a.mo73807p();
    }

    /* renamed from: r */
    public final long mo73724r() {
        m123456a(1);
        return this.f164829a.mo73808q();
    }

    /* renamed from: s */
    public final int mo73725s() {
        m123456a(0);
        return this.f164829a.mo73809r();
    }

    /* renamed from: t */
    public final long mo73726t() {
        m123456a(0);
        return this.f164829a.mo73810s();
    }

    /* renamed from: e */
    public final void mo73699e(List list) {
        int a;
        int a2;
        if (list instanceof bxvm) {
            bxvm bxvm = (bxvm) list;
            int a3 = bxzh.m124561a(this.f164830b);
            if (a3 == 0) {
                do {
                    bxvm.mo74153d(this.f164829a.mo73796f());
                    if (!this.f164829a.mo73783A()) {
                        a2 = this.f164829a.mo73786a();
                    } else {
                        return;
                    }
                } while (a2 == this.f164830b);
                this.f164832d = a2;
            } else if (a3 == 2) {
                int B = this.f164829a.mo73784B() + this.f164829a.mo73805n();
                do {
                    bxvm.mo74153d(this.f164829a.mo73796f());
                } while (this.f164829a.mo73784B() < B);
                m123457b(B);
            } else {
                throw bxwf.m124093f();
            }
        } else {
            int a4 = bxzh.m124561a(this.f164830b);
            if (a4 == 0) {
                do {
                    list.add(Integer.valueOf(this.f164829a.mo73796f()));
                    if (!this.f164829a.mo73783A()) {
                        a = this.f164829a.mo73786a();
                    } else {
                        return;
                    }
                } while (a == this.f164830b);
                this.f164832d = a;
            } else if (a4 == 2) {
                int B2 = this.f164829a.mo73784B() + this.f164829a.mo73805n();
                do {
                    list.add(Integer.valueOf(this.f164829a.mo73796f()));
                } while (this.f164829a.mo73784B() < B2);
                m123457b(B2);
            } else {
                throw bxwf.m124093f();
            }
        }
    }

    /* renamed from: f */
    public final void mo73701f(List list) {
        int a;
        int a2;
        if (list instanceof bxwq) {
            bxwq bxwq = (bxwq) list;
            int a3 = bxzh.m124561a(this.f164830b);
            if (a3 == 1) {
                do {
                    bxwq.mo74161a(this.f164829a.mo73798g());
                    if (!this.f164829a.mo73783A()) {
                        a2 = this.f164829a.mo73786a();
                    } else {
                        return;
                    }
                } while (a2 == this.f164830b);
                this.f164832d = a2;
            } else if (a3 == 2) {
                int n = this.f164829a.mo73805n();
                m123461d(n);
                int B = this.f164829a.mo73784B() + n;
                do {
                    bxwq.mo74161a(this.f164829a.mo73798g());
                } while (this.f164829a.mo73784B() < B);
            } else {
                throw bxwf.m124093f();
            }
        } else {
            int a4 = bxzh.m124561a(this.f164830b);
            if (a4 == 1) {
                do {
                    list.add(Long.valueOf(this.f164829a.mo73798g()));
                    if (!this.f164829a.mo73783A()) {
                        a = this.f164829a.mo73786a();
                    } else {
                        return;
                    }
                } while (a == this.f164830b);
                this.f164832d = a;
            } else if (a4 == 2) {
                int n2 = this.f164829a.mo73805n();
                m123461d(n2);
                int B2 = this.f164829a.mo73784B() + n2;
                do {
                    list.add(Long.valueOf(this.f164829a.mo73798g()));
                } while (this.f164829a.mo73784B() < B2);
            } else {
                throw bxwf.m124093f();
            }
        }
    }

    /* renamed from: g */
    public final void mo73703g(List list) {
        int a;
        int a2;
        if (list instanceof bxvm) {
            bxvm bxvm = (bxvm) list;
            int a3 = bxzh.m124561a(this.f164830b);
            if (a3 == 2) {
                int n = this.f164829a.mo73805n();
                m123459c(n);
                int B = this.f164829a.mo73784B() + n;
                do {
                    bxvm.mo74153d(this.f164829a.mo73799h());
                } while (this.f164829a.mo73784B() < B);
            } else if (a3 == 5) {
                do {
                    bxvm.mo74153d(this.f164829a.mo73799h());
                    if (!this.f164829a.mo73783A()) {
                        a2 = this.f164829a.mo73786a();
                    } else {
                        return;
                    }
                } while (a2 == this.f164830b);
                this.f164832d = a2;
            } else {
                throw bxwf.m124093f();
            }
        } else {
            int a4 = bxzh.m124561a(this.f164830b);
            if (a4 == 2) {
                int n2 = this.f164829a.mo73805n();
                m123459c(n2);
                int B2 = this.f164829a.mo73784B() + n2;
                do {
                    list.add(Integer.valueOf(this.f164829a.mo73799h()));
                } while (this.f164829a.mo73784B() < B2);
            } else if (a4 == 5) {
                do {
                    list.add(Integer.valueOf(this.f164829a.mo73799h()));
                    if (!this.f164829a.mo73783A()) {
                        a = this.f164829a.mo73786a();
                    } else {
                        return;
                    }
                } while (a == this.f164830b);
                this.f164832d = a;
            } else {
                throw bxwf.m124093f();
            }
        }
    }

    /* renamed from: h */
    public final void mo73705h(List list) {
        int a;
        int a2;
        if (list instanceof bxtk) {
            bxtk bxtk = (bxtk) list;
            int a3 = bxzh.m124561a(this.f164830b);
            if (a3 == 0) {
                do {
                    bxtk.mo73729a(this.f164829a.mo73800i());
                    if (!this.f164829a.mo73783A()) {
                        a2 = this.f164829a.mo73786a();
                    } else {
                        return;
                    }
                } while (a2 == this.f164830b);
                this.f164832d = a2;
            } else if (a3 == 2) {
                int B = this.f164829a.mo73784B() + this.f164829a.mo73805n();
                do {
                    bxtk.mo73729a(this.f164829a.mo73800i());
                } while (this.f164829a.mo73784B() < B);
                m123457b(B);
            } else {
                throw bxwf.m124093f();
            }
        } else {
            int a4 = bxzh.m124561a(this.f164830b);
            if (a4 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f164829a.mo73800i()));
                    if (!this.f164829a.mo73783A()) {
                        a = this.f164829a.mo73786a();
                    } else {
                        return;
                    }
                } while (a == this.f164830b);
                this.f164832d = a;
            } else if (a4 == 2) {
                int B2 = this.f164829a.mo73784B() + this.f164829a.mo73805n();
                do {
                    list.add(Boolean.valueOf(this.f164829a.mo73800i()));
                } while (this.f164829a.mo73784B() < B2);
                m123457b(B2);
            } else {
                throw bxwf.m124093f();
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bxud.a(java.util.List, boolean):void
     arg types: [java.util.List, int]
     candidates:
      bxud.a(bxxv, bxus):java.lang.Object
      bxud.a(java.lang.Class, bxus):java.lang.Object
      bxxp.a(bxxv, bxus):java.lang.Object
      bxxp.a(java.lang.Class, bxus):java.lang.Object
      bxud.a(java.util.List, boolean):void */
    /* renamed from: i */
    public final void mo73707i(List list) {
        mo73826a(list, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bxud.a(java.util.List, boolean):void
     arg types: [java.util.List, int]
     candidates:
      bxud.a(bxxv, bxus):java.lang.Object
      bxud.a(java.lang.Class, bxus):java.lang.Object
      bxxp.a(bxxv, bxus):java.lang.Object
      bxxp.a(java.lang.Class, bxus):java.lang.Object
      bxud.a(java.util.List, boolean):void */
    /* renamed from: j */
    public final void mo73709j(List list) {
        mo73826a(list, true);
    }

    /* renamed from: l */
    public final void mo73713l(List list) {
        int a;
        int a2;
        if (list instanceof bxvm) {
            bxvm bxvm = (bxvm) list;
            int a3 = bxzh.m124561a(this.f164830b);
            if (a3 == 0) {
                do {
                    bxvm.mo74153d(this.f164829a.mo73805n());
                    if (!this.f164829a.mo73783A()) {
                        a2 = this.f164829a.mo73786a();
                    } else {
                        return;
                    }
                } while (a2 == this.f164830b);
                this.f164832d = a2;
            } else if (a3 == 2) {
                int B = this.f164829a.mo73784B() + this.f164829a.mo73805n();
                do {
                    bxvm.mo74153d(this.f164829a.mo73805n());
                } while (this.f164829a.mo73784B() < B);
                m123457b(B);
            } else {
                throw bxwf.m124093f();
            }
        } else {
            int a4 = bxzh.m124561a(this.f164830b);
            if (a4 == 0) {
                do {
                    list.add(Integer.valueOf(this.f164829a.mo73805n()));
                    if (!this.f164829a.mo73783A()) {
                        a = this.f164829a.mo73786a();
                    } else {
                        return;
                    }
                } while (a == this.f164830b);
                this.f164832d = a;
            } else if (a4 == 2) {
                int B2 = this.f164829a.mo73784B() + this.f164829a.mo73805n();
                do {
                    list.add(Integer.valueOf(this.f164829a.mo73805n()));
                } while (this.f164829a.mo73784B() < B2);
                m123457b(B2);
            } else {
                throw bxwf.m124093f();
            }
        }
    }

    /* renamed from: m */
    public final void mo73715m(List list) {
        int a;
        int a2;
        if (list instanceof bxvm) {
            bxvm bxvm = (bxvm) list;
            int a3 = bxzh.m124561a(this.f164830b);
            if (a3 == 0) {
                do {
                    bxvm.mo74153d(this.f164829a.mo73806o());
                    if (!this.f164829a.mo73783A()) {
                        a2 = this.f164829a.mo73786a();
                    } else {
                        return;
                    }
                } while (a2 == this.f164830b);
                this.f164832d = a2;
            } else if (a3 == 2) {
                int B = this.f164829a.mo73784B() + this.f164829a.mo73805n();
                do {
                    bxvm.mo74153d(this.f164829a.mo73806o());
                } while (this.f164829a.mo73784B() < B);
                m123457b(B);
            } else {
                throw bxwf.m124093f();
            }
        } else {
            int a4 = bxzh.m124561a(this.f164830b);
            if (a4 == 0) {
                do {
                    list.add(Integer.valueOf(this.f164829a.mo73806o()));
                    if (!this.f164829a.mo73783A()) {
                        a = this.f164829a.mo73786a();
                    } else {
                        return;
                    }
                } while (a == this.f164830b);
                this.f164832d = a;
            } else if (a4 == 2) {
                int B2 = this.f164829a.mo73784B() + this.f164829a.mo73805n();
                do {
                    list.add(Integer.valueOf(this.f164829a.mo73806o()));
                } while (this.f164829a.mo73784B() < B2);
                m123457b(B2);
            } else {
                throw bxwf.m124093f();
            }
        }
    }

    /* renamed from: n */
    public final void mo73717n(List list) {
        int a;
        int a2;
        if (list instanceof bxvm) {
            bxvm bxvm = (bxvm) list;
            int a3 = bxzh.m124561a(this.f164830b);
            if (a3 == 2) {
                int n = this.f164829a.mo73805n();
                m123459c(n);
                int B = this.f164829a.mo73784B() + n;
                do {
                    bxvm.mo74153d(this.f164829a.mo73807p());
                } while (this.f164829a.mo73784B() < B);
            } else if (a3 == 5) {
                do {
                    bxvm.mo74153d(this.f164829a.mo73807p());
                    if (!this.f164829a.mo73783A()) {
                        a2 = this.f164829a.mo73786a();
                    } else {
                        return;
                    }
                } while (a2 == this.f164830b);
                this.f164832d = a2;
            } else {
                throw bxwf.m124093f();
            }
        } else {
            int a4 = bxzh.m124561a(this.f164830b);
            if (a4 == 2) {
                int n2 = this.f164829a.mo73805n();
                m123459c(n2);
                int B2 = this.f164829a.mo73784B() + n2;
                do {
                    list.add(Integer.valueOf(this.f164829a.mo73807p()));
                } while (this.f164829a.mo73784B() < B2);
            } else if (a4 == 5) {
                do {
                    list.add(Integer.valueOf(this.f164829a.mo73807p()));
                    if (!this.f164829a.mo73783A()) {
                        a = this.f164829a.mo73786a();
                    } else {
                        return;
                    }
                } while (a == this.f164830b);
                this.f164832d = a;
            } else {
                throw bxwf.m124093f();
            }
        }
    }

    /* renamed from: o */
    public final void mo73719o(List list) {
        int a;
        int a2;
        if (list instanceof bxwq) {
            bxwq bxwq = (bxwq) list;
            int a3 = bxzh.m124561a(this.f164830b);
            if (a3 == 1) {
                do {
                    bxwq.mo74161a(this.f164829a.mo73808q());
                    if (!this.f164829a.mo73783A()) {
                        a2 = this.f164829a.mo73786a();
                    } else {
                        return;
                    }
                } while (a2 == this.f164830b);
                this.f164832d = a2;
            } else if (a3 == 2) {
                int n = this.f164829a.mo73805n();
                m123461d(n);
                int B = this.f164829a.mo73784B() + n;
                do {
                    bxwq.mo74161a(this.f164829a.mo73808q());
                } while (this.f164829a.mo73784B() < B);
            } else {
                throw bxwf.m124093f();
            }
        } else {
            int a4 = bxzh.m124561a(this.f164830b);
            if (a4 == 1) {
                do {
                    list.add(Long.valueOf(this.f164829a.mo73808q()));
                    if (!this.f164829a.mo73783A()) {
                        a = this.f164829a.mo73786a();
                    } else {
                        return;
                    }
                } while (a == this.f164830b);
                this.f164832d = a;
            } else if (a4 == 2) {
                int n2 = this.f164829a.mo73805n();
                m123461d(n2);
                int B2 = this.f164829a.mo73784B() + n2;
                do {
                    list.add(Long.valueOf(this.f164829a.mo73808q()));
                } while (this.f164829a.mo73784B() < B2);
            } else {
                throw bxwf.m124093f();
            }
        }
    }

    /* renamed from: p */
    public final void mo73721p(List list) {
        int a;
        int a2;
        if (list instanceof bxvm) {
            bxvm bxvm = (bxvm) list;
            int a3 = bxzh.m124561a(this.f164830b);
            if (a3 == 0) {
                do {
                    bxvm.mo74153d(this.f164829a.mo73809r());
                    if (!this.f164829a.mo73783A()) {
                        a2 = this.f164829a.mo73786a();
                    } else {
                        return;
                    }
                } while (a2 == this.f164830b);
                this.f164832d = a2;
            } else if (a3 == 2) {
                int B = this.f164829a.mo73784B() + this.f164829a.mo73805n();
                do {
                    bxvm.mo74153d(this.f164829a.mo73809r());
                } while (this.f164829a.mo73784B() < B);
                m123457b(B);
            } else {
                throw bxwf.m124093f();
            }
        } else {
            int a4 = bxzh.m124561a(this.f164830b);
            if (a4 == 0) {
                do {
                    list.add(Integer.valueOf(this.f164829a.mo73809r()));
                    if (!this.f164829a.mo73783A()) {
                        a = this.f164829a.mo73786a();
                    } else {
                        return;
                    }
                } while (a == this.f164830b);
                this.f164832d = a;
            } else if (a4 == 2) {
                int B2 = this.f164829a.mo73784B() + this.f164829a.mo73805n();
                do {
                    list.add(Integer.valueOf(this.f164829a.mo73809r()));
                } while (this.f164829a.mo73784B() < B2);
                m123457b(B2);
            } else {
                throw bxwf.m124093f();
            }
        }
    }

    /* renamed from: q */
    public final void mo73723q(List list) {
        int a;
        int a2;
        if (list instanceof bxwq) {
            bxwq bxwq = (bxwq) list;
            int a3 = bxzh.m124561a(this.f164830b);
            if (a3 == 0) {
                do {
                    bxwq.mo74161a(this.f164829a.mo73810s());
                    if (!this.f164829a.mo73783A()) {
                        a2 = this.f164829a.mo73786a();
                    } else {
                        return;
                    }
                } while (a2 == this.f164830b);
                this.f164832d = a2;
            } else if (a3 == 2) {
                int B = this.f164829a.mo73784B() + this.f164829a.mo73805n();
                do {
                    bxwq.mo74161a(this.f164829a.mo73810s());
                } while (this.f164829a.mo73784B() < B);
                m123457b(B);
            } else {
                throw bxwf.m124093f();
            }
        } else {
            int a4 = bxzh.m124561a(this.f164830b);
            if (a4 == 0) {
                do {
                    list.add(Long.valueOf(this.f164829a.mo73810s()));
                    if (!this.f164829a.mo73783A()) {
                        a = this.f164829a.mo73786a();
                    } else {
                        return;
                    }
                } while (a == this.f164830b);
                this.f164832d = a;
            } else if (a4 == 2) {
                int B2 = this.f164829a.mo73784B() + this.f164829a.mo73805n();
                do {
                    list.add(Long.valueOf(this.f164829a.mo73810s()));
                } while (this.f164829a.mo73784B() < B2);
                m123457b(B2);
            } else {
                throw bxwf.m124093f();
            }
        }
    }

    /* renamed from: a */
    private final Object m123455a(bxzf bxzf, Class cls, bxus bxus) {
        bxzf bxzf2 = bxzf.DOUBLE;
        switch (bxzf.ordinal()) {
            case 0:
                return Double.valueOf(mo73696d());
            case 1:
                return Float.valueOf(mo73698e());
            case 2:
                return Long.valueOf(mo73702g());
            case 3:
                return Long.valueOf(mo73700f());
            case 4:
                return Integer.valueOf(mo73704h());
            case 5:
                return Long.valueOf(mo73706i());
            case 6:
                return Integer.valueOf(mo73708j());
            case 7:
                return Boolean.valueOf(mo73711k());
            case 8:
                return mo73714m();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return mo73683a(cls, bxus);
            case 11:
                return mo73716n();
            case 12:
                return Integer.valueOf(mo73718o());
            case 13:
                return Integer.valueOf(mo73720p());
            case 14:
                return Integer.valueOf(mo73722q());
            case 15:
                return Long.valueOf(mo73724r());
            case 16:
                return Integer.valueOf(mo73725s());
            case 17:
                return Long.valueOf(mo73726t());
        }
    }

    /* renamed from: b */
    public final Object mo73690b(bxxv bxxv, bxus bxus) {
        m123456a(3);
        return m123460d(bxxv, bxus);
    }

    /* renamed from: b */
    public final Object mo73691b(Class cls, bxus bxus) {
        m123456a(3);
        return m123460d(bxxm.f165037a.mo74227a(cls), bxus);
    }

    /* renamed from: d */
    private static final void m123461d(int i) {
        if ((i & 7) != 0) {
            throw bxwf.m124095h();
        }
    }

    /* renamed from: b */
    public final void mo73692b(List list) {
        int a;
        int a2;
        if (list instanceof bxuz) {
            bxuz bxuz = (bxuz) list;
            int a3 = bxzh.m124561a(this.f164830b);
            if (a3 == 2) {
                int n = this.f164829a.mo73805n();
                m123459c(n);
                int B = this.f164829a.mo73784B() + n;
                do {
                    bxuz.mo73922a(this.f164829a.mo73790c());
                } while (this.f164829a.mo73784B() < B);
            } else if (a3 == 5) {
                do {
                    bxuz.mo73922a(this.f164829a.mo73790c());
                    if (!this.f164829a.mo73783A()) {
                        a2 = this.f164829a.mo73786a();
                    } else {
                        return;
                    }
                } while (a2 == this.f164830b);
                this.f164832d = a2;
            } else {
                throw bxwf.m124093f();
            }
        } else {
            int a4 = bxzh.m124561a(this.f164830b);
            if (a4 == 2) {
                int n2 = this.f164829a.mo73805n();
                m123459c(n2);
                int B2 = this.f164829a.mo73784B() + n2;
                do {
                    list.add(Float.valueOf(this.f164829a.mo73790c()));
                } while (this.f164829a.mo73784B() < B2);
            } else if (a4 == 5) {
                do {
                    list.add(Float.valueOf(this.f164829a.mo73790c()));
                    if (!this.f164829a.mo73783A()) {
                        a = this.f164829a.mo73786a();
                    } else {
                        return;
                    }
                } while (a == this.f164830b);
                this.f164832d = a;
            } else {
                throw bxwf.m124093f();
            }
        }
    }

    /* renamed from: k */
    public final boolean mo73711k() {
        m123456a(0);
        return this.f164829a.mo73800i();
    }

    /* renamed from: d */
    public final double mo73696d() {
        m123456a(1);
        return this.f164829a.mo73788b();
    }

    /* renamed from: c */
    private static final void m123459c(int i) {
        if ((i & 3) != 0) {
            throw bxwf.m124095h();
        }
    }

    /* renamed from: d */
    public final void mo73697d(List list) {
        int a;
        int a2;
        if (list instanceof bxwq) {
            bxwq bxwq = (bxwq) list;
            int a3 = bxzh.m124561a(this.f164830b);
            if (a3 == 0) {
                do {
                    bxwq.mo74161a(this.f164829a.mo73794e());
                    if (!this.f164829a.mo73783A()) {
                        a2 = this.f164829a.mo73786a();
                    } else {
                        return;
                    }
                } while (a2 == this.f164830b);
                this.f164832d = a2;
            } else if (a3 == 2) {
                int B = this.f164829a.mo73784B() + this.f164829a.mo73805n();
                do {
                    bxwq.mo74161a(this.f164829a.mo73794e());
                } while (this.f164829a.mo73784B() < B);
                m123457b(B);
            } else {
                throw bxwf.m124093f();
            }
        } else {
            int a4 = bxzh.m124561a(this.f164830b);
            if (a4 == 0) {
                do {
                    list.add(Long.valueOf(this.f164829a.mo73794e()));
                    if (!this.f164829a.mo73783A()) {
                        a = this.f164829a.mo73786a();
                    } else {
                        return;
                    }
                } while (a == this.f164830b);
                this.f164832d = a;
            } else if (a4 == 2) {
                int B2 = this.f164829a.mo73784B() + this.f164829a.mo73805n();
                do {
                    list.add(Long.valueOf(this.f164829a.mo73794e()));
                } while (this.f164829a.mo73784B() < B2);
                m123457b(B2);
            } else {
                throw bxwf.m124093f();
            }
        }
    }

    /* renamed from: c */
    public final void mo73694c(List list) {
        int a;
        int a2;
        if (list instanceof bxwq) {
            bxwq bxwq = (bxwq) list;
            int a3 = bxzh.m124561a(this.f164830b);
            if (a3 == 0) {
                do {
                    bxwq.mo74161a(this.f164829a.mo73792d());
                    if (!this.f164829a.mo73783A()) {
                        a2 = this.f164829a.mo73786a();
                    } else {
                        return;
                    }
                } while (a2 == this.f164830b);
                this.f164832d = a2;
            } else if (a3 == 2) {
                int B = this.f164829a.mo73784B() + this.f164829a.mo73805n();
                do {
                    bxwq.mo74161a(this.f164829a.mo73792d());
                } while (this.f164829a.mo73784B() < B);
                m123457b(B);
            } else {
                throw bxwf.m124093f();
            }
        } else {
            int a4 = bxzh.m124561a(this.f164830b);
            if (a4 == 0) {
                do {
                    list.add(Long.valueOf(this.f164829a.mo73792d()));
                    if (!this.f164829a.mo73783A()) {
                        a = this.f164829a.mo73786a();
                    } else {
                        return;
                    }
                } while (a == this.f164830b);
                this.f164832d = a;
            } else if (a4 == 2) {
                int B2 = this.f164829a.mo73784B() + this.f164829a.mo73805n();
                do {
                    list.add(Long.valueOf(this.f164829a.mo73792d()));
                } while (this.f164829a.mo73784B() < B2);
                m123457b(B2);
            } else {
                throw bxwf.m124093f();
            }
        }
    }

    /* renamed from: b */
    public final void mo73693b(List list, bxxv bxxv, bxus bxus) {
        int a;
        if (bxzh.m124561a(this.f164830b) == 3) {
            int i = this.f164830b;
            do {
                list.add(m123460d(bxxv, bxus));
                if (!this.f164829a.mo73783A() && this.f164832d == 0) {
                    a = this.f164829a.mo73786a();
                } else {
                    return;
                }
            } while (a == i);
            this.f164832d = a;
            return;
        }
        throw bxwf.m124093f();
    }

    /* renamed from: c */
    public final boolean mo73695c() {
        int i;
        if (this.f164829a.mo73783A() || (i = this.f164830b) == this.f164831c) {
            return false;
        }
        return this.f164829a.mo73789b(i);
    }

    /* renamed from: a */
    private final void m123456a(int i) {
        if (bxzh.m124561a(this.f164830b) != i) {
            throw bxwf.m124093f();
        }
    }

    /* renamed from: a */
    public final int mo73681a() {
        int i = this.f164832d;
        if (i == 0) {
            i = this.f164829a.mo73786a();
            this.f164830b = i;
        } else {
            this.f164830b = i;
            this.f164832d = 0;
        }
        if (i == 0 || i == this.f164831c) {
            return Integer.MAX_VALUE;
        }
        return bxzh.m124563b(i);
    }

    /* renamed from: a */
    public final Object mo73682a(bxxv bxxv, bxus bxus) {
        m123456a(2);
        return m123458c(bxxv, bxus);
    }

    /* renamed from: a */
    public final Object mo73683a(Class cls, bxus bxus) {
        m123456a(2);
        return m123458c(bxxm.f165037a.mo74227a(cls), bxus);
    }

    /* renamed from: a */
    public final void mo73685a(List list) {
        int a;
        int a2;
        if (list instanceof bxum) {
            bxum bxum = (bxum) list;
            int a3 = bxzh.m124561a(this.f164830b);
            if (a3 == 1) {
                do {
                    bxum.mo73894a(this.f164829a.mo73788b());
                    if (!this.f164829a.mo73783A()) {
                        a2 = this.f164829a.mo73786a();
                    } else {
                        return;
                    }
                } while (a2 == this.f164830b);
                this.f164832d = a2;
            } else if (a3 == 2) {
                int n = this.f164829a.mo73805n();
                m123461d(n);
                int B = this.f164829a.mo73784B() + n;
                do {
                    bxum.mo73894a(this.f164829a.mo73788b());
                } while (this.f164829a.mo73784B() < B);
            } else {
                throw bxwf.m124093f();
            }
        } else {
            int a4 = bxzh.m124561a(this.f164830b);
            if (a4 == 1) {
                do {
                    list.add(Double.valueOf(this.f164829a.mo73788b()));
                    if (!this.f164829a.mo73783A()) {
                        a = this.f164829a.mo73786a();
                    } else {
                        return;
                    }
                } while (a == this.f164830b);
                this.f164832d = a;
            } else if (a4 == 2) {
                int n2 = this.f164829a.mo73805n();
                m123461d(n2);
                int B2 = this.f164829a.mo73784B() + n2;
                do {
                    list.add(Double.valueOf(this.f164829a.mo73788b()));
                } while (this.f164829a.mo73784B() < B2);
            } else {
                throw bxwf.m124093f();
            }
        }
    }

    /* renamed from: a */
    public final void mo73686a(List list, bxxv bxxv, bxus bxus) {
        int a;
        if (bxzh.m124561a(this.f164830b) == 2) {
            int i = this.f164830b;
            do {
                list.add(m123458c(bxxv, bxus));
                if (!this.f164829a.mo73783A() && this.f164832d == 0) {
                    a = this.f164829a.mo73786a();
                } else {
                    return;
                }
            } while (a == i);
            this.f164832d = a;
            return;
        }
        throw bxwf.m124093f();
    }

    /* renamed from: a */
    public final void mo73826a(List list, boolean z) {
        int a;
        int a2;
        if (bxzh.m124561a(this.f164830b) != 2) {
            throw bxwf.m124093f();
        } else if ((list instanceof bxwm) && !z) {
            bxwm bxwm = (bxwm) list;
            do {
                bxwm.mo74189a(mo73716n());
                if (!this.f164829a.mo73783A()) {
                    a2 = this.f164829a.mo73786a();
                } else {
                    return;
                }
            } while (a2 == this.f164830b);
            this.f164832d = a2;
        } else {
            do {
                list.add(!z ? mo73712l() : mo73714m());
                if (!this.f164829a.mo73783A()) {
                    a = this.f164829a.mo73786a();
                } else {
                    return;
                }
            } while (a == this.f164830b);
            this.f164832d = a;
        }
    }

    /* renamed from: a */
    public final void mo73688a(Map map, bxwu bxwu, bxus bxus) {
        m123456a(2);
        int c = this.f164829a.mo73791c(this.f164829a.mo73805n());
        Object obj = bxwu.f165009b;
        Object obj2 = bxwu.f165011d;
        while (true) {
            try {
                int a = mo73681a();
                if (a == Integer.MAX_VALUE || this.f164829a.mo73783A()) {
                    map.put(obj, obj2);
                } else if (a == 1) {
                    obj = m123455a(bxwu.f165008a, (Class) null, (bxus) null);
                } else if (a == 2) {
                    obj2 = m123455a(bxwu.f165010c, bxwu.f165011d.getClass(), bxus);
                } else if (!mo73695c()) {
                    throw new bxwf("Unable to parse map entry.");
                }
            } catch (bxwe e) {
                if (!mo73695c()) {
                    throw new bxwf("Unable to parse map entry.");
                }
            } catch (Throwable th) {
                this.f164829a.mo73793d(c);
                throw th;
            }
        }
        map.put(obj, obj2);
        this.f164829a.mo73793d(c);
    }
}
