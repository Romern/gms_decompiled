package p000;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: aiz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiz extends Filter {

    /* renamed from: a */
    final aiy f630a;

    public aiz(aiy aiy) {
        this.f630a = aiy;
    }

    public final CharSequence convertResultToString(Object obj) {
        return this.f630a.mo433b((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor a = this.f630a.mo429a(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (a != null) {
            filterResults.count = a.getCount();
        } else {
            filterResults.count = 0;
            a = null;
        }
        filterResults.values = a;
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor a = this.f630a.mo801a();
        if (filterResults.values != null && filterResults.values != a) {
            this.f630a.mo431a((Cursor) filterResults.values);
        }
    }
}
