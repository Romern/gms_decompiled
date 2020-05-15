package p000;

import android.widget.Filter;

/* renamed from: bkeg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkeg extends Filter {

    /* renamed from: a */
    final /* synthetic */ bkeh f124079a;

    public bkeg(bkeh bkeh) {
        this.f124079a = bkeh;
    }

    /* access modifiers changed from: protected */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        bkeh bkeh = this.f124079a;
        int i = bkeh.f124080b;
        filterResults.count = bkeh.f124081a.size();
        filterResults.values = this.f124079a.f124081a;
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        this.f124079a.notifyDataSetChanged();
    }
}
