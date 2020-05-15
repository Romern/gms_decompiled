package p000;

import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* renamed from: alv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alv {

    /* renamed from: a */
    public final alu f872a;

    /* renamed from: b */
    final String f873b;

    /* renamed from: c */
    public final String f874c;

    /* renamed from: d */
    public String f875d;

    /* renamed from: e */
    public String f876e;

    /* renamed from: f */
    boolean f877f;

    /* renamed from: g */
    public int f878g;

    /* renamed from: h */
    public int f879h;

    /* renamed from: i */
    public int f880i;

    /* renamed from: j */
    public int f881j;

    /* renamed from: k */
    public int f882k;

    /* renamed from: l */
    public Bundle f883l;

    /* renamed from: m */
    ako f884m;

    /* renamed from: n */
    public List f885n = new ArrayList();

    /* renamed from: o */
    private Uri f886o;

    /* renamed from: p */
    private int f887p;

    /* renamed from: q */
    private boolean f888q;

    /* renamed from: r */
    private final ArrayList f889r = new ArrayList();

    /* renamed from: s */
    private int f890s;

    /* renamed from: t */
    private int f891t = -1;

    /* renamed from: u */
    private IntentSender f892u;

    public alv(alu alu, String str, String str2) {
        this.f872a = alu;
        this.f873b = str;
        this.f874c = str2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d7, code lost:
        if (r3.hasNext() != false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00dd, code lost:
        if (r4.hasNext() != false) goto L_0x00e0;
     */
    /* renamed from: a */
    public final int mo996a(ako ako) {
        int i;
        boolean z;
        alv alv;
        int countActions;
        if (this.f884m == ako) {
            return 0;
        }
        this.f884m = ako;
        if (ako == null) {
            return 0;
        }
        if (!C1239oe.m19757a(this.f875d, ako.mo898c())) {
            this.f875d = ako.mo898c();
            i = 1;
        } else {
            i = 0;
        }
        if (!C1239oe.m19757a(this.f876e, ako.mo899d())) {
            this.f876e = ako.mo899d();
            i = 1;
        }
        if (!C1239oe.m19757a(this.f886o, ako.mo900e())) {
            this.f886o = ako.mo900e();
            i = 1;
        }
        if (this.f877f != ako.mo901f()) {
            this.f877f = ako.mo901f();
            i = 1;
        }
        if (this.f887p != ako.mo902g()) {
            this.f887p = ako.mo902g();
            i = 1;
        }
        ArrayList arrayList = this.f889r;
        List j = ako.mo905j();
        if (arrayList != j) {
            if (j != null) {
                ListIterator listIterator = arrayList.listIterator();
                ListIterator listIterator2 = j.listIterator();
                loop0:
                while (true) {
                    if (listIterator.hasNext() && listIterator2.hasNext()) {
                        IntentFilter intentFilter = (IntentFilter) listIterator.next();
                        IntentFilter intentFilter2 = (IntentFilter) listIterator2.next();
                        if (intentFilter != intentFilter2) {
                            if (intentFilter != null && intentFilter2 != null && (countActions = intentFilter.countActions()) == intentFilter2.countActions()) {
                                int i2 = 0;
                                while (true) {
                                    if (i2 < countActions) {
                                        if (!intentFilter.getAction(i2).equals(intentFilter2.getAction(i2))) {
                                            break loop0;
                                        }
                                        i2++;
                                    } else {
                                        int countCategories = intentFilter.countCategories();
                                        if (countCategories != intentFilter2.countCategories()) {
                                            break;
                                        }
                                        for (int i3 = 0; i3 < countCategories; i3++) {
                                            if (!intentFilter.getCategory(i3).equals(intentFilter2.getCategory(i3))) {
                                                break loop0;
                                            }
                                        }
                                        continue;
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
            }
            this.f889r.clear();
            this.f889r.addAll(ako.mo905j());
            i = 1;
        }
        if (this.f878g != ako.mo907l()) {
            this.f878g = ako.mo907l();
            i = 1;
        }
        if (this.f879h != ako.mo908m()) {
            this.f879h = ako.mo908m();
            i = 1;
        }
        if (this.f890s != ako.mo909n()) {
            this.f890s = ako.mo909n();
            i = 1;
        }
        int i4 = 3;
        if (this.f880i != ako.mo912q()) {
            this.f880i = ako.mo912q();
            i = 3;
        }
        if (this.f881j != ako.mo910o()) {
            this.f881j = ako.mo910o();
            i = 3;
        }
        if (this.f882k != ako.mo911p()) {
            this.f882k = ako.mo911p();
        } else {
            i4 = i;
        }
        if (this.f891t != ako.mo913r()) {
            this.f891t = ako.mo913r();
            i4 |= 5;
        }
        if (!C1239oe.m19757a(this.f883l, ako.mo914s())) {
            this.f883l = ako.mo914s();
            i4 |= 1;
        }
        if (!C1239oe.m19757a(this.f892u, ako.mo904i())) {
            this.f892u = ako.mo904i();
            i4 |= 1;
        }
        if (this.f888q != ako.mo903h()) {
            this.f888q = ako.mo903h();
            i4 |= 5;
        }
        List<String> b = ako.mo897b();
        ArrayList arrayList2 = new ArrayList();
        if (b.size() != this.f885n.size()) {
            z = true;
        } else {
            z = false;
        }
        for (String str : b) {
            String str2 = (String) alw.f893a.f852d.get(new C1240of(this.f872a.mo994b().flattenToShortString(), str));
            ArrayList arrayList3 = alw.f893a.f851c;
            int size = arrayList3.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    alv = null;
                    break;
                }
                alv = (alv) arrayList3.get(i5);
                i5++;
                if (alv.f874c.equals(str2)) {
                    break;
                }
            }
            if (alv != null) {
                arrayList2.add(alv);
                if (!z && !this.f885n.contains(alv)) {
                    z = true;
                }
            }
        }
        if (!z) {
            return i4;
        }
        this.f885n = arrayList2;
        return i4 | 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo997a() {
        return this.f884m != null && this.f877f;
    }

    /* renamed from: b */
    public final void mo1000b() {
        alw.m1051a();
        alt alt = alw.f893a;
        if (!alt.f851c.contains(this)) {
            Log.w("MediaRouter", "Ignoring attempt to select removed route: " + this);
        } else if (!this.f877f) {
            Log.w("MediaRouter", "Ignoring attempt to select disabled route: " + this);
        } else {
            alt.mo988a(this, 3);
        }
    }

    /* renamed from: c */
    public final boolean mo1001c() {
        return mo1002d().size() > 0;
    }

    /* renamed from: d */
    public final List mo1002d() {
        return Collections.unmodifiableList(this.f885n);
    }

    /* renamed from: e */
    public final akz mo1003e() {
        alu alu = this.f872a;
        alw.m1051a();
        return alu.f868a;
    }

    public final String toString() {
        if (mo1001c()) {
            StringBuilder sb = new StringBuilder(super.toString());
            sb.append('[');
            int size = this.f885n.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(this.f885n.get(i));
            }
            sb.append(']');
            return sb.toString();
        }
        return "MediaRouter.RouteInfo{ uniqueId=" + this.f874c + ", name=" + this.f875d + ", description=" + this.f876e + ", iconUri=" + this.f886o + ", enabled=" + this.f877f + ", connectionState=" + this.f887p + ", canDisconnect=" + this.f888q + ", playbackType=" + this.f878g + ", playbackStream=" + this.f879h + ", deviceType=" + this.f890s + ", volumeHandling=" + this.f880i + ", volume=" + this.f881j + ", volumeMax=" + this.f882k + ", presentationDisplayId=" + this.f891t + ", extras=" + this.f883l + ", settingsIntent=" + this.f892u + ", providerPackageName=" + this.f872a.mo993a() + " }";
    }

    /* renamed from: a */
    public final boolean mo998a(all all) {
        if (all != null) {
            alw.m1051a();
            ArrayList arrayList = this.f889r;
            all.mo975b();
            int size = all.f840b.size();
            if (size == 0) {
                return false;
            }
            int size2 = arrayList.size();
            for (int i = 0; i < size2; i++) {
                IntentFilter intentFilter = (IntentFilter) arrayList.get(i);
                if (intentFilter != null) {
                    for (int i2 = 0; i2 < size; i2++) {
                        if (intentFilter.hasCategory((String) all.f840b.get(i2))) {
                            return true;
                        }
                    }
                    continue;
                }
            }
            return false;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    /* renamed from: a */
    public final boolean mo999a(String str) {
        alw.m1051a();
        int size = this.f889r.size();
        for (int i = 0; i < size; i++) {
            if (((IntentFilter) this.f889r.get(i)).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }
}
