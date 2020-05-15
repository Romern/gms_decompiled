package p000;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: bftc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bftc extends bfsm implements bfrb, bfsz {

    /* renamed from: m */
    private static final bmxz f115184m = bftb.f115183a;

    /* renamed from: a */
    public final bfpj f115185a;

    /* renamed from: b */
    public boolean f115186b = false;

    /* renamed from: c */
    private final bfta f115187c;

    /* renamed from: d */
    private Collection f115188d = Collections.emptyList();

    /* renamed from: g */
    private Collection f115189g = Collections.emptyList();

    /* renamed from: h */
    private final bfrn f115190h = new bfrn();

    /* renamed from: i */
    private final bfrn f115191i = new bfrn();

    /* renamed from: j */
    private boolean f115192j = false;

    /* renamed from: k */
    private boolean f115193k = false;

    /* renamed from: l */
    private boolean f115194l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bftc(bfrc bfrc, Context context, Looper looper, bfpj bfpj) {
        super(bfrc, new sti(context, looper), spf.m35821a(context), looper);
        bfta bfta = new bfta(context, looper);
        this.f115187c = bfta;
        this.f115185a = bfpj;
    }

    /* renamed from: a */
    public final void mo62058a() {
        if (!this.f115192j) {
            this.f115192j = true;
            this.f115186b = false;
            this.f115187c.f115173e = this;
            if (cesn.m138189d()) {
                this.f115187c.mo62224a();
                this.f115193k = true;
            }
            mo62230b(false);
            super.mo62058a();
        }
    }

    /* renamed from: b */
    public final void mo62061b() {
        if (this.f115192j) {
            this.f115192j = false;
            this.f115187c.mo62226b();
            this.f115193k = false;
            mo62230b(false);
            super.mo62061b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo62062c() {
        this.f115187c.f115172d.mo62223c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Collection mo62063d() {
        return this.f115190h.f115043k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo62064e() {
        return this.f115186b && this.f115194l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final long mo62066g() {
        return this.f115190h.f115038f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final String mo62067h() {
        return "wifi stationary engine";
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [java.util.Collection, bmxz]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* renamed from: a */
    public final void mo62059a(Collection collection, boolean z) {
        boolean z2 = true;
        if (this.f115192j) {
            if (cesn.m138189d() && !this.f115193k) {
                this.f115187c.mo62224a();
                this.f115193k = true;
            } else if (!cesn.m138189d() && this.f115193k) {
                this.f115187c.mo62226b();
                this.f115193k = false;
            }
        }
        this.f115188d = collection;
        this.f115189g = null;
        this.f115190h.mo62182a(bnjd.m109586b((Iterable) collection, bfrn.f115033a));
        this.f115191i.mo62182a(bnjd.m109586b((Iterable) collection, f115184m));
        if (this.f115191i.f115038f <= this.f115190h.f115038f) {
            z2 = false;
        }
        if (z2 != this.f115194l) {
            this.f115194l = z2;
            mo62065f();
        }
        mo62230b(z);
    }

    /* renamed from: b */
    public final void mo62230b(boolean z) {
        Collection collection;
        if (!mo62064e()) {
            collection = this.f115188d;
        } else {
            collection = this.f115189g;
            if (collection == null) {
                this.f115189g = new ArrayList(this.f115188d.size());
                for (LocationRequestInternal locationRequestInternal : this.f115188d) {
                    if (f115184m.mo6527a(locationRequestInternal)) {
                        this.f115189g.add(locationRequestInternal);
                    }
                }
                collection = this.f115189g;
            }
        }
        if (mo62064e() && z) {
            mo62212i();
            z = false;
        }
        this.f114732e.mo62059a(collection, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62060a(List list) {
        bfta bfta = this.f115187c;
        if (!list.isEmpty()) {
            bfta.f115172d.mo62220a(list);
        }
    }
}
