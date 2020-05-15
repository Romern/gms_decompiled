package p000;

import android.support.p002v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: acm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class acm {

    /* renamed from: s */
    private static final List f200s = Collections.emptyList();

    /* renamed from: a */
    public final View f201a;

    /* renamed from: b */
    public WeakReference f202b;

    /* renamed from: c */
    public int f203c;

    /* renamed from: d */
    public int f204d;

    /* renamed from: e */
    public long f205e;

    /* renamed from: f */
    public int f206f;

    /* renamed from: g */
    int f207g;

    /* renamed from: h */
    public acm f208h;

    /* renamed from: i */
    public acm f209i;

    /* renamed from: j */
    int f210j;

    /* renamed from: k */
    List f211k;

    /* renamed from: l */
    List f212l;

    /* renamed from: m */
    acc f213m;

    /* renamed from: n */
    boolean f214n;

    /* renamed from: o */
    public int f215o;

    /* renamed from: p */
    public int f216p;

    /* renamed from: q */
    RecyclerView f217q;

    /* renamed from: r */
    abh f218r;

    /* renamed from: t */
    private int f219t;

    public acm(View view) {
        this.f203c = -1;
        this.f204d = -1;
        this.f205e = -1;
        this.f206f = -1;
        this.f207g = -1;
        this.f208h = null;
        this.f209i = null;
        this.f211k = null;
        this.f212l = null;
        this.f219t = 0;
        this.f213m = null;
        this.f214n = false;
        this.f215o = 0;
        this.f216p = -1;
        if (view != null) {
            this.f201a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    /* renamed from: a */
    public final void mo313a(int i, int i2) {
        this.f210j = (i & i2) | (this.f210j & (i2 ^ -1));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo315a(acc acc, boolean z) {
        this.f213m = acc;
        this.f214n = z;
    }

    /* renamed from: a */
    public final boolean mo318a(int i) {
        return (i & this.f210j) != 0;
    }

    /* renamed from: aN */
    public final void mo319aN() {
        this.f204d = -1;
        this.f207g = -1;
    }

    /* renamed from: aO */
    public final boolean mo320aO() {
        return (this.f210j & 128) != 0;
    }

    /* renamed from: b */
    public final void mo321b(int i) {
        this.f210j = i | this.f210j;
    }

    /* renamed from: c */
    public final int mo322c() {
        int i = this.f207g;
        return i == -1 ? this.f203c : i;
    }

    /* renamed from: d */
    public final int mo323d() {
        RecyclerView recyclerView;
        abh adapter;
        int adapterPositionInRecyclerView;
        if (this.f218r == null || (recyclerView = this.f217q) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.f217q.getAdapterPositionInRecyclerView(this)) == -1 || this.f218r != adapter) {
            return -1;
        }
        return adapterPositionInRecyclerView;
    }

    /* renamed from: e */
    public final int mo324e() {
        RecyclerView recyclerView = this.f217q;
        if (recyclerView != null) {
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo325f() {
        return this.f213m != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo326g() {
        this.f213m.mo284b(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo327h() {
        return (this.f210j & 32) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo328i() {
        this.f210j &= -33;
    }

    /* renamed from: j */
    public final void mo329j() {
        this.f210j &= -257;
    }

    /* renamed from: k */
    public final boolean mo330k() {
        return (this.f210j & 4) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo331l() {
        return (this.f210j & 2) != 0;
    }

    /* renamed from: m */
    public final boolean mo332m() {
        return (this.f210j & 1) != 0;
    }

    /* renamed from: n */
    public final boolean mo333n() {
        return (this.f210j & 8) != 0;
    }

    /* renamed from: o */
    public final boolean mo334o() {
        return (this.f210j & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final boolean mo335p() {
        return (this.f201a.getParent() == null || this.f201a.getParent() == this.f217q) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo336q() {
        List list = this.f211k;
        if (list != null) {
            list.clear();
        }
        this.f210j &= -1025;
    }

    /* renamed from: r */
    public final List mo337r() {
        List list;
        return ((this.f210j & 1024) != 0 || (list = this.f211k) == null || list.size() == 0) ? f200s : this.f212l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo338s() {
        this.f210j = 0;
        this.f203c = -1;
        this.f204d = -1;
        this.f205e = -1;
        this.f207g = -1;
        this.f219t = 0;
        this.f208h = null;
        this.f209i = null;
        mo336q();
        this.f215o = 0;
        this.f216p = -1;
        RecyclerView.clearNestedRecyclerViewIfNotNested(this);
    }

    /* renamed from: t */
    public final boolean mo339t() {
        return (this.f210j & 16) == 0 && !C1280ps.m19913d(this.f201a);
    }

    public final String toString() {
        String str;
        String str2;
        if (!getClass().isAnonymousClass()) {
            str = getClass().getSimpleName();
        } else {
            str = "ViewHolder";
        }
        StringBuilder sb = new StringBuilder(str + "{" + Integer.toHexString(hashCode()) + " position=" + this.f203c + " id=" + this.f205e + ", oldPos=" + this.f204d + ", pLpos:" + this.f207g);
        if (mo325f()) {
            sb.append(" scrap ");
            if (!this.f214n) {
                str2 = "[attachedScrap]";
            } else {
                str2 = "[changeScrap]";
            }
            sb.append(str2);
        }
        if (mo330k()) {
            sb.append(" invalid");
        }
        if (!mo332m()) {
            sb.append(" unbound");
        }
        if (mo331l()) {
            sb.append(" update");
        }
        if (mo333n()) {
            sb.append(" removed");
        }
        if (mo320aO()) {
            sb.append(" ignored");
        }
        if (mo334o()) {
            sb.append(" tmpDetached");
        }
        if (!mo339t()) {
            sb.append(" not recyclable(" + this.f219t + ")");
        }
        if ((this.f210j & 512) != 0 || mo330k()) {
            sb.append(" undefined adapter position");
        }
        if (this.f201a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: u */
    public final boolean mo341u() {
        return (this.f210j & 2) != 0;
    }

    /* renamed from: a */
    public final void mo314a(int i, boolean z) {
        if (this.f204d == -1) {
            this.f204d = this.f203c;
        }
        int i2 = this.f207g;
        if (i2 == -1) {
            i2 = this.f203c;
            this.f207g = i2;
        }
        if (z) {
            this.f207g = i2 + i;
        }
        this.f203c += i;
        if (this.f201a.getLayoutParams() != null) {
            ((abv) this.f201a.getLayoutParams()).f131e = true;
        }
    }

    public acm(View view, View.OnClickListener onClickListener) {
        this(view);
        view.setOnClickListener(onClickListener);
    }

    public acm(View view, byte[] bArr) {
        this(view);
        TextView textView = (TextView) view.findViewById(C0126R.C0129id.subtitle);
    }

    /* renamed from: a */
    public final void mo316a(Object obj) {
        if (obj == null) {
            mo321b(1024);
        } else if ((1024 & this.f210j) == 0) {
            if (this.f211k == null) {
                ArrayList arrayList = new ArrayList();
                this.f211k = arrayList;
                this.f212l = Collections.unmodifiableList(arrayList);
            }
            this.f211k.add(obj);
        }
    }

    public acm(ViewGroup viewGroup, Activity activity, int i) {
        this(viewGroup);
        View view = new View(activity);
        view.setMinimumHeight(i);
        viewGroup.addView(view);
        if (((AccessibilityManager) activity.getSystemService("accessibility")).isEnabled()) {
            viewGroup.setFocusable(false);
            viewGroup.setClickable(false);
            return;
        }
        viewGroup.setOnClickListener(new aewc(activity));
    }

    /* renamed from: a */
    public final void mo317a(boolean z) {
        int i = z ? this.f219t - 1 : this.f219t + 1;
        this.f219t = i;
        if (i < 0) {
            this.f219t = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z && i == 1) {
            this.f210j |= 16;
        } else if (z && i == 0) {
            this.f210j &= -17;
        }
    }
}
