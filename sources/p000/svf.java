package p000;

import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: svf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class svf extends svc implements sue {

    /* renamed from: a */
    public final ArrayList f45214a;

    /* renamed from: b */
    public suf f45215b;

    public svf(CharSequence charSequence) {
        this(charSequence, 0);
    }

    /* renamed from: a */
    public final int mo23821a() {
        return C0126R.C0128layout.common_settings_category;
    }

    /* renamed from: b */
    public final svb mo23822b() {
        return suz.m36396a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo26152c(sui sui) {
        int binarySearch = Collections.binarySearch(this.f45214a, sui, svd.f45212a);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f45214a.add(binarySearch, sui);
        return binarySearch;
    }

    /* renamed from: d */
    public final void mo26153d(sui sui) {
        suf suf;
        int indexOf = this.f45214a.indexOf(sui);
        if (indexOf >= 0) {
            this.f45214a.remove(indexOf);
        }
        if (indexOf >= 0 && (suf = this.f45215b) != null) {
            suf.mo26092c(indexOf);
        }
    }

    /* renamed from: f */
    public final boolean mo26146f() {
        return false;
    }

    /* renamed from: g */
    public final List mo26154g() {
        return Collections.unmodifiableList(this.f45214a);
    }

    public svf(CharSequence charSequence, int i) {
        this.f45211f = charSequence;
        this.f45210e = i;
        this.f45214a = new ArrayList();
    }

    /* renamed from: a */
    public final void mo26149a(sui sui) {
        int c = mo26152c(sui);
        suf suf = this.f45215b;
        if (suf != null) {
            suf.mo26091b(c);
        }
        sui.mo26103a(this);
    }

    /* renamed from: b */
    public final boolean mo26151b(sui sui) {
        return this.f45214a.contains(sui);
    }

    /* renamed from: a */
    public final void mo26150a(sui... suiArr) {
        for (sui sui : suiArr) {
            mo26149a(sui);
        }
    }
}
