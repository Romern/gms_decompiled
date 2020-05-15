package p000;

import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: ft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1002ft extends C1058hr implements C1045he, C1048hh {

    /* renamed from: a */
    final C1050hj f17209a;

    /* renamed from: b */
    boolean f17210b;

    /* renamed from: c */
    public int f17211c;

    public C1002ft(C1050hj hjVar) {
        hjVar.mo12571p();
        C1034gv gvVar = hjVar.f19860k;
        if (gvVar != null) {
            gvVar.f19059c.getClassLoader();
        }
        this.f17211c = -1;
        this.f17209a = hjVar;
    }

    /* renamed from: a */
    public final int mo11278a() {
        return this.f17211c;
    }

    /* renamed from: b */
    public final int mo11286b() {
        return this.f20279m;
    }

    /* renamed from: c */
    public final int mo11288c() {
        return this.f20281o;
    }

    /* renamed from: d */
    public final CharSequence mo11290d() {
        int i = this.f20279m;
        return i != 0 ? this.f17209a.f19860k.f19059c.getText(i) : this.f20280n;
    }

    /* renamed from: e */
    public final CharSequence mo11292e() {
        int i = this.f20281o;
        return i != 0 ? this.f17209a.f19860k.f19059c.getText(i) : this.f20282p;
    }

    /* renamed from: f */
    public final int mo11294f() {
        return mo11279a(false);
    }

    /* renamed from: g */
    public final int mo11295g() {
        return mo11279a(true);
    }

    /* renamed from: h */
    public final void mo11296h() {
        mo12689l();
        this.f17209a.mo12541b(this, false);
    }

    /* renamed from: i */
    public final void mo11297i() {
        mo12689l();
        this.f17209a.mo12541b(this, true);
    }

    /* renamed from: j */
    public final String mo11298j() {
        return this.f20278l;
    }

    /* renamed from: k */
    public final boolean mo11299k() {
        return this.f20270d.isEmpty();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f17211c >= 0) {
            sb.append(" #");
            sb.append(this.f17211c);
        }
        if (this.f20278l != null) {
            sb.append(" ");
            sb.append(this.f20278l);
        }
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo11279a(boolean z) {
        if (!this.f17210b) {
            if (C1050hj.m14443a(2)) {
                "Commit: " + this;
                PrintWriter printWriter = new PrintWriter(new C1093iw());
                mo11283a("  ", printWriter);
                printWriter.close();
            }
            this.f17210b = true;
            if (this.f20276j) {
                this.f17211c = this.f17209a.f19855f.getAndIncrement();
            } else {
                this.f17211c = -1;
            }
            this.f17209a.mo12525a(this, z);
            return this.f17211c;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: b */
    public final void mo11287b(C1018gh ghVar) {
        C1050hj hjVar = ghVar.f18205v;
        if (hjVar == null || hjVar == this.f17209a) {
            mo12687a(new C1057hq(4, ghVar));
            return;
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + ghVar.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: c */
    public final void mo11289c(C1018gh ghVar) {
        C1050hj hjVar = ghVar.f18205v;
        if (hjVar == null || hjVar == this.f17209a) {
            mo12687a(new C1057hq(3, ghVar));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + ghVar.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: d */
    public final void mo11291d(C1018gh ghVar) {
        C1050hj hjVar;
        if (ghVar == null || (hjVar = ghVar.f18205v) == null || hjVar == this.f17209a) {
            mo12687a(new C1057hq(8, ghVar));
            return;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + ghVar.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: e */
    public final void mo11293e(C1018gh ghVar) {
        C1050hj hjVar = ghVar.f18205v;
        if (hjVar == null || hjVar == this.f17209a) {
            mo12687a(new C1057hq(5, ghVar));
            return;
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + ghVar.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11280a(int i) {
        if (this.f20276j) {
            if (C1050hj.m14443a(2)) {
                "Bump nesting in " + this + " by " + i;
            }
            int size = this.f20270d.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1057hq hqVar = (C1057hq) this.f20270d.get(i2);
                C1018gh ghVar = hqVar.f20206b;
                if (ghVar != null) {
                    ghVar.f18204u += i;
                    if (C1050hj.m14443a(2)) {
                        "Bump nesting of " + hqVar.f20206b + " to " + hqVar.f20206b.f18204u;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo11281a(int i, C1018gh ghVar, String str, int i2) {
        Class<?> cls = ghVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = ghVar.f18165B;
            if (str2 == null || str.equals(str2)) {
                ghVar.f18165B = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + ghVar + ": was " + ghVar.f18165B + " now " + str);
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = ghVar.f18209z;
                if (i3 == 0 || i3 == i) {
                    ghVar.f18209z = i;
                    ghVar.f18164A = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + ghVar + ": was " + ghVar.f18209z + " now " + i);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + ghVar + " with tag " + str + " to container view with no id");
            }
        }
        mo12687a(new C1057hq(i2, ghVar));
        ghVar.f18205v = this.f17209a;
    }

    /* renamed from: a */
    public final void mo11282a(C1018gh ghVar) {
        C1050hj hjVar = ghVar.f18205v;
        if (hjVar == null || hjVar == this.f17209a) {
            mo12687a(new C1057hq(6, ghVar));
            return;
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + ghVar.toString() + " is already attached to a FragmentManager.");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ft.a(java.lang.String, java.io.PrintWriter, boolean):void
     arg types: [java.lang.String, java.io.PrintWriter, int]
     candidates:
      hr.a(int, gh, java.lang.String):void
      ft.a(java.lang.String, java.io.PrintWriter, boolean):void */
    /* renamed from: a */
    public final void mo11283a(String str, PrintWriter printWriter) {
        mo11284a(str, printWriter, true);
    }

    /* renamed from: a */
    public final void mo11284a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f20278l);
            printWriter.print(" mIndex=");
            printWriter.print(this.f17211c);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f17210b);
            if (this.f20275i != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f20275i));
            }
            if (!(this.f20271e == 0 && this.f20272f == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f20271e));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f20272f));
            }
            if (!(this.f20273g == 0 && this.f20274h == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f20273g));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f20274h));
            }
            if (!(this.f20279m == 0 && this.f20280n == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f20279m));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f20280n);
            }
            if (!(this.f20281o == 0 && this.f20282p == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f20281o));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f20282p);
            }
        }
        if (!this.f20270d.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f20270d.size();
            for (int i = 0; i < size; i++) {
                C1057hq hqVar = (C1057hq) this.f20270d.get(i);
                switch (hqVar.f20205a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + hqVar.f20205a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(hqVar.f20206b);
                if (z) {
                    if (!(hqVar.f20207c == 0 && hqVar.f20208d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(hqVar.f20207c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(hqVar.f20208d));
                    }
                    if (hqVar.f20209e != 0 || hqVar.f20210f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(hqVar.f20209e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(hqVar.f20210f));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo11285a(ArrayList arrayList, ArrayList arrayList2) {
        if (C1050hj.m14443a(2)) {
            "Run: " + this;
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.f20276j) {
            return true;
        }
        C1050hj hjVar = this.f17209a;
        if (hjVar.f19851b == null) {
            hjVar.f19851b = new ArrayList();
        }
        hjVar.f19851b.add(this);
        return true;
    }
}
