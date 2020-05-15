package p000;

import android.text.TextUtils;
import android.widget.Filter;

/* renamed from: aepl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aepl extends Filter {

    /* renamed from: a */
    final /* synthetic */ aepm f63594a;

    /* renamed from: b */
    private Runnable f63595b;

    public aepl(aepm aepm) {
        this.f63594a = aepm;
    }

    /* renamed from: a */
    private static final Filter.FilterResults m52342a(aepd aepd) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        filterResults.values = aepd;
        filterResults.count = aepd.f63583c.size();
        return filterResults;
    }

    public final CharSequence convertResultToString(Object obj) {
        if (!(obj instanceof aekw)) {
            return super.convertResultToString(obj);
        }
        return ((aekw) obj).mo34278a(null);
    }

    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        this.f63594a.mo34424a((rke) null);
        this.f63595b = null;
        if (TextUtils.isEmpty(charSequence)) {
            return m52342a(aepd.f63579f);
        }
        if (!this.f63594a.f63598c.mo24805i()) {
            return m52342a(aepd.f63580g);
        }
        this.f63595b = new aepk(this, charSequence);
        return m52342a(new aepd(3, null, this.f63594a.f63597b.f63583c, -1, null));
    }

    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        this.f63594a.mo34421a((aepd) filterResults.values);
        Runnable runnable = this.f63595b;
        if (runnable != null) {
            runnable.run();
            this.f63595b = null;
        }
    }
}
